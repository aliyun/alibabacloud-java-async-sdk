// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteWorkspaceDocMembersRequest} extends {@link RequestModel}
 *
 * <p>DeleteWorkspaceDocMembersRequest</p>
 */
public class DeleteWorkspaceDocMembersRequest extends Request {
    @Header
    @NameInMap("AccountContext")
    private AccountContext accountContext;

    @Body
    @NameInMap("Members")
    @Validation(required = true)
    private java.util.List < Members> members;

    @Body
    @NameInMap("NodeId")
    @Validation(required = true)
    private String nodeId;

    @Body
    @NameInMap("TenantContext")
    private TenantContext tenantContext;

    @Body
    @NameInMap("WorkspaceId")
    @Validation(required = true)
    private String workspaceId;

    private DeleteWorkspaceDocMembersRequest(Builder builder) {
        super(builder);
        this.accountContext = builder.accountContext;
        this.members = builder.members;
        this.nodeId = builder.nodeId;
        this.tenantContext = builder.tenantContext;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteWorkspaceDocMembersRequest create() {
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
    public java.util.List < Members> getMembers() {
        return this.members;
    }

    /**
     * @return nodeId
     */
    public String getNodeId() {
        return this.nodeId;
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

    public static final class Builder extends Request.Builder<DeleteWorkspaceDocMembersRequest, Builder> {
        private AccountContext accountContext; 
        private java.util.List < Members> members; 
        private String nodeId; 
        private TenantContext tenantContext; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteWorkspaceDocMembersRequest request) {
            super(request);
            this.accountContext = request.accountContext;
            this.members = request.members;
            this.nodeId = request.nodeId;
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
         * Members.
         */
        public Builder members(java.util.List < Members> members) {
            String membersShrink = shrink(members, "Members", "json");
            this.putBodyParameter("Members", membersShrink);
            this.members = members;
            return this;
        }

        /**
         * NodeId.
         */
        public Builder nodeId(String nodeId) {
            this.putBodyParameter("NodeId", nodeId);
            this.nodeId = nodeId;
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
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public DeleteWorkspaceDocMembersRequest build() {
            return new DeleteWorkspaceDocMembersRequest(this);
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
    public static class Members extends TeaModel {
        @NameInMap("MemberId")
        @Validation(required = true)
        private String memberId;

        @NameInMap("MemberType")
        @Validation(required = true)
        private String memberType;

        private Members(Builder builder) {
            this.memberId = builder.memberId;
            this.memberType = builder.memberType;
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

        public static final class Builder {
            private String memberId; 
            private String memberType; 

            /**
             * MemberId.
             */
            public Builder memberId(String memberId) {
                this.memberId = memberId;
                return this;
            }

            /**
             * MemberType.
             */
            public Builder memberType(String memberType) {
                this.memberType = memberType;
                return this;
            }

            public Members build() {
                return new Members(this);
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
}
