// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryCostUnitResourceResponseBody} extends {@link TeaModel}
 *
 * <p>QueryCostUnitResourceResponseBody</p>
 */
public class QueryCostUnitResourceResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * Message.
         */
        public Builder message(String message) {
            this.message = message;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public QueryCostUnitResourceResponseBody build() {
            return new QueryCostUnitResourceResponseBody(this);
        } 

    } 

    public static class CostUnit extends TeaModel {
        @NameInMap("OwnerUid")
        private Long ownerUid;

        @NameInMap("ParentUnitId")
        private Long parentUnitId;

        @NameInMap("UnitId")
        private Long unitId;

        @NameInMap("UnitName")
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
             * OwnerUid.
             */
            public Builder ownerUid(Long ownerUid) {
                this.ownerUid = ownerUid;
                return this;
            }

            /**
             * ParentUnitId.
             */
            public Builder parentUnitId(Long parentUnitId) {
                this.parentUnitId = parentUnitId;
                return this;
            }

            /**
             * UnitId.
             */
            public Builder unitId(Long unitId) {
                this.unitId = unitId;
                return this;
            }

            /**
             * UnitName.
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
    public static class CostUnitStatisInfo extends TeaModel {
        @NameInMap("ResourceCount")
        private Long resourceCount;

        @NameInMap("ResourceGroupCount")
        private Long resourceGroupCount;

        @NameInMap("SubUnitCount")
        private Long subUnitCount;

        @NameInMap("TotalResourceCount")
        private Long totalResourceCount;

        @NameInMap("TotalResourceGroupCount")
        private Long totalResourceGroupCount;

        @NameInMap("TotalUserCount")
        private Long totalUserCount;

        @NameInMap("UserCount")
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
             * ResourceCount.
             */
            public Builder resourceCount(Long resourceCount) {
                this.resourceCount = resourceCount;
                return this;
            }

            /**
             * ResourceGroupCount.
             */
            public Builder resourceGroupCount(Long resourceGroupCount) {
                this.resourceGroupCount = resourceGroupCount;
                return this;
            }

            /**
             * SubUnitCount.
             */
            public Builder subUnitCount(Long subUnitCount) {
                this.subUnitCount = subUnitCount;
                return this;
            }

            /**
             * TotalResourceCount.
             */
            public Builder totalResourceCount(Long totalResourceCount) {
                this.totalResourceCount = totalResourceCount;
                return this;
            }

            /**
             * TotalResourceGroupCount.
             */
            public Builder totalResourceGroupCount(Long totalResourceGroupCount) {
                this.totalResourceGroupCount = totalResourceGroupCount;
                return this;
            }

            /**
             * TotalUserCount.
             */
            public Builder totalUserCount(Long totalUserCount) {
                this.totalUserCount = totalUserCount;
                return this;
            }

            /**
             * UserCount.
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
    public static class ResourceInstanceDtoList extends TeaModel {
        @NameInMap("ApportionCode")
        private String apportionCode;

        @NameInMap("ApportionName")
        private String apportionName;

        @NameInMap("CommodityCode")
        private String commodityCode;

        @NameInMap("CommodityName")
        private String commodityName;

        @NameInMap("RelatedResources")
        private String relatedResources;

        @NameInMap("ResourceGroup")
        private String resourceGroup;

        @NameInMap("ResourceId")
        private String resourceId;

        @NameInMap("ResourceNick")
        private String resourceNick;

        @NameInMap("ResourceStatus")
        private String resourceStatus;

        @NameInMap("ResourceTag")
        private String resourceTag;

        @NameInMap("ResourceType")
        private String resourceType;

        @NameInMap("ResourceUserId")
        private Long resourceUserId;

        @NameInMap("ResourceUserName")
        private String resourceUserName;

        private ResourceInstanceDtoList(Builder builder) {
            this.apportionCode = builder.apportionCode;
            this.apportionName = builder.apportionName;
            this.commodityCode = builder.commodityCode;
            this.commodityName = builder.commodityName;
            this.relatedResources = builder.relatedResources;
            this.resourceGroup = builder.resourceGroup;
            this.resourceId = builder.resourceId;
            this.resourceNick = builder.resourceNick;
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
            private String relatedResources; 
            private String resourceGroup; 
            private String resourceId; 
            private String resourceNick; 
            private String resourceStatus; 
            private String resourceTag; 
            private String resourceType; 
            private Long resourceUserId; 
            private String resourceUserName; 

            /**
             * ApportionCode.
             */
            public Builder apportionCode(String apportionCode) {
                this.apportionCode = apportionCode;
                return this;
            }

            /**
             * ApportionName.
             */
            public Builder apportionName(String apportionName) {
                this.apportionName = apportionName;
                return this;
            }

            /**
             * CommodityCode.
             */
            public Builder commodityCode(String commodityCode) {
                this.commodityCode = commodityCode;
                return this;
            }

            /**
             * CommodityName.
             */
            public Builder commodityName(String commodityName) {
                this.commodityName = commodityName;
                return this;
            }

            /**
             * RelatedResources.
             */
            public Builder relatedResources(String relatedResources) {
                this.relatedResources = relatedResources;
                return this;
            }

            /**
             * ResourceGroup.
             */
            public Builder resourceGroup(String resourceGroup) {
                this.resourceGroup = resourceGroup;
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
             * ResourceNick.
             */
            public Builder resourceNick(String resourceNick) {
                this.resourceNick = resourceNick;
                return this;
            }

            /**
             * ResourceStatus.
             */
            public Builder resourceStatus(String resourceStatus) {
                this.resourceStatus = resourceStatus;
                return this;
            }

            /**
             * ResourceTag.
             */
            public Builder resourceTag(String resourceTag) {
                this.resourceTag = resourceTag;
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
             * ResourceUserId.
             */
            public Builder resourceUserId(Long resourceUserId) {
                this.resourceUserId = resourceUserId;
                return this;
            }

            /**
             * ResourceUserName.
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
    public static class Data extends TeaModel {
        @NameInMap("CostUnit")
        private CostUnit costUnit;

        @NameInMap("CostUnitStatisInfo")
        private CostUnitStatisInfo costUnitStatisInfo;

        @NameInMap("PageNum")
        private Integer pageNum;

        @NameInMap("PageSize")
        private Integer pageSize;

        @NameInMap("ResourceInstanceDtoList")
        private java.util.List < ResourceInstanceDtoList> resourceInstanceDtoList;

        @NameInMap("TotalCount")
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
             * CostUnit.
             */
            public Builder costUnit(CostUnit costUnit) {
                this.costUnit = costUnit;
                return this;
            }

            /**
             * CostUnitStatisInfo.
             */
            public Builder costUnitStatisInfo(CostUnitStatisInfo costUnitStatisInfo) {
                this.costUnitStatisInfo = costUnitStatisInfo;
                return this;
            }

            /**
             * PageNum.
             */
            public Builder pageNum(Integer pageNum) {
                this.pageNum = pageNum;
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
             * ResourceInstanceDtoList.
             */
            public Builder resourceInstanceDtoList(java.util.List < ResourceInstanceDtoList> resourceInstanceDtoList) {
                this.resourceInstanceDtoList = resourceInstanceDtoList;
                return this;
            }

            /**
             * TotalCount.
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
