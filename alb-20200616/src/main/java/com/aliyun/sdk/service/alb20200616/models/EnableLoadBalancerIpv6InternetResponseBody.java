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
 * {@link EnableLoadBalancerIpv6InternetResponseBody} extends {@link TeaModel}
 *
 * <p>EnableLoadBalancerIpv6InternetResponseBody</p>
 */
public class EnableLoadBalancerIpv6InternetResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("JobId")
    private String jobId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private EnableLoadBalancerIpv6InternetResponseBody(Builder builder) {
        this.jobId = builder.jobId;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableLoadBalancerIpv6InternetResponseBody create() {
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
         * <p>4a6e3ad4-ef08-4ab1-b332-fa621cfe****</p>
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>BB920797-D70E-567F-8098-55A861DD7912</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public EnableLoadBalancerIpv6InternetResponseBody build() {
            return new EnableLoadBalancerIpv6InternetResponseBody(this);
        } 

    } 

}
