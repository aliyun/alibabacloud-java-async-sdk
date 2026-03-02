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
 * {@link CreateMonitorContactRequest} extends {@link RequestModel}
 *
 * <p>CreateMonitorContactRequest</p>
 */
public class CreateMonitorContactRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("body")
    @com.aliyun.core.annotation.Validation(required = true)
    private MonitorContact body;

    private CreateMonitorContactRequest(Builder builder) {
        super(builder);
        this.body = builder.body;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMonitorContactRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return body
     */
    public MonitorContact getBody() {
        return this.body;
    }

    public static final class Builder extends Request.Builder<CreateMonitorContactRequest, Builder> {
        private MonitorContact body; 

        private Builder() {
            super();
        } 

        private Builder(CreateMonitorContactRequest request) {
            super(request);
            this.body = request.body;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder body(MonitorContact body) {
            this.putBodyParameter("body", body);
            this.body = body;
            return this;
        }

        @Override
        public CreateMonitorContactRequest build() {
            return new CreateMonitorContactRequest(this);
        } 

    } 

}
