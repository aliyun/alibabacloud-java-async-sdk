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
 * {@link GetWorkspacesRequest} extends {@link RequestModel}
 *
 * <p>GetWorkspacesRequest</p>
 */
public class GetWorkspacesRequest extends Request {
    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("AccountContext")
    private AccountContext accountContext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Option")
    private Option option;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantContext")
    private TenantContext tenantContext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> workspaceIds;

    private GetWorkspacesRequest(Builder builder) {
        super(builder);
        this.accountContext = builder.accountContext;
        this.option = builder.option;
        this.tenantContext = builder.tenantContext;
        this.workspaceIds = builder.workspaceIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetWorkspacesRequest create() {
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
     * @return option
     */
    public Option getOption() {
        return this.option;
    }

    /**
     * @return tenantContext
     */
    public TenantContext getTenantContext() {
        return this.tenantContext;
    }

    /**
     * @return workspaceIds
     */
    public java.util.List<String> getWorkspaceIds() {
        return this.workspaceIds;
    }

    public static final class Builder extends Request.Builder<GetWorkspacesRequest, Builder> {
        private AccountContext accountContext; 
        private Option option; 
        private TenantContext tenantContext; 
        private java.util.List<String> workspaceIds; 

        private Builder() {
            super();
        } 

        private Builder(GetWorkspacesRequest request) {
            super(request);
            this.accountContext = request.accountContext;
            this.option = request.option;
            this.tenantContext = request.tenantContext;
            this.workspaceIds = request.workspaceIds;
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
         * Option.
         */
        public Builder option(Option option) {
            String optionShrink = shrink(option, "Option", "json");
            this.putBodyParameter("Option", optionShrink);
            this.option = option;
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
         * <p>workspace_id</p>
         */
        public Builder workspaceIds(java.util.List<String> workspaceIds) {
            String workspaceIdsShrink = shrink(workspaceIds, "WorkspaceIds", "json");
            this.putBodyParameter("WorkspaceIds", workspaceIdsShrink);
            this.workspaceIds = workspaceIds;
            return this;
        }

        @Override
        public GetWorkspacesRequest build() {
            return new GetWorkspacesRequest(this);
        } 

    } 

    /**
     * 
     * {@link GetWorkspacesRequest} extends {@link TeaModel}
     *
     * <p>GetWorkspacesRequest</p>
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
     * {@link GetWorkspacesRequest} extends {@link TeaModel}
     *
     * <p>GetWorkspacesRequest</p>
     */
    public static class Option extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("WithPermissionRole")
        private Boolean withPermissionRole;

        private Option(Builder builder) {
            this.withPermissionRole = builder.withPermissionRole;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Option create() {
            return builder().build();
        }

        /**
         * @return withPermissionRole
         */
        public Boolean getWithPermissionRole() {
            return this.withPermissionRole;
        }

        public static final class Builder {
            private Boolean withPermissionRole; 

            /**
             * WithPermissionRole.
             */
            public Builder withPermissionRole(Boolean withPermissionRole) {
                this.withPermissionRole = withPermissionRole;
                return this;
            }

            public Option build() {
                return new Option(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetWorkspacesRequest} extends {@link TeaModel}
     *
     * <p>GetWorkspacesRequest</p>
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
