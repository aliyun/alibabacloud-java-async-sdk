// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchGetEdgeInstanceDeviceChannelResponseBody} extends {@link TeaModel}
 *
 * <p>BatchGetEdgeInstanceDeviceChannelResponseBody</p>
 */
public class BatchGetEdgeInstanceDeviceChannelResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("DeviceChannelList")
    private java.util.List < DeviceChannelList> deviceChannelList;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private BatchGetEdgeInstanceDeviceChannelResponseBody(Builder builder) {
        this.code = builder.code;
        this.deviceChannelList = builder.deviceChannelList;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchGetEdgeInstanceDeviceChannelResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return deviceChannelList
     */
    public java.util.List < DeviceChannelList> getDeviceChannelList() {
        return this.deviceChannelList;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
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

    public static final class Builder {
        private String code; 
        private java.util.List < DeviceChannelList> deviceChannelList; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * DeviceChannelList.
         */
        public Builder deviceChannelList(java.util.List < DeviceChannelList> deviceChannelList) {
            this.deviceChannelList = deviceChannelList;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
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

        public BatchGetEdgeInstanceDeviceChannelResponseBody build() {
            return new BatchGetEdgeInstanceDeviceChannelResponseBody(this);
        } 

    } 

    public static class DeviceChannelList extends TeaModel {
        @NameInMap("ChannelId")
        private String channelId;

        @NameInMap("ChannelName")
        private String channelName;

        @NameInMap("IotId")
        private String iotId;

        private DeviceChannelList(Builder builder) {
            this.channelId = builder.channelId;
            this.channelName = builder.channelName;
            this.iotId = builder.iotId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeviceChannelList create() {
            return builder().build();
        }

        /**
         * @return channelId
         */
        public String getChannelId() {
            return this.channelId;
        }

        /**
         * @return channelName
         */
        public String getChannelName() {
            return this.channelName;
        }

        /**
         * @return iotId
         */
        public String getIotId() {
            return this.iotId;
        }

        public static final class Builder {
            private String channelId; 
            private String channelName; 
            private String iotId; 

            /**
             * ChannelId.
             */
            public Builder channelId(String channelId) {
                this.channelId = channelId;
                return this;
            }

            /**
             * ChannelName.
             */
            public Builder channelName(String channelName) {
                this.channelName = channelName;
                return this;
            }

            /**
             * IotId.
             */
            public Builder iotId(String iotId) {
                this.iotId = iotId;
                return this;
            }

            public DeviceChannelList build() {
                return new DeviceChannelList(this);
            } 

        } 

    }
}
