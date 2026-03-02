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
 * {@link GetMonitorWebhookRequest} extends {@link RequestModel}
 *
 * <p>GetMonitorWebhookRequest</p>
 */
public class GetMonitorWebhookRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("webhookId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long webhookId;

    private GetMonitorWebhookRequest(Builder builder) {
        super(builder);
        this.webhookId = builder.webhookId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMonitorWebhookRequest create() {
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

    public static final class Builder extends Request.Builder<GetMonitorWebhookRequest, Builder> {
        private Long webhookId; 

        private Builder() {
            super();
        } 

        private Builder(GetMonitorWebhookRequest request) {
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
        public GetMonitorWebhookRequest build() {
            return new GetMonitorWebhookRequest(this);
        } 

    } 

}
