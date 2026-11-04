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
 * {@link CreateChatappTemplateRequest} extends {@link RequestModel}
 *
 * <p>CreateChatappTemplateRequest</p>
 */
public class CreateChatappTemplateRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AllowCategoryChange")
    private Boolean allowCategoryChange;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Category")
    @com.aliyun.core.annotation.Validation(required = true)
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
    @Deprecated
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
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ProductSetId")
    private String productSetId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TemplateType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateType;

    private CreateChatappTemplateRequest(Builder builder) {
        super(builder);
        this.allowCategoryChange = builder.allowCategoryChange;
        this.category = builder.category;
        this.categoryChangePaused = builder.categoryChangePaused;
        this.components = builder.components;
        this.custSpaceId = builder.custSpaceId;
        this.custWabaId = builder.custWabaId;
        this.example = builder.example;
        this.isvCode = builder.isvCode;
        this.language = builder.language;
        this.messageSendTtlSeconds = builder.messageSendTtlSeconds;
        this.name = builder.name;
        this.productSetId = builder.productSetId;
        this.templateType = builder.templateType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateChatappTemplateRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return allowCategoryChange
     */
    public Boolean getAllowCategoryChange() {
        return this.allowCategoryChange;
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
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return productSetId
     */
    public String getProductSetId() {
        return this.productSetId;
    }

    /**
     * @return templateType
     */
    public String getTemplateType() {
        return this.templateType;
    }

    public static final class Builder extends Request.Builder<CreateChatappTemplateRequest, Builder> {
        private Boolean allowCategoryChange; 
        private String category; 
        private Boolean categoryChangePaused; 
        private java.util.List<Components> components; 
        private String custSpaceId; 
        private String custWabaId; 
        private java.util.Map<String, String> example; 
        private String isvCode; 
        private String language; 
        private Integer messageSendTtlSeconds; 
        private String name; 
        private String productSetId; 
        private String templateType; 

        private Builder() {
            super();
        } 

        private Builder(CreateChatappTemplateRequest request) {
            super(request);
            this.allowCategoryChange = request.allowCategoryChange;
            this.category = request.category;
            this.categoryChangePaused = request.categoryChangePaused;
            this.components = request.components;
            this.custSpaceId = request.custSpaceId;
            this.custWabaId = request.custWabaId;
            this.example = request.example;
            this.isvCode = request.isvCode;
            this.language = request.language;
            this.messageSendTtlSeconds = request.messageSendTtlSeconds;
            this.name = request.name;
            this.productSetId = request.productSetId;
            this.templateType = request.templateType;
        } 

        /**
         * <p>Specifies whether to allow Facebook to automatically change the category of the template to improve the approval rate. This property is valid only when TemplateType is set to WHATSAPP.</p>
         * <blockquote>
         * <p>Notice: <strong>[Deprecated]</strong> WhatsApp no longer supports this property.</notice></p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder allowCategoryChange(Boolean allowCategoryChange) {
            this.putQueryParameter("AllowCategoryChange", allowCategoryChange);
            this.allowCategoryChange = allowCategoryChange;
            return this;
        }

        /**
         * <p>WhatsApp template categories:</p>
         * <ul>
         * <li><p><strong>UTILITY</strong>: Transaction-related.</p>
         * </li>
         * <li><p><strong>MARKETING</strong>: Marketing templates.</p>
         * </li>
         * <li><p><strong>AUTHENTICATION</strong>: Authenticate identity.</p>
         * </li>
         * </ul>
         * <p>Viber template categories:</p>
         * <ul>
         * <li><p><strong>UTILITY</strong>: Transaction-related.</p>
         * </li>
         * <li><p><strong>MARKETING</strong>: Marketing templates.</p>
         * </li>
         * <li><p><strong>AUTHENTICATION</strong>: Authenticate identity.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>UTILITY</p>
         */
        public Builder category(String category) {
            this.putQueryParameter("Category", category);
            this.category = category;
            return this;
        }

        /**
         * <p>Specifies whether to pause sending the template when a utility template is changed to a marketing template. This property is valid only for WhatsApp templates.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        public Builder categoryChangePaused(Boolean categoryChangePaused) {
            this.putQueryParameter("CategoryChangePaused", categoryChangePaused);
            this.categoryChangePaused = categoryChangePaused;
            return this;
        }

        /**
         * <p>The list of message template components.</p>
         * <blockquote>
         * <p>When Category is set to AUTHENTICATION, Components cannot contain nodes with Type set to HEADER. Additionally, when Type is set to BODY or FOOTER, the Text content must be empty.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         */
        public Builder components(java.util.List<Components> components) {
            String componentsShrink = shrink(components, "Components", "json");
            this.putQueryParameter("Components", componentsShrink);
            this.components = components;
            return this;
        }

        /**
         * <p>The SpaceId of the ISV sub-customer or the instance ID of the direct customer.</p>
         * 
         * <strong>example:</strong>
         * <p>293483938849493</p>
         */
        public Builder custSpaceId(String custSpaceId) {
            this.putQueryParameter("CustSpaceId", custSpaceId);
            this.custSpaceId = custSpaceId;
            return this;
        }

        /**
         * <p>The WabaId of the ISV customer.</p>
         * <blockquote>
         * <p><strong>[Deprecated]</strong> Use CustSpaceId instead.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>65921621816****</p>
         */
        public Builder custWabaId(String custWabaId) {
            this.putQueryParameter("CustWabaId", custWabaId);
            this.custWabaId = custWabaId;
            return this;
        }

        /**
         * <p>The example for creating a template.</p>
         * 
         * <strong>example:</strong>
         * <p>hello_whatsapp</p>
         */
        public Builder example(java.util.Map<String, String> example) {
            String exampleShrink = shrink(example, "Example", "json");
            this.putQueryParameter("Example", exampleShrink);
            this.example = example;
            return this;
        }

        /**
         * <p>The ISV verification code used to verify whether the RAM user is authorized by the ISV.</p>
         * 
         * <strong>example:</strong>
         * <p>skdi3kksloslikdkkdk</p>
         */
        public Builder isvCode(String isvCode) {
            this.putQueryParameter("IsvCode", isvCode);
            this.isvCode = isvCode;
            return this;
        }

        /**
         * <p>The template language. For detailed language codes, see <a href="https://help.aliyun.com/document_detail/463420.html">Language codes</a>.</p>
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
         * <p>The validity period for sending template messages in WhatsApp.</p>
         * <ul>
         * <li>AUTHENTICATION: 30 to 900. </li>
         * <li>UTILITY: 30 to 43200.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        public Builder messageSendTtlSeconds(Integer messageSendTtlSeconds) {
            this.putQueryParameter("MessageSendTtlSeconds", messageSendTtlSeconds);
            this.messageSendTtlSeconds = messageSendTtlSeconds;
            return this;
        }

        /**
         * <p>The template name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>hello_whatsapp</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>productSetId</p>
         * 
         * <strong>example:</strong>
         * <p>9928**</p>
         */
        public Builder productSetId(String productSetId) {
            this.putQueryParameter("ProductSetId", productSetId);
            this.productSetId = productSetId;
            return this;
        }

        /**
         * <p>The templatetype.</p>
         * <ul>
         * <li><p><strong>WHATSAPP</strong></p>
         * </li>
         * <li><p><strong>VIBER</strong></p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>WHATSAPP</p>
         */
        public Builder templateType(String templateType) {
            this.putQueryParameter("TemplateType", templateType);
            this.templateType = templateType;
            return this;
        }

        @Override
        public CreateChatappTemplateRequest build() {
            return new CreateChatappTemplateRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateChatappTemplateRequest} extends {@link TeaModel}
     *
     * <p>CreateChatappTemplateRequest</p>
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
             * <p>The package name of the app invoked by WhatsApp. This parameter is required for WhatsApp templates where Category is set to AUTHENTICATION and Button Type is set to ONE_TAP or ZERO_TAP.</p>
             * 
             * <strong>example:</strong>
             * <p>com.kuaidian.waimaistaff</p>
             */
            public Builder packageName(String packageName) {
                this.packageName = packageName;
                return this;
            }

            /**
             * <p>The signature hash value of the app invoked by WhatsApp. This parameter is required for WhatsApp templates where Category is set to AUTHENTICATION and Button Type is set to ONE_TAP or ZERO_TAP.</p>
             * 
             * <strong>example:</strong>
             * <p>ieid83kdiek</p>
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
     * {@link CreateChatappTemplateRequest} extends {@link TeaModel}
     *
     * <p>CreateChatappTemplateRequest</p>
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

        @com.aliyun.core.annotation.NameInMap("TtlMinutes")
        private Long ttlMinutes;

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
            this.ttlMinutes = builder.ttlMinutes;
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
         * @return ttlMinutes
         */
        public Long getTtlMinutes() {
            return this.ttlMinutes;
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
            private Long ttlMinutes; 
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
                this.ttlMinutes = model.ttlMinutes;
                this.type = model.type;
                this.url = model.url;
                this.urlType = model.urlType;
            } 

            /**
             * <p>The button text for the WhatsApp autofill operation. This parameter is required for WhatsApp templates where Category is set to AUTHENTICATION and Button Type is set to ONE_TAP or ZERO_TAP.</p>
             * 
             * <strong>example:</strong>
             * <p>Autofill</p>
             */
            public Builder autofillText(String autofillText) {
                this.autofillText = autofillText;
                return this;
            }

            /**
             * <p>The coupon code value. Only letters and digits are supported. You can pass a variable such as $(couponCode) and specify the actual coupon code when sending the message.</p>
             * 
             * <strong>example:</strong>
             * <p>120293</p>
             */
            public Builder couponCode(String couponCode) {
                this.couponCode = couponCode;
                return this;
            }

            /**
             * <p>The flow data event type. Valid values:</p>
             * <ul>
             * <li><p>DATA_EXCHANGE: data exchange.</p>
             * </li>
             * <li><p>NAVIGATE: navigation.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>NAVIGATE</p>
             */
            public Builder flowAction(String flowAction) {
                this.flowAction = flowAction;
                return this;
            }

            /**
             * <p>The flow ID.</p>
             * 
             * <strong>example:</strong>
             * <p>479884093605****</p>
             */
            public Builder flowId(String flowId) {
                this.flowId = flowId;
                return this;
            }

            /**
             * <p>Specifies whether the button is a marketing opt-out button. If a customer clicks this button and send control operations are configured on the Chat App Message Service platform, subsequent marketing messages will not be sent to the customer. This parameter is valid only for WhatsApp templates where Category is set to Marketing and Button Type is set to QUICK_REPLY.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isOptOut(Boolean isOptOut) {
                this.isOptOut = isOptOut;
                return this;
            }

            /**
             * <p>The navigation screen. This parameter is required when FlowAction is set to NAVIGATE.</p>
             * 
             * <strong>example:</strong>
             * <p>DETAILS</p>
             */
            public Builder navigateScreen(String navigateScreen) {
                this.navigateScreen = navigateScreen;
                return this;
            }

            /**
             * <p>Use the properties under SupportedApps.</p>
             * 
             * <strong>example:</strong>
             * <p>com.demo</p>
             */
            public Builder packageName(String packageName) {
                this.packageName = packageName;
                return this;
            }

            /**
             * <p>The phone number. This parameter is valid only when the button type is <strong>PHONE_NUMBER</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>+861368897****</p>
             */
            public Builder phoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
                return this;
            }

            /**
             * <p>Use the properties under SupportedApps.</p>
             * 
             * <strong>example:</strong>
             * <p>wi299382</p>
             */
            public Builder signatureHash(String signatureHash) {
                this.signatureHash = signatureHash;
                return this;
            }

            /**
             * <p>The list of supported apps.</p>
             */
            public Builder supportedApps(java.util.List<SupportedApps> supportedApps) {
                this.supportedApps = supportedApps;
                return this;
            }

            /**
             * <p>The display name of the button.</p>
             * 
             * <strong>example:</strong>
             * <p>Call Me</p>
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            /**
             * <p>The validity period.</p>
             * 
             * <strong>example:</strong>
             * <p>10800</p>
             */
            public Builder ttlMinutes(Long ttlMinutes) {
                this.ttlMinutes = ttlMinutes;
                return this;
            }

            /**
             * <p>The button type. Valid values:</p>
             * <ul>
             * <li><p><strong>PHONE_NUMBER</strong>: call button.</p>
             * </li>
             * <li><p><strong>URL</strong>: URL button.</p>
             * </li>
             * <li><p><strong>QUICK_REPLY</strong>: quick reply button.</p>
             * </li>
             * <li><p><strong>COPY_CODE</strong>: copy verification code or coupon code button.</p>
             * </li>
             * <li><p><strong>ONE_TAP</strong>: autofill button for AUTHENTICATION templates.</p>
             * </li>
             * <li><p><strong>ZERO_TAP</strong>: autofill button for AUTHENTICATION templates.</p>
             * </li>
             * <li><p><strong>MPM</strong>: multi-product message.</p>
             * </li>
             * <li><p><strong>CATALOG</strong>: catalog.</p>
             * </li>
             * <li><p><strong>FLOW</strong>: open WhatsApp flow.</p>
             * </li>
             * </ul>
             * <blockquote>
             * <ul>
             * <li>For WhatsApp templates where Category is set to AUTHENTICATION, only one button is allowed, and its type must be COPY_CODE or ONE_TAP. If the type is COPY_CODE, Text is required. If the type is ONE_TAP, Text (displayed when the target app is not installed on the device, representing the name of the copy verification code button), SignatureHash, PackageName, and AutofillText are required.</li>
             * <li>For Viber templates, only one button is allowed, and its type must be URL.</li>
             * </ul>
             * </blockquote>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>PHONE_NUMBER</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The URL to be accessed when the link button is clicked.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com">https://example.com</a></p>
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            /**
             * <p>The URL type. Valid values:</p>
             * <ul>
             * <li><p><strong>static</strong>: static.</p>
             * </li>
             * <li><p><strong>dynamic</strong>: dynamic.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>static</p>
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
     * {@link CreateChatappTemplateRequest} extends {@link TeaModel}
     *
     * <p>CreateChatappTemplateRequest</p>
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
             * <p>The phone number.</p>
             * 
             * <strong>example:</strong>
             * <p>+86138007****</p>
             */
            public Builder phoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
                return this;
            }

            /**
             * <p>The button text.</p>
             * 
             * <strong>example:</strong>
             * <p>Call me</p>
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            /**
             * <p>The button type. Valid values:</p>
             * <ul>
             * <li><p><strong>PHONE_NUMBER</strong>: call button.</p>
             * </li>
             * <li><p><strong>URL</strong>: URL button.</p>
             * </li>
             * <li><p><strong>QUICK_REPLY</strong>: quick reply button.</p>
             * </li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>PHONE_NUMBER</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The URL to be accessed when the button is clicked.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://alibaba.com/xx">https://alibaba.com/xx</a></p>
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            /**
             * <p>The URL type. Valid values: </p>
             * <ul>
             * <li><p><strong>static</strong>: static.</p>
             * </li>
             * <li><p><strong>dynamic</strong>: dynamic.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>static</p>
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
     * {@link CreateChatappTemplateRequest} extends {@link TeaModel}
     *
     * <p>CreateChatappTemplateRequest</p>
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
             * <p>The list of buttons. This parameter is only applicable to the BUTTONS component. Each carousel card can have a maximum of two buttons.</p>
             */
            public Builder buttons(java.util.List<CardComponentsButtons> buttons) {
                this.buttons = buttons;
                return this;
            }

            /**
             * <p>The media resource type. This parameter is valid when Type is set to HEADER. Valid values:</p>
             * <ul>
             * <li><p><strong>IMAGE</strong>: image. </p>
             * </li>
             * <li><p><strong>VIDEO</strong>: video.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>IMAGE</p>
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            /**
             * <p>The body content in the carousel card.</p>
             * 
             * <strong>example:</strong>
             * <p>Who is the very powerful team</p>
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            /**
             * <p>The component type. Valid values:</p>
             * <ul>
             * <li><p><strong>BODY</strong></p>
             * </li>
             * <li><p><strong>HEADER</strong></p>
             * </li>
             * <li><p><strong>BUTTONS</strong></p>
             * </li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>BODY</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The media URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://alibaba.com/img.png">https://alibaba.com/img.png</a></p>
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
     * {@link CreateChatappTemplateRequest} extends {@link TeaModel}
     *
     * <p>CreateChatappTemplateRequest</p>
     */
    public static class Cards extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CardComponents")
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
             * <p>The list of controls in the carousel card.</p>
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
     * {@link CreateChatappTemplateRequest} extends {@link TeaModel}
     *
     * <p>CreateChatappTemplateRequest</p>
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
             * <p>The security recommendation text displayed above the body to warn users not to share the verification code with others. This parameter is valid only for WhatsApp templates where Category is set to AUTHENTICATION and Component Type is set to BODY.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder addSecretRecommendation(Boolean addSecretRecommendation) {
                this.addSecretRecommendation = addSecretRecommendation;
                return this;
            }

            /**
             * <p>The list of buttons. This parameter is only applicable to the <strong>BUTTONS</strong> component.</p>
             * <blockquote>
             * <p>WhatsApp button limits:</p>
             * <ul>
             * <li>For MARKETING or UTILITY templates, a maximum of 10 buttons are allowed.</li>
             * <li>Only one PHONE_NUMBER button is allowed.</li>
             * <li>A maximum of two URL buttons are allowed.</li>
             * <li>QUICK_REPLY buttons cannot be mixed with PHONE_NUMBER or URL buttons in an unordered manner.</li>
             * </ul>
             * </blockquote>
             * <blockquote>
             * <p>Viber button limits:</p>
             * <ul>
             * <li>Only the URL type is supported, and only one button is allowed.</li>
             * <li>When the HEADER is a VIDEO, the button type must be URL, but the URL address cannot be set.</li>
             * </ul>
             * </blockquote>
             */
            public Builder buttons(java.util.List<Buttons> buttons) {
                this.buttons = buttons;
                return this;
            }

            /**
             * <p>The description of the file.</p>
             * 
             * <strong>example:</strong>
             * <p>This is a video</p>
             */
            public Builder caption(String caption) {
                this.caption = caption;
                return this;
            }

            /**
             * <p>The list of carousel template cards.</p>
             */
            public Builder cards(java.util.List<Cards> cards) {
                this.cards = cards;
                return this;
            }

            /**
             * <p>The validity period of the verification code in minutes for WhatsApp AUTHENTICATION templates. This parameter is valid only for WhatsApp messages where Category is set to AUTHENTICATION and Component Type is set to FOOTER. This information is displayed in the footer.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder codeExpirationMinutes(Integer codeExpirationMinutes) {
                this.codeExpirationMinutes = codeExpirationMinutes;
                return this;
            }

            /**
             * <p>The duration of the Viber video message in seconds. Valid values: 0 to 600.</p>
             * 
             * <strong>example:</strong>
             * <p>120</p>
             */
            public Builder duration(Integer duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The name of the file.</p>
             * 
             * <strong>example:</strong>
             * <p>Express delivery video</p>
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * <p>The file type of the Viber file message.</p>
             * 
             * <strong>example:</strong>
             * <p>docx</p>
             */
            public Builder fileType(String fileType) {
                this.fileType = fileType;
                return this;
            }

            /**
             * <p>The media resource type. Valid values:</p>
             * <ul>
             * <li><p><strong>TEXT</strong>: text.</p>
             * </li>
             * <li><p><strong>IMAGE</strong>: image.</p>
             * </li>
             * <li><p><strong>DOCUMENT</strong>: document.</p>
             * </li>
             * <li><p><strong>VIDEO</strong>: video.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>TEXT</p>
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            /**
             * <p>Specifies whether the coupon code has an expiration time. This parameter is used when Type is set to LIMITED_TIME_OFFER.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder hasExpiration(Boolean hasExpiration) {
                this.hasExpiration = hasExpiration;
                return this;
            }

            /**
             * <p>The text of the message to send.</p>
             * <blockquote>
             * <p>For WhatsApp templates, when Category is set to AUTHENTICATION, this property is empty.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>hello whatsapp</p>
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            /**
             * <p>The thumbnail for Viber video messages.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://cdn.multiplymall.mobiapp.cloud/yunmall/B-LM-LMALL202207130001/20220730/d712a057-a6af-4513-bbe6-7ee57ea60983.png?x-oss-process=image/resize,w_100">https://cdn.multiplymall.mobiapp.cloud/yunmall/B-LM-LMALL202207130001/20220730/d712a057-a6af-4513-bbe6-7ee57ea60983.png?x-oss-process=image/resize,w_100</a></p>
             */
            public Builder thumbUrl(String thumbUrl) {
                this.thumbUrl = thumbUrl;
                return this;
            }

            /**
             * <p>The component type. Valid values:</p>
             * <ul>
             * <li><p><strong>BODY</strong></p>
             * </li>
             * <li><p><strong>HEADER</strong></p>
             * </li>
             * <li><p><strong>FOOTER</strong></p>
             * </li>
             * <li><p><strong>BUTTONS</strong></p>
             * </li>
             * <li><p><strong>CAROUSEL</strong></p>
             * </li>
             * <li><p><strong>LIMITED_TIME_OFFER</strong></p>
             * </li>
             * </ul>
             * <blockquote>
             * <ul>
             * <li>For WhatsApp templates, the <strong>BODY</strong> component cannot exceed 1,024 characters in length. The <strong>HEADER</strong> and <strong>FOOTER</strong> components cannot exceed 60 characters in length.</li>
             * <li>For Viber templates, the <strong>FOOTER</strong>, <strong>CAROUSEL</strong>, and <strong>LIMITED_TIME_OFFER</strong> types are invalid.</li>
             * <li>In Viber templates, images, videos, and files are placed in the <strong>HEADER</strong> (the client displays the image below the text). Text is placed in the <strong>BODY</strong>.</li>
             * </ul>
             * </blockquote>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>BODY</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The URL of the media.</p>
             * <blockquote>
             * <p>For Viber templates, the recommended image size is 800 × 800 pixels.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p><a href="https://image.developer.aliyundoc.com">https://image.developer.aliyundoc.com</a></p>
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
