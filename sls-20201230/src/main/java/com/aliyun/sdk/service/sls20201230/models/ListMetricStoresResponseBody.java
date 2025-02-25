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
 * {@link ListMetricStoresResponseBody} extends {@link TeaModel}
 *
 * <p>ListMetricStoresResponseBody</p>
 */
public class ListMetricStoresResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("count")
    private Integer count;

    @com.aliyun.core.annotation.NameInMap("metricstores")
    private java.util.List<String> metricstores;

    @com.aliyun.core.annotation.NameInMap("total")
    private Integer total;

    private ListMetricStoresResponseBody(Builder builder) {
        this.count = builder.count;
        this.metricstores = builder.metricstores;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListMetricStoresResponseBody create() {
        return builder().build();
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return metricstores
     */
    public java.util.List<String> getMetricstores() {
        return this.metricstores;
    }

    /**
     * @return total
     */
    public Integer getTotal() {
        return this.total;
    }

    public static final class Builder {
        private Integer count; 
        private java.util.List<String> metricstores; 
        private Integer total; 

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder count(Integer count) {
            this.count = count;
            return this;
        }

        /**
         * <p>The names of the Metricstores.</p>
         */
        public Builder metricstores(java.util.List<String> metricstores) {
            this.metricstores = metricstores;
            return this;
        }

        /**
         * <p>The total number of queried Metricstores.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder total(Integer total) {
            this.total = total;
            return this;
        }

        public ListMetricStoresResponseBody build() {
            return new ListMetricStoresResponseBody(this);
        } 

    } 

}
