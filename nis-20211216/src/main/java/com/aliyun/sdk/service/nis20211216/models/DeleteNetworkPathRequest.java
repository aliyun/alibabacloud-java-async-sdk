// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.nis20211216.models;

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
 * {@link DeleteNetworkPathRequest} extends {@link RequestModel}
 *
 * <p>DeleteNetworkPathRequest</p>
 */
public class DeleteNetworkPathRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkPathIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<String> networkPathIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    private DeleteNetworkPathRequest(Builder builder) {
        super(builder);
        this.networkPathIds = builder.networkPathIds;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteNetworkPathRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return networkPathIds
     */
    public java.util.List<String> getNetworkPathIds() {
        return this.networkPathIds;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DeleteNetworkPathRequest, Builder> {
        private java.util.List<String> networkPathIds; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DeleteNetworkPathRequest request) {
            super(request);
            this.networkPathIds = request.networkPathIds;
            this.regionId = request.regionId;
        } 

        /**
         * <p>The IDs of network paths.</p>
         * <p>This parameter is required.</p>
         */
        public Builder networkPathIds(java.util.List<String> networkPathIds) {
            String networkPathIdsShrink = shrink(networkPathIds, "NetworkPathIds", "json");
            this.putQueryParameter("NetworkPathIds", networkPathIdsShrink);
            this.networkPathIds = networkPathIds;
            return this;
        }

        /**
         * <p>The region ID of the network path that you want to delete.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DeleteNetworkPathRequest build() {
            return new DeleteNetworkPathRequest(this);
        } 

    } 

}
