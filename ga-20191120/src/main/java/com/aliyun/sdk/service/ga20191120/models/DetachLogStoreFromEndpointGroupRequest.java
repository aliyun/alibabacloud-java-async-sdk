// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetachLogStoreFromEndpointGroupRequest} extends {@link RequestModel}
 *
 * <p>DetachLogStoreFromEndpointGroupRequest</p>
 */
public class DetachLogStoreFromEndpointGroupRequest extends Request {
    @Query
    @NameInMap("AcceleratorId")
    @Validation(required = true)
    private String acceleratorId;

    @Query
    @NameInMap("ClientToken")
    private String clientToken;

    @Query
    @NameInMap("EndpointGroupIds")
    @Validation(required = true)
    private java.util.List < String > endpointGroupIds;

    @Query
    @NameInMap("ListenerId")
    @Validation(required = true)
    private String listenerId;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private DetachLogStoreFromEndpointGroupRequest(Builder builder) {
        super(builder);
        this.acceleratorId = builder.acceleratorId;
        this.clientToken = builder.clientToken;
        this.endpointGroupIds = builder.endpointGroupIds;
        this.listenerId = builder.listenerId;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DetachLogStoreFromEndpointGroupRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return acceleratorId
     */
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return endpointGroupIds
     */
    public java.util.List < String > getEndpointGroupIds() {
        return this.endpointGroupIds;
    }

    /**
     * @return listenerId
     */
    public String getListenerId() {
        return this.listenerId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<DetachLogStoreFromEndpointGroupRequest, Builder> {
        private String acceleratorId; 
        private String clientToken; 
        private java.util.List < String > endpointGroupIds; 
        private String listenerId; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(DetachLogStoreFromEndpointGroupRequest response) {
            super(response);
            this.acceleratorId = response.acceleratorId;
            this.clientToken = response.clientToken;
            this.endpointGroupIds = response.endpointGroupIds;
            this.listenerId = response.listenerId;
            this.regionId = response.regionId;
        } 

        /**
         * AcceleratorId.
         */
        public Builder acceleratorId(String acceleratorId) {
            this.putQueryParameter("AcceleratorId", acceleratorId);
            this.acceleratorId = acceleratorId;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putQueryParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * EndpointGroupIds.
         */
        public Builder endpointGroupIds(java.util.List < String > endpointGroupIds) {
            this.putQueryParameter("EndpointGroupIds", endpointGroupIds);
            this.endpointGroupIds = endpointGroupIds;
            return this;
        }

        /**
         * ListenerId.
         */
        public Builder listenerId(String listenerId) {
            this.putQueryParameter("ListenerId", listenerId);
            this.listenerId = listenerId;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        @Override
        public DetachLogStoreFromEndpointGroupRequest build() {
            return new DetachLogStoreFromEndpointGroupRequest(this);
        } 

    } 

}
