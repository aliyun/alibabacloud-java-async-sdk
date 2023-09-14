// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AttachCommonBandwidthPackageToLoadBalancerResponseBody} extends {@link TeaModel}
 *
 * <p>AttachCommonBandwidthPackageToLoadBalancerResponseBody</p>
 */
public class AttachCommonBandwidthPackageToLoadBalancerResponseBody extends TeaModel {
    @NameInMap("JobId")
    private String jobId;

    @NameInMap("RequestId")
    private String requestId;

    private AttachCommonBandwidthPackageToLoadBalancerResponseBody(Builder builder) {
        this.jobId = builder.jobId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AttachCommonBandwidthPackageToLoadBalancerResponseBody create() {
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
         * The asynchronous task ID.
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public AttachCommonBandwidthPackageToLoadBalancerResponseBody build() {
            return new AttachCommonBandwidthPackageToLoadBalancerResponseBody(this);
        } 

    } 

}
