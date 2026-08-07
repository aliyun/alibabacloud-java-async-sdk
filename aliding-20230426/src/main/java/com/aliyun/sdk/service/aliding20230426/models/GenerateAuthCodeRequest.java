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
 * {@link GenerateAuthCodeRequest} extends {@link RequestModel}
 *
 * <p>GenerateAuthCodeRequest</p>
 */
public class GenerateAuthCodeRequest extends Request {
    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("AccountContext")
    private AccountContext accountContext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("BucAppName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String bucAppName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SsoTicket")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ssoTicket;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantContext")
    private TenantContext tenantContext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ValidRedirectUri")
    @com.aliyun.core.annotation.Validation(required = true)
    private String validRedirectUri;

    private GenerateAuthCodeRequest(Builder builder) {
        super(builder);
        this.accountContext = builder.accountContext;
        this.bucAppName = builder.bucAppName;
        this.ssoTicket = builder.ssoTicket;
        this.tenantContext = builder.tenantContext;
        this.validRedirectUri = builder.validRedirectUri;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GenerateAuthCodeRequest create() {
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
     * @return bucAppName
     */
    public String getBucAppName() {
        return this.bucAppName;
    }

    /**
     * @return ssoTicket
     */
    public String getSsoTicket() {
        return this.ssoTicket;
    }

    /**
     * @return tenantContext
     */
    public TenantContext getTenantContext() {
        return this.tenantContext;
    }

    /**
     * @return validRedirectUri
     */
    public String getValidRedirectUri() {
        return this.validRedirectUri;
    }

    public static final class Builder extends Request.Builder<GenerateAuthCodeRequest, Builder> {
        private AccountContext accountContext; 
        private String bucAppName; 
        private String ssoTicket; 
        private TenantContext tenantContext; 
        private String validRedirectUri; 

        private Builder() {
            super();
        } 

        private Builder(GenerateAuthCodeRequest request) {
            super(request);
            this.accountContext = request.accountContext;
            this.bucAppName = request.bucAppName;
            this.ssoTicket = request.ssoTicket;
            this.tenantContext = request.tenantContext;
            this.validRedirectUri = request.validRedirectUri;
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
         * <p>ali-qwenwork</p>
         */
        public Builder bucAppName(String bucAppName) {
            this.putBodyParameter("BucAppName", bucAppName);
            this.bucAppName = bucAppName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>placeholder-sso-ticket</p>
         */
        public Builder ssoTicket(String ssoTicket) {
            this.putBodyParameter("SsoTicket", ssoTicket);
            this.ssoTicket = ssoTicket;
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
         * <p><a href="https://example.com/oauth/callback">https://example.com/oauth/callback</a></p>
         */
        public Builder validRedirectUri(String validRedirectUri) {
            this.putBodyParameter("ValidRedirectUri", validRedirectUri);
            this.validRedirectUri = validRedirectUri;
            return this;
        }

        @Override
        public GenerateAuthCodeRequest build() {
            return new GenerateAuthCodeRequest(this);
        } 

    } 

    /**
     * 
     * {@link GenerateAuthCodeRequest} extends {@link TeaModel}
     *
     * <p>GenerateAuthCodeRequest</p>
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
     * {@link GenerateAuthCodeRequest} extends {@link TeaModel}
     *
     * <p>GenerateAuthCodeRequest</p>
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
