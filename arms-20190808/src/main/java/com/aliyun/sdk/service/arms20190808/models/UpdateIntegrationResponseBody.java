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
         * Integration.
         */
        public Builder integration(Integration integration) {
            this.integration = integration;
            return this;
        }

        /**
         * Id of the request
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
             * ApiEndpoint.
             */
            public Builder apiEndpoint(String apiEndpoint) {
                this.apiEndpoint = apiEndpoint;
                return this;
            }

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
             * DuplicateKey.
             */
            public Builder duplicateKey(String duplicateKey) {
                this.duplicateKey = duplicateKey;
                return this;
            }

            /**
             * ExtendedFieldRedefineRules.
             */
            public Builder extendedFieldRedefineRules(java.util.List < java.util.Map<String, ?>> extendedFieldRedefineRules) {
                this.extendedFieldRedefineRules = extendedFieldRedefineRules;
                return this;
            }

            /**
             * FieldRedefineRules.
             */
            public Builder fieldRedefineRules(java.util.List < java.util.Map<String, ?>> fieldRedefineRules) {
                this.fieldRedefineRules = fieldRedefineRules;
                return this;
            }

            /**
             * InitiativeRecoverField.
             */
            public Builder initiativeRecoverField(String initiativeRecoverField) {
                this.initiativeRecoverField = initiativeRecoverField;
                return this;
            }

            /**
             * InitiativeRecoverValue.
             */
            public Builder initiativeRecoverValue(String initiativeRecoverValue) {
                this.initiativeRecoverValue = initiativeRecoverValue;
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
             * Liveness.
             */
            public Builder liveness(String liveness) {
                this.liveness = liveness;
                return this;
            }

            /**
             * RecoverTime.
             */
            public Builder recoverTime(Long recoverTime) {
                this.recoverTime = recoverTime;
                return this;
            }

            /**
             * ShortToken.
             */
            public Builder shortToken(String shortToken) {
                this.shortToken = shortToken;
                return this;
            }

            /**
             * Stat.
             */
            public Builder stat(java.util.List < Long > stat) {
                this.stat = stat;
                return this;
            }

            /**
             * State.
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
