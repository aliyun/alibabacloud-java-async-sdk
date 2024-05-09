// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateIntegrationResponseBody} extends {@link TeaModel}
 *
 * <p>CreateIntegrationResponseBody</p>
 */
public class CreateIntegrationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Integration")
    private Integration integration;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CreateIntegrationResponseBody(Builder builder) {
        this.integration = builder.integration;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateIntegrationResponseBody create() {
        return builder().build();
    }

    /**
     * @return integration
     */
    public Integration getIntegration() {
        return this.integration;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Integration integration; 
        private String requestId; 

        /**
         * The returned information about the alert integration.
         */
        public Builder integration(Integration integration) {
            this.integration = integration;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CreateIntegrationResponseBody build() {
            return new CreateIntegrationResponseBody(this);
        } 

    } 

    public static class Integration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AutoRecover")
        private Boolean autoRecover;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("IntegrationId")
        private Long integrationId;

        @com.aliyun.core.annotation.NameInMap("IntegrationName")
        private String integrationName;

        @com.aliyun.core.annotation.NameInMap("IntegrationProductType")
        private String integrationProductType;

        @com.aliyun.core.annotation.NameInMap("RecoverTime")
        private Long recoverTime;

        private Integration(Builder builder) {
            this.autoRecover = builder.autoRecover;
            this.description = builder.description;
            this.integrationId = builder.integrationId;
            this.integrationName = builder.integrationName;
            this.integrationProductType = builder.integrationProductType;
            this.recoverTime = builder.recoverTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Integration create() {
            return builder().build();
        }

        /**
         * @return autoRecover
         */
        public Boolean getAutoRecover() {
            return this.autoRecover;
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return integrationId
         */
        public Long getIntegrationId() {
            return this.integrationId;
        }

        /**
         * @return integrationName
         */
        public String getIntegrationName() {
            return this.integrationName;
        }

        /**
         * @return integrationProductType
         */
        public String getIntegrationProductType() {
            return this.integrationProductType;
        }

        /**
         * @return recoverTime
         */
        public Long getRecoverTime() {
            return this.recoverTime;
        }

        public static final class Builder {
            private Boolean autoRecover; 
            private String description; 
            private Long integrationId; 
            private String integrationName; 
            private String integrationProductType; 
            private Long recoverTime; 

            /**
             * Indicates whether alert events are automatically cleared. Default value: true. Valid values:
             * <p>
             * 
             * *   true
             * *   false
             */
            public Builder autoRecover(Boolean autoRecover) {
                this.autoRecover = autoRecover;
                return this;
            }

            /**
             * The description of the alert integration.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * The ID of the alert integration.
             */
            public Builder integrationId(Long integrationId) {
                this.integrationId = integrationId;
                return this;
            }

            /**
             * The name of the alert integration.
             */
            public Builder integrationName(String integrationName) {
                this.integrationName = integrationName;
                return this;
            }

            /**
             * The service of the alert integration. Valid values:
             * <p>
             * 
             * *   CLOUD_MONITOR: CloudMonitor
             * *   LOG_SERVICE: Log Service
             */
            public Builder integrationProductType(String integrationProductType) {
                this.integrationProductType = integrationProductType;
                return this;
            }

            /**
             * The period of time within which alert events are automatically cleared. Unit: seconds. Default value: 300.
             */
            public Builder recoverTime(Long recoverTime) {
                this.recoverTime = recoverTime;
                return this;
            }

            public Integration build() {
                return new Integration(this);
            } 

        } 

    }
}
