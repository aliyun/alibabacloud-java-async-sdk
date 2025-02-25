// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SortCriterion} extends {@link TeaModel}
 *
 * <p>SortCriterion</p>
 */
public class SortCriterion extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FieldName")
    private String fieldName;

    @com.aliyun.core.annotation.NameInMap("Sort")
    private String sort;

    private SortCriterion(Builder builder) {
        this.fieldName = builder.fieldName;
        this.sort = builder.sort;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SortCriterion create() {
        return builder().build();
    }

    /**
     * @return fieldName
     */
    public String getFieldName() {
        return this.fieldName;
    }

    /**
     * @return sort
     */
    public String getSort() {
        return this.sort;
    }

    public static final class Builder {
        private String fieldName; 
        private String sort; 

        /**
         * FieldName.
         */
        public Builder fieldName(String fieldName) {
            this.fieldName = fieldName;
            return this;
        }

        /**
         * Sort.
         */
        public Builder sort(String sort) {
            this.sort = sort;
            return this;
        }

        public SortCriterion build() {
            return new SortCriterion(this);
        } 

    } 

}
