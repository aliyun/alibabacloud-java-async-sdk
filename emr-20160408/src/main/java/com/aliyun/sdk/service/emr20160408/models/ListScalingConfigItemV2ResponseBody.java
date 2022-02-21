// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListScalingConfigItemV2ResponseBody} extends {@link TeaModel}
 *
 * <p>ListScalingConfigItemV2ResponseBody</p>
 */
public class ListScalingConfigItemV2ResponseBody extends TeaModel {
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

    private ListScalingConfigItemV2ResponseBody(Builder builder) {
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

    public static ListScalingConfigItemV2ResponseBody create() {
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

        public ListScalingConfigItemV2ResponseBody build() {
            return new ListScalingConfigItemV2ResponseBody(this);
        } 

    } 

    public static class Item extends TeaModel {
        @NameInMap("ConfigItemInformation")
        private String configItemInformation;

        @NameInMap("ConfigItemType")
        private String configItemType;

        @NameInMap("ScalingConfigItemBizId")
        private String scalingConfigItemBizId;

        @NameInMap("ScalingGroupBizId")
        private String scalingGroupBizId;

        private Item(Builder builder) {
            this.configItemInformation = builder.configItemInformation;
            this.configItemType = builder.configItemType;
            this.scalingConfigItemBizId = builder.scalingConfigItemBizId;
            this.scalingGroupBizId = builder.scalingGroupBizId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Item create() {
            return builder().build();
        }

        /**
         * @return configItemInformation
         */
        public String getConfigItemInformation() {
            return this.configItemInformation;
        }

        /**
         * @return configItemType
         */
        public String getConfigItemType() {
            return this.configItemType;
        }

        /**
         * @return scalingConfigItemBizId
         */
        public String getScalingConfigItemBizId() {
            return this.scalingConfigItemBizId;
        }

        /**
         * @return scalingGroupBizId
         */
        public String getScalingGroupBizId() {
            return this.scalingGroupBizId;
        }

        public static final class Builder {
            private String configItemInformation; 
            private String configItemType; 
            private String scalingConfigItemBizId; 
            private String scalingGroupBizId; 

            /**
             * ConfigItemInformation.
             */
            public Builder configItemInformation(String configItemInformation) {
                this.configItemInformation = configItemInformation;
                return this;
            }

            /**
             * ConfigItemType.
             */
            public Builder configItemType(String configItemType) {
                this.configItemType = configItemType;
                return this;
            }

            /**
             * ScalingConfigItemBizId.
             */
            public Builder scalingConfigItemBizId(String scalingConfigItemBizId) {
                this.scalingConfigItemBizId = scalingConfigItemBizId;
                return this;
            }

            /**
             * ScalingGroupBizId.
             */
            public Builder scalingGroupBizId(String scalingGroupBizId) {
                this.scalingGroupBizId = scalingGroupBizId;
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
