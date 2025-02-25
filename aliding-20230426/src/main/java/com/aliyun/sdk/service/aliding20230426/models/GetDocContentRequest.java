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
 * {@link GetDocContentRequest} extends {@link RequestModel}
 *
 * <p>GetDocContentRequest</p>
 */
public class GetDocContentRequest extends Request {
    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("AccountContext")
    private AccountContext accountContext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DentryUuid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dentryUuid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TargetFormat")
    private String targetFormat;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantContext")
    private TenantContext tenantContext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("userToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userToken;

    private GetDocContentRequest(Builder builder) {
        super(builder);
        this.accountContext = builder.accountContext;
        this.dentryUuid = builder.dentryUuid;
        this.targetFormat = builder.targetFormat;
        this.tenantContext = builder.tenantContext;
        this.userToken = builder.userToken;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetDocContentRequest create() {
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
     * @return targetFormat
     */
    public String getTargetFormat() {
        return this.targetFormat;
    }

    /**
     * @return tenantContext
     */
    public TenantContext getTenantContext() {
        return this.tenantContext;
    }

    /**
     * @return userToken
     */
    public String getUserToken() {
        return this.userToken;
    }

    public static final class Builder extends Request.Builder<GetDocContentRequest, Builder> {
        private AccountContext accountContext; 
        private String dentryUuid; 
        private String targetFormat; 
        private TenantContext tenantContext; 
        private String userToken; 

        private Builder() {
            super();
        } 

        private Builder(GetDocContentRequest request) {
            super(request);
            this.accountContext = request.accountContext;
            this.dentryUuid = request.dentryUuid;
            this.targetFormat = request.targetFormat;
            this.tenantContext = request.tenantContext;
            this.userToken = request.userToken;
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
         * <p>dentry_uuid</p>
         */
        public Builder dentryUuid(String dentryUuid) {
            this.putBodyParameter("DentryUuid", dentryUuid);
            this.dentryUuid = dentryUuid;
            return this;
        }

        /**
         * TargetFormat.
         */
        public Builder targetFormat(String targetFormat) {
            this.putBodyParameter("TargetFormat", targetFormat);
            this.targetFormat = targetFormat;
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
         */
        public Builder userToken(String userToken) {
            this.putBodyParameter("userToken", userToken);
            this.userToken = userToken;
            return this;
        }

        @Override
        public GetDocContentRequest build() {
            return new GetDocContentRequest(this);
        } 

    } 

    /**
     * 
     * {@link GetDocContentRequest} extends {@link TeaModel}
     *
     * <p>GetDocContentRequest</p>
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
             * <p>ba3a9b612345678d8fedf544ef69d19e</p>
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
     * {@link GetDocContentRequest} extends {@link TeaModel}
     *
     * <p>GetDocContentRequest</p>
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
