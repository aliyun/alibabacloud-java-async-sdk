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
 * {@link DeleteGlobalDataNetworkRequest} extends {@link RequestModel}
 *
 * <p>DeleteGlobalDataNetworkRequest</p>
 */
public class DeleteGlobalDataNetworkRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkId")
    private String networkId;

    private DeleteGlobalDataNetworkRequest(Builder builder) {
        super(builder);
        this.networkId = builder.networkId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteGlobalDataNetworkRequest create() {
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

    public static final class Builder extends Request.Builder<DeleteGlobalDataNetworkRequest, Builder> {
        private String networkId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteGlobalDataNetworkRequest request) {
            super(request);
            this.networkId = request.networkId;
        } 

        /**
         * <p>GDN ID</p>
         * 
         * <strong>example:</strong>
         * <p>gdn-xxx</p>
         */
        public Builder networkId(String networkId) {
            this.putQueryParameter("NetworkId", networkId);
            this.networkId = networkId;
            return this;
        }

        @Override
        public DeleteGlobalDataNetworkRequest build() {
            return new DeleteGlobalDataNetworkRequest(this);
        } 

    } 

}
