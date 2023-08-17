// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyChatappTemplateRequest} extends {@link RequestModel}
 *
 * <p>ModifyChatappTemplateRequest</p>
 */
public class ModifyChatappTemplateRequest extends Request {
    @Body
    @NameInMap("Category")
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
    @NameInMap("MessageSendTtlSeconds")
    @Validation(maximum = 600, minimum = 60)
    private Integer messageSendTtlSeconds;

    @Body
    @NameInMap("TemplateCode")
    @Validation(required = true)
    private String templateCode;

    @Body
    @NameInMap("TemplateType")
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

    public static final class Builder extends Request.Builder<ModifyChatappTemplateRequest, Builder> {
        private String category; 
        private java.util.List < Components> components; 
        private String custSpaceId; 
        private String custWabaId; 
        private java.util.Map < String, String > example; 
        private String isvCode; 
        private String language; 
        private Integer messageSendTtlSeconds; 
        private String templateCode; 
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
            this.templateType = request.templateType;
        } 

        /**
         * Category.
         */
        public Builder category(String category) {
            this.putBodyParameter("Category", category);
            this.category = category;
            return this;
        }

        /**
         * Components.
         */
        public Builder components(java.util.List < Components> components) {
            String componentsShrink = shrink(components, "Components", "json");
            this.putBodyParameter("Components", componentsShrink);
            this.components = components;
            return this;
        }

        /**
         * CustSpaceId.
         */
        public Builder custSpaceId(String custSpaceId) {
            this.putBodyParameter("CustSpaceId", custSpaceId);
            this.custSpaceId = custSpaceId;
            return this;
        }

        /**
         * CustWabaId.
         */
        public Builder custWabaId(String custWabaId) {
            this.putBodyParameter("CustWabaId", custWabaId);
            this.custWabaId = custWabaId;
            return this;
        }

        /**
         * Example.
         */
        public Builder example(java.util.Map < String, String > example) {
            String exampleShrink = shrink(example, "Example", "json");
            this.putBodyParameter("Example", exampleShrink);
            this.example = example;
            return this;
        }

        /**
         * IsvCode.
         */
        public Builder isvCode(String isvCode) {
            this.putBodyParameter("IsvCode", isvCode);
            this.isvCode = isvCode;
            return this;
        }

        /**
         * Language.
         */
        public Builder language(String language) {
            this.putBodyParameter("Language", language);
            this.language = language;
            return this;
        }

        /**
         * MessageSendTtlSeconds.
         */
        public Builder messageSendTtlSeconds(Integer messageSendTtlSeconds) {
            this.putBodyParameter("MessageSendTtlSeconds", messageSendTtlSeconds);
            this.messageSendTtlSeconds = messageSendTtlSeconds;
            return this;
        }

        /**
         * TemplateCode.
         */
        public Builder templateCode(String templateCode) {
            this.putBodyParameter("TemplateCode", templateCode);
            this.templateCode = templateCode;
            return this;
        }

        /**
         * TemplateType.
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

    public static class Buttons extends TeaModel {
        @NameInMap("AutofillText")
        private String autofillText;

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
        @Validation(required = true)
        private String type;

        @NameInMap("Url")
        private String url;

        @NameInMap("UrlType")
        private String urlType;

        private Buttons(Builder builder) {
            this.autofillText = builder.autofillText;
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
            private Boolean isOptOut; 
            private String packageName; 
            private String phoneNumber; 
            private String signatureHash; 
            private String text; 
            private String type; 
            private String url; 
            private String urlType; 

            /**
             * AutofillText.
             */
            public Builder autofillText(String autofillText) {
                this.autofillText = autofillText;
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
             * Text.
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            /**
             * Type.
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
    public static class Components extends TeaModel {
        @NameInMap("AddSecretRecommendation")
        private Boolean addSecretRecommendation;

        @NameInMap("Buttons")
        private java.util.List < Buttons> buttons;

        @NameInMap("Caption")
        private String caption;

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
            this.addSecretRecommendation = builder.addSecretRecommendation;
            this.buttons = builder.buttons;
            this.caption = builder.caption;
            this.codeExpirationMinutes = builder.codeExpirationMinutes;
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
            private Integer codeExpirationMinutes; 
            private Integer duration; 
            private String fileName; 
            private String fileType; 
            private String format; 
            private String text; 
            private String thumbUrl; 
            private String type; 
            private String url; 

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
            public Builder buttons(java.util.List < Buttons> buttons) {
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
             * Type.
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
