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
 * {@link GetFileUploadInfoRequest} extends {@link RequestModel}
 *
 * <p>GetFileUploadInfoRequest</p>
 */
public class GetFileUploadInfoRequest extends Request {
    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("AccountContext")
    private AccountContext accountContext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Option")
    private Option option;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ParentDentryUuid")
    private String parentDentryUuid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Protocol")
    private String protocol;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantContext")
    private TenantContext tenantContext;

    private GetFileUploadInfoRequest(Builder builder) {
        super(builder);
        this.accountContext = builder.accountContext;
        this.option = builder.option;
        this.parentDentryUuid = builder.parentDentryUuid;
        this.protocol = builder.protocol;
        this.tenantContext = builder.tenantContext;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetFileUploadInfoRequest create() {
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
     * @return parentDentryUuid
     */
    public String getParentDentryUuid() {
        return this.parentDentryUuid;
    }

    /**
     * @return protocol
     */
    public String getProtocol() {
        return this.protocol;
    }

    /**
     * @return tenantContext
     */
    public TenantContext getTenantContext() {
        return this.tenantContext;
    }

    public static final class Builder extends Request.Builder<GetFileUploadInfoRequest, Builder> {
        private AccountContext accountContext; 
        private Option option; 
        private String parentDentryUuid; 
        private String protocol; 
        private TenantContext tenantContext; 

        private Builder() {
            super();
        } 

        private Builder(GetFileUploadInfoRequest request) {
            super(request);
            this.accountContext = request.accountContext;
            this.option = request.option;
            this.parentDentryUuid = request.parentDentryUuid;
            this.protocol = request.protocol;
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
         * Option.
         */
        public Builder option(Option option) {
            String optionShrink = shrink(option, "Option", "json");
            this.putBodyParameter("Option", optionShrink);
            this.option = option;
            return this;
        }

        /**
         * ParentDentryUuid.
         */
        public Builder parentDentryUuid(String parentDentryUuid) {
            this.putBodyParameter("ParentDentryUuid", parentDentryUuid);
            this.parentDentryUuid = parentDentryUuid;
            return this;
        }

        /**
         * Protocol.
         */
        public Builder protocol(String protocol) {
            this.putBodyParameter("Protocol", protocol);
            this.protocol = protocol;
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
        public GetFileUploadInfoRequest build() {
            return new GetFileUploadInfoRequest(this);
        } 

    } 

    /**
     * 
     * {@link GetFileUploadInfoRequest} extends {@link TeaModel}
     *
     * <p>GetFileUploadInfoRequest</p>
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
     * {@link GetFileUploadInfoRequest} extends {@link TeaModel}
     *
     * <p>GetFileUploadInfoRequest</p>
     */
    public static class PreCheckParam extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Long size;

        private PreCheckParam(Builder builder) {
            this.name = builder.name;
            this.size = builder.size;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PreCheckParam create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return size
         */
        public Long getSize() {
            return this.size;
        }

        public static final class Builder {
            private String name; 
            private Long size; 

            private Builder() {
            } 

            private Builder(PreCheckParam model) {
                this.name = model.name;
                this.size = model.size;
            } 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Size.
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            public PreCheckParam build() {
                return new PreCheckParam(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetFileUploadInfoRequest} extends {@link TeaModel}
     *
     * <p>GetFileUploadInfoRequest</p>
     */
    public static class Option extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PreCheckParam")
        private PreCheckParam preCheckParam;

        @com.aliyun.core.annotation.NameInMap("PreferIntranet")
        private Boolean preferIntranet;

        @com.aliyun.core.annotation.NameInMap("PreferRegion")
        private String preferRegion;

        @com.aliyun.core.annotation.NameInMap("StorageDriver")
        private String storageDriver;

        private Option(Builder builder) {
            this.preCheckParam = builder.preCheckParam;
            this.preferIntranet = builder.preferIntranet;
            this.preferRegion = builder.preferRegion;
            this.storageDriver = builder.storageDriver;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Option create() {
            return builder().build();
        }

        /**
         * @return preCheckParam
         */
        public PreCheckParam getPreCheckParam() {
            return this.preCheckParam;
        }

        /**
         * @return preferIntranet
         */
        public Boolean getPreferIntranet() {
            return this.preferIntranet;
        }

        /**
         * @return preferRegion
         */
        public String getPreferRegion() {
            return this.preferRegion;
        }

        /**
         * @return storageDriver
         */
        public String getStorageDriver() {
            return this.storageDriver;
        }

        public static final class Builder {
            private PreCheckParam preCheckParam; 
            private Boolean preferIntranet; 
            private String preferRegion; 
            private String storageDriver; 

            private Builder() {
            } 

            private Builder(Option model) {
                this.preCheckParam = model.preCheckParam;
                this.preferIntranet = model.preferIntranet;
                this.preferRegion = model.preferRegion;
                this.storageDriver = model.storageDriver;
            } 

            /**
             * PreCheckParam.
             */
            public Builder preCheckParam(PreCheckParam preCheckParam) {
                this.preCheckParam = preCheckParam;
                return this;
            }

            /**
             * PreferIntranet.
             */
            public Builder preferIntranet(Boolean preferIntranet) {
                this.preferIntranet = preferIntranet;
                return this;
            }

            /**
             * PreferRegion.
             */
            public Builder preferRegion(String preferRegion) {
                this.preferRegion = preferRegion;
                return this;
            }

            /**
             * StorageDriver.
             */
            public Builder storageDriver(String storageDriver) {
                this.storageDriver = storageDriver;
                return this;
            }

            public Option build() {
                return new Option(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetFileUploadInfoRequest} extends {@link TeaModel}
     *
     * <p>GetFileUploadInfoRequest</p>
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
