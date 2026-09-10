// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link MergeWebhook} extends {@link TeaModel}
 *
 * <p>MergeWebhook</p>
 */
public class MergeWebhook extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("contentType")
    private String contentType;

    @com.aliyun.core.annotation.NameInMap("extend")
    private String extend;

    @com.aliyun.core.annotation.NameInMap("gmtCreate")
    private String gmtCreate;

    @com.aliyun.core.annotation.NameInMap("gmtModified")
    private java.util.Map<String, ?> gmtModified;

    @com.aliyun.core.annotation.NameInMap("headers")
    private String headers;

    @com.aliyun.core.annotation.NameInMap("identifier")
    private String identifier;

    @com.aliyun.core.annotation.NameInMap("lang")
    private String lang;

    @com.aliyun.core.annotation.NameInMap("method")
    private String method;

    @com.aliyun.core.annotation.NameInMap("name")
    private String name;

    @com.aliyun.core.annotation.NameInMap("source")
    private String source;

    @com.aliyun.core.annotation.NameInMap("type")
    private String type;

    @com.aliyun.core.annotation.NameInMap("webhook")
    private String webhook;

    private MergeWebhook(Builder builder) {
        this.contentType = builder.contentType;
        this.extend = builder.extend;
        this.gmtCreate = builder.gmtCreate;
        this.gmtModified = builder.gmtModified;
        this.headers = builder.headers;
        this.identifier = builder.identifier;
        this.lang = builder.lang;
        this.method = builder.method;
        this.name = builder.name;
        this.source = builder.source;
        this.type = builder.type;
        this.webhook = builder.webhook;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MergeWebhook create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return contentType
     */
    public String getContentType() {
        return this.contentType;
    }

    /**
     * @return extend
     */
    public String getExtend() {
        return this.extend;
    }

    /**
     * @return gmtCreate
     */
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    /**
     * @return gmtModified
     */
    public java.util.Map<String, ?> getGmtModified() {
        return this.gmtModified;
    }

    /**
     * @return headers
     */
    public String getHeaders() {
        return this.headers;
    }

    /**
     * @return identifier
     */
    public String getIdentifier() {
        return this.identifier;
    }

    /**
     * @return lang
     */
    public String getLang() {
        return this.lang;
    }

    /**
     * @return method
     */
    public String getMethod() {
        return this.method;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return source
     */
    public String getSource() {
        return this.source;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return webhook
     */
    public String getWebhook() {
        return this.webhook;
    }

    public static final class Builder {
        private String contentType; 
        private String extend; 
        private String gmtCreate; 
        private java.util.Map<String, ?> gmtModified; 
        private String headers; 
        private String identifier; 
        private String lang; 
        private String method; 
        private String name; 
        private String source; 
        private String type; 
        private String webhook; 

        private Builder() {
        } 

        private Builder(MergeWebhook model) {
            this.contentType = model.contentType;
            this.extend = model.extend;
            this.gmtCreate = model.gmtCreate;
            this.gmtModified = model.gmtModified;
            this.headers = model.headers;
            this.identifier = model.identifier;
            this.lang = model.lang;
            this.method = model.method;
            this.name = model.name;
            this.source = model.source;
            this.type = model.type;
            this.webhook = model.webhook;
        } 

        /**
         * <p>The content type.</p>
         * 
         * <strong>example:</strong>
         * <p>application/json</p>
         */
        public Builder contentType(String contentType) {
            this.contentType = contentType;
            return this;
        }

        /**
         * <p>An extension field used to store additional configurations.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;timeout&quot;: 3000}</p>
         */
        public Builder extend(String extend) {
            this.extend = extend;
            return this;
        }

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-03-11T08:21:58.789Z</p>
         */
        public Builder gmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }

        /**
         * <p>The last modification time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-03-11T08:21:58.789Z</p>
         */
        public Builder gmtModified(java.util.Map<String, ?> gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }

        /**
         * <p>The request header.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Authorization&quot;: &quot;Bearer abc123&quot;}</p>
         */
        public Builder headers(String headers) {
            this.headers = headers;
            return this;
        }

        /**
         * <p>The unique identifier of the webhook.</p>
         * 
         * <strong>example:</strong>
         * <p>webhook-12345</p>
         */
        public Builder identifier(String identifier) {
            this.identifier = identifier;
            return this;
        }

        /**
         * <p>The language preference.</p>
         * 
         * <strong>example:</strong>
         * <p>zh-CN</p>
         */
        public Builder lang(String lang) {
            this.lang = lang;
            return this;
        }

        /**
         * <p>The HTTP request method.</p>
         * 
         * <strong>example:</strong>
         * <p>POST</p>
         */
        public Builder method(String method) {
            this.method = method;
            return this;
        }

        /**
         * <p>The name of the webhook.</p>
         * 
         * <strong>example:</strong>
         * <p>运维告警通知</p>
         */
        public Builder name(String name) {
            this.name = name;
            return this;
        }

        /**
         * <p>The source system of the webhook.</p>
         * 
         * <strong>example:</strong>
         * <p>dingtalk</p>
         */
        public Builder source(String source) {
            this.source = source;
            return this;
        }

        /**
         * <p>The type of the webhook. It indicates the destination platform.</p>
         * 
         * <strong>example:</strong>
         * <p>dingtalk</p>
         */
        public Builder type(String type) {
            this.type = type;
            return this;
        }

        /**
         * <p>The webhook URL used to send requests.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://oapi.dingtalk.com/robot/send?access_token=abc123">https://oapi.dingtalk.com/robot/send?access_token=abc123</a></p>
         */
        public Builder webhook(String webhook) {
            this.webhook = webhook;
            return this;
        }

        public MergeWebhook build() {
            return new MergeWebhook(this);
        } 

    } 

}
