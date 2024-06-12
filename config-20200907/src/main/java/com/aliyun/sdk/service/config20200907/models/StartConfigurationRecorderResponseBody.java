// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartConfigurationRecorderResponseBody} extends {@link TeaModel}
 *
 * <p>StartConfigurationRecorderResponseBody</p>
 */
public class StartConfigurationRecorderResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ConfigurationRecorder")
    private ConfigurationRecorder configurationRecorder;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private StartConfigurationRecorderResponseBody(Builder builder) {
        this.configurationRecorder = builder.configurationRecorder;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static StartConfigurationRecorderResponseBody create() {
        return builder().build();
    }

    /**
     * @return configurationRecorder
     */
    public ConfigurationRecorder getConfigurationRecorder() {
        return this.configurationRecorder;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private ConfigurationRecorder configurationRecorder; 
        private String requestId; 

        /**
         * The details of the configuration recorder.
         */
        public Builder configurationRecorder(ConfigurationRecorder configurationRecorder) {
            this.configurationRecorder = configurationRecorder;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public StartConfigurationRecorderResponseBody build() {
            return new StartConfigurationRecorderResponseBody(this);
        } 

    } 

    public static class ConfigurationRecorder extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigurationRecorderStatus")
        private String configurationRecorderStatus;

        @com.aliyun.core.annotation.NameInMap("ResourceTypes")
        private java.util.List < String > resourceTypes;

        private ConfigurationRecorder(Builder builder) {
            this.configurationRecorderStatus = builder.configurationRecorderStatus;
            this.resourceTypes = builder.resourceTypes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigurationRecorder create() {
            return builder().build();
        }

        /**
         * @return configurationRecorderStatus
         */
        public String getConfigurationRecorderStatus() {
            return this.configurationRecorderStatus;
        }

        /**
         * @return resourceTypes
         */
        public java.util.List < String > getResourceTypes() {
            return this.resourceTypes;
        }

        public static final class Builder {
            private String configurationRecorderStatus; 
            private java.util.List < String > resourceTypes; 

            /**
             * The status of the configuration recorder. Valid values:
             * <p>
             * 
             * *   REGISTRABLE: The configuration recorder has not been registered.
             * *   BUILDING: The configuration recorder is being deployed.
             * *   REGISTERED: The configuration recorder has been registered.
             * *   REBUILDING: The configuration recorder is being redeployed.
             */
            public Builder configurationRecorderStatus(String configurationRecorderStatus) {
                this.configurationRecorderStatus = configurationRecorderStatus;
                return this;
            }

            /**
             * The types of the resources that are monitored by Cloud Config.
             */
            public Builder resourceTypes(java.util.List < String > resourceTypes) {
                this.resourceTypes = resourceTypes;
                return this;
            }

            public ConfigurationRecorder build() {
                return new ConfigurationRecorder(this);
            } 

        } 

    }
}
