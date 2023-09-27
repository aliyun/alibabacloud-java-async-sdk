// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20180601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveApiRuleRequest} extends {@link RequestModel}
 *
 * <p>RemoveApiRuleRequest</p>
 */
public class RemoveApiRuleRequest extends Request {
    @Query
    @NameInMap("ApiIds")
    private String apiIds;

    @Query
    @NameInMap("GroupId")
    @Validation(required = true)
    private String groupId;

    @Query
    @NameInMap("RuleId")
    @Validation(required = true)
    private String ruleId;

    @Query
    @NameInMap("RuleType")
    @Validation(required = true)
    private String ruleType;

    @Query
    @NameInMap("SecurityToken")
    private String securityToken;

    @Query
    @NameInMap("StageName")
    @Validation(required = true)
    private String stageName;

    private RemoveApiRuleRequest(Builder builder) {
        super(builder);
        this.apiIds = builder.apiIds;
        this.groupId = builder.groupId;
        this.ruleId = builder.ruleId;
        this.ruleType = builder.ruleType;
        this.securityToken = builder.securityToken;
        this.stageName = builder.stageName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RemoveApiRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return apiIds
     */
    public String getApiIds() {
        return this.apiIds;
    }

    /**
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return ruleId
     */
    public String getRuleId() {
        return this.ruleId;
    }

    /**
     * @return ruleType
     */
    public String getRuleType() {
        return this.ruleType;
    }

    /**
     * @return securityToken
     */
    public String getSecurityToken() {
        return this.securityToken;
    }

    /**
     * @return stageName
     */
    public String getStageName() {
        return this.stageName;
    }

    public static final class Builder extends Request.Builder<RemoveApiRuleRequest, Builder> {
        private String apiIds; 
        private String groupId; 
        private String ruleId; 
        private String ruleType; 
        private String securityToken; 
        private String stageName; 

        private Builder() {
            super();
        } 

        private Builder(RemoveApiRuleRequest request) {
            super(request);
            this.apiIds = request.apiIds;
            this.groupId = request.groupId;
            this.ruleId = request.ruleId;
            this.ruleType = request.ruleType;
            this.securityToken = request.securityToken;
            this.stageName = request.stageName;
        } 

        /**
         * ApiIds.
         */
        public Builder apiIds(String apiIds) {
            this.putQueryParameter("ApiIds", apiIds);
            this.apiIds = apiIds;
            return this;
        }

        /**
         * GroupId.
         */
        public Builder groupId(String groupId) {
            this.putQueryParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * RuleId.
         */
        public Builder ruleId(String ruleId) {
            this.putQueryParameter("RuleId", ruleId);
            this.ruleId = ruleId;
            return this;
        }

        /**
         * RuleType.
         */
        public Builder ruleType(String ruleType) {
            this.putQueryParameter("RuleType", ruleType);
            this.ruleType = ruleType;
            return this;
        }

        /**
         * SecurityToken.
         */
        public Builder securityToken(String securityToken) {
            this.putQueryParameter("SecurityToken", securityToken);
            this.securityToken = securityToken;
            return this;
        }

        /**
         * StageName.
         */
        public Builder stageName(String stageName) {
            this.putQueryParameter("StageName", stageName);
            this.stageName = stageName;
            return this;
        }

        @Override
        public RemoveApiRuleRequest build() {
            return new RemoveApiRuleRequest(this);
        } 

    } 

}
