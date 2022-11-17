// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeTenantMetricsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTenantMetricsResponseBody</p>
 */
public class DescribeTenantMetricsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TenantMetrics")
    private String tenantMetrics;

    @NameInMap("TotalCount")
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

        /**
         * 请求ID。
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 租户指标信息。
         */
        public Builder tenantMetrics(String tenantMetrics) {
            this.tenantMetrics = tenantMetrics;
            return this;
        }

        /**
         * 总数量
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
