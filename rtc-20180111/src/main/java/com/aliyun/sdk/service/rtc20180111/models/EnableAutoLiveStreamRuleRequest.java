// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rtc20180111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableAutoLiveStreamRuleRequest} extends {@link RequestModel}
 *
 * <p>EnableAutoLiveStreamRuleRequest</p>
 */
public class EnableAutoLiveStreamRuleRequest extends Request {
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

    private EnableAutoLiveStreamRuleRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.ownerId = builder.ownerId;
        this.ruleId = builder.ruleId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EnableAutoLiveStreamRuleRequest create() {
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

    public static final class Builder extends Request.Builder<EnableAutoLiveStreamRuleRequest, Builder> {
        private String appId; 
        private Long ownerId; 
        private Long ruleId; 

        private Builder() {
            super();
        } 

        private Builder(EnableAutoLiveStreamRuleRequest response) {
            super(response);
            this.appId = response.appId;
            this.ownerId = response.ownerId;
            this.ruleId = response.ruleId;
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
        public EnableAutoLiveStreamRuleRequest build() {
            return new EnableAutoLiveStreamRuleRequest(this);
        } 

    } 

}
