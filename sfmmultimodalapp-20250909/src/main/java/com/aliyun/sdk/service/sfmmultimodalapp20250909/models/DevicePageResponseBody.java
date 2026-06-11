// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sfmmultimodalapp20250909.models;

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
 * {@link DevicePageResponseBody} extends {@link TeaModel}
 *
 * <p>DevicePageResponseBody</p>
 */
public class DevicePageResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DeviceList")
    private java.util.List<DeviceList> deviceList;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DevicePageResponseBody(Builder builder) {
        this.deviceList = builder.deviceList;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DevicePageResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return deviceList
     */
    public java.util.List<DeviceList> getDeviceList() {
        return this.deviceList;
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
        private java.util.List<DeviceList> deviceList; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        private Builder() {
        } 

        private Builder(DevicePageResponseBody model) {
            this.deviceList = model.deviceList;
            this.pageNumber = model.pageNumber;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.totalCount = model.totalCount;
        } 

        /**
         * DeviceList.
         */
        public Builder deviceList(java.util.List<DeviceList> deviceList) {
            this.deviceList = deviceList;
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
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>31033EC0-6968-5610-8328-708B59508E5A</p>
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

        public DevicePageResponseBody build() {
            return new DevicePageResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DevicePageResponseBody} extends {@link TeaModel}
     *
     * <p>DevicePageResponseBody</p>
     */
    public static class DeviceList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ActiveTime")
        private String activeTime;

        @com.aliyun.core.annotation.NameInMap("AliyunUid")
        private String aliyunUid;

        @com.aliyun.core.annotation.NameInMap("AppId")
        private String appId;

        @com.aliyun.core.annotation.NameInMap("DailyCount")
        private Integer dailyCount;

        @com.aliyun.core.annotation.NameInMap("DeviceName")
        private String deviceName;

        @com.aliyun.core.annotation.NameInMap("OrderType")
        private Integer orderType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("SubAliyunUid")
        private String subAliyunUid;

        @com.aliyun.core.annotation.NameInMap("TotalCount")
        private Integer totalCount;

        @com.aliyun.core.annotation.NameInMap("UserActiveTime")
        private String userActiveTime;

        @com.aliyun.core.annotation.NameInMap("WorkspaceId")
        private String workspaceId;

        private DeviceList(Builder builder) {
            this.activeTime = builder.activeTime;
            this.aliyunUid = builder.aliyunUid;
            this.appId = builder.appId;
            this.dailyCount = builder.dailyCount;
            this.deviceName = builder.deviceName;
            this.orderType = builder.orderType;
            this.status = builder.status;
            this.subAliyunUid = builder.subAliyunUid;
            this.totalCount = builder.totalCount;
            this.userActiveTime = builder.userActiveTime;
            this.workspaceId = builder.workspaceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeviceList create() {
            return builder().build();
        }

        /**
         * @return activeTime
         */
        public String getActiveTime() {
            return this.activeTime;
        }

        /**
         * @return aliyunUid
         */
        public String getAliyunUid() {
            return this.aliyunUid;
        }

        /**
         * @return appId
         */
        public String getAppId() {
            return this.appId;
        }

        /**
         * @return dailyCount
         */
        public Integer getDailyCount() {
            return this.dailyCount;
        }

        /**
         * @return deviceName
         */
        public String getDeviceName() {
            return this.deviceName;
        }

        /**
         * @return orderType
         */
        public Integer getOrderType() {
            return this.orderType;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return subAliyunUid
         */
        public String getSubAliyunUid() {
            return this.subAliyunUid;
        }

        /**
         * @return totalCount
         */
        public Integer getTotalCount() {
            return this.totalCount;
        }

        /**
         * @return userActiveTime
         */
        public String getUserActiveTime() {
            return this.userActiveTime;
        }

        /**
         * @return workspaceId
         */
        public String getWorkspaceId() {
            return this.workspaceId;
        }

        public static final class Builder {
            private String activeTime; 
            private String aliyunUid; 
            private String appId; 
            private Integer dailyCount; 
            private String deviceName; 
            private Integer orderType; 
            private Integer status; 
            private String subAliyunUid; 
            private Integer totalCount; 
            private String userActiveTime; 
            private String workspaceId; 

            private Builder() {
            } 

            private Builder(DeviceList model) {
                this.activeTime = model.activeTime;
                this.aliyunUid = model.aliyunUid;
                this.appId = model.appId;
                this.dailyCount = model.dailyCount;
                this.deviceName = model.deviceName;
                this.orderType = model.orderType;
                this.status = model.status;
                this.subAliyunUid = model.subAliyunUid;
                this.totalCount = model.totalCount;
                this.userActiveTime = model.userActiveTime;
                this.workspaceId = model.workspaceId;
            } 

            /**
             * ActiveTime.
             */
            public Builder activeTime(String activeTime) {
                this.activeTime = activeTime;
                return this;
            }

            /**
             * AliyunUid.
             */
            public Builder aliyunUid(String aliyunUid) {
                this.aliyunUid = aliyunUid;
                return this;
            }

            /**
             * AppId.
             */
            public Builder appId(String appId) {
                this.appId = appId;
                return this;
            }

            /**
             * DailyCount.
             */
            public Builder dailyCount(Integer dailyCount) {
                this.dailyCount = dailyCount;
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
             * OrderType.
             */
            public Builder orderType(Integer orderType) {
                this.orderType = orderType;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * SubAliyunUid.
             */
            public Builder subAliyunUid(String subAliyunUid) {
                this.subAliyunUid = subAliyunUid;
                return this;
            }

            /**
             * TotalCount.
             */
            public Builder totalCount(Integer totalCount) {
                this.totalCount = totalCount;
                return this;
            }

            /**
             * UserActiveTime.
             */
            public Builder userActiveTime(String userActiveTime) {
                this.userActiveTime = userActiveTime;
                return this;
            }

            /**
             * WorkspaceId.
             */
            public Builder workspaceId(String workspaceId) {
                this.workspaceId = workspaceId;
                return this;
            }

            public DeviceList build() {
                return new DeviceList(this);
            } 

        } 

    }
}
