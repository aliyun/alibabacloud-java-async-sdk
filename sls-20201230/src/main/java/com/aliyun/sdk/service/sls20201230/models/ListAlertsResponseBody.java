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
 * {@link ListAlertsResponseBody} extends {@link TeaModel}
 *
 * <p>ListAlertsResponseBody</p>
 */
public class ListAlertsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("results")
    private java.util.List<Alert> results;

    @com.aliyun.core.annotation.NameInMap("total")
    private Integer total;

    private ListAlertsResponseBody(Builder builder) {
        this.count = builder.count;
        this.results = builder.results;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAlertsResponseBody create() {
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
    public java.util.List<Alert> getResults() {
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
        private java.util.List<Alert> results; 
        private Integer total; 

        /**
         * <p>The number of alert rules that are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * <p>The alert rules.</p>
         */
        public Builder results(java.util.List<Alert> results) {
            this.results = results;
            return this;
        }

        /**
         * <p>The total number of alert rules in the project.</p>
         * 
         * <strong>example:</strong>
         * <p>80</p>
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public ListAlertsResponseBody build() {
            return new ListAlertsResponseBody(this);
        } 

    } 

}
