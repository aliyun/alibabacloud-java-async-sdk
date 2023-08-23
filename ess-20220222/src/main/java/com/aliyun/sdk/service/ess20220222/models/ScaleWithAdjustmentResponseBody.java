// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ScaleWithAdjustmentResponseBody} extends {@link TeaModel}
 *
 * <p>ScaleWithAdjustmentResponseBody</p>
 */
public class ScaleWithAdjustmentResponseBody extends TeaModel {
    @NameInMap("ActivityType")
    private String activityType;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("ScalingActivityId")
    private String scalingActivityId;

    private ScaleWithAdjustmentResponseBody(Builder builder) {
        this.activityType = builder.activityType;
        this.requestId = builder.requestId;
        this.scalingActivityId = builder.scalingActivityId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ScaleWithAdjustmentResponseBody create() {
        return builder().build();
    }

    /**
     * @return activityType
     */
    public String getActivityType() {
        return this.activityType;
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
        private String activityType; 
        private String requestId; 
        private String scalingActivityId; 

        /**
         * ActivityType.
         */
        public Builder activityType(String activityType) {
            this.activityType = activityType;
            return this;
        }

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

        public ScaleWithAdjustmentResponseBody build() {
            return new ScaleWithAdjustmentResponseBody(this);
        } 

    } 

}
