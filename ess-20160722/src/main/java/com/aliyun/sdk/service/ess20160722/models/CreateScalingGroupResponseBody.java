// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20160722.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateScalingGroupResponseBody} extends {@link TeaModel}
 *
 * <p>CreateScalingGroupResponseBody</p>
 */
public class CreateScalingGroupResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ScalingGroupId")
    private String scalingGroupId;

    private CreateScalingGroupResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.scalingGroupId = builder.scalingGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateScalingGroupResponseBody create() {
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * ScalingGroupId.
         */
        public Builder scalingGroupId(String scalingGroupId) {
            this.scalingGroupId = scalingGroupId;
            return this;
        }

        public CreateScalingGroupResponseBody build() {
            return new CreateScalingGroupResponseBody(this);
        } 

    } 

}
