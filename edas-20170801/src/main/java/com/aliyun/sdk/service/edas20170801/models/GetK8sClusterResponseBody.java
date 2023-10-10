// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.edas20170801.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetK8sClusterResponseBody} extends {@link TeaModel}
 *
 * <p>GetK8sClusterResponseBody</p>
 */
public class GetK8sClusterResponseBody extends TeaModel {
    @NameInMap("ClusterPage")
    private ClusterPage clusterPage;

    @NameInMap("Code")
    private Integer code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
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

        /**
         * The cluster data that is returned by page.
         */
        public Builder clusterPage(ClusterPage clusterPage) {
            this.clusterPage = clusterPage;
            return this;
        }

        /**
         * The HTTP status code that is returned.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The additional information that is returned.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetK8sClusterResponseBody build() {
            return new GetK8sClusterResponseBody(this);
        } 

    } 

    public static class Cluster extends TeaModel {
        @NameInMap("ClusterId")
        private String clusterId;

        @NameInMap("ClusterImportStatus")
        private Integer clusterImportStatus;

        @NameInMap("ClusterName")
        private String clusterName;

        @NameInMap("ClusterStatus")
        private Integer clusterStatus;

        @NameInMap("ClusterType")
        private Integer clusterType;

        @NameInMap("Cpu")
        private Integer cpu;

        @NameInMap("CsClusterId")
        private String csClusterId;

        @NameInMap("CsClusterStatus")
        private String csClusterStatus;

        @NameInMap("Description")
        private String description;

        @NameInMap("Mem")
        private Integer mem;

        @NameInMap("NetworkMode")
        private Integer networkMode;

        @NameInMap("NodeNum")
        private Integer nodeNum;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("SubClusterType")
        private String subClusterType;

        @NameInMap("SubNetCidr")
        private String subNetCidr;

        @NameInMap("VpcId")
        private String vpcId;

        @NameInMap("VswitchId")
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

            /**
             * The ID of the cluster.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * The import state of the cluster. Valid values:
             * <p>
             * 
             * *   0: The cluster is not imported.
             * *   1: The cluster is imported.
             * *   2: The cluster fails to be imported.
             * *   3: The cluster is being imported.
             * *   4: The cluster is deleted.
             */
            public Builder clusterImportStatus(Integer clusterImportStatus) {
                this.clusterImportStatus = clusterImportStatus;
                return this;
            }

            /**
             * The name of the cluster.
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * The status of the cluster. Valid values:
             * <p>
             * 
             * *   1: The cluster runs as expected.
             * *   2: The cluster does not run as expected.
             * *   3: The cluster is offline.
             */
            public Builder clusterStatus(Integer clusterStatus) {
                this.clusterStatus = clusterStatus;
                return this;
            }

            /**
             * The type of the cluster. Valid values:
             * <p>
             * 
             * *   2: Elastic Compute Service (ECS) cluster
             * *   5: ACK cluster or Serverless Kubernetes cluster
             */
            public Builder clusterType(Integer clusterType) {
                this.clusterType = clusterType;
                return this;
            }

            /**
             * The total number of CPU cores.
             */
            public Builder cpu(Integer cpu) {
                this.cpu = cpu;
                return this;
            }

            /**
             * The ID of the ACK cluster.
             */
            public Builder csClusterId(String csClusterId) {
                this.csClusterId = csClusterId;
                return this;
            }

            /**
             * The state of the ACK cluster. Valid values:
             * <p>
             * 
             * *   initial: The cluster is being initialized.
             * *   failed: The cluster fails to be created.
             * *   running: The cluster is running.
             * *   updating: The cluster is being updated.
             * *   scaling: The cluster is being scaled out.
             * *   removing: Nodes are being removed from the cluster.
             * *   upgrading: The cluster is being upgraded.
             * *   deleting: The cluster is being deleted.
             * *   delete_failed: The cluster fails to be deleted.
             * *   deleted: The cluster is deleted. The deleted cluster is invisible to users.
             */
            public Builder csClusterStatus(String csClusterStatus) {
                this.csClusterStatus = csClusterStatus;
                return this;
            }

            /**
             * The description of the cluster.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The total size of memory. Unit: MB.
             */
            public Builder mem(Integer mem) {
                this.mem = mem;
                return this;
            }

            /**
             * The network type of the cluster. Valid values:
             * <p>
             * 
             * *   1: classic network
             * *   2: VPC
             */
            public Builder networkMode(Integer networkMode) {
                this.networkMode = networkMode;
                return this;
            }

            /**
             * The number of nodes.
             */
            public Builder nodeNum(Integer nodeNum) {
                this.nodeNum = nodeNum;
                return this;
            }

            /**
             * The ID of the namespace.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The subtype of the cluster. Valid values:
             * <p>
             * 
             * *   Ask: Serverless Kubernetes cluster
             * *   ManagedKubernetes: ACK cluster
             */
            public Builder subClusterType(String subClusterType) {
                this.subClusterType = subClusterType;
                return this;
            }

            /**
             * The CIDR block of the subnet.
             */
            public Builder subNetCidr(String subNetCidr) {
                this.subNetCidr = subNetCidr;
                return this;
            }

            /**
             * The ID of the virtual private cloud (VPC).
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * The ID of the vSwitch.
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
    public static class ClusterList extends TeaModel {
        @NameInMap("Cluster")
        private java.util.List < Cluster> cluster;

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
        public java.util.List < Cluster> getCluster() {
            return this.cluster;
        }

        public static final class Builder {
            private java.util.List < Cluster> cluster; 

            /**
             * Cluster.
             */
            public Builder cluster(java.util.List < Cluster> cluster) {
                this.cluster = cluster;
                return this;
            }

            public ClusterList build() {
                return new ClusterList(this);
            } 

        } 

    }
    public static class ClusterPage extends TeaModel {
        @NameInMap("ClusterList")
        private ClusterList clusterList;

        @NameInMap("CurrentPage")
        private Integer currentPage;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("TotalSize")
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

            /**
             * The list of clusters.
             */
            public Builder clusterList(ClusterList clusterList) {
                this.clusterList = clusterList;
                return this;
            }

            /**
             * The number of the returned page. Default value: 1.
             */
            public Builder currentPage(Integer currentPage) {
                this.currentPage = currentPage;
                return this;
            }

            /**
             * The number of entries returned per page. Default value: 1000.
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * The total number of pages that are returned.
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
