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
    @NameInMap("Components")
    @Validation(required = true)
    private java.util.List < Components> components;

    @Body
    @NameInMap("CustWabaId")
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
    @NameInMap("TemplateCode")
    @Validation(required = true)
    private String templateCode;

    private ModifyChatappTemplateRequest(Builder builder) {
        super(builder);
        this.components = builder.components;
        this.custWabaId = builder.custWabaId;
        this.example = builder.example;
        this.isvCode = builder.isvCode;
        this.language = builder.language;
        this.templateCode = builder.templateCode;
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
     * @return components
     */
    public java.util.List < Components> getComponents() {
        return this.components;
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
     * @return templateCode
     */
    public String getTemplateCode() {
        return this.templateCode;
    }

    public static final class Builder extends Request.Builder<ModifyChatappTemplateRequest, Builder> {
        private java.util.List < Components> components; 
        private String custWabaId; 
        private java.util.Map < String, String > example; 
        private String isvCode; 
        private String language; 
        private String templateCode; 

        private Builder() {
            super();
        } 

        private Builder(ModifyChatappTemplateRequest request) {
            super(request);
            this.components = request.components;
            this.custWabaId = request.custWabaId;
            this.example = request.example;
            this.isvCode = request.isvCode;
            this.language = request.language;
            this.templateCode = request.templateCode;
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
         * ISV客户WabaId
         */
        public Builder custWabaId(String custWabaId) {
            this.putBodyParameter("CustWabaId", custWabaId);
            this.custWabaId = custWabaId;
            return this;
        }

        /**
         * 变量，KEY-VALUE结构
         */
        public Builder example(java.util.Map < String, String > example) {
            String exampleShrink = shrink(example, "Example", "json");
            this.putBodyParameter("Example", exampleShrink);
            this.example = example;
            return this;
        }

        /**
         * Isv校验码，用于校验子帐号是否由ISV授权
         */
        public Builder isvCode(String isvCode) {
            this.putBodyParameter("IsvCode", isvCode);
            this.isvCode = isvCode;
            return this;
        }

        /**
         * 语言
         */
        public Builder language(String language) {
            this.putBodyParameter("Language", language);
            this.language = language;
            return this;
        }

        /**
         * 消息模板编码
         */
        public Builder templateCode(String templateCode) {
            this.putBodyParameter("TemplateCode", templateCode);
            this.templateCode = templateCode;
            return this;
        }

        @Override
        public ModifyChatappTemplateRequest build() {
            return new ModifyChatappTemplateRequest(this);
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
             * 号码
             */
            public Builder phoneNumber(String phoneNumber) {
                this.phoneNumber = phoneNumber;
                return this;
            }

            /**
             * 所发送消息的文本
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            /**
             * 按钮类型
             * <p>
             * PHONE_NUMBER（电话）,URL（网页按钮）和QUICK_REPLY（快速回复）
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * 点击按钮后将访问的网址
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            /**
             * 网址类型 static-静态dynamic-动态
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

        @NameInMap("FileName")
        private String fileName;

        @NameInMap("Format")
        private String format;

        @NameInMap("Text")
        private String text;

        @NameInMap("Type")
        @Validation(required = true)
        private String type;

        @NameInMap("Url")
        private String url;

        private Components(Builder builder) {
            this.buttons = builder.buttons;
            this.caption = builder.caption;
            this.fileName = builder.fileName;
            this.format = builder.format;
            this.text = builder.text;
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
         * @return fileName
         */
        public String getFileName() {
            return this.fileName;
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
            private java.util.List < Buttons> buttons; 
            private String caption; 
            private String fileName; 
            private String format; 
            private String text; 
            private String type; 
            private String url; 

            /**
             * 按钮
             */
            public Builder buttons(java.util.List < Buttons> buttons) {
                this.buttons = buttons;
                return this;
            }

            /**
             * 描述，当Type为Header，且Format为IMGAGE/DOCUMENT/VIDEO 可以增加描述
             */
            public Builder caption(String caption) {
                this.caption = caption;
                return this;
            }

            /**
             * 文件名称，当Type为Header，且Format为DOCUMENT时可以给文件指定名称
             */
            public Builder fileName(String fileName) {
                this.fileName = fileName;
                return this;
            }

            /**
             * 格式
             * <p>
             * TEXT-文本 IMGAGE-图片 DOCUMENT-文档 VIDEO-视频
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            /**
             * 所发送消息的文本
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            /**
             * 组件类型
             * <p>
             * 值：BODY、HEADER、FOOTER 和 BUTTONS
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * 素材路径
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
