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
 * {@link CreateMonitorContactGroupRequest} extends {@link RequestModel}
 *
 * <p>CreateMonitorContactGroupRequest</p>
 */
public class CreateMonitorContactGroupRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    @com.aliyun.core.annotation.Validation(required = true)
    private MonitorContactGroupCreateCmd body;

    private CreateMonitorContactGroupRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMonitorContactGroupRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public MonitorContactGroupCreateCmd getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<CreateMonitorContactGroupRequest, Builder> {
        private MonitorContactGroupCreateCmd body; 

        private Builder() {
            super();
        } 

        private Builder(CreateMonitorContactGroupRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder body(MonitorContactGroupCreateCmd body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public CreateMonitorContactGroupRequest build() {
            return new CreateMonitorContactGroupRequest(this);
        } 

    } 

}
