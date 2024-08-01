// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dds20151201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceAutoRenewalAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceAutoRenewalAttributeResponseBody</p>
 */
public class DescribeInstanceAutoRenewalAttributeResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Items")
    private Items items;

    @com.aliyun.core.annotation.NameInMap("ItemsNumbers")
    private Integer itemsNumbers;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeInstanceAutoRenewalAttributeResponseBody(Builder builder) {
        this.items = builder.items;
        this.itemsNumbers = builder.itemsNumbers;
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeInstanceAutoRenewalAttributeResponseBody create() {
        return builder().build();
    }

    /**
     * @return items
     */
    public Items getItems() {
        return this.items;
    }

    /**
     * @return itemsNumbers
     */
    public Integer getItemsNumbers() {
        return this.itemsNumbers;
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

    public static final class Builder {
        private Items items; 
        private Integer itemsNumbers; 
        private Integer pageNumber; 
        private Integer pageRecordCount; 
        private String requestId; 

        /**
         * Details about returned entries.
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder itemsNumbers(Integer itemsNumbers) {
            this.itemsNumbers = itemsNumbers;
            return this;
        }

        /**
         * The page number of the returned page.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries that were returned on the current page.
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeInstanceAutoRenewalAttributeResponseBody build() {
            return new DescribeInstanceAutoRenewalAttributeResponseBody(this);
        } 

    } 

    public static class Item extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoRenew")
        private String autoRenew;

        @com.aliyun.core.annotation.NameInMap("DBInstanceType")
        private String DBInstanceType;

        @com.aliyun.core.annotation.NameInMap("DbInstanceId")
        private String dbInstanceId;

        @com.aliyun.core.annotation.NameInMap("Duration")
        private String duration;

        @com.aliyun.core.annotation.NameInMap("RegionId")
        private String regionId;

        private Item(Builder builder) {
            this.autoRenew = builder.autoRenew;
            this.DBInstanceType = builder.DBInstanceType;
            this.dbInstanceId = builder.dbInstanceId;
            this.duration = builder.duration;
            this.regionId = builder.regionId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Item create() {
            return builder().build();
        }

        /**
         * @return autoRenew
         */
        public String getAutoRenew() {
            return this.autoRenew;
        }

        /**
         * @return DBInstanceType
         */
        public String getDBInstanceType() {
            return this.DBInstanceType;
        }

        /**
         * @return dbInstanceId
         */
        public String getDbInstanceId() {
            return this.dbInstanceId;
        }

        /**
         * @return duration
         */
        public String getDuration() {
            return this.duration;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        public static final class Builder {
            private String autoRenew; 
            private String DBInstanceType; 
            private String dbInstanceId; 
            private String duration; 
            private String regionId; 

            /**
             * Indicates whether auto-renewal is enabled for the instance. Valid values:
             * <p>
             * 
             * *   **true**: Auto-renewal is enabled for the instance.
             * *   **false**: Auto-renewal is disabled for the instance.
             */
            public Builder autoRenew(String autoRenew) {
                this.autoRenew = autoRenew;
                return this;
            }

            /**
             * The category of the instance. Valid values:
             * <p>
             * 
             * *   **replicate**: the standalone or replica set instance
             * *   **sharding**: the sharded cluster instance
             */
            public Builder DBInstanceType(String DBInstanceType) {
                this.DBInstanceType = DBInstanceType;
                return this;
            }

            /**
             * The ID of the instance.
             */
            public Builder dbInstanceId(String dbInstanceId) {
                this.dbInstanceId = dbInstanceId;
                return this;
            }

            /**
             * The auto-renewal period. Unit: months.
             * <p>
             * 
             * > * This parameter is ruturned only when the returned value of the **AutoRenew** parameter is **true**.
             * > * You can call the [ModifyInstanceAutoRenewalAttribute](~~145979~~) operation to modify the auto-renewal period.
             */
            public Builder duration(String duration) {
                this.duration = duration;
                return this;
            }

            /**
             * The region ID of the instance.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            public Item build() {
                return new Item(this);
            } 

        } 

    }
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Item")
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
