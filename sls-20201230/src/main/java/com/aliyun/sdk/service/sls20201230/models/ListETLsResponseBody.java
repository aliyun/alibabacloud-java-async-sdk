// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.sdk.gateway.sls.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * 
 * {@link ListETLsResponseBody} extends {@link TeaModel}
 *
 * <p>ListETLsResponseBody</p>
 */
public class ListETLsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("results")
    private java.util.List<ETL> results;

    @com.aliyun.core.annotation.NameInMap("total")
    private Integer total;

    private ListETLsResponseBody(Builder builder) {
        this.count = builder.count;
        this.results = builder.results;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListETLsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return results
     */
    public java.util.List<ETL> getResults() {
        return this.results;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private Integer count; 
        private java.util.List<ETL> results; 
        private Integer total; 

        private Builder() {
        } 

        private Builder(ListETLsResponseBody model) {
            this.count = model.count;
            this.results = model.results;
            this.total = model.total;
        } 

        /**
         * <p>The number of data transformation jobs that are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * results.
         */
        public Builder results(java.util.List<ETL> results) {
            this.results = results;
            return this;
        }

        /**
         * <p>The total number of data transformation jobs in the project.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public ListETLsResponseBody build() {
            return new ListETLsResponseBody(this);
        } 

    } 

}
