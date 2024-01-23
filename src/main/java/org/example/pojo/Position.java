package org.example.pojo;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class Position{
    public String symbol;
    public int quantity;
    public double price;
}
