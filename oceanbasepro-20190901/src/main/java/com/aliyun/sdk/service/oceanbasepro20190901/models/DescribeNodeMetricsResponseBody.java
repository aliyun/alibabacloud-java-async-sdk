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
 * {@link DescribeNodeMetricsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeNodeMetricsResponseBody</p>
 */
public class DescribeNodeMetricsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("NodeMetrics")
    private String nodeMetrics;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
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
         * <p>You can call this operation to query the detailed metrics information of an OceanBase Database node.</p>
         * 
         * <strong>example:</strong>
         * <p>EE205C00-30E4-XXXX-XXXX-87E3A8A2AA0C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <pre><code>http(s)://[Endpoint]/?Action=DescribeNodeMetrics
         * &amp;InstanceId=ob317v4uif****
         * &amp;PageSize=10
         * &amp;PageNumber=1
         * &amp;TenantId=ob2mr3oae0****
         * &amp;StartTime=2021-06-13 15:40:43
         * &amp;EndTime=2021-09-13 15:40:43
         * &amp;Metrics=tps
         * &amp;NodeName=i-bp16niirq4zdmgvm****
         * &amp;NodeIdList=[&quot;i-bp19y05uq6xpacyqnlrc&quot;,&quot;i-bp1blcr3htr3g3u2vqvu&quot;,&quot;i-bp1392ikhayhr3hi4fli&quot;]
         * &amp;Common request parameters
         * </code></pre>
         * 
         * <strong>example:</strong>
         * <p>9</p>
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
