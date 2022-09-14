// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20170714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddNodesRequest} extends {@link RequestModel}
 *
 * <p>AddNodesRequest</p>
 */
public class AddNodesRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    @Validation(required = true)
    private String clusterId;

    @Query
    @NameInMap("ComputeSpotPriceLimit")
    private String computeSpotPriceLimit;

    @Query
    @NameInMap("ComputeSpotStrategy")
    private String computeSpotStrategy;

    @Query
    @NameInMap("Count")
    @Validation(required = true)
    private Integer count;

    @Query
    @NameInMap("ImageId")
    private String imageId;

    @Query
    @NameInMap("ImageOwnerAlias")
    private String imageOwnerAlias;

    private AddNodesRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.computeSpotPriceLimit = builder.computeSpotPriceLimit;
        this.computeSpotStrategy = builder.computeSpotStrategy;
        this.count = builder.count;
        this.imageId = builder.imageId;
        this.imageOwnerAlias = builder.imageOwnerAlias;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddNodesRequest create() {
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
     * @return computeSpotPriceLimit
     */
    public String getComputeSpotPriceLimit() {
        return this.computeSpotPriceLimit;
    }

    /**
     * @return computeSpotStrategy
     */
    public String getComputeSpotStrategy() {
        return this.computeSpotStrategy;
    }

    /**
     * @return count
     */
    public Integer getCount() {
        return this.count;
    }

    /**
     * @return imageId
     */
    public String getImageId() {
        return this.imageId;
    }

    /**
     * @return imageOwnerAlias
     */
    public String getImageOwnerAlias() {
        return this.imageOwnerAlias;
    }

    public static final class Builder extends Request.Builder<AddNodesRequest, Builder> {
        private String clusterId; 
        private String computeSpotPriceLimit; 
        private String computeSpotStrategy; 
        private Integer count; 
        private String imageId; 
        private String imageOwnerAlias; 

        private Builder() {
            super();
        } 

        private Builder(AddNodesRequest request) {
            super(request);
            this.clusterId = request.clusterId;
            this.computeSpotPriceLimit = request.computeSpotPriceLimit;
            this.computeSpotStrategy = request.computeSpotStrategy;
            this.count = request.count;
            this.imageId = request.imageId;
            this.imageOwnerAlias = request.imageOwnerAlias;
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
         * ComputeSpotPriceLimit.
         */
        public Builder computeSpotPriceLimit(String computeSpotPriceLimit) {
            this.putQueryParameter("ComputeSpotPriceLimit", computeSpotPriceLimit);
            this.computeSpotPriceLimit = computeSpotPriceLimit;
            return this;
        }

        /**
         * ComputeSpotStrategy.
         */
        public Builder computeSpotStrategy(String computeSpotStrategy) {
            this.putQueryParameter("ComputeSpotStrategy", computeSpotStrategy);
            this.computeSpotStrategy = computeSpotStrategy;
            return this;
        }

        /**
         * Count.
         */
        public Builder count(Integer count) {
            this.putQueryParameter("Count", count);
            this.count = count;
            return this;
        }

        /**
         * ImageId.
         */
        public Builder imageId(String imageId) {
            this.putQueryParameter("ImageId", imageId);
            this.imageId = imageId;
            return this;
        }

        /**
         * ImageOwnerAlias.
         */
        public Builder imageOwnerAlias(String imageOwnerAlias) {
            this.putQueryParameter("ImageOwnerAlias", imageOwnerAlias);
            this.imageOwnerAlias = imageOwnerAlias;
            return this;
        }

        @Override
        public AddNodesRequest build() {
            return new AddNodesRequest(this);
        } 

    } 

}
