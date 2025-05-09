// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

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
 * {@link DescribeTenantMetricsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTenantMetricsResponseBody</p>
 */
public class DescribeTenantMetricsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TenantMetrics")
    private String tenantMetrics;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeTenantMetricsResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.tenantMetrics = builder.tenantMetrics;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTenantMetricsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return tenantMetrics
     */
    public String getTenantMetrics() {
        return this.tenantMetrics;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String requestId; 
        private String tenantMetrics; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DescribeTenantMetricsResponseBody model) {
            this.requestId = model.requestId;
            this.tenantMetrics = model.tenantMetrics;
            this.totalCount = model.totalCount;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TenantMetrics.
         */
        public Builder tenantMetrics(String tenantMetrics) {
            this.tenantMetrics = tenantMetrics;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeTenantMetricsResponseBody build() {
            return new DescribeTenantMetricsResponseBody(this);
        } 

    } 

}
