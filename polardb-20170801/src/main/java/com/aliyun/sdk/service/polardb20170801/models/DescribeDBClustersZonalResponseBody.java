// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribeDBClustersZonalResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBClustersZonalResponseBody</p>
 */
public class DescribeDBClustersZonalResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private java.util.List<Items> items;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalRecordCount")
    private Integer totalRecordCount;

    private DescribeDBClustersZonalResponseBody(Builder builder) {
        this.items = builder.items;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
        this.requestId = builder.requestId;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBClustersZonalResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return items
     */
    public java.util.List<Items> getItems() {
        return this.items;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageRecordCount
     */
    public Integer getPageRecordCount() {
        return this.pageRecordCount;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalRecordCount
     */
    public Integer getTotalRecordCount() {
        return this.totalRecordCount;
    }

    public static final class Builder {
        private java.util.List<Items> items; 
        private Integer maxResults; 
        private String nextToken; 
        private Integer pageNumber; 
        private Integer pageRecordCount; 
        private String requestId; 
        private Integer totalRecordCount; 

        private Builder() {
        } 

        private Builder(DescribeDBClustersZonalResponseBody model) {
            this.items = model.items;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.pageNumber = model.pageNumber;
            this.pageRecordCount = model.pageRecordCount;
            this.requestId = model.requestId;
            this.totalRecordCount = model.totalRecordCount;
        } 

        /**
         * <p>The list of clusters.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The maximum number of entries returned for the current request. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The token to retrieve the next page of results. If more results are available, this parameter is returned. To retrieve the next page, include this token in your next request. If all results have been returned, this parameter is not returned.</p>
         * 
         * <strong>example:</strong>
         * <p>212db86sca4384811e0b5e8707e******</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of clusters on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9B7BFB11-C077-4FE3-B051-F69CEB******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeDBClustersZonalResponseBody build() {
            return new DescribeDBClustersZonalResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDBClustersZonalResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBClustersZonalResponseBody</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
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

            private Builder() {
            } 

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The tag key.</p>
             * 
             * <strong>example:</strong>
             * <p>MySQL</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The tag value.</p>
             * 
             * <strong>example:</strong>
             * <p>5.6</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDBClustersZonalResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBClustersZonalResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AiType")
        private String aiType;

        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("CentralControlRegionId")
        private String centralControlRegionId;

        @com.aliyun.core.annotation.NameInMap("CloudProvider")
        private String cloudProvider;

        @com.aliyun.core.annotation.NameInMap("CpuCores")
        private String cpuCores;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DBClusterDescription")
        private String DBClusterDescription;

        @com.aliyun.core.annotation.NameInMap("DBClusterId")
        private String DBClusterId;

        @com.aliyun.core.annotation.NameInMap("DBClusterStatus")
        private String DBClusterStatus;

        @com.aliyun.core.annotation.NameInMap("DBNodeClass")
        private String DBNodeClass;

        @com.aliyun.core.annotation.NameInMap("DBNodeNumber")
        private Integer DBNodeNumber;

        @com.aliyun.core.annotation.NameInMap("DBType")
        private String DBType;

        @com.aliyun.core.annotation.NameInMap("DBVersion")
        private String DBVersion;

        @com.aliyun.core.annotation.NameInMap("ENSRegionId")
        private String ENSRegionId;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private String expireTime;

        @com.aliyun.core.annotation.NameInMap("Expired")
        private String expired;

        @com.aliyun.core.annotation.NameInMap("LockMode")
        private String lockMode;

        @com.aliyun.core.annotation.NameInMap("PayType")
        private String payType;

        @com.aliyun.core.annotation.NameInMap("ServerlessType")
        private String serverlessType;

        @com.aliyun.core.annotation.NameInMap("StorageSpace")
        private Long storageSpace;

        @com.aliyun.core.annotation.NameInMap("StorageType")
        private String storageType;

        @com.aliyun.core.annotation.NameInMap("StorageUsed")
        private Long storageUsed;

        @com.aliyun.core.annotation.NameInMap("StrictConsistency")
        private String strictConsistency;

        @com.aliyun.core.annotation.NameInMap("SubCategory")
        private String subCategory;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("VswitchId")
        private String vswitchId;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private Items(Builder builder) {
            this.aiType = builder.aiType;
            this.category = builder.category;
            this.centralControlRegionId = builder.centralControlRegionId;
            this.cloudProvider = builder.cloudProvider;
            this.cpuCores = builder.cpuCores;
            this.createTime = builder.createTime;
            this.DBClusterDescription = builder.DBClusterDescription;
            this.DBClusterId = builder.DBClusterId;
            this.DBClusterStatus = builder.DBClusterStatus;
            this.DBNodeClass = builder.DBNodeClass;
            this.DBNodeNumber = builder.DBNodeNumber;
            this.DBType = builder.DBType;
            this.DBVersion = builder.DBVersion;
            this.ENSRegionId = builder.ENSRegionId;
            this.expireTime = builder.expireTime;
            this.expired = builder.expired;
            this.lockMode = builder.lockMode;
            this.payType = builder.payType;
            this.serverlessType = builder.serverlessType;
            this.storageSpace = builder.storageSpace;
            this.storageType = builder.storageType;
            this.storageUsed = builder.storageUsed;
            this.strictConsistency = builder.strictConsistency;
            this.subCategory = builder.subCategory;
            this.tags = builder.tags;
            this.vpcId = builder.vpcId;
            this.vswitchId = builder.vswitchId;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return aiType
         */
        public String getAiType() {
            return this.aiType;
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
        }

        /**
         * @return centralControlRegionId
         */
        public String getCentralControlRegionId() {
            return this.centralControlRegionId;
        }

        /**
         * @return cloudProvider
         */
        public String getCloudProvider() {
            return this.cloudProvider;
        }

        /**
         * @return cpuCores
         */
        public String getCpuCores() {
            return this.cpuCores;
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return DBClusterDescription
         */
        public String getDBClusterDescription() {
            return this.DBClusterDescription;
        }

        /**
         * @return DBClusterId
         */
        public String getDBClusterId() {
            return this.DBClusterId;
        }

        /**
         * @return DBClusterStatus
         */
        public String getDBClusterStatus() {
            return this.DBClusterStatus;
        }

        /**
         * @return DBNodeClass
         */
        public String getDBNodeClass() {
            return this.DBNodeClass;
        }

        /**
         * @return DBNodeNumber
         */
        public Integer getDBNodeNumber() {
            return this.DBNodeNumber;
        }

        /**
         * @return DBType
         */
        public String getDBType() {
            return this.DBType;
        }

        /**
         * @return DBVersion
         */
        public String getDBVersion() {
            return this.DBVersion;
        }

        /**
         * @return ENSRegionId
         */
        public String getENSRegionId() {
            return this.ENSRegionId;
        }

        /**
         * @return expireTime
         */
        public String getExpireTime() {
            return this.expireTime;
        }

        /**
         * @return expired
         */
        public String getExpired() {
            return this.expired;
        }

        /**
         * @return lockMode
         */
        public String getLockMode() {
            return this.lockMode;
        }

        /**
         * @return payType
         */
        public String getPayType() {
            return this.payType;
        }

        /**
         * @return serverlessType
         */
        public String getServerlessType() {
            return this.serverlessType;
        }

        /**
         * @return storageSpace
         */
        public Long getStorageSpace() {
            return this.storageSpace;
        }

        /**
         * @return storageType
         */
        public String getStorageType() {
            return this.storageType;
        }

        /**
         * @return storageUsed
         */
        public Long getStorageUsed() {
            return this.storageUsed;
        }

        /**
         * @return strictConsistency
         */
        public String getStrictConsistency() {
            return this.strictConsistency;
        }

        /**
         * @return subCategory
         */
        public String getSubCategory() {
            return this.subCategory;
        }

        /**
         * @return tags
         */
        public java.util.List<Tags> getTags() {
            return this.tags;
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

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private String aiType; 
            private String category; 
            private String centralControlRegionId; 
            private String cloudProvider; 
            private String cpuCores; 
            private String createTime; 
            private String DBClusterDescription; 
            private String DBClusterId; 
            private String DBClusterStatus; 
            private String DBNodeClass; 
            private Integer DBNodeNumber; 
            private String DBType; 
            private String DBVersion; 
            private String ENSRegionId; 
            private String expireTime; 
            private String expired; 
            private String lockMode; 
            private String payType; 
            private String serverlessType; 
            private Long storageSpace; 
            private String storageType; 
            private Long storageUsed; 
            private String strictConsistency; 
            private String subCategory; 
            private java.util.List<Tags> tags; 
            private String vpcId; 
            private String vswitchId; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.aiType = model.aiType;
                this.category = model.category;
                this.centralControlRegionId = model.centralControlRegionId;
                this.cloudProvider = model.cloudProvider;
                this.cpuCores = model.cpuCores;
                this.createTime = model.createTime;
                this.DBClusterDescription = model.DBClusterDescription;
                this.DBClusterId = model.DBClusterId;
                this.DBClusterStatus = model.DBClusterStatus;
                this.DBNodeClass = model.DBNodeClass;
                this.DBNodeNumber = model.DBNodeNumber;
                this.DBType = model.DBType;
                this.DBVersion = model.DBVersion;
                this.ENSRegionId = model.ENSRegionId;
                this.expireTime = model.expireTime;
                this.expired = model.expired;
                this.lockMode = model.lockMode;
                this.payType = model.payType;
                this.serverlessType = model.serverlessType;
                this.storageSpace = model.storageSpace;
                this.storageType = model.storageType;
                this.storageUsed = model.storageUsed;
                this.strictConsistency = model.strictConsistency;
                this.subCategory = model.subCategory;
                this.tags = model.tags;
                this.vpcId = model.vpcId;
                this.vswitchId = model.vswitchId;
                this.zoneId = model.zoneId;
            } 

            /**
             * <p>The AI node type. Valid values:</p>
             * <ul>
             * <li><p>SearchNode: search node</p>
             * </li>
             * <li><p>DLNode: AI node</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>SearchNode</p>
             */
            public Builder aiType(String aiType) {
                this.aiType = aiType;
                return this;
            }

            /**
             * <p>The Cluster Edition. The following editions are supported:</p>
             * <ul>
             * <li><p>Normal: Cluster Edition</p>
             * </li>
             * <li><p>Basic: single node</p>
             * </li>
             * <li><p>Archive: X-Engine</p>
             * </li>
             * <li><p>NormalMultimaster: Multi-master Cluster (Database/Table)</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Normal</p>
             */
            public Builder category(String category) {
                this.category = category;
                return this;
            }

            /**
             * <p>The ID of the central control region.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-beijing</p>
             */
            public Builder centralControlRegionId(String centralControlRegionId) {
                this.centralControlRegionId = centralControlRegionId;
                return this;
            }

            /**
             * <p>The cloud service provider.</p>
             * 
             * <strong>example:</strong>
             * <p>ENS</p>
             */
            public Builder cloudProvider(String cloudProvider) {
                this.cloudProvider = cloudProvider;
                return this;
            }

            /**
             * <p>The number of CPU cores.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder cpuCores(String cpuCores) {
                this.cpuCores = cpuCores;
                return this;
            }

            /**
             * <p>The creation time.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-08-14T05:58:42Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The description of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>GDN-1</p>
             */
            public Builder DBClusterDescription(String DBClusterDescription) {
                this.DBClusterDescription = DBClusterDescription;
                return this;
            }

            /**
             * <p>The cluster ID.</p>
             * 
             * <strong>example:</strong>
             * <p>pc-****************</p>
             */
            public Builder DBClusterId(String DBClusterId) {
                this.DBClusterId = DBClusterId;
                return this;
            }

            /**
             * <p>The status of the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder DBClusterStatus(String DBClusterStatus) {
                this.DBClusterStatus = DBClusterStatus;
                return this;
            }

            /**
             * <p>The node specifications.</p>
             * 
             * <strong>example:</strong>
             * <p>polar.mysql.g1.tiny.c</p>
             */
            public Builder DBNodeClass(String DBNodeClass) {
                this.DBNodeClass = DBNodeClass;
                return this;
            }

            /**
             * <p>The number of nodes.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder DBNodeNumber(Integer DBNodeNumber) {
                this.DBNodeNumber = DBNodeNumber;
                return this;
            }

            /**
             * <p>The database type.</p>
             * 
             * <strong>example:</strong>
             * <p>MySQL</p>
             */
            public Builder DBType(String DBType) {
                this.DBType = DBType;
                return this;
            }

            /**
             * <p>The database version.</p>
             * 
             * <strong>example:</strong>
             * <p>5.6</p>
             */
            public Builder DBVersion(String DBVersion) {
                this.DBVersion = DBVersion;
                return this;
            }

            /**
             * <p>The ENS region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>sg-singapore-9</p>
             */
            public Builder ENSRegionId(String ENSRegionId) {
                this.ENSRegionId = ENSRegionId;
                return this;
            }

            /**
             * <p>The expiration time of the cluster.</p>
             * <blockquote>
             * <p>This parameter is returned only for <strong>Prepaid</strong> (subscription) clusters. For <strong>Postpaid</strong> (pay-as-you-go) clusters, this parameter is empty.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2022-09-14T16:00:00Z</p>
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * <p>Indicates whether the cluster has expired. Valid values:</p>
             * <ul>
             * <li><p>true</p>
             * </li>
             * <li><p>false</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder expired(String expired) {
                this.expired = expired;
                return this;
            }

            /**
             * <p>The lock state of the cluster. Valid values:</p>
             * <ul>
             * <li><p>Unlock: Normal.</p>
             * </li>
             * <li><p>ManualLock: The cluster is manually locked.</p>
             * </li>
             * <li><p>LockByExpiration: The cluster is automatically locked upon expiration.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Unlock</p>
             */
            public Builder lockMode(String lockMode) {
                this.lockMode = lockMode;
                return this;
            }

            /**
             * <p>The billing method. Valid values:</p>
             * <ul>
             * <li><p>Postpaid: pay-as-you-go.</p>
             * </li>
             * <li><p>Prepaid: subscription.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Prepaid</p>
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * <p>The Serverless type. \<code>**AgileServerless**\\</code> indicates that the cluster is a Serverless cluster. An empty value indicates that the cluster is a common cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>AgileServerless</p>
             */
            public Builder serverlessType(String serverlessType) {
                this.serverlessType = serverlessType;
                return this;
            }

            /**
             * <p>The storage capacity of the instance.</p>
             * 
             * <strong>example:</strong>
             * <p>10</p>
             */
            public Builder storageSpace(Long storageSpace) {
                this.storageSpace = storageSpace;
                return this;
            }

            /**
             * <p>The storage class of the Standard Edition cluster. Valid values:</p>
             * <ul>
             * <li><p>essdpl0</p>
             * </li>
             * <li><p>essdpl1</p>
             * </li>
             * <li><p>essdpl2</p>
             * </li>
             * <li><p>essdpl3</p>
             * </li>
             * <li><p>essdautopl</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>essdautopl</p>
             */
            public Builder storageType(String storageType) {
                this.storageType = storageType;
                return this;
            }

            /**
             * <p>The used storage space of the cluster. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>3009413120</p>
             */
            public Builder storageUsed(Long storageUsed) {
                this.storageUsed = storageUsed;
                return this;
            }

            /**
             * <p>Indicates whether strong consistency is enabled for data across multiple zones. Valid values:</p>
             * <ul>
             * <li><p><strong>ON</strong>: Strong consistency is enabled. This applies to Standard Edition clusters that are deployed in three zones.</p>
             * </li>
             * <li><p><strong>OFF</strong>: Strong consistency is not enabled.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>ON</p>
             */
            public Builder strictConsistency(String strictConsistency) {
                this.strictConsistency = strictConsistency;
                return this;
            }

            /**
             * <p>The specification type of the compute node. Valid values:</p>
             * <ul>
             * <li><p><strong>Exclusive</strong>: Dedicated</p>
             * </li>
             * <li><p><strong>General</strong>: General-purpose</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Exclusive</p>
             */
            public Builder subCategory(String subCategory) {
                this.subCategory = subCategory;
                return this;
            }

            /**
             * <p>The list of tags.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The ID of the virtual private cloud (VPC).</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-****************</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>The virtual switch ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-***************</p>
             */
            public Builder vswitchId(String vswitchId) {
                this.vswitchId = vswitchId;
                return this;
            }

            /**
             * <p>The zone ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou-i</p>
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
