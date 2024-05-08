// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetNodeByUrlRequest} extends {@link RequestModel}
 *
 * <p>GetNodeByUrlRequest</p>
 */
public class GetNodeByUrlRequest extends Request {
    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("AccountContext")
    private AccountContext accountContext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Option")
    private Option option;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantContext")
    private TenantContext tenantContext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Url")
    @com.aliyun.core.annotation.Validation(required = true)
    private String url;

    private GetNodeByUrlRequest(Builder builder) {
        super(builder);
        this.accountContext = builder.accountContext;
        this.option = builder.option;
        this.tenantContext = builder.tenantContext;
        this.url = builder.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetNodeByUrlRequest create() {
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
     * @return option
     */
    public Option getOption() {
        return this.option;
    }

    /**
     * @return tenantContext
     */
    public TenantContext getTenantContext() {
        return this.tenantContext;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    public static final class Builder extends Request.Builder<GetNodeByUrlRequest, Builder> {
        private AccountContext accountContext; 
        private Option option; 
        private TenantContext tenantContext; 
        private String url; 

        private Builder() {
            super();
        } 

        private Builder(GetNodeByUrlRequest request) {
            super(request);
            this.accountContext = request.accountContext;
            this.option = request.option;
            this.tenantContext = request.tenantContext;
            this.url = request.url;
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
         * Option.
         */
        public Builder option(Option option) {
            String optionShrink = shrink(option, "Option", "json");
            this.putBodyParameter("Option", optionShrink);
            this.option = option;
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
         * Url.
         */
        public Builder url(String url) {
            this.putBodyParameter("Url", url);
            this.url = url;
            return this;
        }

        @Override
        public GetNodeByUrlRequest build() {
            return new GetNodeByUrlRequest(this);
        } 

    } 

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
    public static class Option extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("WithPermissionRole")
        private Boolean withPermissionRole;

        @com.aliyun.core.annotation.NameInMap("WithStatisticalInfo")
        private Boolean withStatisticalInfo;

        private Option(Builder builder) {
            this.withPermissionRole = builder.withPermissionRole;
            this.withStatisticalInfo = builder.withStatisticalInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Option create() {
            return builder().build();
        }

        /**
         * @return withPermissionRole
         */
        public Boolean getWithPermissionRole() {
            return this.withPermissionRole;
        }

        /**
         * @return withStatisticalInfo
         */
        public Boolean getWithStatisticalInfo() {
            return this.withStatisticalInfo;
        }

        public static final class Builder {
            private Boolean withPermissionRole; 
            private Boolean withStatisticalInfo; 

            /**
             * WithPermissionRole.
             */
            public Builder withPermissionRole(Boolean withPermissionRole) {
                this.withPermissionRole = withPermissionRole;
                return this;
            }

            /**
             * WithStatisticalInfo.
             */
            public Builder withStatisticalInfo(Boolean withStatisticalInfo) {
                this.withStatisticalInfo = withStatisticalInfo;
                return this;
            }

            public Option build() {
                return new Option(this);
            } 

        } 

    }
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
