// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iotcc20210513.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GrantVirtualBorderRouterRequest} extends {@link RequestModel}
 *
 * <p>GrantVirtualBorderRouterRequest</p>
 */
public class GrantVirtualBorderRouterRequest extends Request {
    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("VirtualBorderRouterId")
    private String virtualBorderRouterId;

    private GrantVirtualBorderRouterRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.virtualBorderRouterId = builder.virtualBorderRouterId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GrantVirtualBorderRouterRequest create() {
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
     * @return virtualBorderRouterId
     */
    public String getVirtualBorderRouterId() {
        return this.virtualBorderRouterId;
    }

    public static final class Builder extends Request.Builder<GrantVirtualBorderRouterRequest, Builder> {
        private String regionId; 
        private String virtualBorderRouterId; 

        private Builder() {
            super();
        } 

        private Builder(GrantVirtualBorderRouterRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.virtualBorderRouterId = request.virtualBorderRouterId;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * VirtualBorderRouterId.
         */
        public Builder virtualBorderRouterId(String virtualBorderRouterId) {
            this.putQueryParameter("VirtualBorderRouterId", virtualBorderRouterId);
            this.virtualBorderRouterId = virtualBorderRouterId;
            return this;
        }

        @Override
        public GrantVirtualBorderRouterRequest build() {
            return new GrantVirtualBorderRouterRequest(this);
        } 

    } 

}
