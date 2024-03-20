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
         * The page number of the returned page.
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * The details of the action on the device.
         */
        public Builder deviceInfoList(java.util.List < DeviceInfoList> deviceInfoList) {
            this.deviceInfoList = deviceInfoList;
            return this;
        }

        /**
         * The number of entries returned per page.
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * The request ID. You can use the ID to troubleshoot issues. This parameter is a common parameter.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The total number of returned actions on the device.
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
             * The action on the device. Valid values:
             * <p>
             * 
             * *   **connect**: The ApsaraMQ for MQTT client requests a connection to the ApsaraMQ for MQTT broker.
             * *   **close**: The TCP connection is closed.
             * *   **disconnect**: The ApsaraMQ for MQTT client requests a disconnection from the ApsaraMQ for MQTT broker.
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * The returned code for the action on the device. Valid values:
             * <p>
             * 
             * *   **mqtt.trace.action.connect**: This value is returned if the value of Action is **connect**.
             * *   **mqtt.trace.action.close**: This value is returned if the value of Action is **close**.
             * *   **mqtt.trace.action.disconnect**: This value is returned if the value of Action is **disconnect**.
             */
            public Builder actionCode(String actionCode) {
                this.actionCode = actionCode;
                return this;
            }

            /**
             * The returned information for the action on the device. Valid values:
             * <p>
             * 
             * *   **accepted**: The ApsaraMQ for MQTT broker accepts the connection request from the ApsaraMQ for MQTT client.
             * *   **not authorized**: The TCP connection is closed because the permission verification of the client to access the instance fails.
             * *   **clientId conflict**: The TCP connection is closed due to a conflict in the ID of the ApsaraMQ for MQTT client.
             * *   **resource auth failed**: The TCP connection is closed because the permission verification for the ApsaraMQ for MQTT client to access the topic or group fails.
             * *   **no heart**: The TCP connection is closed because no heartbeat is detected on the client.
             * *   **closed by client**: The TCP connection is closed because an exception occurs on the client.
             * *   **disconnected by client**: The client requests a disconnection.
             * *   **invalid param**: The TCP connection is closed due to invalid request parameters.
             * *   **Socket IOException**: The TCP connection is closed due to network jitter or packet loss.
             */
            public Builder actionInfo(String actionInfo) {
                this.actionInfo = actionInfo;
                return this;
            }

            /**
             * The connection ID.
             */
            public Builder channelId(String channelId) {
                this.channelId = channelId;
                return this;
            }

            /**
             * The time when the action occurred on the device.
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
