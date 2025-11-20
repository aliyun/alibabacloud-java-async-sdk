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
 * {@link CopyDentryByNodeIdRequest} extends {@link RequestModel}
 *
 * <p>CopyDentryByNodeIdRequest</p>
 */
public class CopyDentryByNodeIdRequest extends Request {
    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("AccountContext")
    private AccountContext accountContext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DentryUuid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dentryUuid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantContext")
    private TenantContext tenantContext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ToNextNodeId")
    private String toNextNodeId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ToParentNodeId")
    private String toParentNodeId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ToPrevNodeId")
    private String toPrevNodeId;

    private CopyDentryByNodeIdRequest(Builder builder) {
        super(builder);
        this.accountContext = builder.accountContext;
        this.dentryUuid = builder.dentryUuid;
        this.name = builder.name;
        this.tenantContext = builder.tenantContext;
        this.toNextNodeId = builder.toNextNodeId;
        this.toParentNodeId = builder.toParentNodeId;
        this.toPrevNodeId = builder.toPrevNodeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CopyDentryByNodeIdRequest create() {
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
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return tenantContext
     */
    public TenantContext getTenantContext() {
        return this.tenantContext;
    }

    /**
     * @return toNextNodeId
     */
    public String getToNextNodeId() {
        return this.toNextNodeId;
    }

    /**
     * @return toParentNodeId
     */
    public String getToParentNodeId() {
        return this.toParentNodeId;
    }

    /**
     * @return toPrevNodeId
     */
    public String getToPrevNodeId() {
        return this.toPrevNodeId;
    }

    public static final class Builder extends Request.Builder<CopyDentryByNodeIdRequest, Builder> {
        private AccountContext accountContext; 
        private String dentryUuid; 
        private String name; 
        private TenantContext tenantContext; 
        private String toNextNodeId; 
        private String toParentNodeId; 
        private String toPrevNodeId; 

        private Builder() {
            super();
        } 

        private Builder(CopyDentryByNodeIdRequest request) {
            super(request);
            this.accountContext = request.accountContext;
            this.dentryUuid = request.dentryUuid;
            this.name = request.name;
            this.tenantContext = request.tenantContext;
            this.toNextNodeId = request.toNextNodeId;
            this.toParentNodeId = request.toParentNodeId;
            this.toPrevNodeId = request.toPrevNodeId;
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
         * 
         * <strong>example:</strong>
         * <p>P7QG4Yx2Jpx4OolYC1QPg5BaJ9dEq3XD</p>
         */
        public Builder dentryUuid(String dentryUuid) {
            this.putBodyParameter("DentryUuid", dentryUuid);
            this.dentryUuid = dentryUuid;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
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
         * ToNextNodeId.
         */
        public Builder toNextNodeId(String toNextNodeId) {
            this.putBodyParameter("ToNextNodeId", toNextNodeId);
            this.toNextNodeId = toNextNodeId;
            return this;
        }

        /**
         * ToParentNodeId.
         */
        public Builder toParentNodeId(String toParentNodeId) {
            this.putBodyParameter("ToParentNodeId", toParentNodeId);
            this.toParentNodeId = toParentNodeId;
            return this;
        }

        /**
         * ToPrevNodeId.
         */
        public Builder toPrevNodeId(String toPrevNodeId) {
            this.putBodyParameter("ToPrevNodeId", toPrevNodeId);
            this.toPrevNodeId = toPrevNodeId;
            return this;
        }

        @Override
        public CopyDentryByNodeIdRequest build() {
            return new CopyDentryByNodeIdRequest(this);
        } 

    } 

    /**
     * 
     * {@link CopyDentryByNodeIdRequest} extends {@link TeaModel}
     *
     * <p>CopyDentryByNodeIdRequest</p>
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
     * {@link CopyDentryByNodeIdRequest} extends {@link TeaModel}
     *
     * <p>CopyDentryByNodeIdRequest</p>
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
