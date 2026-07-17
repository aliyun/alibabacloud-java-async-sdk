// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link RestartPolarClawGatewayRequest} extends {@link RequestModel}
 *
 * <p>RestartPolarClawGatewayRequest</p>
 */
public class RestartPolarClawGatewayRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplicationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String applicationId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Mode")
    private String mode;

    private RestartPolarClawGatewayRequest(Builder builder) {
        super(builder);
        this.applicationId = builder.applicationId;
        this.mode = builder.mode;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RestartPolarClawGatewayRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return applicationId
     */
    public String getApplicationId() {
        return this.applicationId;
    }

    /**
     * @return mode
     */
    public String getMode() {
        return this.mode;
    }

    public static final class Builder extends Request.Builder<RestartPolarClawGatewayRequest, Builder> {
        private String applicationId; 
        private String mode; 

        private Builder() {
            super();
        } 

        private Builder(RestartPolarClawGatewayRequest request) {
            super(request);
            this.applicationId = request.applicationId;
            this.mode = request.mode;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>pa-xxx</p>
         */
        public Builder applicationId(String applicationId) {
            this.putQueryParameter("ApplicationId", applicationId);
            this.applicationId = applicationId;
            return this;
        }

        /**
         * Mode.
         */
        public Builder mode(String mode) {
            this.putQueryParameter("Mode", mode);
            this.mode = mode;
            return this;
        }

        @Override
        public RestartPolarClawGatewayRequest build() {
            return new RestartPolarClawGatewayRequest(this);
        } 

    } 

}
