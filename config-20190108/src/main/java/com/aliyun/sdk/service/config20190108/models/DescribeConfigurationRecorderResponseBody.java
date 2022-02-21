// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.config20190108.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeConfigurationRecorderResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeConfigurationRecorderResponseBody</p>
 */
public class DescribeConfigurationRecorderResponseBody extends TeaModel {
    @NameInMap("ConfigurationRecorder")
    private ConfigurationRecorder configurationRecorder;

    @NameInMap("RequestId")
    private String requestId;

    private DescribeConfigurationRecorderResponseBody(Builder builder) {
        this.configurationRecorder = builder.configurationRecorder;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeConfigurationRecorderResponseBody create() {
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
         * ConfigurationRecorder.
         */
        public Builder configurationRecorder(ConfigurationRecorder configurationRecorder) {
            this.configurationRecorder = configurationRecorder;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeConfigurationRecorderResponseBody build() {
            return new DescribeConfigurationRecorderResponseBody(this);
        } 

    } 

    public static class ConfigurationRecorder extends TeaModel {
        @NameInMap("AccountId")
        private Long accountId;

        @NameInMap("ConfigurationRecorderStatus")
        private String configurationRecorderStatus;

        @NameInMap("OrganizationEnableStatus")
        private String organizationEnableStatus;

        @NameInMap("OrganizationMasterId")
        private Long organizationMasterId;

        @NameInMap("ResourceTypes")
        private java.util.List < String > resourceTypes;

        private ConfigurationRecorder(Builder builder) {
            this.accountId = builder.accountId;
            this.configurationRecorderStatus = builder.configurationRecorderStatus;
            this.organizationEnableStatus = builder.organizationEnableStatus;
            this.organizationMasterId = builder.organizationMasterId;
            this.resourceTypes = builder.resourceTypes;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ConfigurationRecorder create() {
            return builder().build();
        }

        /**
         * @return accountId
         */
        public Long getAccountId() {
            return this.accountId;
        }

        /**
         * @return configurationRecorderStatus
         */
        public String getConfigurationRecorderStatus() {
            return this.configurationRecorderStatus;
        }

        /**
         * @return organizationEnableStatus
         */
        public String getOrganizationEnableStatus() {
            return this.organizationEnableStatus;
        }

        /**
         * @return organizationMasterId
         */
        public Long getOrganizationMasterId() {
            return this.organizationMasterId;
        }

        /**
         * @return resourceTypes
         */
        public java.util.List < String > getResourceTypes() {
            return this.resourceTypes;
        }

        public static final class Builder {
            private Long accountId; 
            private String configurationRecorderStatus; 
            private String organizationEnableStatus; 
            private Long organizationMasterId; 
            private java.util.List < String > resourceTypes; 

            /**
             * AccountId.
             */
            public Builder accountId(Long accountId) {
                this.accountId = accountId;
                return this;
            }

            /**
             * ConfigurationRecorderStatus.
             */
            public Builder configurationRecorderStatus(String configurationRecorderStatus) {
                this.configurationRecorderStatus = configurationRecorderStatus;
                return this;
            }

            /**
             * OrganizationEnableStatus.
             */
            public Builder organizationEnableStatus(String organizationEnableStatus) {
                this.organizationEnableStatus = organizationEnableStatus;
                return this;
            }

            /**
             * OrganizationMasterId.
             */
            public Builder organizationMasterId(Long organizationMasterId) {
                this.organizationMasterId = organizationMasterId;
                return this;
            }

            /**
             * ResourceTypes.
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
