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
 * {@link BatchGetUserIdByOpenDingtalkIdRequest} extends {@link RequestModel}
 *
 * <p>BatchGetUserIdByOpenDingtalkIdRequest</p>
 */
public class BatchGetUserIdByOpenDingtalkIdRequest extends Request {
    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("AccountContext")
    private AccountContext accountContext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantContext")
    private TenantContext tenantContext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("openDingtalkIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> openDingtalkIds;

    private BatchGetUserIdByOpenDingtalkIdRequest(Builder builder) {
        super(builder);
        this.accountContext = builder.accountContext;
        this.tenantContext = builder.tenantContext;
        this.openDingtalkIds = builder.openDingtalkIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchGetUserIdByOpenDingtalkIdRequest create() {
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
     * @return openDingtalkIds
     */
    public java.util.List<String> getOpenDingtalkIds() {
        return this.openDingtalkIds;
    }

    public static final class Builder extends Request.Builder<BatchGetUserIdByOpenDingtalkIdRequest, Builder> {
        private AccountContext accountContext; 
        private TenantContext tenantContext; 
        private java.util.List<String> openDingtalkIds; 

        private Builder() {
            super();
        } 

        private Builder(BatchGetUserIdByOpenDingtalkIdRequest request) {
            super(request);
            this.accountContext = request.accountContext;
            this.tenantContext = request.tenantContext;
            this.openDingtalkIds = request.openDingtalkIds;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;DTOJdYJ2IQC4HuexhtjsS8Qxxxx&quot;,&quot;D8301AKf6lmZbXiilcB4P2MVxxxx&quot;]</p>
         */
        public Builder openDingtalkIds(java.util.List<String> openDingtalkIds) {
            String openDingtalkIdsShrink = shrink(openDingtalkIds, "openDingtalkIds", "json");
            this.putBodyParameter("openDingtalkIds", openDingtalkIdsShrink);
            this.openDingtalkIds = openDingtalkIds;
            return this;
        }

        @Override
        public BatchGetUserIdByOpenDingtalkIdRequest build() {
            return new BatchGetUserIdByOpenDingtalkIdRequest(this);
        } 

    } 

    /**
     * 
     * {@link BatchGetUserIdByOpenDingtalkIdRequest} extends {@link TeaModel}
     *
     * <p>BatchGetUserIdByOpenDingtalkIdRequest</p>
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
     * {@link BatchGetUserIdByOpenDingtalkIdRequest} extends {@link TeaModel}
     *
     * <p>BatchGetUserIdByOpenDingtalkIdRequest</p>
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
