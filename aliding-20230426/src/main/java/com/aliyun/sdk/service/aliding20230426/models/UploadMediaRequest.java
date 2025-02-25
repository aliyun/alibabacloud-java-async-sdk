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
 * {@link UploadMediaRequest} extends {@link RequestModel}
 *
 * <p>UploadMediaRequest</p>
 */
public class UploadMediaRequest extends Request {
    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("AccountContext")
    private AccountContext accountContext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantContext")
    private TenantContext tenantContext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("mediaName")
    private String mediaName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("mediaType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String mediaType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("orgId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long orgId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("url")
    @com.aliyun.core.annotation.Validation(required = true)
    private String url;

    private UploadMediaRequest(Builder builder) {
        super(builder);
        this.accountContext = builder.accountContext;
        this.tenantContext = builder.tenantContext;
        this.mediaName = builder.mediaName;
        this.mediaType = builder.mediaType;
        this.orgId = builder.orgId;
        this.url = builder.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UploadMediaRequest create() {
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
     * @return mediaName
     */
    public String getMediaName() {
        return this.mediaName;
    }

    /**
     * @return mediaType
     */
    public String getMediaType() {
        return this.mediaType;
    }

    /**
     * @return orgId
     */
    public Long getOrgId() {
        return this.orgId;
    }

    /**
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    public static final class Builder extends Request.Builder<UploadMediaRequest, Builder> {
        private AccountContext accountContext; 
        private TenantContext tenantContext; 
        private String mediaName; 
        private String mediaType; 
        private Long orgId; 
        private String url; 

        private Builder() {
            super();
        } 

        private Builder(UploadMediaRequest request) {
            super(request);
            this.accountContext = request.accountContext;
            this.tenantContext = request.tenantContext;
            this.mediaName = request.mediaName;
            this.mediaType = request.mediaType;
            this.orgId = request.orgId;
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
         * TenantContext.
         */
        public Builder tenantContext(TenantContext tenantContext) {
            String tenantContextShrink = shrink(tenantContext, "TenantContext", "json");
            this.putBodyParameter("TenantContext", tenantContextShrink);
            this.tenantContext = tenantContext;
            return this;
        }

        /**
         * mediaName.
         */
        public Builder mediaName(String mediaName) {
            this.putBodyParameter("mediaName", mediaName);
            this.mediaName = mediaName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>image</p>
         */
        public Builder mediaType(String mediaType) {
            this.putBodyParameter("mediaType", mediaType);
            this.mediaType = mediaType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567</p>
         */
        public Builder orgId(Long orgId) {
            this.putBodyParameter("orgId", orgId);
            this.orgId = orgId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://alicdn.com/xxx.jpg">https://alicdn.com/xxx.jpg</a></p>
         */
        public Builder url(String url) {
            this.putBodyParameter("url", url);
            this.url = url;
            return this;
        }

        @Override
        public UploadMediaRequest build() {
            return new UploadMediaRequest(this);
        } 

    } 

    /**
     * 
     * {@link UploadMediaRequest} extends {@link TeaModel}
     *
     * <p>UploadMediaRequest</p>
     */
    public static class AccountContext extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("accountId")
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
    /**
     * 
     * {@link UploadMediaRequest} extends {@link TeaModel}
     *
     * <p>UploadMediaRequest</p>
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
