// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cassandra20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClusterResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeClusterResponseBody</p>
 */
public class DescribeClusterResponseBody extends TeaModel {
    @NameInMap("Cluster")
    private Cluster cluster;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeClusterResponseBody(Builder builder) {
        this.cluster = builder.cluster;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClusterResponseBody create() {
        return builder().build();
    }

    /**
     * @return cluster
     */
    public Cluster getCluster() {
        return this.cluster;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Cluster cluster; 
        private String requestId; 

        /**
         * Cluster.
         */
        public Builder cluster(Cluster cluster) {
            this.cluster = cluster;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeClusterResponseBody build() {
            return new DescribeClusterResponseBody(this);
        } 

    } 

    public static class Tag extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
    public static class Tags extends TeaModel {
        @NameInMap("Tag")
        private java.util.List < Tag> tag;

        private Tags(Builder builder) {
            this.tag = builder.tag;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return tag
         */
        public java.util.List < Tag> getTag() {
            return this.tag;
        }

        public static final class Builder {
            private java.util.List < Tag> tag; 

            /**
             * Tag.
             */
            public Builder tag(java.util.List < Tag> tag) {
                this.tag = tag;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    public static class Cluster extends TeaModel {
        @NameInMap("AutoRenewPeriod")
        private Integer autoRenewPeriod;

        @NameInMap("AutoRenewal")
        private Boolean autoRenewal;

        @NameInMap("ClusterId")
        private String clusterId;

        @NameInMap("ClusterName")
        private String clusterName;

        @NameInMap("CreatedTime")
        private String createdTime;

        @NameInMap("DataCenterCount")
        private Integer dataCenterCount;

        @NameInMap("ExpireTime")
        private String expireTime;

        @NameInMap("IsLatestVersion")
        private Boolean isLatestVersion;

        @NameInMap("LockMode")
        private String lockMode;

        @NameInMap("MaintainEndTime")
        private String maintainEndTime;

        @NameInMap("MaintainStartTime")
        private String maintainStartTime;

        @NameInMap("MajorVersion")
        private String majorVersion;

        @NameInMap("MinorVersion")
        private String minorVersion;

        @NameInMap("PayType")
        private String payType;

        @NameInMap("ResourceGroupId")
        private String resourceGroupId;

        @NameInMap("Status")
        private String status;

        @NameInMap("Tags")
        private Tags tags;

        private Cluster(Builder builder) {
            this.autoRenewPeriod = builder.autoRenewPeriod;
            this.autoRenewal = builder.autoRenewal;
            this.clusterId = builder.clusterId;
            this.clusterName = builder.clusterName;
            this.createdTime = builder.createdTime;
            this.dataCenterCount = builder.dataCenterCount;
            this.expireTime = builder.expireTime;
            this.isLatestVersion = builder.isLatestVersion;
            this.lockMode = builder.lockMode;
            this.maintainEndTime = builder.maintainEndTime;
            this.maintainStartTime = builder.maintainStartTime;
            this.majorVersion = builder.majorVersion;
            this.minorVersion = builder.minorVersion;
            this.payType = builder.payType;
            this.resourceGroupId = builder.resourceGroupId;
            this.status = builder.status;
            this.tags = builder.tags;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Cluster create() {
            return builder().build();
        }

        /**
         * @return autoRenewPeriod
         */
        public Integer getAutoRenewPeriod() {
            return this.autoRenewPeriod;
        }

        /**
         * @return autoRenewal
         */
        public Boolean getAutoRenewal() {
            return this.autoRenewal;
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
         * @return createdTime
         */
        public String getCreatedTime() {
            return this.createdTime;
        }

        /**
         * @return dataCenterCount
         */
        public Integer getDataCenterCount() {
            return this.dataCenterCount;
        }

        /**
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return isLatestVersion
         */
        public Boolean getIsLatestVersion() {
            return this.isLatestVersion;
        }

        /**
         * @return lockMode
         */
        public String getLockMode() {
            return this.lockMode;
        }

        /**
         * @return maintainEndTime
         */
        public String getMaintainEndTime() {
            return this.maintainEndTime;
        }

        /**
         * @return maintainStartTime
         */
        public String getMaintainStartTime() {
            return this.maintainStartTime;
        }

        /**
         * @return majorVersion
         */
        public String getMajorVersion() {
            return this.majorVersion;
        }

        /**
         * @return minorVersion
         */
        public String getMinorVersion() {
            return this.minorVersion;
        }

        /**
         * @return payType
         */
        public String getPayType() {
            return this.payType;
        }

        /**
         * @return resourceGroupId
         */
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return tags
         */
        public Tags getTags() {
            return this.tags;
        }

        public static final class Builder {
            private Integer autoRenewPeriod; 
            private Boolean autoRenewal; 
            private String clusterId; 
            private String clusterName; 
            private String createdTime; 
            private Integer dataCenterCount; 
            private String expireTime; 
            private Boolean isLatestVersion; 
            private String lockMode; 
            private String maintainEndTime; 
            private String maintainStartTime; 
            private String majorVersion; 
            private String minorVersion; 
            private String payType; 
            private String resourceGroupId; 
            private String status; 
            private Tags tags; 

            /**
             * AutoRenewPeriod.
             */
            public Builder autoRenewPeriod(Integer autoRenewPeriod) {
                this.autoRenewPeriod = autoRenewPeriod;
                return this;
            }

            /**
             * AutoRenewal.
             */
            public Builder autoRenewal(Boolean autoRenewal) {
                this.autoRenewal = autoRenewal;
                return this;
            }

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
             * CreatedTime.
             */
            public Builder createdTime(String createdTime) {
                this.createdTime = createdTime;
                return this;
            }

            /**
             * DataCenterCount.
             */
            public Builder dataCenterCount(Integer dataCenterCount) {
                this.dataCenterCount = dataCenterCount;
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
             * IsLatestVersion.
             */
            public Builder isLatestVersion(Boolean isLatestVersion) {
                this.isLatestVersion = isLatestVersion;
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
             * MaintainEndTime.
             */
            public Builder maintainEndTime(String maintainEndTime) {
                this.maintainEndTime = maintainEndTime;
                return this;
            }

            /**
             * MaintainStartTime.
             */
            public Builder maintainStartTime(String maintainStartTime) {
                this.maintainStartTime = maintainStartTime;
                return this;
            }

            /**
             * MajorVersion.
             */
            public Builder majorVersion(String majorVersion) {
                this.majorVersion = majorVersion;
                return this;
            }

            /**
             * MinorVersion.
             */
            public Builder minorVersion(String minorVersion) {
                this.minorVersion = minorVersion;
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
             * ResourceGroupId.
             */
            public Builder resourceGroupId(String resourceGroupId) {
                this.resourceGroupId = resourceGroupId;
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
             * Tags.
             */
            public Builder tags(Tags tags) {
                this.tags = tags;
                return this;
            }

            public Cluster build() {
                return new Cluster(this);
            } 

        } 

    }
}
