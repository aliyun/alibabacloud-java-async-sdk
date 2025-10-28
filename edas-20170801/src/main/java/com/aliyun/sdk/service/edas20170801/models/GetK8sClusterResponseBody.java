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
 * {@link GetK8sClusterResponseBody} extends {@link TeaModel}
 *
 * <p>GetK8sClusterResponseBody</p>
 */
public class GetK8sClusterResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ClusterPage")
    private ClusterPage clusterPage;

    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetK8sClusterResponseBody(Builder builder) {
        this.clusterPage = builder.clusterPage;
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetK8sClusterResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusterPage
     */
    public ClusterPage getClusterPage() {
        return this.clusterPage;
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
        private ClusterPage clusterPage; 
        private Integer code; 
        private String message; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetK8sClusterResponseBody model) {
            this.clusterPage = model.clusterPage;
            this.code = model.code;
            this.message = model.message;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The cluster data that is returned by page.</p>
         */
        public Builder clusterPage(ClusterPage clusterPage) {
            this.clusterPage = clusterPage;
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
         * <p>C3CE915C-0C83-4AA5-8D66-E8BEED62939E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetK8sClusterResponseBody build() {
            return new GetK8sClusterResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetK8sClusterResponseBody} extends {@link TeaModel}
     *
     * <p>GetK8sClusterResponseBody</p>
     */
    public static class Cluster extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("ClusterImportStatus")
        private Integer clusterImportStatus;

        @com.aliyun.core.annotation.NameInMap("ClusterName")
        private String clusterName;

        @com.aliyun.core.annotation.NameInMap("ClusterStatus")
        private Integer clusterStatus;

        @com.aliyun.core.annotation.NameInMap("ClusterType")
        private Integer clusterType;

        @com.aliyun.core.annotation.NameInMap("Cpu")
        private Integer cpu;

        @com.aliyun.core.annotation.NameInMap("CsClusterId")
        private String csClusterId;

        @com.aliyun.core.annotation.NameInMap("CsClusterStatus")
        private String csClusterStatus;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Mem")
        private Integer mem;

        @com.aliyun.core.annotation.NameInMap("NetworkMode")
        private Integer networkMode;

        @com.aliyun.core.annotation.NameInMap("NodeNum")
        private Integer nodeNum;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("SubClusterType")
        private String subClusterType;

        @com.aliyun.core.annotation.NameInMap("SubNetCidr")
        private String subNetCidr;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("VswitchId")
        private String vswitchId;

        private Cluster(Builder builder) {
            this.clusterId = builder.clusterId;
            this.clusterImportStatus = builder.clusterImportStatus;
            this.clusterName = builder.clusterName;
            this.clusterStatus = builder.clusterStatus;
            this.clusterType = builder.clusterType;
            this.cpu = builder.cpu;
            this.csClusterId = builder.csClusterId;
            this.csClusterStatus = builder.csClusterStatus;
            this.description = builder.description;
            this.mem = builder.mem;
            this.networkMode = builder.networkMode;
            this.nodeNum = builder.nodeNum;
            this.regionId = builder.regionId;
            this.subClusterType = builder.subClusterType;
            this.subNetCidr = builder.subNetCidr;
            this.vpcId = builder.vpcId;
            this.vswitchId = builder.vswitchId;
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
         * @return clusterImportStatus
         */
        public Integer getClusterImportStatus() {
            return this.clusterImportStatus;
        }

        /**
         * @return clusterName
         */
        public String getClusterName() {
            return this.clusterName;
        }

        /**
         * @return clusterStatus
         */
        public Integer getClusterStatus() {
            return this.clusterStatus;
        }

        /**
         * @return clusterType
         */
        public Integer getClusterType() {
            return this.clusterType;
        }

        /**
         * @return cpu
         */
        public Integer getCpu() {
            return this.cpu;
        }

        /**
         * @return csClusterId
         */
        public String getCsClusterId() {
            return this.csClusterId;
        }

        /**
         * @return csClusterStatus
         */
        public String getCsClusterStatus() {
            return this.csClusterStatus;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return mem
         */
        public Integer getMem() {
            return this.mem;
        }

        /**
         * @return networkMode
         */
        public Integer getNetworkMode() {
            return this.networkMode;
        }

        /**
         * @return nodeNum
         */
        public Integer getNodeNum() {
            return this.nodeNum;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return subClusterType
         */
        public String getSubClusterType() {
            return this.subClusterType;
        }

        /**
         * @return subNetCidr
         */
        public String getSubNetCidr() {
            return this.subNetCidr;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return vswitchId
         */
        public String getVswitchId() {
            return this.vswitchId;
        }

        public static final class Builder {
            private String clusterId; 
            private Integer clusterImportStatus; 
            private String clusterName; 
            private Integer clusterStatus; 
            private Integer clusterType; 
            private Integer cpu; 
            private String csClusterId; 
            private String csClusterStatus; 
            private String description; 
            private Integer mem; 
            private Integer networkMode; 
            private Integer nodeNum; 
            private String regionId; 
            private String subClusterType; 
            private String subNetCidr; 
            private String vpcId; 
            private String vswitchId; 

            private Builder() {
            } 

            private Builder(Cluster model) {
                this.clusterId = model.clusterId;
                this.clusterImportStatus = model.clusterImportStatus;
                this.clusterName = model.clusterName;
                this.clusterStatus = model.clusterStatus;
                this.clusterType = model.clusterType;
                this.cpu = model.cpu;
                this.csClusterId = model.csClusterId;
                this.csClusterStatus = model.csClusterStatus;
                this.description = model.description;
                this.mem = model.mem;
                this.networkMode = model.networkMode;
                this.nodeNum = model.nodeNum;
                this.regionId = model.regionId;
                this.subClusterType = model.subClusterType;
                this.subNetCidr = model.subNetCidr;
                this.vpcId = model.vpcId;
                this.vswitchId = model.vswitchId;
            } 

            /**
             * <p>The ID of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>81453e4b-4df0-4592-<strong><strong>-b835a2ee</strong></strong></p>
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * <p>The import state of the cluster. Valid values:</p>
             * <ul>
             * <li>0: The cluster is not imported.</li>
             * <li>1: The cluster is imported.</li>
             * <li>2: The cluster fails to be imported.</li>
             * <li>3: The cluster is being imported.</li>
             * <li>4: The cluster is deleted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder clusterImportStatus(Integer clusterImportStatus) {
                this.clusterImportStatus = clusterImportStatus;
                return this;
            }

            /**
             * <p>The name of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * <p>The status of the cluster. Valid values:</p>
             * <ul>
             * <li>1: The cluster runs as expected.</li>
             * <li>2: The cluster does not run as expected.</li>
             * <li>3: The cluster is offline.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder clusterStatus(Integer clusterStatus) {
                this.clusterStatus = clusterStatus;
                return this;
            }

            /**
             * <p>The type of the cluster. Valid values:</p>
             * <ul>
             * <li>2: Elastic Compute Service (ECS) cluster</li>
             * <li>5: ACK cluster or Serverless Kubernetes cluster</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder clusterType(Integer clusterType) {
                this.clusterType = clusterType;
                return this;
            }

            /**
             * <p>The total number of CPU cores.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder cpu(Integer cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * <p>The ID of the ACK cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>2ce62869f4d4466b920312315f05****</p>
             */
            public Builder csClusterId(String csClusterId) {
                this.csClusterId = csClusterId;
                return this;
            }

            /**
             * <p>The state of the ACK cluster. Valid values:</p>
             * <ul>
             * <li>initial: The cluster is being initialized.</li>
             * <li>failed: The cluster fails to be created.</li>
             * <li>running: The cluster is running.</li>
             * <li>updating: The cluster is being updated.</li>
             * <li>scaling: The cluster is being scaled out.</li>
             * <li>removing: Nodes are being removed from the cluster.</li>
             * <li>upgrading: The cluster is being upgraded.</li>
             * <li>deleting: The cluster is being deleted.</li>
             * <li>delete_failed: The cluster fails to be deleted.</li>
             * <li>deleted: The cluster is deleted. The deleted cluster is invisible to users.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>running</p>
             */
            public Builder csClusterStatus(String csClusterStatus) {
                this.csClusterStatus = csClusterStatus;
                return this;
            }

            /**
             * <p>The description of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The total size of memory. Unit: MB.</p>
             * 
             * <strong>example:</strong>
             * <p>2048</p>
             */
            public Builder mem(Integer mem) {
                this.mem = mem;
                return this;
            }

            /**
             * <p>The network type of the cluster. Valid values:</p>
             * <ul>
             * <li>1: classic network</li>
             * <li>2: VPC</li>
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
             * <p>The number of nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>4</p>
             */
            public Builder nodeNum(Integer nodeNum) {
                this.nodeNum = nodeNum;
                return this;
            }

            /**
             * <p>The ID of the namespace.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The subtype of the cluster. Valid values:</p>
             * <ul>
             * <li>Ask: Serverless Kubernetes cluster</li>
             * <li>ManagedKubernetes: ACK cluster</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Ask</p>
             */
            public Builder subClusterType(String subClusterType) {
                this.subClusterType = subClusterType;
                return this;
            }

            /**
             * <p>The CIDR block of the subnet.</p>
             * 
             * <strong>example:</strong>
             * <p>172.20.0.0/16</p>
             */
            public Builder subNetCidr(String subNetCidr) {
                this.subNetCidr = subNetCidr;
                return this;
            }

            /**
             * <p>The ID of the virtual private cloud (VPC).</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-<strong>z1mlwpbjx3e9m</strong></p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>The ID of the vSwitch.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-bp1uf97<strong><strong>xjxgip</strong></strong></p>
             */
            public Builder vswitchId(String vswitchId) {
                this.vswitchId = vswitchId;
                return this;
            }

            public Cluster build() {
                return new Cluster(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetK8sClusterResponseBody} extends {@link TeaModel}
     *
     * <p>GetK8sClusterResponseBody</p>
     */
    public static class ClusterList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cluster")
        private java.util.List<Cluster> cluster;

        private ClusterList(Builder builder) {
            this.cluster = builder.cluster;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClusterList create() {
            return builder().build();
        }

        /**
         * @return cluster
         */
        public java.util.List<Cluster> getCluster() {
            return this.cluster;
        }

        public static final class Builder {
            private java.util.List<Cluster> cluster; 

            private Builder() {
            } 

            private Builder(ClusterList model) {
                this.cluster = model.cluster;
            } 

            /**
             * Cluster.
             */
            public Builder cluster(java.util.List<Cluster> cluster) {
                this.cluster = cluster;
                return this;
            }

            public ClusterList build() {
                return new ClusterList(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetK8sClusterResponseBody} extends {@link TeaModel}
     *
     * <p>GetK8sClusterResponseBody</p>
     */
    public static class ClusterPage extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterList")
        private ClusterList clusterList;

        @com.aliyun.core.annotation.NameInMap("CurrentPage")
        private Integer currentPage;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("TotalSize")
        private Integer totalSize;

        private ClusterPage(Builder builder) {
            this.clusterList = builder.clusterList;
            this.currentPage = builder.currentPage;
            this.pageSize = builder.pageSize;
            this.totalSize = builder.totalSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClusterPage create() {
            return builder().build();
        }

        /**
         * @return clusterList
         */
        public ClusterList getClusterList() {
            return this.clusterList;
        }

        /**
         * @return currentPage
         */
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalSize
         */
        public Integer getTotalSize() {
            return this.totalSize;
        }

        public static final class Builder {
            private ClusterList clusterList; 
            private Integer currentPage; 
            private Integer pageSize; 
            private Integer totalSize; 

            private Builder() {
            } 

            private Builder(ClusterPage model) {
                this.clusterList = model.clusterList;
                this.currentPage = model.currentPage;
                this.pageSize = model.pageSize;
                this.totalSize = model.totalSize;
            } 

            /**
             * <p>The list of clusters.</p>
             */
            public Builder clusterList(ClusterList clusterList) {
                this.clusterList = clusterList;
                return this;
            }

            /**
             * <p>The number of the returned page. Default value: 1.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * <p>The number of entries returned per page. Default value: 1000.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The total number of pages that are returned.</p>
             * 
             * <strong>example:</strong>
             * <p>5</p>
             */
            public Builder totalSize(Integer totalSize) {
                this.totalSize = totalSize;
                return this;
            }

            public ClusterPage build() {
                return new ClusterPage(this);
            } 

        } 

    }
}
