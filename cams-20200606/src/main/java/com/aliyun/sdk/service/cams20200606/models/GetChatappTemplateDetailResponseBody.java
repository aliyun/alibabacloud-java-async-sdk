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
         * 返回结果 OK 为正常
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * TemplateDetail
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * 请求ID
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
             * 电话号码
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
             * 所发送消息的文本
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            /**
             * 按钮类型
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * 当按钮类型是
             * <p>
             * URL 时有效
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            /**
             * WEB地址类型
             * <p>
             * static-静态
             * dynamic-动态
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
            this.addSecretRecommendation = builder.addSecretRecommendation;
            this.buttons = builder.buttons;
            this.caption = builder.caption;
            this.codeExpirationMinutes = builder.codeExpirationMinutes;
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
            private Boolean addSecretRecommendation; 
            private java.util.List < Buttons> buttons; 
            private String caption; 
            private Integer codeExpirationMinutes; 
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
             * Whatsapp类型模板，Category为Authentication，并且Component Type为Body时有效，表示在Body上面显示不要将验证码信息提供给其它人的提示信息
             */
            public Builder addSecretRecommendation(Boolean addSecretRecommendation) {
                this.addSecretRecommendation = addSecretRecommendation;
                return this;
            }

            /**
             * 仅适用于 BUTTONS 类型。
             * <p>
             * 与按钮相关的参数。
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
             * Whatsapp Authentication模板验证码有效期（分钟），只在Whatsapp类型消息，Category为Authentication并且Component Type为Footer时有效（此信息显示在Footer位置）
             */
            public Builder codeExpirationMinutes(Integer codeExpirationMinutes) {
                this.codeExpirationMinutes = codeExpirationMinutes;
                return this;
            }

            /**
             * Viber视频消息的视频时长，取值范围 0 - 600
             */
            public Builder duration(Integer duration) {
                this.duration = duration;
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
             * Viber文件消息的文件类型
             */
            public Builder fileType(String fileType) {
                this.fileType = fileType;
                return this;
            }

            /**
             * 格式
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
             * 所发送消息的文本
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            /**
             * Viber带视频消息的缩略图
             */
            public Builder thumbUrl(String thumbUrl) {
                this.thumbUrl = thumbUrl;
                return this;
            }

            /**
             * 组件类型
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
             * 审核状态
             */
            public Builder auditStatus(String auditStatus) {
                this.auditStatus = auditStatus;
                return this;
            }

            /**
             * 模板分类
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * 消息模板组件
             */
            public Builder components(java.util.List < Components> components) {
                this.components = components;
                return this;
            }

            /**
             * 变量例子
             */
            public Builder example(java.util.Map < String, String > example) {
                this.example = example;
                return this;
            }

            /**
             * 语言
             */
            public Builder language(String language) {
                this.language = language;
                return this;
            }

            /**
             * 模板名称
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * 模板编码
             */
            public Builder templateCode(String templateCode) {
                this.templateCode = templateCode;
                return this;
            }

            /**
             * 模板类型，取值为WHATSAPP/VIBER
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
