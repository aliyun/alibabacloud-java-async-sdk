// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateChatappTemplateRequest} extends {@link RequestModel}
 *
 * <p>CreateChatappTemplateRequest</p>
 */
public class CreateChatappTemplateRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AllowCategoryChange")
    private Boolean allowCategoryChange;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Category")
    @com.aliyun.core.annotation.Validation(required = true)
    private String category;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Components")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < Components> components;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CustSpaceId")
    private String custSpaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CustWabaId")
    @Deprecated
    private String custWabaId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Example")
    private java.util.Map < String, String > example;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("IsvCode")
    private String isvCode;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Language")
    @com.aliyun.core.annotation.Validation(required = true)
    private String language;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("MessageSendTtlSeconds")
    @com.aliyun.core.annotation.Validation(maximum = 600, minimum = 60)
    private Integer messageSendTtlSeconds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TemplateType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateType;

    private CreateChatappTemplateRequest(Builder builder) {
        super(builder);
        this.allowCategoryChange = builder.allowCategoryChange;
        this.category = builder.category;
        this.components = builder.components;
        this.custSpaceId = builder.custSpaceId;
        this.custWabaId = builder.custWabaId;
        this.example = builder.example;
        this.isvCode = builder.isvCode;
        this.language = builder.language;
        this.messageSendTtlSeconds = builder.messageSendTtlSeconds;
        this.name = builder.name;
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
     * @return components
     */
    public java.util.List < Components> getComponents() {
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
    public java.util.Map < String, String > getExample() {
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
     * @return templateType
     */
    public String getTemplateType() {
        return this.templateType;
    }

    public static final class Builder extends Request.Builder<CreateChatappTemplateRequest, Builder> {
        private Boolean allowCategoryChange; 
        private String category; 
        private java.util.List < Components> components; 
        private String custSpaceId; 
        private String custWabaId; 
        private java.util.Map < String, String > example; 
        private String isvCode; 
        private String language; 
        private Integer messageSendTtlSeconds; 
        private String name; 
        private String templateType; 

        private Builder() {
            super();
        } 

        private Builder(CreateChatappTemplateRequest request) {
            super(request);
            this.allowCategoryChange = request.allowCategoryChange;
            this.category = request.category;
            this.components = request.components;
            this.custSpaceId = request.custSpaceId;
            this.custWabaId = request.custWabaId;
            this.example = request.example;
            this.isvCode = request.isvCode;
            this.language = request.language;
            this.messageSendTtlSeconds = request.messageSendTtlSeconds;
            this.name = request.name;
            this.templateType = request.templateType;
        } 

        /**
         * Specifies whether to allow Facebook to automatically change the directory of the template. If you set this parameter to true, the review success rate of the template is improved. This parameter is valid only when TemplateType is set to WHATSAPP.
         */
        public Builder allowCategoryChange(Boolean allowCategoryChange) {
            this.putBodyParameter("AllowCategoryChange", allowCategoryChange);
            this.allowCategoryChange = allowCategoryChange;
            return this;
        }

        /**
         * The category of the template if TemplateType is set to WHATSAPP. Valid values:
         * <p>
         * 
         * *   **UTILITY**: the transaction template
         * *   **MARKETING**: the marketing template
         * *   **AUTHENTICATION**: the authentication template
         * 
         * The category of the template if TemplateType is set to VIBER. Valid values:
         * 
         * *   **text**: the template that contains only text
         * *   **image**: the template that contains only images
         * *   **text_image_button**: the template that contains text, images, and buttons
         * *   **text_button**: the template that contains text and buttons
         * *   **document**: the template that contains only documents
         * *   **video**: the template that contains only videos
         * *   **text_video**: the template that contains text and videos
         * *   **text_video_button**: the template that contains text, videos, and buttons
         * *   **text_image**: the template that contains text and images
         */
        public Builder category(String category) {
            this.putBodyParameter("Category", category);
            this.category = category;
            return this;
        }

        /**
         * The components of the message template.
         * <p>
         * 
         * >  If Category is set to AUTHENTICATION, the Type sub-parameter of the Components parameter cannot be set to HEADER. If the Type sub-parameter is set to BODY or FOOTER, the Text sub-parameter of the Components parameter must be empty.
         */
        public Builder components(java.util.List < Components> components) {
            String componentsShrink = shrink(components, "Components", "json");
            this.putBodyParameter("Components", componentsShrink);
            this.components = components;
            return this;
        }

        /**
         * The space ID of the user within the ISV account.
         */
        public Builder custSpaceId(String custSpaceId) {
            this.putBodyParameter("CustSpaceId", custSpaceId);
            this.custSpaceId = custSpaceId;
            return this;
        }

        /**
         * The WhatsApp Business account (WABA) ID of the user within the independent software vendor (ISV) account.
         * <p>
         * 
         * > CustWabaId is an obsolete parameter. Use CustSpaceId instead.
         */
        public Builder custWabaId(String custWabaId) {
            this.putBodyParameter("CustWabaId", custWabaId);
            this.custWabaId = custWabaId;
            return this;
        }

        /**
         * The examples of variables that are used when you create the message template.
         */
        public Builder example(java.util.Map < String, String > example) {
            String exampleShrink = shrink(example, "Example", "json");
            this.putBodyParameter("Example", exampleShrink);
            this.example = example;
            return this;
        }

        /**
         * The independent software vendor (ISV) verification code, which is used to verify whether the user is authorized by the ISV account.
         */
        public Builder isvCode(String isvCode) {
            this.putBodyParameter("IsvCode", isvCode);
            this.isvCode = isvCode;
            return this;
        }

        /**
         * The language that is used in the message template. For more information, see [Language codes](~~463420~~).
         */
        public Builder language(String language) {
            this.putBodyParameter("Language", language);
            this.language = language;
            return this;
        }

        /**
         * Validity period of authentication template message sending in WhatsApp
         * <p>
         * 
         * > This attribute requires providing waba in advance to Alibaba operators to open the whitelist, otherwise it will result in template submission failure
         */
        public Builder messageSendTtlSeconds(Integer messageSendTtlSeconds) {
            this.putBodyParameter("MessageSendTtlSeconds", messageSendTtlSeconds);
            this.messageSendTtlSeconds = messageSendTtlSeconds;
            return this;
        }

        /**
         * The name of the message template.
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The type of the message template.
         * <p>
         * 
         * *   **WHATSAPP**
         * *   **VIBER**
         * *   LINE: the Line message template. This type of message template will be released later.
         */
        public Builder templateType(String templateType) {
            this.putBodyParameter("TemplateType", templateType);
            this.templateType = templateType;
            return this;
        }

        @Override
        public CreateChatappTemplateRequest build() {
            return new CreateChatappTemplateRequest(this);
        } 

    } 

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
        private java.util.List < SupportedApps> supportedApps;

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
        public java.util.List < SupportedApps> getSupportedApps() {
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
            private java.util.List < SupportedApps> supportedApps; 
            private String text; 
            private String type; 
            private String url; 
            private String urlType; 

            /**
             * The text of the one-tap autofill button. This parameter is required if Category is set to AUTHENTICATION and the Type sub-parameter of the Buttons parameter is set to ONE_TAP for a WhatsApp message template.
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
             * The unsubscribe button. This parameter is valid if Category is set to MARKETING and the Type sub-parameter of the Buttons parameter is set to QUICK_REPLY for a WhatsApp message template. After you configure message sending in the ChatApp Message Service console, marketing messages are not sent to customers if they click this button.
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
             * The app package name that WhatsApp uses to load your app. This parameter is required if Category is set to AUTHENTICATION and the Type sub-parameter of the Buttons parameter is set to ONE_TAP for a WhatsApp message template.
             */
            public Builder packageName(String packageName) {
                this.packageName = packageName;
                return this;
            }

            /**
             * The phone number. This parameter is valid only if the Type sub-parameter of the Buttons parameter is set to **PHONE_NUMBER**.
             */
            public Builder phoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
                return this;
            }

            /**
             * The app signing key hash that WhatsApp uses to load your app. This parameter is required if Category is set to AUTHENTICATION and the Type sub-parameter of the Buttons parameter is set to ONE_TAP for a WhatsApp message template.
             */
            public Builder signatureHash(String signatureHash) {
                this.signatureHash = signatureHash;
                return this;
            }

            /**
             * SupportedApps.
             */
            public Builder supportedApps(java.util.List < SupportedApps> supportedApps) {
                this.supportedApps = supportedApps;
                return this;
            }

            /**
             * The display name of the button.
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            /**
             * The type of the button. Valid values:
             * <p>
             * 
             * *   **PHONE_NUMBER**: phone call button
             * *   **URL**: URL button
             * *   **QUICK_REPLY**: quick reply button
             * *   **COPY_CODE**: copy code button if Category is set to AUTHENTICATION
             * *   **ONE_TAP**: one-tap autofill button if Category is set to AUTHENTICATION
             * 
             * > 
             * 
             * *   In a WhatsApp message template, a quick reply button cannot be used together with a phone call button or a URL button.
             * 
             * *   You can add a combination of two URL buttons or a combination of a URL button and a phone call button to a WhatsApp message template.
             * 
             * *   If Category is set to AUTHENTICATION for a WhatsApp message template, you can add only one button to the WhatsApp message template and you must set the Type sub-parameter of the Buttons parameter to COPY_CODE or ONE_TAP. If the Type sub-parameter of the Buttons parameter is set to COPY_CODE, the Text sub-parameter of the Buttons parameter is required. If the Type sub-parameter of the Buttons parameter is set to ONE_TAP, the Text, SignatureHash, PackageName, and AutofillText sub-parameters of the Buttons parameter are required. The value of Text is displayed if the desired app is not installed on the device. The value of Text indicates that you must manually copy the verification code.
             * 
             * *   You can add only one button to a Viber message template, and you must set the Type sub-parameter of the Buttons parameter to URL.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The URL to which you are redirected when you click the URL button.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            /**
             * The type of the URL. Valid values:
             * <p>
             * 
             * *   **static**
             * *   **dynamic**
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

            /**
             * The phone number. This parameter is valid only if the Type sub-parameter of the Buttons parameter is set to **PHONE_NUMBER**.
             */
            public Builder phoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
                return this;
            }

            /**
             * The display name of the button.
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            /**
             * The type of the button. Valid values:
             * <p>
             * 
             * *   **PHONE_NUMBER**: phone call button
             * *   **URL**: URL button
             * *   **QUICK_REPLY**: quick reply button
             * *   **COPY_CODE**: copy code button if Category is set to AUTHENTICATION
             * *   **ONE_TAP**: one-tap autofill button if Category is set to AUTHENTICATION
             * 
             * > 
             * 
             * *   In a WhatsApp message template, a quick reply button cannot be used together with a phone call button or a URL button.
             * 
             * *   You can add a combination of two URL buttons or a combination of a URL button and a phone call button to a WhatsApp message template.
             * 
             * *   If Category is set to AUTHENTICATION for a WhatsApp message template, you can add only one button to the WhatsApp message template and you must set the Type sub-parameter of the Buttons parameter to COPY_CODE or ONE_TAP. If the Type sub-parameter of the Buttons parameter is set to COPY_CODE, the Text sub-parameter of the Buttons parameter is required. If the Type sub-parameter of the Buttons parameter is set to ONE_TAP, the Text, SignatureHash, PackageName, and AutofillText sub-parameters of the Buttons parameter are required. The value of Text is displayed if the desired app is not installed on the device. The value of Text indicates that you must manually copy the verification code.
             * 
             * *   You can add only one button to a Viber message template, and you must set the Type sub-parameter of the Buttons parameter to URL.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The URL to which you are redirected when you click the URL button.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            /**
             * The type of the URL. Valid values:
             * <p>
             * 
             * *   **static**
             * *   **dynamic**
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
    public static class CardComponents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Buttons")
        private java.util.List < CardComponentsButtons> buttons;

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
        public java.util.List < CardComponentsButtons> getButtons() {
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
            private java.util.List < CardComponentsButtons> buttons; 
            private String format; 
            private String text; 
            private String type; 
            private String url; 

            /**
             * Buttons.
             */
            public Builder buttons(java.util.List < CardComponentsButtons> buttons) {
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
             * The display name of the button.
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            /**
             * The type of the button. Valid values:
             * <p>
             * 
             * *   **PHONE_NUMBER**: phone call button
             * *   **URL**: URL button
             * *   **QUICK_REPLY**: quick reply button
             * *   **COPY_CODE**: copy code button if Category is set to AUTHENTICATION
             * *   **ONE_TAP**: one-tap autofill button if Category is set to AUTHENTICATION
             * 
             * > 
             * 
             * *   In a WhatsApp message template, a quick reply button cannot be used together with a phone call button or a URL button.
             * 
             * *   You can add a combination of two URL buttons or a combination of a URL button and a phone call button to a WhatsApp message template.
             * 
             * *   If Category is set to AUTHENTICATION for a WhatsApp message template, you can add only one button to the WhatsApp message template and you must set the Type sub-parameter of the Buttons parameter to COPY_CODE or ONE_TAP. If the Type sub-parameter of the Buttons parameter is set to COPY_CODE, the Text sub-parameter of the Buttons parameter is required. If the Type sub-parameter of the Buttons parameter is set to ONE_TAP, the Text, SignatureHash, PackageName, and AutofillText sub-parameters of the Buttons parameter are required. The value of Text is displayed if the desired app is not installed on the device. The value of Text indicates that you must manually copy the verification code.
             * 
             * *   You can add only one button to a Viber message template, and you must set the Type sub-parameter of the Buttons parameter to URL.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The URL to which you are redirected when you click the URL button.
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
    public static class Cards extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CardComponents")
        @com.aliyun.core.annotation.Validation(required = true)
        private java.util.List < CardComponents> cardComponents;

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
        public java.util.List < CardComponents> getCardComponents() {
            return this.cardComponents;
        }

        public static final class Builder {
            private java.util.List < CardComponents> cardComponents; 

            /**
             * CardComponents.
             */
            public Builder cardComponents(java.util.List < CardComponents> cardComponents) {
                this.cardComponents = cardComponents;
                return this;
            }

            public Cards build() {
                return new Cards(this);
            } 

        } 

    }
    public static class Components extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AddSecretRecommendation")
        private Boolean addSecretRecommendation;

        @com.aliyun.core.annotation.NameInMap("Buttons")
        private java.util.List < Buttons> buttons;

        @com.aliyun.core.annotation.NameInMap("Caption")
        private String caption;

        @com.aliyun.core.annotation.NameInMap("Cards")
        private java.util.List < Cards> cards;

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
        public java.util.List < Buttons> getButtons() {
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
        public java.util.List < Cards> getCards() {
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
            private java.util.List < Buttons> buttons; 
            private String caption; 
            private java.util.List < Cards> cards; 
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

            /**
             * The note indicating that customers cannot share verification codes with others. The note is displayed in the message body. This parameter is valid only if Category is set to AUTHENTICATION and the Type sub-parameter of the Components parameter is set to BODY for a WhatsApp message template.
             */
            public Builder addSecretRecommendation(Boolean addSecretRecommendation) {
                this.addSecretRecommendation = addSecretRecommendation;
                return this;
            }

            /**
             * The buttons. Specify this parameter only if you set the Type sub-parameter of the Components parameter to **BUTTONS**.
             * <p>
             * 
             * >  The following section describes the limits on the number of buttons in a WhatsApp message.
             * 
             * *   A marketing or utility WhatsApp message template supports up to 10 buttons.
             * 
             * *   A WhatsApp message template can contain only one phone call button.
             * 
             * *   A WhatsApp message template can contain up to two URL buttons.
             * 
             * *   In a WhatsApp message template, the quick reply button cannot be used together with the phone call button or the URL button.
             */
            public Builder buttons(java.util.List < Buttons> buttons) {
                this.buttons = buttons;
                return this;
            }

            /**
             * The description of the document.
             */
            public Builder caption(String caption) {
                this.caption = caption;
                return this;
            }

            /**
             * Cards.
             */
            public Builder cards(java.util.List < Cards> cards) {
                this.cards = cards;
                return this;
            }

            /**
             * The validity period of the verification code in the WhatsApp authentication template. Unit: minutes. This parameter is valid only when Category is set to AUTHENTICATION and the Type sub-parameter of the Components parameter is set to FOOTER in a WhatsApp message template. The validity period of the verification code is displayed in the footer.
             */
            public Builder codeExpirationMinutes(Integer codeExpirationMinutes) {
                this.codeExpirationMinutes = codeExpirationMinutes;
                return this;
            }

            /**
             * The length of the video in the Viber message template. Unit: seconds. Valid values: 0 to 600.
             */
            public Builder duration(Integer duration) {
                this.duration = duration;
                return this;
            }

            /**
             * The name of the document.
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * The type of the document attached in the Viber message template.
             */
            public Builder fileType(String fileType) {
                this.fileType = fileType;
                return this;
            }

            /**
             * The type of the media resources that are included in the message. Valid values:
             * <p>
             * 
             * *   **TEXT**
             * *   **IMAGE**
             * *   **DOCUMENT**
             * *   **VIDEO**
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
             * The text of the message that you want to send.
             * <p>
             * 
             * >  If Category is set to AUTHENTICATION, the Text sub-parameter of the Components parameter is empty.
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            /**
             * The thumbnail URL of the video in the Viber message template.
             */
            public Builder thumbUrl(String thumbUrl) {
                this.thumbUrl = thumbUrl;
                return this;
            }

            /**
             * The type of the component. Valid values:
             * <p>
             * 
             * *   **BODY**
             * *   **HEADER**
             * *   **FOOTER**
             * *   **BUTTONS**
             * 
             * > 
             * 
             * *   In WhatsApp message templates, a **BODY** component cannot exceed 1,024 characters in length, and a **HEADER** or **FOOTER** component cannot exceed 60 characters in length.
             * 
             * *   **FOOTER** components are not supported in Viber message templates.
             * 
             * *   In Viber message templates, media resources such as images, videos, and documents are placed in the **HEADER** component. If a Viber message contains both text and an image, the image is placed below the text in the message received on a device.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The URL of the media resource.
             * <p>
             * 
             * >  We recommend that you use 800 × 800 images in Viber message templates.
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
