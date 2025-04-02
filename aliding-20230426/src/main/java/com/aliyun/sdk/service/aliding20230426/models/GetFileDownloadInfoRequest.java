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
 * {@link GetFileDownloadInfoRequest} extends {@link RequestModel}
 *
 * <p>GetFileDownloadInfoRequest</p>
 */
public class GetFileDownloadInfoRequest extends Request {
    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("AccountContext")
    private AccountContext accountContext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DentryId")
    private String dentryId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Option")
    private Option option;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SpaceId")
    private String spaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantContext")
    private TenantContext tenantContext;

    private GetFileDownloadInfoRequest(Builder builder) {
        super(builder);
        this.accountContext = builder.accountContext;
        this.dentryId = builder.dentryId;
        this.option = builder.option;
        this.spaceId = builder.spaceId;
        this.tenantContext = builder.tenantContext;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFileDownloadInfoRequest create() {
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
     * @return option
     */
    public Option getOption() {
        return this.option;
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

    public static final class Builder extends Request.Builder<GetFileDownloadInfoRequest, Builder> {
        private AccountContext accountContext; 
        private String dentryId; 
        private Option option; 
        private String spaceId; 
        private TenantContext tenantContext; 

        private Builder() {
            super();
        } 

        private Builder(GetFileDownloadInfoRequest request) {
            super(request);
            this.accountContext = request.accountContext;
            this.dentryId = request.dentryId;
            this.option = request.option;
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
         * Option.
         */
        public Builder option(Option option) {
            String optionShrink = shrink(option, "Option", "json");
            this.putBodyParameter("Option", optionShrink);
            this.option = option;
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
        public GetFileDownloadInfoRequest build() {
            return new GetFileDownloadInfoRequest(this);
        } 

    } 

    /**
     * 
     * {@link GetFileDownloadInfoRequest} extends {@link TeaModel}
     *
     * <p>GetFileDownloadInfoRequest</p>
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
     * {@link GetFileDownloadInfoRequest} extends {@link TeaModel}
     *
     * <p>GetFileDownloadInfoRequest</p>
     */
    public static class Option extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PreferIntranet")
        private Boolean preferIntranet;

        @com.aliyun.core.annotation.NameInMap("Version")
        private Long version;

        private Option(Builder builder) {
            this.preferIntranet = builder.preferIntranet;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Option create() {
            return builder().build();
        }

        /**
         * @return preferIntranet
         */
        public Boolean getPreferIntranet() {
            return this.preferIntranet;
        }

        /**
         * @return version
         */
        public Long getVersion() {
            return this.version;
        }

        public static final class Builder {
            private Boolean preferIntranet; 
            private Long version; 

            private Builder() {
            } 

            private Builder(Option model) {
                this.preferIntranet = model.preferIntranet;
                this.version = model.version;
            } 

            /**
             * PreferIntranet.
             */
            public Builder preferIntranet(Boolean preferIntranet) {
                this.preferIntranet = preferIntranet;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(Long version) {
                this.version = version;
                return this;
            }

            public Option build() {
                return new Option(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetFileDownloadInfoRequest} extends {@link TeaModel}
     *
     * <p>GetFileDownloadInfoRequest</p>
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
