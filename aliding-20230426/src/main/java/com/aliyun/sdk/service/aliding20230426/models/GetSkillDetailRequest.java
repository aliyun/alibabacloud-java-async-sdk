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
 * {@link GetSkillDetailRequest} extends {@link RequestModel}
 *
 * <p>GetSkillDetailRequest</p>
 */
public class GetSkillDetailRequest extends Request {
    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("AccountContext")
    private AccountContext accountContext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("GroupId")
    private String groupId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SkillId")
    private String skillId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SourceIdOfAssistantId")
    private String sourceIdOfAssistantId;

    private GetSkillDetailRequest(Builder builder) {
        super(builder);
        this.accountContext = builder.accountContext;
        this.groupId = builder.groupId;
        this.skillId = builder.skillId;
        this.sourceIdOfAssistantId = builder.sourceIdOfAssistantId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetSkillDetailRequest create() {
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
     * @return groupId
     */
    public String getGroupId() {
        return this.groupId;
    }

    /**
     * @return skillId
     */
    public String getSkillId() {
        return this.skillId;
    }

    /**
     * @return sourceIdOfAssistantId
     */
    public String getSourceIdOfAssistantId() {
        return this.sourceIdOfAssistantId;
    }

    public static final class Builder extends Request.Builder<GetSkillDetailRequest, Builder> {
        private AccountContext accountContext; 
        private String groupId; 
        private String skillId; 
        private String sourceIdOfAssistantId; 

        private Builder() {
            super();
        } 

        private Builder(GetSkillDetailRequest request) {
            super(request);
            this.accountContext = request.accountContext;
            this.groupId = request.groupId;
            this.skillId = request.skillId;
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
         * GroupId.
         */
        public Builder groupId(String groupId) {
            this.putBodyParameter("GroupId", groupId);
            this.groupId = groupId;
            return this;
        }

        /**
         * SkillId.
         */
        public Builder skillId(String skillId) {
            this.putBodyParameter("SkillId", skillId);
            this.skillId = skillId;
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
        public GetSkillDetailRequest build() {
            return new GetSkillDetailRequest(this);
        } 

    } 

    /**
     * 
     * {@link GetSkillDetailRequest} extends {@link TeaModel}
     *
     * <p>GetSkillDetailRequest</p>
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
