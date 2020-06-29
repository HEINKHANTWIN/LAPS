package com.team2.laps.payload;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import com.team2.laps.model.RoleName;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StaffModification {
    @NotBlank
    @Size(min = 4, max = 40)
    private String name;
    
    private int annualLeaveEntitled;
    
    private String supervisorName;
    
    private RoleName role;
}