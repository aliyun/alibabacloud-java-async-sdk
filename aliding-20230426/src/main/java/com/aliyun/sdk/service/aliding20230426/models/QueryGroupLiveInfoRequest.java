// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryGroupLiveInfoRequest} extends {@link RequestModel}
 *
 * <p>QueryGroupLiveInfoRequest</p>
 */
public class QueryGroupLiveInfoRequest extends Request {
    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("AccountContext")
    private AccountContext accountContext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AnchorUnionId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String anchorUnionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LiveUuid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String liveUuid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantContext")
    private TenantContext tenantContext;

    private QueryGroupLiveInfoRequest(Builder builder) {
        super(builder);
        this.accountContext = builder.accountContext;
        this.anchorUnionId = builder.anchorUnionId;
        this.liveUuid = builder.liveUuid;
        this.tenantContext = builder.tenantContext;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryGroupLiveInfoRequest create() {
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
     * @return anchorUnionId
     */
    public String getAnchorUnionId() {
        return this.anchorUnionId;
    }

    /**
     * @return liveUuid
     */
    public String getLiveUuid() {
        return this.liveUuid;
    }

    /**
     * @return tenantContext
     */
    public TenantContext getTenantContext() {
        return this.tenantContext;
    }

    public static final class Builder extends Request.Builder<QueryGroupLiveInfoRequest, Builder> {
        private AccountContext accountContext; 
        private String anchorUnionId; 
        private String liveUuid; 
        private TenantContext tenantContext; 

        private Builder() {
            super();
        } 

        private Builder(QueryGroupLiveInfoRequest request) {
            super(request);
            this.accountContext = request.accountContext;
            this.anchorUnionId = request.anchorUnionId;
            this.liveUuid = request.liveUuid;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>333d</p>
         */
        public Builder anchorUnionId(String anchorUnionId) {
            this.putBodyParameter("AnchorUnionId", anchorUnionId);
            this.anchorUnionId = anchorUnionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>4d38xxxxx</p>
         */
        public Builder liveUuid(String liveUuid) {
            this.putBodyParameter("LiveUuid", liveUuid);
            this.liveUuid = liveUuid;
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
        public QueryGroupLiveInfoRequest build() {
            return new QueryGroupLiveInfoRequest(this);
        } 

    } 

    /**
     * 
     * {@link QueryGroupLiveInfoRequest} extends {@link TeaModel}
     *
     * <p>QueryGroupLiveInfoRequest</p>
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
     * {@link QueryGroupLiveInfoRequest} extends {@link TeaModel}
     *
     * <p>QueryGroupLiveInfoRequest</p>
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
