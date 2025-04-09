// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nlb20220430.models;

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
 * {@link UpdateLoadBalancerAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateLoadBalancerAttributeResponseBody</p>
 */
public class UpdateLoadBalancerAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("JobId")
    private String jobId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpdateLoadBalancerAttributeResponseBody(Builder builder) {
        this.jobId = builder.jobId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateLoadBalancerAttributeResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String jobId; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(UpdateLoadBalancerAttributeResponseBody model) {
            this.jobId = model.jobId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the asynchronous task.</p>
         * 
         * <strong>example:</strong>
         * <p>aab74cfa-3bc4-48fc-80fc-0101da5a****</p>
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7294679F-08DE-16D4-8E5D-1625685DC10B</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateLoadBalancerAttributeResponseBody build() {
            return new UpdateLoadBalancerAttributeResponseBody(this);
        } 

    } 

}
