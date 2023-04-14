// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateChatappTemplateRequest} extends {@link RequestModel}
 *
 * <p>CreateChatappTemplateRequest</p>
 */
public class CreateChatappTemplateRequest extends Request {
    @Body
    @NameInMap("AllowCategoryChange")
    private Boolean allowCategoryChange;

    @Body
    @NameInMap("Category")
    @Validation(required = true)
    private String category;

    @Body
    @NameInMap("Components")
    @Validation(required = true)
    private java.util.List < Components> components;

    @Body
    @NameInMap("CustSpaceId")
    private String custSpaceId;

    @Body
    @NameInMap("CustWabaId")
    @Deprecated
    private String custWabaId;

    @Body
    @NameInMap("Example")
    private java.util.Map < String, String > example;

    @Body
    @NameInMap("IsvCode")
    private String isvCode;

    @Body
    @NameInMap("Language")
    @Validation(required = true)
    private String language;

    @Body
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Body
    @NameInMap("TemplateType")
    @Validation(required = true)
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
            this.name = request.name;
            this.templateType = request.templateType;
        } 

        /**
         * 是否允许facebook自动变更模板的目录（这样能提高模板的审核通过率）此属性只对TemplateType=WHATSAPP有效
         */
        public Builder allowCategoryChange(Boolean allowCategoryChange) {
            this.putBodyParameter("AllowCategoryChange", allowCategoryChange);
            this.allowCategoryChange = allowCategoryChange;
            return this;
        }

        /**
         * The category of the template when the TemplateType parameter is set to WHATSAPP. Valid values:
         * <p>
         * 
         * *   **TRANSACTIONAL**: a transactional template
         * *   **MARKETING**: a marketing template
         * *   **OTP**: a one-time password template
         * 
         * The category of the template when the TemplateType parameter is set to VIBER. Valid values:
         * 
         * *   **text**: a text message template
         * *   **image**: an image message template
         * *   **text_image_button**: a template that contains multiple media objects, including text, image, and button
         * *   **text_button**: a template that contains the text and button media objects
         * *   **document**: a document message template
         * *   **video**: a video message template
         * *   **text_video**: a template that contains the text and video media objects
         * *   **text_video_button**: a template that contains multiple media objects, including text, video, and button
         * *   **text_image**: a template that contains the text and image media objects
         */
        public Builder category(String category) {
            this.putBodyParameter("Category", category);
            this.category = category;
            return this;
        }

        /**
         * The list of components of the message template.
         */
        public Builder components(java.util.List < Components> components) {
            String componentsShrink = shrink(components, "Components", "json");
            this.putBodyParameter("Components", componentsShrink);
            this.components = components;
            return this;
        }

        /**
         * ISV子客户的SpaceId
         */
        public Builder custSpaceId(String custSpaceId) {
            this.putBodyParameter("CustSpaceId", custSpaceId);
            this.custSpaceId = custSpaceId;
            return this;
        }

        /**
         * The ID of the WhatsApp account that you register.
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
         * The ISV verification code, which is used to verify whether the user is authorized by the ISV account.
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
         * *   LINE: the LINE message template. The LINE message template is under development.
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

    public static class Buttons extends TeaModel {
        @NameInMap("PhoneNumber")
        private String phoneNumber;

        @NameInMap("Text")
        private String text;

        @NameInMap("Type")
        @Validation(required = true)
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
             * The phone number. This parameter is valid only if the Type parameter is set to **PHONE_NUMBER**.
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
             * *   When the TemplateType parameter is set to WHATSAPP, if you have created a website link or a phone number link, you cannot create an quick reply button.
             * 
             * *   When the TemplateType parameter is set to WHATSAPP, you can add a combination of two URL buttons or a combination of a URL button and a phone number button to a message template.
             * 
             * *   When the TemplateType parameter is set to VIBER, you can add only one button and the button must be of the URL type.
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

        @NameInMap("Text")
        private String text;

        @NameInMap("ThumbUrl")
        private String thumbUrl;

        @NameInMap("Type")
        @Validation(required = true)
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
            private String text; 
            private String thumbUrl; 
            private String type; 
            private String url; 

            /**
             * The list of buttons, which applies only to the **BUTTONS** component.
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
             * The duration of the video message when the TemplateType parameter is set to VIBER. Valid values: 0 to 600. Unit: seconds.
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
             * The type of the file when the TemplateType parameter is set to VIBER.
             */
            public Builder fileType(String fileType) {
                this.fileType = fileType;
                return this;
            }

            /**
             * The type of the media resources that are included in the message.
             * <p>
             * 
             * *   **TEXT**: text
             * *   **IMAGE**: image
             * *   **DOCUMENT**: document
             * *   **VIDEO**: video
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            /**
             * The text of the message that is sent.
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            /**
             * The thumbnail URL of the video message when the TemplateType parameter is set to VIBER.
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
             * > When the TemplateType parameter is set to WHATSAPP, the component of the **BODY** type cannot exceed 1,024 characters in length. The component of the **HEADER** or **FOOTER** type cannot exceed 60 characters in length.
             * 
             * > When the TemplateType parameter is set to VIBER, the **FOOTER** parameter is invalid.
             * 
             * > When the TemplateType parameter is set to VIBER, media objects including image, video, and text are placed in the **HEADER** component. A device displays that the image is placed below the text.
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
}
