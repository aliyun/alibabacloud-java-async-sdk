// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AttachLogStoreToEndpointGroupRequest} extends {@link RequestModel}
 *
 * <p>AttachLogStoreToEndpointGroupRequest</p>
 */
public class AttachLogStoreToEndpointGroupRequest extends Request {
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

    @Query
    @NameInMap("SlsLogStoreName")
    @Validation(required = true)
    private String slsLogStoreName;

    @Query
    @NameInMap("SlsProjectName")
    @Validation(required = true)
    private String slsProjectName;

    @Query
    @NameInMap("SlsRegionId")
    @Validation(required = true)
    private String slsRegionId;

    private AttachLogStoreToEndpointGroupRequest(Builder builder) {
        super(builder);
        this.acceleratorId = builder.acceleratorId;
        this.clientToken = builder.clientToken;
        this.endpointGroupIds = builder.endpointGroupIds;
        this.listenerId = builder.listenerId;
        this.regionId = builder.regionId;
        this.slsLogStoreName = builder.slsLogStoreName;
        this.slsProjectName = builder.slsProjectName;
        this.slsRegionId = builder.slsRegionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AttachLogStoreToEndpointGroupRequest create() {
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

    /**
     * @return slsLogStoreName
     */
    public String getSlsLogStoreName() {
        return this.slsLogStoreName;
    }

    /**
     * @return slsProjectName
     */
    public String getSlsProjectName() {
        return this.slsProjectName;
    }

    /**
     * @return slsRegionId
     */
    public String getSlsRegionId() {
        return this.slsRegionId;
    }

    public static final class Builder extends Request.Builder<AttachLogStoreToEndpointGroupRequest, Builder> {
        private String acceleratorId; 
        private String clientToken; 
        private java.util.List < String > endpointGroupIds; 
        private String listenerId; 
        private String regionId; 
        private String slsLogStoreName; 
        private String slsProjectName; 
        private String slsRegionId; 

        private Builder() {
            super();
        } 

        private Builder(AttachLogStoreToEndpointGroupRequest response) {
            super(response);
            this.acceleratorId = response.acceleratorId;
            this.clientToken = response.clientToken;
            this.endpointGroupIds = response.endpointGroupIds;
            this.listenerId = response.listenerId;
            this.regionId = response.regionId;
            this.slsLogStoreName = response.slsLogStoreName;
            this.slsProjectName = response.slsProjectName;
            this.slsRegionId = response.slsRegionId;
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

        /**
         * SlsLogStoreName.
         */
        public Builder slsLogStoreName(String slsLogStoreName) {
            this.putQueryParameter("SlsLogStoreName", slsLogStoreName);
            this.slsLogStoreName = slsLogStoreName;
            return this;
        }

        /**
         * SlsProjectName.
         */
        public Builder slsProjectName(String slsProjectName) {
            this.putQueryParameter("SlsProjectName", slsProjectName);
            this.slsProjectName = slsProjectName;
            return this;
        }

        /**
         * SlsRegionId.
         */
        public Builder slsRegionId(String slsRegionId) {
            this.putQueryParameter("SlsRegionId", slsRegionId);
            this.slsRegionId = slsRegionId;
            return this;
        }

        @Override
        public AttachLogStoreToEndpointGroupRequest build() {
            return new AttachLogStoreToEndpointGroupRequest(this);
        } 

    } 

}
