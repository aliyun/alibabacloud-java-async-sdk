// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link DeleteMonitorWebhookRequest} extends {@link RequestModel}
 *
 * <p>DeleteMonitorWebhookRequest</p>
 */
public class DeleteMonitorWebhookRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("webhookId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long webhookId;

    private DeleteMonitorWebhookRequest(Builder builder) {
        super(builder);
        this.webhookId = builder.webhookId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteMonitorWebhookRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteMonitorWebhookRequest, Builder> {
        private Long webhookId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteMonitorWebhookRequest request) {
            super(request);
            this.webhookId = request.webhookId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder webhookId(Long webhookId) {
            this.putPathParameter("webhookId", webhookId);
            this.webhookId = webhookId;
            return this;
        }

        @Override
        public DeleteMonitorWebhookRequest build() {
            return new DeleteMonitorWebhookRequest(this);
        } 

    } 

}
