package org.example.pojo;

import lombok.Builder;
import lombok.Data;

import java.util.ArrayList;

@Builder
@Data
public class PositionList {
    public ArrayList<Position> positions;
}
