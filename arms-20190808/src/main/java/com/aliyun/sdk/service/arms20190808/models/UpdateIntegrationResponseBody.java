// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link UpdateIntegrationResponseBody} extends {@link TeaModel}
 *
 * <p>UpdateIntegrationResponseBody</p>
 */
public class UpdateIntegrationResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Integration")
    private Integration integration;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The Information about the alert integration.</p>
         */
        public Builder integration(Integration integration) {
            this.integration = integration;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>34ED024E-9E31-434A-9E4E-D9D15C3****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public UpdateIntegrationResponseBody build() {
            return new UpdateIntegrationResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UpdateIntegrationResponseBody} extends {@link TeaModel}
     *
     * <p>UpdateIntegrationResponseBody</p>
     */
    public static class Integration extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ApiEndpoint")
        private String apiEndpoint;

        @com.aliyun.core.annotation.NameInMap("AutoRecover")
        private Boolean autoRecover;

        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("DuplicateKey")
        private String duplicateKey;

        @com.aliyun.core.annotation.NameInMap("ExtendedFieldRedefineRules")
        private java.util.List < java.util.Map<String, ?>> extendedFieldRedefineRules;

        @com.aliyun.core.annotation.NameInMap("FieldRedefineRules")
        private java.util.List < java.util.Map<String, ?>> fieldRedefineRules;

        @com.aliyun.core.annotation.NameInMap("InitiativeRecoverField")
        private String initiativeRecoverField;

        @com.aliyun.core.annotation.NameInMap("InitiativeRecoverValue")
        private String initiativeRecoverValue;

        @com.aliyun.core.annotation.NameInMap("IntegrationId")
        private Long integrationId;

        @com.aliyun.core.annotation.NameInMap("IntegrationName")
        private String integrationName;

        @com.aliyun.core.annotation.NameInMap("IntegrationProductType")
        private String integrationProductType;

        @com.aliyun.core.annotation.NameInMap("Liveness")
        private String liveness;

        @com.aliyun.core.annotation.NameInMap("RecoverTime")
        private Long recoverTime;

        @com.aliyun.core.annotation.NameInMap("ShortToken")
        private String shortToken;

        @com.aliyun.core.annotation.NameInMap("Stat")
        private java.util.List < Long > stat;

        @com.aliyun.core.annotation.NameInMap("State")
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
             * <p>The endpoint of the alert integration.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://alerts.aliyuncs.com/api/v1/integrations/custom/ymQBN">https://alerts.aliyuncs.com/api/v1/integrations/custom/ymQBN</a>******</p>
             */
            public Builder apiEndpoint(String apiEndpoint) {
                this.apiEndpoint = apiEndpoint;
                return this;
            }

            /**
             * <p>Indicates whether alert events are automatically cleared. Valid values:</p>
             * <ul>
             * <li>true (default)</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
             */
            public Builder autoRecover(Boolean autoRecover) {
                this.autoRecover = autoRecover;
                return this;
            }

            /**
             * <p>The description of the alert integration.</p>
             * 
             * <strong>example:</strong>
             * <p>Test</p>
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * <p>The fields whose values are deduplicated.</p>
             * 
             * <strong>example:</strong>
             * <p>LABEL.dimensions::LABEL.ruleId</p>
             */
            public Builder duplicateKey(String duplicateKey) {
                this.duplicateKey = duplicateKey;
                return this;
            }

            /**
             * <p>The extended mapped fields of the alert source.</p>
             */
            public Builder extendedFieldRedefineRules(java.util.List < java.util.Map<String, ?>> extendedFieldRedefineRules) {
                this.extendedFieldRedefineRules = extendedFieldRedefineRules;
                return this;
            }

            /**
             * <p>The predefined mapped fields of the alert source.</p>
             */
            public Builder fieldRedefineRules(java.util.List < java.util.Map<String, ?>> fieldRedefineRules) {
                this.fieldRedefineRules = fieldRedefineRules;
                return this;
            }

            /**
             * <p>The field for clearing alert events. The system queries alert events based on the field of alert clearing events and clears the alert events.</p>
             * <blockquote>
             * <p>Only Log Service supports this parameter.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>$.status</p>
             */
            public Builder initiativeRecoverField(String initiativeRecoverField) {
                this.initiativeRecoverField = initiativeRecoverField;
                return this;
            }

            /**
             * <p>The value of the field for clearing alert events. The system queries alert events based on the field of alert clearing events and clears the alert events.</p>
             * <blockquote>
             * <p>Only Log Service supports this parameter.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>ok</p>
             */
            public Builder initiativeRecoverValue(String initiativeRecoverValue) {
                this.initiativeRecoverValue = initiativeRecoverValue;
                return this;
            }

            /**
             * <p>The ID of the alert integration.</p>
             * 
             * <strong>example:</strong>
             * <p>1234</p>
             */
            public Builder integrationId(Long integrationId) {
                this.integrationId = integrationId;
                return this;
            }

            /**
             * <p>The name of the alert integration.</p>
             * 
             * <strong>example:</strong>
             * <p>CloudMonitor integration</p>
             */
            public Builder integrationName(String integrationName) {
                this.integrationName = integrationName;
                return this;
            }

            /**
             * <p>The service of the alert integration. Valid values:</p>
             * <ul>
             * <li>CLOUD_MONITOR: CloudMonitor</li>
             * <li>LOG_SERVICE: Log Service</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>CLOUD_MONITOR</p>
             */
            public Builder integrationProductType(String integrationProductType) {
                this.integrationProductType = integrationProductType;
                return this;
            }

            /**
             * <p>The activity of the alert integration</p>
             * 
             * <strong>example:</strong>
             * <p>ready</p>
             */
            public Builder liveness(String liveness) {
                this.liveness = liveness;
                return this;
            }

            /**
             * <p>The time when alert events are automatically cleared. Unit: seconds. Default value: 300.</p>
             * 
             * <strong>example:</strong>
             * <p>300</p>
             */
            public Builder recoverTime(Long recoverTime) {
                this.recoverTime = recoverTime;
                return this;
            }

            /**
             * <p>The authentication token of the alert integration.</p>
             * 
             * <strong>example:</strong>
             * <p>ymQBN******</p>
             */
            public Builder shortToken(String shortToken) {
                this.shortToken = shortToken;
                return this;
            }

            /**
             * <p>The total number of alert events and the number of abnormal alert events in the last hour.</p>
             */
            public Builder stat(java.util.List < Long > stat) {
                this.stat = stat;
                return this;
            }

            /**
             * <p>Indicates whether the alert integration is enabled. Valid values:</p>
             * <ul>
             * <li>true</li>
             * <li>false</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>true</p>
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
