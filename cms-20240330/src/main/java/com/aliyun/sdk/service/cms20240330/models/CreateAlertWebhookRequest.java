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
 * {@link CreateAlertWebhookRequest} extends {@link RequestModel}
 *
 * <p>CreateAlertWebhookRequest</p>
 */
public class CreateAlertWebhookRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("contentType")
    private String contentType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("headers")
    private java.util.Map<String, String> headers;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("lang")
    private String lang;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("method")
    private String method;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("url")
    @com.aliyun.core.annotation.Validation(required = true)
    private String url;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("webhookId")
    private String webhookId;

    private CreateAlertWebhookRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.contentType = builder.contentType;
        this.headers = builder.headers;
        this.lang = builder.lang;
        this.method = builder.method;
        this.name = builder.name;
        this.url = builder.url;
        this.webhookId = builder.webhookId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateAlertWebhookRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return contentType
     */
    public String getContentType() {
        return this.contentType;
    }

    /**
     * @return headers
     */
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
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
     * @return url
     */
    public String getUrl() {
        return this.url;
    }

    /**
     * @return webhookId
     */
    public String getWebhookId() {
        return this.webhookId;
    }

    public static final class Builder extends Request.Builder<CreateAlertWebhookRequest, Builder> {
        private String regionId; 
        private String contentType; 
        private java.util.Map<String, String> headers; 
        private String lang; 
        private String method; 
        private String name; 
        private String url; 
        private String webhookId; 

        private Builder() {
            super();
        } 

        private Builder(CreateAlertWebhookRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.contentType = request.contentType;
            this.headers = request.headers;
            this.lang = request.lang;
            this.method = request.method;
            this.name = request.name;
            this.url = request.url;
            this.webhookId = request.webhookId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * contentType.
         */
        public Builder contentType(String contentType) {
            this.putBodyParameter("contentType", contentType);
            this.contentType = contentType;
            return this;
        }

        /**
         * <p>headers</p>
         */
        public Builder headers(java.util.Map<String, String> headers) {
            this.putBodyParameter("headers", headers);
            this.headers = headers;
            return this;
        }

        /**
         * lang.
         */
        public Builder lang(String lang) {
            this.putBodyParameter("lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * method.
         */
        public Builder method(String method) {
            this.putBodyParameter("method", method);
            this.method = method;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://aliyun.com/test">https://aliyun.com/test</a></p>
         */
        public Builder url(String url) {
            this.putBodyParameter("url", url);
            this.url = url;
            return this;
        }

        /**
         * webhookId.
         */
        public Builder webhookId(String webhookId) {
            this.putBodyParameter("webhookId", webhookId);
            this.webhookId = webhookId;
            return this;
        }

        @Override
        public CreateAlertWebhookRequest build() {
            return new CreateAlertWebhookRequest(this);
        } 

    } 

}
