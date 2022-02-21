// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ehpc20180412.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListClustersMetaResponseBody} extends {@link TeaModel}
 *
 * <p>ListClustersMetaResponseBody</p>
 */
public class ListClustersMetaResponseBody extends TeaModel {
    @NameInMap("Clusters")
    private Clusters clusters;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
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

        /**
         * Clusters.
         */
        public Builder clusters(Clusters clusters) {
            this.clusters = clusters;
            return this;
        }

        /**
         * PageNumber.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * PageSize.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListClustersMetaResponseBody build() {
            return new ListClustersMetaResponseBody(this);
        } 

    } 

    public static class ClusterInfoSimple extends TeaModel {
        @NameInMap("AccountType")
        private String accountType;

        @NameInMap("ClientVersion")
        private String clientVersion;

        @NameInMap("DeployMode")
        private String deployMode;

        @NameInMap("Description")
        private String description;

        @NameInMap("HasPlugin")
        private Boolean hasPlugin;

        @NameInMap("Id")
        private String id;

        @NameInMap("IsComputeEss")
        private Boolean isComputeEss;

        @NameInMap("Location")
        private String location;

        @NameInMap("Name")
        private String name;

        @NameInMap("OsTag")
        private String osTag;

        @NameInMap("SchedulerType")
        private String schedulerType;

        @NameInMap("Status")
        private String status;

        @NameInMap("VpcId")
        private String vpcId;

        private ClusterInfoSimple(Builder builder) {
            this.accountType = builder.accountType;
            this.clientVersion = builder.clientVersion;
            this.deployMode = builder.deployMode;
            this.description = builder.description;
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
            private Boolean hasPlugin; 
            private String id; 
            private Boolean isComputeEss; 
            private String location; 
            private String name; 
            private String osTag; 
            private String schedulerType; 
            private String status; 
            private String vpcId; 

            /**
             * AccountType.
             */
            public Builder accountType(String accountType) {
                this.accountType = accountType;
                return this;
            }

            /**
             * ClientVersion.
             */
            public Builder clientVersion(String clientVersion) {
                this.clientVersion = clientVersion;
                return this;
            }

            /**
             * DeployMode.
             */
            public Builder deployMode(String deployMode) {
                this.deployMode = deployMode;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * HasPlugin.
             */
            public Builder hasPlugin(Boolean hasPlugin) {
                this.hasPlugin = hasPlugin;
                return this;
            }

            /**
             * Id.
             */
            public Builder id(String id) {
                this.id = id;
                return this;
            }

            /**
             * IsComputeEss.
             */
            public Builder isComputeEss(Boolean isComputeEss) {
                this.isComputeEss = isComputeEss;
                return this;
            }

            /**
             * Location.
             */
            public Builder location(String location) {
                this.location = location;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * OsTag.
             */
            public Builder osTag(String osTag) {
                this.osTag = osTag;
                return this;
            }

            /**
             * SchedulerType.
             */
            public Builder schedulerType(String schedulerType) {
                this.schedulerType = schedulerType;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * VpcId.
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
    public static class Clusters extends TeaModel {
        @NameInMap("ClusterInfoSimple")
        private java.util.List < ClusterInfoSimple> clusterInfoSimple;

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
        public java.util.List < ClusterInfoSimple> getClusterInfoSimple() {
            return this.clusterInfoSimple;
        }

        public static final class Builder {
            private java.util.List < ClusterInfoSimple> clusterInfoSimple; 

            /**
             * ClusterInfoSimple.
             */
            public Builder clusterInfoSimple(java.util.List < ClusterInfoSimple> clusterInfoSimple) {
                this.clusterInfoSimple = clusterInfoSimple;
                return this;
            }

            public Clusters build() {
                return new Clusters(this);
            } 

        } 

    }
}
