// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

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
 * {@link DescribeServiceMeshClustersResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeServiceMeshClustersResponseBody</p>
 */
public class DescribeServiceMeshClustersResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Clusters")
    private java.util.List<Clusters> clusters;

    @com.aliyun.core.annotation.NameInMap("NumberOfClusters")
    private Long numberOfClusters;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeServiceMeshClustersResponseBody(Builder builder) {
        this.clusters = builder.clusters;
        this.numberOfClusters = builder.numberOfClusters;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeServiceMeshClustersResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusters
     */
    public java.util.List<Clusters> getClusters() {
        return this.clusters;
    }

    /**
     * @return numberOfClusters
     */
    public Long getNumberOfClusters() {
        return this.numberOfClusters;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<Clusters> clusters; 
        private Long numberOfClusters; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeServiceMeshClustersResponseBody model) {
            this.clusters = model.clusters;
            this.numberOfClusters = model.numberOfClusters;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The queried clusters.</p>
         */
        public Builder clusters(java.util.List<Clusters> clusters) {
            this.clusters = clusters;
            return this;
        }

        /**
         * <p>The total number of ACK clusters in the current Region.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder numberOfClusters(Long numberOfClusters) {
            this.numberOfClusters = numberOfClusters;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>31d3a0f0-07ed-4f6e-9004-1804498c****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeServiceMeshClustersResponseBody build() {
            return new DescribeServiceMeshClustersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeServiceMeshClustersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeServiceMeshClustersResponseBody</p>
     */
    public static class Clusters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterDomain")
        private String clusterDomain;

        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("ClusterType")
        private String clusterType;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("ForbiddenFlag")
        private Long forbiddenFlag;

        @com.aliyun.core.annotation.NameInMap("ForbiddenInfo")
        private String forbiddenInfo;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ServiceMeshId")
        private String serviceMeshId;

        @com.aliyun.core.annotation.NameInMap("SgId")
        private String sgId;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("UpdateTime")
        private String updateTime;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private Clusters(Builder builder) {
            this.clusterDomain = builder.clusterDomain;
            this.clusterId = builder.clusterId;
            this.clusterType = builder.clusterType;
            this.creationTime = builder.creationTime;
            this.errorMessage = builder.errorMessage;
            this.forbiddenFlag = builder.forbiddenFlag;
            this.forbiddenInfo = builder.forbiddenInfo;
            this.name = builder.name;
            this.regionId = builder.regionId;
            this.serviceMeshId = builder.serviceMeshId;
            this.sgId = builder.sgId;
            this.state = builder.state;
            this.updateTime = builder.updateTime;
            this.version = builder.version;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Clusters create() {
            return builder().build();
        }

        /**
         * @return clusterDomain
         */
        public String getClusterDomain() {
            return this.clusterDomain;
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
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return forbiddenFlag
         */
        public Long getForbiddenFlag() {
            return this.forbiddenFlag;
        }

        /**
         * @return forbiddenInfo
         */
        public String getForbiddenInfo() {
            return this.forbiddenInfo;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return serviceMeshId
         */
        public String getServiceMeshId() {
            return this.serviceMeshId;
        }

        /**
         * @return sgId
         */
        public String getSgId() {
            return this.sgId;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String clusterDomain; 
            private String clusterId; 
            private String clusterType; 
            private String creationTime; 
            private String errorMessage; 
            private Long forbiddenFlag; 
            private String forbiddenInfo; 
            private String name; 
            private String regionId; 
            private String serviceMeshId; 
            private String sgId; 
            private String state; 
            private String updateTime; 
            private String version; 
            private String vpcId; 

            private Builder() {
            } 

            private Builder(Clusters model) {
                this.clusterDomain = model.clusterDomain;
                this.clusterId = model.clusterId;
                this.clusterType = model.clusterType;
                this.creationTime = model.creationTime;
                this.errorMessage = model.errorMessage;
                this.forbiddenFlag = model.forbiddenFlag;
                this.forbiddenInfo = model.forbiddenInfo;
                this.name = model.name;
                this.regionId = model.regionId;
                this.serviceMeshId = model.serviceMeshId;
                this.sgId = model.sgId;
                this.state = model.state;
                this.updateTime = model.updateTime;
                this.version = model.version;
                this.vpcId = model.vpcId;
            } 

            /**
             * <p>The domain name of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>c.com</p>
             */
            public Builder clusterDomain(String clusterDomain) {
                this.clusterDomain = clusterDomain;
                return this;
            }

            /**
             * <p>The cluster ID.</p>
             * 
             * <strong>example:</strong>
             * <p>c80f45444b3da447da60a911390c2****</p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The cluster type.</p>
             * 
             * <strong>example:</strong>
             * <p>Ask</p>
             */
            public Builder clusterType(String clusterType) {
                this.clusterType = clusterType;
                return this;
            }

            /**
             * <p>The time when the cluster was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-05-12T15:38:16+08:00</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The error message about the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>fail</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>Indicates that the cluster is available or the reason why the cluster cannot be added to the ASM instance. Valid values:</p>
             * <ul>
             * <li><code>0</code>: The cluster can be added to the ASM instance.</li>
             * <li><code>1</code>: The cluster cannot be added to the ASM instance because you do not have administrator permissions on the cluster.</li>
             * <li><code>2</code>: The cluster cannot be added to the ASM instance because the cluster and the ASM instance reside in different VPCs between which no private connections are built.</li>
             * <li><code>3</code>: The CIDR block of the cluster conflicts with that of the ASM instance.</li>
             * <li><code>4</code>: The cluster has a namespace that is named istio-system.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder forbiddenFlag(Long forbiddenFlag) {
                this.forbiddenFlag = forbiddenFlag;
                return this;
            }

            /**
             * <p>The reason why the cluster on the data plane cannot be added to the ASM instance. The value is a JSON string in the following format:</p>
             * <pre><code>[
             *   {
             *     &quot;cluster&quot;: &quot;cdd55bd6e054b4c6ca18ec02614******&quot;,
             *     &quot;object&quot;: &quot;Pod&quot;,
             *     &quot;cidr&quot;: &quot;172.16.0.0/24&quot;
             *   },
             *   {
             *     &quot;cluster&quot;: &quot;cfa37fdf7cb1641e1976f8293ac******&quot;,
             *     &quot;object&quot;: &quot;Pod&quot;,
             *     &quot;cidr&quot;: &quot;172.16.0.0/24&quot;
             *   }
             * ]
             * </code></pre>
             * <p>In the preceding example, the CIDR block <code>172.16.0.0/24</code> of the pod in the <code>cdd55bd6e054b4c6ca18ec02614******</code> cluster conflicts with the CIDR block <code>172.16.0.0/24</code> of the pod in the <code>cfa37fdf7cb1641e1976f8293ac******</code> cluster.</p>
             * <p>Valid values of the <code>object</code> parameter:</p>
             * <ul>
             * <li><code>Pod</code></li>
             * <li><code>Service</code></li>
             * <li><code>VSwitch</code></li>
             * <li><code>VPC</code></li>
             * <li><code>VPC CIDR</code></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>[{&quot;cluster&quot;:&quot;cdd55bd6e054b4c6ca18ec02614******&quot;, &quot;object&quot;:&quot;Pod&quot;, &quot;cidr&quot;:&quot;172.16.0.0/24&quot;},{&quot;cluster&quot;:&quot;cfa37fdf7cb1641e1976f8293ac******&quot;, &quot;object&quot;:&quot;Pod&quot;, &quot;cidr&quot;:&quot;172.16.0.0/24&quot;}]</p>
             */
            public Builder forbiddenInfo(String forbiddenInfo) {
                this.forbiddenInfo = forbiddenInfo;
                return this;
            }

            /**
             * <p>The name of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>ask1</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The ID of the region in which the cluster resides.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The ASM instance ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cb8963379255149cb98c8686f274x****</p>
             */
            public Builder serviceMeshId(String serviceMeshId) {
                this.serviceMeshId = serviceMeshId;
                return this;
            }

            /**
             * <p>The ID of the security group.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-bp197668l6iupljy****</p>
             */
            public Builder sgId(String sgId) {
                this.sgId = sgId;
                return this;
            }

            /**
             * <p>The state of the cluster. Valid values:</p>
             * <ul>
             * <li><code>running</code>: The cluster is running.</li>
             * <li><code>starting</code>: The cluster is starting.</li>
             * <li><code>stopping</code>: The cluster is being stopped.</li>
             * <li><code>stopped</code>: The cluster is stopped.</li>
             * <li><code>failed</code>: The cluster fails to be run.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>running</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * <p>The time when the cluster was last modified.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-05-12T15:38:16+08:00</p>
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            /**
             * <p>The version number of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>v1.16.6-aliyun.1</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            /**
             * <p>The ID of the virtual private cloud (VPC).</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-8vbrwmt95b4zf6wf7****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public Clusters build() {
                return new Clusters(this);
            } 

        } 

    }
}
