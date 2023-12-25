// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link WearOrgHonorRequest} extends {@link RequestModel}
 *
 * <p>WearOrgHonorRequest</p>
 */
public class WearOrgHonorRequest extends Request {
    @Header
    @NameInMap("AccountContext")
    private AccountContext accountContext;

    @Body
    @NameInMap("TenantContext")
    private TenantContext tenantContext;

    @Body
    @NameInMap("honorId")
    @Validation(required = true)
    private String honorId;

    @Body
    @NameInMap("orgId")
    @Validation(required = true)
    private Long orgId;

    @Body
    @NameInMap("userId")
    @Validation(required = true)
    private String userId;

    @Body
    @NameInMap("wear")
    @Validation(required = true)
    private Boolean wear;

    private WearOrgHonorRequest(Builder builder) {
        super(builder);
        this.accountContext = builder.accountContext;
        this.tenantContext = builder.tenantContext;
        this.honorId = builder.honorId;
        this.orgId = builder.orgId;
        this.userId = builder.userId;
        this.wear = builder.wear;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static WearOrgHonorRequest create() {
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
     * @return tenantContext
     */
    public TenantContext getTenantContext() {
        return this.tenantContext;
    }

    /**
     * @return honorId
     */
    public String getHonorId() {
        return this.honorId;
    }

    /**
     * @return orgId
     */
    public Long getOrgId() {
        return this.orgId;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return wear
     */
    public Boolean getWear() {
        return this.wear;
    }

    public static final class Builder extends Request.Builder<WearOrgHonorRequest, Builder> {
        private AccountContext accountContext; 
        private TenantContext tenantContext; 
        private String honorId; 
        private Long orgId; 
        private String userId; 
        private Boolean wear; 

        private Builder() {
            super();
        } 

        private Builder(WearOrgHonorRequest request) {
            super(request);
            this.accountContext = request.accountContext;
            this.tenantContext = request.tenantContext;
            this.honorId = request.honorId;
            this.orgId = request.orgId;
            this.userId = request.userId;
            this.wear = request.wear;
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
         * TenantContext.
         */
        public Builder tenantContext(TenantContext tenantContext) {
            String tenantContextShrink = shrink(tenantContext, "TenantContext", "json");
            this.putBodyParameter("TenantContext", tenantContextShrink);
            this.tenantContext = tenantContext;
            return this;
        }

        /**
         * honorId.
         */
        public Builder honorId(String honorId) {
            this.putBodyParameter("honorId", honorId);
            this.honorId = honorId;
            return this;
        }

        /**
         * orgId.
         */
        public Builder orgId(Long orgId) {
            this.putBodyParameter("orgId", orgId);
            this.orgId = orgId;
            return this;
        }

        /**
         * userId.
         */
        public Builder userId(String userId) {
            this.putBodyParameter("userId", userId);
            this.userId = userId;
            return this;
        }

        /**
         * wear.
         */
        public Builder wear(Boolean wear) {
            this.putBodyParameter("wear", wear);
            this.wear = wear;
            return this;
        }

        @Override
        public WearOrgHonorRequest build() {
            return new WearOrgHonorRequest(this);
        } 

    } 

    public static class AccountContext extends TeaModel {
        @NameInMap("accountId")
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
