// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

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
 * {@link DescribeApplicationScalingRuleRequest} extends {@link RequestModel}
 *
 * <p>DescribeApplicationScalingRuleRequest</p>
 */
public class DescribeApplicationScalingRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScalingRuleName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String scalingRuleName;

    private DescribeApplicationScalingRuleRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.scalingRuleName = builder.scalingRuleName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeApplicationScalingRuleRequest create() {
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

    public static final class Builder extends Request.Builder<DescribeApplicationScalingRuleRequest, Builder> {
        private String appId; 
        private String scalingRuleName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeApplicationScalingRuleRequest request) {
            super(request);
            this.appId = request.appId;
            this.scalingRuleName = request.scalingRuleName;
        } 

        /**
         * <p>a0d2e04c-159d-40a8-b240-d2f2c263****</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>a0d2e04c-159d-40a8-b240-d2f2c263****</p>
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>test</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder scalingRuleName(String scalingRuleName) {
            this.putQueryParameter("ScalingRuleName", scalingRuleName);
            this.scalingRuleName = scalingRuleName;
            return this;
        }

        @Override
        public DescribeApplicationScalingRuleRequest build() {
            return new DescribeApplicationScalingRuleRequest(this);
        } 

    } 

}
