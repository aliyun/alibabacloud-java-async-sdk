// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bdrc20230808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeTopRiskyResourcesResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTopRiskyResourcesResponseBody</p>
 */
public class DescribeTopRiskyResourcesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeTopRiskyResourcesResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTopRiskyResourcesResponseBody create() {
        return builder().build();
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeTopRiskyResourcesResponseBody build() {
            return new DescribeTopRiskyResourcesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeTopRiskyResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTopRiskyResourcesResponseBody</p>
     */
    public static class Content extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ArchiveDataSize")
        private Long archiveDataSize;

        @com.aliyun.core.annotation.NameInMap("CheckFailedCount")
        private Long checkFailedCount;

        @com.aliyun.core.annotation.NameInMap("ColdArchiveDataSize")
        private Long coldArchiveDataSize;

        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private Long createTime;

        @com.aliyun.core.annotation.NameInMap("DataRedundancyType")
        private String dataRedundancyType;

        @com.aliyun.core.annotation.NameInMap("EnableCheck")
        private Boolean enableCheck;

        @com.aliyun.core.annotation.NameInMap("IaDataSize")
        private Long iaDataSize;

        @com.aliyun.core.annotation.NameInMap("ProductType")
        private String productType;

        @com.aliyun.core.annotation.NameInMap("ProtectionScore")
        private Integer protectionScore;

        @com.aliyun.core.annotation.NameInMap("ProtectionScoreUpdatedTime")
        private Long protectionScoreUpdatedTime;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        @com.aliyun.core.annotation.NameInMap("ResourceArn")
        private String resourceArn;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("ResourceName")
        private String resourceName;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("RiskCount")
        private Long riskCount;

        @com.aliyun.core.annotation.NameInMap("StandardDataSize")
        private Long standardDataSize;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StorageClass")
        private String storageClass;

        @com.aliyun.core.annotation.NameInMap("TotalDataSize")
        private Long totalDataSize;

        @com.aliyun.core.annotation.NameInMap("VSwitchId")
        private String vSwitchId;

        @com.aliyun.core.annotation.NameInMap("VpcId")
        private String vpcId;

        @com.aliyun.core.annotation.NameInMap("ZoneId")
        private String zoneId;

        private Content(Builder builder) {
            this.archiveDataSize = builder.archiveDataSize;
            this.checkFailedCount = builder.checkFailedCount;
            this.coldArchiveDataSize = builder.coldArchiveDataSize;
            this.createTime = builder.createTime;
            this.dataRedundancyType = builder.dataRedundancyType;
            this.enableCheck = builder.enableCheck;
            this.iaDataSize = builder.iaDataSize;
            this.productType = builder.productType;
            this.protectionScore = builder.protectionScore;
            this.protectionScoreUpdatedTime = builder.protectionScoreUpdatedTime;
            this.regionId = builder.regionId;
            this.resourceArn = builder.resourceArn;
            this.resourceId = builder.resourceId;
            this.resourceName = builder.resourceName;
            this.resourceType = builder.resourceType;
            this.riskCount = builder.riskCount;
            this.standardDataSize = builder.standardDataSize;
            this.status = builder.status;
            this.storageClass = builder.storageClass;
            this.totalDataSize = builder.totalDataSize;
            this.vSwitchId = builder.vSwitchId;
            this.vpcId = builder.vpcId;
            this.zoneId = builder.zoneId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Content create() {
            return builder().build();
        }

        /**
         * @return archiveDataSize
         */
        public Long getArchiveDataSize() {
            return this.archiveDataSize;
        }

        /**
         * @return checkFailedCount
         */
        public Long getCheckFailedCount() {
            return this.checkFailedCount;
        }

        /**
         * @return coldArchiveDataSize
         */
        public Long getColdArchiveDataSize() {
            return this.coldArchiveDataSize;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return dataRedundancyType
         */
        public String getDataRedundancyType() {
            return this.dataRedundancyType;
        }

        /**
         * @return enableCheck
         */
        public Boolean getEnableCheck() {
            return this.enableCheck;
        }

        /**
         * @return iaDataSize
         */
        public Long getIaDataSize() {
            return this.iaDataSize;
        }

        /**
         * @return productType
         */
        public String getProductType() {
            return this.productType;
        }

        /**
         * @return protectionScore
         */
        public Integer getProtectionScore() {
            return this.protectionScore;
        }

        /**
         * @return protectionScoreUpdatedTime
         */
        public Long getProtectionScoreUpdatedTime() {
            return this.protectionScoreUpdatedTime;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return resourceArn
         */
        public String getResourceArn() {
            return this.resourceArn;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return resourceName
         */
        public String getResourceName() {
            return this.resourceName;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return riskCount
         */
        public Long getRiskCount() {
            return this.riskCount;
        }

        /**
         * @return standardDataSize
         */
        public Long getStandardDataSize() {
            return this.standardDataSize;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return storageClass
         */
        public String getStorageClass() {
            return this.storageClass;
        }

        /**
         * @return totalDataSize
         */
        public Long getTotalDataSize() {
            return this.totalDataSize;
        }

        /**
         * @return vSwitchId
         */
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        /**
         * @return vpcId
         */
        public String getVpcId() {
            return this.vpcId;
        }

        /**
         * @return zoneId
         */
        public String getZoneId() {
            return this.zoneId;
        }

        public static final class Builder {
            private Long archiveDataSize; 
            private Long checkFailedCount; 
            private Long coldArchiveDataSize; 
            private Long createTime; 
            private String dataRedundancyType; 
            private Boolean enableCheck; 
            private Long iaDataSize; 
            private String productType; 
            private Integer protectionScore; 
            private Long protectionScoreUpdatedTime; 
            private String regionId; 
            private String resourceArn; 
            private String resourceId; 
            private String resourceName; 
            private String resourceType; 
            private Long riskCount; 
            private Long standardDataSize; 
            private String status; 
            private String storageClass; 
            private Long totalDataSize; 
            private String vSwitchId; 
            private String vpcId; 
            private String zoneId; 

            /**
             * ArchiveDataSize.
             */
            public Builder archiveDataSize(Long archiveDataSize) {
                this.archiveDataSize = archiveDataSize;
                return this;
            }

            /**
             * CheckFailedCount.
             */
            public Builder checkFailedCount(Long checkFailedCount) {
                this.checkFailedCount = checkFailedCount;
                return this;
            }

            /**
             * ColdArchiveDataSize.
             */
            public Builder coldArchiveDataSize(Long coldArchiveDataSize) {
                this.coldArchiveDataSize = coldArchiveDataSize;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DataRedundancyType.
             */
            public Builder dataRedundancyType(String dataRedundancyType) {
                this.dataRedundancyType = dataRedundancyType;
                return this;
            }

            /**
             * EnableCheck.
             */
            public Builder enableCheck(Boolean enableCheck) {
                this.enableCheck = enableCheck;
                return this;
            }

            /**
             * IaDataSize.
             */
            public Builder iaDataSize(Long iaDataSize) {
                this.iaDataSize = iaDataSize;
                return this;
            }

            /**
             * ProductType.
             */
            public Builder productType(String productType) {
                this.productType = productType;
                return this;
            }

            /**
             * ProtectionScore.
             */
            public Builder protectionScore(Integer protectionScore) {
                this.protectionScore = protectionScore;
                return this;
            }

            /**
             * ProtectionScoreUpdatedTime.
             */
            public Builder protectionScoreUpdatedTime(Long protectionScoreUpdatedTime) {
                this.protectionScoreUpdatedTime = protectionScoreUpdatedTime;
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
             * ResourceArn.
             */
            public Builder resourceArn(String resourceArn) {
                this.resourceArn = resourceArn;
                return this;
            }

            /**
             * ResourceId.
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * ResourceName.
             */
            public Builder resourceName(String resourceName) {
                this.resourceName = resourceName;
                return this;
            }

            /**
             * ResourceType.
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * RiskCount.
             */
            public Builder riskCount(Long riskCount) {
                this.riskCount = riskCount;
                return this;
            }

            /**
             * StandardDataSize.
             */
            public Builder standardDataSize(Long standardDataSize) {
                this.standardDataSize = standardDataSize;
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
             * StorageClass.
             */
            public Builder storageClass(String storageClass) {
                this.storageClass = storageClass;
                return this;
            }

            /**
             * TotalDataSize.
             */
            public Builder totalDataSize(Long totalDataSize) {
                this.totalDataSize = totalDataSize;
                return this;
            }

            /**
             * <p>vSwitch ID</p>
             * 
             * <strong>example:</strong>
             * <p>vsw-xxxxxxxx</p>
             */
            public Builder vSwitchId(String vSwitchId) {
                this.vSwitchId = vSwitchId;
                return this;
            }

            /**
             * <p>vpc ID</p>
             * 
             * <strong>example:</strong>
             * <p>vpc-xxxxxxxx</p>
             */
            public Builder vpcId(String vpcId) {
                this.vpcId = vpcId;
                return this;
            }

            /**
             * ZoneId.
             */
            public Builder zoneId(String zoneId) {
                this.zoneId = zoneId;
                return this;
            }

            public Content build() {
                return new Content(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeTopRiskyResourcesResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeTopRiskyResourcesResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private java.util.List < Content> content;

        @com.aliyun.core.annotation.NameInMap("MaxResults")
        private Integer maxResults;

        @com.aliyun.core.annotation.NameInMap("NextToken")
        private String nextToken;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Long totalCount;

        private Data(Builder builder) {
            this.content = builder.content;
            this.maxResults = builder.maxResults;
            this.nextToken = builder.nextToken;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public java.util.List < Content> getContent() {
            return this.content;
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
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private java.util.List < Content> content; 
            private Integer maxResults; 
            private String nextToken; 
            private Long totalCount; 

            /**
             * Content.
             */
            public Builder content(java.util.List < Content> content) {
                this.content = content;
                return this;
            }

            /**
             * MaxResults.
             */
            public Builder maxResults(Integer maxResults) {
                this.maxResults = maxResults;
                return this;
            }

            /**
             * NextToken.
             */
            public Builder nextToken(String nextToken) {
                this.nextToken = nextToken;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
