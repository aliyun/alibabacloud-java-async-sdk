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
 * {@link UpdateWorkspaceMembersRequest} extends {@link RequestModel}
 *
 * <p>UpdateWorkspaceMembersRequest</p>
 */
public class UpdateWorkspaceMembersRequest extends Request {
    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("AccountContext")
    private AccountContext accountContext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Members")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Members> members;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantContext")
    private TenantContext tenantContext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private UpdateWorkspaceMembersRequest(Builder builder) {
        super(builder);
        this.accountContext = builder.accountContext;
        this.members = builder.members;
        this.tenantContext = builder.tenantContext;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateWorkspaceMembersRequest create() {
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
     * @return members
     */
    public java.util.List<Members> getMembers() {
        return this.members;
    }

    /**
     * @return tenantContext
     */
    public TenantContext getTenantContext() {
        return this.tenantContext;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<UpdateWorkspaceMembersRequest, Builder> {
        private AccountContext accountContext; 
        private java.util.List<Members> members; 
        private TenantContext tenantContext; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateWorkspaceMembersRequest request) {
            super(request);
            this.accountContext = request.accountContext;
            this.members = request.members;
            this.tenantContext = request.tenantContext;
            this.workspaceId = request.workspaceId;
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
         * <p>This parameter is required.</p>
         */
        public Builder members(java.util.List<Members> members) {
            String membersShrink = shrink(members, "Members", "json");
            this.putBodyParameter("Members", membersShrink);
            this.members = members;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public UpdateWorkspaceMembersRequest build() {
            return new UpdateWorkspaceMembersRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateWorkspaceMembersRequest} extends {@link TeaModel}
     *
     * <p>UpdateWorkspaceMembersRequest</p>
     */
    public static class AccountContext extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("accountId")
        @com.aliyun.core.annotation.Validation(required = true)
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
    /**
     * 
     * {@link UpdateWorkspaceMembersRequest} extends {@link TeaModel}
     *
     * <p>UpdateWorkspaceMembersRequest</p>
     */
    public static class Members extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MemberId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String memberId;

        @com.aliyun.core.annotation.NameInMap("MemberType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String memberType;

        @com.aliyun.core.annotation.NameInMap("RoleType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String roleType;

        private Members(Builder builder) {
            this.memberId = builder.memberId;
            this.memberType = builder.memberType;
            this.roleType = builder.roleType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Members create() {
            return builder().build();
        }

        /**
         * @return memberId
         */
        public String getMemberId() {
            return this.memberId;
        }

        /**
         * @return memberType
         */
        public String getMemberType() {
            return this.memberType;
        }

        /**
         * @return roleType
         */
        public String getRoleType() {
            return this.roleType;
        }

        public static final class Builder {
            private String memberId; 
            private String memberType; 
            private String roleType; 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>012345</p>
             */
            public Builder memberId(String memberId) {
                this.memberId = memberId;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>USER</p>
             */
            public Builder memberType(String memberType) {
                this.memberType = memberType;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>ONLY_VIEWER</p>
             */
            public Builder roleType(String roleType) {
                this.roleType = roleType;
                return this;
            }

            public Members build() {
                return new Members(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdateWorkspaceMembersRequest} extends {@link TeaModel}
     *
     * <p>UpdateWorkspaceMembersRequest</p>
     */
    public static class TenantContext extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("tenantId")
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
}
