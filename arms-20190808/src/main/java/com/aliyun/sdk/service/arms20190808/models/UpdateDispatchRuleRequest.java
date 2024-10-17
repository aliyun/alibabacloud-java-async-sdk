// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateDispatchRuleRequest} extends {@link RequestModel}
 *
 * <p>UpdateDispatchRuleRequest</p>
 */
public class UpdateDispatchRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DispatchRule")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dispatchRule;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String regionId;

    private UpdateDispatchRuleRequest(Builder builder) {
        super(builder);
        this.dispatchRule = builder.dispatchRule;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDispatchRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dispatchRule
     */
    public String getDispatchRule() {
        return this.dispatchRule;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<UpdateDispatchRuleRequest, Builder> {
        private String dispatchRule; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDispatchRuleRequest request) {
            super(request);
            this.dispatchRule = request.dispatchRule;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The dispatch rule configuration. The value is a JSON string. For more information about this parameter, see the following <strong>additional information about the DispatchRule parameter</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>{   &quot;id&quot;: 123,     &quot;system&quot;: false,   &quot;ruleid&quot;: 10282,   &quot;name&quot;: &quot;Prometheus Alert&quot;,   &quot;labelMatchExpressionGrid&quot;: {     &quot;labelMatchExpressionGroups&quot;: [       {         &quot;labelMatchExpressions&quot;: [           {             &quot;key&quot;: &quot;_aliyun_arms_involvedObject_kind&quot;,             &quot;value&quot;: &quot;app&quot;,             &quot;operator&quot;: &quot;eq&quot;           }         ]       }     ]   },   &quot;dispatchType&quot;: &quot;CREATE_ALERT/DISCARD_ALERT&quot;,   &quot;isRecover&quot;: true,   &quot;groupRules&quot;: [     {       &quot;groupId&quot;: 1,       &quot;groupingFields&quot;: [         &quot;alertname&quot;       ],       &quot;groupWait&quot;: 10,       &quot;groupInterval&quot;: 15,       &quot;repeatInterval&quot;: 20     }   ],   &quot;notifyRules&quot;: [     {       &quot;notifyObjects&quot;: [         {           &quot;notifyType&quot;: &quot;ARMS_CONTACT&quot;,           &quot;name&quot;: &quot;JohnDoe&quot;,           &quot;notifyObjectId&quot;: 1         },         {           &quot;notifyType&quot;: &quot;ARMS_CONTACT_GROUP&quot;,           &quot;name&quot;: &quot;JohnDoe_group&quot;,           &quot;notifyObjectId&quot;: 2         }       ],       &quot;notifyChannels&quot;:[&quot;dingTalk&quot;,&quot;wechat&quot;,&quot;webhook&quot;,&quot;email&quot;]     },   ], }</p>
         */
        public Builder dispatchRule(String dispatchRule) {
            this.putQueryParameter("DispatchRule", dispatchRule);
            this.dispatchRule = dispatchRule;
            return this;
        }

        /**
         * <p>The ID of the region.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public UpdateDispatchRuleRequest build() {
            return new UpdateDispatchRuleRequest(this);
        } 

    } 

}
