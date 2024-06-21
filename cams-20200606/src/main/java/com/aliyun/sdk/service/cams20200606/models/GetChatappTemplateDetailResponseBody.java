// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
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

        /**
         * AccessDeniedDetail.
         */
        public Builder accessDeniedDetail(String accessDeniedDetail) {
            this.accessDeniedDetail = accessDeniedDetail;
            return this;
        }

        /**
         * The HTTP status code.
         * <p>
         * 
         * *   Example: OK. This value indicates that the request is successful.
         * *   Other codes indicate that the request fails. For more information, see [Error codes](~~196974~~).
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The returned data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The error message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetChatappTemplateDetailResponseBody build() {
            return new GetChatappTemplateDetailResponseBody(this);
        } 

    } 

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

            /**
             * The event type.
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * The intent code.
             */
            public Builder intentCode(String intentCode) {
                this.intentCode = intentCode;
                return this;
            }

            /**
             * The language of the next template.
             */
            public Builder nextLanguageCode(String nextLanguageCode) {
                this.nextLanguageCode = nextLanguageCode;
                return this;
            }

            /**
             * The code of the next template.
             */
            public Builder nextTemplateCode(String nextTemplateCode) {
                this.nextTemplateCode = nextTemplateCode;
                return this;
            }

            /**
             * The name of the next template.
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
        private java.util.List < SupportedApps> supportedApps;

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
            private ExtendAttrs extendAttrs; 
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
             * The text of the one-tap autofill button. This parameter is required if Category is set to AUTHENTICATION and the Type sub-parameter of the Buttons parameter is set to ONE_TAP in a WhatsApp message template.
             */
            public Builder autofillText(String autofillText) {
                this.autofillText = autofillText;
                return this;
            }

            /**
             * The coupon code.
             */
            public Builder couponCode(String couponCode) {
                this.couponCode = couponCode;
                return this;
            }

            /**
             * The extended fields.
             */
            public Builder extendAttrs(ExtendAttrs extendAttrs) {
                this.extendAttrs = extendAttrs;
                return this;
            }

            /**
             * flow 数据事件类型
             * <p>
             * 取值范围：NAVIGATE/DATA_EXCHANGE
             */
            public Builder flowAction(String flowAction) {
                this.flowAction = flowAction;
                return this;
            }

            /**
             * Flow ID
             */
            public Builder flowId(String flowId) {
                this.flowId = flowId;
                return this;
            }

            /**
             * The unsubscribe button. This parameter is valid if Category is set to MARKETING and the Type sub-parameter of the Buttons parameter is set to QUICK_REPLY in a WhatsApp message template. After you configure message sending in the ChatApp Message Service console, marketing messages will not be sent to customers if they click this button.
             */
            public Builder isOptOut(Boolean isOptOut) {
                this.isOptOut = isOptOut;
                return this;
            }

            /**
             * 跳转屏 
             * <p>
             * 在FlowAction=NAVIGATE时必填
             */
            public Builder navigateScreen(String navigateScreen) {
                this.navigateScreen = navigateScreen;
                return this;
            }

            /**
             * The app package name that WhatsApp uses to load your app. This parameter is required if Category is set to AUTHENTICATION and the Type sub-parameter of the Buttons parameter is set to ONE_TAP in a WhatsApp message template.
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
             * The app signing key hash that WhatsApp uses to load your app. This parameter is required if Category is set to AUTHENTICATION and the Type sub-parameter of the Buttons parameter is set to ONE_TAP in a WhatsApp message template.
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
             * 
             * > 
             * 
             * *   In a message template, a quick reply button cannot be used together with a phone call button or a URL button.
             * 
             * *   You can add a combination of two URL buttons or a combination of a URL button and a phone call button to a message template.
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
             * The phone number.
             */
            public Builder phoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
                return this;
            }

            /**
             * The button content.
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            /**
             * The type of the button in the carousel template. Valid values: URL, PHONE_NUMBER, and QUICK_REQLY.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The URL to be accessed when you click the URL button.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            /**
             * The type of the URL. Valid values: static and dynamic.
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
             * The card buttons.
             */
            public Builder buttons(java.util.List < CardComponentsButtons> buttons) {
                this.buttons = buttons;
                return this;
            }

            /**
             * The type of the header in the carousel template. The header can only be an image or a video. The headers of all cards must be the same.
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            /**
             * The card text.
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            /**
             * The type of the component.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The URL address.
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
             * The card components.
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
            private java.util.List < Buttons> buttons; 
            private String caption; 
            private java.util.List < Cards> cards; 
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

            /**
             * The note indicating that customers cannot share verification codes with others. The note is displayed in the message body. This parameter is valid if Category is set to AUTHENTICATION and the Type sub-parameter of the Components parameter is set to BODY in a WhatsApp message template.
             */
            public Builder addSecretRecommendation(Boolean addSecretRecommendation) {
                this.addSecretRecommendation = addSecretRecommendation;
                return this;
            }

            /**
             * The buttons. Specify this parameter only if you set the Type sub-parameter of the Components parameter to **BUTTONS**. Before you specify this parameter, the format of the value must be changed from JSON to String.
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
             * The carousel cards.
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
             * The length of the video in the Viber message template. Valid values: 0 to 600. Unit: seconds.
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
             * The format.
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            /**
             * The latitude of the location.
             */
            public Builder latitude(String latitude) {
                this.latitude = latitude;
                return this;
            }

            /**
             * The address of the location.
             */
            public Builder locationAddress(String locationAddress) {
                this.locationAddress = locationAddress;
                return this;
            }

            /**
             * The name of the location.
             */
            public Builder locationName(String locationName) {
                this.locationName = locationName;
                return this;
            }

            /**
             * The longitude of the location.
             */
            public Builder longitude(String longitude) {
                this.longitude = longitude;
                return this;
            }

            /**
             * The variable when the coupon code expires in the limited-time offer template.
             */
            public Builder offerExpirationTimeMs(String offerExpirationTimeMs) {
                this.offerExpirationTimeMs = offerExpirationTimeMs;
                return this;
            }

            /**
             * The text of the message that you want to send.
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
             * *   The following limits apply to components in WhatsApp message templates: A **BODY** component cannot exceed 1,024 characters in length. A **HEADER** or **FOOTER** component cannot exceed 60 characters in length.
             * 
             * *   **FOOTER** components are not supported in Viber message templates.
             * 
             * *   In a Viber message template, media resources such as images, videos, and documents are placed in the **HEADER** component. If a Viber message contains both text and an image, the image is placed below the text in the message received on a device.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The URL of the media resource.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            /**
             * Indicates whether the coupon code will expire in the limited-time offer template.
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
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AuditStatus")
        private String auditStatus;

        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("Components")
        private java.util.List < Components> components;

        @com.aliyun.core.annotation.NameInMap("Example")
        private java.util.Map < String, String > example;

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
        public java.util.List < Components> getComponents() {
            return this.components;
        }

        /**
         * @return example
         */
        public java.util.Map < String, String > getExample() {
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
            private java.util.List < Components> components; 
            private java.util.Map < String, String > example; 
            private String language; 
            private Integer messageSendTtlSeconds; 
            private String name; 
            private String qualityScore; 
            private String reason; 
            private String templateCode; 
            private String templateType; 

            /**
             * The review status of the message template. Valid values:
             * <p>
             * 
             * *   **pass**: The message template is approved.
             * *   **fail**: The message template is rejected.
             * *   **auditing**: The message template is being reviewed.
             * *   **unaudit**: The review is suspended.
             */
            public Builder auditStatus(String auditStatus) {
                this.auditStatus = auditStatus;
                return this;
            }

            /**
             * The category of the template when the returned value of TemplateType is WHATSAPP. Valid values:
             * <p>
             * 
             * *   **UTILITY**: a transactional template
             * *   **MARKETING**: a marketing template
             * *   **AUTHENTICATION**: an identity authentication template
             * 
             * The category of the template when the returned value of the TemplateType parameter is VIBER. Valid values:
             * 
             * *   **text**: a template that contains only text
             * *   **image**: a template that contains only images
             * *   **text_image_button**: a template that contains text, images, and buttons
             * *   **text_button**: a template that contains text and buttons
             * *   **document**: a template that contains only files
             * *   **video**: a template that contains only videos
             * *   **text_video**: a template that contains text and videos
             * *   **text_video_button**: a template that contains text, videos, and buttons
             * *   **text_image**: a template that contains text and images
             * 
             * > If Category is set to text_video_button, users cannot open a web page by clicking the button. Users can open only the video in the message. In this case, you do not need to specify the Url parameter for the URL button in the template.
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * The components of the message template.
             */
            public Builder components(java.util.List < Components> components) {
                this.components = components;
                return this;
            }

            /**
             * The examples of variables.
             */
            public Builder example(java.util.Map < String, String > example) {
                this.example = example;
                return this;
            }

            /**
             * The language that is used in the message template. For more information, see [Language codes](~~463420~~).
             */
            public Builder language(String language) {
                this.language = language;
                return this;
            }

            /**
             * The validity period of the WhatsApp authentication message.
             */
            public Builder messageSendTtlSeconds(Integer messageSendTtlSeconds) {
                this.messageSendTtlSeconds = messageSendTtlSeconds;
                return this;
            }

            /**
             * The name of the message template.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * The quality of the template.
             */
            public Builder qualityScore(String qualityScore) {
                this.qualityScore = qualityScore;
                return this;
            }

            /**
             * The reason why the template was rejected.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * The code of the message template.
             */
            public Builder templateCode(String templateCode) {
                this.templateCode = templateCode;
                return this;
            }

            /**
             * The type of the message template. Valid values:
             * <p>
             * 
             * *   **WHATSAPP**
             * *   **VIBER**
             * *   LINE (developing)
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
