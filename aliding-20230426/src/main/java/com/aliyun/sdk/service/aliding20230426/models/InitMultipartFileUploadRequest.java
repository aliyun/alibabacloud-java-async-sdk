// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link InitMultipartFileUploadRequest} extends {@link RequestModel}
 *
 * <p>InitMultipartFileUploadRequest</p>
 */
public class InitMultipartFileUploadRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("TenantContext")
    private TenantContext tenantContext;

    private InitMultipartFileUploadRequest(Builder builder) {
        super(builder);
        this.accountContext = builder.accountContext;
        this.option = builder.option;
        this.parentDentryUuid = builder.parentDentryUuid;
        this.tenantContext = builder.tenantContext;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InitMultipartFileUploadRequest create() {
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
     * @return tenantContext
     */
    public TenantContext getTenantContext() {
        return this.tenantContext;
    }

    public static final class Builder extends Request.Builder<InitMultipartFileUploadRequest, Builder> {
        private AccountContext accountContext; 
        private Option option; 
        private String parentDentryUuid; 
        private TenantContext tenantContext; 

        private Builder() {
            super();
        } 

        private Builder(InitMultipartFileUploadRequest request) {
            super(request);
            this.accountContext = request.accountContext;
            this.option = request.option;
            this.parentDentryUuid = request.parentDentryUuid;
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
         * TenantContext.
         */
        public Builder tenantContext(TenantContext tenantContext) {
            String tenantContextShrink = shrink(tenantContext, "TenantContext", "json");
            this.putBodyParameter("TenantContext", tenantContextShrink);
            this.tenantContext = tenantContext;
            return this;
        }

        @Override
        public InitMultipartFileUploadRequest build() {
            return new InitMultipartFileUploadRequest(this);
        } 

    } 

    /**
     * 
     * {@link InitMultipartFileUploadRequest} extends {@link TeaModel}
     *
     * <p>InitMultipartFileUploadRequest</p>
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
     * {@link InitMultipartFileUploadRequest} extends {@link TeaModel}
     *
     * <p>InitMultipartFileUploadRequest</p>
     */
    public static class PreCheckParam extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Md5")
        private String md5;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ParentId")
        private String parentId;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Long size;

        private PreCheckParam(Builder builder) {
            this.md5 = builder.md5;
            this.name = builder.name;
            this.parentId = builder.parentId;
            this.size = builder.size;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PreCheckParam create() {
            return builder().build();
        }

        /**
         * @return md5
         */
        public String getMd5() {
            return this.md5;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return parentId
         */
        public String getParentId() {
            return this.parentId;
        }

        /**
         * @return size
         */
        public Long getSize() {
            return this.size;
        }

        public static final class Builder {
            private String md5; 
            private String name; 
            private String parentId; 
            private Long size; 

            /**
             * Md5.
             */
            public Builder md5(String md5) {
                this.md5 = md5;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * ParentId.
             */
            public Builder parentId(String parentId) {
                this.parentId = parentId;
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
     * {@link InitMultipartFileUploadRequest} extends {@link TeaModel}
     *
     * <p>InitMultipartFileUploadRequest</p>
     */
    public static class Option extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PreCheckParam")
        private PreCheckParam preCheckParam;

        @com.aliyun.core.annotation.NameInMap("PreferRegion")
        private String preferRegion;

        @com.aliyun.core.annotation.NameInMap("StorageDriver")
        private String storageDriver;

        private Option(Builder builder) {
            this.preCheckParam = builder.preCheckParam;
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
            private String preferRegion; 
            private String storageDriver; 

            /**
             * PreCheckParam.
             */
            public Builder preCheckParam(PreCheckParam preCheckParam) {
                this.preCheckParam = preCheckParam;
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
     * {@link InitMultipartFileUploadRequest} extends {@link TeaModel}
     *
     * <p>InitMultipartFileUploadRequest</p>
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
