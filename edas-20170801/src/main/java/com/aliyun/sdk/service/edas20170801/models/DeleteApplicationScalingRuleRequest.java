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
 * {@link DeleteApplicationScalingRuleRequest} extends {@link RequestModel}
 *
 * <p>DeleteApplicationScalingRuleRequest</p>
 */
public class DeleteApplicationScalingRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AppId")
    private String appId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ScalingRuleName")
    private String scalingRuleName;

    private DeleteApplicationScalingRuleRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.scalingRuleName = builder.scalingRuleName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteApplicationScalingRuleRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteApplicationScalingRuleRequest, Builder> {
        private String appId; 
        private String scalingRuleName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteApplicationScalingRuleRequest request) {
            super(request);
            this.appId = request.appId;
            this.scalingRuleName = request.scalingRuleName;
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

        @Override
        public DeleteApplicationScalingRuleRequest build() {
            return new DeleteApplicationScalingRuleRequest(this);
        } 

    } 

}
