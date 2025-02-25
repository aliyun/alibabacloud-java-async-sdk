// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cd2021127.models;

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
 * {@link QueryFaultDeviceListResponseBody} extends {@link TeaModel}
 *
 * <p>QueryFaultDeviceListResponseBody</p>
 */
public class QueryFaultDeviceListResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("TotalCount")
    private Long totalCount;

    private QueryFaultDeviceListResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.success = builder.success;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryFaultDeviceListResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return totalCount
     */
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private String code; 
        private java.util.List<Data> data; 
        private Integer httpStatusCode; 
        private String message; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String requestId; 
        private Boolean success; 
        private Long totalCount; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public QueryFaultDeviceListResponseBody build() {
            return new QueryFaultDeviceListResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryFaultDeviceListResponseBody} extends {@link TeaModel}
     *
     * <p>QueryFaultDeviceListResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("BelongShop")
        private String belongShop;

        @com.aliyun.core.annotation.NameInMap("DailyOnlineTime")
        private String dailyOnlineTime;

        @com.aliyun.core.annotation.NameInMap("DeviceName")
        private String deviceName;

        @com.aliyun.core.annotation.NameInMap("FaultNum")
        private Integer faultNum;

        @com.aliyun.core.annotation.NameInMap("LastOnlineTime")
        private String lastOnlineTime;

        @com.aliyun.core.annotation.NameInMap("Mac")
        private String mac;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("TicketNum")
        private String ticketNum;

        @com.aliyun.core.annotation.NameInMap("Version")
        private String version;

        private Data(Builder builder) {
            this.belongShop = builder.belongShop;
            this.dailyOnlineTime = builder.dailyOnlineTime;
            this.deviceName = builder.deviceName;
            this.faultNum = builder.faultNum;
            this.lastOnlineTime = builder.lastOnlineTime;
            this.mac = builder.mac;
            this.status = builder.status;
            this.ticketNum = builder.ticketNum;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return belongShop
         */
        public String getBelongShop() {
            return this.belongShop;
        }

        /**
         * @return dailyOnlineTime
         */
        public String getDailyOnlineTime() {
            return this.dailyOnlineTime;
        }

        /**
         * @return deviceName
         */
        public String getDeviceName() {
            return this.deviceName;
        }

        /**
         * @return faultNum
         */
        public Integer getFaultNum() {
            return this.faultNum;
        }

        /**
         * @return lastOnlineTime
         */
        public String getLastOnlineTime() {
            return this.lastOnlineTime;
        }

        /**
         * @return mac
         */
        public String getMac() {
            return this.mac;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return ticketNum
         */
        public String getTicketNum() {
            return this.ticketNum;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String belongShop; 
            private String dailyOnlineTime; 
            private String deviceName; 
            private Integer faultNum; 
            private String lastOnlineTime; 
            private String mac; 
            private String status; 
            private String ticketNum; 
            private String version; 

            /**
             * BelongShop.
             */
            public Builder belongShop(String belongShop) {
                this.belongShop = belongShop;
                return this;
            }

            /**
             * DailyOnlineTime.
             */
            public Builder dailyOnlineTime(String dailyOnlineTime) {
                this.dailyOnlineTime = dailyOnlineTime;
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
             * FaultNum.
             */
            public Builder faultNum(Integer faultNum) {
                this.faultNum = faultNum;
                return this;
            }

            /**
             * LastOnlineTime.
             */
            public Builder lastOnlineTime(String lastOnlineTime) {
                this.lastOnlineTime = lastOnlineTime;
                return this;
            }

            /**
             * Mac.
             */
            public Builder mac(String mac) {
                this.mac = mac;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * TicketNum.
             */
            public Builder ticketNum(String ticketNum) {
                this.ticketNum = ticketNum;
                return this;
            }

            /**
             * Version.
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
