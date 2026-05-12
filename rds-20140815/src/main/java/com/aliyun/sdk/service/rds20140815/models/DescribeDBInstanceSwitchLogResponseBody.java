// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

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
 * {@link DescribeDBInstanceSwitchLogResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDBInstanceSwitchLogResponseBody</p>
 */
public class DescribeDBInstanceSwitchLogResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBInstanceName")
    private String DBInstanceName;

    @com.aliyun.core.annotation.NameInMap("Items")
    private Items items;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageRecordCount")
    private Integer pageRecordCount;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalRecordCount")
    private Integer totalRecordCount;

    private DescribeDBInstanceSwitchLogResponseBody(Builder builder) {
        this.DBInstanceName = builder.DBInstanceName;
        this.items = builder.items;
        this.pageNumber = builder.pageNumber;
        this.pageRecordCount = builder.pageRecordCount;
        this.requestId = builder.requestId;
        this.totalRecordCount = builder.totalRecordCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDBInstanceSwitchLogResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DBInstanceName
     */
    public String getDBInstanceName() {
        return this.DBInstanceName;
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
        private String DBInstanceName; 
        private Items items; 
        private Integer pageNumber; 
        private Integer pageRecordCount; 
        private String requestId; 
        private Integer totalRecordCount; 

        private Builder() {
        } 

        private Builder(DescribeDBInstanceSwitchLogResponseBody model) {
            this.DBInstanceName = model.DBInstanceName;
            this.items = model.items;
            this.pageNumber = model.pageNumber;
            this.pageRecordCount = model.pageRecordCount;
            this.requestId = model.requestId;
            this.totalRecordCount = model.totalRecordCount;
        } 

        /**
         * DBInstanceName.
         */
        public Builder DBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }

        /**
         * Items.
         */
        public Builder items(Items items) {
            this.items = items;
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
         * PageRecordCount.
         */
        public Builder pageRecordCount(Integer pageRecordCount) {
            this.pageRecordCount = pageRecordCount;
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
         * TotalRecordCount.
         */
        public Builder totalRecordCount(Integer totalRecordCount) {
            this.totalRecordCount = totalRecordCount;
            return this;
        }

        public DescribeDBInstanceSwitchLogResponseBody build() {
            return new DescribeDBInstanceSwitchLogResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDBInstanceSwitchLogResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstanceSwitchLogResponseBody</p>
     */
    public static class Item extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AffectedSessions")
        private String affectedSessions;

        @com.aliyun.core.annotation.NameInMap("HAStatus")
        private String HAStatus;

        @com.aliyun.core.annotation.NameInMap("SwitchCauseCode")
        private String switchCauseCode;

        @com.aliyun.core.annotation.NameInMap("SwitchCauseDetail")
        private String switchCauseDetail;

        @com.aliyun.core.annotation.NameInMap("SwitchFinishTime")
        private String switchFinishTime;

        @com.aliyun.core.annotation.NameInMap("SwitchId")
        private String switchId;

        @com.aliyun.core.annotation.NameInMap("SwitchStartTime")
        private String switchStartTime;

        @com.aliyun.core.annotation.NameInMap("TotalSessions")
        private String totalSessions;

        private Item(Builder builder) {
            this.affectedSessions = builder.affectedSessions;
            this.HAStatus = builder.HAStatus;
            this.switchCauseCode = builder.switchCauseCode;
            this.switchCauseDetail = builder.switchCauseDetail;
            this.switchFinishTime = builder.switchFinishTime;
            this.switchId = builder.switchId;
            this.switchStartTime = builder.switchStartTime;
            this.totalSessions = builder.totalSessions;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Item create() {
            return builder().build();
        }

        /**
         * @return affectedSessions
         */
        public String getAffectedSessions() {
            return this.affectedSessions;
        }

        /**
         * @return HAStatus
         */
        public String getHAStatus() {
            return this.HAStatus;
        }

        /**
         * @return switchCauseCode
         */
        public String getSwitchCauseCode() {
            return this.switchCauseCode;
        }

        /**
         * @return switchCauseDetail
         */
        public String getSwitchCauseDetail() {
            return this.switchCauseDetail;
        }

        /**
         * @return switchFinishTime
         */
        public String getSwitchFinishTime() {
            return this.switchFinishTime;
        }

        /**
         * @return switchId
         */
        public String getSwitchId() {
            return this.switchId;
        }

        /**
         * @return switchStartTime
         */
        public String getSwitchStartTime() {
            return this.switchStartTime;
        }

        /**
         * @return totalSessions
         */
        public String getTotalSessions() {
            return this.totalSessions;
        }

        public static final class Builder {
            private String affectedSessions; 
            private String HAStatus; 
            private String switchCauseCode; 
            private String switchCauseDetail; 
            private String switchFinishTime; 
            private String switchId; 
            private String switchStartTime; 
            private String totalSessions; 

            private Builder() {
            } 

            private Builder(Item model) {
                this.affectedSessions = model.affectedSessions;
                this.HAStatus = model.HAStatus;
                this.switchCauseCode = model.switchCauseCode;
                this.switchCauseDetail = model.switchCauseDetail;
                this.switchFinishTime = model.switchFinishTime;
                this.switchId = model.switchId;
                this.switchStartTime = model.switchStartTime;
                this.totalSessions = model.totalSessions;
            } 

            /**
             * AffectedSessions.
             */
            public Builder affectedSessions(String affectedSessions) {
                this.affectedSessions = affectedSessions;
                return this;
            }

            /**
             * HAStatus.
             */
            public Builder HAStatus(String HAStatus) {
                this.HAStatus = HAStatus;
                return this;
            }

            /**
             * SwitchCauseCode.
             */
            public Builder switchCauseCode(String switchCauseCode) {
                this.switchCauseCode = switchCauseCode;
                return this;
            }

            /**
             * SwitchCauseDetail.
             */
            public Builder switchCauseDetail(String switchCauseDetail) {
                this.switchCauseDetail = switchCauseDetail;
                return this;
            }

            /**
             * SwitchFinishTime.
             */
            public Builder switchFinishTime(String switchFinishTime) {
                this.switchFinishTime = switchFinishTime;
                return this;
            }

            /**
             * SwitchId.
             */
            public Builder switchId(String switchId) {
                this.switchId = switchId;
                return this;
            }

            /**
             * SwitchStartTime.
             */
            public Builder switchStartTime(String switchStartTime) {
                this.switchStartTime = switchStartTime;
                return this;
            }

            /**
             * TotalSessions.
             */
            public Builder totalSessions(String totalSessions) {
                this.totalSessions = totalSessions;
                return this;
            }

            public Item build() {
                return new Item(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDBInstanceSwitchLogResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDBInstanceSwitchLogResponseBody</p>
     */
    public static class Items extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Item")
        private java.util.List<Item> item;

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
        public java.util.List<Item> getItem() {
            return this.item;
        }

        public static final class Builder {
            private java.util.List<Item> item; 

            private Builder() {
            } 

            private Builder(Items model) {
                this.item = model.item;
            } 

            /**
             * Item.
             */
            public Builder item(java.util.List<Item> item) {
                this.item = item;
                return this;
            }

            public Items build() {
                return new Items(this);
            } 

        } 

    }
}
