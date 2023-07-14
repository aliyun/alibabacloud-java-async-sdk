// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateOrUpdateWebhookContactRequest} extends {@link RequestModel}
 *
 * <p>CreateOrUpdateWebhookContactRequest</p>
 */
public class CreateOrUpdateWebhookContactRequest extends Request {
    @Body
    @NameInMap("BizHeaders")
    private String bizHeaders;

    @Body
    @NameInMap("BizParams")
    private String bizParams;

    @Body
    @NameInMap("Body")
    private String body;

    @Body
    @NameInMap("Method")
    @Validation(required = true)
    private String method;

    @Body
    @NameInMap("RecoverBody")
    private String recoverBody;

    @Body
    @NameInMap("Url")
    @Validation(required = true)
    private String url;

    @Body
    @NameInMap("WebhookId")
    private Long webhookId;

    @Body
    @NameInMap("WebhookName")
    @Validation(required = true)
    private String webhookName;

    private CreateOrUpdateWebhookContactRequest(Builder builder) {
        super(builder);
        this.bizHeaders = builder.bizHeaders;
        this.bizParams = builder.bizParams;
        this.body = builder.body;
        this.method = builder.method;
        this.recoverBody = builder.recoverBody;
        this.url = builder.url;
        this.webhookId = builder.webhookId;
        this.webhookName = builder.webhookName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOrUpdateWebhookContactRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return bizHeaders
     */
    public String getBizHeaders() {
        return this.bizHeaders;
    }

    /**
     * @return bizParams
     */
    public String getBizParams() {
        return this.bizParams;
    }

    /**
     * @return body
     */
    public String getBody() {
        return this.body;
    }

    /**
     * @return method
     */
    public String getMethod() {
        return this.method;
    }

    /**
     * @return recoverBody
     */
    public String getRecoverBody() {
        return this.recoverBody;
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
    public Long getWebhookId() {
        return this.webhookId;
    }

    /**
     * @return webhookName
     */
    public String getWebhookName() {
        return this.webhookName;
    }

    public static final class Builder extends Request.Builder<CreateOrUpdateWebhookContactRequest, Builder> {
        private String bizHeaders; 
        private String bizParams; 
        private String body; 
        private String method; 
        private String recoverBody; 
        private String url; 
        private Long webhookId; 
        private String webhookName; 

        private Builder() {
            super();
        } 

        private Builder(CreateOrUpdateWebhookContactRequest request) {
            super(request);
            this.bizHeaders = request.bizHeaders;
            this.bizParams = request.bizParams;
            this.body = request.body;
            this.method = request.method;
            this.recoverBody = request.recoverBody;
            this.url = request.url;
            this.webhookId = request.webhookId;
            this.webhookName = request.webhookName;
        } 

        /**
         * The HTTP request headers.
         */
        public Builder bizHeaders(String bizHeaders) {
            this.putBodyParameter("BizHeaders", bizHeaders);
            this.bizHeaders = bizHeaders;
            return this;
        }

        /**
         * The parameters in the HTTP request.
         */
        public Builder bizParams(String bizParams) {
            this.putBodyParameter("BizParams", bizParams);
            this.bizParams = bizParams;
            return this;
        }

        /**
         * The notification template that is sent when an alert is triggered. This parameter is required if the **Method** parameter is set to **Post**. You can use the `$content` placeholder to specify the notification content. The content cannot exceed 500 characters in length. For more information, see [Variable description of a notification template](~~251834~~).\\
         */
        public Builder body(String body) {
            this.putBodyParameter("Body", body);
            this.body = body;
            return this;
        }

        /**
         * The HTTP request method.
         * <p>
         * 
         * *   Post
         * *   Get
         */
        public Builder method(String method) {
            this.putBodyParameter("Method", method);
            this.method = method;
            return this;
        }

        /**
         * The notification template that is sent when an alert is resolved. This parameter is required if the **Method** parameter is set to **Post**. You can use the `$content` placeholder to specify the notification content. The content cannot exceed 500 characters in length. For more information, see [Variable description of a notification template](~~251834~~).
         */
        public Builder recoverBody(String recoverBody) {
            this.putBodyParameter("RecoverBody", recoverBody);
            this.recoverBody = recoverBody;
            return this;
        }

        /**
         * The URL of the HTTP request **method**.
         */
        public Builder url(String url) {
            this.putBodyParameter("Url", url);
            this.url = url;
            return this;
        }

        /**
         * The ID of the webhook alert contact.
         * <p>
         * 
         * *   If you do not specify this parameter, a new webhook alert contact is created.
         * * If you specify this parameter, the specified webhook alert contact is modified.
         */
        public Builder webhookId(Long webhookId) {
            this.putBodyParameter("WebhookId", webhookId);
            this.webhookId = webhookId;
            return this;
        }

        /**
         * The name of the webhook alert contact.
         */
        public Builder webhookName(String webhookName) {
            this.putBodyParameter("WebhookName", webhookName);
            this.webhookName = webhookName;
            return this;
        }

        @Override
        public CreateOrUpdateWebhookContactRequest build() {
            return new CreateOrUpdateWebhookContactRequest(this);
        } 

    } 

}
