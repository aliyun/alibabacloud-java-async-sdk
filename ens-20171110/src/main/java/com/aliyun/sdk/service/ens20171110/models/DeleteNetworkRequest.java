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
 * {@link DeleteNetworkRequest} extends {@link RequestModel}
 *
 * <p>DeleteNetworkRequest</p>
 */
public class DeleteNetworkRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String networkId;

    private DeleteNetworkRequest(Builder builder) {
        super(builder);
        this.networkId = builder.networkId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteNetworkRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return networkId
     */
    public String getNetworkId() {
        return this.networkId;
    }

    public static final class Builder extends Request.Builder<DeleteNetworkRequest, Builder> {
        private String networkId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteNetworkRequest request) {
            super(request);
            this.networkId = request.networkId;
        } 

        /**
         * <p>The ID of the network.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>n-5***</p>
         */
        public Builder networkId(String networkId) {
            this.putQueryParameter("NetworkId", networkId);
            this.networkId = networkId;
            return this;
        }

        @Override
        public DeleteNetworkRequest build() {
            return new DeleteNetworkRequest(this);
        } 

    } 

}
