// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20160722.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCapacityHistoryResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCapacityHistoryResponseBody</p>
 */
public class DescribeCapacityHistoryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CapacityHistoryItems")
    private CapacityHistoryItems capacityHistoryItems;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeCapacityHistoryResponseBody(Builder builder) {
        this.capacityHistoryItems = builder.capacityHistoryItems;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCapacityHistoryResponseBody create() {
        return builder().build();
    }

    /**
     * @return capacityHistoryItems
     */
    public CapacityHistoryItems getCapacityHistoryItems() {
        return this.capacityHistoryItems;
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
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private CapacityHistoryItems capacityHistoryItems; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private Integer totalCount; 

        /**
         * CapacityHistoryItems.
         */
        public Builder capacityHistoryItems(CapacityHistoryItems capacityHistoryItems) {
            this.capacityHistoryItems = capacityHistoryItems;
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
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public DescribeCapacityHistoryResponseBody build() {
            return new DescribeCapacityHistoryResponseBody(this);
        } 

    } 

    public static class CapacityHistoryModel extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AttachedCapacity")
        private Integer attachedCapacity;

        @com.aliyun.core.annotation.NameInMap("AutoCreatedCapacity")
        private Integer autoCreatedCapacity;

        @com.aliyun.core.annotation.NameInMap("ScalingGroupId")
        private String scalingGroupId;

        @com.aliyun.core.annotation.NameInMap("Timestamp")
        private String timestamp;

        @com.aliyun.core.annotation.NameInMap("TotalCapacity")
        private Integer totalCapacity;

        private CapacityHistoryModel(Builder builder) {
            this.attachedCapacity = builder.attachedCapacity;
            this.autoCreatedCapacity = builder.autoCreatedCapacity;
            this.scalingGroupId = builder.scalingGroupId;
            this.timestamp = builder.timestamp;
            this.totalCapacity = builder.totalCapacity;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CapacityHistoryModel create() {
            return builder().build();
        }

        /**
         * @return attachedCapacity
         */
        public Integer getAttachedCapacity() {
            return this.attachedCapacity;
        }

        /**
         * @return autoCreatedCapacity
         */
        public Integer getAutoCreatedCapacity() {
            return this.autoCreatedCapacity;
        }

        /**
         * @return scalingGroupId
         */
        public String getScalingGroupId() {
            return this.scalingGroupId;
        }

        /**
         * @return timestamp
         */
        public String getTimestamp() {
            return this.timestamp;
        }

        /**
         * @return totalCapacity
         */
        public Integer getTotalCapacity() {
            return this.totalCapacity;
        }

        public static final class Builder {
            private Integer attachedCapacity; 
            private Integer autoCreatedCapacity; 
            private String scalingGroupId; 
            private String timestamp; 
            private Integer totalCapacity; 

            /**
             * AttachedCapacity.
             */
            public Builder attachedCapacity(Integer attachedCapacity) {
                this.attachedCapacity = attachedCapacity;
                return this;
            }

            /**
             * AutoCreatedCapacity.
             */
            public Builder autoCreatedCapacity(Integer autoCreatedCapacity) {
                this.autoCreatedCapacity = autoCreatedCapacity;
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
             * Timestamp.
             */
            public Builder timestamp(String timestamp) {
                this.timestamp = timestamp;
                return this;
            }

            /**
             * TotalCapacity.
             */
            public Builder totalCapacity(Integer totalCapacity) {
                this.totalCapacity = totalCapacity;
                return this;
            }

            public CapacityHistoryModel build() {
                return new CapacityHistoryModel(this);
            } 

        } 

    }
    public static class CapacityHistoryItems extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CapacityHistoryModel")
        private java.util.List < CapacityHistoryModel> capacityHistoryModel;

        private CapacityHistoryItems(Builder builder) {
            this.capacityHistoryModel = builder.capacityHistoryModel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CapacityHistoryItems create() {
            return builder().build();
        }

        /**
         * @return capacityHistoryModel
         */
        public java.util.List < CapacityHistoryModel> getCapacityHistoryModel() {
            return this.capacityHistoryModel;
        }

        public static final class Builder {
            private java.util.List < CapacityHistoryModel> capacityHistoryModel; 

            /**
             * CapacityHistoryModel.
             */
            public Builder capacityHistoryModel(java.util.List < CapacityHistoryModel> capacityHistoryModel) {
                this.capacityHistoryModel = capacityHistoryModel;
                return this;
            }

            public CapacityHistoryItems build() {
                return new CapacityHistoryItems(this);
            } 

        } 

    }
}
