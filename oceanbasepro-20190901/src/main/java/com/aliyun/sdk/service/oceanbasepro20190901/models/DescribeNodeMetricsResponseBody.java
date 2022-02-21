// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeNodeMetricsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNodeMetricsResponseBody</p>
 */
public class DescribeNodeMetricsResponseBody extends TeaModel {
    @NameInMap("NodeMetrics")
    private String nodeMetrics;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeNodeMetricsResponseBody(Builder builder) {
        this.nodeMetrics = builder.nodeMetrics;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeNodeMetricsResponseBody create() {
        return builder().build();
    }

    /**
     * @return nodeMetrics
     */
    public String getNodeMetrics() {
        return this.nodeMetrics;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String nodeMetrics; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * 节点指标信息
         */
        public Builder nodeMetrics(String nodeMetrics) {
            this.nodeMetrics = nodeMetrics;
            return this;
        }

        /**
         * 请求ID。
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 总数量
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeNodeMetricsResponseBody build() {
            return new DescribeNodeMetricsResponseBody(this);
        } 

    } 

}
