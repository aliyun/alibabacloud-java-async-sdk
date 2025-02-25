// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

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
 * {@link LoadBalancerLeaveSecurityGroupResponseBody} extends {@link TeaModel}
 *
 * <p>LoadBalancerLeaveSecurityGroupResponseBody</p>
 */
public class LoadBalancerLeaveSecurityGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("JobId")
    private String jobId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private LoadBalancerLeaveSecurityGroupResponseBody(Builder builder) {
        this.jobId = builder.jobId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LoadBalancerLeaveSecurityGroupResponseBody create() {
        return builder().build();
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

        /**
         * <p>The ID of the asynchronous task.</p>
         * 
         * <strong>example:</strong>
         * <p>51c5b627-3500-487c-b17d-5cc583f0****</p>
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>EC0C96E4-7CCB-599C-9329-3A5DB6FF****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public LoadBalancerLeaveSecurityGroupResponseBody build() {
            return new LoadBalancerLeaveSecurityGroupResponseBody(this);
        } 

    } 

}
