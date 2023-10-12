// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateMonitorItemRequest} extends {@link RequestModel}
 *
 * <p>CreateMonitorItemRequest</p>
 */
public class CreateMonitorItemRequest extends Request {
    @Body
    @NameInMap("AlarmRuleList")
    private java.util.List < AlarmRuleList> alarmRuleList;

    @Body
    @NameInMap("AnalysisCode")
    @Validation(required = true)
    private String analysisCode;

    @Body
    @NameInMap("ClientToken")
    @Validation(required = true)
    private String clientToken;

    @Body
    @NameInMap("CollectionType")
    @Validation(required = true)
    private String collectionType;

    @Body
    @NameInMap("Config")
    @Validation(required = true, maxLength = 255)
    private String config;

    @Body
    @NameInMap("DataItem")
    private String dataItem;

    @Body
    @NameInMap("DeviceForm")
    private String deviceForm;

    @Body
    @NameInMap("Effective")
    @Validation(required = true, maximum = 1)
    private Integer effective;

    @Body
    @NameInMap("ExecInterval")
    @Validation(required = true)
    private Integer execInterval;

    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Body
    @NameInMap("MonitorItemDescription")
    @Validation(required = true, maxLength = 255)
    private String monitorItemDescription;

    @Body
    @NameInMap("MonitorItemName")
    @Validation(required = true, maxLength = 255)
    private String monitorItemName;

    @Body
    @NameInMap("SecurityDomain")
    @Validation(required = true)
    private String securityDomain;

    @Body
    @NameInMap("Type")
    @Validation(required = true)
    private String type;

