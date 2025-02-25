// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sgw20180511.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UploadGatewayLogRequest} extends {@link RequestModel}
 *
 * <p>UploadGatewayLogRequest</p>
 */
public class UploadGatewayLogRequest extends Request {
    @Query
    @NameInMap("GatewayId")
    @Validation(required = true)
    private String gatewayId;

    private UploadGatewayLogRequest(Builder builder) {
        super(builder);
        this.gatewayId = builder.gatewayId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UploadGatewayLogRequest create() {
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

    public static final class Builder extends Request.Builder<UploadGatewayLogRequest, Builder> {
        private String gatewayId; 

        private Builder() {
            super();
        } 

        private Builder(UploadGatewayLogRequest request) {
            super(request);
            this.gatewayId = request.gatewayId;
        } 

        /**
         * GatewayId.
         */
        public Builder gatewayId(String gatewayId) {
            this.putQueryParameter("GatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        @Override
        public UploadGatewayLogRequest build() {
            return new UploadGatewayLogRequest(this);
        } 

    } 

}
