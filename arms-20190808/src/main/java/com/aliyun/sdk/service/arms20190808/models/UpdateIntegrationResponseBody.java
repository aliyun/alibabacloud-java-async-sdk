// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateIntegrationResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateIntegrationResponseBody</p>
 */
public class UpdateIntegrationResponseBody extends TeaModel {
    @NameInMap("Integration")
    private Integration integration;

    @NameInMap("RequestId")
    private String requestId;

    private UpdateIntegrationResponseBody(Builder builder) {
        this.integration = builder.integration;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateIntegrationResponseBody create() {
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
         * The Information about the alert integration.
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

        public UpdateIntegrationResponseBody build() {
            return new UpdateIntegrationResponseBody(this);
        } 

    } 

    public static class Integration extends TeaModel {
        @NameInMap("ApiEndpoint")
        private String apiEndpoint;

        @NameInMap("AutoRecover")
        private Boolean autoRecover;

        @NameInMap("Description")
        private String description;

        @NameInMap("DuplicateKey")
        private String duplicateKey;

        @NameInMap("ExtendedFieldRedefineRules")
        private java.util.List < java.util.Map<String, ?>> extendedFieldRedefineRules;

        @NameInMap("FieldRedefineRules")
        private java.util.List < java.util.Map<String, ?>> fieldRedefineRules;

        @NameInMap("InitiativeRecoverField")
        private String initiativeRecoverField;

        @NameInMap("InitiativeRecoverValue")
        private String initiativeRecoverValue;

        @NameInMap("IntegrationId")
        private Long integrationId;

        @NameInMap("IntegrationName")
        private String integrationName;

        @NameInMap("IntegrationProductType")
        private String integrationProductType;

        @NameInMap("Liveness")
        private String liveness;

        @NameInMap("RecoverTime")
        private Long recoverTime;

        @NameInMap("ShortToken")
        private String shortToken;

        @NameInMap("Stat")
        private java.util.List < Long > stat;

        @NameInMap("State")
        private Boolean state;

        private Integration(Builder builder) {
            this.apiEndpoint = builder.apiEndpoint;
            this.autoRecover = builder.autoRecover;
            this.description = builder.description;
            this.duplicateKey = builder.duplicateKey;
            this.extendedFieldRedefineRules = builder.extendedFieldRedefineRules;
            this.fieldRedefineRules = builder.fieldRedefineRules;
            this.initiativeRecoverField = builder.initiativeRecoverField;
            this.initiativeRecoverValue = builder.initiativeRecoverValue;
            this.integrationId = builder.integrationId;
            this.integrationName = builder.integrationName;
            this.integrationProductType = builder.integrationProductType;
            this.liveness = builder.liveness;
            this.recoverTime = builder.recoverTime;
            this.shortToken = builder.shortToken;
            this.stat = builder.stat;
            this.state = builder.state;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Integration create() {
            return builder().build();
        }

        /**
         * @return apiEndpoint
         */
        public String getApiEndpoint() {
            return this.apiEndpoint;
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
         * @return duplicateKey
         */
        public String getDuplicateKey() {
            return this.duplicateKey;
        }

        /**
         * @return extendedFieldRedefineRules
         */
        public java.util.List < java.util.Map<String, ?>> getExtendedFieldRedefineRules() {
            return this.extendedFieldRedefineRules;
        }

        /**
         * @return fieldRedefineRules
         */
        public java.util.List < java.util.Map<String, ?>> getFieldRedefineRules() {
            return this.fieldRedefineRules;
        }

        /**
         * @return initiativeRecoverField
         */
        public String getInitiativeRecoverField() {
            return this.initiativeRecoverField;
        }

        /**
         * @return initiativeRecoverValue
         */
        public String getInitiativeRecoverValue() {
            return this.initiativeRecoverValue;
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
         * @return liveness
         */
        public String getLiveness() {
            return this.liveness;
        }

        /**
         * @return recoverTime
         */
        public Long getRecoverTime() {
            return this.recoverTime;
        }

        /**
         * @return shortToken
         */
        public String getShortToken() {
            return this.shortToken;
        }

        /**
         * @return stat
         */
        public java.util.List < Long > getStat() {
            return this.stat;
        }

        /**
         * @return state
         */
        public Boolean getState() {
            return this.state;
        }

        public static final class Builder {
            private String apiEndpoint; 
            private Boolean autoRecover; 
            private String description; 
            private String duplicateKey; 
            private java.util.List < java.util.Map<String, ?>> extendedFieldRedefineRules; 
            private java.util.List < java.util.Map<String, ?>> fieldRedefineRules; 
            private String initiativeRecoverField; 
            private String initiativeRecoverValue; 
            private Long integrationId; 
            private String integrationName; 
            private String integrationProductType; 
            private String liveness; 
            private Long recoverTime; 
            private String shortToken; 
            private java.util.List < Long > stat; 
            private Boolean state; 

            /**
             * The endpoint of the alert integration.
             */
            public Builder apiEndpoint(String apiEndpoint) {
                this.apiEndpoint = apiEndpoint;
                return this;
            }

            /**
             * Indicates whether alert events are automatically cleared. Valid values:
             * <p>
             * 
             * *   true (default)
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
             * The fields whose values are deduplicated.
             */
            public Builder duplicateKey(String duplicateKey) {
                this.duplicateKey = duplicateKey;
                return this;
            }

            /**
             * The extended mapped fields of the alert source.
             */
            public Builder extendedFieldRedefineRules(java.util.List < java.util.Map<String, ?>> extendedFieldRedefineRules) {
                this.extendedFieldRedefineRules = extendedFieldRedefineRules;
                return this;
            }

            /**
             * The predefined mapped fields of the alert source.
             */
            public Builder fieldRedefineRules(java.util.List < java.util.Map<String, ?>> fieldRedefineRules) {
                this.fieldRedefineRules = fieldRedefineRules;
                return this;
            }

            /**
             * The field for clearing alert events. The system queries alert events based on the field of alert clearing events and clears the alert events.
             * <p>
             * 
             * > Only Log Service supports this parameter.
             */
            public Builder initiativeRecoverField(String initiativeRecoverField) {
                this.initiativeRecoverField = initiativeRecoverField;
                return this;
            }

            /**
             * The value of the field for clearing alert events. The system queries alert events based on the field of alert clearing events and clears the alert events.
             * <p>
             * 
             * > Only Log Service supports this parameter.
             */
            public Builder initiativeRecoverValue(String initiativeRecoverValue) {
                this.initiativeRecoverValue = initiativeRecoverValue;
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
             * The activity of the alert integration
             */
            public Builder liveness(String liveness) {
                this.liveness = liveness;
                return this;
            }

            /**
             * The time when alert events are automatically cleared. Unit: seconds. Default value: 300.
             */
            public Builder recoverTime(Long recoverTime) {
                this.recoverTime = recoverTime;
                return this;
            }

            /**
             * The authentication token of the alert integration.
             */
            public Builder shortToken(String shortToken) {
                this.shortToken = shortToken;
                return this;
            }

            /**
             * The total number of alert events and the number of abnormal alert events in the last hour.
             */
            public Builder stat(java.util.List < Long > stat) {
                this.stat = stat;
                return this;
            }

            /**
             * Indicates whether the alert integration is enabled. Valid values:
             * <p>
             * 
             * *   true
             * *   false
             */
            public Builder state(Boolean state) {
                this.state = state;
                return this;
            }

            public Integration build() {
                return new Integration(this);
            } 

        } 

    }
}
