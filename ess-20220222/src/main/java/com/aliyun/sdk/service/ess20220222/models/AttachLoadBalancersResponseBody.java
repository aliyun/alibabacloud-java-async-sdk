// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AttachLoadBalancersResponseBody} extends {@link TeaModel}
 *
 * <p>AttachLoadBalancersResponseBody</p>
 */
public class AttachLoadBalancersResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ScalingActivityId")
    private String scalingActivityId;

    private AttachLoadBalancersResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.scalingActivityId = builder.scalingActivityId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AttachLoadBalancersResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return scalingActivityId
     */
    public String getScalingActivityId() {
        return this.scalingActivityId;
    }

    public static final class Builder {
        private String requestId; 
        private String scalingActivityId; 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ScalingActivityId.
         */
        public Builder scalingActivityId(String scalingActivityId) {
            this.scalingActivityId = scalingActivityId;
            return this;
        }

        public AttachLoadBalancersResponseBody build() {
            return new AttachLoadBalancersResponseBody(this);
        } 

    } 

}
