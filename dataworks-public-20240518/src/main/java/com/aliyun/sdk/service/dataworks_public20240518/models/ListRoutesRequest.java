// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ListRoutesRequest} extends {@link RequestModel}
 *
 * <p>ListRoutesRequest</p>
 */
public class ListRoutesRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("NetworkId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long networkId;

    private ListRoutesRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.networkId = builder.networkId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListRoutesRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return networkId
     */
    public Long getNetworkId() {
        return this.networkId;
    }

    public static final class Builder extends Request.Builder<ListRoutesRequest, Builder> {
        private String regionId; 
        private Long networkId; 

        private Builder() {
            super();
        } 

        private Builder(ListRoutesRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.networkId = request.networkId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        public Builder networkId(Long networkId) {
            this.putQueryParameter("NetworkId", networkId);
            this.networkId = networkId;
            return this;
        }

        @Override
        public ListRoutesRequest build() {
            return new ListRoutesRequest(this);
        } 

    } 

}
