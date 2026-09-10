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
 * {@link UpdateAlertWebhookRequest} extends {@link RequestModel}
 *
 * <p>UpdateAlertWebhookRequest</p>
 */
public class UpdateAlertWebhookRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("webhookId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String webhookId;

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
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("url")
    private String url;

    private UpdateAlertWebhookRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.webhookId = builder.webhookId;
        this.contentType = builder.contentType;
        this.headers = builder.headers;
        this.lang = builder.lang;
        this.method = builder.method;
        this.name = builder.name;
        this.url = builder.url;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateAlertWebhookRequest create() {
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
     * @return webhookId
     */
    public String getWebhookId() {
        return this.webhookId;
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

    public static final class Builder extends Request.Builder<UpdateAlertWebhookRequest, Builder> {
        private String regionId; 
        private String webhookId; 
        private String contentType; 
        private java.util.Map<String, String> headers; 
        private String lang; 
        private String method; 
        private String name; 
        private String url; 

        private Builder() {
            super();
        } 

        private Builder(UpdateAlertWebhookRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.webhookId = request.webhookId;
            this.contentType = request.contentType;
            this.headers = request.headers;
            this.lang = request.lang;
            this.method = request.method;
            this.name = request.name;
            this.url = request.url;
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
         * <p>The unique identifier of the webhook.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        public Builder webhookId(String webhookId) {
            this.putPathParameter("webhookId", webhookId);
            this.webhookId = webhookId;
            return this;
        }

        /**
         * <p>The content type of the data. Supported values:</p>
         * <ul>
         * <li><p>JSON</p>
         * </li>
         * <li><p>FORM</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>JSON</p>
         */
        public Builder contentType(String contentType) {
            this.putBodyParameter("contentType", contentType);
            this.contentType = contentType;
            return this;
        }

        /**
         * <p>The headers.</p>
         */
        public Builder headers(java.util.Map<String, String> headers) {
            this.putBodyParameter("headers", headers);
            this.headers = headers;
            return this;
        }

        /**
         * <p>The language. Supported values:</p>
         * <ul>
         * <li><p>zh_CN</p>
         * </li>
         * <li><p>en_US</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>zh_CN</p>
         */
        public Builder lang(String lang) {
            this.putBodyParameter("lang", lang);
            this.lang = lang;
            return this;
        }

        /**
         * <p>The request method. Supported values:</p>
         * <ul>
         * <li><p>GET</p>
         * </li>
         * <li><p>POST</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>GET</p>
         */
        public Builder method(String method) {
            this.putBodyParameter("method", method);
            this.method = method;
            return this;
        }

        /**
         * <p>The name of the webhook.</p>
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
         * <p>The URL of the alert callback.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://aliyun.com/test">http://aliyun.com/test</a></p>
         */
        public Builder url(String url) {
            this.putBodyParameter("url", url);
            this.url = url;
            return this;
        }

        @Override
        public UpdateAlertWebhookRequest build() {
            return new UpdateAlertWebhookRequest(this);
        } 

    } 

}
