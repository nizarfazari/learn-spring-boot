package com.domain.dto;

import java.util.ArrayList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

/**
 * ResponseData
 */
@Setter
@Getter
@AllArgsConstructor
public class ResponseData<T> {
 private boolean status;
 private List<String> messages = new ArrayList<>(); 
 private T payload;
 
}