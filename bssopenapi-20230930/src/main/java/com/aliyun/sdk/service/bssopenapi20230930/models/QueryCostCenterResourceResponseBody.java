// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20230930.models;

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
 * {@link QueryCostCenterResourceResponseBody} extends {@link TeaModel}
 *
 * <p>QueryCostCenterResourceResponseBody</p>
 */
public class QueryCostCenterResourceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CostCenterResourceDtoList")
    private java.util.List<CostCenterResourceDtoList> costCenterResourceDtoList;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("Metadata")
    private Object metadata;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    @com.aliyun.core.annotation.Validation(required = true)
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private QueryCostCenterResourceResponseBody(Builder builder) {
        this.costCenterResourceDtoList = builder.costCenterResourceDtoList;
        this.maxResults = builder.maxResults;
        this.metadata = builder.metadata;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryCostCenterResourceResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return costCenterResourceDtoList
     */
    public java.util.List<CostCenterResourceDtoList> getCostCenterResourceDtoList() {
        return this.costCenterResourceDtoList;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return metadata
     */
    public Object getMetadata() {
        return this.metadata;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
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
        private java.util.List<CostCenterResourceDtoList> costCenterResourceDtoList; 
        private Integer maxResults; 
        private Object metadata; 
        private String nextToken; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(QueryCostCenterResourceResponseBody model) {
            this.costCenterResourceDtoList = model.costCenterResourceDtoList;
            this.maxResults = model.maxResults;
            this.metadata = model.metadata;
            this.nextToken = model.nextToken;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * <p>The data list.</p>
         */
        public Builder costCenterResourceDtoList(java.util.List<CostCenterResourceDtoList> costCenterResourceDtoList) {
            this.costCenterResourceDtoList = costCenterResourceDtoList;
            return this;
        }

        /**
         * <p>The maximum number of records per query.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * <p>The metadata of the response structure.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder metadata(Object metadata) {
            this.metadata = metadata;
            return this;
        }

        /**
         * <p>The token for the next query. An empty NextToken indicates that there are no more results.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>eyJwYWdlTnVtIjoyLCJwYWdlU2l6ZSI6MTB9</p>
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>79EE7556-0CFD-44EB-9CD6-B3B526E3A85F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>2000</p>
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public QueryCostCenterResourceResponseBody build() {
            return new QueryCostCenterResourceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryCostCenterResourceResponseBody} extends {@link TeaModel}
     *
     * <p>QueryCostCenterResourceResponseBody</p>
     */
    public static class CostCenterResourceDtoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AddStrategy")
        private String addStrategy;

        @com.aliyun.core.annotation.NameInMap("AddStrategyName")
        private String addStrategyName;

        @com.aliyun.core.annotation.NameInMap("ApplicablePeriodNum")
        private Long applicablePeriodNum;

        @com.aliyun.core.annotation.NameInMap("ApportionItemCode")
        private String apportionItemCode;

        @com.aliyun.core.annotation.NameInMap("ApportionItemName")
        private String apportionItemName;

        @com.aliyun.core.annotation.NameInMap("CommodityCode")
        private String commodityCode;

        @com.aliyun.core.annotation.NameInMap("CommodityName")
        private String commodityName;

        @com.aliyun.core.annotation.NameInMap("CostCenterCode")
        private String costCenterCode;

        @com.aliyun.core.annotation.NameInMap("CostCenterCreateTime")
        private String costCenterCreateTime;

        @com.aliyun.core.annotation.NameInMap("CostCenterId")
        private Long costCenterId;

        @com.aliyun.core.annotation.NameInMap("CostCenterName")
        private String costCenterName;

        @com.aliyun.core.annotation.NameInMap("CostCenterUpdateTime")
        private String costCenterUpdateTime;

        @com.aliyun.core.annotation.NameInMap("FinanceUnitRuleVersion")
        private Long financeUnitRuleVersion;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("MasterCommodityCode")
        private String masterCommodityCode;

        @com.aliyun.core.annotation.NameInMap("MasterInstanceId")
        private String masterInstanceId;

        @com.aliyun.core.annotation.NameInMap("OwnerAccountId")
        private Long ownerAccountId;

        @com.aliyun.core.annotation.NameInMap("OwnerAccountName")
        private String ownerAccountName;

        @com.aliyun.core.annotation.NameInMap("ParentCostCenterId")
        private Long parentCostCenterId;

        @com.aliyun.core.annotation.NameInMap("PipCode")
        private String pipCode;

        @com.aliyun.core.annotation.NameInMap("PipName")
        private String pipName;

        @com.aliyun.core.annotation.NameInMap("RecentBillingMonth")
        private Long recentBillingMonth;

        @com.aliyun.core.annotation.NameInMap("RegionName")
        private String regionName;

        @com.aliyun.core.annotation.NameInMap("RegionNo")
        private String regionNo;

        @com.aliyun.core.annotation.NameInMap("ResourceGroup")
        private String resourceGroup;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("ResourceNick")
        private String resourceNick;

        @com.aliyun.core.annotation.NameInMap("ResourceSource")
        private String resourceSource;

        @com.aliyun.core.annotation.NameInMap("ResourceTag")
        private String resourceTag;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("ResourceUpdateTime")
        private String resourceUpdateTime;

        @com.aliyun.core.annotation.NameInMap("ResourceUserId")
        private Long resourceUserId;

        @com.aliyun.core.annotation.NameInMap("ResourceUserName")
        private String resourceUserName;

        @com.aliyun.core.annotation.NameInMap("RootCostCenterId")
        private Long rootCostCenterId;

        @com.aliyun.core.annotation.NameInMap("StartBillingMonth")
        private Long startBillingMonth;

        private CostCenterResourceDtoList(Builder builder) {
            this.addStrategy = builder.addStrategy;
            this.addStrategyName = builder.addStrategyName;
            this.applicablePeriodNum = builder.applicablePeriodNum;
            this.apportionItemCode = builder.apportionItemCode;
            this.apportionItemName = builder.apportionItemName;
            this.commodityCode = builder.commodityCode;
            this.commodityName = builder.commodityName;
            this.costCenterCode = builder.costCenterCode;
            this.costCenterCreateTime = builder.costCenterCreateTime;
            this.costCenterId = builder.costCenterId;
            this.costCenterName = builder.costCenterName;
            this.costCenterUpdateTime = builder.costCenterUpdateTime;
            this.financeUnitRuleVersion = builder.financeUnitRuleVersion;
            this.instanceId = builder.instanceId;
            this.masterCommodityCode = builder.masterCommodityCode;
            this.masterInstanceId = builder.masterInstanceId;
            this.ownerAccountId = builder.ownerAccountId;
            this.ownerAccountName = builder.ownerAccountName;
            this.parentCostCenterId = builder.parentCostCenterId;
            this.pipCode = builder.pipCode;
            this.pipName = builder.pipName;
            this.recentBillingMonth = builder.recentBillingMonth;
            this.regionName = builder.regionName;
            this.regionNo = builder.regionNo;
            this.resourceGroup = builder.resourceGroup;
            this.resourceId = builder.resourceId;
            this.resourceNick = builder.resourceNick;
            this.resourceSource = builder.resourceSource;
            this.resourceTag = builder.resourceTag;
            this.resourceType = builder.resourceType;
            this.resourceUpdateTime = builder.resourceUpdateTime;
            this.resourceUserId = builder.resourceUserId;
            this.resourceUserName = builder.resourceUserName;
            this.rootCostCenterId = builder.rootCostCenterId;
            this.startBillingMonth = builder.startBillingMonth;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CostCenterResourceDtoList create() {
            return builder().build();
        }

        /**
         * @return addStrategy
         */
        public String getAddStrategy() {
            return this.addStrategy;
        }

        /**
         * @return addStrategyName
         */
        public String getAddStrategyName() {
            return this.addStrategyName;
        }

        /**
         * @return applicablePeriodNum
         */
        public Long getApplicablePeriodNum() {
            return this.applicablePeriodNum;
        }

        /**
         * @return apportionItemCode
         */
        public String getApportionItemCode() {
            return this.apportionItemCode;
        }

        /**
         * @return apportionItemName
         */
        public String getApportionItemName() {
            return this.apportionItemName;
        }

        /**
         * @return commodityCode
         */
        public String getCommodityCode() {
            return this.commodityCode;
        }

        /**
         * @return commodityName
         */
        public String getCommodityName() {
            return this.commodityName;
        }

        /**
         * @return costCenterCode
         */
        public String getCostCenterCode() {
            return this.costCenterCode;
        }

        /**
         * @return costCenterCreateTime
         */
        public String getCostCenterCreateTime() {
            return this.costCenterCreateTime;
        }

        /**
         * @return costCenterId
         */
        public Long getCostCenterId() {
            return this.costCenterId;
        }

        /**
         * @return costCenterName
         */
        public String getCostCenterName() {
            return this.costCenterName;
        }

        /**
         * @return costCenterUpdateTime
         */
        public String getCostCenterUpdateTime() {
            return this.costCenterUpdateTime;
        }

        /**
         * @return financeUnitRuleVersion
         */
        public Long getFinanceUnitRuleVersion() {
            return this.financeUnitRuleVersion;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return masterCommodityCode
         */
        public String getMasterCommodityCode() {
            return this.masterCommodityCode;
        }

        /**
         * @return masterInstanceId
         */
        public String getMasterInstanceId() {
            return this.masterInstanceId;
        }

        /**
         * @return ownerAccountId
         */
        public Long getOwnerAccountId() {
            return this.ownerAccountId;
        }

        /**
         * @return ownerAccountName
         */
        public String getOwnerAccountName() {
            return this.ownerAccountName;
        }

        /**
         * @return parentCostCenterId
         */
        public Long getParentCostCenterId() {
            return this.parentCostCenterId;
        }

        /**
         * @return pipCode
         */
        public String getPipCode() {
            return this.pipCode;
        }

        /**
         * @return pipName
         */
        public String getPipName() {
            return this.pipName;
        }

        /**
         * @return recentBillingMonth
         */
        public Long getRecentBillingMonth() {
            return this.recentBillingMonth;
        }

        /**
         * @return regionName
         */
        public String getRegionName() {
            return this.regionName;
        }

        /**
         * @return regionNo
         */
        public String getRegionNo() {
            return this.regionNo;
        }

        /**
         * @return resourceGroup
         */
        public String getResourceGroup() {
            return this.resourceGroup;
        }

        /**
         * @return resourceId
         */
        public String getResourceId() {
            return this.resourceId;
        }

        /**
         * @return resourceNick
         */
        public String getResourceNick() {
            return this.resourceNick;
        }

        /**
         * @return resourceSource
         */
        public String getResourceSource() {
            return this.resourceSource;
        }

        /**
         * @return resourceTag
         */
        public String getResourceTag() {
            return this.resourceTag;
        }

        /**
         * @return resourceType
         */
        public String getResourceType() {
            return this.resourceType;
        }

        /**
         * @return resourceUpdateTime
         */
        public String getResourceUpdateTime() {
            return this.resourceUpdateTime;
        }

        /**
         * @return resourceUserId
         */
        public Long getResourceUserId() {
            return this.resourceUserId;
        }

        /**
         * @return resourceUserName
         */
        public String getResourceUserName() {
            return this.resourceUserName;
        }

        /**
         * @return rootCostCenterId
         */
        public Long getRootCostCenterId() {
            return this.rootCostCenterId;
        }

        /**
         * @return startBillingMonth
         */
        public Long getStartBillingMonth() {
            return this.startBillingMonth;
        }

        public static final class Builder {
            private String addStrategy; 
            private String addStrategyName; 
            private Long applicablePeriodNum; 
            private String apportionItemCode; 
            private String apportionItemName; 
            private String commodityCode; 
            private String commodityName; 
            private String costCenterCode; 
            private String costCenterCreateTime; 
            private Long costCenterId; 
            private String costCenterName; 
            private String costCenterUpdateTime; 
            private Long financeUnitRuleVersion; 
            private String instanceId; 
            private String masterCommodityCode; 
            private String masterInstanceId; 
            private Long ownerAccountId; 
            private String ownerAccountName; 
            private Long parentCostCenterId; 
            private String pipCode; 
            private String pipName; 
            private Long recentBillingMonth; 
            private String regionName; 
            private String regionNo; 
            private String resourceGroup; 
            private String resourceId; 
            private String resourceNick; 
            private String resourceSource; 
            private String resourceTag; 
            private String resourceType; 
            private String resourceUpdateTime; 
            private Long resourceUserId; 
            private String resourceUserName; 
            private Long rootCostCenterId; 
            private Long startBillingMonth; 

            private Builder() {
            } 

            private Builder(CostCenterResourceDtoList model) {
                this.addStrategy = model.addStrategy;
                this.addStrategyName = model.addStrategyName;
                this.applicablePeriodNum = model.applicablePeriodNum;
                this.apportionItemCode = model.apportionItemCode;
                this.apportionItemName = model.apportionItemName;
                this.commodityCode = model.commodityCode;
                this.commodityName = model.commodityName;
                this.costCenterCode = model.costCenterCode;
                this.costCenterCreateTime = model.costCenterCreateTime;
                this.costCenterId = model.costCenterId;
                this.costCenterName = model.costCenterName;
                this.costCenterUpdateTime = model.costCenterUpdateTime;
                this.financeUnitRuleVersion = model.financeUnitRuleVersion;
                this.instanceId = model.instanceId;
                this.masterCommodityCode = model.masterCommodityCode;
                this.masterInstanceId = model.masterInstanceId;
                this.ownerAccountId = model.ownerAccountId;
                this.ownerAccountName = model.ownerAccountName;
                this.parentCostCenterId = model.parentCostCenterId;
                this.pipCode = model.pipCode;
                this.pipName = model.pipName;
                this.recentBillingMonth = model.recentBillingMonth;
                this.regionName = model.regionName;
                this.regionNo = model.regionNo;
                this.resourceGroup = model.resourceGroup;
                this.resourceId = model.resourceId;
                this.resourceNick = model.resourceNick;
                this.resourceSource = model.resourceSource;
                this.resourceTag = model.resourceTag;
                this.resourceType = model.resourceType;
                this.resourceUpdateTime = model.resourceUpdateTime;
                this.resourceUserId = model.resourceUserId;
                this.resourceUserName = model.resourceUserName;
                this.rootCostCenterId = model.rootCostCenterId;
                this.startBillingMonth = model.startBillingMonth;
            } 

            /**
             * AddStrategy.
             */
            public Builder addStrategy(String addStrategy) {
                this.addStrategy = addStrategy;
                return this;
            }

            /**
             * AddStrategyName.
             */
            public Builder addStrategyName(String addStrategyName) {
                this.addStrategyName = addStrategyName;
                return this;
            }

            /**
             * ApplicablePeriodNum.
             */
            public Builder applicablePeriodNum(Long applicablePeriodNum) {
                this.applicablePeriodNum = applicablePeriodNum;
                return this;
            }

            /**
             * <p>The apportionment item code of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder apportionItemCode(String apportionItemCode) {
                this.apportionItemCode = apportionItemCode;
                return this;
            }

            /**
             * <p>The apportionment item name of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder apportionItemName(String apportionItemName) {
                this.apportionItemName = apportionItemName;
                return this;
            }

            /**
             * <p>The commodity code of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>otsbag</p>
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
                return this;
            }

            /**
             * <p>The commodity name of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>云数据库</p>
             */
            public Builder commodityName(String commodityName) {
                this.commodityName = commodityName;
                return this;
            }

            /**
             * <p>The cost center code.</p>
             * 
             * <strong>example:</strong>
             * <p>code</p>
             */
            public Builder costCenterCode(String costCenterCode) {
                this.costCenterCode = costCenterCode;
                return this;
            }

            /**
             * <p>The creation time of the cost center.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-05-18 12:12:25</p>
             */
            public Builder costCenterCreateTime(String costCenterCreateTime) {
                this.costCenterCreateTime = costCenterCreateTime;
                return this;
            }

            /**
             * <p>The cost center ID.</p>
             * 
             * <strong>example:</strong>
             * <p>123456</p>
             */
            public Builder costCenterId(Long costCenterId) {
                this.costCenterId = costCenterId;
                return this;
            }

            /**
             * <p>The cost center name.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder costCenterName(String costCenterName) {
                this.costCenterName = costCenterName;
                return this;
            }

            /**
             * <p>The last update time of the cost center.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-05-18 16:12:25</p>
             */
            public Builder costCenterUpdateTime(String costCenterUpdateTime) {
                this.costCenterUpdateTime = costCenterUpdateTime;
                return this;
            }

            /**
             * FinanceUnitRuleVersion.
             */
            public Builder financeUnitRuleVersion(Long financeUnitRuleVersion) {
                this.financeUnitRuleVersion = financeUnitRuleVersion;
                return this;
            }

            /**
             * <p>The billing granularity ID.</p>
             * 
             * <strong>example:</strong>
             * <p>cn-hangzhou;standard</p>
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * MasterCommodityCode.
             */
            public Builder masterCommodityCode(String masterCommodityCode) {
                this.masterCommodityCode = masterCommodityCode;
                return this;
            }

            /**
             * MasterInstanceId.
             */
            public Builder masterInstanceId(String masterInstanceId) {
                this.masterInstanceId = masterInstanceId;
                return this;
            }

            /**
             * <p>The customer ID to which the cost center belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>1234567812345678</p>
             */
            public Builder ownerAccountId(Long ownerAccountId) {
                this.ownerAccountId = ownerAccountId;
                return this;
            }

            /**
             * <p>The customer name to which the cost center belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>客户A</p>
             */
            public Builder ownerAccountName(String ownerAccountName) {
                this.ownerAccountName = ownerAccountName;
                return this;
            }

            /**
             * <p>The parent cost center ID.</p>
             * 
             * <strong>example:</strong>
             * <p>123456</p>
             */
            public Builder parentCostCenterId(Long parentCostCenterId) {
                this.parentCostCenterId = parentCostCenterId;
                return this;
            }

            /**
             * <p>The product code, which is the same as the product code in Cost Center bills.</p>
             * 
             * <strong>example:</strong>
             * <p>rds</p>
             */
            public Builder pipCode(String pipCode) {
                this.pipCode = pipCode;
                return this;
            }

            /**
             * <p>The product name.</p>
             * 
             * <strong>example:</strong>
             * <p>云数据库</p>
             */
            public Builder pipName(String pipName) {
                this.pipName = pipName;
                return this;
            }

            /**
             * RecentBillingMonth.
             */
            public Builder recentBillingMonth(Long recentBillingMonth) {
                this.recentBillingMonth = recentBillingMonth;
                return this;
            }

            /**
             * RegionName.
             */
            public Builder regionName(String regionName) {
                this.regionName = regionName;
                return this;
            }

            /**
             * RegionNo.
             */
            public Builder regionNo(String regionNo) {
                this.regionNo = regionNo;
                return this;
            }

            /**
             * <p>The resource group to which the resource belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>默认资源组</p>
             */
            public Builder resourceGroup(String resourceGroup) {
                this.resourceGroup = resourceGroup;
                return this;
            }

            /**
             * <p>The resource ID.</p>
             * 
             * <strong>example:</strong>
             * <p>OSSBAG-cn-v0h1s4hma018</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>The custom alias of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>testResource</p>
             */
            public Builder resourceNick(String resourceNick) {
                this.resourceNick = resourceNick;
                return this;
            }

            /**
             * <p>The resource source. Valid values:</p>
             * <ul>
             * <li>AUTO_ALLOCATE: automatically allocated.</li>
             * <li>MANUAL_ALLOCATE: manually allocated.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>MANUAL_ALLOCATE</p>
             */
            public Builder resourceSource(String resourceSource) {
                this.resourceSource = resourceSource;
                return this;
            }

            /**
             * <p>The tag of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>tag</p>
             */
            public Builder resourceTag(String resourceTag) {
                this.resourceTag = resourceTag;
                return this;
            }

            /**
             * <p>The resource type.</p>
             * 
             * <strong>example:</strong>
             * <p>FPT_ossbag_absolute_Storage_bj</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * <p>The last update time of the cost center. This is a reserved field and is currently unavailable.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-05-18 16:12:25</p>
             */
            public Builder resourceUpdateTime(String resourceUpdateTime) {
                this.resourceUpdateTime = resourceUpdateTime;
                return this;
            }

            /**
             * <p>The owner user ID of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>1234567812345678</p>
             */
            public Builder resourceUserId(Long resourceUserId) {
                this.resourceUserId = resourceUserId;
                return this;
            }

            /**
             * <p>The owner username of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:test@test.aliyun.com">test@test.aliyun.com</a></p>
             */
            public Builder resourceUserName(String resourceUserName) {
                this.resourceUserName = resourceUserName;
                return this;
            }

            /**
             * <p>The root cost center ID.</p>
             * 
             * <strong>example:</strong>
             * <p>-1</p>
             */
            public Builder rootCostCenterId(Long rootCostCenterId) {
                this.rootCostCenterId = rootCostCenterId;
                return this;
            }

            /**
             * StartBillingMonth.
             */
            public Builder startBillingMonth(Long startBillingMonth) {
                this.startBillingMonth = startBillingMonth;
                return this;
            }

            public CostCenterResourceDtoList build() {
                return new CostCenterResourceDtoList(this);
            } 

        } 

    }
}
