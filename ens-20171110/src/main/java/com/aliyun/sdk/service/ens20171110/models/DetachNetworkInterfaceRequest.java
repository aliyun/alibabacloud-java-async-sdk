// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DetachNetworkInterfaceRequest} extends {@link RequestModel}
 *
 * <p>DetachNetworkInterfaceRequest</p>
 */
public class DetachNetworkInterfaceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkInterfaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String networkInterfaceId;

    private DetachNetworkInterfaceRequest(Builder builder) {
        super(builder);
        this.networkInterfaceId = builder.networkInterfaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetachNetworkInterfaceRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return networkInterfaceId
     */
    public String getNetworkInterfaceId() {
        return this.networkInterfaceId;
    }

    public static final class Builder extends Request.Builder<DetachNetworkInterfaceRequest, Builder> {
        private String networkInterfaceId; 

        private Builder() {
            super();
        } 

        private Builder(DetachNetworkInterfaceRequest request) {
            super(request);
            this.networkInterfaceId = request.networkInterfaceId;
        } 

        /**
         * <p>The ID of the ENI.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>eni-58z57orgmt6d1****</p>
         */
        public Builder networkInterfaceId(String networkInterfaceId) {
            this.putQueryParameter("NetworkInterfaceId", networkInterfaceId);
            this.networkInterfaceId = networkInterfaceId;
            return this;
        }

        @Override
        public DetachNetworkInterfaceRequest build() {
            return new DetachNetworkInterfaceRequest(this);
        } 

    } 

}
