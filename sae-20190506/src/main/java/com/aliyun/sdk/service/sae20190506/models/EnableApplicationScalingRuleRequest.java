// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableApplicationScalingRuleRequest} extends {@link RequestModel}
 *
 * <p>EnableApplicationScalingRuleRequest</p>
 */
public class EnableApplicationScalingRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScalingRuleName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scalingRuleName;

    private EnableApplicationScalingRuleRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.scalingRuleName = builder.scalingRuleName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableApplicationScalingRuleRequest create() {
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
     * @return scalingRuleName
     */
    public String getScalingRuleName() {
        return this.scalingRuleName;
    }

    public static final class Builder extends Request.Builder<EnableApplicationScalingRuleRequest, Builder> {
        private String appId; 
        private String scalingRuleName; 

        private Builder() {
            super();
        } 

        private Builder(EnableApplicationScalingRuleRequest request) {
            super(request);
            this.appId = request.appId;
            this.scalingRuleName = request.scalingRuleName;
        } 

        /**
         * The application ID.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * The name of the auto scaling policy.
         */
        public Builder scalingRuleName(String scalingRuleName) {
            this.putQueryParameter("ScalingRuleName", scalingRuleName);
            this.scalingRuleName = scalingRuleName;
            return this;
        }

        @Override
        public EnableApplicationScalingRuleRequest build() {
            return new EnableApplicationScalingRuleRequest(this);
        } 

    } 

}
