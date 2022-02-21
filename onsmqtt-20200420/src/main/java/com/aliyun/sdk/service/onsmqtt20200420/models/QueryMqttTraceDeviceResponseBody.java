// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.onsmqtt20200420.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link QueryMqttTraceDeviceResponseBody} extends {@link TeaModel}
 *
 * <p>QueryMqttTraceDeviceResponseBody</p>
 */
public class QueryMqttTraceDeviceResponseBody extends TeaModel {
    @NameInMap("CurrentPage")
    private Integer currentPage;

    @NameInMap("DeviceInfoList")
    private java.util.List < DeviceInfoList> deviceInfoList;

    @NameInMap("PageSize")
    private Integer pageSize;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Total")
    private Long total;

    private QueryMqttTraceDeviceResponseBody(Builder builder) {
        this.currentPage = builder.currentPage;
        this.deviceInfoList = builder.deviceInfoList;
        this.pageSize = builder.pageSize;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryMqttTraceDeviceResponseBody create() {
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
    public java.util.List < DeviceInfoList> getDeviceInfoList() {
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
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private Integer currentPage; 
        private java.util.List < DeviceInfoList> deviceInfoList; 
        private Integer pageSize; 
        private String requestId; 
        private Long total; 

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
        public Builder deviceInfoList(java.util.List < DeviceInfoList> deviceInfoList) {
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
         * Total.
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public QueryMqttTraceDeviceResponseBody build() {
            return new QueryMqttTraceDeviceResponseBody(this);
        } 

    } 

    public static class DeviceInfoList extends TeaModel {
        @NameInMap("Action")
        private String action;

        @NameInMap("ActionCode")
        private String actionCode;

        @NameInMap("ActionInfo")
        private String actionInfo;

        @NameInMap("ChannelId")
        private String channelId;

        @NameInMap("Time")
        private String time;

        private DeviceInfoList(Builder builder) {
            this.action = builder.action;
            this.actionCode = builder.actionCode;
            this.actionInfo = builder.actionInfo;
            this.channelId = builder.channelId;
            this.time = builder.time;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeviceInfoList create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return actionCode
         */
        public String getActionCode() {
            return this.actionCode;
        }

        /**
         * @return actionInfo
         */
        public String getActionInfo() {
            return this.actionInfo;
        }

        /**
         * @return channelId
         */
        public String getChannelId() {
            return this.channelId;
        }

        /**
         * @return time
         */
        public String getTime() {
            return this.time;
        }

        public static final class Builder {
            private String action; 
            private String actionCode; 
            private String actionInfo; 
            private String channelId; 
            private String time; 

            /**
             * Action.
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * ActionCode.
             */
            public Builder actionCode(String actionCode) {
                this.actionCode = actionCode;
                return this;
            }

            /**
             * ActionInfo.
             */
            public Builder actionInfo(String actionInfo) {
                this.actionInfo = actionInfo;
                return this;
            }

            /**
             * ChannelId.
             */
            public Builder channelId(String channelId) {
                this.channelId = channelId;
                return this;
            }

            /**
             * Time.
             */
            public Builder time(String time) {
                this.time = time;
                return this;
            }

            public DeviceInfoList build() {
                return new DeviceInfoList(this);
            } 

        } 

    }
}
