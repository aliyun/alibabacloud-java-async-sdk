// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20200907.models;

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
 * {@link UpdateConfigurationRecorderResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateConfigurationRecorderResponseBody</p>
 */
public class UpdateConfigurationRecorderResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ConfigurationRecorder")
    private ConfigurationRecorder configurationRecorder;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private UpdateConfigurationRecorderResponseBody(Builder builder) {
        this.configurationRecorder = builder.configurationRecorder;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateConfigurationRecorderResponseBody create() {
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
         * <p>The details of the configuration recorder.</p>
         */
        public Builder configurationRecorder(ConfigurationRecorder configurationRecorder) {
            this.configurationRecorder = configurationRecorder;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2A1D5095-D1F9-56B6-A712-EA495608E79A</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateConfigurationRecorderResponseBody build() {
            return new UpdateConfigurationRecorderResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdateConfigurationRecorderResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateConfigurationRecorderResponseBody</p>
     */
    public static class ConfigurationRecorder extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConfigurationRecorderStatus")
        private String configurationRecorderStatus;

        @com.aliyun.core.annotation.NameInMap("ResourceTypes")
        private java.util.List<String> resourceTypes;

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
        public java.util.List<String> getResourceTypes() {
            return this.resourceTypes;
        }

        public static final class Builder {
            private String configurationRecorderStatus; 
            private java.util.List<String> resourceTypes; 

            /**
             * <p>The status of the configuration recorder. Valid values:</p>
             * <ul>
             * <li>REGISTRABLE: The configuration recorder has not been registered.</li>
             * <li>BUILDING: The configuration recorder is being deployed.</li>
             * <li>REGISTERED: The configuration recorder has been registered.</li>
             * <li>REBUILDING: The configuration recorder is being redeployed.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>REGISTERED</p>
             */
            public Builder configurationRecorderStatus(String configurationRecorderStatus) {
                this.configurationRecorderStatus = configurationRecorderStatus;
                return this;
            }

            /**
             * <p>The types of the resources that are monitored by Cloud Config.</p>
             */
            public Builder resourceTypes(java.util.List<String> resourceTypes) {
                this.resourceTypes = resourceTypes;
                return this;
            }

            public ConfigurationRecorder build() {
                return new ConfigurationRecorder(this);
            } 

        } 

    }
}
