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
         * NodeMetrics.
         */
        public Builder nodeMetrics(String nodeMetrics) {
            this.nodeMetrics = nodeMetrics;
            return this;
        }

        /**
         * You can call this operation to query the detailed metrics information of an OceanBase Database node.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ```
         * <p>
         * http(s)://[Endpoint]/?Action=DescribeNodeMetrics
         * &InstanceId=ob317v4uif****
         * &PageSize=10
         * &PageNumber=1
         * &TenantId=ob2mr3oae0****
         * &StartTime=2021-06-13 15:40:43
         * &EndTime=2021-09-13 15:40:43
         * &Metrics=tps
         * &NodeName=i-bp16niirq4zdmgvm****
         * &NodeIdList=["i-bp19y05uq6xpacyqnlrc","i-bp1blcr3htr3g3u2vqvu","i-bp1392ikhayhr3hi4fli"]
         * &Common request parameters
         * ```
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
