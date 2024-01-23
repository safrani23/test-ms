package org.example.testdata;

import com.fasterxml.jackson.databind.JsonNode;

import org.example.pojo.Position;
import org.example.pojo.PositionList;
import org.example.utils.Utils;

import java.util.ArrayList;
import java.util.HashMap;

public class DefaultData {

    private static ArrayList<Position> positions = new ArrayList<>();

    private DefaultData(ArrayList<Position> positions) {
        DefaultData.positions = positions;
    }

    private static Position position1() {
        return Position.builder()
                .symbol("AAPL")
                .quantity(100)
                .price(150.25)
                .build();
    }

    private static Position position2() {
        return Position.builder()
                .symbol("GOOG")
                .quantity(50)
                .price(2800.75)
                .build();
    }

    private static Position position3() {
        return Position.builder()
                .symbol("MSFT")
                .quantity(75)
                .price(300.50)
                .build();
    }

    private static PositionList positionsList1() {
        positions.add(position1());
        positions.add(position3());
        return PositionList.builder()
                .positions(positions)
                .build();
    }

    private static PositionList positionsList2() {
        positions.add(position2());
        return PositionList.builder()
                .positions(positions)
                .build();
    }

    static HashMap<String, JsonNode> clientPositions = new HashMap<>();

    public static HashMap<String, JsonNode> clientsPositions() {
        clientPositions.put("user1", Utils.toJsonNode(positionsList1()));
        clientPositions.put("user2", Utils.toJsonNode(positionsList2()));
        return clientPositions;
    }

    public static void main(String[] args) {
        System.out.println(clientsPositions().get("user1"));
    }
}
