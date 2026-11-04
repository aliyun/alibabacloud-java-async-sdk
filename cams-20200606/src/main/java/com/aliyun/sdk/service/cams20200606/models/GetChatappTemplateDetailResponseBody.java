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

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetChatappTemplateDetailResponseBody(Builder builder) {
        this.accessDeniedDetail = builder.accessDeniedDetail;
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String accessDeniedDetail; 
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetChatappTemplateDetailResponseBody model) {
            this.accessDeniedDetail = model.accessDeniedDetail;
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The access denied details.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * <p>The request status code.</p>
         * <ul>
         * <li><p>A return value of OK indicates that the request is successful.</p>
         * </li>
         * <li><p>For other error codes, see <a href="https://help.aliyun.com/document_detail/196974.html">Error codes</a>.</p>
         * </li>
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
         * <p>The response data.</p>
         * 
         * <strong>example:</strong>
         * <p>{ 		&quot;category&quot;: &quot;ACCOUNT_UPDATE&quot;, 		&quot;name&quot;: &quot;account_notice&quot;, 		&quot;language&quot;: &quot;en_US&quot;, 		&quot;templateCode&quot;: &quot;744c4b5c79c9432497a075bdfca3****&quot;, 		&quot;auditStatus&quot;: &quot;APPROVED&quot;, 		&quot;components&quot;: &quot;[{\&quot;type\&quot;:\&quot;BODY\&quot;,\&quot;text\&quot;:\&quot;body_text$(textVariable)\&quot;},{\&quot;type\&quot;:\&quot;HEADER\&quot;,\&quot;formate\&quot;:\&quot;IMAGE\&quot;,\&quot;url\&quot;:\&quot;$(linkVariable)\&quot;},{\&quot;type\&quot;:\&quot;FOOTER\&quot;,\&quot;text\&quot;:\&quot;footer-text\&quot;},{\&quot;type\&quot;:\&quot;BUTTONS\&quot;,\&quot;buttons\&quot;:[{\&quot;type\&quot;:\&quot;PHONE_NUMBER\&quot;,\&quot;text\&quot;:\&quot;phone-button-text\&quot;,\&quot;phone_number\&quot;:\&quot;+861388888****\&quot;},{\&quot;type\&quot;:\&quot;URL\&quot;,\&quot;text\&quot;:\&quot;url-button-text\&quot;,\&quot;url\&quot;:\&quot;<a href="https://www.website.com/%5C%5C%22%7D%5D%7D%5D">https://www.website.com/\\&quot;}]}]</a>&quot;, 		&quot;example&quot;: &quot;{\&quot;textVariable\&quot;: \&quot;text\&quot;, \&quot;linkVariable\&quot;: \&quot;link\&quot;}&quot; 	}</p>
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

        /**
         * <p>Indicates whether the request is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
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
             * <p>The language code of the next template.</p>
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
             * <p>The package name.</p>
             * 
             * <strong>example:</strong>
             * <p>com.test</p>
             */
            public Builder packageName(String packageName) {
                this.packageName = packageName;
                return this;
            }

            /**
             * <p>The package signature hash.</p>
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

        @com.aliyun.core.annotation.NameInMap("TtlMinutes")
        private Long ttlMinutes;

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
            private Long ttlMinutes; 
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
                this.ttlMinutes = model.ttlMinutes;
                this.type = model.type;
                this.url = model.url;
                this.urlType = model.urlType;
            } 

            /**
             * <p>The button text for the WhatsApp autofill operation. This parameter is required for WhatsApp templates where the category is Authentication and the button type is ONE_TAP.</p>
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
             * <p>The extended attributes.</p>
             */
            public Builder extendAttrs(ExtendAttrs extendAttrs) {
                this.extendAttrs = extendAttrs;
                return this;
            }

            /**
             * <p>The flow data event type. Valid values:</p>
             * <ul>
             * <li><p>NAVIGATE: Navigation.</p>
             * </li>
             * <li><p>DATA_EXCHANGE: Data exchange.</p>
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
             * <p>Flow ID</p>
             * 
             * <strong>example:</strong>
             * <p>3838292983</p>
             */
            public Builder flowId(String flowId) {
                this.flowId = flowId;
                return this;
            }

            /**
             * <p>Indicates whether the button is a marketing opt-out button. If a customer clicks this button and sending control is configured on the Chat App Message Service platform, subsequent marketing messages are not sent to the customer. This parameter is valid only for WhatsApp templates where the category is Marketing and the button type is QUICK_REPLY.</p>
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
             * <p>The package name of the application invoked by WhatsApp. This parameter is required for WhatsApp templates where the category is Authentication and the button type is ONE_TAP.</p>
             * 
             * <strong>example:</strong>
             * <p>com.aliyun</p>
             */
            public Builder packageName(String packageName) {
                this.packageName = packageName;
                return this;
            }

            /**
             * <p>The phone number. This parameter is valid only when the button type is <strong>PHONE_NUMBER</strong>.</p>
             * 
             * <strong>example:</strong>
             * <p>+861398745****</p>
             */
            public Builder phoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
                return this;
            }

            /**
             * <p>The signature hash value of the application invoked by WhatsApp. This parameter is required for WhatsApp templates where the category is Authentication and the button type is ONE_TAP.</p>
             * 
             * <strong>example:</strong>
             * <p>2993839</p>
             */
            public Builder signatureHash(String signatureHash) {
                this.signatureHash = signatureHash;
                return this;
            }

            /**
             * <p>The applications supported by the ONE_TAP or ZERO_TAP verification code button.</p>
             */
            public Builder supportedApps(java.util.List<SupportedApps> supportedApps) {
                this.supportedApps = supportedApps;
                return this;
            }

            /**
             * <p>The display name of the button.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
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
             * <li><p><strong>PHONE_NUMBER</strong>: Call button.</p>
             * </li>
             * <li><p><strong>URL</strong>: URL button.</p>
             * </li>
             * <li><p><strong>QUICK_REPLY</strong>: Quick reply button.</p>
             * </li>
             * <li><p><strong>COPY_CODE</strong>: Copy verification code or coupon code button.</p>
             * </li>
             * <li><p><strong>ONE_TAP</strong>: Autofill button for authentication templates.</p>
             * </li>
             * <li><p><strong>ZERO_TAP</strong>: Autofill button for authentication templates.</p>
             * </li>
             * <li><p><strong>MPM</strong>: Multi-product message button.</p>
             * </li>
             * <li><p><strong>CATALOG</strong>: Catalog button.</p>
             * </li>
             * <li><p><strong>FLOW</strong>: WhatsApp flow button.</p>
             * </li>
             * </ul>
             * <blockquote>
             * <ul>
             * <li>For WhatsApp templates where the category is AUTHENTICATION, only one button is allowed, and the type must be COPY_CODE or ONE_TAP. If the type is COPY_CODE, Text is required. If the type is ONE_TAP, Text (displayed when the target application is not installed on the device, representing the name of the copy verification code button), SignatureHash, PackageName, and AutofillText are required.</li>
             * <li>For Viber templates, only one button is allowed, and the type must be URL.</li>
             * </ul>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>PHONE_NUMBER</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The URL to be accessed when the URL button is clicked.</p>
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
             * <li><p><strong>static</strong>: Static.</p>
             * </li>
             * <li><p><strong>dynamic</strong>: Dynamic.</p>
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
             * <p>+861380005****</p>
             */
            public Builder phoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
                return this;
            }

            /**
             * <p>The button content.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            /**
             * <p>The button type for carousel templates. Valid values: URL, PHONE_NUMBER, and QUICK_REQLY.</p>
             * 
             * <strong>example:</strong>
             * <p>URL</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The URL to visit after the button is clicked.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://aliyun.com">https://aliyun.com</a></p>
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            /**
             * <p>The URL type. Valid values:</p>
             * <ul>
             * <li><p>static: Static URL.</p>
             * </li>
             * <li><p>dynamic: Dynamic URL.</p>
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
             * <p>The list of card buttons.</p>
             */
            public Builder buttons(java.util.List<CardComponentsButtons> buttons) {
                this.buttons = buttons;
                return this;
            }

            /**
             * <p>The header type for carousel templates. Only IMAGE and VIDEO are supported. The header must be consistent across all cards.</p>
             * 
             * <strong>example:</strong>
             * <p>HEADER</p>
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            /**
             * <p>The text content of the card.</p>
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
             * <p>The web address.</p>
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
             * <p>The list of card components.</p>
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
             * <p>Indicates whether to display a security recommendation above the body to warn users not to share the verification code with others. This parameter is valid only for WhatsApp templates where the category is Authentication and the component type is Body.</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder addSecretRecommendation(Boolean addSecretRecommendation) {
                this.addSecretRecommendation = addSecretRecommendation;
                return this;
            }

            /**
             * <p>The list of buttons. This parameter is valid only for the <strong>BUTTONS</strong> component.</p>
             * <blockquote>
             * <p>WhatsApp button limits</p>
             * <ul>
             * <li>For MARKETING or UTILITY templates, a maximum of 10 buttons are allowed.</li>
             * <li>Only one PHONE_NUMBER button is allowed.</li>
             * <li>A maximum of two URL buttons are allowed.</li>
             * <li>QUICK_REPLY buttons must not be interspersed with PHONE_NUMBER or URL buttons.</li>
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
             * <p>example</p>
             */
            public Builder caption(String caption) {
                this.caption = caption;
                return this;
            }

            /**
             * <p>The list of carousel cards.</p>
             */
            public Builder cards(java.util.List<Cards> cards) {
                this.cards = cards;
                return this;
            }

            /**
             * <p>The expiration time of the verification code in minutes for WhatsApp authentication templates. This is valid only for WhatsApp messages where the category is Authentication and the component type is Footer. This information is displayed in the footer.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder codeExpirationMinutes(Integer codeExpirationMinutes) {
                this.codeExpirationMinutes = codeExpirationMinutes;
                return this;
            }

            /**
             * <p>The duration of the video in seconds for Viber video messages. Valid values: 0 to 600.</p>
             * 
             * <strong>example:</strong>
             * <p>50</p>
             */
            public Builder duration(Integer duration) {
                this.duration = duration;
                return this;
            }

            /**
             * <p>The name of the file.</p>
             * 
             * <strong>example:</strong>
             * <p>example</p>
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * <p>The file type for Viber file messages.</p>
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
             * <p>hangzhou</p>
             */
            public Builder locationAddress(String locationAddress) {
                this.locationAddress = locationAddress;
                return this;
            }

            /**
             * <p>The name of the location.</p>
             * 
             * <strong>example:</strong>
             * <p>hangzhou</p>
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
             * <p>The expiration variable of the offer code for limited-time offer (LTO) templates.</p>
             * 
             * <strong>example:</strong>
             * <p>$(offerExpirationTimeMs)</p>
             */
            public Builder offerExpirationTimeMs(String offerExpirationTimeMs) {
                this.offerExpirationTimeMs = offerExpirationTimeMs;
                return this;
            }

            /**
             * <p>The text of the message to send.</p>
             * 
             * <strong>example:</strong>
             * <p>hello</p>
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            /**
             * <p>The thumbnail URL for Viber video messages.</p>
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
             * <li>For WhatsApp templates, the <strong>BODY</strong> component cannot exceed 1,024 characters. The <strong>HEADER</strong> and <strong>FOOTER</strong> components cannot exceed 60 characters.</li>
             * <li>For Viber templates, the <strong>FOOTER</strong>, <strong>CAROUSEL</strong>, and <strong>LIMITED_TIME_OFFER</strong> types are invalid.</li>
             * <li>In Viber templates, images, videos, and files are placed in the <strong>HEADER</strong>. The client displays the image below the text.</li>
             * </ul>
             * </blockquote>
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
             * <p><a href="https://image.developer.aliyundoc.com">https://image.developer.aliyundoc.com</a></p>
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            /**
             * <p>Indicates whether the offer code has an expiration time in LTO templates.</p>
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
        @com.aliyun.core.annotation.NameInMap("AllowSend")
        private Boolean allowSend;

        @com.aliyun.core.annotation.NameInMap("AuditStatus")
        private String auditStatus;

        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("CategoryChangePaused")
        private Boolean categoryChangePaused;

        @com.aliyun.core.annotation.NameInMap("Components")
        private java.util.List<Components> components;

        @com.aliyun.core.annotation.NameInMap("Example")
        private java.util.Map<String, String> example;

        @com.aliyun.core.annotation.NameInMap("Language")
        private String language;

        @com.aliyun.core.annotation.NameInMap("MessageSendTtlSeconds")
        private Integer messageSendTtlSeconds;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("ProductSetId")
        private String productSetId;

        @com.aliyun.core.annotation.NameInMap("QualityScore")
        private String qualityScore;

        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

        @com.aliyun.core.annotation.NameInMap("TemplateCode")
        private String templateCode;

        @com.aliyun.core.annotation.NameInMap("TemplateType")
        private String templateType;

        private Data(Builder builder) {
            this.allowSend = builder.allowSend;
            this.auditStatus = builder.auditStatus;
            this.category = builder.category;
            this.categoryChangePaused = builder.categoryChangePaused;
            this.components = builder.components;
            this.example = builder.example;
            this.language = builder.language;
            this.messageSendTtlSeconds = builder.messageSendTtlSeconds;
            this.name = builder.name;
            this.productSetId = builder.productSetId;
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
         * @return allowSend
         */
        public Boolean getAllowSend() {
            return this.allowSend;
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
         * @return productSetId
         */
        public String getProductSetId() {
            return this.productSetId;
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
            private Boolean allowSend; 
            private String auditStatus; 
            private String category; 
            private Boolean categoryChangePaused; 
            private java.util.List<Components> components; 
            private java.util.Map<String, String> example; 
            private String language; 
            private Integer messageSendTtlSeconds; 
            private String name; 
            private String productSetId; 
            private String qualityScore; 
            private String reason; 
            private String templateCode; 
            private String templateType; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.allowSend = model.allowSend;
                this.auditStatus = model.auditStatus;
                this.category = model.category;
                this.categoryChangePaused = model.categoryChangePaused;
                this.components = model.components;
                this.example = model.example;
                this.language = model.language;
                this.messageSendTtlSeconds = model.messageSendTtlSeconds;
                this.name = model.name;
                this.productSetId = model.productSetId;
                this.qualityScore = model.qualityScore;
                this.reason = model.reason;
                this.templateCode = model.templateCode;
                this.templateType = model.templateType;
            } 

            /**
             * <p>Indicates whether the current template can be sent. This parameter is valid only for marketing templates.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder allowSend(Boolean allowSend) {
                this.allowSend = allowSend;
                return this;
            }

            /**
             * <p>The review status. Valid values:</p>
             * <ul>
             * <li><p><strong>pass</strong>: Approved.</p>
             * </li>
             * <li><p><strong>fail</strong>: Rejected.</p>
             * </li>
             * <li><p><strong>auditing</strong>: Under review.</p>
             * </li>
             * <li><p><strong>unaudit</strong>: Review suspended.</p>
             * </li>
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
             * <p>The WhatsApp template category. Valid values:</p>
             * <ul>
             * <li><p><strong>UTILITY</strong>: Transaction-related.</p>
             * </li>
             * <li><p><strong>MARKETING</strong>: Marketing template.</p>
             * </li>
             * <li><p><strong>AUTHENTICATION</strong>: Authentication.</p>
             * </li>
             * </ul>
             * <p>The Viber template category. Valid values:</p>
             * <ul>
             * <li><p><strong>UTILITY</strong>: Transaction-related.</p>
             * </li>
             * <li><p><strong>MARKETING</strong>: Marketing template.</p>
             * </li>
             * <li><p><strong>AUTHENTICATION</strong>: Authentication.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>UTILITY</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>Indicates whether the template sending is paused when a utility template is changed to a marketing template.</p>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder categoryChangePaused(Boolean categoryChangePaused) {
                this.categoryChangePaused = categoryChangePaused;
                return this;
            }

            /**
             * <p>The list of message template components.</p>
             */
            public Builder components(java.util.List<Components> components) {
                this.components = components;
                return this;
            }

            /**
             * <p>The variable example.</p>
             */
            public Builder example(java.util.Map<String, String> example) {
                this.example = example;
                return this;
            }

            /**
             * <p>The template language. For more information about language codes, see <a href="https://help.aliyun.com/document_detail/463420.html">Language codes</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>en_US</p>
             */
            public Builder language(String language) {
                this.language = language;
                return this;
            }

            /**
             * <p>The time-to-live (TTL) of the message in seconds when sending messages by using WhatsApp authentication templates.</p>
             * 
             * <strong>example:</strong>
             * <p>120</p>
             */
            public Builder messageSendTtlSeconds(Integer messageSendTtlSeconds) {
                this.messageSendTtlSeconds = messageSendTtlSeconds;
                return this;
            }

            /**
             * <p>The template name.</p>
             * 
             * <strong>example:</strong>
             * <p>hello_whatsapp</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>productSetId</p>
             * 
             * <strong>example:</strong>
             * <p>939***</p>
             */
            public Builder productSetId(String productSetId) {
                this.productSetId = productSetId;
                return this;
            }

            /**
             * <p>The quality of the template. Valid values:</p>
             * <ul>
             * <li>RED: Low quality.</li>
             * <li>YELLOW: Medium quality.</li>
             * <li>UNKNOWN: Unknown quality.</li>
             * <li>GREEN: High quality.</li>
             * </ul>
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
             * <p>The template code.</p>
             * 
             * <strong>example:</strong>
             * <p>744c4b5c79c9432497a075bdfca3****</p>
             */
            public Builder templateCode(String templateCode) {
                this.templateCode = templateCode;
                return this;
            }

            /**
             * <p>The templatetype. Valid values:</p>
             * <ul>
             * <li><p><strong>WHATSAPP</strong></p>
             * </li>
             * <li><p><strong>VIBER</strong></p>
             * </li>
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
