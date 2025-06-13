// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.polardb20170801.models;

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
 * {@link DescribeHALogsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeHALogsResponseBody</p>
 */
public class DescribeHALogsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DBInstanceName")
    private String DBInstanceName;

    @com.aliyun.core.annotation.NameInMap("DBInstanceType")
    private String DBInstanceType;

    @com.aliyun.core.annotation.NameInMap("HaLogItems")
    private java.util.List<HaLogItems> haLogItems;

    @com.aliyun.core.annotation.NameInMap("HaStatus")
    private Integer haStatus;

    @com.aliyun.core.annotation.NameInMap("ItemsNumbers")
    private Integer itemsNumbers;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalRecords")
    private Integer totalRecords;

    private DescribeHALogsResponseBody(Builder builder) {
        this.DBInstanceName = builder.DBInstanceName;
        this.DBInstanceType = builder.DBInstanceType;
        this.haLogItems = builder.haLogItems;
        this.haStatus = builder.haStatus;
        this.itemsNumbers = builder.itemsNumbers;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalRecords = builder.totalRecords;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeHALogsResponseBody create() {
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
     * @return DBInstanceType
     */
    public String getDBInstanceType() {
        return this.DBInstanceType;
    }

    /**
     * @return haLogItems
     */
    public java.util.List<HaLogItems> getHaLogItems() {
        return this.haLogItems;
    }

    /**
     * @return haStatus
     */
    public Integer getHaStatus() {
        return this.haStatus;
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
     * @return totalRecords
     */
    public Integer getTotalRecords() {
        return this.totalRecords;
    }

    public static final class Builder {
        private String DBInstanceName; 
        private String DBInstanceType; 
        private java.util.List<HaLogItems> haLogItems; 
        private Integer haStatus; 
        private Integer itemsNumbers; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalRecords; 

        private Builder() {
        } 

        private Builder(DescribeHALogsResponseBody model) {
            this.DBInstanceName = model.DBInstanceName;
            this.DBInstanceType = model.DBInstanceType;
            this.haLogItems = model.haLogItems;
            this.haStatus = model.haStatus;
            this.itemsNumbers = model.itemsNumbers;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalRecords = model.totalRecords;
        } 

        /**
         * DBInstanceName.
         */
        public Builder DBInstanceName(String DBInstanceName) {
            this.DBInstanceName = DBInstanceName;
            return this;
        }

        /**
         * DBInstanceType.
         */
        public Builder DBInstanceType(String DBInstanceType) {
            this.DBInstanceType = DBInstanceType;
            return this;
        }

        /**
         * <p>The failover logs.</p>
         */
        public Builder haLogItems(java.util.List<HaLogItems> haLogItems) {
            this.haLogItems = haLogItems;
            return this;
        }

        /**
         * HaStatus.
         */
        public Builder haStatus(Integer haStatus) {
            this.haStatus = haStatus;
            return this;
        }

        /**
         * ItemsNumbers.
         */
        public Builder itemsNumbers(Integer itemsNumbers) {
            this.itemsNumbers = itemsNumbers;
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
         * TotalRecords.
         */
        public Builder totalRecords(Integer totalRecords) {
            this.totalRecords = totalRecords;
            return this;
        }

        public DescribeHALogsResponseBody build() {
            return new DescribeHALogsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeHALogsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeHALogsResponseBody</p>
     */
    public static class HaLogItems extends TeaModel {
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

        private HaLogItems(Builder builder) {
            this.switchCauseCode = builder.switchCauseCode;
            this.switchCauseDetail = builder.switchCauseDetail;
            this.switchFinishTime = builder.switchFinishTime;
            this.switchId = builder.switchId;
            this.switchStartTime = builder.switchStartTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HaLogItems create() {
            return builder().build();
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

        public static final class Builder {
            private String switchCauseCode; 
            private String switchCauseDetail; 
            private String switchFinishTime; 
            private String switchId; 
            private String switchStartTime; 

            private Builder() {
            } 

            private Builder(HaLogItems model) {
                this.switchCauseCode = model.switchCauseCode;
                this.switchCauseDetail = model.switchCauseDetail;
                this.switchFinishTime = model.switchFinishTime;
                this.switchId = model.switchId;
                this.switchStartTime = model.switchStartTime;
            } 

            /**
             * <p>The reason code of the failover.</p>
             * 
             * <strong>example:</strong>
             * <p>Platform.Ha.AuroraService.ManualOperations</p>
             */
            public Builder switchCauseCode(String switchCauseCode) {
                this.switchCauseCode = switchCauseCode;
                return this;
            }

            /**
             * <p>The reason of the failover.</p>
             * 
             * <strong>example:</strong>
             * <p>Platform.Ha.ManuallyTriggered</p>
             */
            public Builder switchCauseDetail(String switchCauseDetail) {
                this.switchCauseDetail = switchCauseDetail;
                return this;
            }

            /**
             * <p>The time when the failover ended.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-05-20T03:09:56Z</p>
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
             * <p>The time when the failover started.</p>
             * 
             * <strong>example:</strong>
             * <p>2025-05-20T03:09:45Z</p>
             */
            public Builder switchStartTime(String switchStartTime) {
                this.switchStartTime = switchStartTime;
                return this;
            }

            public HaLogItems build() {
                return new HaLogItems(this);
            } 

        } 

    }
}
