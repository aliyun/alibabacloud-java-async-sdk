// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DeleteWebhookContactRequest} extends {@link RequestModel}
 *
 * <p>DeleteWebhookContactRequest</p>
 */
public class DeleteWebhookContactRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WebhookId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long webhookId;

    private DeleteWebhookContactRequest(Builder builder) {
        super(builder);
        this.webhookId = builder.webhookId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteWebhookContactRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return webhookId
     */
    public Long getWebhookId() {
        return this.webhookId;
    }

    public static final class Builder extends Request.Builder<DeleteWebhookContactRequest, Builder> {
        private Long webhookId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteWebhookContactRequest request) {
            super(request);
            this.webhookId = request.webhookId;
        } 

        /**
         * <p>The ID of the webhook alert contact.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        public Builder webhookId(Long webhookId) {
            this.putQueryParameter("WebhookId", webhookId);
            this.webhookId = webhookId;
            return this;
        }

        @Override
        public DeleteWebhookContactRequest build() {
            return new DeleteWebhookContactRequest(this);
        } 

    } 

}
