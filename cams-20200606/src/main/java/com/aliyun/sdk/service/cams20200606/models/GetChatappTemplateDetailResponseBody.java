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
 * {@link GetChatappTemplateDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetChatappTemplateDetailResponseBody</p>
 */
public class GetChatappTemplateDetailResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetChatappTemplateDetailResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetChatappTemplateDetailResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return accessDeniedDetail
     */
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetChatappTemplateDetailResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>Access denied details.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>The HTTP status code.</p>
         * <ul>
         * <li>Example: OK. This value indicates that the request is successful.</li>
         * <li>Other codes indicate that the request fails. For more information, see <a href="https://help.aliyun.com/document_detail/196974.html">Error codes</a>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data.</p>
         * 
         * <strong>example:</strong>
         * <p>{ 		&quot;category&quot;: &quot;ACCOUNT_UPDATE&quot;, 		&quot;name&quot;: &quot;account_notice&quot;, 		&quot;language&quot;: &quot;en_US&quot;, 		&quot;templateCode&quot;: &quot;744c4b5c79c9432497a075bdfca3****&quot;, 		&quot;auditStatus&quot;: &quot;APPROVED&quot;, 		&quot;components&quot;: &quot;[{&quot;type&quot;:&quot;BODY&quot;,&quot;text&quot;:&quot;body_text$(textVariable)&quot;},{&quot;type&quot;:&quot;HEADER&quot;,&quot;formate&quot;:&quot;IMAGE&quot;,&quot;url&quot;:&quot;$(linkVariable)&quot;},{&quot;type&quot;:&quot;FOOTER&quot;,&quot;text&quot;:&quot;footer-text&quot;},{&quot;type&quot;:&quot;BUTTONS&quot;,&quot;buttons&quot;:[{&quot;type&quot;:&quot;PHONE_NUMBER&quot;,&quot;text&quot;:&quot;phone-button-text&quot;,&quot;phone_number&quot;:&quot;+861388888****&quot;},{&quot;type&quot;:&quot;URL&quot;,&quot;text&quot;:&quot;url-button-text&quot;,&quot;url&quot;:&quot;<a href="https://www.website.com/%5C%22%7D%5D%7D%5D">https://www.website.com/\&quot;}]}]</a>&quot;, 		&quot;example&quot;: &quot;{&quot;textVariable&quot;: &quot;text&quot;, &quot;linkVariable&quot;: &quot;link&quot;}&quot; 	}</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>User not authorized to operate on the specified resource.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>744c4b5c79c9432497a075bdfca3****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetChatappTemplateDetailResponseBody build() {
            return new GetChatappTemplateDetailResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetChatappTemplateDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetChatappTemplateDetailResponseBody</p>
     */
    public static class ExtendAttrs extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Action")
        private String action;

        @com.aliyun.core.annotation.NameInMap("IntentCode")
        private String intentCode;

        @com.aliyun.core.annotation.NameInMap("NextLanguageCode")
        private String nextLanguageCode;

        @com.aliyun.core.annotation.NameInMap("NextTemplateCode")
        private String nextTemplateCode;

        @com.aliyun.core.annotation.NameInMap("NextTemplateName")
        private String nextTemplateName;

        private ExtendAttrs(Builder builder) {
            this.action = builder.action;
            this.intentCode = builder.intentCode;
            this.nextLanguageCode = builder.nextLanguageCode;
            this.nextTemplateCode = builder.nextTemplateCode;
            this.nextTemplateName = builder.nextTemplateName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ExtendAttrs create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return intentCode
         */
        public String getIntentCode() {
            return this.intentCode;
        }

        /**
         * @return nextLanguageCode
         */
        public String getNextLanguageCode() {
            return this.nextLanguageCode;
        }

        /**
         * @return nextTemplateCode
         */
        public String getNextTemplateCode() {
            return this.nextTemplateCode;
        }

        /**
         * @return nextTemplateName
         */
        public String getNextTemplateName() {
            return this.nextTemplateName;
        }

        public static final class Builder {
            private String action; 
            private String intentCode; 
            private String nextLanguageCode; 
            private String nextTemplateCode; 
            private String nextTemplateName; 

            private Builder() {
            } 

            private Builder(ExtendAttrs model) {
                this.action = model.action;
                this.intentCode = model.intentCode;
                this.nextLanguageCode = model.nextLanguageCode;
                this.nextTemplateCode = model.nextTemplateCode;
                this.nextTemplateName = model.nextTemplateName;
            } 

            /**
             * <p>The event type.</p>
             * 
             * <strong>example:</strong>
             * <p>nextCard</p>
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * <p>The intent code.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder intentCode(String intentCode) {
                this.intentCode = intentCode;
                return this;
            }

            /**
             * <p>The language of the next template.</p>
             * 
             * <strong>example:</strong>
             * <p>en</p>
             */
            public Builder nextLanguageCode(String nextLanguageCode) {
                this.nextLanguageCode = nextLanguageCode;
                return this;
            }

            /**
             * <p>The code of the next template.</p>
             * 
             * <strong>example:</strong>
             * <p>20939920093993</p>
             */
            public Builder nextTemplateCode(String nextTemplateCode) {
                this.nextTemplateCode = nextTemplateCode;
                return this;
            }

            /**
             * <p>The name of the next template.</p>
             * 
             * <strong>example:</strong>
             * <p>abc</p>
             */
            public Builder nextTemplateName(String nextTemplateName) {
                this.nextTemplateName = nextTemplateName;
                return this;
            }

            public ExtendAttrs build() {
                return new ExtendAttrs(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetChatappTemplateDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetChatappTemplateDetailResponseBody</p>
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
             * <p>The app package name.</p>
             * 
             * <strong>example:</strong>
             * <p>com.test</p>
             */
            public Builder packageName(String packageName) {
                this.packageName = packageName;
                return this;
            }

            /**
             * <p>The app signing key hash.</p>
             * 
             * <strong>example:</strong>
             * <p>29kdkeik939</p>
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
     * {@link GetChatappTemplateDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetChatappTemplateDetailResponseBody</p>
     */
    public static class Buttons extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutofillText")
        private String autofillText;

        @com.aliyun.core.annotation.NameInMap("CouponCode")
        private String couponCode;

        @com.aliyun.core.annotation.NameInMap("ExtendAttrs")
        private ExtendAttrs extendAttrs;

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
        private String type;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        @com.aliyun.core.annotation.NameInMap("UrlType")
        private String urlType;

        private Buttons(Builder builder) {
            this.autofillText = builder.autofillText;
            this.couponCode = builder.couponCode;
            this.extendAttrs = builder.extendAttrs;
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
         * @return extendAttrs
         */
        public ExtendAttrs getExtendAttrs() {
            return this.extendAttrs;
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
            private ExtendAttrs extendAttrs; 
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
                this.extendAttrs = model.extendAttrs;
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
             * <p>The text of the one-tap autofill button. This parameter is required if Category is set to AUTHENTICATION and the Type sub-parameter of the Buttons parameter is set to ONE_TAP in a WhatsApp message template.</p>
             * 
             * <strong>example:</strong>
             * <p>Autofill</p>
             */
            public Builder autofillText(String autofillText) {
                this.autofillText = autofillText;
                return this;
            }

            /**
             * <p>The coupon code.</p>
             * 
             * <strong>example:</strong>
             * <p>202039ksjs</p>
             */
            public Builder couponCode(String couponCode) {
                this.couponCode = couponCode;
                return this;
            }

            /**
             * <p>The extended fields.</p>
             */
            public Builder extendAttrs(ExtendAttrs extendAttrs) {
                this.extendAttrs = extendAttrs;
                return this;
            }

            /**
             * <p>The Flow action. Valid values: NAVIGATE and DATA_EXCHANGE.</p>
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
             * <p>3838292983</p>
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
             * <p>The first screen in the Flow. This parameter is returned if FlowAction is set to NAVIGATE.</p>
             * 
             * <strong>example:</strong>
             * <p>DETAILS</p>
             */
            public Builder navigateScreen(String navigateScreen) {
                this.navigateScreen = navigateScreen;
                return this;
            }

            /**
             * <p>The app package name that WhatsApp uses to load your app. This parameter is required if Category is set to AUTHENTICATION and the Type sub-parameter of the Buttons parameter is set to ONE_TAP in a WhatsApp message template.</p>
             * 
             * <strong>example:</strong>
             * <p>com.aliyun</p>
             */
            public Builder packageName(String packageName) {
                this.packageName = packageName;
                return this;
            }

            /**
             * <p>The phone number. This parameter is valid only if the Type sub-parameter of the Buttons parameter is set to <strong>PHONE_NUMBER</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>861398745****</p>
             */
            public Builder phoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
                return this;
            }

            /**
             * <p>The app signing key hash that WhatsApp uses to load your app. This parameter is required if Category is set to AUTHENTICATION and the Type sub-parameter of the Buttons parameter is set to ONE_TAP in a WhatsApp message template.</p>
             * 
             * <strong>example:</strong>
             * <p>2993839</p>
             */
            public Builder signatureHash(String signatureHash) {
                this.signatureHash = signatureHash;
                return this;
            }

            /**
             * <p>The apps that support one-tap authentication and zero-tap authentication.</p>
             */
            public Builder supportedApps(java.util.List<SupportedApps> supportedApps) {
                this.supportedApps = supportedApps;
                return this;
            }

            /**
             * <p>The display name of the button.</p>
             * 
             * <strong>example:</strong>
             * <p>Call</p>
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
             * <p><a href="https://example.com">https://example.com</a></p>
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

            public Buttons build() {
                return new Buttons(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetChatappTemplateDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetChatappTemplateDetailResponseBody</p>
     */
    public static class CardComponentsButtons extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PhoneNumber")
        private String phoneNumber;

        @com.aliyun.core.annotation.NameInMap("Text")
        private String text;

        @com.aliyun.core.annotation.NameInMap("Type")
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
             * <p>+86138000</p>
             */
            public Builder phoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
                return this;
            }

            /**
             * <p>The button text.</p>
             * 
             * <strong>example:</strong>
             * <p>Button text</p>
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            /**
             * <p>The type of the button in the carousel template. Valid values: URL, PHONE_NUMBER, and QUICK_REQLY.</p>
             * 
             * <strong>example:</strong>
             * <p>URL</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The URL to which you are redirected when you click the URL button.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://aliyun.com">https://aliyun.com</a></p>
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            /**
             * <p>The type of the URL. Valid values: static and dynamic.</p>
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
     * {@link GetChatappTemplateDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetChatappTemplateDetailResponseBody</p>
     */
    public static class CardComponents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Buttons")
        private java.util.List<CardComponentsButtons> buttons;

        @com.aliyun.core.annotation.NameInMap("Format")
        private String format;

        @com.aliyun.core.annotation.NameInMap("Text")
        private String text;

        @com.aliyun.core.annotation.NameInMap("Type")
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
             * <p>The buttons of the carousel card.</p>
             */
            public Builder buttons(java.util.List<CardComponentsButtons> buttons) {
                this.buttons = buttons;
                return this;
            }

            /**
             * <p>The type of the header in the carousel template. The header can only be an image or a video. The headers of all carousel cards must be the same. The type of the media resources that are included in the message. Valid values: IMGAGE and VIDEO.</p>
             * 
             * <strong>example:</strong>
             * <p>HEADER</p>
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            /**
             * <p>The text of the carousel card.</p>
             * 
             * <strong>example:</strong>
             * <p>Body</p>
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            /**
             * <p>The component type.</p>
             * 
             * <strong>example:</strong>
             * <p>HEADER</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://aliyun.com">https://aliyun.com</a></p>
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
     * {@link GetChatappTemplateDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetChatappTemplateDetailResponseBody</p>
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
             * <p>The components of the carousel card.</p>
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
     * {@link GetChatappTemplateDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetChatappTemplateDetailResponseBody</p>
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

        @com.aliyun.core.annotation.NameInMap("Latitude")
        private String latitude;

        @com.aliyun.core.annotation.NameInMap("LocationAddress")
        private String locationAddress;

        @com.aliyun.core.annotation.NameInMap("LocationName")
        private String locationName;

        @com.aliyun.core.annotation.NameInMap("Longitude")
        private String longitude;

        @com.aliyun.core.annotation.NameInMap("OfferExpirationTimeMs")
        private String offerExpirationTimeMs;

        @com.aliyun.core.annotation.NameInMap("Text")
        private String text;

        @com.aliyun.core.annotation.NameInMap("ThumbUrl")
        private String thumbUrl;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        @com.aliyun.core.annotation.NameInMap("hasExpiration")
        private Boolean hasExpiration;

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
            this.latitude = builder.latitude;
            this.locationAddress = builder.locationAddress;
            this.locationName = builder.locationName;
            this.longitude = builder.longitude;
            this.offerExpirationTimeMs = builder.offerExpirationTimeMs;
            this.text = builder.text;
            this.thumbUrl = builder.thumbUrl;
            this.type = builder.type;
            this.url = builder.url;
            this.hasExpiration = builder.hasExpiration;
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
         * @return latitude
         */
        public String getLatitude() {
            return this.latitude;
        }

        /**
         * @return locationAddress
         */
        public String getLocationAddress() {
            return this.locationAddress;
        }

        /**
         * @return locationName
         */
        public String getLocationName() {
            return this.locationName;
        }

        /**
         * @return longitude
         */
        public String getLongitude() {
            return this.longitude;
        }

        /**
         * @return offerExpirationTimeMs
         */
        public String getOfferExpirationTimeMs() {
            return this.offerExpirationTimeMs;
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

        /**
         * @return hasExpiration
         */
        public Boolean getHasExpiration() {
            return this.hasExpiration;
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
            private String latitude; 
            private String locationAddress; 
            private String locationName; 
            private String longitude; 
            private String offerExpirationTimeMs; 
            private String text; 
            private String thumbUrl; 
            private String type; 
            private String url; 
            private Boolean hasExpiration; 

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
                this.latitude = model.latitude;
                this.locationAddress = model.locationAddress;
                this.locationName = model.locationName;
                this.longitude = model.longitude;
                this.offerExpirationTimeMs = model.offerExpirationTimeMs;
                this.text = model.text;
                this.thumbUrl = model.thumbUrl;
                this.type = model.type;
                this.url = model.url;
                this.hasExpiration = model.hasExpiration;
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
             * <p>The buttons. This parameter is returned only if the Type sub-parameter of the Components parameter is set to <strong>BUTTONS</strong>.</p>
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
             * <p>The description of the document.</p>
             * 
             * <strong>example:</strong>
             * <p>The new file has been uploaded.</p>
             */
            public Builder caption(String caption) {
                this.caption = caption;
                return this;
            }

            /**
             * <p>The carousel cards.</p>
             */
            public Builder cards(java.util.List<Cards> cards) {
                this.cards = cards;
                return this;
            }

            /**
             * <p>The validity period of the verification code in the WhatsApp authentication template. Unit: minutes. This parameter is valid only when Category is set to AUTHENTICATION and the Type sub-parameter of the Components parameter is set to FOOTER for a WhatsApp message template. The validity period of the verification code is displayed in the footer.</p>
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
             * <p>50</p>
             */
            public Builder duration(Integer duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The name of the document.</p>
             * 
             * <strong>example:</strong>
             * <p>Express file</p>
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
             * <p>The format.</p>
             * 
             * <strong>example:</strong>
             * <p>TEXT</p>
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            /**
             * <p>The latitude of the location.</p>
             * 
             * <strong>example:</strong>
             * <p>28.001</p>
             */
            public Builder latitude(String latitude) {
                this.latitude = latitude;
                return this;
            }

            /**
             * <p>The address of the location.</p>
             * 
             * <strong>example:</strong>
             * <p>Hangzhou</p>
             */
            public Builder locationAddress(String locationAddress) {
                this.locationAddress = locationAddress;
                return this;
            }

            /**
             * <p>The name of the location.</p>
             * 
             * <strong>example:</strong>
             * <p>Hangzhou</p>
             */
            public Builder locationName(String locationName) {
                this.locationName = locationName;
                return this;
            }

            /**
             * <p>The longitude of the location.</p>
             * 
             * <strong>example:</strong>
             * <p>120.002</p>
             */
            public Builder longitude(String longitude) {
                this.longitude = longitude;
                return this;
            }

            /**
             * <p>The variable when the coupon code expires in the limited-time offer template.</p>
             * 
             * <strong>example:</strong>
             * <p>$(offerExpirationTimeMs)</p>
             */
            public Builder offerExpirationTimeMs(String offerExpirationTimeMs) {
                this.offerExpirationTimeMs = offerExpirationTimeMs;
                return this;
            }

            /**
             * <p>The text of the message that you want to send.</p>
             * 
             * <strong>example:</strong>
             * <p>Hello</p>
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            /**
             * <p>The thumbnail URL of the video in the Viber message template.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://img.png">https://img.png</a></p>
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
             * <p><a href="https://image.developer.aliyundoc.com">https://image.developer.aliyundoc.com</a></p>
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            /**
             * <p>Indicates whether the coupon code has an expiration time in the limited-time offer template.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder hasExpiration(Boolean hasExpiration) {
                this.hasExpiration = hasExpiration;
                return this;
            }

            public Components build() {
                return new Components(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetChatappTemplateDetailResponseBody} extends {@link TeaModel}
     *
     * <p>GetChatappTemplateDetailResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuditStatus")
        private String auditStatus;

        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("Components")
        private java.util.List<Components> components;

        @com.aliyun.core.annotation.NameInMap("Example")
        private java.util.Map<String, String> example;

        @com.aliyun.core.annotation.NameInMap("Language")
        private String language;

        @com.aliyun.core.annotation.NameInMap("MessageSendTtlSeconds")
        @com.aliyun.core.annotation.Validation(maximum = 600, minimum = 60)
        private Integer messageSendTtlSeconds;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("QualityScore")
        private String qualityScore;

        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

        @com.aliyun.core.annotation.NameInMap("TemplateCode")
        private String templateCode;

        @com.aliyun.core.annotation.NameInMap("TemplateType")
        private String templateType;

        private Data(Builder builder) {
            this.auditStatus = builder.auditStatus;
            this.category = builder.category;
            this.components = builder.components;
            this.example = builder.example;
            this.language = builder.language;
            this.messageSendTtlSeconds = builder.messageSendTtlSeconds;
            this.name = builder.name;
            this.qualityScore = builder.qualityScore;
            this.reason = builder.reason;
            this.templateCode = builder.templateCode;
            this.templateType = builder.templateType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return auditStatus
         */
        public String getAuditStatus() {
            return this.auditStatus;
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
         * @return example
         */
        public java.util.Map<String, String> getExample() {
            return this.example;
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
         * @return qualityScore
         */
        public String getQualityScore() {
            return this.qualityScore;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return templateCode
         */
        public String getTemplateCode() {
            return this.templateCode;
        }

        /**
         * @return templateType
         */
        public String getTemplateType() {
            return this.templateType;
        }

        public static final class Builder {
            private String auditStatus; 
            private String category; 
            private java.util.List<Components> components; 
            private java.util.Map<String, String> example; 
            private String language; 
            private Integer messageSendTtlSeconds; 
            private String name; 
            private String qualityScore; 
            private String reason; 
            private String templateCode; 
            private String templateType; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.auditStatus = model.auditStatus;
                this.category = model.category;
                this.components = model.components;
                this.example = model.example;
                this.language = model.language;
                this.messageSendTtlSeconds = model.messageSendTtlSeconds;
                this.name = model.name;
                this.qualityScore = model.qualityScore;
                this.reason = model.reason;
                this.templateCode = model.templateCode;
                this.templateType = model.templateType;
            } 

            /**
             * <p>The review status of the message template. Valid values:</p>
             * <ul>
             * <li><strong>pass</strong>: The message template is approved.</li>
             * <li><strong>fail</strong>: The message template is rejected.</li>
             * <li><strong>auditing</strong>: The message template is being reviewed.</li>
             * <li><strong>unaudit</strong>: The review is suspended.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>pass</p>
             */
            public Builder auditStatus(String auditStatus) {
                this.auditStatus = auditStatus;
                return this;
            }

            /**
             * <p>The category of the template when the returned value of TemplateType is WHATSAPP. Valid values:</p>
             * <ul>
             * <li><strong>UTILITY</strong>: a transactional template</li>
             * <li><strong>MARKETING</strong>: a marketing template</li>
             * <li><strong>AUTHENTICATION</strong>: an identity authentication template</li>
             * </ul>
             * <p>The category of the template when the returned value of the TemplateType parameter is VIBER. Valid values:</p>
             * <ul>
             * <li><strong>text</strong>: a template that contains only text</li>
             * <li><strong>image</strong>: a template that contains only images</li>
             * <li><strong>text_image_button</strong>: a template that contains text, images, and buttons</li>
             * <li><strong>text_button</strong>: a template that contains text and buttons</li>
             * <li><strong>document</strong>: a template that contains only files</li>
             * <li><strong>video</strong>: a template that contains only videos</li>
             * <li><strong>text_video</strong>: a template that contains text and videos</li>
             * <li><strong>text_video_button</strong>: a template that contains text, videos, and buttons</li>
             * <li><strong>text_image</strong>: a template that contains text and images</li>
             * </ul>
             * <blockquote>
             * <p>If Category is set to text_video_button, users cannot open a web page by clicking the button. Users can open only the video in the message. In this case, you do not need to specify the Url parameter for the URL button in the template.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>TRANSACTIONAL</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>The components of the message template.</p>
             */
            public Builder components(java.util.List<Components> components) {
                this.components = components;
                return this;
            }

            /**
             * <p>The examples of variables.</p>
             */
            public Builder example(java.util.Map<String, String> example) {
                this.example = example;
                return this;
            }

            /**
             * <p>The language that is used in the message template. For more information, see <a href="https://help.aliyun.com/document_detail/463420.html">Language codes</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>en_US</p>
             */
            public Builder language(String language) {
                this.language = language;
                return this;
            }

            /**
             * <p>The validity period of the WhatsApp authentication message.</p>
             * 
             * <strong>example:</strong>
             * <p>120</p>
             */
            public Builder messageSendTtlSeconds(Integer messageSendTtlSeconds) {
                this.messageSendTtlSeconds = messageSendTtlSeconds;
                return this;
            }

            /**
             * <p>The name of the message template.</p>
             * 
             * <strong>example:</strong>
             * <p>hello_whatsapp</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The quality of the template.</p>
             * 
             * <strong>example:</strong>
             * <p>GREEN</p>
             */
            public Builder qualityScore(String qualityScore) {
                this.qualityScore = qualityScore;
                return this;
            }

            /**
             * <p>The reason why the template was rejected.</p>
             * 
             * <strong>example:</strong>
             * <p>None</p>
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * <p>The code of the message template.</p>
             * 
             * <strong>example:</strong>
             * <p>744c4b5c79c9432497a075bdfca3****</p>
             */
            public Builder templateCode(String templateCode) {
                this.templateCode = templateCode;
                return this;
            }

            /**
             * <p>The type of the message template. Valid values:</p>
             * <ul>
             * <li><strong>WHATSAPP</strong></li>
             * <li><strong>VIBER</strong></li>
             * <li>LINE (developing)</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>WHATSAPP</p>
             */
            public Builder templateType(String templateType) {
                this.templateType = templateType;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
