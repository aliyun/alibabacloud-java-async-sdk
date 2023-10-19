// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetChatappTemplateDetailResponseBody} extends {@link TeaModel}
 *
 * <p>GetChatappTemplateDetailResponseBody</p>
 */
public class GetChatappTemplateDetailResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    private String accessDeniedDetail;

    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
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
        @NameInMap("Action")
        private String action;

        @NameInMap("IntentCode")
        private String intentCode;

        @NameInMap("NextLanguageCode")
        private String nextLanguageCode;

        @NameInMap("NextTemplateCode")
        private String nextTemplateCode;

        @NameInMap("NextTemplateName")
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
             * 事件类型
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * 意图编码
             */
            public Builder intentCode(String intentCode) {
                this.intentCode = intentCode;
                return this;
            }

            /**
             * 下一个模板语言
             */
            public Builder nextLanguageCode(String nextLanguageCode) {
                this.nextLanguageCode = nextLanguageCode;
                return this;
            }

            /**
             * 下一个模板编码
             */
            public Builder nextTemplateCode(String nextTemplateCode) {
                this.nextTemplateCode = nextTemplateCode;
                return this;
            }

            /**
             * 下一个模板名称
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
    public static class Buttons extends TeaModel {
        @NameInMap("AutofillText")
        private String autofillText;

        @NameInMap("CouponCode")
        private String couponCode;

        @NameInMap("ExtendAttrs")
        private ExtendAttrs extendAttrs;

        @NameInMap("IsOptOut")
        private Boolean isOptOut;

        @NameInMap("PackageName")
        private String packageName;

        @NameInMap("PhoneNumber")
        private String phoneNumber;

        @NameInMap("SignatureHash")
        private String signatureHash;

        @NameInMap("Text")
        private String text;

        @NameInMap("Type")
        private String type;

        @NameInMap("Url")
        private String url;

        @NameInMap("UrlType")
        private String urlType;

        private Buttons(Builder builder) {
            this.autofillText = builder.autofillText;
            this.couponCode = builder.couponCode;
            this.extendAttrs = builder.extendAttrs;
            this.isOptOut = builder.isOptOut;
            this.packageName = builder.packageName;
            this.phoneNumber = builder.phoneNumber;
            this.signatureHash = builder.signatureHash;
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
         * @return isOptOut
         */
        public Boolean getIsOptOut() {
            return this.isOptOut;
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
            private Boolean isOptOut; 
            private String packageName; 
            private String phoneNumber; 
            private String signatureHash; 
            private String text; 
            private String type; 
            private String url; 
            private String urlType; 

            /**
             * Whatsapp模板，Category为Authentication，并且Button Type为ONE_TAP时必填，Whatsap Autofill操作的按钮文本
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
             * 扩展字段
             */
            public Builder extendAttrs(ExtendAttrs extendAttrs) {
                this.extendAttrs = extendAttrs;
                return this;
            }

            /**
             * Whatsapp模板，在Category为Marketing,并且Button type为QUICK_REPLY时有效，表示按钮为营销退订按钮，客户如果点击了此按钮，并且在chatapp平台上配置了发送控制操作，则后续Marketing消息则不会发送到客户
             */
            public Builder isOptOut(Boolean isOptOut) {
                this.isOptOut = isOptOut;
                return this;
            }

            /**
             * Whatsapp模板，Category为Authentication，并且Button Type为ONE_TAP时必填，表示Whatsapp调起应用的包名
             */
            public Builder packageName(String packageName) {
                this.packageName = packageName;
                return this;
            }

            /**
             * The phone number. This parameter is valid only if the returned value of the Type parameter is **PHONE_NUMBER**.
             */
            public Builder phoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
                return this;
            }

            /**
             * Whatsapp模板，Category为Authentication，并且Button Type为ONE_TAP时必填，表示Whatsapp调起应用的签名Hash值
             */
            public Builder signatureHash(String signatureHash) {
                this.signatureHash = signatureHash;
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
             * *   **PHONE_NUMBER**: a phone call button
             * *   **URL**: a URL button
             * *   **QUICK_REPLY**: a quick reply button
             * 
             * > 
             * 
             * *   A quick reply button cannot coexist with a phone call button or a URL button in a message template.
             * 
             * *   You can add a combination of two URL buttons or a combination of a URL button and a phone call button to a message template.
             * 
             * *   You can add only one button to a Viber message template, and the button must be a URL button.
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
             * The type of the URL. Valid values:
             * <p>
             * 
             * *   **static**: a static URL
             * *   **dynamic**: a dynamic URL
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
        @NameInMap("PhoneNumber")
        private String phoneNumber;

        @NameInMap("Text")
        private String text;

        @NameInMap("Type")
        private String type;

        @NameInMap("Url")
        private String url;

        @NameInMap("UrlType")
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
             * The phone number. This parameter is valid only if the returned value of the Type parameter is **PHONE_NUMBER**.
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
             * *   **PHONE_NUMBER**: a phone call button
             * *   **URL**: a URL button
             * *   **QUICK_REPLY**: a quick reply button
             * 
             * > 
             * 
             * *   A quick reply button cannot coexist with a phone call button or a URL button in a message template.
             * 
             * *   You can add a combination of two URL buttons or a combination of a URL button and a phone call button to a message template.
             * 
             * *   You can add only one button to a Viber message template, and the button must be a URL button.
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
             * The type of the URL. Valid values:
             * <p>
             * 
             * *   **static**: a static URL
             * *   **dynamic**: a dynamic URL
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
        @NameInMap("Buttons")
        private java.util.List < CardComponentsButtons> buttons;

        @NameInMap("Format")
        private String format;

        @NameInMap("Text")
        private String text;

        @NameInMap("Type")
        private String type;

        @NameInMap("Url")
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
             * *   **PHONE_NUMBER**: a phone call button
             * *   **URL**: a URL button
             * *   **QUICK_REPLY**: a quick reply button
             * 
             * > 
             * 
             * *   A quick reply button cannot coexist with a phone call button or a URL button in a message template.
             * 
             * *   You can add a combination of two URL buttons or a combination of a URL button and a phone call button to a message template.
             * 
             * *   You can add only one button to a Viber message template, and the button must be a URL button.
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

            public CardComponents build() {
                return new CardComponents(this);
            } 

        } 

    }
    public static class Cards extends TeaModel {
        @NameInMap("CardComponents")
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
        @NameInMap("AddSecretRecommendation")
        private Boolean addSecretRecommendation;

        @NameInMap("Buttons")
        private java.util.List < Buttons> buttons;

        @NameInMap("Caption")
        private String caption;

        @NameInMap("Cards")
        private java.util.List < Cards> cards;

        @NameInMap("CodeExpirationMinutes")
        @Validation(maximum = 90, minimum = 1)
        private Integer codeExpirationMinutes;

        @NameInMap("Duration")
        private Integer duration;

        @NameInMap("FileName")
        private String fileName;

        @NameInMap("FileType")
        private String fileType;

        @NameInMap("Format")
        private String format;

        @NameInMap("Latitude")
        private String latitude;

        @NameInMap("LocationAddress")
        private String locationAddress;

        @NameInMap("LocationName")
        private String locationName;

        @NameInMap("Longitude")
        private String longitude;

        @NameInMap("OfferExpirationTimeMs")
        private String offerExpirationTimeMs;

        @NameInMap("Text")
        private String text;

        @NameInMap("ThumbUrl")
        private String thumbUrl;

        @NameInMap("Type")
        private String type;

        @NameInMap("Url")
        private String url;

        @NameInMap("hasExpiration")
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
             * Whatsapp类型模板，Category为Authentication，并且Component Type为Body时有效，表示在Body上面显示不要将验证码信息提供给其它人的提示信息
             */
            public Builder addSecretRecommendation(Boolean addSecretRecommendation) {
                this.addSecretRecommendation = addSecretRecommendation;
                return this;
            }

            /**
             * This parameter applies only to components of the **BUTTONS** type. This parameter is passed in by converting its original JSON structure into a string.
             */
            public Builder buttons(java.util.List < Buttons> buttons) {
                this.buttons = buttons;
                return this;
            }

            /**
             * The description of the file.
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
             * Whatsapp Authentication模板验证码有效期（分钟），只在Whatsapp类型消息，Category为Authentication并且Component Type为Footer时有效（此信息显示在Footer位置）
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
             * The name of the file.
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * The type of the file attached in the Viber message template.
             */
            public Builder fileType(String fileType) {
                this.fileType = fileType;
                return this;
            }

            /**
             * The type of the media resources that are included in the message.
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            /**
             * 位置纬度属性
             */
            public Builder latitude(String latitude) {
                this.latitude = latitude;
                return this;
            }

            /**
             * 位置地址
             */
            public Builder locationAddress(String locationAddress) {
                this.locationAddress = locationAddress;
                return this;
            }

            /**
             * 位置名称
             */
            public Builder locationName(String locationName) {
                this.locationName = locationName;
                return this;
            }

            /**
             * 位置经度属性
             */
            public Builder longitude(String longitude) {
                this.longitude = longitude;
                return this;
            }

            /**
             * OfferExpirationTimeMs.
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
             * *   The following limits apply to components in WhatsApp message templates: A component of the **BODY** type cannot exceed 1,024 characters. A component of the **HEADER** or **FOOTER** type cannot exceed 60 characters in length.
             * 
             * > 
             * 
             * *   **FOOTER** components are not supported in Viber message templates.
             * 
             * > 
             * 
             * *   In a Viber message template, a media resource, such as an image, a video, or a file, is placed in the **HEADER** component. If a Viber message contains text and an image, the image is placed under the text in the message received on a device.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The URL of the material.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            /**
             * hasExpiration.
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
        @NameInMap("AuditStatus")
        private String auditStatus;

        @NameInMap("Category")
        private String category;

        @NameInMap("Components")
        private java.util.List < Components> components;

        @NameInMap("Example")
        private java.util.Map < String, String > example;

        @NameInMap("Language")
        private String language;

        @NameInMap("MessageSendTtlSeconds")
        @Validation(maximum = 600, minimum = 60)
        private Integer messageSendTtlSeconds;

        @NameInMap("Name")
        private String name;

        @NameInMap("QualityScore")
        private String qualityScore;

        @NameInMap("Reason")
        private String reason;

        @NameInMap("TemplateCode")
        private String templateCode;

        @NameInMap("TemplateType")
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
             * Whatsapp中Authentication类型模板发送消息时的消息有效期
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
             * 模板质量
             */
            public Builder qualityScore(String qualityScore) {
                this.qualityScore = qualityScore;
                return this;
            }

            /**
             * Reason.
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
