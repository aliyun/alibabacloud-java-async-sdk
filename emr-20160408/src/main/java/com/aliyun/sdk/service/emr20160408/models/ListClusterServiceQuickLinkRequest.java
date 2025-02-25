// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListClusterServiceQuickLinkRequest} extends {@link RequestModel}
 *
 * <p>ListClusterServiceQuickLinkRequest</p>
 */
public class ListClusterServiceQuickLinkRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("DirectType")
    private Boolean directType;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("ServiceName")
    private String serviceName;

    private ListClusterServiceQuickLinkRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.directType = builder.directType;
        this.regionId = builder.regionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.serviceName = builder.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListClusterServiceQuickLinkRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return directType
     */
    public Boolean getDirectType() {
        return this.directType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return resourceOwnerId
     */
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    /**
     * @return serviceName
     */
    public String getServiceName() {
        return this.serviceName;
    }

    public static final class Builder extends Request.Builder<ListClusterServiceQuickLinkRequest, Builder> {
        private String clusterId; 
        private Boolean directType; 
        private String regionId; 
        private Long resourceOwnerId; 
        private String serviceName; 

        private Builder() {
            super();
        } 

        private Builder(ListClusterServiceQuickLinkRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.directType = request.directType;
            this.regionId = request.regionId;
            this.resourceOwnerId = request.resourceOwnerId;
            this.serviceName = request.serviceName;
        } 

        /**
         * ClusterId.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * DirectType.
         */
        public Builder directType(Boolean directType) {
            this.putQueryParameter("DirectType", directType);
            this.directType = directType;
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
         * ResourceOwnerId.
         */
        public Builder resourceOwnerId(Long resourceOwnerId) {
            this.putQueryParameter("ResourceOwnerId", resourceOwnerId);
            this.resourceOwnerId = resourceOwnerId;
            return this;
        }

        /**
         * ServiceName.
         */
        public Builder serviceName(String serviceName) {
            this.putQueryParameter("ServiceName", serviceName);
            this.serviceName = serviceName;
            return this;
        }

        @Override
        public ListClusterServiceQuickLinkRequest build() {
            return new ListClusterServiceQuickLinkRequest(this);
        } 

    } 

}
