// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

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
 * {@link DeleteNetworkInterfacesRequest} extends {@link RequestModel}
 *
 * <p>DeleteNetworkInterfacesRequest</p>
 */
public class DeleteNetworkInterfacesRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkInterfaceIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> networkInterfaceIds;

    private DeleteNetworkInterfacesRequest(Builder builder) {
        super(builder);
        this.networkInterfaceIds = builder.networkInterfaceIds;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteNetworkInterfacesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return networkInterfaceIds
     */
    public java.util.List<String> getNetworkInterfaceIds() {
        return this.networkInterfaceIds;
    }

    public static final class Builder extends Request.Builder<DeleteNetworkInterfacesRequest, Builder> {
        private java.util.List<String> networkInterfaceIds; 

        private Builder() {
            super();
        } 

        private Builder(DeleteNetworkInterfacesRequest request) {
            super(request);
            this.networkInterfaceIds = request.networkInterfaceIds;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder networkInterfaceIds(java.util.List<String> networkInterfaceIds) {
            String networkInterfaceIdsShrink = shrink(networkInterfaceIds, "NetworkInterfaceIds", "json");
            this.putQueryParameter("NetworkInterfaceIds", networkInterfaceIdsShrink);
            this.networkInterfaceIds = networkInterfaceIds;
            return this;
        }

        @Override
        public DeleteNetworkInterfacesRequest build() {
            return new DeleteNetworkInterfacesRequest(this);
        } 

    } 

}