    private CreateMonitorItemRequest(Builder builder) {
        super(builder);
        this.alarmRuleList = builder.alarmRuleList;
        this.analysisCode = builder.analysisCode;
        this.clientToken = builder.clientToken;
        this.collectionType = builder.collectionType;
        this.config = builder.config;
        this.dataItem = builder.dataItem;
        this.deviceForm = builder.deviceForm;
        this.effective = builder.effective;
        this.execInterval = builder.execInterval;
        this.instanceId = builder.instanceId;
        this.monitorItemDescription = builder.monitorItemDescription;
        this.monitorItemName = builder.monitorItemName;
        this.securityDomain = builder.securityDomain;
        this.type = builder.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateMonitorItemRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return alarmRuleList
     */
    public java.util.List < AlarmRuleList> getAlarmRuleList() {
        return this.alarmRuleList;
    }

    /**
     * @return analysisCode
     */
    public String getAnalysisCode() {
        return this.analysisCode;
    }

    /**
     * @return clientToken
     */
    public String getClientToken() {
        return this.clientToken;
    }

    /**
     * @return collectionType
     */
    public String getCollectionType() {
        return this.collectionType;
    }

    /**
     * @return config
     */
    public String getConfig() {
        return this.config;
    }

    /**
     * @return dataItem
     */
    public String getDataItem() {
        return this.dataItem;
    }

    /**
     * @return deviceForm
     */
    public String getDeviceForm() {
        return this.deviceForm;
    }

    /**
     * @return effective
     */
    public Integer getEffective() {
        return this.effective;
    }

    /**
     * @return execInterval
     */
    public Integer getExecInterval() {
        return this.execInterval;
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return monitorItemDescription
     */
    public String getMonitorItemDescription() {
        return this.monitorItemDescription;
    }

    /**
     * @return monitorItemName
     */
    public String getMonitorItemName() {
        return this.monitorItemName;
    }

    /**
     * @return securityDomain
     */
    public String getSecurityDomain() {
        return this.securityDomain;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    public static final class Builder extends Request.Builder<CreateMonitorItemRequest, Builder> {
        private java.util.List < AlarmRuleList> alarmRuleList; 
        private String analysisCode; 
        private String clientToken; 
        private String collectionType; 
        private String config; 
        private String dataItem; 
        private String deviceForm; 
        private Integer effective; 
        private Integer execInterval; 
        private String instanceId; 
        private String monitorItemDescription; 
        private String monitorItemName; 
        private String securityDomain; 
        private String type; 

        private Builder() {
            super();
        } 

        private Builder(CreateMonitorItemRequest request) {
            super(request);
            this.alarmRuleList = request.alarmRuleList;
            this.analysisCode = request.analysisCode;
            this.clientToken = request.clientToken;
            this.collectionType = request.collectionType;
            this.config = request.config;
            this.dataItem = request.dataItem;
            this.deviceForm = request.deviceForm;
            this.effective = request.effective;
            this.execInterval = request.execInterval;
            this.instanceId = request.instanceId;
            this.monitorItemDescription = request.monitorItemDescription;
            this.monitorItemName = request.monitorItemName;
            this.securityDomain = request.securityDomain;
            this.type = request.type;
        } 

        /**
         * AlarmRuleList.
         */
        public Builder alarmRuleList(java.util.List < AlarmRuleList> alarmRuleList) {
            String alarmRuleListShrink = shrink(alarmRuleList, "AlarmRuleList", "json");
            this.putBodyParameter("AlarmRuleList", alarmRuleListShrink);
            this.alarmRuleList = alarmRuleList;
            return this;
        }

        /**
         * AnalysisCode.
         */
        public Builder analysisCode(String analysisCode) {
            this.putBodyParameter("AnalysisCode", analysisCode);
            this.analysisCode = analysisCode;
            return this;
        }

        /**
         * ClientToken.
         */
        public Builder clientToken(String clientToken) {
            this.putBodyParameter("ClientToken", clientToken);
            this.clientToken = clientToken;
            return this;
        }

        /**
         * CollectionType.
         */
        public Builder collectionType(String collectionType) {
            this.putBodyParameter("CollectionType", collectionType);
            this.collectionType = collectionType;
            return this;
        }

        /**
         * Config.
         */
        public Builder config(String config) {
            this.putBodyParameter("Config", config);
            this.config = config;
            return this;
        }

        /**
         * DataItem.
         */
        public Builder dataItem(String dataItem) {
            this.putBodyParameter("DataItem", dataItem);
            this.dataItem = dataItem;
            return this;
        }

        /**
         * DeviceForm.
         */
        public Builder deviceForm(String deviceForm) {
            this.putBodyParameter("DeviceForm", deviceForm);
            this.deviceForm = deviceForm;
            return this;
        }

        /**
         * Effective.
         */
        public Builder effective(Integer effective) {
            this.putBodyParameter("Effective", effective);
            this.effective = effective;
            return this;
        }

        /**
         * ExecInterval.
         */
        public Builder execInterval(Integer execInterval) {
            this.putBodyParameter("ExecInterval", execInterval);
            this.execInterval = execInterval;
            return this;
        }

        /**
         * InstanceId.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * MonitorItemDescription.
         */
        public Builder monitorItemDescription(String monitorItemDescription) {
            this.putBodyParameter("MonitorItemDescription", monitorItemDescription);
            this.monitorItemDescription = monitorItemDescription;
            return this;
        }

        /**
         * MonitorItemName.
         */
        public Builder monitorItemName(String monitorItemName) {
            this.putBodyParameter("MonitorItemName", monitorItemName);
            this.monitorItemName = monitorItemName;
            return this;
        }

        /**
         * SecurityDomain.
         */
        public Builder securityDomain(String securityDomain) {
            this.putBodyParameter("SecurityDomain", securityDomain);
            this.securityDomain = securityDomain;
            return this;
        }

        /**
         * Type.
         */
        public Builder type(String type) {
            this.putBodyParameter("Type", type);
            this.type = type;
            return this;
        }

        @Override
        public CreateMonitorItemRequest build() {
            return new CreateMonitorItemRequest(this);
        } 

    } 

    public static class AlarmRuleList extends TeaModel {
        @NameInMap("AlarmStatus")
        @Validation(required = true)
        private String alarmStatus;

        @NameInMap("Expression")
        @Validation(required = true)
        private String expression;

        @NameInMap("Value")
        @Validation(required = true)
        private String value;

        @NameInMap("Variable")
        @Validation(required = true)
        private String variable;

        private AlarmRuleList(Builder builder) {
            this.alarmStatus = builder.alarmStatus;
            this.expression = builder.expression;
            this.value = builder.value;
            this.variable = builder.variable;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AlarmRuleList create() {
            return builder().build();
        }

        /**
         * @return alarmStatus
         */
        public String getAlarmStatus() {
            return this.alarmStatus;
        }

        /**
         * @return expression
         */
        public String getExpression() {
            return this.expression;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        /**
         * @return variable
         */
        public String getVariable() {
            return this.variable;
        }

        public static final class Builder {
            private String alarmStatus; 
            private String expression; 
            private String value; 
            private String variable; 

            /**
             * AlarmStatus.
             */
            public Builder alarmStatus(String alarmStatus) {
                this.alarmStatus = alarmStatus;
                return this;
            }

            /**
             * Expression.
             */
            public Builder expression(String expression) {
                this.expression = expression;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            /**
             * Variable.
             */
            public Builder variable(String variable) {
                this.variable = variable;
                return this;
            }

            public AlarmRuleList build() {
                return new AlarmRuleList(this);
            } 

        } 

    }
}
