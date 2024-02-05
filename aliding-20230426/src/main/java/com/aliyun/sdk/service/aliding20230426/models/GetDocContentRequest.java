// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDocContentRequest} extends {@link RequestModel}
 *
 * <p>GetDocContentRequest</p>
 */
public class GetDocContentRequest extends Request {
    @Header
    @NameInMap("AccountContext")
    private AccountContext accountContext;

    @Body
    @NameInMap("DentryUuid")
    @Validation(required = true)
    private String dentryUuid;

    @Body
    @NameInMap("TargetFormat")
    private String targetFormat;

    @Body
    @NameInMap("TenantContext")
    private TenantContext tenantContext;

    private GetDocContentRequest(Builder builder) {
        super(builder);
        this.accountContext = builder.accountContext;
        this.dentryUuid = builder.dentryUuid;
        this.targetFormat = builder.targetFormat;
        this.tenantContext = builder.tenantContext;
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

    public static final class Builder extends Request.Builder<GetDocContentRequest, Builder> {
        private AccountContext accountContext; 
        private String dentryUuid; 
        private String targetFormat; 
        private TenantContext tenantContext; 

        private Builder() {
            super();
        } 

        private Builder(GetDocContentRequest request) {
            super(request);
            this.accountContext = request.accountContext;
            this.dentryUuid = request.dentryUuid;
            this.targetFormat = request.targetFormat;
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

        @Override
        public GetDocContentRequest build() {
            return new GetDocContentRequest(this);
        } 

    } 

    public static class AccountContext extends TeaModel {
        @NameInMap("userToken")
        private String userToken;

        private AccountContext(Builder builder) {
            this.userToken = builder.userToken;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AccountContext create() {
            return builder().build();
        }

        /**
         * @return userToken
         */
        public String getUserToken() {
            return this.userToken;
        }

        public static final class Builder {
            private String userToken; 

            /**
             * userToken.
             */
            public Builder userToken(String userToken) {
                this.userToken = userToken;
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
