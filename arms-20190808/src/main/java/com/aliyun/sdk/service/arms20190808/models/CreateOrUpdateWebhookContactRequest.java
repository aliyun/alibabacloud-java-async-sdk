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
    @Validation(required = true)
    private String body;

    @Body
    @NameInMap("Method")
    @Validation(required = true)
    private String method;

    @Body
    @NameInMap("RecoverBody")
    @Validation(required = true)
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

        private Builder(CreateOrUpdateWebhookContactRequest response) {
            super(response);
            this.bizHeaders = response.bizHeaders;
            this.bizParams = response.bizParams;
            this.body = response.body;
            this.method = response.method;
            this.recoverBody = response.recoverBody;
            this.url = response.url;
            this.webhookId = response.webhookId;
            this.webhookName = response.webhookName;
        } 

        /**
         * http请求头
         */
        public Builder bizHeaders(String bizHeaders) {
            this.putBodyParameter("BizHeaders", bizHeaders);
            this.bizHeaders = bizHeaders;
            return this;
        }

        /**
         * http请求参数
         */
        public Builder bizParams(String bizParams) {
            this.putBodyParameter("BizParams", bizParams);
            this.bizParams = bizParams;
            return this;
        }

        /**
         * 告警通知模板
         */
        public Builder body(String body) {
            this.putBodyParameter("Body", body);
            this.body = body;
            return this;
        }

        /**
         * Http请求方法
         */
        public Builder method(String method) {
            this.putBodyParameter("Method", method);
            this.method = method;
            return this;
        }

        /**
         * 告警恢复模板
         */
        public Builder recoverBody(String recoverBody) {
            this.putBodyParameter("RecoverBody", recoverBody);
            this.recoverBody = recoverBody;
            return this;
        }

        /**
         * Url
         */
        public Builder url(String url) {
            this.putBodyParameter("Url", url);
            this.url = url;
            return this;
        }

        /**
         * 告警webhook ID
         */
        public Builder webhookId(Long webhookId) {
            this.putBodyParameter("WebhookId", webhookId);
            this.webhookId = webhookId;
            return this;
        }

        /**
         * 告警webhook名称
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
