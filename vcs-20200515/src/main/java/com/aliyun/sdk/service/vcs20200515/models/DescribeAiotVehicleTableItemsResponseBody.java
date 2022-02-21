// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeAiotVehicleTableItemsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeAiotVehicleTableItemsResponseBody</p>
 */
public class DescribeAiotVehicleTableItemsResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("VehicleTableItems")
    private VehicleTableItems vehicleTableItems;

    private DescribeAiotVehicleTableItemsResponseBody(Builder builder) {
        this.code = builder.code;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.vehicleTableItems = builder.vehicleTableItems;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeAiotVehicleTableItemsResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
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
     * @return vehicleTableItems
     */
    public VehicleTableItems getVehicleTableItems() {
        return this.vehicleTableItems;
    }

    public static final class Builder {
        private String code; 
        private String message; 
        private String requestId; 
        private VehicleTableItems vehicleTableItems; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
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
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * VehicleTableItems.
         */
        public Builder vehicleTableItems(VehicleTableItems vehicleTableItems) {
            this.vehicleTableItems = vehicleTableItems;
            return this;
        }

        public DescribeAiotVehicleTableItemsResponseBody build() {
            return new DescribeAiotVehicleTableItemsResponseBody(this);
        } 

    } 

    public static class VehicleTableItemList extends TeaModel {
        @NameInMap("BeginTime")
        private String beginTime;

        @NameInMap("EndTime")
        private String endTime;

        @NameInMap("OwnerName")
        private String ownerName;

        @NameInMap("PhoneNo")
        private String phoneNo;

        @NameInMap("PlateNo")
        private String plateNo;

        @NameInMap("Remarks")
        private String remarks;

        @NameInMap("VehicleTableId")
        private String vehicleTableId;

        @NameInMap("VehicleTableItemId")
        private String vehicleTableItemId;

        private VehicleTableItemList(Builder builder) {
            this.beginTime = builder.beginTime;
            this.endTime = builder.endTime;
            this.ownerName = builder.ownerName;
            this.phoneNo = builder.phoneNo;
            this.plateNo = builder.plateNo;
            this.remarks = builder.remarks;
            this.vehicleTableId = builder.vehicleTableId;
            this.vehicleTableItemId = builder.vehicleTableItemId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VehicleTableItemList create() {
            return builder().build();
        }

        /**
         * @return beginTime
         */
        public String getBeginTime() {
            return this.beginTime;
        }

        /**
         * @return endTime
         */
        public String getEndTime() {
            return this.endTime;
        }

        /**
         * @return ownerName
         */
        public String getOwnerName() {
            return this.ownerName;
        }

        /**
         * @return phoneNo
         */
        public String getPhoneNo() {
            return this.phoneNo;
        }

        /**
         * @return plateNo
         */
        public String getPlateNo() {
            return this.plateNo;
        }

        /**
         * @return remarks
         */
        public String getRemarks() {
            return this.remarks;
        }

        /**
         * @return vehicleTableId
         */
        public String getVehicleTableId() {
            return this.vehicleTableId;
        }

        /**
         * @return vehicleTableItemId
         */
        public String getVehicleTableItemId() {
            return this.vehicleTableItemId;
        }

        public static final class Builder {
            private String beginTime; 
            private String endTime; 
            private String ownerName; 
            private String phoneNo; 
            private String plateNo; 
            private String remarks; 
            private String vehicleTableId; 
            private String vehicleTableItemId; 

            /**
             * BeginTime.
             */
            public Builder beginTime(String beginTime) {
                this.beginTime = beginTime;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(String endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * OwnerName.
             */
            public Builder ownerName(String ownerName) {
                this.ownerName = ownerName;
                return this;
            }

            /**
             * PhoneNo.
             */
            public Builder phoneNo(String phoneNo) {
                this.phoneNo = phoneNo;
                return this;
            }

            /**
             * PlateNo.
             */
            public Builder plateNo(String plateNo) {
                this.plateNo = plateNo;
                return this;
            }

            /**
             * Remarks.
             */
            public Builder remarks(String remarks) {
                this.remarks = remarks;
                return this;
            }

            /**
             * VehicleTableId.
             */
            public Builder vehicleTableId(String vehicleTableId) {
                this.vehicleTableId = vehicleTableId;
                return this;
            }

            /**
             * VehicleTableItemId.
             */
            public Builder vehicleTableItemId(String vehicleTableItemId) {
                this.vehicleTableItemId = vehicleTableItemId;
                return this;
            }

            public VehicleTableItemList build() {
                return new VehicleTableItemList(this);
            } 

        } 

    }
    public static class VehicleTableItems extends TeaModel {
        @NameInMap("PageNum")
        private Long pageNum;

        @NameInMap("PageSize")
        private Long pageSize;

        @NameInMap("TotalNum")
        private Long totalNum;

        @NameInMap("VehicleTableItemList")
        private java.util.List < VehicleTableItemList> vehicleTableItemList;

        private VehicleTableItems(Builder builder) {
            this.pageNum = builder.pageNum;
            this.pageSize = builder.pageSize;
            this.totalNum = builder.totalNum;
            this.vehicleTableItemList = builder.vehicleTableItemList;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VehicleTableItems create() {
            return builder().build();
        }

        /**
         * @return pageNum
         */
        public Long getPageNum() {
            return this.pageNum;
        }

        /**
         * @return pageSize
         */
        public Long getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalNum
         */
        public Long getTotalNum() {
            return this.totalNum;
        }

        /**
         * @return vehicleTableItemList
         */
        public java.util.List < VehicleTableItemList> getVehicleTableItemList() {
            return this.vehicleTableItemList;
        }

        public static final class Builder {
            private Long pageNum; 
            private Long pageSize; 
            private Long totalNum; 
            private java.util.List < VehicleTableItemList> vehicleTableItemList; 

            /**
             * PageNum.
             */
            public Builder pageNum(Long pageNum) {
                this.pageNum = pageNum;
                return this;
            }

            /**
             * PageSize.
             */
            public Builder pageSize(Long pageSize) {
                this.pageSize = pageSize;
                return this;
            }

            /**
             * TotalNum.
             */
            public Builder totalNum(Long totalNum) {
                this.totalNum = totalNum;
                return this;
            }

            /**
             * VehicleTableItemList.
             */
            public Builder vehicleTableItemList(java.util.List < VehicleTableItemList> vehicleTableItemList) {
                this.vehicleTableItemList = vehicleTableItemList;
                return this;
            }

            public VehicleTableItems build() {
                return new VehicleTableItems(this);
            } 

        } 

    }
}
