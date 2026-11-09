// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.onsmqtt20200420.models;

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
 * {@link QueryMqttTraceDeviceResponseBody} extends {@link TeaModel}
 *
 * <p>QueryMqttTraceDeviceResponseBody</p>
 */
public class QueryMqttTraceDeviceResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CurrentPage")
    private Integer currentPage;

    @com.aliyun.core.annotation.NameInMap("DeviceInfoList")
    private java.util.List<DeviceInfoList> deviceInfoList;

    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Total")
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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<DeviceInfoList> getDeviceInfoList() {
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
        private java.util.List<DeviceInfoList> deviceInfoList; 
        private Integer pageSize; 
        private String requestId; 
        private Long total; 

        private Builder() {
        } 

        private Builder(QueryMqttTraceDeviceResponseBody model) {
            this.currentPage = model.currentPage;
            this.deviceInfoList = model.deviceInfoList;
            this.pageSize = model.pageSize;
            this.requestId = model.requestId;
            this.total = model.total;
        } 

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder currentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }

        /**
         * <p>The details of the device activity entries.</p>
         */
        public Builder deviceInfoList(java.util.List<DeviceInfoList> deviceInfoList) {
            this.deviceInfoList = deviceInfoList;
            return this;
        }

        /**
         * <p>The maximum number of device activity entries displayed per page.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>A common parameter. Each request has a unique ID that is active for troubleshooting and locating issues.</p>
         * 
         * <strong>example:</strong>
         * <p>317076B7-F946-46BC-A98F-4CF9777C****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of device activity entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public QueryMqttTraceDeviceResponseBody build() {
            return new QueryMqttTraceDeviceResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryMqttTraceDeviceResponseBody} extends {@link TeaModel}
     *
     * <p>QueryMqttTraceDeviceResponseBody</p>
     */
    public static class DeviceInfoList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Action")
        private String action;

        @com.aliyun.core.annotation.NameInMap("ActionCode")
        private String actionCode;

        @com.aliyun.core.annotation.NameInMap("ActionInfo")
        private String actionInfo;

        @com.aliyun.core.annotation.NameInMap("ChannelId")
        private String channelId;

        @com.aliyun.core.annotation.NameInMap("Time")
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

            private Builder() {
            } 

            private Builder(DeviceInfoList model) {
                this.action = model.action;
                this.actionCode = model.actionCode;
                this.actionInfo = model.actionInfo;
                this.channelId = model.channelId;
                this.time = model.time;
            } 

            /**
             * <p>The device action. Valid values:</p>
             * <ul>
             * <li><p><strong>connect</strong>: The client requests a connection to the server.</p>
             * </li>
             * <li><p><strong>close</strong>: The TCP connection is closed.</p>
             * </li>
             * <li><p><strong>disconnect</strong>: The client requests to disconnect from the server.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>connect</p>
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * <p>The return code of the device action. Valid values:</p>
             * <ul>
             * <li><p><strong>mqtt.trace.action.connect</strong>: returned when the device action is <strong>connect</strong>.</p>
             * </li>
             * <li><p><strong>mqtt.trace.action.close</strong>: returned when the device action is <strong>close</strong>.</p>
             * </li>
             * <li><p><strong>mqtt.trace.action.disconnect</strong>: returned when the device action is <strong>disconnect</strong>.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>mqtt.trace.action.connect</p>
             */
            public Builder actionCode(String actionCode) {
                this.actionCode = actionCode;
                return this;
            }

            /**
             * <p>The description of the device action. Valid values:</p>
             * <ul>
             * <li><p><strong>accepted</strong>: The server accepts the connection request from the client.</p>
             * </li>
             * <li><p><strong>not authorized</strong>: The TCP connection is closed because the permission verification of the instance accessed by the client fails.</p>
             * </li>
             * <li><p><strong>clientId conflict</strong>: The TCP connection is closed because of a client ID conflict.</p>
             * </li>
             * <li><p><strong>resource auth failed</strong>: The TCP connection is closed because the permission verification of the topic or group ID resource accessed by the client fails.</p>
             * </li>
             * <li><p><strong>no heart</strong>: The TCP connection is closed because no heartbeat is detected from the client.</p>
             * </li>
             * <li><p><strong>closed by client</strong>: The TCP connection is closed because of a client exception.</p>
             * </li>
             * <li><p><strong>disconnected by client</strong>: The client requests to disconnect.</p>
             * </li>
             * <li><p><strong>invalid param</strong>: The TCP connection is closed because of invalid request parameters.</p>
             * </li>
             * <li><p><strong>Socket IOException</strong>: The TCP connection is closed because of network jitter or packet loss.</p>
             * </li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>accept</p>
             */
            public Builder actionInfo(String actionInfo) {
                this.actionInfo = actionInfo;
                return this;
            }

            /**
             * <p>The connection identifier of the device.</p>
             * 
             * <strong>example:</strong>
             * <p>c69fe839209547fa9d073781b9cd****</p>
             */
            public Builder channelId(String channelId) {
                this.channelId = channelId;
                return this;
            }

            /**
             * <p>The time when the device action occurred.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-05-21 15:51:54.867</p>
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
