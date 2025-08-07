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
 * {@link UpdateAlidingAssistantRequest} extends {@link RequestModel}
 *
 * <p>UpdateAlidingAssistantRequest</p>
 */
public class UpdateAlidingAssistantRequest extends Request {
    @com.aliyun.core.annotation.Header
    @com.aliyun.core.annotation.NameInMap("AccountContext")
    private AccountContext accountContext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AssistantId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String assistantId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Ext")
    private java.util.Map<String, String> ext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FallbackContent")
    private String fallbackContent;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Feature")
    private java.util.Map<String, String> feature;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Icon")
    private String icon;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Instructions")
    private String instructions;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RecommendPrompts")
    private java.util.List<String> recommendPrompts;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TenantContext")
    private TenantContext tenantContext;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WelcomeContent")
    private String welcomeContent;

    private UpdateAlidingAssistantRequest(Builder builder) {
        super(builder);
        this.accountContext = builder.accountContext;
        this.assistantId = builder.assistantId;
        this.description = builder.description;
        this.ext = builder.ext;
        this.fallbackContent = builder.fallbackContent;
        this.feature = builder.feature;
        this.icon = builder.icon;
        this.instructions = builder.instructions;
        this.name = builder.name;
        this.recommendPrompts = builder.recommendPrompts;
        this.tenantContext = builder.tenantContext;
        this.welcomeContent = builder.welcomeContent;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAlidingAssistantRequest create() {
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
     * @return assistantId
     */
    public String getAssistantId() {
        return this.assistantId;
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
     * @return fallbackContent
     */
    public String getFallbackContent() {
        return this.fallbackContent;
    }

    /**
     * @return feature
     */
    public java.util.Map<String, String> getFeature() {
        return this.feature;
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

    public static final class Builder extends Request.Builder<UpdateAlidingAssistantRequest, Builder> {
        private AccountContext accountContext; 
        private String assistantId; 
        private String description; 
        private java.util.Map<String, String> ext; 
        private String fallbackContent; 
        private java.util.Map<String, String> feature; 
        private String icon; 
        private String instructions; 
        private String name; 
        private java.util.List<String> recommendPrompts; 
        private TenantContext tenantContext; 
        private String welcomeContent; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAlidingAssistantRequest request) {
            super(request);
            this.accountContext = request.accountContext;
            this.assistantId = request.assistantId;
            this.description = request.description;
            this.ext = request.ext;
            this.fallbackContent = request.fallbackContent;
            this.feature = request.feature;
            this.icon = request.icon;
            this.instructions = request.instructions;
            this.name = request.name;
            this.recommendPrompts = request.recommendPrompts;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        public Builder assistantId(String assistantId) {
            this.putBodyParameter("AssistantId", assistantId);
            this.assistantId = assistantId;
            return this;
        }

        /**
         * Description.
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
         * FallbackContent.
         */
        public Builder fallbackContent(String fallbackContent) {
            this.putBodyParameter("FallbackContent", fallbackContent);
            this.fallbackContent = fallbackContent;
            return this;
        }

        /**
         * Feature.
         */
        public Builder feature(java.util.Map<String, String> feature) {
            String featureShrink = shrink(feature, "Feature", "json");
            this.putBodyParameter("Feature", featureShrink);
            this.feature = feature;
            return this;
        }

        /**
         * Icon.
         */
        public Builder icon(String icon) {
            this.putBodyParameter("Icon", icon);
            this.icon = icon;
            return this;
        }

        /**
         * Instructions.
         */
        public Builder instructions(String instructions) {
            this.putBodyParameter("Instructions", instructions);
            this.instructions = instructions;
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
         * RecommendPrompts.
         */
        public Builder recommendPrompts(java.util.List<String> recommendPrompts) {
            String recommendPromptsShrink = shrink(recommendPrompts, "RecommendPrompts", "json");
            this.putBodyParameter("RecommendPrompts", recommendPromptsShrink);
            this.recommendPrompts = recommendPrompts;
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
         * WelcomeContent.
         */
        public Builder welcomeContent(String welcomeContent) {
            this.putBodyParameter("WelcomeContent", welcomeContent);
            this.welcomeContent = welcomeContent;
            return this;
        }

        @Override
        public UpdateAlidingAssistantRequest build() {
            return new UpdateAlidingAssistantRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateAlidingAssistantRequest} extends {@link TeaModel}
     *
     * <p>UpdateAlidingAssistantRequest</p>
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
     * {@link UpdateAlidingAssistantRequest} extends {@link TeaModel}
     *
     * <p>UpdateAlidingAssistantRequest</p>
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
