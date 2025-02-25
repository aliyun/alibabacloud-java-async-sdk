// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link PushingTarget} extends {@link TeaModel}
 *
 * <p>PushingTarget</p>
 */
public class PushingTarget extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Arn")
    private String arn;

    @com.aliyun.core.annotation.NameInMap("CreateTime")
    private String createTime;

    @com.aliyun.core.annotation.NameInMap("Description")
    private String description;

    @com.aliyun.core.annotation.NameInMap("HttpRequestTarget")
    private HttpRequestTarget httpRequestTarget;

    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.NameInMap("Range")
    private String range;

    @com.aliyun.core.annotation.NameInMap("TemplateUuid")
    private String templateUuid;

    @com.aliyun.core.annotation.NameInMap("Type")
    private String type;

    @com.aliyun.core.annotation.NameInMap("UpdateTime")
    private String updateTime;

    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    @com.aliyun.core.annotation.NameInMap("Uuid")
    private String uuid;

    private PushingTarget(Builder builder) {
        this.arn = builder.arn;
        this.createTime = builder.createTime;
        this.description = builder.description;
        this.httpRequestTarget = builder.httpRequestTarget;
        this.name = builder.name;
        this.range = builder.range;
        this.templateUuid = builder.templateUuid;
        this.type = builder.type;
        this.updateTime = builder.updateTime;
        this.userId = builder.userId;
        this.uuid = builder.uuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PushingTarget create() {
        return builder().build();
    }

    /**
     * @return arn
     */
    public String getArn() {
        return this.arn;
    }

    /**
     * @return createTime
     */
    public String getCreateTime() {
        return this.createTime;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return httpRequestTarget
     */
    public HttpRequestTarget getHttpRequestTarget() {
        return this.httpRequestTarget;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return range
     */
    public String getRange() {
        return this.range;
    }

    /**
     * @return templateUuid
     */
    public String getTemplateUuid() {
        return this.templateUuid;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return updateTime
     */
    public String getUpdateTime() {
        return this.updateTime;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return uuid
     */
    public String getUuid() {
        return this.uuid;
    }

    public static final class Builder {
        private String arn; 
        private String createTime; 
        private String description; 
        private HttpRequestTarget httpRequestTarget; 
        private String name; 
        private String range; 
        private String templateUuid; 
        private String type; 
        private String updateTime; 
        private String userId; 
        private String uuid; 

        /**
         * Arn.
         */
        public Builder arn(String arn) {
            this.arn = arn;
            return this;
        }

        /**
         * CreateTime.
         */
        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * HttpRequestTarget.
         */
        public Builder httpRequestTarget(HttpRequestTarget httpRequestTarget) {
            this.httpRequestTarget = httpRequestTarget;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * Range.
         */
        public Builder range(String range) {
            this.range = range;
            return this;
        }

        /**
         * TemplateUuid.
         */
        public Builder templateUuid(String templateUuid) {
            this.templateUuid = templateUuid;
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
         * UpdateTime.
         */
        public Builder updateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }

        /**
         * UserId.
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        /**
         * Uuid.
         */
        public Builder uuid(String uuid) {
            this.uuid = uuid;
            return this;
        }

        public PushingTarget build() {
            return new PushingTarget(this);
        } 

    } 

    /**
     * 
     * {@link PushingTarget} extends {@link TeaModel}
     *
     * <p>PushingTarget</p>
     */
    public static class Headers extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Headers(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Headers create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Headers build() {
                return new Headers(this);
            } 

        } 

    }
    /**
     * 
     * {@link PushingTarget} extends {@link TeaModel}
     *
     * <p>PushingTarget</p>
     */
    public static class HttpRequestTarget extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ContentType")
        private String contentType;

        @com.aliyun.core.annotation.NameInMap("EncryptString")
        private String encryptString;

        @com.aliyun.core.annotation.NameInMap("Headers")
        private java.util.List < Headers> headers;

        @com.aliyun.core.annotation.NameInMap("Method")
        private String method;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private HttpRequestTarget(Builder builder) {
            this.contentType = builder.contentType;
            this.encryptString = builder.encryptString;
            this.headers = builder.headers;
            this.method = builder.method;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HttpRequestTarget create() {
            return builder().build();
        }

        /**
         * @return contentType
         */
        public String getContentType() {
            return this.contentType;
        }

        /**
         * @return encryptString
         */
        public String getEncryptString() {
            return this.encryptString;
        }

        /**
         * @return headers
         */
        public java.util.List < Headers> getHeaders() {
            return this.headers;
        }

        /**
         * @return method
         */
        public String getMethod() {
            return this.method;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String contentType; 
            private String encryptString; 
            private java.util.List < Headers> headers; 
            private String method; 
            private String url; 

            /**
             * ContentType.
             */
            public Builder contentType(String contentType) {
                this.contentType = contentType;
                return this;
            }

            /**
             * EncryptString.
             */
            public Builder encryptString(String encryptString) {
                this.encryptString = encryptString;
                return this;
            }

            /**
             * Headers.
             */
            public Builder headers(java.util.List < Headers> headers) {
                this.headers = headers;
                return this;
            }

            /**
             * Method.
             */
            public Builder method(String method) {
                this.method = method;
                return this;
            }

            /**
             * Url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public HttpRequestTarget build() {
                return new HttpRequestTarget(this);
            } 

        } 

    }
}
