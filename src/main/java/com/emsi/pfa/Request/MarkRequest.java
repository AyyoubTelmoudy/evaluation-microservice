package com.emsi.pfa.Request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MarkRequest {
    private int mark;
    private String driverPublicId;
}
