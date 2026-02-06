// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

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
 * {@link GetSkillsRequest} extends {@link RequestModel}
 *
 * <p>GetSkillsRequest</p>
 */
public class GetSkillsRequest extends Request {
    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("AccountContext")
    private AccountContext accountContext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GroupIds")
    private java.util.List<String> groupIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SkillIds")
    private java.util.List<String> skillIds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SourceIdOfAssistantId")
    private String sourceIdOfAssistantId;

    private GetSkillsRequest(Builder builder) {
        super(builder);
        this.accountContext = builder.accountContext;
        this.groupIds = builder.groupIds;
        this.skillIds = builder.skillIds;
        this.sourceIdOfAssistantId = builder.sourceIdOfAssistantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSkillsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accountContext
     */
    public AccountContext getAccountContext() {
        return this.accountContext;
    }

    /**
     * @return groupIds
     */
    public java.util.List<String> getGroupIds() {
        return this.groupIds;
    }

    /**
     * @return skillIds
     */
    public java.util.List<String> getSkillIds() {
        return this.skillIds;
    }

    /**
     * @return sourceIdOfAssistantId
     */
    public String getSourceIdOfAssistantId() {
        return this.sourceIdOfAssistantId;
    }

    public static final class Builder extends Request.Builder<GetSkillsRequest, Builder> {
        private AccountContext accountContext; 
        private java.util.List<String> groupIds; 
        private java.util.List<String> skillIds; 
        private String sourceIdOfAssistantId; 

        private Builder() {
            super();
        } 

        private Builder(GetSkillsRequest request) {
            super(request);
            this.accountContext = request.accountContext;
            this.groupIds = request.groupIds;
            this.skillIds = request.skillIds;
            this.sourceIdOfAssistantId = request.sourceIdOfAssistantId;
        } 

        /**
         * AccountContext.
         */
        public Builder accountContext(AccountContext accountContext) {
            String accountContextShrink = shrink(accountContext, "AccountContext", "json");
            this.putHeaderParameter("AccountContext", accountContextShrink);
            this.accountContext = accountContext;
            return this;
        }

        /**
         * GroupIds.
         */
        public Builder groupIds(java.util.List<String> groupIds) {
            String groupIdsShrink = shrink(groupIds, "GroupIds", "json");
            this.putBodyParameter("GroupIds", groupIdsShrink);
            this.groupIds = groupIds;
            return this;
        }

        /**
         * SkillIds.
         */
        public Builder skillIds(java.util.List<String> skillIds) {
            String skillIdsShrink = shrink(skillIds, "SkillIds", "json");
            this.putBodyParameter("SkillIds", skillIdsShrink);
            this.skillIds = skillIds;
            return this;
        }

        /**
         * SourceIdOfAssistantId.
         */
        public Builder sourceIdOfAssistantId(String sourceIdOfAssistantId) {
            this.putBodyParameter("SourceIdOfAssistantId", sourceIdOfAssistantId);
            this.sourceIdOfAssistantId = sourceIdOfAssistantId;
            return this;
        }

        @Override
        public GetSkillsRequest build() {
            return new GetSkillsRequest(this);
        } 

    } 

    /**
     * 
     * {@link GetSkillsRequest} extends {@link TeaModel}
     *
     * <p>GetSkillsRequest</p>
     */
    public static class AccountContext extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("SsoTicket")
        private String ssoTicket;

        @com.aliyun.core.annotation.NameInMap("accountId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String accountId;

        private AccountContext(Builder builder) {
            this.ssoTicket = builder.ssoTicket;
            this.accountId = builder.accountId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccountContext create() {
            return builder().build();
        }

        /**
         * @return ssoTicket
         */
        public String getSsoTicket() {
            return this.ssoTicket;
        }

        /**
         * @return accountId
         */
        public String getAccountId() {
            return this.accountId;
        }

        public static final class Builder {
            private String ssoTicket; 
            private String accountId; 

            private Builder() {
            } 

            private Builder(AccountContext model) {
                this.ssoTicket = model.ssoTicket;
                this.accountId = model.accountId;
            } 

            /**
             * <p>Buc SsoTicket</p>
             * 
             * <strong>example:</strong>
             * <p>bucxxx</p>
             */
            public Builder ssoTicket(String ssoTicket) {
                this.ssoTicket = ssoTicket;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>012345</p>
             */
            public Builder accountId(String accountId) {
                this.accountId = accountId;
                return this;
            }

            public AccountContext build() {
                return new AccountContext(this);
            } 

        } 

    }
}
