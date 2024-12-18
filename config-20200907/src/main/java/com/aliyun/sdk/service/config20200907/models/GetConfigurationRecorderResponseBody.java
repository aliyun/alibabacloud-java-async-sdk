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
 * {@link GetConfigurationRecorderResponseBody} extends {@link TeaModel}
 *
 * <p>GetConfigurationRecorderResponseBody</p>
 */
public class GetConfigurationRecorderResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ConfigurationRecorder")
    private ConfigurationRecorder configurationRecorder;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetConfigurationRecorderResponseBody(Builder builder) {
        this.configurationRecorder = builder.configurationRecorder;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetConfigurationRecorderResponseBody create() {
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
         * <p>The details of the configuration recorder that monitors resources.</p>
         */
        public Builder configurationRecorder(ConfigurationRecorder configurationRecorder) {
            this.configurationRecorder = configurationRecorder;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>AE43696A-B3AF-5E55-9845-11393127E6D3</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetConfigurationRecorderResponseBody build() {
            return new GetConfigurationRecorderResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetConfigurationRecorderResponseBody} extends {@link TeaModel}
     *
     * <p>GetConfigurationRecorderResponseBody</p>
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
             * <p>The types of resources that are monitored.</p>
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
