// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

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
 * {@link ListClustersMetaResponseBody} extends {@link TeaModel}
 *
 * <p>ListClustersMetaResponseBody</p>
 */
public class ListClustersMetaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Clusters")
    private Clusters clusters;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private ListClustersMetaResponseBody(Builder builder) {
        this.clusters = builder.clusters;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListClustersMetaResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return clusters
     */
    public Clusters getClusters() {
        return this.clusters;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Clusters clusters; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(ListClustersMetaResponseBody model) {
            this.clusters = model.clusters;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The list of clusters.</p>
         */
        public Builder clusters(Clusters clusters) {
            this.clusters = clusters;
            return this;
        }

        /**
         * <p>The number of the returned page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of entries returned per page. Valid values: 1 to 50.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>DD517102-B314-4665-BDAC-A32DE7834D02</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of returned entries.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListClustersMetaResponseBody build() {
            return new ListClustersMetaResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListClustersMetaResponseBody} extends {@link TeaModel}
     *
     * <p>ListClustersMetaResponseBody</p>
     */
    public static class ClusterInfoSimple extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AccountType")
        private String accountType;

        @com.aliyun.core.annotation.NameInMap("ClientVersion")
        private String clientVersion;

        @com.aliyun.core.annotation.NameInMap("DeployMode")
        private String deployMode;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("EhpcVersion")
        private String ehpcVersion;

        @com.aliyun.core.annotation.NameInMap("HasPlugin")
        private Boolean hasPlugin;

        @com.aliyun.core.annotation.NameInMap("Id")
        private String id;

        @com.aliyun.core.annotation.NameInMap("IsComputeEss")
        private Boolean isComputeEss;

        @com.aliyun.core.annotation.NameInMap("Location")
        private String location;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OsTag")
        private String osTag;

        @com.aliyun.core.annotation.NameInMap("SchedulerType")
        private String schedulerType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        private ClusterInfoSimple(Builder builder) {
            this.accountType = builder.accountType;
            this.clientVersion = builder.clientVersion;
            this.deployMode = builder.deployMode;
            this.description = builder.description;
            this.ehpcVersion = builder.ehpcVersion;
            this.hasPlugin = builder.hasPlugin;
            this.id = builder.id;
            this.isComputeEss = builder.isComputeEss;
            this.location = builder.location;
            this.name = builder.name;
            this.osTag = builder.osTag;
            this.schedulerType = builder.schedulerType;
            this.status = builder.status;
            this.vpcId = builder.vpcId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ClusterInfoSimple create() {
            return builder().build();
        }

        /**
         * @return accountType
         */
        public String getAccountType() {
            return this.accountType;
        }

        /**
         * @return clientVersion
         */
        public String getClientVersion() {
            return this.clientVersion;
        }

        /**
         * @return deployMode
         */
        public String getDeployMode() {
            return this.deployMode;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return ehpcVersion
         */
        public String getEhpcVersion() {
            return this.ehpcVersion;
        }

        /**
         * @return hasPlugin
         */
        public Boolean getHasPlugin() {
            return this.hasPlugin;
        }

        /**
         * @return id
         */
        public String getId() {
            return this.id;
        }

        /**
         * @return isComputeEss
         */
        public Boolean getIsComputeEss() {
            return this.isComputeEss;
        }

        /**
         * @return location
         */
        public String getLocation() {
            return this.location;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return osTag
         */
        public String getOsTag() {
            return this.osTag;
        }

        /**
         * @return schedulerType
         */
        public String getSchedulerType() {
            return this.schedulerType;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        public static final class Builder {
            private String accountType; 
            private String clientVersion; 
            private String deployMode; 
            private String description; 
            private String ehpcVersion; 
            private Boolean hasPlugin; 
            private String id; 
            private Boolean isComputeEss; 
            private String location; 
            private String name; 
            private String osTag; 
            private String schedulerType; 
            private String status; 
            private String vpcId; 

            private Builder() {
            } 

            private Builder(ClusterInfoSimple model) {
                this.accountType = model.accountType;
                this.clientVersion = model.clientVersion;
                this.deployMode = model.deployMode;
                this.description = model.description;
                this.ehpcVersion = model.ehpcVersion;
                this.hasPlugin = model.hasPlugin;
                this.id = model.id;
                this.isComputeEss = model.isComputeEss;
                this.location = model.location;
                this.name = model.name;
                this.osTag = model.osTag;
                this.schedulerType = model.schedulerType;
                this.status = model.status;
                this.vpcId = model.vpcId;
            } 

            /**
             * <p>The server type of the account. Valid values:</p>
             * <ul>
             * <li>nis</li>
             * <li>ldap</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>nis</p>
             */
            public Builder accountType(String accountType) {
                this.accountType = accountType;
                return this;
            }

            /**
             * <p>The version of the client.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0.64</p>
             */
            public Builder clientVersion(String clientVersion) {
                this.clientVersion = clientVersion;
                return this;
            }

            /**
             * <p>The mode in which the cluster is deployed. Valid values:</p>
             * <ul>
             * <li>Standard: An account node, a scheduling node, a logon node, and multiple compute nodes are separately deployed.</li>
             * <li>Advanced: Two high availability (HA) account nodes, two HA scheduler nodes, one logon node, and multiple compute nodes are separately deployed.</li>
             * <li>Simple: A management node, a logon node, and multiple compute nodes are deployed. The management node consists of an account node and a scheduling node. The logon node and compute nodes are separately deployed.</li>
             * <li>Tiny: A management node and multiple compute nodes are deployed. The management node consists of an account node, a scheduling node, and a logon node. The compute nodes are separately deployed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Standard</p>
             */
            public Builder deployMode(String deployMode) {
                this.deployMode = deployMode;
                return this;
            }

            /**
             * <p>The description of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>clusterdescription</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The version of E-HPC.</p>
             * 
             * <strong>example:</strong>
             * <p>1.0.0</p>
             */
            public Builder ehpcVersion(String ehpcVersion) {
                this.ehpcVersion = ehpcVersion;
                return this;
            }

            /**
             * <p>Indicates whether the cluster uses a plug-in. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * <p>Default value: false</p>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder hasPlugin(Boolean hasPlugin) {
                this.hasPlugin = hasPlugin;
                return this;
            }

            /**
             * <p>The ID of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>ehpc-hz-jeJki6****</p>
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * <p>Indicates whether a scaling group is enabled. Valid values:</p>
             * <ul>
             * <li>true: A scaling group is enabled.</li>
             * <li>false: No scaling group is enabled.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder isComputeEss(Boolean isComputeEss) {
                this.isComputeEss = isComputeEss;
                return this;
            }

            /**
             * <p>The location where the cluster is deployed. Valid values:</p>
             * <ul>
             * <li>OnPremise: The cluster is deployed on a hybrid cloud.</li>
             * <li>PublicCloud: The cluster is deployed on a public cloud.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PublicCloud</p>
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * <p>The name of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>cluster1</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The image tag of the operating system.</p>
             * 
             * <strong>example:</strong>
             * <p>CentOS_7.2_64</p>
             */
            public Builder osTag(String osTag) {
                this.osTag = osTag;
                return this;
            }

            /**
             * <p>The type of the scheduler. Valid values:</p>
             * <ul>
             * <li>pbs</li>
             * <li>slurm</li>
             * <li>opengridscheduler</li>
             * <li>deadline</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>pbs</p>
             */
            public Builder schedulerType(String schedulerType) {
                this.schedulerType = schedulerType;
                return this;
            }

            /**
             * <p>The status of the cluster. Valid values:</p>
             * <ul>
             * <li>uninit: The cluster is not initialized.</li>
             * <li>creating: The cluster is being created.</li>
             * <li>init: The cluster is being initialized.</li>
             * <li>running: The cluster is running.</li>
             * <li>exception: The cluster encounters an exception.</li>
             * <li>releasing: The cluster is being released.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>running</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The ID of the virtual private cloud (VPC).</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-b3f3edefefeep0760yju****</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            public ClusterInfoSimple build() {
                return new ClusterInfoSimple(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListClustersMetaResponseBody} extends {@link TeaModel}
     *
     * <p>ListClustersMetaResponseBody</p>
     */
    public static class Clusters extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterInfoSimple")
        private java.util.List<ClusterInfoSimple> clusterInfoSimple;

        private Clusters(Builder builder) {
            this.clusterInfoSimple = builder.clusterInfoSimple;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Clusters create() {
            return builder().build();
        }

        /**
         * @return clusterInfoSimple
         */
        public java.util.List<ClusterInfoSimple> getClusterInfoSimple() {
            return this.clusterInfoSimple;
        }

        public static final class Builder {
            private java.util.List<ClusterInfoSimple> clusterInfoSimple; 

            private Builder() {
            } 

            private Builder(Clusters model) {
                this.clusterInfoSimple = model.clusterInfoSimple;
            } 

            /**
             * ClusterInfoSimple.
             */
            public Builder clusterInfoSimple(java.util.List<ClusterInfoSimple> clusterInfoSimple) {
                this.clusterInfoSimple = clusterInfoSimple;
                return this;
            }

            public Clusters build() {
                return new Clusters(this);
            } 

        } 

    }
}
