// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateIntegrationRequest} extends {@link RequestModel}
 *
 * <p>UpdateIntegrationRequest</p>
 */
public class UpdateIntegrationRequest extends Request {
    @Body
    @NameInMap("AutoRecover")
    private Boolean autoRecover;

    @Body
    @NameInMap("Description")
    private String description;

    @Body
    @NameInMap("DuplicateKey")
    private String duplicateKey;

    @Body
    @NameInMap("ExtendedFieldRedefineRules")
    private String extendedFieldRedefineRules;

    @Body
    @NameInMap("FieldRedefineRules")
    private String fieldRedefineRules;

    @Body
    @NameInMap("InitiativeRecoverField")
    private String initiativeRecoverField;

    @Body
    @NameInMap("InitiativeRecoverValue")
    private String initiativeRecoverValue;

    @Body
    @NameInMap("IntegrationId")
    @Validation(required = true)
    private Long integrationId;

    @Body
    @NameInMap("IntegrationName")
    @Validation(required = true)
    private String integrationName;

    @Body
    @NameInMap("IntegrationProductType")
    @Validation(required = true)
    private String integrationProductType;

    @Body
    @NameInMap("Liveness")
    private String liveness;

    @Body
    @NameInMap("RecoverTime")
    private Long recoverTime;

    @Body
    @NameInMap("Stat")
    private String stat;

    @Body
    @NameInMap("State")
    private Boolean state;

    private UpdateIntegrationRequest(Builder builder) {
        super(builder);
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
        this.stat = builder.stat;
        this.state = builder.state;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateIntegrationRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
    public String getExtendedFieldRedefineRules() {
        return this.extendedFieldRedefineRules;
    }

    /**
     * @return fieldRedefineRules
     */
    public String getFieldRedefineRules() {
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
     * @return stat
     */
    public String getStat() {
        return this.stat;
    }

    /**
     * @return state
     */
    public Boolean getState() {
        return this.state;
    }

    public static final class Builder extends Request.Builder<UpdateIntegrationRequest, Builder> {
        private Boolean autoRecover; 
        private String description; 
        private String duplicateKey; 
        private String extendedFieldRedefineRules; 
        private String fieldRedefineRules; 
        private String initiativeRecoverField; 
        private String initiativeRecoverValue; 
        private Long integrationId; 
        private String integrationName; 
        private String integrationProductType; 
        private String liveness; 
        private Long recoverTime; 
        private String stat; 
        private Boolean state; 

        private Builder() {
            super();
        } 

        private Builder(UpdateIntegrationRequest request) {
            super(request);
            this.autoRecover = request.autoRecover;
            this.description = request.description;
            this.duplicateKey = request.duplicateKey;
            this.extendedFieldRedefineRules = request.extendedFieldRedefineRules;
            this.fieldRedefineRules = request.fieldRedefineRules;
            this.initiativeRecoverField = request.initiativeRecoverField;
            this.initiativeRecoverValue = request.initiativeRecoverValue;
            this.integrationId = request.integrationId;
            this.integrationName = request.integrationName;
            this.integrationProductType = request.integrationProductType;
            this.liveness = request.liveness;
            this.recoverTime = request.recoverTime;
            this.stat = request.stat;
            this.state = request.state;
        } 

        /**
         * Specifies whether to automatically clear alert events. Valid values:
         * <p>
         * 
         * *   true (default)
         * *   false
         */
        public Builder autoRecover(Boolean autoRecover) {
            this.putBodyParameter("AutoRecover", autoRecover);
            this.autoRecover = autoRecover;
            return this;
        }

        /**
         * The description of the alert integration.
         */
        public Builder description(String description) {
            this.putBodyParameter("Description", description);
            this.description = description;
            return this;
        }

        /**
         * The fields whose values are deduplicated.
         */
        public Builder duplicateKey(String duplicateKey) {
            this.putBodyParameter("DuplicateKey", duplicateKey);
            this.duplicateKey = duplicateKey;
            return this;
        }

        /**
         * The extended mapped fields are mapped to the fields of ARMS alerts. For more information, see the description of the ExtendedFieldRedefineRules parameter.
         */
        public Builder extendedFieldRedefineRules(String extendedFieldRedefineRules) {
            this.putBodyParameter("ExtendedFieldRedefineRules", extendedFieldRedefineRules);
            this.extendedFieldRedefineRules = extendedFieldRedefineRules;
            return this;
        }

        /**
         * The predefined mapped fields are mapped to the fields of ARMS alerts. The predefined mapped fields were generated when the alert integration was created. For more information, see the description of the FieldRedefineRules parameter.
         */
        public Builder fieldRedefineRules(String fieldRedefineRules) {
            this.putBodyParameter("FieldRedefineRules", fieldRedefineRules);
            this.fieldRedefineRules = fieldRedefineRules;
            return this;
        }

        /**
         * The field for clearing alert events. The system queries alert events based on the field of alert clearing events and clears the alert events.
         * <p>
         * 
         * > Only the Log Service alert integration supports the parameter.
         */
        public Builder initiativeRecoverField(String initiativeRecoverField) {
            this.putBodyParameter("InitiativeRecoverField", initiativeRecoverField);
            this.initiativeRecoverField = initiativeRecoverField;
            return this;
        }

        /**
         * The value of the field for clearing alert events. The system queries alert events based on the field of alert clearing events and clears the alert events.
         * <p>
         * 
         * > Only the Log Service alert integration supports the parameter.
         */
        public Builder initiativeRecoverValue(String initiativeRecoverValue) {
            this.putBodyParameter("InitiativeRecoverValue", initiativeRecoverValue);
            this.initiativeRecoverValue = initiativeRecoverValue;
            return this;
        }

        /**
         * The ID of the alert integration.
         */
        public Builder integrationId(Long integrationId) {
            this.putBodyParameter("IntegrationId", integrationId);
            this.integrationId = integrationId;
            return this;
        }

        /**
         * The name of the alert integration.
         */
        public Builder integrationName(String integrationName) {
            this.putBodyParameter("IntegrationName", integrationName);
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
            this.putBodyParameter("IntegrationProductType", integrationProductType);
            this.integrationProductType = integrationProductType;
            return this;
        }

        /**
         * The activity of the alert integration
         */
        public Builder liveness(String liveness) {
            this.putBodyParameter("Liveness", liveness);
            this.liveness = liveness;
            return this;
        }

        /**
         * The period of time within which alert events are automatically cleared. Unit: seconds. Default value: 300.
         */
        public Builder recoverTime(Long recoverTime) {
            this.putBodyParameter("RecoverTime", recoverTime);
            this.recoverTime = recoverTime;
            return this;
        }

        /**
         * The total number of alert events and the number of abnormal alert events in the last hour.
         */
        public Builder stat(String stat) {
            this.putBodyParameter("Stat", stat);
            this.stat = stat;
            return this;
        }

        /**
         * Indicates whether the alert integration was enabled. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         */
        public Builder state(Boolean state) {
            this.putBodyParameter("State", state);
            this.state = state;
            return this;
        }

        @Override
        public UpdateIntegrationRequest build() {
            return new UpdateIntegrationRequest(this);
        } 

    } 

}
