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
 * {@link UpdateNetworkAccessRequest} extends {@link RequestModel}
 *
 * <p>UpdateNetworkAccessRequest</p>
 */
public class UpdateNetworkAccessRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("gatewayId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String gatewayId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("networkAccessType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String networkAccessType;

    private UpdateNetworkAccessRequest(Builder builder) {
        super(builder);
        this.gatewayId = builder.gatewayId;
        this.networkAccessType = builder.networkAccessType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateNetworkAccessRequest create() {
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

    /**
     * @return networkAccessType
     */
    public String getNetworkAccessType() {
        return this.networkAccessType;
    }

    public static final class Builder extends Request.Builder<UpdateNetworkAccessRequest, Builder> {
        private String gatewayId; 
        private String networkAccessType; 

        private Builder() {
            super();
        } 

        private Builder(UpdateNetworkAccessRequest request) {
            super(request);
            this.gatewayId = request.gatewayId;
            this.networkAccessType = request.networkAccessType;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder gatewayId(String gatewayId) {
            this.putPathParameter("gatewayId", gatewayId);
            this.gatewayId = gatewayId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>private&amp;pubnet</p>
         */
        public Builder networkAccessType(String networkAccessType) {
            this.putQueryParameter("networkAccessType", networkAccessType);
            this.networkAccessType = networkAccessType;
            return this;
        }

        @Override
        public UpdateNetworkAccessRequest build() {
            return new UpdateNetworkAccessRequest(this);
        } 

    } 

}
