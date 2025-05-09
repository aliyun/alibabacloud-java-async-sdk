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
 * {@link CreateOrgHonorTemplateRequest} extends {@link RequestModel}
 *
 * <p>CreateOrgHonorTemplateRequest</p>
 */
public class CreateOrgHonorTemplateRequest extends Request {
    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("AccountContext")
    private AccountContext accountContext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantContext")
    private TenantContext tenantContext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("avatarFrameMediaId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String avatarFrameMediaId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("defaultBgColor")
    @com.aliyun.core.annotation.Validation(required = true)
    private String defaultBgColor;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("medalDesc")
    @com.aliyun.core.annotation.Validation(required = true)
    private String medalDesc;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("medalMediaId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String medalMediaId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("medalName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String medalName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("orgId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long orgId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("userId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String userId;

    private CreateOrgHonorTemplateRequest(Builder builder) {
        super(builder);
        this.accountContext = builder.accountContext;
        this.tenantContext = builder.tenantContext;
        this.avatarFrameMediaId = builder.avatarFrameMediaId;
        this.defaultBgColor = builder.defaultBgColor;
        this.medalDesc = builder.medalDesc;
        this.medalMediaId = builder.medalMediaId;
        this.medalName = builder.medalName;
        this.orgId = builder.orgId;
        this.userId = builder.userId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOrgHonorTemplateRequest create() {
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
     * @return avatarFrameMediaId
     */
    public String getAvatarFrameMediaId() {
        return this.avatarFrameMediaId;
    }

    /**
     * @return defaultBgColor
     */
    public String getDefaultBgColor() {
        return this.defaultBgColor;
    }

    /**
     * @return medalDesc
     */
    public String getMedalDesc() {
        return this.medalDesc;
    }

    /**
     * @return medalMediaId
     */
    public String getMedalMediaId() {
        return this.medalMediaId;
    }

    /**
     * @return medalName
     */
    public String getMedalName() {
        return this.medalName;
    }

    /**
     * @return orgId
     */
    public Long getOrgId() {
        return this.orgId;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    public static final class Builder extends Request.Builder<CreateOrgHonorTemplateRequest, Builder> {
        private AccountContext accountContext; 
        private TenantContext tenantContext; 
        private String avatarFrameMediaId; 
        private String defaultBgColor; 
        private String medalDesc; 
        private String medalMediaId; 
        private String medalName; 
        private Long orgId; 
        private String userId; 

        private Builder() {
            super();
        } 

        private Builder(CreateOrgHonorTemplateRequest request) {
            super(request);
            this.accountContext = request.accountContext;
            this.tenantContext = request.tenantContext;
            this.avatarFrameMediaId = request.avatarFrameMediaId;
            this.defaultBgColor = request.defaultBgColor;
            this.medalDesc = request.medalDesc;
            this.medalMediaId = request.medalMediaId;
            this.medalName = request.medalName;
            this.orgId = request.orgId;
            this.userId = request.userId;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>fsdfasdjf132342d</p>
         */
        public Builder avatarFrameMediaId(String avatarFrameMediaId) {
            this.putBodyParameter("avatarFrameMediaId", avatarFrameMediaId);
            this.avatarFrameMediaId = avatarFrameMediaId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>#FFFBB4</p>
         */
        public Builder defaultBgColor(String defaultBgColor) {
            this.putBodyParameter("defaultBgColor", defaultBgColor);
            this.defaultBgColor = defaultBgColor;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder medalDesc(String medalDesc) {
            this.putBodyParameter("medalDesc", medalDesc);
            this.medalDesc = medalDesc;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1273adf23</p>
         */
        public Builder medalMediaId(String medalMediaId) {
            this.putBodyParameter("medalMediaId", medalMediaId);
            this.medalMediaId = medalMediaId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder medalName(String medalName) {
            this.putBodyParameter("medalName", medalName);
            this.medalName = medalName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
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
         * <p>363784</p>
         */
        public Builder userId(String userId) {
            this.putBodyParameter("userId", userId);
            this.userId = userId;
            return this;
        }

        @Override
        public CreateOrgHonorTemplateRequest build() {
            return new CreateOrgHonorTemplateRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateOrgHonorTemplateRequest} extends {@link TeaModel}
     *
     * <p>CreateOrgHonorTemplateRequest</p>
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

            private Builder() {
            } 

            private Builder(AccountContext model) {
                this.accountId = model.accountId;
            } 

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
     * {@link CreateOrgHonorTemplateRequest} extends {@link TeaModel}
     *
     * <p>CreateOrgHonorTemplateRequest</p>
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
