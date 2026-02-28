// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

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
 * {@link BatchGetEdgeInstanceDeviceChannelResponseBody} extends {@link TeaModel}
 *
 * <p>BatchGetEdgeInstanceDeviceChannelResponseBody</p>
 */
public class BatchGetEdgeInstanceDeviceChannelResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("DeviceChannelList")
    private java.util.List<DeviceChannelList> deviceChannelList;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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

    public Builder toBuilder() {
        return new Builder(this);
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
    public java.util.List<DeviceChannelList> getDeviceChannelList() {
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
        private java.util.List<DeviceChannelList> deviceChannelList; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(BatchGetEdgeInstanceDeviceChannelResponseBody model) {
            this.code = model.code;
            this.deviceChannelList = model.deviceChannelList;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

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
        public Builder deviceChannelList(java.util.List<DeviceChannelList> deviceChannelList) {
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

    /**
     * 
     * {@link BatchGetEdgeInstanceDeviceChannelResponseBody} extends {@link TeaModel}
     *
     * <p>BatchGetEdgeInstanceDeviceChannelResponseBody</p>
     */
    public static class DeviceChannelList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ChannelId")
        private String channelId;

        @com.aliyun.core.annotation.NameInMap("ChannelName")
        private String channelName;

        @com.aliyun.core.annotation.NameInMap("IotId")
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

            private Builder() {
            } 

            private Builder(DeviceChannelList model) {
                this.channelId = model.channelId;
                this.channelName = model.channelName;
                this.iotId = model.iotId;
            } 

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
