// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudauth20190307.models;

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
 * {@link DescribeDeviceInfoResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDeviceInfoResponseBody</p>
 */
public class DescribeDeviceInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("DeviceInfoList")
    private DeviceInfoList deviceInfoList;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Integer totalCount;

    private DescribeDeviceInfoResponseBody(Builder builder) {
        this.currentPage = builder.currentPage;
        this.deviceInfoList = builder.deviceInfoList;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDeviceInfoResponseBody create() {
        return builder().build();
    }

    /**
     * @return currentPage
     */
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    /**
     * @return deviceInfoList
     */
    public DeviceInfoList getDeviceInfoList() {
        return this.deviceInfoList;
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
        private Integer currentPage; 
        private DeviceInfoList deviceInfoList; 
        private Integer pageSize; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * CurrentPage.
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * DeviceInfoList.
         */
        public Builder deviceInfoList(DeviceInfoList deviceInfoList) {
            this.deviceInfoList = deviceInfoList;
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

        public DescribeDeviceInfoResponseBody build() {
            return new DescribeDeviceInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeDeviceInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDeviceInfoResponseBody</p>
     */
    public static class DeviceInfo extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BeginDay")
        private String beginDay;

        @com.aliyun.core.annotation.NameInMap("BizType")
        private String bizType;

        @com.aliyun.core.annotation.NameInMap("DeviceId")
        private String deviceId;

        @com.aliyun.core.annotation.NameInMap("ExpiredDay")
        private String expiredDay;

        @com.aliyun.core.annotation.NameInMap("UserDeviceId")
        private String userDeviceId;

        private DeviceInfo(Builder builder) {
            this.beginDay = builder.beginDay;
            this.bizType = builder.bizType;
            this.deviceId = builder.deviceId;
            this.expiredDay = builder.expiredDay;
            this.userDeviceId = builder.userDeviceId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeviceInfo create() {
            return builder().build();
        }

        /**
         * @return beginDay
         */
        public String getBeginDay() {
            return this.beginDay;
        }

        /**
         * @return bizType
         */
        public String getBizType() {
            return this.bizType;
        }

        /**
         * @return deviceId
         */
        public String getDeviceId() {
            return this.deviceId;
        }

        /**
         * @return expiredDay
         */
        public String getExpiredDay() {
            return this.expiredDay;
        }

        /**
         * @return userDeviceId
         */
        public String getUserDeviceId() {
            return this.userDeviceId;
        }

        public static final class Builder {
            private String beginDay; 
            private String bizType; 
            private String deviceId; 
            private String expiredDay; 
            private String userDeviceId; 

            /**
             * BeginDay.
             */
            public Builder beginDay(String beginDay) {
                this.beginDay = beginDay;
                return this;
            }

            /**
             * BizType.
             */
            public Builder bizType(String bizType) {
                this.bizType = bizType;
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
             * ExpiredDay.
             */
            public Builder expiredDay(String expiredDay) {
                this.expiredDay = expiredDay;
                return this;
            }

            /**
             * UserDeviceId.
             */
            public Builder userDeviceId(String userDeviceId) {
                this.userDeviceId = userDeviceId;
                return this;
            }

            public DeviceInfo build() {
                return new DeviceInfo(this);
            } 

        } 

    }
    /**
     * 
     * {@link DescribeDeviceInfoResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeDeviceInfoResponseBody</p>
     */
    public static class DeviceInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DeviceInfo")
        private java.util.List<DeviceInfo> deviceInfo;

        private DeviceInfoList(Builder builder) {
            this.deviceInfo = builder.deviceInfo;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeviceInfoList create() {
            return builder().build();
        }

        /**
         * @return deviceInfo
         */
        public java.util.List<DeviceInfo> getDeviceInfo() {
            return this.deviceInfo;
        }

        public static final class Builder {
            private java.util.List<DeviceInfo> deviceInfo; 

            /**
             * DeviceInfo.
             */
            public Builder deviceInfo(java.util.List<DeviceInfo> deviceInfo) {
                this.deviceInfo = deviceInfo;
                return this;
            }

            public DeviceInfoList build() {
                return new DeviceInfoList(this);
            } 

        } 

    }
}
