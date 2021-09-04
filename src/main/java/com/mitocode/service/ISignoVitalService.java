package com.mitocode.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.mitocode.model.Signos;

public interface ISignoVitalService extends ICRUD<Signos, Integer> {
	Page<Signos> listarPageable(Pageable page);

}
