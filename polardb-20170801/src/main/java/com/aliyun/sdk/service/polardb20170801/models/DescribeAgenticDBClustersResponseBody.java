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
 * {@link DescribeAgenticDBClustersResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAgenticDBClustersResponseBody</p>
 */
public class DescribeAgenticDBClustersResponseBody extends TeaModel {
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

    private DescribeAgenticDBClustersResponseBody(Builder builder) {
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

    public static DescribeAgenticDBClustersResponseBody create() {
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

        private Builder(DescribeAgenticDBClustersResponseBody model) {
            this.items = model.items;
            this.maxResults = model.maxResults;
            this.nextToken = model.nextToken;
            this.pageNumber = model.pageNumber;
            this.pageRecordCount = model.pageRecordCount;
            this.requestId = model.requestId;
            this.totalRecordCount = model.totalRecordCount;
        } 

        /**
         * <p>The cluster list.</p>
         */
        public Builder items(java.util.List<Items> items) {
            this.items = items;
            return this;
        }

        /**
         * <p>The maximum number of entries to return. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The pagination token. Set this parameter to the NextToken value returned in the previous API call. If there is no next query, do not pass this parameter.</p>
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
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of clusters on the current page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>CDB3258F-B5DE-43C4-8935-CBA0CA******</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeAgenticDBClustersResponseBody build() {
            return new DescribeAgenticDBClustersResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeAgenticDBClustersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAgenticDBClustersResponseBody</p>
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
             * <p>testValueData</p>
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
     * {@link DescribeAgenticDBClustersResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeAgenticDBClustersResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AgenticDbClusterDescription")
        private String agenticDbClusterDescription;

        @com.aliyun.core.annotation.NameInMap("AgenticDbClusterId")
        private String agenticDbClusterId;

        @com.aliyun.core.annotation.NameInMap("Category")
        private String category;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("DBClusterDescription")
        private String DBClusterDescription;

        @com.aliyun.core.annotation.NameInMap("DBClusterId")
        private String DBClusterId;

        @com.aliyun.core.annotation.NameInMap("DBClusterStatus")
        private String DBClusterStatus;

        @com.aliyun.core.annotation.NameInMap("DBType")
        private String DBType;

        @com.aliyun.core.annotation.NameInMap("DBVersion")
        private String DBVersion;

        @com.aliyun.core.annotation.NameInMap("ExpireTime")
        private String expireTime;

        @com.aliyun.core.annotation.NameInMap("Expired")
        private String expired;

        @com.aliyun.core.annotation.NameInMap("LockMode")
        private String lockMode;

        @com.aliyun.core.annotation.NameInMap("PayType")
        private String payType;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ScaleMax")
        private String scaleMax;

        @com.aliyun.core.annotation.NameInMap("ScaleMin")
        private String scaleMin;

        @com.aliyun.core.annotation.NameInMap("ServerlessType")
        private String serverlessType;

        @com.aliyun.core.annotation.NameInMap("StorageType")
        private String storageType;

        @com.aliyun.core.annotation.NameInMap("StorageUsed")
        private Long storageUsed;

        @com.aliyun.core.annotation.NameInMap("Tags")
        private java.util.List<Tags> tags;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("VswitchId")
        private String vswitchId;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private Items(Builder builder) {
            this.agenticDbClusterDescription = builder.agenticDbClusterDescription;
            this.agenticDbClusterId = builder.agenticDbClusterId;
            this.category = builder.category;
            this.createTime = builder.createTime;
            this.DBClusterDescription = builder.DBClusterDescription;
            this.DBClusterId = builder.DBClusterId;
            this.DBClusterStatus = builder.DBClusterStatus;
            this.DBType = builder.DBType;
            this.DBVersion = builder.DBVersion;
            this.expireTime = builder.expireTime;
            this.expired = builder.expired;
            this.lockMode = builder.lockMode;
            this.payType = builder.payType;
            this.regionId = builder.regionId;
            this.scaleMax = builder.scaleMax;
            this.scaleMin = builder.scaleMin;
            this.serverlessType = builder.serverlessType;
            this.storageType = builder.storageType;
            this.storageUsed = builder.storageUsed;
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
         * @return agenticDbClusterDescription
         */
        public String getAgenticDbClusterDescription() {
            return this.agenticDbClusterDescription;
        }

        /**
         * @return agenticDbClusterId
         */
        public String getAgenticDbClusterId() {
            return this.agenticDbClusterId;
        }

        /**
         * @return category
         */
        public String getCategory() {
            return this.category;
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
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return scaleMax
         */
        public String getScaleMax() {
            return this.scaleMax;
        }

        /**
         * @return scaleMin
         */
        public String getScaleMin() {
            return this.scaleMin;
        }

        /**
         * @return serverlessType
         */
        public String getServerlessType() {
            return this.serverlessType;
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
            private String agenticDbClusterDescription; 
            private String agenticDbClusterId; 
            private String category; 
            private String createTime; 
            private String DBClusterDescription; 
            private String DBClusterId; 
            private String DBClusterStatus; 
            private String DBType; 
            private String DBVersion; 
            private String expireTime; 
            private String expired; 
            private String lockMode; 
            private String payType; 
            private String regionId; 
            private String scaleMax; 
            private String scaleMin; 
            private String serverlessType; 
            private String storageType; 
            private Long storageUsed; 
            private java.util.List<Tags> tags; 
            private String vpcId; 
            private String vswitchId; 
            private String zoneId; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.agenticDbClusterDescription = model.agenticDbClusterDescription;
                this.agenticDbClusterId = model.agenticDbClusterId;
                this.category = model.category;
                this.createTime = model.createTime;
                this.DBClusterDescription = model.DBClusterDescription;
                this.DBClusterId = model.DBClusterId;
                this.DBClusterStatus = model.DBClusterStatus;
                this.DBType = model.DBType;
                this.DBVersion = model.DBVersion;
                this.expireTime = model.expireTime;
                this.expired = model.expired;
                this.lockMode = model.lockMode;
                this.payType = model.payType;
                this.regionId = model.regionId;
                this.scaleMax = model.scaleMax;
                this.scaleMin = model.scaleMin;
                this.serverlessType = model.serverlessType;
                this.storageType = model.storageType;
                this.storageUsed = model.storageUsed;
                this.tags = model.tags;
                this.vpcId = model.vpcId;
                this.vswitchId = model.vswitchId;
                this.zoneId = model.zoneId;
            } 

            /**
             * <p>The Agentic cluster description.</p>
             * 
             * <strong>example:</strong>
             * <p>pagc-**************</p>
             */
            public Builder agenticDbClusterDescription(String agenticDbClusterDescription) {
                this.agenticDbClusterDescription = agenticDbClusterDescription;
                return this;
            }

            /**
             * <p>The Agentic cluster ID.</p>
             * 
             * <strong>example:</strong>
             * <p>pagc-**************</p>
             */
            public Builder agenticDbClusterId(String agenticDbClusterId) {
                this.agenticDbClusterId = agenticDbClusterId;
                return this;
            }

            /**
             * <p>The cluster edition. Valid values:</p>
             * <ul>
             * <li><p><strong>Normal</strong>: Cluster Edition</p>
             * </li>
             * <li><p><strong>Basic</strong>: Single Node Edition</p>
             * </li>
             * <li><p><strong>Archive</strong>: X-Engine Edition</p>
             * </li>
             * <li><p><strong>NormalMultimaster</strong>: Multi-master Cluster (Database/Table)</p>
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
             * <p>The time when the cluster was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-08-14T05:58:42Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The cluster description.</p>
             * 
             * <strong>example:</strong>
             * <p>ocpx</p>
             */
            public Builder DBClusterDescription(String DBClusterDescription) {
                this.DBClusterDescription = DBClusterDescription;
                return this;
            }

            /**
             * <p>The cluster ID.</p>
             * 
             * <strong>example:</strong>
             * <p>pc-xxxxxx</p>
             */
            public Builder DBClusterId(String DBClusterId) {
                this.DBClusterId = DBClusterId;
                return this;
            }

            /**
             * <p>The cluster status.</p>
             * 
             * <strong>example:</strong>
             * <p>Running</p>
             */
            public Builder DBClusterStatus(String DBClusterStatus) {
                this.DBClusterStatus = DBClusterStatus;
                return this;
            }

            /**
             * <p>The database engine type.</p>
             * 
             * <strong>example:</strong>
             * <p>MySQL</p>
             */
            public Builder DBType(String DBType) {
                this.DBType = DBType;
                return this;
            }

            /**
             * <p>The database engine version.</p>
             * 
             * <strong>example:</strong>
             * <p>8.0</p>
             */
            public Builder DBVersion(String DBVersion) {
                this.DBVersion = DBVersion;
                return this;
            }

            /**
             * <p>The expiration time of the cluster.</p>
             * <blockquote>
             * <p>A specific value is returned only for clusters whose billing method is <strong>Prepaid</strong> (subscription). An empty value is returned for <strong>Postpaid</strong> (pay-as-you-go) clusters.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>2025-06-25T09:37:10Z</p>
             */
            public Builder expireTime(String expireTime) {
                this.expireTime = expireTime;
                return this;
            }

            /**
             * <p>Indicates whether the cluster has expired. Valid values:</p>
             * <ul>
             * <li><p><strong>true</strong></p>
             * </li>
             * <li><p><strong>false</strong></p>
             * </li>
             * </ul>
             * <blockquote>
             * <p>This parameter is returned only for clusters whose billing method is <strong>Prepaid</strong> (subscription).</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>false</p>
             */
            public Builder expired(String expired) {
                this.expired = expired;
                return this;
            }

            /**
             * <p>The lock status of the cluster. Valid values: </p>
             * <ul>
             * <li><strong>Unlock</strong>: Normal. </li>
             * <li><strong>ManualLock</strong>: Manually locked. </li>
             * <li><strong>LockByExpiration</strong>: Automatically locked due to cluster expiration.</li>
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
             * <p>The billing method. Valid values: </p>
             * <ul>
             * <li><strong>Postpaid</strong>: pay-as-you-go.</li>
             * <li><strong>Prepaid</strong>: subscription.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Postpaid</p>
             */
            public Builder payType(String payType) {
                this.payType = payType;
                return this;
            }

            /**
             * <p>The region ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou</p>
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * <p>The maximum value: 1 to 32 PCUs. Unit: PCU.</p>
             * 
             * <strong>example:</strong>
             * <p>9</p>
             */
            public Builder scaleMax(String scaleMax) {
                this.scaleMax = scaleMax;
                return this;
            }

            /**
             * <p>The minimum value: 0 to 32 PCUs. The minimum value must be less than or equal to the maximum value. Unit: PCU.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder scaleMin(String scaleMin) {
                this.scaleMin = scaleMin;
                return this;
            }

            /**
             * <p>The serverless type. A value of <strong>AgileServerless</strong> indicates that the cluster is a serverless cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>AgileServerless</p>
             */
            public Builder serverlessType(String serverlessType) {
                this.serverlessType = serverlessType;
                return this;
            }

            /**
             * <p>The storage type. Valid values:</p>
             * <ul>
             * <li><strong>essdpl0</strong></li>
             * <li><strong>essdpl1</strong></li>
             * <li><strong>essdpl2</strong></li>
             * <li><strong>essdpl3</strong></li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>city_redundancy</p>
             */
            public Builder storageType(String storageType) {
                this.storageType = storageType;
                return this;
            }

            /**
             * <p>The storage usage of the cluster. Unit: bytes.</p>
             * 
             * <strong>example:</strong>
             * <p>3009413120</p>
             */
            public Builder storageUsed(Long storageUsed) {
                this.storageUsed = storageUsed;
                return this;
            }

            /**
             * <p>The tag key. You can filter the cluster list by tag. You can specify up to 20 tag pairs. The number n for each tag pair must be unique and must be a consecutive integer starting from 1. The value of Tag.n.Key corresponds to Tag.n.Value.</p>
             */
            public Builder tags(java.util.List<Tags> tags) {
                this.tags = tags;
                return this;
            }

            /**
             * <p>The ID of the virtual private cloud (VPC) in which the endpoint resides.</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-****************</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * <p>The vSwitch ID.</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-**************</p>
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
