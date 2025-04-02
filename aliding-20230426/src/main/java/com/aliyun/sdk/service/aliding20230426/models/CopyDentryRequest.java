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
 * {@link CopyDentryRequest} extends {@link RequestModel}
 *
 * <p>CopyDentryRequest</p>
 */
public class CopyDentryRequest extends Request {
    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("AccountContext")
    private AccountContext accountContext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DentryId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dentryId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SpaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String spaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TargetSpaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetSpaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantContext")
    private TenantContext tenantContext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ToNextDentryId")
    private String toNextDentryId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ToParentDentryId")
    private String toParentDentryId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ToPrevDentryId")
    private String toPrevDentryId;

    private CopyDentryRequest(Builder builder) {
        super(builder);
        this.accountContext = builder.accountContext;
        this.dentryId = builder.dentryId;
        this.name = builder.name;
        this.spaceId = builder.spaceId;
        this.targetSpaceId = builder.targetSpaceId;
        this.tenantContext = builder.tenantContext;
        this.toNextDentryId = builder.toNextDentryId;
        this.toParentDentryId = builder.toParentDentryId;
        this.toPrevDentryId = builder.toPrevDentryId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CopyDentryRequest create() {
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
     * @return dentryId
     */
    public String getDentryId() {
        return this.dentryId;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return spaceId
     */
    public String getSpaceId() {
        return this.spaceId;
    }

    /**
     * @return targetSpaceId
     */
    public String getTargetSpaceId() {
        return this.targetSpaceId;
    }

    /**
     * @return tenantContext
     */
    public TenantContext getTenantContext() {
        return this.tenantContext;
    }

    /**
     * @return toNextDentryId
     */
    public String getToNextDentryId() {
        return this.toNextDentryId;
    }

    /**
     * @return toParentDentryId
     */
    public String getToParentDentryId() {
        return this.toParentDentryId;
    }

    /**
     * @return toPrevDentryId
     */
    public String getToPrevDentryId() {
        return this.toPrevDentryId;
    }

    public static final class Builder extends Request.Builder<CopyDentryRequest, Builder> {
        private AccountContext accountContext; 
        private String dentryId; 
        private String name; 
        private String spaceId; 
        private String targetSpaceId; 
        private TenantContext tenantContext; 
        private String toNextDentryId; 
        private String toParentDentryId; 
        private String toPrevDentryId; 

        private Builder() {
            super();
        } 

        private Builder(CopyDentryRequest request) {
            super(request);
            this.accountContext = request.accountContext;
            this.dentryId = request.dentryId;
            this.name = request.name;
            this.spaceId = request.spaceId;
            this.targetSpaceId = request.targetSpaceId;
            this.tenantContext = request.tenantContext;
            this.toNextDentryId = request.toNextDentryId;
            this.toParentDentryId = request.toParentDentryId;
            this.toPrevDentryId = request.toPrevDentryId;
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
         * <p>b9XJljElJv6RPGyA</p>
         */
        public Builder dentryId(String dentryId) {
            this.putBodyParameter("DentryId", dentryId);
            this.dentryId = dentryId;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>24458420428</p>
         */
        public Builder spaceId(String spaceId) {
            this.putBodyParameter("SpaceId", spaceId);
            this.spaceId = spaceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>b9XJljElJv6RPG</p>
         */
        public Builder targetSpaceId(String targetSpaceId) {
            this.putBodyParameter("TargetSpaceId", targetSpaceId);
            this.targetSpaceId = targetSpaceId;
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
         * ToNextDentryId.
         */
        public Builder toNextDentryId(String toNextDentryId) {
            this.putBodyParameter("ToNextDentryId", toNextDentryId);
            this.toNextDentryId = toNextDentryId;
            return this;
        }

        /**
         * ToParentDentryId.
         */
        public Builder toParentDentryId(String toParentDentryId) {
            this.putBodyParameter("ToParentDentryId", toParentDentryId);
            this.toParentDentryId = toParentDentryId;
            return this;
        }

        /**
         * ToPrevDentryId.
         */
        public Builder toPrevDentryId(String toPrevDentryId) {
            this.putBodyParameter("ToPrevDentryId", toPrevDentryId);
            this.toPrevDentryId = toPrevDentryId;
            return this;
        }

        @Override
        public CopyDentryRequest build() {
            return new CopyDentryRequest(this);
        } 

    } 

    /**
     * 
     * {@link CopyDentryRequest} extends {@link TeaModel}
     *
     * <p>CopyDentryRequest</p>
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
     * {@link CopyDentryRequest} extends {@link TeaModel}
     *
     * <p>CopyDentryRequest</p>
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
