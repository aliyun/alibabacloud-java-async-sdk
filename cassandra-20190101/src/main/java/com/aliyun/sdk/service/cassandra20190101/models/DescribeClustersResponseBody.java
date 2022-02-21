// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cassandra20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeClustersResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeClustersResponseBody</p>
 */
public class DescribeClustersResponseBody extends TeaModel {
    @NameInMap("Clusters")
    private Clusters clusters;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Long totalCount;

    private DescribeClustersResponseBody(Builder builder) {
        this.clusters = builder.clusters;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeClustersResponseBody create() {
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
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private Clusters clusters; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Long totalCount; 

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
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeClustersResponseBody build() {
            return new DescribeClustersResponseBody(this);
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

        @NameInMap("LockMode")
        private String lockMode;

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
            this.lockMode = builder.lockMode;
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
         * @return lockMode
         */
        public String getLockMode() {
            return this.lockMode;
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
            private String lockMode; 
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
             * LockMode.
             */
            public Builder lockMode(String lockMode) {
                this.lockMode = lockMode;
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
    public static class Clusters extends TeaModel {
        @NameInMap("Cluster")
        private java.util.List < Cluster> cluster;

        private Clusters(Builder builder) {
            this.cluster = builder.cluster;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Clusters create() {
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

            public Clusters build() {
                return new Clusters(this);
            } 

        } 

    }
}
