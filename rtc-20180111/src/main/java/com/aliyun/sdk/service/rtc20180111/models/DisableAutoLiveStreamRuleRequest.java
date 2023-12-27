// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableAutoLiveStreamRuleRequest} extends {@link RequestModel}
 *
 * <p>DisableAutoLiveStreamRuleRequest</p>
 */
public class DisableAutoLiveStreamRuleRequest extends Request {
    @Query
    @NameInMap("AppId")
    @Validation(required = true)
    private String appId;

    @Query
    @NameInMap("OwnerId")
    private Long ownerId;

    @Query
    @NameInMap("RuleId")
    @Validation(required = true)
    private Long ruleId;

    private DisableAutoLiveStreamRuleRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.ownerId = builder.ownerId;
        this.ruleId = builder.ruleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DisableAutoLiveStreamRuleRequest create() {
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
     * @return ownerId
     */
    public Long getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return ruleId
     */
    public Long getRuleId() {
        return this.ruleId;
    }

    public static final class Builder extends Request.Builder<DisableAutoLiveStreamRuleRequest, Builder> {
        private String appId; 
        private Long ownerId; 
        private Long ruleId; 

        private Builder() {
            super();
        } 

        private Builder(DisableAutoLiveStreamRuleRequest request) {
            super(request);
            this.appId = request.appId;
            this.ownerId = request.ownerId;
            this.ruleId = request.ruleId;
        } 

        /**
         * AppId.
         */
        public Builder appId(String appId) {
            this.putQueryParameter("AppId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * OwnerId.
         */
        public Builder ownerId(Long ownerId) {
            this.putQueryParameter("OwnerId", ownerId);
            this.ownerId = ownerId;
            return this;
        }

        /**
         * RuleId.
         */
        public Builder ruleId(Long ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        @Override
        public DisableAutoLiveStreamRuleRequest build() {
            return new DisableAutoLiveStreamRuleRequest(this);
        } 

    } 

}
