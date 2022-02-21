// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListHostDevicesResponseBody} extends {@link TeaModel}
 *
 * <p>ListHostDevicesResponseBody</p>
 */
public class ListHostDevicesResponseBody extends TeaModel {
    @NameInMap("HostDevices")
    @Validation(required = true)
    private HostDevices hostDevices;

    @NameInMap("RequestId")
    private String requestId;

    private ListHostDevicesResponseBody(Builder builder) {
        this.hostDevices = builder.hostDevices;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListHostDevicesResponseBody create() {
        return builder().build();
    }

    /**
     * @return hostDevices
     */
    public HostDevices getHostDevices() {
        return this.hostDevices;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private HostDevices hostDevices; 
        private String requestId; 

        /**
         * 表示当前调用返回读取到的位置，空代表数据已经读取完毕
         */
        public Builder hostDevices(HostDevices hostDevices) {
            this.hostDevices = hostDevices;
            return this;
        }

        /**
         * 请求ID
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListHostDevicesResponseBody build() {
            return new ListHostDevicesResponseBody(this);
        } 

    } 

    public static class List extends TeaModel {
        @NameInMap("ActivateTime")
        private Long activateTime;

        @NameInMap("DeviceId")
        private String deviceId;

        @NameInMap("DeviceModel")
        private String deviceModel;

        @NameInMap("DeviceName")
        private String deviceName;

        @NameInMap("Ip")
        private String ip;

        @NameInMap("SerialNumber")
        private String serialNumber;

        @NameInMap("Status")
        private Long status;

        private List(Builder builder) {
            this.activateTime = builder.activateTime;
            this.deviceId = builder.deviceId;
            this.deviceModel = builder.deviceModel;
            this.deviceName = builder.deviceName;
            this.ip = builder.ip;
            this.serialNumber = builder.serialNumber;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static List create() {
            return builder().build();
        }

        /**
         * @return activateTime
         */
        public Long getActivateTime() {
            return this.activateTime;
        }

        /**
         * @return deviceId
         */
        public String getDeviceId() {
            return this.deviceId;
        }

        /**
         * @return deviceModel
         */
        public String getDeviceModel() {
            return this.deviceModel;
        }

        /**
         * @return deviceName
         */
        public String getDeviceName() {
            return this.deviceName;
        }

        /**
         * @return ip
         */
        public String getIp() {
            return this.ip;
        }

        /**
         * @return serialNumber
         */
        public String getSerialNumber() {
            return this.serialNumber;
        }

        /**
         * @return status
         */
        public Long getStatus() {
            return this.status;
        }

        public static final class Builder {
            private Long activateTime; 
            private String deviceId; 
            private String deviceModel; 
            private String deviceName; 
            private String ip; 
            private String serialNumber; 
            private Long status; 

            /**
             * ActivateTime.
             */
            public Builder activateTime(Long activateTime) {
                this.activateTime = activateTime;
                return this;
            }

            /**
             * DeviceId.
             */
            public Builder deviceId(String deviceId) {
                this.deviceId = deviceId;
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
             * DeviceName.
             */
            public Builder deviceName(String deviceName) {
                this.deviceName = deviceName;
                return this;
            }

            /**
             * Ip.
             */
            public Builder ip(String ip) {
                this.ip = ip;
                return this;
            }

            /**
             * SerialNumber.
             */
            public Builder serialNumber(String serialNumber) {
                this.serialNumber = serialNumber;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Long status) {
                this.status = status;
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
    public static class HostDevices extends TeaModel {
        @NameInMap("List")
        private java.util.List < List> list;

        @NameInMap("Pagination")
        private Pagination pagination;

        private HostDevices(Builder builder) {
            this.list = builder.list;
            this.pagination = builder.pagination;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static HostDevices create() {
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

            public HostDevices build() {
                return new HostDevices(this);
            } 

        } 

    }
}
