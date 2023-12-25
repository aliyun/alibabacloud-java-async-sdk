// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateVideoConferenceRequest} extends {@link RequestModel}
 *
 * <p>CreateVideoConferenceRequest</p>
 */
public class CreateVideoConferenceRequest extends Request {
    @Header
    @NameInMap("AccountContext")
    private AccountContext accountContext;

    @Body
    @NameInMap("ConfTitle")
    @Validation(required = true)
    private String confTitle;

    @Body
    @NameInMap("InviteCaller")
    private Boolean inviteCaller;

    @Body
    @NameInMap("InviteUserIds")
    private java.util.List < String > inviteUserIds;

    private CreateVideoConferenceRequest(Builder builder) {
        super(builder);
        this.accountContext = builder.accountContext;
        this.confTitle = builder.confTitle;
        this.inviteCaller = builder.inviteCaller;
        this.inviteUserIds = builder.inviteUserIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateVideoConferenceRequest create() {
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
     * @return confTitle
     */
    public String getConfTitle() {
        return this.confTitle;
    }

    /**
     * @return inviteCaller
     */
    public Boolean getInviteCaller() {
        return this.inviteCaller;
    }

    /**
     * @return inviteUserIds
     */
    public java.util.List < String > getInviteUserIds() {
        return this.inviteUserIds;
    }

    public static final class Builder extends Request.Builder<CreateVideoConferenceRequest, Builder> {
        private AccountContext accountContext; 
        private String confTitle; 
        private Boolean inviteCaller; 
        private java.util.List < String > inviteUserIds; 

        private Builder() {
            super();
        } 

        private Builder(CreateVideoConferenceRequest request) {
            super(request);
            this.accountContext = request.accountContext;
            this.confTitle = request.confTitle;
            this.inviteCaller = request.inviteCaller;
            this.inviteUserIds = request.inviteUserIds;
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
         * ConfTitle.
         */
        public Builder confTitle(String confTitle) {
            this.putBodyParameter("ConfTitle", confTitle);
            this.confTitle = confTitle;
            return this;
        }

        /**
         * InviteCaller.
         */
        public Builder inviteCaller(Boolean inviteCaller) {
            this.putBodyParameter("InviteCaller", inviteCaller);
            this.inviteCaller = inviteCaller;
            return this;
        }

        /**
         * InviteUserIds.
         */
        public Builder inviteUserIds(java.util.List < String > inviteUserIds) {
            String inviteUserIdsShrink = shrink(inviteUserIds, "InviteUserIds", "json");
            this.putBodyParameter("InviteUserIds", inviteUserIdsShrink);
            this.inviteUserIds = inviteUserIds;
            return this;
        }

        @Override
        public CreateVideoConferenceRequest build() {
            return new CreateVideoConferenceRequest(this);
        } 

    } 

    public static class AccountContext extends TeaModel {
        @NameInMap("accountId")
        @Validation(required = true)
        private String accountId;

        private AccountContext(Builder builder) {
            this.accountId = builder.accountId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccountContext create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public String getAccountId() {
            return this.accountId;
        }

        public static final class Builder {
            private String accountId; 

            /**
             * accountId.
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
