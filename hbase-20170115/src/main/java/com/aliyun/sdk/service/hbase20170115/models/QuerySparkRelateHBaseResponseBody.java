// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbase20170115.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QuerySparkRelateHBaseResponseBody} extends {@link TeaModel}
 *
 * <p>QuerySparkRelateHBaseResponseBody</p>
 */
public class QuerySparkRelateHBaseResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ClusterList")
    private ClusterList clusterList;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private QuerySparkRelateHBaseResponseBody(Builder builder) {
        this.clusterList = builder.clusterList;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QuerySparkRelateHBaseResponseBody create() {
        return builder().build();
    }

    /**
     * @return clusterList
     */
    public ClusterList getClusterList() {
        return this.clusterList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ClusterList clusterList; 
        private String requestId; 

        /**
         * ClusterList.
         */
        public Builder clusterList(ClusterList clusterList) {
            this.clusterList = clusterList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QuerySparkRelateHBaseResponseBody build() {
            return new QuerySparkRelateHBaseResponseBody(this);
        } 

    } 

    public static class Cluster extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ClusterId")
        private String clusterId;

        @com.aliyun.core.annotation.NameInMap("ClusterName")
        private String clusterName;

        @com.aliyun.core.annotation.NameInMap("ClusterType")
        private String clusterType;

        @com.aliyun.core.annotation.NameInMap("CoreDiskType")
        private String coreDiskType;

        @com.aliyun.core.annotation.NameInMap("CoreInstanceQuantity")
        private Integer coreInstanceQuantity;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DbType")
        private String dbType;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private String expireTime;

        @com.aliyun.core.annotation.NameInMap("IsRelated")
        private Boolean isRelated;

        @com.aliyun.core.annotation.NameInMap("LockMode")
        private String lockMode;

        @com.aliyun.core.annotation.NameInMap("MainVersion")
        private String mainVersion;

        @com.aliyun.core.annotation.NameInMap("NetType")
        private String netType;

        @com.aliyun.core.annotation.NameInMap("PayType")
        private String payType;

        @com.aliyun.core.annotation.NameInMap("Reason")
        private String reason;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UserId")
        private String userId;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private Cluster(Builder builder) {
            this.clusterId = builder.clusterId;
            this.clusterName = builder.clusterName;
            this.clusterType = builder.clusterType;
            this.coreDiskType = builder.coreDiskType;
            this.coreInstanceQuantity = builder.coreInstanceQuantity;
            this.createTime = builder.createTime;
            this.dbType = builder.dbType;
            this.expireTime = builder.expireTime;
            this.isRelated = builder.isRelated;
            this.lockMode = builder.lockMode;
            this.mainVersion = builder.mainVersion;
            this.netType = builder.netType;
            this.payType = builder.payType;
            this.reason = builder.reason;
            this.regionId = builder.regionId;
            this.status = builder.status;
            this.userId = builder.userId;
            this.zoneId = builder.zoneId;
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
        public String getClusterType() {
            return this.clusterType;
        }

        /**
         * @return coreDiskType
         */
        public String getCoreDiskType() {
            return this.coreDiskType;
        }

        /**
         * @return coreInstanceQuantity
         */
        public Integer getCoreInstanceQuantity() {
            return this.coreInstanceQuantity;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return dbType
         */
        public String getDbType() {
            return this.dbType;
        }

        /**
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return isRelated
         */
        public Boolean getIsRelated() {
            return this.isRelated;
        }

        /**
         * @return lockMode
         */
        public String getLockMode() {
            return this.lockMode;
        }

        /**
         * @return mainVersion
         */
        public String getMainVersion() {
            return this.mainVersion;
        }

        /**
         * @return netType
         */
        public String getNetType() {
            return this.netType;
        }

        /**
         * @return payType
         */
        public String getPayType() {
            return this.payType;
        }

        /**
         * @return reason
         */
        public String getReason() {
            return this.reason;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return userId
         */
        public String getUserId() {
            return this.userId;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String clusterId; 
            private String clusterName; 
            private String clusterType; 
            private String coreDiskType; 
            private Integer coreInstanceQuantity; 
            private String createTime; 
            private String dbType; 
            private String expireTime; 
            private Boolean isRelated; 
            private String lockMode; 
            private String mainVersion; 
            private String netType; 
            private String payType; 
            private String reason; 
            private String regionId; 
            private String status; 
            private String userId; 
            private String zoneId; 

            /**
             * ClusterId.
             */
            public Builder clusterId(String clusterId) {
                this.clusterId = clusterId;
                return this;
            }

            /**
             * ClusterName.
             */
            public Builder clusterName(String clusterName) {
                this.clusterName = clusterName;
                return this;
            }

            /**
             * ClusterType.
             */
            public Builder clusterType(String clusterType) {
                this.clusterType = clusterType;
                return this;
            }

            /**
             * CoreDiskType.
             */
            public Builder coreDiskType(String coreDiskType) {
                this.coreDiskType = coreDiskType;
                return this;
            }

            /**
             * CoreInstanceQuantity.
             */
            public Builder coreInstanceQuantity(Integer coreInstanceQuantity) {
                this.coreInstanceQuantity = coreInstanceQuantity;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DbType.
             */
            public Builder dbType(String dbType) {
                this.dbType = dbType;
                return this;
            }

            /**
             * ExpireTime.
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * IsRelated.
             */
            public Builder isRelated(Boolean isRelated) {
                this.isRelated = isRelated;
                return this;
            }

            /**
             * LockMode.
             */
            public Builder lockMode(String lockMode) {
                this.lockMode = lockMode;
                return this;
            }

            /**
             * MainVersion.
             */
            public Builder mainVersion(String mainVersion) {
                this.mainVersion = mainVersion;
                return this;
            }

            /**
             * NetType.
             */
            public Builder netType(String netType) {
                this.netType = netType;
                return this;
            }

            /**
             * PayType.
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * Reason.
             */
            public Builder reason(String reason) {
                this.reason = reason;
                return this;
            }

            /**
             * RegionId.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
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
             * UserId.
             */
            public Builder userId(String userId) {
                this.userId = userId;
                return this;
            }

            /**
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public Cluster build() {
                return new Cluster(this);
            } 

        } 

    }
    public static class ClusterList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Cluster")
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
}
