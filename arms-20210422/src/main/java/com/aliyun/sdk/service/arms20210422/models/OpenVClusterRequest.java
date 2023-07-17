// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20210422.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OpenVClusterRequest} extends {@link RequestModel}
 *
 * <p>OpenVClusterRequest</p>
 */
public class OpenVClusterRequest extends Request {
    @Query
    @NameInMap("ClusterType")
    @Validation(required = true)
    private String clusterType;

    @Query
    @NameInMap("Length")
    private Integer length;

    @Query
    @NameInMap("Product")
    private String product;

    @Query
    @NameInMap("RecreateSwitch")
    private Boolean recreateSwitch;

    @Query
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    private OpenVClusterRequest(Builder builder) {
        super(builder);
        this.clusterType = builder.clusterType;
        this.length = builder.length;
        this.product = builder.product;
        this.recreateSwitch = builder.recreateSwitch;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static OpenVClusterRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterType
     */
    public String getClusterType() {
        return this.clusterType;
    }

    /**
     * @return length
     */
    public Integer getLength() {
        return this.length;
    }

    /**
     * @return product
     */
    public String getProduct() {
        return this.product;
    }

    /**
     * @return recreateSwitch
     */
    public Boolean getRecreateSwitch() {
        return this.recreateSwitch;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<OpenVClusterRequest, Builder> {
        private String clusterType; 
        private Integer length; 
        private String product; 
        private Boolean recreateSwitch; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(OpenVClusterRequest request) {
            super(request);
            this.clusterType = request.clusterType;
            this.length = request.length;
            this.product = request.product;
            this.recreateSwitch = request.recreateSwitch;
            this.regionId = request.regionId;
        } 

        /**
         * ClusterType.
         */
        public Builder clusterType(String clusterType) {
            this.putQueryParameter("ClusterType", clusterType);
            this.clusterType = clusterType;
            return this;
        }

        /**
         * Length.
         */
        public Builder length(Integer length) {
            this.putQueryParameter("Length", length);
            this.length = length;
            return this;
        }

        /**
         * Product.
         */
        public Builder product(String product) {
            this.putQueryParameter("Product", product);
            this.product = product;
            return this;
        }

        /**
         * RecreateSwitch.
         */
        public Builder recreateSwitch(Boolean recreateSwitch) {
            this.putQueryParameter("RecreateSwitch", recreateSwitch);
            this.recreateSwitch = recreateSwitch;
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
        public OpenVClusterRequest build() {
            return new OpenVClusterRequest(this);
        } 

    } 

}
