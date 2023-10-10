// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InsertClusterRequest} extends {@link RequestModel}
 *
 * <p>InsertClusterRequest</p>
 */
public class InsertClusterRequest extends Request {
    @Query
    @NameInMap("ClusterName")
    @Validation(required = true)
    private String clusterName;

    @Query
    @NameInMap("ClusterType")
    @Validation(required = true)
    private Integer clusterType;

    @Query
    @NameInMap("IaasProvider")
    private String iaasProvider;

    @Query
    @NameInMap("LogicalRegionId")
    private String logicalRegionId;

    @Query
    @NameInMap("NetworkMode")
    @Validation(required = true)
    private Integer networkMode;

    @Query
    @NameInMap("OversoldFactor")
    private Integer oversoldFactor;

    @Query
    @NameInMap("VpcId")
    private String vpcId;

    private InsertClusterRequest(Builder builder) {
        super(builder);
        this.clusterName = builder.clusterName;
        this.clusterType = builder.clusterType;
        this.iaasProvider = builder.iaasProvider;
        this.logicalRegionId = builder.logicalRegionId;
        this.networkMode = builder.networkMode;
        this.oversoldFactor = builder.oversoldFactor;
        this.vpcId = builder.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InsertClusterRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterName
     */
    public String getClusterName() {
        return this.clusterName;
    }

    /**
     * @return clusterType
     */
    public Integer getClusterType() {
        return this.clusterType;
    }

    /**
     * @return iaasProvider
     */
    public String getIaasProvider() {
        return this.iaasProvider;
    }

    /**
     * @return logicalRegionId
     */
    public String getLogicalRegionId() {
        return this.logicalRegionId;
    }

    /**
     * @return networkMode
     */
    public Integer getNetworkMode() {
        return this.networkMode;
    }

    /**
     * @return oversoldFactor
     */
    public Integer getOversoldFactor() {
        return this.oversoldFactor;
    }

    /**
     * @return vpcId
     */
    public String getVpcId() {
        return this.vpcId;
    }

    public static final class Builder extends Request.Builder<InsertClusterRequest, Builder> {
        private String clusterName; 
        private Integer clusterType; 
        private String iaasProvider; 
        private String logicalRegionId; 
        private Integer networkMode; 
        private Integer oversoldFactor; 
        private String vpcId; 

        private Builder() {
            super();
        } 

        private Builder(InsertClusterRequest request) {
            super(request);
            this.clusterName = request.clusterName;
            this.clusterType = request.clusterType;
            this.iaasProvider = request.iaasProvider;
            this.logicalRegionId = request.logicalRegionId;
            this.networkMode = request.networkMode;
            this.oversoldFactor = request.oversoldFactor;
            this.vpcId = request.vpcId;
        } 

        /**
         * The name of the cluster.
         */
        public Builder clusterName(String clusterName) {
            this.putQueryParameter("ClusterName", clusterName);
            this.clusterName = clusterName;
            return this;
        }

        /**
         * The type of the cluster. Valid values:
         * <p>
         * 
         * *   2: Elastic Compute Service (ECS) cluster
         * *   3: self-managed Kubernetes cluster in Enterprise Distributed Application Service (EDAS)
         * *   5: Kubernetes cluster
         */
        public Builder clusterType(Integer clusterType) {
            this.putQueryParameter("ClusterType", clusterType);
            this.clusterType = clusterType;
            return this;
        }

        /**
         * The provider of Infrastructure as a Service (IaaS) resources that are used in the cluster.
         * <p>
         * 
         * When you use Alibaba Cloud, set the value to `ALIYUN`. The value is case-sensitive.
         */
        public Builder iaasProvider(String iaasProvider) {
            this.putQueryParameter("IaasProvider", iaasProvider);
            this.iaasProvider = iaasProvider;
            return this;
        }

        /**
         * The ID of the custom namespace. The ID is in the `physical region ID:custom namespace identifier` format. Example: `cn-hangzhou:test`.
         */
        public Builder logicalRegionId(String logicalRegionId) {
            this.putQueryParameter("LogicalRegionId", logicalRegionId);
            this.logicalRegionId = logicalRegionId;
            return this;
        }

        /**
         * The network type of the cluster. Valid values:
         * <p>
         * 
         * *   1: classic network
         * *   2: virtual private cloud (VPC)
         */
        public Builder networkMode(Integer networkMode) {
            this.putQueryParameter("NetworkMode", networkMode);
            this.networkMode = networkMode;
            return this;
        }

        /**
         * **This parameter is deprecated.** The CPU overcommit ratio supported by a Docker cluster. Valid values:
         * <p>
         * 
         * *   2: 1:2, which means that resources are overcommitted by 1:2.
         * *   4: 1:4, which means that resources are overcommitted by 1:4.
         * *   8: 1:8, which means that resources are overcommitted by 1:8.
         */
        public Builder oversoldFactor(Integer oversoldFactor) {
            this.putQueryParameter("OversoldFactor", oversoldFactor);
            this.oversoldFactor = oversoldFactor;
            return this;
        }

        /**
         * The ID of the VPC. This parameter is required if you set the NetworkMode parameter to 2.
         */
        public Builder vpcId(String vpcId) {
            this.putQueryParameter("VpcId", vpcId);
            this.vpcId = vpcId;
            return this;
        }

        @Override
        public InsertClusterRequest build() {
            return new InsertClusterRequest(this);
        } 

    } 

}
