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
 * {@link BatchGetEdgeInstanceDeviceConfigResponseBody} extends {@link TeaModel}
 *
 * <p>BatchGetEdgeInstanceDeviceConfigResponseBody</p>
 */
public class BatchGetEdgeInstanceDeviceConfigResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("DeviceConfigList")
    private java.util.List<DeviceConfigList> deviceConfigList;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
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
     * @return deviceConfigList
     */
    public java.util.List<DeviceConfigList> getDeviceConfigList() {
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
        private java.util.List<DeviceConfigList> deviceConfigList; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(BatchGetEdgeInstanceDeviceConfigResponseBody model) {
            this.code = model.code;
            this.deviceConfigList = model.deviceConfigList;
            this.errorMessage = model.errorMessage;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The return code of the operation. A value of Success indicates that the call was successful. Other values indicate that specific errors occurred. For more information, see <a href="https://help.aliyun.com/document_detail/135200.html">Error codes</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The device configuration information that is returned if the call was successful.</p>
         */
        public Builder deviceConfigList(java.util.List<DeviceConfigList> deviceConfigList) {
            this.deviceConfigList = deviceConfigList;
            return this;
        }

        /**
         * <p>The error message that is returned if the call failed.</p>
         * 
         * <strong>example:</strong>
         * <p>request parameter error</p>
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>D4A102C2-36A5-4964-9694-0F8EFF95CCA8</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the call was successful. A value of true indicates that the call was successful. A value of false indicates that the call failed.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public BatchGetEdgeInstanceDeviceConfigResponseBody build() {
            return new BatchGetEdgeInstanceDeviceConfigResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link BatchGetEdgeInstanceDeviceConfigResponseBody} extends {@link TeaModel}
     *
     * <p>BatchGetEdgeInstanceDeviceConfigResponseBody</p>
     */
    public static class Config extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("Format")
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

            private Builder() {
            } 

            private Builder(Config model) {
                this.content = model.content;
                this.format = model.format;
            } 

            /**
             * <p>The configuration content or the Object Storage Service (OSS) path of the configuration file.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;test&quot;: &quot;device_config_demo&quot;}</p>
             */
            public Builder content(String content) {
                this.content = content;
                return this;
            }

            /**
             * <p>The format of the configuration. Valid values: KV (key-value pair), JSON (JSON string), and FILE (configuration file).</p>
             * 
             * <strong>example:</strong>
             * <p>JSON</p>
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
    /**
     * 
     * {@link BatchGetEdgeInstanceDeviceConfigResponseBody} extends {@link TeaModel}
     *
     * <p>BatchGetEdgeInstanceDeviceConfigResponseBody</p>
     */
    public static class DeviceConfigList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Config")
        private Config config;

        @com.aliyun.core.annotation.NameInMap("IotId")
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

            private Builder() {
            } 

            private Builder(DeviceConfigList model) {
                this.config = model.config;
                this.iotId = model.iotId;
            } 

            /**
             * <p>The configuration information of the device.</p>
             */
            public Builder config(Config config) {
                this.config = config;
                return this;
            }

            /**
             * <p>The ID of the device.</p>
             * 
             * <strong>example:</strong>
             * <p>sjI0Sd124XFYyjBY****000101</p>
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
