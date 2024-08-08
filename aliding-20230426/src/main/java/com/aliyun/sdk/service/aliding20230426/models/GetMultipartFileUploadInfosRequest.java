// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aliding20230426.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMultipartFileUploadInfosRequest} extends {@link RequestModel}
 *
 * <p>GetMultipartFileUploadInfosRequest</p>
 */
public class GetMultipartFileUploadInfosRequest extends Request {
    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("AccountContext")
    private AccountContext accountContext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Option")
    private Option option;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PartNumbers")
    private java.util.List < Integer > partNumbers;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantContext")
    private TenantContext tenantContext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("UploadKey")
    private String uploadKey;

    private GetMultipartFileUploadInfosRequest(Builder builder) {
        super(builder);
        this.accountContext = builder.accountContext;
        this.option = builder.option;
        this.partNumbers = builder.partNumbers;
        this.tenantContext = builder.tenantContext;
        this.uploadKey = builder.uploadKey;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMultipartFileUploadInfosRequest create() {
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
     * @return partNumbers
     */
    public java.util.List < Integer > getPartNumbers() {
        return this.partNumbers;
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

    public static final class Builder extends Request.Builder<GetMultipartFileUploadInfosRequest, Builder> {
        private AccountContext accountContext; 
        private Option option; 
        private java.util.List < Integer > partNumbers; 
        private TenantContext tenantContext; 
        private String uploadKey; 

        private Builder() {
            super();
        } 

        private Builder(GetMultipartFileUploadInfosRequest request) {
            super(request);
            this.accountContext = request.accountContext;
            this.option = request.option;
            this.partNumbers = request.partNumbers;
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
         * Option.
         */
        public Builder option(Option option) {
            String optionShrink = shrink(option, "Option", "json");
            this.putBodyParameter("Option", optionShrink);
            this.option = option;
            return this;
        }

        /**
         * PartNumbers.
         */
        public Builder partNumbers(java.util.List < Integer > partNumbers) {
            String partNumbersShrink = shrink(partNumbers, "PartNumbers", "json");
            this.putBodyParameter("PartNumbers", partNumbersShrink);
            this.partNumbers = partNumbers;
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
        public GetMultipartFileUploadInfosRequest build() {
            return new GetMultipartFileUploadInfosRequest(this);
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
        @com.aliyun.core.annotation.NameInMap("PreferIntranet")
        private Boolean preferIntranet;

        private Option(Builder builder) {
            this.preferIntranet = builder.preferIntranet;
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

        public static final class Builder {
            private Boolean preferIntranet; 

            /**
             * PreferIntranet.
             */
            public Builder preferIntranet(Boolean preferIntranet) {
                this.preferIntranet = preferIntranet;
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
