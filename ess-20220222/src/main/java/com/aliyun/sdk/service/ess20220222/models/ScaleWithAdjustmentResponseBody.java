// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ScaleWithAdjustmentResponseBody} extends {@link TeaModel}
 *
 * <p>ScaleWithAdjustmentResponseBody</p>
 */
public class ScaleWithAdjustmentResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ActivityType")
    private String activityType;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("ScalingActivityId")
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
         * <p>The type of the scaling activity.</p>
         * <p>If <code>ActivityType</code> is set to <code>CapacityChange</code>, only the expected number of instances is changed during the scaling activity specified by ScalingActivityId and no scale-out is triggered.</p>
         * <p>This parameter is applicable to only scaling groups that have an expected number of instances.</p>
         * 
         * <strong>example:</strong>
         * <p>CapacityChange</p>
         */
        public Builder activityType(String activityType) {
            this.activityType = activityType;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the scaling activity.</p>
         * 
         * <strong>example:</strong>
         * <p>asa-bp175o6f6ego3r2j****</p>
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
