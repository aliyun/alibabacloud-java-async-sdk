// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListScalingGroupV2ResponseBody} extends {@link TeaModel}
 *
 * <p>ListScalingGroupV2ResponseBody</p>
 */
public class ListScalingGroupV2ResponseBody extends TeaModel {
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

    private ListScalingGroupV2ResponseBody(Builder builder) {
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

    public static ListScalingGroupV2ResponseBody create() {
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

        public ListScalingGroupV2ResponseBody build() {
            return new ListScalingGroupV2ResponseBody(this);
        } 

    } 

    public static class Item extends TeaModel {
        @NameInMap("ActiveStatus")
        private String activeStatus;

        @NameInMap("Description")
        private String description;

        @NameInMap("HostGroupBizId")
        private String hostGroupBizId;

        @NameInMap("Name")
        private String name;

        @NameInMap("ScalingGroupId")
        private String scalingGroupId;

        @NameInMap("ScalingInMode")
        private String scalingInMode;

        @NameInMap("ScalingMaxSize")
        private Integer scalingMaxSize;

        @NameInMap("ScalingMinSize")
        private Integer scalingMinSize;

        private Item(Builder builder) {
            this.activeStatus = builder.activeStatus;
            this.description = builder.description;
            this.hostGroupBizId = builder.hostGroupBizId;
            this.name = builder.name;
            this.scalingGroupId = builder.scalingGroupId;
            this.scalingInMode = builder.scalingInMode;
            this.scalingMaxSize = builder.scalingMaxSize;
            this.scalingMinSize = builder.scalingMinSize;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Item create() {
            return builder().build();
        }

        /**
         * @return activeStatus
         */
        public String getActiveStatus() {
            return this.activeStatus;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return hostGroupBizId
         */
        public String getHostGroupBizId() {
            return this.hostGroupBizId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return scalingGroupId
         */
        public String getScalingGroupId() {
            return this.scalingGroupId;
        }

        /**
         * @return scalingInMode
         */
        public String getScalingInMode() {
            return this.scalingInMode;
        }

        /**
         * @return scalingMaxSize
         */
        public Integer getScalingMaxSize() {
            return this.scalingMaxSize;
        }

        /**
         * @return scalingMinSize
         */
        public Integer getScalingMinSize() {
            return this.scalingMinSize;
        }

        public static final class Builder {
            private String activeStatus; 
            private String description; 
            private String hostGroupBizId; 
            private String name; 
            private String scalingGroupId; 
            private String scalingInMode; 
            private Integer scalingMaxSize; 
            private Integer scalingMinSize; 

            /**
             * ActiveStatus.
             */
            public Builder activeStatus(String activeStatus) {
                this.activeStatus = activeStatus;
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
             * HostGroupBizId.
             */
            public Builder hostGroupBizId(String hostGroupBizId) {
                this.hostGroupBizId = hostGroupBizId;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * ScalingGroupId.
             */
            public Builder scalingGroupId(String scalingGroupId) {
                this.scalingGroupId = scalingGroupId;
                return this;
            }

            /**
             * ScalingInMode.
             */
            public Builder scalingInMode(String scalingInMode) {
                this.scalingInMode = scalingInMode;
                return this;
            }

            /**
             * ScalingMaxSize.
             */
            public Builder scalingMaxSize(Integer scalingMaxSize) {
                this.scalingMaxSize = scalingMaxSize;
                return this;
            }

            /**
             * ScalingMinSize.
             */
            public Builder scalingMinSize(Integer scalingMinSize) {
                this.scalingMinSize = scalingMinSize;
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
