// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteImageRequest} extends {@link RequestModel}
 *
 * <p>DeleteImageRequest</p>
 */
public class DeleteImageRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("ContainerType")
    private String containerType;

    @Query
    @NameInMap("ImageTag")
    private String imageTag;

    @Query
    @NameInMap("Repository")
    @Validation(required = true)
    private String repository;

    private DeleteImageRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.clusterId = builder.clusterId;
        this.containerType = builder.containerType;
        this.imageTag = builder.imageTag;
        this.repository = builder.repository;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteImageRequest create() {
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
     * @return clusterId
     */
    public String getClusterId() {
        return this.clusterId;
    }

    /**
     * @return containerType
     */
    public String getContainerType() {
        return this.containerType;
    }

    /**
     * @return imageTag
     */
    public String getImageTag() {
        return this.imageTag;
    }

    /**
     * @return repository
     */
    public String getRepository() {
        return this.repository;
    }

    public static final class Builder extends Request.Builder<DeleteImageRequest, Builder> {
        private String regionId; 
        private String clusterId; 
        private String containerType; 
        private String imageTag; 
        private String repository; 

        private Builder() {
            super();
        } 

        private Builder(DeleteImageRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.clusterId = request.clusterId;
            this.containerType = request.containerType;
            this.imageTag = request.imageTag;
            this.repository = request.repository;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the cluster.
         * <p>
         * 
         * You can call the [ListClusters](~~87116~~) operation to query the cluster ID.
         */
        public Builder clusterId(String clusterId) {
            this.putQueryParameter("ClusterId", clusterId);
            this.clusterId = clusterId;
            return this;
        }

        /**
         * The type of the container. Set the value to singularity.
         */
        public Builder containerType(String containerType) {
            this.putQueryParameter("ContainerType", containerType);
            this.containerType = containerType;
            return this;
        }

        /**
         * The tags of the image.
         * <p>
         * 
         * Default value: latest
         */
        public Builder imageTag(String imageTag) {
            this.putQueryParameter("ImageTag", imageTag);
            this.imageTag = imageTag;
            return this;
        }

        /**
         * The name of the repository.
         * <p>
         * 
         * You can call the [ListContainerImages](~~87348~~) operation to query the name of the repository.
         */
        public Builder repository(String repository) {
            this.putQueryParameter("Repository", repository);
            this.repository = repository;
            return this;
        }

        @Override
        public DeleteImageRequest build() {
            return new DeleteImageRequest(this);
        } 

    } 

}
