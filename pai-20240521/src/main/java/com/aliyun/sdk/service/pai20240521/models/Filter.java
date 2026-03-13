// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai20240521.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link Filter} extends {@link TeaModel}
 *
 * <p>Filter</p>
 */
public class Filter extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("FilterBy")
    private String filterBy;

    @com.aliyun.core.annotation.NameInMap("FilterCondition")
    private String filterCondition;

    @com.aliyun.core.annotation.NameInMap("FilterOperation")
    private String filterOperation;

    private Filter(Builder builder) {
        this.filterBy = builder.filterBy;
        this.filterCondition = builder.filterCondition;
        this.filterOperation = builder.filterOperation;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Filter create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return filterBy
     */
    public String getFilterBy() {
        return this.filterBy;
    }

    /**
     * @return filterCondition
     */
    public String getFilterCondition() {
        return this.filterCondition;
    }

    /**
     * @return filterOperation
     */
    public String getFilterOperation() {
        return this.filterOperation;
    }

    public static final class Builder {
        private String filterBy; 
        private String filterCondition; 
        private String filterOperation; 

        private Builder() {
        } 

        private Builder(Filter model) {
            this.filterBy = model.filterBy;
            this.filterCondition = model.filterCondition;
            this.filterOperation = model.filterOperation;
        } 

        /**
         * FilterBy.
         */
        public Builder filterBy(String filterBy) {
            this.filterBy = filterBy;
            return this;
        }

        /**
         * FilterCondition.
         */
        public Builder filterCondition(String filterCondition) {
            this.filterCondition = filterCondition;
            return this;
        }

        /**
         * FilterOperation.
         */
        public Builder filterOperation(String filterOperation) {
            this.filterOperation = filterOperation;
            return this;
        }

        public Filter build() {
            return new Filter(this);
        } 

    } 

}
