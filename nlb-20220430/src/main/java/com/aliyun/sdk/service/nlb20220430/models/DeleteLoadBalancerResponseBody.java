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
 * {@link DeleteLoadBalancerResponseBody} extends {@link TeaModel}
 *
 * <p>DeleteLoadBalancerResponseBody</p>
 */
public class DeleteLoadBalancerResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("JobId")
    private String jobId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DeleteLoadBalancerResponseBody(Builder builder) {
        this.jobId = builder.jobId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteLoadBalancerResponseBody create() {
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

        private Builder(DeleteLoadBalancerResponseBody model) {
            this.jobId = model.jobId;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The ID of the asynchronous task.</p>
         * 
         * <strong>example:</strong>
         * <p>72dcd26b-f12d-4c27-b3af-18f6aed5****</p>
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>365F4154-92F6-4AE4-92F8-7FF34B540710</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DeleteLoadBalancerResponseBody build() {
            return new DeleteLoadBalancerResponseBody(this);
        } 

    } 

}
