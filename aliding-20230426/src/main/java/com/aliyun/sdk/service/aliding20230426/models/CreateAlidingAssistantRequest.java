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
 * {@link CreateAlidingAssistantRequest} extends {@link RequestModel}
 *
 * <p>CreateAlidingAssistantRequest</p>
 */
public class CreateAlidingAssistantRequest extends Request {
    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("AccountContext")
    private AccountContext accountContext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AppCode")
    private String appCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    @com.aliyun.core.annotation.Validation(required = true)
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Ext")
    private java.util.Map<String, String> ext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Icon")
    @com.aliyun.core.annotation.Validation(required = true)
    private String icon;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Instructions")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instructions;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RecommendPrompts")
    private java.util.List<String> recommendPrompts;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Source")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer source;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SourceIdentityId")
    private String sourceIdentityId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantContext")
    private TenantContext tenantContext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WelcomeContent")
    @com.aliyun.core.annotation.Validation(required = true)
    private String welcomeContent;

    private CreateAlidingAssistantRequest(Builder builder) {
        super(builder);
        this.accountContext = builder.accountContext;
        this.appCode = builder.appCode;
        this.description = builder.description;
        this.ext = builder.ext;
        this.icon = builder.icon;
        this.instructions = builder.instructions;
        this.name = builder.name;
        this.recommendPrompts = builder.recommendPrompts;
        this.source = builder.source;
        this.sourceIdentityId = builder.sourceIdentityId;
        this.tenantContext = builder.tenantContext;
        this.welcomeContent = builder.welcomeContent;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAlidingAssistantRequest create() {
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
     * @return appCode
     */
    public String getAppCode() {
        return this.appCode;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return ext
     */
    public java.util.Map<String, String> getExt() {
        return this.ext;
    }

    /**
     * @return icon
     */
    public String getIcon() {
        return this.icon;
    }

    /**
     * @return instructions
     */
    public String getInstructions() {
        return this.instructions;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return recommendPrompts
     */
    public java.util.List<String> getRecommendPrompts() {
        return this.recommendPrompts;
    }

    /**
     * @return source
     */
    public Integer getSource() {
        return this.source;
    }

    /**
     * @return sourceIdentityId
     */
    public String getSourceIdentityId() {
        return this.sourceIdentityId;
    }

    /**
     * @return tenantContext
     */
    public TenantContext getTenantContext() {
        return this.tenantContext;
    }

    /**
     * @return welcomeContent
     */
    public String getWelcomeContent() {
        return this.welcomeContent;
    }

    public static final class Builder extends Request.Builder<CreateAlidingAssistantRequest, Builder> {
        private AccountContext accountContext; 
        private String appCode; 
        private String description; 
        private java.util.Map<String, String> ext; 
        private String icon; 
        private String instructions; 
        private String name; 
        private java.util.List<String> recommendPrompts; 
        private Integer source; 
        private String sourceIdentityId; 
        private TenantContext tenantContext; 
        private String welcomeContent; 

        private Builder() {
            super();
        } 

        private Builder(CreateAlidingAssistantRequest request) {
            super(request);
            this.accountContext = request.accountContext;
            this.appCode = request.appCode;
            this.description = request.description;
            this.ext = request.ext;
            this.icon = request.icon;
            this.instructions = request.instructions;
            this.name = request.name;
            this.recommendPrompts = request.recommendPrompts;
            this.source = request.source;
            this.sourceIdentityId = request.sourceIdentityId;
            this.tenantContext = request.tenantContext;
            this.welcomeContent = request.welcomeContent;
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
         * AppCode.
         */
        public Builder appCode(String appCode) {
            this.putBodyParameter("AppCode", appCode);
            this.appCode = appCode;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * Ext.
         */
        public Builder ext(java.util.Map<String, String> ext) {
            String extShrink = shrink(ext, "Ext", "json");
            this.putBodyParameter("Ext", extShrink);
            this.ext = ext;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>@lADPDetfgMsFFUvNAkjNAkg</p>
         */
        public Builder icon(String icon) {
            this.putBodyParameter("Icon", icon);
            this.icon = icon;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder instructions(String instructions) {
            this.putBodyParameter("Instructions", instructions);
            this.instructions = instructions;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * RecommendPrompts.
         */
        public Builder recommendPrompts(java.util.List<String> recommendPrompts) {
            String recommendPromptsShrink = shrink(recommendPrompts, "RecommendPrompts", "json");
            this.putBodyParameter("RecommendPrompts", recommendPromptsShrink);
            this.recommendPrompts = recommendPrompts;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        public Builder source(Integer source) {
            this.putBodyParameter("Source", source);
            this.source = source;
            return this;
        }

        /**
         * SourceIdentityId.
         */
        public Builder sourceIdentityId(String sourceIdentityId) {
            this.putBodyParameter("SourceIdentityId", sourceIdentityId);
            this.sourceIdentityId = sourceIdentityId;
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
         */
        public Builder welcomeContent(String welcomeContent) {
            this.putBodyParameter("WelcomeContent", welcomeContent);
            this.welcomeContent = welcomeContent;
            return this;
        }

        @Override
        public CreateAlidingAssistantRequest build() {
            return new CreateAlidingAssistantRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateAlidingAssistantRequest} extends {@link TeaModel}
     *
     * <p>CreateAlidingAssistantRequest</p>
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
     * {@link CreateAlidingAssistantRequest} extends {@link TeaModel}
     *
     * <p>CreateAlidingAssistantRequest</p>
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
