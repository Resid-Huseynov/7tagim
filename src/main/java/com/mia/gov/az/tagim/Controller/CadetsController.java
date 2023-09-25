package com.mia.gov.az.tagim.Controller;

import com.mia.gov.az.tagim.Dto.CadetsDto;
import com.mia.gov.az.tagim.Exception.CadetNotFoundError;
import com.mia.gov.az.tagim.Service.CadetsService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/v1")
public class CadetsController {

    private final CadetsService cadetsService;

    @GetMapping("/list")
    @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
    public List<CadetsDto> findAll() {
        return cadetsService.findAll();
    }

    @GetMapping("/list/{theId}")
    @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
    public CadetsDto findById(@PathVariable int theId)  {

        CadetsDto temp = cadetsService.findById(theId);

        if (temp == null) {
            throw new CadetNotFoundError(theId);
        }
        return temp;
    }

    @PostMapping("/add")
    @PreAuthorize("hasRole('USER') or hasRole('ADMIN')")
    public CadetsDto save(@RequestBody CadetsDto cadetsDto) {

        return cadetsService.save(cadetsDto);
    }

    @PutMapping("/update/{theId}")
    @PreAuthorize("hasRole('ADMIN')")
    public CadetsDto update(@PathVariable int theId, @RequestBody CadetsDto cadetsDto) {

        return cadetsService.update(theId, cadetsDto);
    }

    @DeleteMapping("/delete/{theId}")
    @PreAuthorize("hasRole('ADMIN')")
    public String delete(@PathVariable int theId) {

        cadetsService.deleteById(theId);

        return "Deleted Cadet : " + theId;
    }
}
