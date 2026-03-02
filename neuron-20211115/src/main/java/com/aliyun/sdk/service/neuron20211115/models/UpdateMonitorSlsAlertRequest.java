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
 * {@link UpdateMonitorSlsAlertRequest} extends {@link RequestModel}
 *
 * <p>UpdateMonitorSlsAlertRequest</p>
 */
public class UpdateMonitorSlsAlertRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    @com.aliyun.core.annotation.Validation(required = true)
    private MonitorSlsAlertUpdateCmd body;

    private UpdateMonitorSlsAlertRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateMonitorSlsAlertRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public MonitorSlsAlertUpdateCmd getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<UpdateMonitorSlsAlertRequest, Builder> {
        private MonitorSlsAlertUpdateCmd body; 

        private Builder() {
            super();
        } 

        private Builder(UpdateMonitorSlsAlertRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder body(MonitorSlsAlertUpdateCmd body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public UpdateMonitorSlsAlertRequest build() {
            return new UpdateMonitorSlsAlertRequest(this);
        } 

    } 

}
