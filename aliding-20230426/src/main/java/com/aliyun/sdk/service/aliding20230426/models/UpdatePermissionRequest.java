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
 * {@link UpdatePermissionRequest} extends {@link RequestModel}
 *
 * <p>UpdatePermissionRequest</p>
 */
public class UpdatePermissionRequest extends Request {
    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("AccountContext")
    private AccountContext accountContext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DentryUuid")
    private String dentryUuid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Members")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Members> members;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Option")
    private Option option;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleId")
    private String roleId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantContext")
    private TenantContext tenantContext;

    private UpdatePermissionRequest(Builder builder) {
        super(builder);
        this.accountContext = builder.accountContext;
        this.dentryUuid = builder.dentryUuid;
        this.members = builder.members;
        this.option = builder.option;
        this.roleId = builder.roleId;
        this.tenantContext = builder.tenantContext;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdatePermissionRequest create() {
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
     * @return dentryUuid
     */
    public String getDentryUuid() {
        return this.dentryUuid;
    }

    /**
     * @return members
     */
    public java.util.List<Members> getMembers() {
        return this.members;
    }

    /**
     * @return option
     */
    public Option getOption() {
        return this.option;
    }

    /**
     * @return roleId
     */
    public String getRoleId() {
        return this.roleId;
    }

    /**
     * @return tenantContext
     */
    public TenantContext getTenantContext() {
        return this.tenantContext;
    }

    public static final class Builder extends Request.Builder<UpdatePermissionRequest, Builder> {
        private AccountContext accountContext; 
        private String dentryUuid; 
        private java.util.List<Members> members; 
        private Option option; 
        private String roleId; 
        private TenantContext tenantContext; 

        private Builder() {
            super();
        } 

        private Builder(UpdatePermissionRequest request) {
            super(request);
            this.accountContext = request.accountContext;
            this.dentryUuid = request.dentryUuid;
            this.members = request.members;
            this.option = request.option;
            this.roleId = request.roleId;
            this.tenantContext = request.tenantContext;
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
         * DentryUuid.
         */
        public Builder dentryUuid(String dentryUuid) {
            this.putBodyParameter("DentryUuid", dentryUuid);
            this.dentryUuid = dentryUuid;
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
         * Option.
         */
        public Builder option(Option option) {
            String optionShrink = shrink(option, "Option", "json");
            this.putBodyParameter("Option", optionShrink);
            this.option = option;
            return this;
        }

        /**
         * RoleId.
         */
        public Builder roleId(String roleId) {
            this.putBodyParameter("RoleId", roleId);
            this.roleId = roleId;
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

        @Override
        public UpdatePermissionRequest build() {
            return new UpdatePermissionRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdatePermissionRequest} extends {@link TeaModel}
     *
     * <p>UpdatePermissionRequest</p>
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

            private Builder() {
            } 

            private Builder(AccountContext model) {
                this.accountId = model.accountId;
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
    /**
     * 
     * {@link UpdatePermissionRequest} extends {@link TeaModel}
     *
     * <p>UpdatePermissionRequest</p>
     */
    public static class Members extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CorpId")
        private String corpId;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Members(Builder builder) {
            this.corpId = builder.corpId;
            this.id = builder.id;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Members create() {
            return builder().build();
        }

        /**
         * @return corpId
         */
        public String getCorpId() {
            return this.corpId;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String corpId; 
            private String id; 
            private String type; 

            private Builder() {
            } 

            private Builder(Members model) {
                this.corpId = model.corpId;
                this.id = model.id;
                this.type = model.type;
            } 

            /**
             * CorpId.
             */
            public Builder corpId(String corpId) {
                this.corpId = corpId;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Members build() {
                return new Members(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdatePermissionRequest} extends {@link TeaModel}
     *
     * <p>UpdatePermissionRequest</p>
     */
    public static class Option extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Duration")
        private Long duration;

        private Option(Builder builder) {
            this.duration = builder.duration;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Option create() {
            return builder().build();
        }

        /**
         * @return duration
         */
        public Long getDuration() {
            return this.duration;
        }

        public static final class Builder {
            private Long duration; 

            private Builder() {
            } 

            private Builder(Option model) {
                this.duration = model.duration;
            } 

            /**
             * Duration.
             */
            public Builder duration(Long duration) {
                this.duration = duration;
                return this;
            }

            public Option build() {
                return new Option(this);
            } 

        } 

    }
    /**
     * 
     * {@link UpdatePermissionRequest} extends {@link TeaModel}
     *
     * <p>UpdatePermissionRequest</p>
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

            private Builder() {
            } 

            private Builder(TenantContext model) {
                this.tenantId = model.tenantId;
            } 

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
