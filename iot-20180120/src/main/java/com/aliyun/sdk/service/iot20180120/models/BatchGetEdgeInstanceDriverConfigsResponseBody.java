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
 * {@link BatchGetEdgeInstanceDriverConfigsResponseBody} extends {@link TeaModel}
 *
 * <p>BatchGetEdgeInstanceDriverConfigsResponseBody</p>
 */
public class BatchGetEdgeInstanceDriverConfigsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("DriverConfigList")
    private java.util.List<DriverConfigList> driverConfigList;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private BatchGetEdgeInstanceDriverConfigsResponseBody(Builder builder) {
        this.code = builder.code;
        this.driverConfigList = builder.driverConfigList;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchGetEdgeInstanceDriverConfigsResponseBody create() {
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
     * @return driverConfigList
     */
    public java.util.List<DriverConfigList> getDriverConfigList() {
        return this.driverConfigList;
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
        private java.util.List<DriverConfigList> driverConfigList; 
        private String errorMessage; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(BatchGetEdgeInstanceDriverConfigsResponseBody model) {
            this.code = model.code;
            this.driverConfigList = model.driverConfigList;
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
         * <p>The data that is returned if the call was successful.</p>
         */
        public Builder driverConfigList(java.util.List<DriverConfigList> driverConfigList) {
            this.driverConfigList = driverConfigList;
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
         * <p>D6113390-F507-458B-8544-7B01F945630B</p>
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

        public BatchGetEdgeInstanceDriverConfigsResponseBody build() {
            return new BatchGetEdgeInstanceDriverConfigsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link BatchGetEdgeInstanceDriverConfigsResponseBody} extends {@link TeaModel}
     *
     * <p>BatchGetEdgeInstanceDriverConfigsResponseBody</p>
     */
    public static class ConfigList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigId")
        private String configId;

        @com.aliyun.core.annotation.NameInMap("Content")
        private String content;

        @com.aliyun.core.annotation.NameInMap("Format")
        private String format;

        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        private ConfigList(Builder builder) {
            this.configId = builder.configId;
            this.content = builder.content;
            this.format = builder.format;
            this.key = builder.key;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigList create() {
            return builder().build();
        }

        /**
         * @return configId
         */
        public String getConfigId() {
            return this.configId;
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

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        public static final class Builder {
            private String configId; 
            private String content; 
            private String format; 
            private String key; 

            private Builder() {
            } 

            private Builder(ConfigList model) {
                this.configId = model.configId;
                this.content = model.content;
                this.format = model.format;
                this.key = model.key;
            } 

            /**
             * <p>The ID of the configuration.</p>
             * 
             * <strong>example:</strong>
             * <p>dac71722ceac4a299dbf3e8dc3c8****</p>
             */
            public Builder configId(String configId) {
                this.configId = configId;
                return this;
            }

            /**
             * <p>The configuration content or the Object Storage Service (OSS) path of the configuration file.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;test&quot;:123}</p>
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

            /**
             * <p>The key of the configuration. If multiple configurations are available, keywords can be used to identify the configurations.</p>
             * 
             * <strong>example:</strong>
             * <p>key1</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            public ConfigList build() {
                return new ConfigList(this);
            } 

        } 

    }
    /**
     * 
     * {@link BatchGetEdgeInstanceDriverConfigsResponseBody} extends {@link TeaModel}
     *
     * <p>BatchGetEdgeInstanceDriverConfigsResponseBody</p>
     */
    public static class DriverConfigList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigList")
        private java.util.List<ConfigList> configList;

        @com.aliyun.core.annotation.NameInMap("DriverId")
        private String driverId;

        private DriverConfigList(Builder builder) {
            this.configList = builder.configList;
            this.driverId = builder.driverId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static DriverConfigList create() {
            return builder().build();
        }

        /**
         * @return configList
         */
        public java.util.List<ConfigList> getConfigList() {
            return this.configList;
        }

        /**
         * @return driverId
         */
        public String getDriverId() {
            return this.driverId;
        }

        public static final class Builder {
            private java.util.List<ConfigList> configList; 
            private String driverId; 

            private Builder() {
            } 

            private Builder(DriverConfigList model) {
                this.configList = model.configList;
                this.driverId = model.driverId;
            } 

            /**
             * <p>The configuration information of the driver.</p>
             */
            public Builder configList(java.util.List<ConfigList> configList) {
                this.configList = configList;
                return this;
            }

            /**
             * <p>The ID of the driver.</p>
             * 
             * <strong>example:</strong>
             * <p>021d154d2a2f4dd7a489773d9e04****</p>
             */
            public Builder driverId(String driverId) {
                this.driverId = driverId;
                return this;
            }

            public DriverConfigList build() {
                return new DriverConfigList(this);
            } 

        } 

    }
}
