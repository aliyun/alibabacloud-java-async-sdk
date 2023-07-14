// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateIntegrationResponseBody} extends {@link TeaModel}
 *
 * <p>CreateIntegrationResponseBody</p>
 */
public class CreateIntegrationResponseBody extends TeaModel {
    @NameInMap("Integration")
    private Integration integration;

    @NameInMap("RequestId")
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
         * Integration.
         */
        public Builder integration(Integration integration) {
            this.integration = integration;
            return this;
        }

        /**
         * RequestId.
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
        @NameInMap("AutoRecover")
        private Boolean autoRecover;

        @NameInMap("Description")
        private String description;

        @NameInMap("IntegrationId")
        private Long integrationId;

        @NameInMap("IntegrationName")
        private String integrationName;

        @NameInMap("IntegrationProductType")
        private String integrationProductType;

        @NameInMap("RecoverTime")
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
             * AutoRecover.
             */
            public Builder autoRecover(Boolean autoRecover) {
                this.autoRecover = autoRecover;
                return this;
            }

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * IntegrationId.
             */
            public Builder integrationId(Long integrationId) {
                this.integrationId = integrationId;
                return this;
            }

            /**
             * IntegrationName.
             */
            public Builder integrationName(String integrationName) {
                this.integrationName = integrationName;
                return this;
            }

            /**
             * IntegrationProductType.
             */
            public Builder integrationProductType(String integrationProductType) {
                this.integrationProductType = integrationProductType;
                return this;
            }

            /**
             * RecoverTime.
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
