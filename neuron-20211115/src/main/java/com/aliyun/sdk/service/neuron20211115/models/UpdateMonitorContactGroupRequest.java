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
 * {@link UpdateMonitorContactGroupRequest} extends {@link RequestModel}
 *
 * <p>UpdateMonitorContactGroupRequest</p>
 */
public class UpdateMonitorContactGroupRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    @com.aliyun.core.annotation.Validation(required = true)
    private MonitorContactGroupUpdateCmd body;

    private UpdateMonitorContactGroupRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateMonitorContactGroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public MonitorContactGroupUpdateCmd getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<UpdateMonitorContactGroupRequest, Builder> {
        private MonitorContactGroupUpdateCmd body; 

        private Builder() {
            super();
        } 

        private Builder(UpdateMonitorContactGroupRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder body(MonitorContactGroupUpdateCmd body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public UpdateMonitorContactGroupRequest build() {
            return new UpdateMonitorContactGroupRequest(this);
        } 

    } 

}
