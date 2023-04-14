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
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    private GetChatappTemplateDetailResponseBody(Builder builder) {
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
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 

        /**
         * The HTTP status code returned.
         * <p>
         * 
         * *   A value of OK indicates that the call is successful.
         * *   Other values indicate that the call fails. For more information, see [Error codes](~~196974~~).
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * The data returned.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The error message returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetChatappTemplateDetailResponseBody build() {
            return new GetChatappTemplateDetailResponseBody(this);
        } 

    } 

    public static class Buttons extends TeaModel {
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

        private Buttons(Builder builder) {
            this.phoneNumber = builder.phoneNumber;
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
             * The phone number. This parameter is valid only if the return value of the Type parameter is **PHONE_NUMBER**.
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
             * *   **PHONE_NUMBER**: a phone number button
             * *   **URL**: a URL button
             * *   **QUICK_REPLY**: a quick reply button
             * 
             * > 
             * 
             * *   If you have created a URL button or a phone number button, you cannot create a quick reply button.
             * 
             * *   You can add a combination of two URL buttons or a combination of a URL button and a phone number button to a message template.
             * 
             * *   You can add only one button to a Viber message template, and the button must be a URL button.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * The URL to be accessed when users click the URL button.
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
    public static class Components extends TeaModel {
        @NameInMap("Buttons")
        private java.util.List < Buttons> buttons;

        @NameInMap("Caption")
        private String caption;

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

        @NameInMap("Text")
        private String text;

        @NameInMap("ThumbUrl")
        private String thumbUrl;

        @NameInMap("Type")
        private String type;

        @NameInMap("Url")
        private String url;

        private Components(Builder builder) {
            this.buttons = builder.buttons;
            this.caption = builder.caption;
            this.duration = builder.duration;
            this.fileName = builder.fileName;
            this.fileType = builder.fileType;
            this.format = builder.format;
            this.latitude = builder.latitude;
            this.locationAddress = builder.locationAddress;
            this.locationName = builder.locationName;
            this.longitude = builder.longitude;
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
            private java.util.List < Buttons> buttons; 
            private String caption; 
            private Integer duration; 
            private String fileName; 
            private String fileType; 
            private String format; 
            private String latitude; 
            private String locationAddress; 
            private String locationName; 
            private String longitude; 
            private String text; 
            private String thumbUrl; 
            private String type; 
            private String url; 

            /**
             * This parameter is applicable only to components of the **BUTTONS** type.
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
             * The duration of the video used in the Viber message template. Valid values: 0 to 600. Unit: seconds.
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
             * The format.
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
             * The text of the message to be sent.
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            /**
             * The thumbnail URL of the video used in the Viber message template.
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
             * *   In a Viber message template, a media object, such as an image, a video, or a document, is placed in the **HEADER** component. If a Viber message contains text and an image, the image is placed under the text in the message received on a device.
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

        @NameInMap("Name")
        private String name;

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
            this.name = builder.name;
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
         * @return name
         */
        public String getName() {
            return this.name;
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
            private String name; 
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
             * The category of the template when the return value of the TemplateType parameter is WHATSAPP. Valid values:
             * <p>
             * 
             * *   **TRANSACTIONAL**: a transactional template
             * *   **MARKETING**: a marketing template
             * *   **OTP**: a one-time password template
             * 
             * The category of the template when the return value of the TemplateType parameter is VIBER. Valid values:
             * 
             * *   **text**: a text message template
             * *   **image**: an image message template
             * *   **text_image_button**: a template that contains multiple media objects, including text, image, and button
             * *   **text_button**: a template that contains the text and button media objects
             * *   **document**: a template that contains a document attachment
             * *   **video**: a video message template
             * *   **text_video**: a template that contains the text and video media objects
             * *   **text_video_button**: a template that contains multiple media objects, including text, video, and button
             * *   **text_image**: a template that contains the text and image media objects
             * 
             * > When the category of a Viber message template is text_video_button, users cannot open a web page by clicking the button. Users can open only the video in the message. In this case, you do not need to specify the Url parameter for the URL button in the template.
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
             * The name of the message template.
             */
            public Builder name(String name) {
                this.name = name;
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
             * The type of the message template.
             * <p>
             * 
             * *   **WHATSAPP**
             * *   **VIBER**
             * *   LINE: the LINE message template. This type of message template will be released later.
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
