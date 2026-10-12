// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.apig20240327.models;

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
 * {@link CreateRiskCheckTaskRequest} extends {@link RequestModel}
 *
 * <p>CreateRiskCheckTaskRequest</p>
 */
public class CreateRiskCheckTaskRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("gatewayId")
    private String gatewayId;

    private CreateRiskCheckTaskRequest(Builder builder) {
        super(builder);
        this.gatewayId = builder.gatewayId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateRiskCheckTaskRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return gatewayId
     */
    public String getGatewayId() {
        return this.gatewayId;
    }

    public static final class Builder extends Request.Builder<CreateRiskCheckTaskRequest, Builder> {
        private String gatewayId; 

        private Builder() {
            super();
        } 

        private Builder(CreateRiskCheckTaskRequest request) {
            super(request);
            this.gatewayId = request.gatewayId;
        } 

        /**
         * <p>The ID of the target gateway. The gateway must exist and be in the Running state. Otherwise, the ErrGatewayIsNotRunning error is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-xxxx</p>
         */
        public Builder gatewayId(String gatewayId) {
            this.putPathParameter("gatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        @Override
        public CreateRiskCheckTaskRequest build() {
            return new CreateRiskCheckTaskRequest(this);
        } 

    } 

}
