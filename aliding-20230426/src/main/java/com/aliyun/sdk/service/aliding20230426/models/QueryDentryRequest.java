// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryDentryRequest} extends {@link RequestModel}
 *
 * <p>QueryDentryRequest</p>
 */
public class QueryDentryRequest extends Request {
    @Header
    @NameInMap("AccountContext")
    private AccountContext accountContext;

    @Body
    @NameInMap("DentryId")
    @Validation(required = true)
    private String dentryId;

    @Body
    @NameInMap("IncludeSpace")
    private Boolean includeSpace;

    @Body
    @NameInMap("SpaceId")
    @Validation(required = true)
    private String spaceId;

    @Body
    @NameInMap("TenantContext")
    private TenantContext tenantContext;

    private QueryDentryRequest(Builder builder) {
        super(builder);
        this.accountContext = builder.accountContext;
        this.dentryId = builder.dentryId;
        this.includeSpace = builder.includeSpace;
        this.spaceId = builder.spaceId;
        this.tenantContext = builder.tenantContext;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDentryRequest create() {
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
     * @return includeSpace
     */
    public Boolean getIncludeSpace() {
        return this.includeSpace;
    }

    /**
     * @return spaceId
     */
    public String getSpaceId() {
        return this.spaceId;
    }

    /**
     * @return tenantContext
     */
    public TenantContext getTenantContext() {
        return this.tenantContext;
    }

    public static final class Builder extends Request.Builder<QueryDentryRequest, Builder> {
        private AccountContext accountContext; 
        private String dentryId; 
        private Boolean includeSpace; 
        private String spaceId; 
        private TenantContext tenantContext; 

        private Builder() {
            super();
        } 

        private Builder(QueryDentryRequest request) {
            super(request);
            this.accountContext = request.accountContext;
            this.dentryId = request.dentryId;
            this.includeSpace = request.includeSpace;
            this.spaceId = request.spaceId;
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
         * DentryId.
         */
        public Builder dentryId(String dentryId) {
            this.putBodyParameter("DentryId", dentryId);
            this.dentryId = dentryId;
            return this;
        }

        /**
         * IncludeSpace.
         */
        public Builder includeSpace(Boolean includeSpace) {
            this.putBodyParameter("IncludeSpace", includeSpace);
            this.includeSpace = includeSpace;
            return this;
        }

        /**
         * SpaceId.
         */
        public Builder spaceId(String spaceId) {
            this.putBodyParameter("SpaceId", spaceId);
            this.spaceId = spaceId;
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
        public QueryDentryRequest build() {
            return new QueryDentryRequest(this);
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
