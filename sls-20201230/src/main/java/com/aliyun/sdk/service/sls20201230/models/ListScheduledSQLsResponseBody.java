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
 * {@link ListScheduledSQLsResponseBody} extends {@link TeaModel}
 *
 * <p>ListScheduledSQLsResponseBody</p>
 */
public class ListScheduledSQLsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("results")
    private java.util.List<ScheduledSQL> results;

    @com.aliyun.core.annotation.NameInMap("total")
    private Integer total;

    private ListScheduledSQLsResponseBody(Builder builder) {
        this.count = builder.count;
        this.results = builder.results;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListScheduledSQLsResponseBody create() {
        return builder().build();
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
    public java.util.List<ScheduledSQL> getResults() {
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
        private java.util.List<ScheduledSQL> results; 
        private Integer total; 

        /**
         * count.
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * results.
         */
        public Builder results(java.util.List<ScheduledSQL> results) {
            this.results = results;
            return this;
        }

        /**
         * total.
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public ListScheduledSQLsResponseBody build() {
            return new ListScheduledSQLsResponseBody(this);
        } 

    } 

}
