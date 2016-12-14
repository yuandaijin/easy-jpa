package com.sbiger.qbe.specification.is;

import com.sbiger.qbe.ExampleCriteria;
import com.sbiger.qbe.specification.AbstractSpecification;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.From;
import javax.persistence.criteria.Predicate;

/**
 * Created by sbiger on 2016-12-14.
 */
public class IsNotEmptySpecification<T> extends AbstractSpecification<T> {
    private final String property;

    private final ExampleCriteria.BooleanOperator type;

    public IsNotEmptySpecification(ExampleCriteria.BooleanOperator type, String property) {
        this.property = property;
        this.type = type;
    }

    @Override
    public Predicate toPredicate(From root, CriteriaQuery<?> query, CriteriaBuilder cb) {
        return cb.isNotEmpty(root.get(property));
    }
}
