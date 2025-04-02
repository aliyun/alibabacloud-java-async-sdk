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
 * {@link CommitFileRequest} extends {@link RequestModel}
 *
 * <p>CommitFileRequest</p>
 */
public class CommitFileRequest extends Request {
    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("AccountContext")
    private AccountContext accountContext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Option")
    private Option option;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ParentDentryUuid")
    private String parentDentryUuid;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantContext")
    private TenantContext tenantContext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UploadKey")
    private String uploadKey;

    private CommitFileRequest(Builder builder) {
        super(builder);
        this.accountContext = builder.accountContext;
        this.name = builder.name;
        this.option = builder.option;
        this.parentDentryUuid = builder.parentDentryUuid;
        this.tenantContext = builder.tenantContext;
        this.uploadKey = builder.uploadKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CommitFileRequest create() {
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
     * @return name
     */
    public String getName() {
        return this.name;
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

    /**
     * @return uploadKey
     */
    public String getUploadKey() {
        return this.uploadKey;
    }

    public static final class Builder extends Request.Builder<CommitFileRequest, Builder> {
        private AccountContext accountContext; 
        private String name; 
        private Option option; 
        private String parentDentryUuid; 
        private TenantContext tenantContext; 
        private String uploadKey; 

        private Builder() {
            super();
        } 

        private Builder(CommitFileRequest request) {
            super(request);
            this.accountContext = request.accountContext;
            this.name = request.name;
            this.option = request.option;
            this.parentDentryUuid = request.parentDentryUuid;
            this.tenantContext = request.tenantContext;
            this.uploadKey = request.uploadKey;
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
         * Name.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
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

        /**
         * UploadKey.
         */
        public Builder uploadKey(String uploadKey) {
            this.putBodyParameter("UploadKey", uploadKey);
            this.uploadKey = uploadKey;
            return this;
        }

        @Override
        public CommitFileRequest build() {
            return new CommitFileRequest(this);
        } 

    } 

    /**
     * 
     * {@link CommitFileRequest} extends {@link TeaModel}
     *
     * <p>CommitFileRequest</p>
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
     * {@link CommitFileRequest} extends {@link TeaModel}
     *
     * <p>CommitFileRequest</p>
     */
    public static class AppProperties extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        @com.aliyun.core.annotation.NameInMap("Visibility")
        private String visibility;

        private AppProperties(Builder builder) {
            this.name = builder.name;
            this.value = builder.value;
            this.visibility = builder.visibility;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AppProperties create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        /**
         * @return visibility
         */
        public String getVisibility() {
            return this.visibility;
        }

        public static final class Builder {
            private String name; 
            private String value; 
            private String visibility; 

            private Builder() {
            } 

            private Builder(AppProperties model) {
                this.name = model.name;
                this.value = model.value;
                this.visibility = model.visibility;
            } 

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            /**
             * Visibility.
             */
            public Builder visibility(String visibility) {
                this.visibility = visibility;
                return this;
            }

            public AppProperties build() {
                return new AppProperties(this);
            } 

        } 

    }
    /**
     * 
     * {@link CommitFileRequest} extends {@link TeaModel}
     *
     * <p>CommitFileRequest</p>
     */
    public static class Option extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AppProperties")
        private java.util.List<AppProperties> appProperties;

        @com.aliyun.core.annotation.NameInMap("ConflictStrategy")
        private String conflictStrategy;

        @com.aliyun.core.annotation.NameInMap("ConvertToOnlineDoc")
        private Boolean convertToOnlineDoc;

        @com.aliyun.core.annotation.NameInMap("ConvertToOnlineDocTargetDocumentType")
        private String convertToOnlineDocTargetDocumentType;

        @com.aliyun.core.annotation.NameInMap("Size")
        private Long size;

        private Option(Builder builder) {
            this.appProperties = builder.appProperties;
            this.conflictStrategy = builder.conflictStrategy;
            this.convertToOnlineDoc = builder.convertToOnlineDoc;
            this.convertToOnlineDocTargetDocumentType = builder.convertToOnlineDocTargetDocumentType;
            this.size = builder.size;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Option create() {
            return builder().build();
        }

        /**
         * @return appProperties
         */
        public java.util.List<AppProperties> getAppProperties() {
            return this.appProperties;
        }

        /**
         * @return conflictStrategy
         */
        public String getConflictStrategy() {
            return this.conflictStrategy;
        }

        /**
         * @return convertToOnlineDoc
         */
        public Boolean getConvertToOnlineDoc() {
            return this.convertToOnlineDoc;
        }

        /**
         * @return convertToOnlineDocTargetDocumentType
         */
        public String getConvertToOnlineDocTargetDocumentType() {
            return this.convertToOnlineDocTargetDocumentType;
        }

        /**
         * @return size
         */
        public Long getSize() {
            return this.size;
        }

        public static final class Builder {
            private java.util.List<AppProperties> appProperties; 
            private String conflictStrategy; 
            private Boolean convertToOnlineDoc; 
            private String convertToOnlineDocTargetDocumentType; 
            private Long size; 

            private Builder() {
            } 

            private Builder(Option model) {
                this.appProperties = model.appProperties;
                this.conflictStrategy = model.conflictStrategy;
                this.convertToOnlineDoc = model.convertToOnlineDoc;
                this.convertToOnlineDocTargetDocumentType = model.convertToOnlineDocTargetDocumentType;
                this.size = model.size;
            } 

            /**
             * AppProperties.
             */
            public Builder appProperties(java.util.List<AppProperties> appProperties) {
                this.appProperties = appProperties;
                return this;
            }

            /**
             * ConflictStrategy.
             */
            public Builder conflictStrategy(String conflictStrategy) {
                this.conflictStrategy = conflictStrategy;
                return this;
            }

            /**
             * ConvertToOnlineDoc.
             */
            public Builder convertToOnlineDoc(Boolean convertToOnlineDoc) {
                this.convertToOnlineDoc = convertToOnlineDoc;
                return this;
            }

            /**
             * ConvertToOnlineDocTargetDocumentType.
             */
            public Builder convertToOnlineDocTargetDocumentType(String convertToOnlineDocTargetDocumentType) {
                this.convertToOnlineDocTargetDocumentType = convertToOnlineDocTargetDocumentType;
                return this;
            }

            /**
             * Size.
             */
            public Builder size(Long size) {
                this.size = size;
                return this;
            }

            public Option build() {
                return new Option(this);
            } 

        } 

    }
    /**
     * 
     * {@link CommitFileRequest} extends {@link TeaModel}
     *
     * <p>CommitFileRequest</p>
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
