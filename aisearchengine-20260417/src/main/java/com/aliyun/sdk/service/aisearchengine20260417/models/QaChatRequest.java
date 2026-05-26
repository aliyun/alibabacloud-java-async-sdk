// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aisearchengine20260417.models;

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
 * {@link QaChatRequest} extends {@link RequestModel}
 *
 * <p>QaChatRequest</p>
 */
public class QaChatRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("appId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String appId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("message")
    @com.aliyun.core.annotation.Validation(required = true)
    private Message message;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("options")
    private java.util.Map<String, ?> options;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("sessionId")
    private String sessionId;

    private QaChatRequest(Builder builder) {
        super(builder);
        this.appId = builder.appId;
        this.message = builder.message;
        this.options = builder.options;
        this.sessionId = builder.sessionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QaChatRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return appId
     */
    public String getAppId() {
        return this.appId;
    }

    /**
     * @return message
     */
    public Message getMessage() {
        return this.message;
    }

    /**
     * @return options
     */
    public java.util.Map<String, ?> getOptions() {
        return this.options;
    }

    /**
     * @return sessionId
     */
    public String getSessionId() {
        return this.sessionId;
    }

    public static final class Builder extends Request.Builder<QaChatRequest, Builder> {
        private String appId; 
        private Message message; 
        private java.util.Map<String, ?> options; 
        private String sessionId; 

        private Builder() {
            super();
        } 

        private Builder(QaChatRequest request) {
            super(request);
            this.appId = request.appId;
            this.message = request.message;
            this.options = request.options;
            this.sessionId = request.sessionId;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2047140750220754946</p>
         */
        public Builder appId(String appId) {
            this.putBodyParameter("appId", appId);
            this.appId = appId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder message(Message message) {
            this.putBodyParameter("message", message);
            this.message = message;
            return this;
        }

        /**
         * options.
         */
        public Builder options(java.util.Map<String, ?> options) {
            this.putBodyParameter("options", options);
            this.options = options;
            return this;
        }

        /**
         * sessionId.
         */
        public Builder sessionId(String sessionId) {
            this.putBodyParameter("sessionId", sessionId);
            this.sessionId = sessionId;
            return this;
        }

        @Override
        public QaChatRequest build() {
            return new QaChatRequest(this);
        } 

    } 

    /**
     * 
     * {@link QaChatRequest} extends {@link TeaModel}
     *
     * <p>QaChatRequest</p>
     */
    public static class Parts extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("data")
        private Object data;

        @com.aliyun.core.annotation.NameInMap("mediaType")
        private String mediaType;

        @com.aliyun.core.annotation.NameInMap("text")
        private String text;

        @com.aliyun.core.annotation.NameInMap("type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("url")
        private String url;

        private Parts(Builder builder) {
            this.data = builder.data;
            this.mediaType = builder.mediaType;
            this.text = builder.text;
            this.type = builder.type;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Parts create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public Object getData() {
            return this.data;
        }

        /**
         * @return mediaType
         */
        public String getMediaType() {
            return this.mediaType;
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
            private Object data; 
            private String mediaType; 
            private String text; 
            private String type; 
            private String url; 

            private Builder() {
            } 

            private Builder(Parts model) {
                this.data = model.data;
                this.mediaType = model.mediaType;
                this.text = model.text;
                this.type = model.type;
                this.url = model.url;
            } 

            /**
             * data.
             */
            public Builder data(Object data) {
                this.data = data;
                return this;
            }

            /**
             * mediaType.
             */
            public Builder mediaType(String mediaType) {
                this.mediaType = mediaType;
                return this;
            }

            /**
             * text.
             */
            public Builder text(String text) {
                this.text = text;
                return this;
            }

            /**
             * type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * url.
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public Parts build() {
                return new Parts(this);
            } 

        } 

    }
    /**
     * 
     * {@link QaChatRequest} extends {@link TeaModel}
     *
     * <p>QaChatRequest</p>
     */
    public static class Message extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("parts")
        private java.util.List<Parts> parts;

        @com.aliyun.core.annotation.NameInMap("role")
        private String role;

        private Message(Builder builder) {
            this.parts = builder.parts;
            this.role = builder.role;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Message create() {
            return builder().build();
        }

        /**
         * @return parts
         */
        public java.util.List<Parts> getParts() {
            return this.parts;
        }

        /**
         * @return role
         */
        public String getRole() {
            return this.role;
        }

        public static final class Builder {
            private java.util.List<Parts> parts; 
            private String role; 

            private Builder() {
            } 

            private Builder(Message model) {
                this.parts = model.parts;
                this.role = model.role;
            } 

            /**
             * parts.
             */
            public Builder parts(java.util.List<Parts> parts) {
                this.parts = parts;
                return this;
            }

            /**
             * role.
             */
            public Builder role(String role) {
                this.role = role;
                return this;
            }

            public Message build() {
                return new Message(this);
            } 

        } 

    }
}
