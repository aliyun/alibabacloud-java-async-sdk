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
 * {@link UpdateMonitorWebhookRequest} extends {@link RequestModel}
 *
 * <p>UpdateMonitorWebhookRequest</p>
 */
public class UpdateMonitorWebhookRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    @com.aliyun.core.annotation.Validation(required = true)
    private MonitorWebhookUpdateCmd body;

    private UpdateMonitorWebhookRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateMonitorWebhookRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public MonitorWebhookUpdateCmd getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<UpdateMonitorWebhookRequest, Builder> {
        private MonitorWebhookUpdateCmd body; 

        private Builder() {
            super();
        } 

        private Builder(UpdateMonitorWebhookRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder body(MonitorWebhookUpdateCmd body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public UpdateMonitorWebhookRequest build() {
            return new UpdateMonitorWebhookRequest(this);
        } 

    } 

}
