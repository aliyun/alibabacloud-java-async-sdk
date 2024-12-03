// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link QueryCostUnitResourceResponseBody} extends {@link TeaModel}
 *
 * <p>QueryCostUnitResourceResponseBody</p>
 */
public class QueryCostUnitResourceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private QueryCostUnitResourceResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryCostUnitResourceResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * <p>The status code.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data returned.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>Successful！</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>04332CB7-9A57-4461-97E0-02821D044414</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryCostUnitResourceResponseBody build() {
            return new QueryCostUnitResourceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryCostUnitResourceResponseBody} extends {@link TeaModel}
     *
     * <p>QueryCostUnitResourceResponseBody</p>
     */
    public static class CostUnit extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OwnerUid")
        private Long ownerUid;

        @com.aliyun.core.annotation.NameInMap("ParentUnitId")
        private Long parentUnitId;

        @com.aliyun.core.annotation.NameInMap("UnitId")
        private Long unitId;

        @com.aliyun.core.annotation.NameInMap("UnitName")
        private String unitName;

        private CostUnit(Builder builder) {
            this.ownerUid = builder.ownerUid;
            this.parentUnitId = builder.parentUnitId;
            this.unitId = builder.unitId;
            this.unitName = builder.unitName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CostUnit create() {
            return builder().build();
        }

        /**
         * @return ownerUid
         */
        public Long getOwnerUid() {
            return this.ownerUid;
        }

        /**
         * @return parentUnitId
         */
        public Long getParentUnitId() {
            return this.parentUnitId;
        }

        /**
         * @return unitId
         */
        public Long getUnitId() {
            return this.unitId;
        }

        /**
         * @return unitName
         */
        public String getUnitName() {
            return this.unitName;
        }

        public static final class Builder {
            private Long ownerUid; 
            private Long parentUnitId; 
            private Long unitId; 
            private String unitName; 

            /**
             * <p>The user ID of the cost center owner.</p>
             * 
             * <strong>example:</strong>
             * <p>321432</p>
             */
            public Builder ownerUid(Long ownerUid) {
                this.ownerUid = ownerUid;
                return this;
            }

            /**
             * <p>The ID of the parent cost center. A value of -1 indicates the root cost center.</p>
             * 
             * <strong>example:</strong>
             * <p>23421</p>
             */
            public Builder parentUnitId(Long parentUnitId) {
                this.parentUnitId = parentUnitId;
                return this;
            }

            /**
             * <p>The ID of the cost center.</p>
             * 
             * <strong>example:</strong>
             * <p>123412</p>
             */
            public Builder unitId(Long unitId) {
                this.unitId = unitId;
                return this;
            }

            /**
             * <p>The name of the cost center.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder unitName(String unitName) {
                this.unitName = unitName;
                return this;
            }

            public CostUnit build() {
                return new CostUnit(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryCostUnitResourceResponseBody} extends {@link TeaModel}
     *
     * <p>QueryCostUnitResourceResponseBody</p>
     */
    public static class CostUnitStatisInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ResourceCount")
        private Long resourceCount;

        @com.aliyun.core.annotation.NameInMap("ResourceGroupCount")
        private Long resourceGroupCount;

        @com.aliyun.core.annotation.NameInMap("SubUnitCount")
        private Long subUnitCount;

        @com.aliyun.core.annotation.NameInMap("TotalResourceCount")
        private Long totalResourceCount;

        @com.aliyun.core.annotation.NameInMap("TotalResourceGroupCount")
        private Long totalResourceGroupCount;

        @com.aliyun.core.annotation.NameInMap("TotalUserCount")
        private Long totalUserCount;

        @com.aliyun.core.annotation.NameInMap("UserCount")
        private Long userCount;

        private CostUnitStatisInfo(Builder builder) {
            this.resourceCount = builder.resourceCount;
            this.resourceGroupCount = builder.resourceGroupCount;
            this.subUnitCount = builder.subUnitCount;
            this.totalResourceCount = builder.totalResourceCount;
            this.totalResourceGroupCount = builder.totalResourceGroupCount;
            this.totalUserCount = builder.totalUserCount;
            this.userCount = builder.userCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CostUnitStatisInfo create() {
            return builder().build();
        }

        /**
         * @return resourceCount
         */
        public Long getResourceCount() {
            return this.resourceCount;
        }

        /**
         * @return resourceGroupCount
         */
        public Long getResourceGroupCount() {
            return this.resourceGroupCount;
        }

        /**
         * @return subUnitCount
         */
        public Long getSubUnitCount() {
            return this.subUnitCount;
        }

        /**
         * @return totalResourceCount
         */
        public Long getTotalResourceCount() {
            return this.totalResourceCount;
        }

        /**
         * @return totalResourceGroupCount
         */
        public Long getTotalResourceGroupCount() {
            return this.totalResourceGroupCount;
        }

        /**
         * @return totalUserCount
         */
        public Long getTotalUserCount() {
            return this.totalUserCount;
        }

        /**
         * @return userCount
         */
        public Long getUserCount() {
            return this.userCount;
        }

        public static final class Builder {
            private Long resourceCount; 
            private Long resourceGroupCount; 
            private Long subUnitCount; 
            private Long totalResourceCount; 
            private Long totalResourceGroupCount; 
            private Long totalUserCount; 
            private Long userCount; 

            /**
             * <p>The number of resource instances in the cost center.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder resourceCount(Long resourceCount) {
                this.resourceCount = resourceCount;
                return this;
            }

            /**
             * <p>The number of resource groups in the cost center.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder resourceGroupCount(Long resourceGroupCount) {
                this.resourceGroupCount = resourceGroupCount;
                return this;
            }

            /**
             * <p>The number of sub-cost centers in the cost center.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder subUnitCount(Long subUnitCount) {
                this.subUnitCount = subUnitCount;
                return this;
            }

            /**
             * <p>The total number of resource instances, including resource instances of sub-cost centers, in the cost center.</p>
             * 
             * <strong>example:</strong>
             * <p>3</p>
             */
            public Builder totalResourceCount(Long totalResourceCount) {
                this.totalResourceCount = totalResourceCount;
                return this;
            }

            /**
             * <p>The total number of resource groups, including resource groups of sub-cost centers, in the cost center.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder totalResourceGroupCount(Long totalResourceGroupCount) {
                this.totalResourceGroupCount = totalResourceGroupCount;
                return this;
            }

            /**
             * <p>The total number of the associated accounts, including associated accounts of sub-cost centers, in the cost center.</p>
             * 
             * <strong>example:</strong>
             * <p>2</p>
             */
            public Builder totalUserCount(Long totalUserCount) {
                this.totalUserCount = totalUserCount;
                return this;
            }

            /**
             * <p>The number of sub-cost centers in the cost center.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder userCount(Long userCount) {
                this.userCount = userCount;
                return this;
            }

            public CostUnitStatisInfo build() {
                return new CostUnitStatisInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryCostUnitResourceResponseBody} extends {@link TeaModel}
     *
     * <p>QueryCostUnitResourceResponseBody</p>
     */
    public static class ResourceInstanceDtoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApportionCode")
        private String apportionCode;

        @com.aliyun.core.annotation.NameInMap("ApportionName")
        private String apportionName;

        @com.aliyun.core.annotation.NameInMap("CommodityCode")
        private String commodityCode;

        @com.aliyun.core.annotation.NameInMap("CommodityName")
        private String commodityName;

        @com.aliyun.core.annotation.NameInMap("PipCode")
        private String pipCode;

        @com.aliyun.core.annotation.NameInMap("RelatedResources")
        private String relatedResources;

        @com.aliyun.core.annotation.NameInMap("ResourceGroup")
        private String resourceGroup;

        @com.aliyun.core.annotation.NameInMap("ResourceId")
        private String resourceId;

        @com.aliyun.core.annotation.NameInMap("ResourceNick")
        private String resourceNick;

        @com.aliyun.core.annotation.NameInMap("ResourceSource")
        private String resourceSource;

        @com.aliyun.core.annotation.NameInMap("ResourceStatus")
        private String resourceStatus;

        @com.aliyun.core.annotation.NameInMap("ResourceTag")
        private String resourceTag;

        @com.aliyun.core.annotation.NameInMap("ResourceType")
        private String resourceType;

        @com.aliyun.core.annotation.NameInMap("ResourceUserId")
        private Long resourceUserId;

        @com.aliyun.core.annotation.NameInMap("ResourceUserName")
        private String resourceUserName;

        private ResourceInstanceDtoList(Builder builder) {
            this.apportionCode = builder.apportionCode;
            this.apportionName = builder.apportionName;
            this.commodityCode = builder.commodityCode;
            this.commodityName = builder.commodityName;
            this.pipCode = builder.pipCode;
            this.relatedResources = builder.relatedResources;
            this.resourceGroup = builder.resourceGroup;
            this.resourceId = builder.resourceId;
            this.resourceNick = builder.resourceNick;
            this.resourceSource = builder.resourceSource;
            this.resourceStatus = builder.resourceStatus;
            this.resourceTag = builder.resourceTag;
            this.resourceType = builder.resourceType;
            this.resourceUserId = builder.resourceUserId;
            this.resourceUserName = builder.resourceUserName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ResourceInstanceDtoList create() {
            return builder().build();
        }

        /**
         * @return apportionCode
         */
        public String getApportionCode() {
            return this.apportionCode;
        }

        /**
         * @return apportionName
         */
        public String getApportionName() {
            return this.apportionName;
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
         * @return pipCode
         */
        public String getPipCode() {
            return this.pipCode;
        }

        /**
         * @return relatedResources
         */
        public String getRelatedResources() {
            return this.relatedResources;
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
         * @return resourceStatus
         */
        public String getResourceStatus() {
            return this.resourceStatus;
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

        public static final class Builder {
            private String apportionCode; 
            private String apportionName; 
            private String commodityCode; 
            private String commodityName; 
            private String pipCode; 
            private String relatedResources; 
            private String resourceGroup; 
            private String resourceId; 
            private String resourceNick; 
            private String resourceSource; 
            private String resourceStatus; 
            private String resourceTag; 
            private String resourceType; 
            private Long resourceUserId; 
            private String resourceUserName; 

            /**
             * <p>The split code of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder apportionCode(String apportionCode) {
                this.apportionCode = apportionCode;
                return this;
            }

            /**
             * <p>The split name of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>test</p>
             */
            public Builder apportionName(String apportionName) {
                this.apportionName = apportionName;
                return this;
            }

            /**
             * <p>The product code of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>rds</p>
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
                return this;
            }

            /**
             * <p>The commodity name of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>ApsaraDB</p>
             */
            public Builder commodityName(String commodityName) {
                this.commodityName = commodityName;
                return this;
            }

            /**
             * <p>The code of the service. The code is the same as that in Cost Center.</p>
             * 
             * <strong>example:</strong>
             * <p>rds</p>
             */
            public Builder pipCode(String pipCode) {
                this.pipCode = pipCode;
                return this;
            }

            /**
             * <p>The resources related to the resource instance.</p>
             * 
             * <strong>example:</strong>
             * <p>oss</p>
             */
            public Builder relatedResources(String relatedResources) {
                this.relatedResources = relatedResources;
                return this;
            }

            /**
             * <p>The resource group to which the resource belongs.</p>
             * 
             * <strong>example:</strong>
             * <p>Default Resource Group</p>
             */
            public Builder resourceGroup(String resourceGroup) {
                this.resourceGroup = resourceGroup;
                return this;
            }

            /**
             * <p>The instance ID of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>OSSBAG-cn-v0h1s4hma018</p>
             */
            public Builder resourceId(String resourceId) {
                this.resourceId = resourceId;
                return this;
            }

            /**
             * <p>The custom name of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>testResource</p>
             */
            public Builder resourceNick(String resourceNick) {
                this.resourceNick = resourceNick;
                return this;
            }

            /**
             * <p>The source of the resource. Value:</p>
             * <ul>
             * <li>AUTO_ALLOCATE</li>
             * <li>MANUAL_ALLOCATE</li>
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
             * <p>The status of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>Available</p>
             */
            public Builder resourceStatus(String resourceStatus) {
                this.resourceStatus = resourceStatus;
                return this;
            }

            /**
             * <p>The tags of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>testResource</p>
             */
            public Builder resourceTag(String resourceTag) {
                this.resourceTag = resourceTag;
                return this;
            }

            /**
             * <p>The type of the resource.</p>
             * 
             * <strong>example:</strong>
             * <p>FPT_ossbag_absolute_Storage_bj</p>
             */
            public Builder resourceType(String resourceType) {
                this.resourceType = resourceType;
                return this;
            }

            /**
             * <p>The user ID of the resource owner.</p>
             * 
             * <strong>example:</strong>
             * <p>2424242134</p>
             */
            public Builder resourceUserId(Long resourceUserId) {
                this.resourceUserId = resourceUserId;
                return this;
            }

            /**
             * <p>The username of the resource owner.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="mailto:test@test.aliyun.com">test@test.aliyun.com</a></p>
             */
            public Builder resourceUserName(String resourceUserName) {
                this.resourceUserName = resourceUserName;
                return this;
            }

            public ResourceInstanceDtoList build() {
                return new ResourceInstanceDtoList(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryCostUnitResourceResponseBody} extends {@link TeaModel}
     *
     * <p>QueryCostUnitResourceResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CostUnit")
        private CostUnit costUnit;

        @com.aliyun.core.annotation.NameInMap("CostUnitStatisInfo")
        private CostUnitStatisInfo costUnitStatisInfo;

        @com.aliyun.core.annotation.NameInMap("PageNum")
        private Integer pageNum;

        @com.aliyun.core.annotation.NameInMap("PageSize")
        private Integer pageSize;

        @com.aliyun.core.annotation.NameInMap("ResourceInstanceDtoList")
        private java.util.List < ResourceInstanceDtoList> resourceInstanceDtoList;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        private Data(Builder builder) {
            this.costUnit = builder.costUnit;
            this.costUnitStatisInfo = builder.costUnitStatisInfo;
            this.pageNum = builder.pageNum;
            this.pageSize = builder.pageSize;
            this.resourceInstanceDtoList = builder.resourceInstanceDtoList;
            this.totalCount = builder.totalCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return costUnit
         */
        public CostUnit getCostUnit() {
            return this.costUnit;
        }

        /**
         * @return costUnitStatisInfo
         */
        public CostUnitStatisInfo getCostUnitStatisInfo() {
            return this.costUnitStatisInfo;
        }

        /**
         * @return pageNum
         */
        public Integer getPageNum() {
            return this.pageNum;
        }

        /**
         * @return pageSize
         */
        public Integer getPageSize() {
            return this.pageSize;
        }

        /**
         * @return resourceInstanceDtoList
         */
        public java.util.List < ResourceInstanceDtoList> getResourceInstanceDtoList() {
            return this.resourceInstanceDtoList;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public static final class Builder {
            private CostUnit costUnit; 
            private CostUnitStatisInfo costUnitStatisInfo; 
            private Integer pageNum; 
            private Integer pageSize; 
            private java.util.List < ResourceInstanceDtoList> resourceInstanceDtoList; 
            private Integer totalCount; 

            /**
             * <p>The information about the cost center.</p>
             */
            public Builder costUnit(CostUnit costUnit) {
                this.costUnit = costUnit;
                return this;
            }

            /**
             * <p>The statistical information about the cost center.</p>
             */
            public Builder costUnitStatisInfo(CostUnitStatisInfo costUnitStatisInfo) {
                this.costUnitStatisInfo = costUnitStatisInfo;
                return this;
            }

            /**
             * <p>The page number of the returned page.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder pageNum(Integer pageNum) {
                this.pageNum = pageNum;
                return this;
            }

            /**
             * <p>The number of entries returned per page.</p>
             * 
             * <strong>example:</strong>
             * <p>20</p>
             */
            public Builder pageSize(Integer pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * <p>The resource instances.</p>
             */
            public Builder resourceInstanceDtoList(java.util.List < ResourceInstanceDtoList> resourceInstanceDtoList) {
                this.resourceInstanceDtoList = resourceInstanceDtoList;
                return this;
            }

            /**
             * <p>The total number of returned entries.</p>
             * 
             * <strong>example:</strong>
             * <p>12</p>
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
