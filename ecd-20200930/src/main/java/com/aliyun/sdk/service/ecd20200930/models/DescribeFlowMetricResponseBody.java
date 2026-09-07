// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

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
 * {@link DescribeFlowMetricResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeFlowMetricResponseBody</p>
 */
public class DescribeFlowMetricResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private String data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeFlowMetricResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeFlowMetricResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public String getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeFlowMetricResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The metric data.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;instanceId\&quot;: \&quot;np-4wrye3ishxi47****\&quot;, \&quot;requestId\&quot;: \&quot;4F0CD5B6-70D6-5115-A2F7-7EAC3981****\&quot;, \&quot;dataPoints\&quot;: [{\&quot;timeStamp\&quot;: 1636510320000, \&quot;Average\&quot;: 293752.0}]}</p>
         */
        public Builder data(String data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>6857EDCB-631F-5405-BE95-45CBB4C3****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeFlowMetricResponseBody build() {
            return new DescribeFlowMetricResponseBody(this);
        } 

    } 

}
