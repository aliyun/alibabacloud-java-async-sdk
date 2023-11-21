// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeInstanceAutoRenewalAttributeResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeInstanceAutoRenewalAttributeResponseBody</p>
 */
public class DescribeInstanceAutoRenewalAttributeResponseBody extends TeaModel {
    @NameInMap("Items")
    private Items items;

    @NameInMap("PageNumber")
    private Integer pageNumber;

    @NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalRecordCount")
    private Integer totalRecordCount;

    private DescribeInstanceAutoRenewalAttributeResponseBody(Builder builder) {
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
        this.requestId = builder.requestId;
        this.totalRecordCount = builder.totalRecordCount;
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
        private Items items; 
        private Integer pageNumber; 
        private Integer pageRecordCount; 
        private String requestId; 
        private Integer totalRecordCount; 

        /**
         * The renewal information about the instance.
         */
        public Builder items(Items items) {
            this.items = items;
            return this;
        }

        /**
         * The page number.
         */
        public Builder pageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * The number of entries per page.
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of entries returned.
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeInstanceAutoRenewalAttributeResponseBody build() {
            return new DescribeInstanceAutoRenewalAttributeResponseBody(this);
        } 

    } 

    public static class Item extends TeaModel {
        @NameInMap("AutoRenew")
        private String autoRenew;

        @NameInMap("DBInstanceId")
        private String DBInstanceId;

        @NameInMap("Duration")
        private Integer duration;

        @NameInMap("RegionId")
        private String regionId;

        @NameInMap("Status")
        private String status;

        private Item(Builder builder) {
            this.autoRenew = builder.autoRenew;
            this.DBInstanceId = builder.DBInstanceId;
            this.duration = builder.duration;
            this.regionId = builder.regionId;
            this.status = builder.status;
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
         * @return DBInstanceId
         */
        public String getDBInstanceId() {
            return this.DBInstanceId;
        }

        /**
         * @return duration
         */
        public Integer getDuration() {
            return this.duration;
        }

        /**
         * @return regionId
         */
        public String getRegionId() {
            return this.regionId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String autoRenew; 
            private String DBInstanceId; 
            private Integer duration; 
            private String regionId; 
            private String status; 

            /**
             * Indicates whether to enable auto-renewal for the instance.
             */
            public Builder autoRenew(String autoRenew) {
                this.autoRenew = autoRenew;
                return this;
            }

            /**
             * The instance ID.
             */
            public Builder DBInstanceId(String DBInstanceId) {
                this.DBInstanceId = DBInstanceId;
                return this;
            }

            /**
             * The renewal period.
             */
            public Builder duration(Integer duration) {
                this.duration = duration;
                return this;
            }

            /**
             * The region ID.
             */
            public Builder regionId(String regionId) {
                this.regionId = regionId;
                return this;
            }

            /**
             * The instance status.
             */
            public Builder status(String status) {
                this.status = status;
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
