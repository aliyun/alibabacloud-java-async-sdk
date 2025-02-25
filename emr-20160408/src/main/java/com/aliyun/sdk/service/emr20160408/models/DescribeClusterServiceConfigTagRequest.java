// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClusterServiceConfigTagRequest} extends {@link RequestModel}
 *
 * <p>DescribeClusterServiceConfigTagRequest</p>
 */
public class DescribeClusterServiceConfigTagRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("ConfigTag")
    private String configTag;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("ResourceOwnerId")
    private Long resourceOwnerId;

    @Query
    @NameInMap("ServiceName")
    @Validation(required = true)
    private String serviceName;

    private DescribeClusterServiceConfigTagRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.configTag = builder.configTag;
        this.regionId = builder.regionId;
        this.resourceOwnerId = builder.resourceOwnerId;
        this.serviceName = builder.serviceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClusterServiceConfigTagRequest create() {
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
     * @return configTag
     */
    public String getConfigTag() {
        return this.configTag;
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

    public static final class Builder extends Request.Builder<DescribeClusterServiceConfigTagRequest, Builder> {
        private String clusterId; 
        private String configTag; 
        private String regionId; 
        private Long resourceOwnerId; 
        private String serviceName; 

        private Builder() {
            super();
        } 

        private Builder(DescribeClusterServiceConfigTagRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.configTag = request.configTag;
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
         * ConfigTag.
         */
        public Builder configTag(String configTag) {
            this.putQueryParameter("ConfigTag", configTag);
            this.configTag = configTag;
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
        public DescribeClusterServiceConfigTagRequest build() {
            return new DescribeClusterServiceConfigTagRequest(this);
        } 

    } 

}
