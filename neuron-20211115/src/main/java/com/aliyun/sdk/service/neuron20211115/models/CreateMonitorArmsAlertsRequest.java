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
 * {@link CreateMonitorArmsAlertsRequest} extends {@link RequestModel}
 *
 * <p>CreateMonitorArmsAlertsRequest</p>
 */
public class CreateMonitorArmsAlertsRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    @com.aliyun.core.annotation.Validation(required = true)
    private MonitorArmsAlerts body;

    private CreateMonitorArmsAlertsRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMonitorArmsAlertsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public MonitorArmsAlerts getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<CreateMonitorArmsAlertsRequest, Builder> {
        private MonitorArmsAlerts body; 

        private Builder() {
            super();
        } 

        private Builder(CreateMonitorArmsAlertsRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder body(MonitorArmsAlerts body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public CreateMonitorArmsAlertsRequest build() {
            return new CreateMonitorArmsAlertsRequest(this);
        } 

    } 

}
