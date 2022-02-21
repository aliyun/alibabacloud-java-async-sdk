// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchGetEdgeInstanceDeviceConfigResponseBody} extends {@link TeaModel}
 *
 * <p>BatchGetEdgeInstanceDeviceConfigResponseBody</p>
 */
public class BatchGetEdgeInstanceDeviceConfigResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("DeviceConfigList")
    private java.util.List < DeviceConfigList> deviceConfigList;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private BatchGetEdgeInstanceDeviceConfigResponseBody(Builder builder) {
        this.code = builder.code;
        this.deviceConfigList = builder.deviceConfigList;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchGetEdgeInstanceDeviceConfigResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return deviceConfigList
     */
    public java.util.List < DeviceConfigList> getDeviceConfigList() {
        return this.deviceConfigList;
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
        private java.util.List < DeviceConfigList> deviceConfigList; 
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
         * DeviceConfigList.
         */
        public Builder deviceConfigList(java.util.List < DeviceConfigList> deviceConfigList) {
            this.deviceConfigList = deviceConfigList;
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

        public BatchGetEdgeInstanceDeviceConfigResponseBody build() {
            return new BatchGetEdgeInstanceDeviceConfigResponseBody(this);
        } 

    } 

    public static class Config extends TeaModel {
        @NameInMap("Content")
        private String content;

        @NameInMap("Format")
        private String format;

        private Config(Builder builder) {
            this.content = builder.content;
            this.format = builder.format;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Config create() {
            return builder().build();
        }

        /**
         * @return content
         */
        public String getContent() {
            return this.content;
        }

        /**
         * @return format
         */
        public String getFormat() {
            return this.format;
        }

        public static final class Builder {
            private String content; 
            private String format; 

            /**
             * Content.
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * Format.
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            public Config build() {
                return new Config(this);
            } 

        } 

    }
    public static class DeviceConfigList extends TeaModel {
        @NameInMap("Config")
        private Config config;

        @NameInMap("IotId")
        private String iotId;

        private DeviceConfigList(Builder builder) {
            this.config = builder.config;
            this.iotId = builder.iotId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DeviceConfigList create() {
            return builder().build();
        }

        /**
         * @return config
         */
        public Config getConfig() {
            return this.config;
        }

        /**
         * @return iotId
         */
        public String getIotId() {
            return this.iotId;
        }

        public static final class Builder {
            private Config config; 
            private String iotId; 

            /**
             * Config.
             */
            public Builder config(Config config) {
                this.config = config;
                return this;
            }

            /**
             * IotId.
             */
            public Builder iotId(String iotId) {
                this.iotId = iotId;
                return this;
            }

            public DeviceConfigList build() {
                return new DeviceConfigList(this);
            } 

        } 

    }
}
