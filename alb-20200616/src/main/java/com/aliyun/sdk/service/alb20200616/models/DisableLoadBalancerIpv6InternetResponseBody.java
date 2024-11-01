// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DisableLoadBalancerIpv6InternetResponseBody} extends {@link TeaModel}
 *
 * <p>DisableLoadBalancerIpv6InternetResponseBody</p>
 */
public class DisableLoadBalancerIpv6InternetResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("JobId")
    private String jobId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DisableLoadBalancerIpv6InternetResponseBody(Builder builder) {
        this.jobId = builder.jobId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisableLoadBalancerIpv6InternetResponseBody create() {
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
         * <p>The asynchronous task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>d12871a6-ebb2-41f3-8d74-d9f452bb****</p>
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>7D866E37-1123-5160-AFF1-BDAF5EB86A8A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DisableLoadBalancerIpv6InternetResponseBody build() {
            return new DisableLoadBalancerIpv6InternetResponseBody(this);
        } 

    } 

}
