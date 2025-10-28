// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

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
 * {@link UpdateApplicationScalingRuleRequest} extends {@link RequestModel}
 *
 * <p>UpdateApplicationScalingRuleRequest</p>
 */
public class UpdateApplicationScalingRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScalingBehaviour")
    private String scalingBehaviour;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScalingRuleEnable")
    private Boolean scalingRuleEnable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScalingRuleMetric")
    private String scalingRuleMetric;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScalingRuleName")
    private String scalingRuleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScalingRuleTimer")
    private String scalingRuleTimer;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScalingRuleTrigger")
    private String scalingRuleTrigger;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScalingRuleType")
    private String scalingRuleType;

    private UpdateApplicationScalingRuleRequest(Builder builder) {
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

    public static UpdateApplicationScalingRuleRequest create() {
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

    public static final class Builder extends Request.Builder<UpdateApplicationScalingRuleRequest, Builder> {
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

        private Builder(UpdateApplicationScalingRuleRequest request) {
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
         * <p>The ID of the application. You can call the ListApplication operation to query the application ID. For more information, see <a href="https://help.aliyun.com/document_detail/149390.html">ListApplication</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>78194c76-3dca-418e-a263-cccd1ab4****</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>The behavior of the auto scaling. See the example for the data structure.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;scaleUp&quot;:{&quot;stabilizationWindowSeconds&quot;:&quot;0&quot;,&quot;selectPolicy&quot;:&quot;Max&quot;,&quot;policies&quot;:[{&quot;type&quot;:&quot;Pods&quot;,&quot;value&quot;:5,&quot;periodSeconds&quot;:15}]},&quot;scaleDown&quot;:{&quot;stabilizationWindowSeconds&quot;:&quot;300&quot;,&quot;selectPolicy&quot;:&quot;Max&quot;,&quot;policies&quot;:[{&quot;type&quot;:&quot;Percent&quot;,&quot;value&quot;:200,&quot;periodSeconds&quot;:15}]}}</p>
         */
        public Builder scalingBehaviour(String scalingBehaviour) {
            this.putQueryParameter("ScalingBehaviour", scalingBehaviour);
            this.scalingBehaviour = scalingBehaviour;
            return this;
        }

        /**
         * <p>Specifies whether to enable the auto scaling policy. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: enables the auto scaling policy.</li>
         * <li><strong>false</strong>: disables the auto scaling policy.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder scalingRuleEnable(Boolean scalingRuleEnable) {
            this.putQueryParameter("ScalingRuleEnable", scalingRuleEnable);
            this.scalingRuleEnable = scalingRuleEnable;
            return this;
        }

        /**
         * <p>This parameter is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder scalingRuleMetric(String scalingRuleMetric) {
            this.putQueryParameter("ScalingRuleMetric", scalingRuleMetric);
            this.scalingRuleMetric = scalingRuleMetric;
            return this;
        }

        /**
         * <p>The name of the auto scaling policy.</p>
         * 
         * <strong>example:</strong>
         * <p>cpu-trigger</p>
         */
        public Builder scalingRuleName(String scalingRuleName) {
            this.putQueryParameter("ScalingRuleName", scalingRuleName);
            this.scalingRuleName = scalingRuleName;
            return this;
        }

        /**
         * <p>This parameter is deprecated.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder scalingRuleTimer(String scalingRuleTimer) {
            this.putQueryParameter("ScalingRuleTimer", scalingRuleTimer);
            this.scalingRuleTimer = scalingRuleTimer;
            return this;
        }

        /**
         * <p>The trigger policy for the auto scaling policy. Set this parameter in the JSON format by using the ScalingRuleTriggerDTO class. For more information, see Additional description of request parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>ScalingRuleTriggerDTO{......}</p>
         */
        public Builder scalingRuleTrigger(String scalingRuleTrigger) {
            this.putQueryParameter("ScalingRuleTrigger", scalingRuleTrigger);
            this.scalingRuleTrigger = scalingRuleTrigger;
            return this;
        }

        /**
         * <p>The type of the auto scaling policy.</p>
         * <ul>
         * <li>Set the value to trigger.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>trigger</p>
         */
        public Builder scalingRuleType(String scalingRuleType) {
            this.putQueryParameter("ScalingRuleType", scalingRuleType);
            this.scalingRuleType = scalingRuleType;
            return this;
        }

        @Override
        public UpdateApplicationScalingRuleRequest build() {
            return new UpdateApplicationScalingRuleRequest(this);
        } 

    } 

}
