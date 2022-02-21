// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UninstallManagedPrometheusRequest} extends {@link RequestModel}
 *
 * <p>UninstallManagedPrometheusRequest</p>
 */
public class UninstallManagedPrometheusRequest extends Request {
    @Query
    @NameInMap("ClusterId")
    private String clusterId;

    @Query
    @NameInMap("ClusterType")
    private String clusterType;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("VpcId")
    private String vpcId;

    private UninstallManagedPrometheusRequest(Builder builder) {
        super(builder);
        this.clusterId = builder.clusterId;
        this.clusterType = builder.clusterType;
        this.regionId = builder.regionId;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UninstallManagedPrometheusRequest create() {
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
     * @return clusterType
     */
    public String getClusterType() {
        return this.clusterType;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder extends Request.Builder<UninstallManagedPrometheusRequest, Builder> {
        private String clusterId; 
        private String clusterType; 
        private String regionId; 
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(UninstallManagedPrometheusRequest response) {
            super(response);
            this.clusterId = response.clusterId;
            this.clusterType = response.clusterType;
            this.regionId = response.regionId;
            this.vpcId = response.vpcId;
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
         * ClusterType.
         */
        public Builder clusterType(String clusterType) {
            this.putQueryParameter("ClusterType", clusterType);
            this.clusterType = clusterType;
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
         * VpcId.
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        @Override
        public UninstallManagedPrometheusRequest build() {
            return new UninstallManagedPrometheusRequest(this);
        } 

    } 

}
