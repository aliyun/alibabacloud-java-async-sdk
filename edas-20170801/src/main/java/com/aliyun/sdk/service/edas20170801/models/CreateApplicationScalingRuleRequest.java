// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateApplicationScalingRuleRequest} extends {@link RequestModel}
 *
 * <p>CreateApplicationScalingRuleRequest</p>
 */
public class CreateApplicationScalingRuleRequest extends Request {
    @Query
    @NameInMap("AppId")
    private String appId;

    @Query
    @NameInMap("ScalingBehaviour")
    private String scalingBehaviour;

    @Query
    @NameInMap("ScalingRuleEnable")
    private Boolean scalingRuleEnable;

    @Query
    @NameInMap("ScalingRuleMetric")
    private String scalingRuleMetric;

    @Query
    @NameInMap("ScalingRuleName")
    private String scalingRuleName;

    @Query
    @NameInMap("ScalingRuleTimer")
    private String scalingRuleTimer;

    @Query
    @NameInMap("ScalingRuleTrigger")
    private String scalingRuleTrigger;

    @Query
    @NameInMap("ScalingRuleType")
    private String scalingRuleType;

    private CreateApplicationScalingRuleRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.scalingBehaviour = builder.scalingBehaviour;
        this.scalingRuleEnable = builder.scalingRuleEnable;
        this.scalingRuleMetric = builder.scalingRuleMetric;
        this.scalingRuleName = builder.scalingRuleName;
        this.scalingRuleTimer = builder.scalingRuleTimer;
        this.scalingRuleTrigger = builder.scalingRuleTrigger;
        this.scalingRuleType = builder.scalingRuleType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateApplicationScalingRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return scalingBehaviour
     */
    public String getScalingBehaviour() {
        return this.scalingBehaviour;
    }

    /**
     * @return scalingRuleEnable
     */
    public Boolean getScalingRuleEnable() {
        return this.scalingRuleEnable;
    }

    /**
     * @return scalingRuleMetric
     */
    public String getScalingRuleMetric() {
        return this.scalingRuleMetric;
    }

    /**
     * @return scalingRuleName
     */
    public String getScalingRuleName() {
        return this.scalingRuleName;
    }

    /**
     * @return scalingRuleTimer
     */
    public String getScalingRuleTimer() {
        return this.scalingRuleTimer;
    }

    /**
     * @return scalingRuleTrigger
     */
    public String getScalingRuleTrigger() {
        return this.scalingRuleTrigger;
    }

    /**
     * @return scalingRuleType
     */
    public String getScalingRuleType() {
        return this.scalingRuleType;
    }

    public static final class Builder extends Request.Builder<CreateApplicationScalingRuleRequest, Builder> {
        private String appId; 
        private String scalingBehaviour; 
        private Boolean scalingRuleEnable; 
        private String scalingRuleMetric; 
        private String scalingRuleName; 
        private String scalingRuleTimer; 
        private String scalingRuleTrigger; 
        private String scalingRuleType; 

        private Builder() {
            super();
        } 

        private Builder(CreateApplicationScalingRuleRequest request) {
            super(request);
            this.appId = request.appId;
            this.scalingBehaviour = request.scalingBehaviour;
            this.scalingRuleEnable = request.scalingRuleEnable;
            this.scalingRuleMetric = request.scalingRuleMetric;
            this.scalingRuleName = request.scalingRuleName;
            this.scalingRuleTimer = request.scalingRuleTimer;
            this.scalingRuleTrigger = request.scalingRuleTrigger;
            this.scalingRuleType = request.scalingRuleType;
        } 

        /**
         * The ID of the application. You can call the ListApplication operation to query the application ID. For more information, see [ListApplicationlink](~~149390~~).
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * Configure custom elastic behavior, refer to the example for specific data structure.
         */
        public Builder scalingBehaviour(String scalingBehaviour) {
            this.putQueryParameter("ScalingBehaviour", scalingBehaviour);
            this.scalingBehaviour = scalingBehaviour;
            return this;
        }

        /**
         * Specifies whether to enable the auto scaling policy. Valid values:
         * <p>
         * 
         * *   **true**: enables the auto scaling policy.
         * *   **false**: disables the auto scaling policy.
         */
        public Builder scalingRuleEnable(Boolean scalingRuleEnable) {
            this.putQueryParameter("ScalingRuleEnable", scalingRuleEnable);
            this.scalingRuleEnable = scalingRuleEnable;
            return this;
        }

        /**
         * This parameter is deprecated.
         */
        public Builder scalingRuleMetric(String scalingRuleMetric) {
            this.putQueryParameter("ScalingRuleMetric", scalingRuleMetric);
            this.scalingRuleMetric = scalingRuleMetric;
            return this;
        }

        /**
         * The name of the auto scaling policy. The name must start with a lowercase letter, and can contain lowercase letters, digits, and hyphens (-). The name must be 1 to 32 characters in length.
         */
        public Builder scalingRuleName(String scalingRuleName) {
            this.putQueryParameter("ScalingRuleName", scalingRuleName);
            this.scalingRuleName = scalingRuleName;
            return this;
        }

        /**
         * This parameter is deprecated.
         */
        public Builder scalingRuleTimer(String scalingRuleTimer) {
            this.putQueryParameter("ScalingRuleTimer", scalingRuleTimer);
            this.scalingRuleTimer = scalingRuleTimer;
            return this;
        }

        /**
         * The trigger policy for the auto scaling policy. Set the value in the JSON format by using the ScalingRuleTriggerDTO class. For more information, see Additional information about request parameters.
         */
        public Builder scalingRuleTrigger(String scalingRuleTrigger) {
            this.putQueryParameter("ScalingRuleTrigger", scalingRuleTrigger);
            this.scalingRuleTrigger = scalingRuleTrigger;
            return this;
        }

        /**
         * The type of the auto scaling policy. Set the value to **trigger**.
         */
        public Builder scalingRuleType(String scalingRuleType) {
            this.putQueryParameter("ScalingRuleType", scalingRuleType);
            this.scalingRuleType = scalingRuleType;
            return this;
        }

        @Override
        public CreateApplicationScalingRuleRequest build() {
            return new CreateApplicationScalingRuleRequest(this);
        } 

    } 

}
