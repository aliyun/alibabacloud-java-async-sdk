// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InviteUsersRequest} extends {@link RequestModel}
 *
 * <p>InviteUsersRequest</p>
 */
public class InviteUsersRequest extends Request {
    @Header
    @NameInMap("AccountContext")
    private AccountContext accountContext;

    @Body
    @NameInMap("InviteeList")
    private java.util.List < InviteeList> inviteeList;

    @Body
    @NameInMap("TenantContext")
    private TenantContext tenantContext;

    @Body
    @NameInMap("conferenceId")
    @Validation(required = true)
    private String conferenceId;

    @Body
    @NameInMap("phoneInviteeList")
    private java.util.List < PhoneInviteeList> phoneInviteeList;

    private InviteUsersRequest(Builder builder) {
        super(builder);
        this.accountContext = builder.accountContext;
        this.inviteeList = builder.inviteeList;
        this.tenantContext = builder.tenantContext;
        this.conferenceId = builder.conferenceId;
        this.phoneInviteeList = builder.phoneInviteeList;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InviteUsersRequest create() {
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
     * @return inviteeList
     */
    public java.util.List < InviteeList> getInviteeList() {
        return this.inviteeList;
    }

    /**
     * @return tenantContext
     */
    public TenantContext getTenantContext() {
        return this.tenantContext;
    }

    /**
     * @return conferenceId
     */
    public String getConferenceId() {
        return this.conferenceId;
    }

    /**
     * @return phoneInviteeList
     */
    public java.util.List < PhoneInviteeList> getPhoneInviteeList() {
        return this.phoneInviteeList;
    }

    public static final class Builder extends Request.Builder<InviteUsersRequest, Builder> {
        private AccountContext accountContext; 
        private java.util.List < InviteeList> inviteeList; 
        private TenantContext tenantContext; 
        private String conferenceId; 
        private java.util.List < PhoneInviteeList> phoneInviteeList; 

        private Builder() {
            super();
        } 

        private Builder(InviteUsersRequest request) {
            super(request);
            this.accountContext = request.accountContext;
            this.inviteeList = request.inviteeList;
            this.tenantContext = request.tenantContext;
            this.conferenceId = request.conferenceId;
            this.phoneInviteeList = request.phoneInviteeList;
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
         * InviteeList.
         */
        public Builder inviteeList(java.util.List < InviteeList> inviteeList) {
            String inviteeListShrink = shrink(inviteeList, "InviteeList", "json");
            this.putBodyParameter("InviteeList", inviteeListShrink);
            this.inviteeList = inviteeList;
            return this;
        }

        /**
         * TenantContext.
         */
        public Builder tenantContext(TenantContext tenantContext) {
            String tenantContextShrink = shrink(tenantContext, "TenantContext", "json");
            this.putBodyParameter("TenantContext", tenantContextShrink);
            this.tenantContext = tenantContext;
            return this;
        }

        /**
         * conferenceId.
         */
        public Builder conferenceId(String conferenceId) {
            this.putBodyParameter("conferenceId", conferenceId);
            this.conferenceId = conferenceId;
            return this;
        }

        /**
         * phoneInviteeList.
         */
        public Builder phoneInviteeList(java.util.List < PhoneInviteeList> phoneInviteeList) {
            String phoneInviteeListShrink = shrink(phoneInviteeList, "phoneInviteeList", "json");
            this.putBodyParameter("phoneInviteeList", phoneInviteeListShrink);
            this.phoneInviteeList = phoneInviteeList;
            return this;
        }

        @Override
        public InviteUsersRequest build() {
            return new InviteUsersRequest(this);
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
    public static class InviteeList extends TeaModel {
        @NameInMap("Nick")
        @Validation(required = true)
        private String nick;

        @NameInMap("UserId")
        private String userId;

        private InviteeList(Builder builder) {
            this.nick = builder.nick;
            this.userId = builder.userId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InviteeList create() {
            return builder().build();
        }

        /**
         * @return nick
         */
        public String getNick() {
            return this.nick;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        public static final class Builder {
            private String nick; 
            private String userId; 

            /**
             * Nick.
             */
            public Builder nick(String nick) {
                this.nick = nick;
                return this;
            }

            /**
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            public InviteeList build() {
                return new InviteeList(this);
            } 

        } 

    }
    public static class TenantContext extends TeaModel {
        @NameInMap("tenantId")
        private String tenantId;

        private TenantContext(Builder builder) {
            this.tenantId = builder.tenantId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TenantContext create() {
            return builder().build();
        }

        /**
         * @return tenantId
         */
        public String getTenantId() {
            return this.tenantId;
        }

        public static final class Builder {
            private String tenantId; 

            /**
             * tenantId.
             */
            public Builder tenantId(String tenantId) {
                this.tenantId = tenantId;
                return this;
            }

            public TenantContext build() {
                return new TenantContext(this);
            } 

        } 

    }
    public static class PhoneInviteeList extends TeaModel {
        @NameInMap("Nick")
        private String nick;

        @NameInMap("PhoneNumber")
        private String phoneNumber;

        private PhoneInviteeList(Builder builder) {
            this.nick = builder.nick;
            this.phoneNumber = builder.phoneNumber;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PhoneInviteeList create() {
            return builder().build();
        }

        /**
         * @return nick
         */
        public String getNick() {
            return this.nick;
        }

        /**
         * @return phoneNumber
         */
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        public static final class Builder {
            private String nick; 
            private String phoneNumber; 

            /**
             * Nick.
             */
            public Builder nick(String nick) {
                this.nick = nick;
                return this;
            }

            /**
             * PhoneNumber.
             */
            public Builder phoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
                return this;
            }

            public PhoneInviteeList build() {
                return new PhoneInviteeList(this);
            } 

        } 

    }
}
