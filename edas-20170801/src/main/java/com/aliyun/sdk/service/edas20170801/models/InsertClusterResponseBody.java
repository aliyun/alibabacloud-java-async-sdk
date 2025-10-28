// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link InsertClusterResponseBody} extends {@link TeaModel}
 *
 * <p>InsertClusterResponseBody</p>
 */
public class InsertClusterResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Cluster")
    private Cluster cluster;

    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private InsertClusterResponseBody(Builder builder) {
        this.cluster = builder.cluster;
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InsertClusterResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return cluster
     */
    public Cluster getCluster() {
        return this.cluster;
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Cluster cluster; 
        private Integer code; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(InsertClusterResponseBody model) {
            this.cluster = model.cluster;
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The information about the cluster that was created.</p>
         */
        public Builder cluster(Cluster cluster) {
            this.cluster = cluster;
            return this;
        }

        /**
         * <p>The HTTP status code that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The additional information that is returned.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>b197-40ab-9155-****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public InsertClusterResponseBody build() {
            return new InsertClusterResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link InsertClusterResponseBody} extends {@link TeaModel}
     *
     * <p>InsertClusterResponseBody</p>
     */
    public static class Cluster extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("ClusterName")
        private String clusterName;

        @com.aliyun.core.annotation.NameInMap("ClusterType")
        private Integer clusterType;

        @com.aliyun.core.annotation.NameInMap("IaasProvider")
        private String iaasProvider;

        @com.aliyun.core.annotation.NameInMap("NetworkMode")
        private Integer networkMode;

        @com.aliyun.core.annotation.NameInMap("OversoldFactor")
        private Integer oversoldFactor;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private Cluster(Builder builder) {
            this.clusterId = builder.clusterId;
            this.clusterName = builder.clusterName;
            this.clusterType = builder.clusterType;
            this.iaasProvider = builder.iaasProvider;
            this.networkMode = builder.networkMode;
            this.oversoldFactor = builder.oversoldFactor;
            this.regionId = builder.regionId;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Cluster create() {
            return builder().build();
        }

        /**
         * @return clusterId
         */
        public String getClusterId() {
            return this.clusterId;
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

        public static final class Builder {
            private String clusterId; 
            private String clusterName; 
            private Integer clusterType; 
            private String iaasProvider; 
            private Integer networkMode; 
            private Integer oversoldFactor; 
            private String regionId; 
            private String vpcId; 

            private Builder() {
            } 

            private Builder(Cluster model) {
                this.clusterId = model.clusterId;
                this.clusterName = model.clusterName;
                this.clusterType = model.clusterType;
                this.iaasProvider = model.iaasProvider;
                this.networkMode = model.networkMode;
                this.oversoldFactor = model.oversoldFactor;
                this.regionId = model.regionId;
                this.vpcId = model.vpcId;
            } 

            /**
             * <p>The ID of cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>8705ad13-5d86-47fc-b68f-257b59ed****</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The name of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>****_product_test2</p>
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * <p>The type of the cluster. Valid values:</p>
             * <ul>
             * <li>2: ECS cluster</li>
             * <li>3: self-managed Kubernetes cluster in EDAS</li>
             * <li>5: Kubernetes cluster</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder clusterType(Integer clusterType) {
                this.clusterType = clusterType;
                return this;
            }

            /**
             * <p>The provider of the IaaS resources that are used in the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>ALIYUN</p>
             */
            public Builder iaasProvider(String iaasProvider) {
                this.iaasProvider = iaasProvider;
                return this;
            }

            /**
             * <p>The network type of the cluster. Valid values:</p>
             * <ul>
             * <li>1: classic network</li>
             * <li>2. VPC</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder networkMode(Integer networkMode) {
                this.networkMode = networkMode;
                return this;
            }

            /**
             * <p><strong>This parameter is deprecated.</strong> The CPU overcommit ratio supported by the Docker cluster. Valid values:</p>
             * <ul>
             * <li>2: 1:2, which means that resources are overcommitted by 1:2.</li>
             * <li>4: 1:4, which means that resources are overcommitted by 1:4.</li>
             * <li>8: 1:8, which means that resources are overcommitted by 1:8.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder oversoldFactor(Integer oversoldFactor) {
                this.oversoldFactor = oversoldFactor;
                return this;
            }

            /**
             * <p>The ID of the region in which the cluster resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The ID of the VPC.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-2zef6ob8mrlzv8x3q****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public Cluster build() {
                return new Cluster(this);
            } 

        } 

    }
}
