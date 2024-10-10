// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ApplyScalingGroupResponseBody} extends {@link TeaModel}
 *
 * <p>ApplyScalingGroupResponseBody</p>
 */
public class ApplyScalingGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ScalingGroupId")
    private String scalingGroupId;

    private ApplyScalingGroupResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.scalingGroupId = builder.scalingGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ApplyScalingGroupResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return scalingGroupId
     */
    public String getScalingGroupId() {
        return this.scalingGroupId;
    }

    public static final class Builder {
        private String requestId; 
        private String scalingGroupId; 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CC107349-57B7-4405-B1BF-9BF5AF7F****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the enabled scaling group.</p>
         * 
         * <strong>example:</strong>
         * <p>asg-bp1igpak5ft1flyp****</p>
         */
        public Builder scalingGroupId(String scalingGroupId) {
            this.scalingGroupId = scalingGroupId;
            return this;
        }

        public ApplyScalingGroupResponseBody build() {
            return new ApplyScalingGroupResponseBody(this);
        } 

    } 

}
