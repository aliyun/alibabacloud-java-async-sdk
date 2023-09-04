// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CheckWebhookRequest} extends {@link RequestModel}
 *
 * <p>CheckWebhookRequest</p>
 */
public class CheckWebhookRequest extends Request {
    @Body
    @NameInMap("clientToken")
    private String clientToken;

    @Body
    @NameInMap("webhook")
    private String webhook;

    @Body
    @NameInMap("webhookType")
    private String webhookType;

    private CheckWebhookRequest(Builder builder) {
        super(builder);
        this.clientToken = builder.clientToken;
        this.webhook = builder.webhook;
        this.webhookType = builder.webhookType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CheckWebhookRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return webhook
     */
    public String getWebhook() {
        return this.webhook;
    }

    /**
     * @return webhookType
     */
    public String getWebhookType() {
        return this.webhookType;
    }

    public static final class Builder extends Request.Builder<CheckWebhookRequest, Builder> {
        private String clientToken; 
        private String webhook; 
        private String webhookType; 

        private Builder() {
            super();
        } 

        private Builder(CheckWebhookRequest request) {
            super(request);
            this.clientToken = request.clientToken;
            this.webhook = request.webhook;
            this.webhookType = request.webhookType;
        } 

        /**
         * clientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("clientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * webhook.
         */
        public Builder webhook(String webhook) {
            this.putBodyParameter("webhook", webhook);
            this.webhook = webhook;
            return this;
        }

        /**
         * webhookType.
         */
        public Builder webhookType(String webhookType) {
            this.putBodyParameter("webhookType", webhookType);
            this.webhookType = webhookType;
            return this;
        }

        @Override
        public CheckWebhookRequest build() {
            return new CheckWebhookRequest(this);
        } 

    } 

}
