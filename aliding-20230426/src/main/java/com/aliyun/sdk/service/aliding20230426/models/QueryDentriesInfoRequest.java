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
 * {@link QueryDentriesInfoRequest} extends {@link RequestModel}
 *
 * <p>QueryDentriesInfoRequest</p>
 */
public class QueryDentriesInfoRequest extends Request {
    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("AccountContext")
    private AccountContext accountContext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppIdsForAppProperties")
    private java.util.List<String> appIdsForAppProperties;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DentryId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dentryId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SpaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String spaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantContext")
    private TenantContext tenantContext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UnionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String unionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WithThumbnail")
    private Boolean withThumbnail;

    private QueryDentriesInfoRequest(Builder builder) {
        super(builder);
        this.accountContext = builder.accountContext;
        this.appIdsForAppProperties = builder.appIdsForAppProperties;
        this.dentryId = builder.dentryId;
        this.spaceId = builder.spaceId;
        this.tenantContext = builder.tenantContext;
        this.unionId = builder.unionId;
        this.withThumbnail = builder.withThumbnail;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryDentriesInfoRequest create() {
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
     * @return appIdsForAppProperties
     */
    public java.util.List<String> getAppIdsForAppProperties() {
        return this.appIdsForAppProperties;
    }

    /**
     * @return dentryId
     */
    public String getDentryId() {
        return this.dentryId;
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

    /**
     * @return unionId
     */
    public String getUnionId() {
        return this.unionId;
    }

    /**
     * @return withThumbnail
     */
    public Boolean getWithThumbnail() {
        return this.withThumbnail;
    }

    public static final class Builder extends Request.Builder<QueryDentriesInfoRequest, Builder> {
        private AccountContext accountContext; 
        private java.util.List<String> appIdsForAppProperties; 
        private String dentryId; 
        private String spaceId; 
        private TenantContext tenantContext; 
        private String unionId; 
        private Boolean withThumbnail; 

        private Builder() {
            super();
        } 

        private Builder(QueryDentriesInfoRequest request) {
            super(request);
            this.accountContext = request.accountContext;
            this.appIdsForAppProperties = request.appIdsForAppProperties;
            this.dentryId = request.dentryId;
            this.spaceId = request.spaceId;
            this.tenantContext = request.tenantContext;
            this.unionId = request.unionId;
            this.withThumbnail = request.withThumbnail;
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
         * AppIdsForAppProperties.
         */
        public Builder appIdsForAppProperties(java.util.List<String> appIdsForAppProperties) {
            String appIdsForAppPropertiesShrink = shrink(appIdsForAppProperties, "AppIdsForAppProperties", "json");
            this.putBodyParameter("AppIdsForAppProperties", appIdsForAppPropertiesShrink);
            this.appIdsForAppProperties = appIdsForAppProperties;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>140901622636</p>
         */
        public Builder dentryId(String dentryId) {
            this.putBodyParameter("DentryId", dentryId);
            this.dentryId = dentryId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>22443475065</p>
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

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>urv3ZIAtcmmIgQzHq08YcAiEiE</p>
         */
        public Builder unionId(String unionId) {
            this.putBodyParameter("UnionId", unionId);
            this.unionId = unionId;
            return this;
        }

        /**
         * WithThumbnail.
         */
        public Builder withThumbnail(Boolean withThumbnail) {
            this.putBodyParameter("WithThumbnail", withThumbnail);
            this.withThumbnail = withThumbnail;
            return this;
        }

        @Override
        public QueryDentriesInfoRequest build() {
            return new QueryDentriesInfoRequest(this);
        } 

    } 

    /**
     * 
     * {@link QueryDentriesInfoRequest} extends {@link TeaModel}
     *
     * <p>QueryDentriesInfoRequest</p>
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
     * {@link QueryDentriesInfoRequest} extends {@link TeaModel}
     *
     * <p>QueryDentriesInfoRequest</p>
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
