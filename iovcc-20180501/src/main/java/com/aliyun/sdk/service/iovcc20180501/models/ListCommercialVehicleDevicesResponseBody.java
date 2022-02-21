// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCommercialVehicleDevicesResponseBody} extends {@link TeaModel}
 *
 * <p>ListCommercialVehicleDevicesResponseBody</p>
 */
public class ListCommercialVehicleDevicesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("VehicleDevices")
    @Validation(required = true)
    private VehicleDevices vehicleDevices;

    private ListCommercialVehicleDevicesResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.vehicleDevices = builder.vehicleDevices;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListCommercialVehicleDevicesResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return vehicleDevices
     */
    public VehicleDevices getVehicleDevices() {
        return this.vehicleDevices;
    }

    public static final class Builder {
        private String requestId; 
        private VehicleDevices vehicleDevices; 

        /**
         * 请求ID
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 表示当前调用返回读取到的位置，空代表数据已经读取完毕
         */
        public Builder vehicleDevices(VehicleDevices vehicleDevices) {
            this.vehicleDevices = vehicleDevices;
            return this;
        }

        public ListCommercialVehicleDevicesResponseBody build() {
            return new ListCommercialVehicleDevicesResponseBody(this);
        } 

    } 

    public static class List extends TeaModel {
        @NameInMap("ClientId")
        private Long clientId;

        @NameInMap("CreateTime")
        private Long createTime;

        @NameInMap("DeviceModel")
        private String deviceModel;

        @NameInMap("HardwareId")
        private String hardwareId;

        @NameInMap("ModifiedTime")
        private Long modifiedTime;

        @NameInMap("OnlineStatus")
        private Long onlineStatus;

        @NameInMap("PlateNumber")
        private String plateNumber;

        private List(Builder builder) {
            this.clientId = builder.clientId;
            this.createTime = builder.createTime;
            this.deviceModel = builder.deviceModel;
            this.hardwareId = builder.hardwareId;
            this.modifiedTime = builder.modifiedTime;
            this.onlineStatus = builder.onlineStatus;
            this.plateNumber = builder.plateNumber;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return clientId
         */
        public Long getClientId() {
            return this.clientId;
        }

        /**
         * @return createTime
         */
        public Long getCreateTime() {
            return this.createTime;
        }

        /**
         * @return deviceModel
         */
        public String getDeviceModel() {
            return this.deviceModel;
        }

        /**
         * @return hardwareId
         */
        public String getHardwareId() {
            return this.hardwareId;
        }

        /**
         * @return modifiedTime
         */
        public Long getModifiedTime() {
            return this.modifiedTime;
        }

        /**
         * @return onlineStatus
         */
        public Long getOnlineStatus() {
            return this.onlineStatus;
        }

        /**
         * @return plateNumber
         */
        public String getPlateNumber() {
            return this.plateNumber;
        }

        public static final class Builder {
            private Long clientId; 
            private Long createTime; 
            private String deviceModel; 
            private String hardwareId; 
            private Long modifiedTime; 
            private Long onlineStatus; 
            private String plateNumber; 

            /**
             * ClientId.
             */
            public Builder clientId(Long clientId) {
                this.clientId = clientId;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(Long createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DeviceModel.
             */
            public Builder deviceModel(String deviceModel) {
                this.deviceModel = deviceModel;
                return this;
            }

            /**
             * HardwareId.
             */
            public Builder hardwareId(String hardwareId) {
                this.hardwareId = hardwareId;
                return this;
            }

            /**
             * ModifiedTime.
             */
            public Builder modifiedTime(Long modifiedTime) {
                this.modifiedTime = modifiedTime;
                return this;
            }

            /**
             * OnlineStatus.
             */
            public Builder onlineStatus(Long onlineStatus) {
                this.onlineStatus = onlineStatus;
                return this;
            }

            /**
             * PlateNumber.
             */
            public Builder plateNumber(String plateNumber) {
                this.plateNumber = plateNumber;
                return this;
            }

            public List build() {
                return new List(this);
            } 

        } 

    }
    public static class Pagination extends TeaModel {
        @NameInMap("PageIndex")
        private Long pageIndex;

        @NameInMap("PageSize")
        private Long pageSize;

        @NameInMap("TotalCount")
        private Long totalCount;

        @NameInMap("TotalPageCount")
        private Long totalPageCount;

        private Pagination(Builder builder) {
            this.pageIndex = builder.pageIndex;
            this.pageSize = builder.pageSize;
            this.totalCount = builder.totalCount;
            this.totalPageCount = builder.totalPageCount;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Pagination create() {
            return builder().build();
        }

        /**
         * @return pageIndex
         */
        public Long getPageIndex() {
            return this.pageIndex;
        }

        /**
         * @return pageSize
         */
        public Long getPageSize() {
            return this.pageSize;
        }

        /**
         * @return totalCount
         */
        public Long getTotalCount() {
            return this.totalCount;
        }

        /**
         * @return totalPageCount
         */
        public Long getTotalPageCount() {
            return this.totalPageCount;
        }

        public static final class Builder {
            private Long pageIndex; 
            private Long pageSize; 
            private Long totalCount; 
            private Long totalPageCount; 

            /**
             * PageIndex.
             */
            public Builder pageIndex(Long pageIndex) {
                this.pageIndex = pageIndex;
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
             * TotalCount.
             */
            public Builder totalCount(Long totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * TotalPageCount.
             */
            public Builder totalPageCount(Long totalPageCount) {
                this.totalPageCount = totalPageCount;
                return this;
            }

            public Pagination build() {
                return new Pagination(this);
            } 

        } 

    }
    public static class VehicleDevices extends TeaModel {
        @NameInMap("List")
        private java.util.List < List> list;

        @NameInMap("Pagination")
        private Pagination pagination;

        private VehicleDevices(Builder builder) {
            this.list = builder.list;
            this.pagination = builder.pagination;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static VehicleDevices create() {
            return builder().build();
        }

        /**
         * @return list
         */
        public java.util.List < List> getList() {
            return this.list;
        }

        /**
         * @return pagination
         */
        public Pagination getPagination() {
            return this.pagination;
        }

        public static final class Builder {
            private java.util.List < List> list; 
            private Pagination pagination; 

            /**
             * List.
             */
            public Builder list(java.util.List < List> list) {
                this.list = list;
                return this;
            }

            /**
             * Pagination.
             */
            public Builder pagination(Pagination pagination) {
                this.pagination = pagination;
                return this;
            }

            public VehicleDevices build() {
                return new VehicleDevices(this);
            } 

        } 

    }
}
