// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchGetEdgeInstanceDriverConfigsResponseBody} extends {@link TeaModel}
 *
 * <p>BatchGetEdgeInstanceDriverConfigsResponseBody</p>
 */
public class BatchGetEdgeInstanceDriverConfigsResponseBody extends TeaModel {
    @NameInMap("Code")
    private String code;

    @NameInMap("DriverConfigList")
    private java.util.List < DriverConfigList> driverConfigList;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
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

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return driverConfigList
     */
    public java.util.List < DriverConfigList> getDriverConfigList() {
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
        private java.util.List < DriverConfigList> driverConfigList; 
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
         * DriverConfigList.
         */
        public Builder driverConfigList(java.util.List < DriverConfigList> driverConfigList) {
            this.driverConfigList = driverConfigList;
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

        public BatchGetEdgeInstanceDriverConfigsResponseBody build() {
            return new BatchGetEdgeInstanceDriverConfigsResponseBody(this);
        } 

    } 

    public static class ConfigList extends TeaModel {
        @NameInMap("ConfigId")
        private String configId;

        @NameInMap("Content")
        private String content;

        @NameInMap("Format")
        private String format;

        @NameInMap("Key")
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

            /**
             * ConfigId.
             */
            public Builder configId(String configId) {
                this.configId = configId;
                return this;
            }

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

            /**
             * Key.
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
    public static class DriverConfigList extends TeaModel {
        @NameInMap("ConfigList")
        private java.util.List < ConfigList> configList;

        @NameInMap("DriverId")
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
        public java.util.List < ConfigList> getConfigList() {
            return this.configList;
        }

        /**
         * @return driverId
         */
        public String getDriverId() {
            return this.driverId;
        }

        public static final class Builder {
            private java.util.List < ConfigList> configList; 
            private String driverId; 

            /**
             * ConfigList.
             */
            public Builder configList(java.util.List < ConfigList> configList) {
                this.configList = configList;
                return this;
            }

            /**
             * DriverId.
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
