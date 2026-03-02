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
 * {@link CreateMonitorWebhookRequest} extends {@link RequestModel}
 *
 * <p>CreateMonitorWebhookRequest</p>
 */
public class CreateMonitorWebhookRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    @com.aliyun.core.annotation.Validation(required = true)
    private MonitorWebhook body;

    private CreateMonitorWebhookRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMonitorWebhookRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public MonitorWebhook getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<CreateMonitorWebhookRequest, Builder> {
        private MonitorWebhook body; 

        private Builder() {
            super();
        } 

        private Builder(CreateMonitorWebhookRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder body(MonitorWebhook body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public CreateMonitorWebhookRequest build() {
            return new CreateMonitorWebhookRequest(this);
        } 

    } 

}
