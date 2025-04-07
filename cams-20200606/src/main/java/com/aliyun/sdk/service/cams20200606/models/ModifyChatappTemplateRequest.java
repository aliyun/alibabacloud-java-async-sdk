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
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Category")
    private String category;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Components")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Components> components;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CustSpaceId")
    private String custSpaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CustWabaId")
    @Deprecated
    private String custWabaId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Example")
    private java.util.Map<String, String> example;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IsvCode")
    private String isvCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Language")
    @com.aliyun.core.annotation.Validation(required = true)
    private String language;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MessageSendTtlSeconds")
    @com.aliyun.core.annotation.Validation(maximum = 2592000, minimum = 30)
    private Integer messageSendTtlSeconds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TemplateCode")
    private String templateCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TemplateName")
    private String templateName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TemplateType")
    private String templateType;

    private ModifyChatappTemplateRequest(Builder builder) {
        super(builder);
        this.category = builder.category;
        this.components = builder.components;
        this.custSpaceId = builder.custSpaceId;
        this.custWabaId = builder.custWabaId;
        this.example = builder.example;
        this.isvCode = builder.isvCode;
        this.language = builder.language;
        this.messageSendTtlSeconds = builder.messageSendTtlSeconds;
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
        private java.util.List<Components> components; 
        private String custSpaceId; 
        private String custWabaId; 
        private java.util.Map<String, String> example; 
        private String isvCode; 
        private String language; 
        private Integer messageSendTtlSeconds; 
        private String templateCode; 
        private String templateName; 
        private String templateType; 

        private Builder() {
            super();
        } 

        private Builder(ModifyChatappTemplateRequest request) {
            super(request);
            this.category = request.category;
            this.components = request.components;
            this.custSpaceId = request.custSpaceId;
            this.custWabaId = request.custWabaId;
            this.example = request.example;
            this.isvCode = request.isvCode;
            this.language = request.language;
            this.messageSendTtlSeconds = request.messageSendTtlSeconds;
            this.templateCode = request.templateCode;
            this.templateName = request.templateName;
            this.templateType = request.templateType;
        } 

        /**
         * <p>The category of the Viber message template. Valid values:</p>
         * <ul>
         * <li><strong>text</strong>: the template that contains only text</li>
         * <li><strong>image</strong>: the template that contains only images</li>
         * <li><strong>text_image_button</strong>: the template that contains text, images, and buttons</li>
         * <li><strong>text_button</strong>: the template that contains text and buttons</li>
         * <li><strong>document</strong>: the template that contains only documents</li>
         * <li><strong>video</strong>: the template that contains only videos</li>
         * <li><strong>text_video</strong>: the template that contains text and videos</li>
         * <li><strong>text_video_button</strong>: the template that contains text, videos, and buttons</li>
         * <li><strong>text_image</strong>: the template that contains text and images</li>
         * </ul>
         * <blockquote>
         * <p>This parameter applies only to Viber message templates.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>text</p>
         */
        public Builder category(String category) {
            this.putBodyParameter("Category", category);
            this.category = category;
            return this;
        }

        /**
         * <p>The components of the message template.</p>
         * <blockquote>
         * <p> If Category is set to AUTHENTICATION, the Type sub-parameter of the Components parameter cannot be set to HEADER. If the Type sub-parameter is set to BODY or FOOTER, you do not need to set the Text sub-parameter of the Components parameter because the value is automatically generated.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         */
        public Builder components(java.util.List<Components> components) {
            String componentsShrink = shrink(components, "Components", "json");
            this.putBodyParameter("Components", componentsShrink);
            this.components = components;
            return this;
        }

        /**
         * <p>The space ID of the user within the ISV account.</p>
         * 
         * <strong>example:</strong>
         * <p>28251486512358****</p>
         */
        public Builder custSpaceId(String custSpaceId) {
            this.putBodyParameter("CustSpaceId", custSpaceId);
            this.custSpaceId = custSpaceId;
            return this;
        }

        /**
         * <p>The WhatsApp Business account (WABA) ID of the user within the independent software vendor (ISV) account.</p>
         * <blockquote>
         * <p>CustWabaId is an obsolete parameter. Use CustSpaceId instead.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>659216218162179</p>
         */
        public Builder custWabaId(String custWabaId) {
            this.putBodyParameter("CustWabaId", custWabaId);
            this.custWabaId = custWabaId;
            return this;
        }

        /**
         * <p>The examples of variables that are used when you create the message template.</p>
         */
        public Builder example(java.util.Map<String, String> example) {
            String exampleShrink = shrink(example, "Example", "json");
            this.putBodyParameter("Example", exampleShrink);
            this.example = example;
            return this;
        }

        /**
         * <p>The ISV verification code, which is used to verify whether the user is authorized by the ISV account.</p>
         * 
         * <strong>example:</strong>
         * <p>ksiekdki39ksks93939</p>
         */
        public Builder isvCode(String isvCode) {
            this.putBodyParameter("IsvCode", isvCode);
            this.isvCode = isvCode;
            return this;
        }

        /**
         * <p>The language that is used in the message template. For more information, see <a href="https://help.aliyun.com/document_detail/463420.html">Language codes</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>en</p>
         */
        public Builder language(String language) {
            this.putBodyParameter("Language", language);
            this.language = language;
            return this;
        }

        /**
         * <p>Validity period of authentication template message sending in WhatsApp</p>
         * <blockquote>
         * <p>This attribute requires providing waba in advance to Alibaba operators to open the whitelist, otherwise it will result in template submission failure</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>120</p>
         */
        public Builder messageSendTtlSeconds(Integer messageSendTtlSeconds) {
            this.putBodyParameter("MessageSendTtlSeconds", messageSendTtlSeconds);
            this.messageSendTtlSeconds = messageSendTtlSeconds;
            return this;
        }

        /**
         * <p>The message template code.</p>
         * 
         * <strong>example:</strong>
         * <p>8472929283883</p>
         */
        public Builder templateCode(String templateCode) {
            this.putBodyParameter("TemplateCode", templateCode);
            this.templateCode = templateCode;
            return this;
        }

        /**
         * <p>Template name.</p>
         * 
         * <strong>example:</strong>
         * <p>test_name</p>
         */
        public Builder templateName(String templateName) {
            this.putBodyParameter("TemplateName", templateName);
            this.templateName = templateName;
            return this;
        }

        /**
         * <p>The type of the message template.</p>
         * <ul>
         * <li><strong>WHATSAPP</strong></li>
         * <li><strong>VIBER</strong></li>
         * <li>LINE: the Line message template. This type of message template will be released later.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>WHATSAPP</p>
         */
        public Builder templateType(String templateType) {
            this.putBodyParameter("TemplateType", templateType);
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
             * <p>The Whatsapp template is required when the Category is&quot; Authorisation &quot;and the Button Type is&quot; ONE_TAP/ZERO-TAP&quot;, indicating the signature hash value of the Whatsapp call application.</p>
             * 
             * <strong>example:</strong>
             * <p>com.example.myapplication</p>
             */
            public Builder packageName(String packageName) {
                this.packageName = packageName;
                return this;
            }

            /**
             * <p>The Whatsapp template is required when the Category is&quot; Authorisation &quot;and the Button Type is&quot; ONE_TAP/ZERO-TAP&quot;, indicating the signature hash value of the Whatsapp call application.</p>
             * 
             * <strong>example:</strong>
             * <p>fk39kd93ks9</p>
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
        @Deprecated
        private String packageName;

        @com.aliyun.core.annotation.NameInMap("PhoneNumber")
        private String phoneNumber;

        @com.aliyun.core.annotation.NameInMap("SignatureHash")
        @Deprecated
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
             * <p>The text of the one-tap autofill button. This parameter is required if Category is set to AUTHENTICATION and the Type sub-parameter of the Buttons parameter is set to ONE_TAP for a WhatsApp message template.</p>
             * 
             * <strong>example:</strong>
             * <p>Autofill</p>
             */
            public Builder autofillText(String autofillText) {
                this.autofillText = autofillText;
                return this;
            }

            /**
             * <p>The coupon code. It can contain only letters and digits. You can set this parameter to a variable such as $(couponCode). Specify the value of couponCode when you send a message.</p>
             * 
             * <strong>example:</strong>
             * <p>120293</p>
             */
            public Builder couponCode(String couponCode) {
                this.couponCode = couponCode;
                return this;
            }

            /**
             * <p>The Flow action.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>DATA_EXCHANGE</li>
             * <li>NAVIGATE</li>
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
             * <p>The Flow ID.</p>
             * 
             * <strong>example:</strong>
             * <p>664597077870605</p>
             */
            public Builder flowId(String flowId) {
                this.flowId = flowId;
                return this;
            }

            /**
             * <p>The unsubscribe button. This parameter is valid if Category is set to MARKETING and the Type sub-parameter of the Buttons parameter is set to QUICK_REPLY for a WhatsApp message template. Marketing messages will not be sent to customers if you configure message sending in the Chat App Message Service console and the customers click this button.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isOptOut(Boolean isOptOut) {
                this.isOptOut = isOptOut;
                return this;
            }

            /**
             * <p>The first screen in the Flow. This parameter is required if FlowAction is set to NAVIGATE.</p>
             * 
             * <strong>example:</strong>
             * <p>DETAILS</p>
             */
            public Builder navigateScreen(String navigateScreen) {
                this.navigateScreen = navigateScreen;
                return this;
            }

            /**
             * <p>The app package name that WhatsApp uses to load your app. This parameter is required if Category is set to AUTHENTICATION and the Type sub-parameter of the Buttons parameter is set to ONE_TAP for a WhatsApp message template.</p>
             * 
             * <strong>example:</strong>
             * <p>com.demo</p>
             */
            public Builder packageName(String packageName) {
                this.packageName = packageName;
                return this;
            }

            /**
             * <p>The phone number.</p>
             * 
             * <strong>example:</strong>
             * <p>+8613888887889</p>
             */
            public Builder phoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
                return this;
            }

            /**
             * <p>The app signing key hash that WhatsApp uses to load your app. This parameter is required if Category is set to AUTHENTICATION and the Type sub-parameter of the Buttons parameter is set to ONE_TAP for a WhatsApp message template.</p>
             * 
             * <strong>example:</strong>
             * <p>29dkeke</p>
             */
            public Builder signatureHash(String signatureHash) {
                this.signatureHash = signatureHash;
                return this;
            }

            /**
             * <p>List of supported apps.</p>
             */
            public Builder supportedApps(java.util.List<SupportedApps> supportedApps) {
                this.supportedApps = supportedApps;
                return this;
            }

            /**
             * <p>The text of the button.</p>
             * 
             * <strong>example:</strong>
             * <p>phone-button-text</p>
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            /**
             * <p>The button type. Valid values:</p>
             * <ul>
             * <li><strong>PHONE_NUMBER</strong>: phone call button</li>
             * <li><strong>URL</strong>: URL button</li>
             * <li><strong>QUICK_REPLY</strong>: quick reply button</li>
             * <li><strong>COPY_CODE</strong>: copy code button</li>
             * <li><strong>ONE_TAP</strong>: one-tap autofill button if Category is set to AUTHENTICATION</li>
             * </ul>
             * <blockquote>
             * </blockquote>
             * <ul>
             * <li><p>If Category is set to AUTHENTICATION for a WhatsApp message template, you can add only one button to the WhatsApp message template and you must set the Type sub-parameter of the Buttons parameter to COPY_CODE or ONE_TAP. If Type is set to COPY_CODE, the Text sub-parameter of the Buttons parameter is required. If Type is set to ONE_TAP, the Text, SignatureHash, PackageName, and AutofillText sub-parameters of the Buttons parameter are required. The value of Text is displayed if the desired app is not installed on the device. The value of Text indicates that you must manually copy the verification code.</p>
             * </li>
             * <li><p>You can add only one button to a Viber message template, and you must set the Type sub-parameter of the Buttons parameter to URL.</p>
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
             * <p>The URL to which you are redirected when you click the URL button.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://www.website.com/">https://www.website.com/</a></p>
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            /**
             * <p>The URL type. Valid values:</p>
             * <ul>
             * <li><strong>static</strong></li>
             * <li><strong>dynamic</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>dynamic</p>
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
             * <p>The phone number.</p>
             * 
             * <strong>example:</strong>
             * <p>+8613800</p>
             */
            public Builder phoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
                return this;
            }

            /**
             * <p>The text of the button.</p>
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
             * <li><strong>PHONE_NUMBER</strong>: phone call button</li>
             * <li><strong>URL</strong>: URL button</li>
             * <li><strong>QUICK_REPLY</strong>: quick reply button</li>
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
             * <p>The URL to which you are redirected when you click the URL button.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://alibaba.com/xx">https://alibaba.com/xx</a></p>
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            /**
             * <p>The URL type. Valid values:</p>
             * <ul>
             * <li><strong>static</strong></li>
             * <li><strong>dynamic</strong></li>
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
             * <p>The buttons. Specify this parameter only if you set the Type sub-parameter of the CardComponents parameter to BUTTONS. A carousel card can contain up to two buttons.</p>
             */
            public Builder buttons(java.util.List<CardComponentsButtons> buttons) {
                this.buttons = buttons;
                return this;
            }

            /**
             * <p>The type of the media resource. This parameter is valid if the Type sub-parameter of the CardComponents parameter is set to HEADER. Valid values:</p>
             * <ul>
             * <li><strong>IMAGE</strong></li>
             * <li><strong>VIDEO</strong></li>
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
             * <p>The body content of the carousel card.</p>
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
             * <li><strong>BODY</strong></li>
             * <li><strong>HEADER</strong></li>
             * <li><strong>BUTTONS</strong></li>
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
             * <p>The URL of the media resource.</p>
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
             * <p>The components of the carousel card.</p>
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
             * <p>The note indicating that customers cannot share verification codes with others. The note is displayed in the message body. This parameter is valid if Category is set to AUTHENTICATION and the Type sub-parameter of the Components parameter is set to BODY for a WhatsApp message template.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder addSecretRecommendation(Boolean addSecretRecommendation) {
                this.addSecretRecommendation = addSecretRecommendation;
                return this;
            }

            /**
             * <p>The buttons. Specify this parameter only if you set the Type sub-parameter of the Components parameter to <strong>BUTTONS</strong>.</p>
             * <blockquote>
             * <h4></h4>
             * </blockquote>
             * <ul>
             * <li><p>A marketing or utility WhatsApp message template can contain up to 10 buttons.</p>
             * </li>
             * <li><p>A WhatsApp message template can contain only one phone call button.</p>
             * </li>
             * <li><p>A WhatsApp message template can contain up to two URL buttons.</p>
             * </li>
             * <li><p>In a WhatsApp message template, a quick reply button cannot be used together with a phone call button or a URL button.</p>
             * </li>
             * </ul>
             */
            public Builder buttons(java.util.List<Buttons> buttons) {
                this.buttons = buttons;
                return this;
            }

            /**
             * <p>The description of the media resource.</p>
             * <blockquote>
             * <p> If the Type sub-parameter of the Components parameter is set to <strong>HEADER</strong> and the Format parameter is set to <strong>IMAGE, DOCUMENT, or VIDEO</strong>, you can specify this parameter.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>This is a video</p>
             */
            public Builder caption(String caption) {
                this.caption = caption;
                return this;
            }

            /**
             * <p>The carousel cards of the carousel template.</p>
             */
            public Builder cards(java.util.List<Cards> cards) {
                this.cards = cards;
                return this;
            }

            /**
             * <p>The validity period of the verification code in the WhatsApp authentication template. Unit: minutes. This parameter is valid only when Category is set to AUTHENTICATION and the Type sub-parameter of the Components parameter is set to FOOTER. The validity period of the verification code is displayed in the footer.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder codeExpirationMinutes(Integer codeExpirationMinutes) {
                this.codeExpirationMinutes = codeExpirationMinutes;
                return this;
            }

            /**
             * <p>The length of the video in the Viber message template. Unit: seconds. Valid values: 0 to 600.</p>
             * 
             * <strong>example:</strong>
             * <p>120</p>
             */
            public Builder duration(Integer duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The name of the document.</p>
             * <blockquote>
             * <p> If the Type sub-parameter of the Components parameter is set to <strong>HEADER</strong> and the Format parameter is set to <strong>DOCUMENT</strong>, you can specify this parameter.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>video name</p>
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * <p>The type of the document attached in the Viber message template.</p>
             * 
             * <strong>example:</strong>
             * <p>docx</p>
             */
            public Builder fileType(String fileType) {
                this.fileType = fileType;
                return this;
            }

            /**
             * <p>The type of the media resource. Valid values:</p>
             * <ul>
             * <li><strong>TEXT</strong></li>
             * <li><strong>IMAGE</strong></li>
             * <li><strong>DOCUMENT</strong></li>
             * <li><strong>VIDEO</strong></li>
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
             * <p>Specifies whether the coupon code has an expiration time. Specify this parameter if the Type sub-parameter of the Components parameter is set to LIMITED_TIME_OFFER.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder hasExpiration(Boolean hasExpiration) {
                this.hasExpiration = hasExpiration;
                return this;
            }

            /**
             * <p>The text of the message that you want to send.</p>
             * <blockquote>
             * <p> If Category is set to AUTHENTICATION, do not specify the Text sub-parameter of the Components parameter.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>hello chatapp</p>
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            /**
             * <p>The thumbnail URL of the video in the Viber message template.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://cdn.multiplymall.mobiapp.cloud/cloudcode/yc-165407506207478-165511576113195/20220905/ec5b9737-1507-4208-bb27-8da3958da961.jpg?x-oss-process=image/resize,w_100">https://cdn.multiplymall.mobiapp.cloud/cloudcode/yc-165407506207478-165511576113195/20220905/ec5b9737-1507-4208-bb27-8da3958da961.jpg?x-oss-process=image/resize,w_100</a></p>
             */
            public Builder thumbUrl(String thumbUrl) {
                this.thumbUrl = thumbUrl;
                return this;
            }

            /**
             * <p>The component type. Valid values:</p>
             * <ul>
             * <li><strong>BODY</strong></li>
             * <li><strong>HEADER</strong></li>
             * <li><strong>FOOTER</strong></li>
             * <li><strong>BUTTONS</strong></li>
             * <li><strong>CAROUSEL</strong></li>
             * <li><strong>LIMITED_TIME_OFFER</strong></li>
             * </ul>
             * <blockquote>
             * </blockquote>
             * <ul>
             * <li><p>In a WhatsApp message template, a <strong>Body</strong> component cannot exceed 1,024 characters in length. A <strong>HEADER</strong> or <strong>FOOTER</strong> component cannot exceed 60 characters in length.</p>
             * </li>
             * <li><p><strong>FOOTER</strong>, <strong>CAROUSEL</strong>, and <strong>LIMITED_TIME_OFFER</strong> components are not supported in Viber message templates.</p>
             * </li>
             * <li><p>In Viber message templates, media resources such as images, videos, and documents are placed in the <strong>HEADER</strong> component. If a Viber message contains text and an image, the image is placed below the text in the message received on a device.</p>
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
             * <p>The URL of the media resource.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://img.tukuppt.com/png_preview/00/10/24/1GygxVK3F4.jpg">https://img.tukuppt.com/png_preview/00/10/24/1GygxVK3F4.jpg</a></p>
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
