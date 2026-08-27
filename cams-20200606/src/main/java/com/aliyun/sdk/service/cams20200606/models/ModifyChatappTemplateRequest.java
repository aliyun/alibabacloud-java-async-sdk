// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

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
 * {@link ModifyChatappTemplateRequest} extends {@link RequestModel}
 *
 * <p>ModifyChatappTemplateRequest</p>
 */
public class ModifyChatappTemplateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Category")
    private String category;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CategoryChangePaused")
    private Boolean categoryChangePaused;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Components")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Components> components;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustSpaceId")
    private String custSpaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustWabaId")
    private String custWabaId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Example")
    private java.util.Map<String, String> example;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IsvCode")
    @Deprecated
    private String isvCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Language")
    @com.aliyun.core.annotation.Validation(required = true)
    private String language;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MessageSendTtlSeconds")
    private Integer messageSendTtlSeconds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductSetId")
    private String productSetId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateCode")
    private String templateCode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateName")
    private String templateName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateType")
    private String templateType;

    private ModifyChatappTemplateRequest(Builder builder) {
        super(builder);
        this.category = builder.category;
        this.categoryChangePaused = builder.categoryChangePaused;
        this.components = builder.components;
        this.custSpaceId = builder.custSpaceId;
        this.custWabaId = builder.custWabaId;
        this.example = builder.example;
        this.isvCode = builder.isvCode;
        this.language = builder.language;
        this.messageSendTtlSeconds = builder.messageSendTtlSeconds;
        this.productSetId = builder.productSetId;
        this.templateCode = builder.templateCode;
        this.templateName = builder.templateName;
        this.templateType = builder.templateType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyChatappTemplateRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return category
     */
    public String getCategory() {
        return this.category;
    }

    /**
     * @return categoryChangePaused
     */
    public Boolean getCategoryChangePaused() {
        return this.categoryChangePaused;
    }

    /**
     * @return components
     */
    public java.util.List<Components> getComponents() {
        return this.components;
    }

    /**
     * @return custSpaceId
     */
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    /**
     * @return custWabaId
     */
    public String getCustWabaId() {
        return this.custWabaId;
    }

    /**
     * @return example
     */
    public java.util.Map<String, String> getExample() {
        return this.example;
    }

    /**
     * @return isvCode
     */
    public String getIsvCode() {
        return this.isvCode;
    }

    /**
     * @return language
     */
    public String getLanguage() {
        return this.language;
    }

    /**
     * @return messageSendTtlSeconds
     */
    public Integer getMessageSendTtlSeconds() {
        return this.messageSendTtlSeconds;
    }

    /**
     * @return productSetId
     */
    public String getProductSetId() {
        return this.productSetId;
    }

    /**
     * @return templateCode
     */
    public String getTemplateCode() {
        return this.templateCode;
    }

    /**
     * @return templateName
     */
    public String getTemplateName() {
        return this.templateName;
    }

    /**
     * @return templateType
     */
    public String getTemplateType() {
        return this.templateType;
    }

    public static final class Builder extends Request.Builder<ModifyChatappTemplateRequest, Builder> {
        private String category; 
        private Boolean categoryChangePaused; 
        private java.util.List<Components> components; 
        private String custSpaceId; 
        private String custWabaId; 
        private java.util.Map<String, String> example; 
        private String isvCode; 
        private String language; 
        private Integer messageSendTtlSeconds; 
        private String productSetId; 
        private String templateCode; 
        private String templateName; 
        private String templateType; 

        private Builder() {
            super();
        } 

        private Builder(ModifyChatappTemplateRequest request) {
            super(request);
            this.category = request.category;
            this.categoryChangePaused = request.categoryChangePaused;
            this.components = request.components;
            this.custSpaceId = request.custSpaceId;
            this.custWabaId = request.custWabaId;
            this.example = request.example;
            this.isvCode = request.isvCode;
            this.language = request.language;
            this.messageSendTtlSeconds = request.messageSendTtlSeconds;
            this.productSetId = request.productSetId;
            this.templateCode = request.templateCode;
            this.templateName = request.templateName;
            this.templateType = request.templateType;
        } 

        /**
         * Category.
         */
        public Builder category(String category) {
            this.putQueryParameter("Category", category);
            this.category = category;
            return this;
        }

        /**
         * CategoryChangePaused.
         */
        public Builder categoryChangePaused(Boolean categoryChangePaused) {
            this.putQueryParameter("CategoryChangePaused", categoryChangePaused);
            this.categoryChangePaused = categoryChangePaused;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder components(java.util.List<Components> components) {
            String componentsShrink = shrink(components, "Components", "json");
            this.putQueryParameter("Components", componentsShrink);
            this.components = components;
            return this;
        }

        /**
         * CustSpaceId.
         */
        public Builder custSpaceId(String custSpaceId) {
            this.putQueryParameter("CustSpaceId", custSpaceId);
            this.custSpaceId = custSpaceId;
            return this;
        }

        /**
         * CustWabaId.
         */
        public Builder custWabaId(String custWabaId) {
            this.putQueryParameter("CustWabaId", custWabaId);
            this.custWabaId = custWabaId;
            return this;
        }

        /**
         * Example.
         */
        public Builder example(java.util.Map<String, String> example) {
            String exampleShrink = shrink(example, "Example", "json");
            this.putQueryParameter("Example", exampleShrink);
            this.example = example;
            return this;
        }

        /**
         * IsvCode.
         */
        public Builder isvCode(String isvCode) {
            this.putQueryParameter("IsvCode", isvCode);
            this.isvCode = isvCode;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>en</p>
         */
        public Builder language(String language) {
            this.putQueryParameter("Language", language);
            this.language = language;
            return this;
        }

        /**
         * MessageSendTtlSeconds.
         */
        public Builder messageSendTtlSeconds(Integer messageSendTtlSeconds) {
            this.putQueryParameter("MessageSendTtlSeconds", messageSendTtlSeconds);
            this.messageSendTtlSeconds = messageSendTtlSeconds;
            return this;
        }

        /**
         * ProductSetId.
         */
        public Builder productSetId(String productSetId) {
            this.putQueryParameter("ProductSetId", productSetId);
            this.productSetId = productSetId;
            return this;
        }

        /**
         * TemplateCode.
         */
        public Builder templateCode(String templateCode) {
            this.putQueryParameter("TemplateCode", templateCode);
            this.templateCode = templateCode;
            return this;
        }

        /**
         * TemplateName.
         */
        public Builder templateName(String templateName) {
            this.putQueryParameter("TemplateName", templateName);
            this.templateName = templateName;
            return this;
        }

        /**
         * TemplateType.
         */
        public Builder templateType(String templateType) {
            this.putQueryParameter("TemplateType", templateType);
            this.templateType = templateType;
            return this;
        }

        @Override
        public ModifyChatappTemplateRequest build() {
            return new ModifyChatappTemplateRequest(this);
        } 

    } 

    /**
     * 
     * {@link ModifyChatappTemplateRequest} extends {@link TeaModel}
     *
     * <p>ModifyChatappTemplateRequest</p>
     */
    public static class SupportedApps extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PackageName")
        private String packageName;

        @com.aliyun.core.annotation.NameInMap("SignatureHash")
        private String signatureHash;

        private SupportedApps(Builder builder) {
            this.packageName = builder.packageName;
            this.signatureHash = builder.signatureHash;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SupportedApps create() {
            return builder().build();
        }

        /**
         * @return packageName
         */
        public String getPackageName() {
            return this.packageName;
        }

        /**
         * @return signatureHash
         */
        public String getSignatureHash() {
            return this.signatureHash;
        }

        public static final class Builder {
            private String packageName; 
            private String signatureHash; 

            private Builder() {
            } 

            private Builder(SupportedApps model) {
                this.packageName = model.packageName;
                this.signatureHash = model.signatureHash;
            } 

            /**
             * PackageName.
             */
            public Builder packageName(String packageName) {
                this.packageName = packageName;
                return this;
            }

            /**
             * SignatureHash.
             */
            public Builder signatureHash(String signatureHash) {
                this.signatureHash = signatureHash;
                return this;
            }

            public SupportedApps build() {
                return new SupportedApps(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyChatappTemplateRequest} extends {@link TeaModel}
     *
     * <p>ModifyChatappTemplateRequest</p>
     */
    public static class Buttons extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutofillText")
        private String autofillText;

        @com.aliyun.core.annotation.NameInMap("CouponCode")
        private String couponCode;

        @com.aliyun.core.annotation.NameInMap("FlowAction")
        private String flowAction;

        @com.aliyun.core.annotation.NameInMap("FlowId")
        private String flowId;

        @com.aliyun.core.annotation.NameInMap("IsOptOut")
        private Boolean isOptOut;

        @com.aliyun.core.annotation.NameInMap("NavigateScreen")
        private String navigateScreen;

        @com.aliyun.core.annotation.NameInMap("PackageName")
        private String packageName;

        @com.aliyun.core.annotation.NameInMap("PhoneNumber")
        private String phoneNumber;

        @com.aliyun.core.annotation.NameInMap("SignatureHash")
        private String signatureHash;

        @com.aliyun.core.annotation.NameInMap("SupportedApps")
        private java.util.List<SupportedApps> supportedApps;

        @com.aliyun.core.annotation.NameInMap("Text")
        private String text;

        @com.aliyun.core.annotation.NameInMap("Type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        @com.aliyun.core.annotation.NameInMap("UrlType")
        private String urlType;

        private Buttons(Builder builder) {
            this.autofillText = builder.autofillText;
            this.couponCode = builder.couponCode;
            this.flowAction = builder.flowAction;
            this.flowId = builder.flowId;
            this.isOptOut = builder.isOptOut;
            this.navigateScreen = builder.navigateScreen;
            this.packageName = builder.packageName;
            this.phoneNumber = builder.phoneNumber;
            this.signatureHash = builder.signatureHash;
            this.supportedApps = builder.supportedApps;
            this.text = builder.text;
            this.type = builder.type;
            this.url = builder.url;
            this.urlType = builder.urlType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Buttons create() {
            return builder().build();
        }

        /**
         * @return autofillText
         */
        public String getAutofillText() {
            return this.autofillText;
        }

        /**
         * @return couponCode
         */
        public String getCouponCode() {
            return this.couponCode;
        }

        /**
         * @return flowAction
         */
        public String getFlowAction() {
            return this.flowAction;
        }

        /**
         * @return flowId
         */
        public String getFlowId() {
            return this.flowId;
        }

        /**
         * @return isOptOut
         */
        public Boolean getIsOptOut() {
            return this.isOptOut;
        }

        /**
         * @return navigateScreen
         */
        public String getNavigateScreen() {
            return this.navigateScreen;
        }

        /**
         * @return packageName
         */
        public String getPackageName() {
            return this.packageName;
        }

        /**
         * @return phoneNumber
         */
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        /**
         * @return signatureHash
         */
        public String getSignatureHash() {
            return this.signatureHash;
        }

        /**
         * @return supportedApps
         */
        public java.util.List<SupportedApps> getSupportedApps() {
            return this.supportedApps;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        /**
         * @return urlType
         */
        public String getUrlType() {
            return this.urlType;
        }

        public static final class Builder {
            private String autofillText; 
            private String couponCode; 
            private String flowAction; 
            private String flowId; 
            private Boolean isOptOut; 
            private String navigateScreen; 
            private String packageName; 
            private String phoneNumber; 
            private String signatureHash; 
            private java.util.List<SupportedApps> supportedApps; 
            private String text; 
            private String type; 
            private String url; 
            private String urlType; 

            private Builder() {
            } 

            private Builder(Buttons model) {
                this.autofillText = model.autofillText;
                this.couponCode = model.couponCode;
                this.flowAction = model.flowAction;
                this.flowId = model.flowId;
                this.isOptOut = model.isOptOut;
                this.navigateScreen = model.navigateScreen;
                this.packageName = model.packageName;
                this.phoneNumber = model.phoneNumber;
                this.signatureHash = model.signatureHash;
                this.supportedApps = model.supportedApps;
                this.text = model.text;
                this.type = model.type;
                this.url = model.url;
                this.urlType = model.urlType;
            } 

            /**
             * AutofillText.
             */
            public Builder autofillText(String autofillText) {
                this.autofillText = autofillText;
                return this;
            }

            /**
             * CouponCode.
             */
            public Builder couponCode(String couponCode) {
                this.couponCode = couponCode;
                return this;
            }

            /**
             * FlowAction.
             */
            public Builder flowAction(String flowAction) {
                this.flowAction = flowAction;
                return this;
            }

            /**
             * FlowId.
             */
            public Builder flowId(String flowId) {
                this.flowId = flowId;
                return this;
            }

            /**
             * IsOptOut.
             */
            public Builder isOptOut(Boolean isOptOut) {
                this.isOptOut = isOptOut;
                return this;
            }

            /**
             * NavigateScreen.
             */
            public Builder navigateScreen(String navigateScreen) {
                this.navigateScreen = navigateScreen;
                return this;
            }

            /**
             * PackageName.
             */
            public Builder packageName(String packageName) {
                this.packageName = packageName;
                return this;
            }

            /**
             * PhoneNumber.
             */
            public Builder phoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
                return this;
            }

            /**
             * SignatureHash.
             */
            public Builder signatureHash(String signatureHash) {
                this.signatureHash = signatureHash;
                return this;
            }

            /**
             * SupportedApps.
             */
            public Builder supportedApps(java.util.List<SupportedApps> supportedApps) {
                this.supportedApps = supportedApps;
                return this;
            }

            /**
             * Text.
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>URL</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            /**
             * UrlType.
             */
            public Builder urlType(String urlType) {
                this.urlType = urlType;
                return this;
            }

            public Buttons build() {
                return new Buttons(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyChatappTemplateRequest} extends {@link TeaModel}
     *
     * <p>ModifyChatappTemplateRequest</p>
     */
    public static class CardComponentsButtons extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PhoneNumber")
        private String phoneNumber;

        @com.aliyun.core.annotation.NameInMap("Text")
        private String text;

        @com.aliyun.core.annotation.NameInMap("Type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        @com.aliyun.core.annotation.NameInMap("UrlType")
        private String urlType;

        private CardComponentsButtons(Builder builder) {
            this.phoneNumber = builder.phoneNumber;
            this.text = builder.text;
            this.type = builder.type;
            this.url = builder.url;
            this.urlType = builder.urlType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CardComponentsButtons create() {
            return builder().build();
        }

        /**
         * @return phoneNumber
         */
        public String getPhoneNumber() {
            return this.phoneNumber;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        /**
         * @return urlType
         */
        public String getUrlType() {
            return this.urlType;
        }

        public static final class Builder {
            private String phoneNumber; 
            private String text; 
            private String type; 
            private String url; 
            private String urlType; 

            private Builder() {
            } 

            private Builder(CardComponentsButtons model) {
                this.phoneNumber = model.phoneNumber;
                this.text = model.text;
                this.type = model.type;
                this.url = model.url;
                this.urlType = model.urlType;
            } 

            /**
             * PhoneNumber.
             */
            public Builder phoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
                return this;
            }

            /**
             * Text.
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>URL</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            /**
             * UrlType.
             */
            public Builder urlType(String urlType) {
                this.urlType = urlType;
                return this;
            }

            public CardComponentsButtons build() {
                return new CardComponentsButtons(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyChatappTemplateRequest} extends {@link TeaModel}
     *
     * <p>ModifyChatappTemplateRequest</p>
     */
    public static class CardComponents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Buttons")
        private java.util.List<CardComponentsButtons> buttons;

        @com.aliyun.core.annotation.NameInMap("Format")
        private String format;

        @com.aliyun.core.annotation.NameInMap("Text")
        private String text;

        @com.aliyun.core.annotation.NameInMap("Type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private CardComponents(Builder builder) {
            this.buttons = builder.buttons;
            this.format = builder.format;
            this.text = builder.text;
            this.type = builder.type;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CardComponents create() {
            return builder().build();
        }

        /**
         * @return buttons
         */
        public java.util.List<CardComponentsButtons> getButtons() {
            return this.buttons;
        }

        /**
         * @return format
         */
        public String getFormat() {
            return this.format;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private java.util.List<CardComponentsButtons> buttons; 
            private String format; 
            private String text; 
            private String type; 
            private String url; 

            private Builder() {
            } 

            private Builder(CardComponents model) {
                this.buttons = model.buttons;
                this.format = model.format;
                this.text = model.text;
                this.type = model.type;
                this.url = model.url;
            } 

            /**
             * Buttons.
             */
            public Builder buttons(java.util.List<CardComponentsButtons> buttons) {
                this.buttons = buttons;
                return this;
            }

            /**
             * Format.
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            /**
             * Text.
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>HEADER</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public CardComponents build() {
                return new CardComponents(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyChatappTemplateRequest} extends {@link TeaModel}
     *
     * <p>ModifyChatappTemplateRequest</p>
     */
    public static class Cards extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CardComponents")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List<CardComponents> cardComponents;

        private Cards(Builder builder) {
            this.cardComponents = builder.cardComponents;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Cards create() {
            return builder().build();
        }

        /**
         * @return cardComponents
         */
        public java.util.List<CardComponents> getCardComponents() {
            return this.cardComponents;
        }

        public static final class Builder {
            private java.util.List<CardComponents> cardComponents; 

            private Builder() {
            } 

            private Builder(Cards model) {
                this.cardComponents = model.cardComponents;
            } 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder cardComponents(java.util.List<CardComponents> cardComponents) {
                this.cardComponents = cardComponents;
                return this;
            }

            public Cards build() {
                return new Cards(this);
            } 

        } 

    }
    /**
     * 
     * {@link ModifyChatappTemplateRequest} extends {@link TeaModel}
     *
     * <p>ModifyChatappTemplateRequest</p>
     */
    public static class Components extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AddSecretRecommendation")
        private Boolean addSecretRecommendation;

        @com.aliyun.core.annotation.NameInMap("Buttons")
        private java.util.List<Buttons> buttons;

        @com.aliyun.core.annotation.NameInMap("Caption")
        private String caption;

        @com.aliyun.core.annotation.NameInMap("Cards")
        private java.util.List<Cards> cards;

        @com.aliyun.core.annotation.NameInMap("CodeExpirationMinutes")
        @com.aliyun.core.annotation.Validation(maximum = 90, minimum = 1)
        private Integer codeExpirationMinutes;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private Integer duration;

        @com.aliyun.core.annotation.NameInMap("FileName")
        private String fileName;

        @com.aliyun.core.annotation.NameInMap("FileType")
        private String fileType;

        @com.aliyun.core.annotation.NameInMap("Format")
        private String format;

        @com.aliyun.core.annotation.NameInMap("HasExpiration")
        private Boolean hasExpiration;

        @com.aliyun.core.annotation.NameInMap("Text")
        private String text;

        @com.aliyun.core.annotation.NameInMap("ThumbUrl")
        private String thumbUrl;

        @com.aliyun.core.annotation.NameInMap("Type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private Components(Builder builder) {
            this.addSecretRecommendation = builder.addSecretRecommendation;
            this.buttons = builder.buttons;
            this.caption = builder.caption;
            this.cards = builder.cards;
            this.codeExpirationMinutes = builder.codeExpirationMinutes;
            this.duration = builder.duration;
            this.fileName = builder.fileName;
            this.fileType = builder.fileType;
            this.format = builder.format;
            this.hasExpiration = builder.hasExpiration;
            this.text = builder.text;
            this.thumbUrl = builder.thumbUrl;
            this.type = builder.type;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Components create() {
            return builder().build();
        }

        /**
         * @return addSecretRecommendation
         */
        public Boolean getAddSecretRecommendation() {
            return this.addSecretRecommendation;
        }

        /**
         * @return buttons
         */
        public java.util.List<Buttons> getButtons() {
            return this.buttons;
        }

        /**
         * @return caption
         */
        public String getCaption() {
            return this.caption;
        }

        /**
         * @return cards
         */
        public java.util.List<Cards> getCards() {
            return this.cards;
        }

        /**
         * @return codeExpirationMinutes
         */
        public Integer getCodeExpirationMinutes() {
            return this.codeExpirationMinutes;
        }

        /**
         * @return duration
         */
        public Integer getDuration() {
            return this.duration;
        }

        /**
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
        }

        /**
         * @return fileType
         */
        public String getFileType() {
            return this.fileType;
        }

        /**
         * @return format
         */
        public String getFormat() {
            return this.format;
        }

        /**
         * @return hasExpiration
         */
        public Boolean getHasExpiration() {
            return this.hasExpiration;
        }

        /**
         * @return text
         */
        public String getText() {
            return this.text;
        }

        /**
         * @return thumbUrl
         */
        public String getThumbUrl() {
            return this.thumbUrl;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private Boolean addSecretRecommendation; 
            private java.util.List<Buttons> buttons; 
            private String caption; 
            private java.util.List<Cards> cards; 
            private Integer codeExpirationMinutes; 
            private Integer duration; 
            private String fileName; 
            private String fileType; 
            private String format; 
            private Boolean hasExpiration; 
            private String text; 
            private String thumbUrl; 
            private String type; 
            private String url; 

            private Builder() {
            } 

            private Builder(Components model) {
                this.addSecretRecommendation = model.addSecretRecommendation;
                this.buttons = model.buttons;
                this.caption = model.caption;
                this.cards = model.cards;
                this.codeExpirationMinutes = model.codeExpirationMinutes;
                this.duration = model.duration;
                this.fileName = model.fileName;
                this.fileType = model.fileType;
                this.format = model.format;
                this.hasExpiration = model.hasExpiration;
                this.text = model.text;
                this.thumbUrl = model.thumbUrl;
                this.type = model.type;
                this.url = model.url;
            } 

            /**
             * AddSecretRecommendation.
             */
            public Builder addSecretRecommendation(Boolean addSecretRecommendation) {
                this.addSecretRecommendation = addSecretRecommendation;
                return this;
            }

            /**
             * Buttons.
             */
            public Builder buttons(java.util.List<Buttons> buttons) {
                this.buttons = buttons;
                return this;
            }

            /**
             * Caption.
             */
            public Builder caption(String caption) {
                this.caption = caption;
                return this;
            }

            /**
             * Cards.
             */
            public Builder cards(java.util.List<Cards> cards) {
                this.cards = cards;
                return this;
            }

            /**
             * CodeExpirationMinutes.
             */
            public Builder codeExpirationMinutes(Integer codeExpirationMinutes) {
                this.codeExpirationMinutes = codeExpirationMinutes;
                return this;
            }

            /**
             * Duration.
             */
            public Builder duration(Integer duration) {
                this.duration = duration;
                return this;
            }

            /**
             * FileName.
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * FileType.
             */
            public Builder fileType(String fileType) {
                this.fileType = fileType;
                return this;
            }

            /**
             * Format.
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            /**
             * HasExpiration.
             */
            public Builder hasExpiration(Boolean hasExpiration) {
                this.hasExpiration = hasExpiration;
                return this;
            }

            /**
             * Text.
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            /**
             * ThumbUrl.
             */
            public Builder thumbUrl(String thumbUrl) {
                this.thumbUrl = thumbUrl;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>HEADER</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public Components build() {
                return new Components(this);
            } 

        } 

    }
}
