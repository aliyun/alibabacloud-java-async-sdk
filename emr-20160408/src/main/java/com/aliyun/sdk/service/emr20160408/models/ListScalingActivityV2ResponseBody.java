// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListScalingActivityV2ResponseBody} extends {@link TeaModel}
 *
 * <p>ListScalingActivityV2ResponseBody</p>
 */
public class ListScalingActivityV2ResponseBody extends TeaModel {
    @NameInMap("Items")
    private Items items;

    @NameInMap("NextToken")
    private String nextToken;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListScalingActivityV2ResponseBody(Builder builder) {
        this.items = builder.items;
        this.nextToken = builder.nextToken;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListScalingActivityV2ResponseBody create() {
        return builder().build();
    }

    /**
     * @return items
     */
    public Items getItems() {
        return this.items;
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
        private Items items; 
        private String nextToken; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * Items.
         */
        public Builder items(Items items) {
            this.items = items;
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

        public ListScalingActivityV2ResponseBody build() {
            return new ListScalingActivityV2ResponseBody(this);
        } 

    } 

    public static class Item extends TeaModel {
        @NameInMap("BizId")
        private String bizId;

        @NameInMap("Cause")
        private String cause;

        @NameInMap("Description")
        private String description;

        @NameInMap("EndTime")
        private Long endTime;

        @NameInMap("ExpectNum")
        private Integer expectNum;

        @NameInMap("HostGroupBizId")
        private String hostGroupBizId;

        @NameInMap("HostGroupName")
        private String hostGroupName;

        @NameInMap("InstanceIds")
        private String instanceIds;

        @NameInMap("ScalingRuleId")
        private String scalingRuleId;

        @NameInMap("ScalingRuleName")
        private String scalingRuleName;

        @NameInMap("StartTime")
        private Long startTime;

        @NameInMap("Status")
        private String status;

        @NameInMap("TotalCapacity")
        private Integer totalCapacity;

        @NameInMap("Transition")
        private String transition;

        private Item(Builder builder) {
            this.bizId = builder.bizId;
            this.cause = builder.cause;
            this.description = builder.description;
            this.endTime = builder.endTime;
            this.expectNum = builder.expectNum;
            this.hostGroupBizId = builder.hostGroupBizId;
            this.hostGroupName = builder.hostGroupName;
            this.instanceIds = builder.instanceIds;
            this.scalingRuleId = builder.scalingRuleId;
            this.scalingRuleName = builder.scalingRuleName;
            this.startTime = builder.startTime;
            this.status = builder.status;
            this.totalCapacity = builder.totalCapacity;
            this.transition = builder.transition;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Item create() {
            return builder().build();
        }

        /**
         * @return bizId
         */
        public String getBizId() {
            return this.bizId;
        }

        /**
         * @return cause
         */
        public String getCause() {
            return this.cause;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return expectNum
         */
        public Integer getExpectNum() {
            return this.expectNum;
        }

        /**
         * @return hostGroupBizId
         */
        public String getHostGroupBizId() {
            return this.hostGroupBizId;
        }

        /**
         * @return hostGroupName
         */
        public String getHostGroupName() {
            return this.hostGroupName;
        }

        /**
         * @return instanceIds
         */
        public String getInstanceIds() {
            return this.instanceIds;
        }

        /**
         * @return scalingRuleId
         */
        public String getScalingRuleId() {
            return this.scalingRuleId;
        }

        /**
         * @return scalingRuleName
         */
        public String getScalingRuleName() {
            return this.scalingRuleName;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return totalCapacity
         */
        public Integer getTotalCapacity() {
            return this.totalCapacity;
        }

        /**
         * @return transition
         */
        public String getTransition() {
            return this.transition;
        }

        public static final class Builder {
            private String bizId; 
            private String cause; 
            private String description; 
            private Long endTime; 
            private Integer expectNum; 
            private String hostGroupBizId; 
            private String hostGroupName; 
            private String instanceIds; 
            private String scalingRuleId; 
            private String scalingRuleName; 
            private Long startTime; 
            private String status; 
            private Integer totalCapacity; 
            private String transition; 

            /**
             * BizId.
             */
            public Builder bizId(String bizId) {
                this.bizId = bizId;
                return this;
            }

            /**
             * Cause.
             */
            public Builder cause(String cause) {
                this.cause = cause;
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
             * EndTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * ExpectNum.
             */
            public Builder expectNum(Integer expectNum) {
                this.expectNum = expectNum;
                return this;
            }

            /**
             * HostGroupBizId.
             */
            public Builder hostGroupBizId(String hostGroupBizId) {
                this.hostGroupBizId = hostGroupBizId;
                return this;
            }

            /**
             * HostGroupName.
             */
            public Builder hostGroupName(String hostGroupName) {
                this.hostGroupName = hostGroupName;
                return this;
            }

            /**
             * InstanceIds.
             */
            public Builder instanceIds(String instanceIds) {
                this.instanceIds = instanceIds;
                return this;
            }

            /**
             * ScalingRuleId.
             */
            public Builder scalingRuleId(String scalingRuleId) {
                this.scalingRuleId = scalingRuleId;
                return this;
            }

            /**
             * ScalingRuleName.
             */
            public Builder scalingRuleName(String scalingRuleName) {
                this.scalingRuleName = scalingRuleName;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
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
             * TotalCapacity.
             */
            public Builder totalCapacity(Integer totalCapacity) {
                this.totalCapacity = totalCapacity;
                return this;
            }

            /**
             * Transition.
             */
            public Builder transition(String transition) {
                this.transition = transition;
                return this;
            }

            public Item build() {
                return new Item(this);
            } 

        } 

    }
    public static class Items extends TeaModel {
        @NameInMap("Item")
        private java.util.List < Item> item;

        private Items(Builder builder) {
            this.item = builder.item;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Items create() {
            return builder().build();
        }

        /**
         * @return item
         */
        public java.util.List < Item> getItem() {
            return this.item;
        }

        public static final class Builder {
            private java.util.List < Item> item; 

            /**
             * Item.
             */
            public Builder item(java.util.List < Item> item) {
                this.item = item;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
