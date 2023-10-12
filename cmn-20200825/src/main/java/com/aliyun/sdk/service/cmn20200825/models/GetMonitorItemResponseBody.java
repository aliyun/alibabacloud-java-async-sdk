// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMonitorItemResponseBody} extends {@link TeaModel}
 *
 * <p>GetMonitorItemResponseBody</p>
 */
public class GetMonitorItemResponseBody extends TeaModel {
    @NameInMap("MonitorItem")
    private MonitorItem monitorItem;

    @NameInMap("RequestId")
    private String requestId;

    private GetMonitorItemResponseBody(Builder builder) {
        this.monitorItem = builder.monitorItem;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMonitorItemResponseBody create() {
        return builder().build();
    }

    /**
     * @return monitorItem
     */
    public MonitorItem getMonitorItem() {
        return this.monitorItem;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private MonitorItem monitorItem; 
        private String requestId; 

        /**
         * MonitorItem.
         */
        public Builder monitorItem(MonitorItem monitorItem) {
            this.monitorItem = monitorItem;
            return this;
        }

        /**
         * Id of the request
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetMonitorItemResponseBody build() {
            return new GetMonitorItemResponseBody(this);
        } 

    } 

    public static class AlarmRuleList extends TeaModel {
        @NameInMap("AlarmStatus")
        private String alarmStatus;

        @NameInMap("Expression")
        private String expression;

        @NameInMap("Value")
        private String value;

        @NameInMap("Variable")
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
    public static class PersonalizedAlarmRuleList extends TeaModel {
        @NameInMap("AlarmStatus")
        private String alarmStatus;

        @NameInMap("Expression")
        private String expression;

        @NameInMap("FieldName")
        private String fieldName;

        @NameInMap("FieldValue")
        private String fieldValue;

        @NameInMap("Value")
        private String value;

        @NameInMap("Variable")
        private String variable;

        private PersonalizedAlarmRuleList(Builder builder) {
            this.alarmStatus = builder.alarmStatus;
            this.expression = builder.expression;
            this.fieldName = builder.fieldName;
            this.fieldValue = builder.fieldValue;
            this.value = builder.value;
            this.variable = builder.variable;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PersonalizedAlarmRuleList create() {
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
         * @return fieldName
         */
        public String getFieldName() {
            return this.fieldName;
        }

        /**
         * @return fieldValue
         */
        public String getFieldValue() {
            return this.fieldValue;
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
            private String fieldName; 
            private String fieldValue; 
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
             * FieldName.
             */
            public Builder fieldName(String fieldName) {
                this.fieldName = fieldName;
                return this;
            }

            /**
             * FieldValue.
             */
            public Builder fieldValue(String fieldValue) {
                this.fieldValue = fieldValue;
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

            public PersonalizedAlarmRuleList build() {
                return new PersonalizedAlarmRuleList(this);
            } 

        } 

    }
    public static class MonitorItem extends TeaModel {
        @NameInMap("AlarmRuleList")
        private java.util.List < AlarmRuleList> alarmRuleList;

        @NameInMap("AnalysisCode")
        private String analysisCode;

        @NameInMap("CollectionType")
        private String collectionType;

        @NameInMap("Config")
        private String config;

        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("DataItem")
        private String dataItem;

        @NameInMap("DeviceForm")
        private String deviceForm;

        @NameInMap("Effective")
        private Integer effective;

        @NameInMap("ExecInterval")
        private Integer execInterval;

        @NameInMap("MonitorItemDescription")
        private String monitorItemDescription;

        @NameInMap("MonitorItemId")
        private String monitorItemId;

        @NameInMap("MonitorItemName")
        private String monitorItemName;

        @NameInMap("PersonalizedAlarmRuleList")
        private java.util.List < PersonalizedAlarmRuleList> personalizedAlarmRuleList;

        @NameInMap("SecurityDomain")
        private String securityDomain;

        @NameInMap("Type")
        private String type;

        @NameInMap("UpdateTime")
        private String updateTime;

        private MonitorItem(Builder builder) {
            this.alarmRuleList = builder.alarmRuleList;
            this.analysisCode = builder.analysisCode;
            this.collectionType = builder.collectionType;
            this.config = builder.config;
            this.createTime = builder.createTime;
            this.dataItem = builder.dataItem;
            this.deviceForm = builder.deviceForm;
            this.effective = builder.effective;
            this.execInterval = builder.execInterval;
            this.monitorItemDescription = builder.monitorItemDescription;
            this.monitorItemId = builder.monitorItemId;
            this.monitorItemName = builder.monitorItemName;
            this.personalizedAlarmRuleList = builder.personalizedAlarmRuleList;
            this.securityDomain = builder.securityDomain;
            this.type = builder.type;
            this.updateTime = builder.updateTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MonitorItem create() {
            return builder().build();
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
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
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
         * @return monitorItemDescription
         */
        public String getMonitorItemDescription() {
            return this.monitorItemDescription;
        }

        /**
         * @return monitorItemId
         */
        public String getMonitorItemId() {
            return this.monitorItemId;
        }

        /**
         * @return monitorItemName
         */
        public String getMonitorItemName() {
            return this.monitorItemName;
        }

        /**
         * @return personalizedAlarmRuleList
         */
        public java.util.List < PersonalizedAlarmRuleList> getPersonalizedAlarmRuleList() {
            return this.personalizedAlarmRuleList;
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

        /**
         * @return updateTime
         */
        public String getUpdateTime() {
            return this.updateTime;
        }

        public static final class Builder {
            private java.util.List < AlarmRuleList> alarmRuleList; 
            private String analysisCode; 
            private String collectionType; 
            private String config; 
            private String createTime; 
            private String dataItem; 
            private String deviceForm; 
            private Integer effective; 
            private Integer execInterval; 
            private String monitorItemDescription; 
            private String monitorItemId; 
            private String monitorItemName; 
            private java.util.List < PersonalizedAlarmRuleList> personalizedAlarmRuleList; 
            private String securityDomain; 
            private String type; 
            private String updateTime; 

            /**
             * AlarmRuleList.
             */
            public Builder alarmRuleList(java.util.List < AlarmRuleList> alarmRuleList) {
                this.alarmRuleList = alarmRuleList;
                return this;
            }

            /**
             * AnalysisCode.
             */
            public Builder analysisCode(String analysisCode) {
                this.analysisCode = analysisCode;
                return this;
            }

            /**
             * CollectionType.
             */
            public Builder collectionType(String collectionType) {
                this.collectionType = collectionType;
                return this;
            }

            /**
             * Config.
             */
            public Builder config(String config) {
                this.config = config;
                return this;
            }

            /**
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * DataItem.
             */
            public Builder dataItem(String dataItem) {
                this.dataItem = dataItem;
                return this;
            }

            /**
             * DeviceForm.
             */
            public Builder deviceForm(String deviceForm) {
                this.deviceForm = deviceForm;
                return this;
            }

            /**
             * Effective.
             */
            public Builder effective(Integer effective) {
                this.effective = effective;
                return this;
            }

            /**
             * ExecInterval.
             */
            public Builder execInterval(Integer execInterval) {
                this.execInterval = execInterval;
                return this;
            }

            /**
             * MonitorItemDescription.
             */
            public Builder monitorItemDescription(String monitorItemDescription) {
                this.monitorItemDescription = monitorItemDescription;
                return this;
            }

            /**
             * MonitorItemId.
             */
            public Builder monitorItemId(String monitorItemId) {
                this.monitorItemId = monitorItemId;
                return this;
            }

            /**
             * MonitorItemName.
             */
            public Builder monitorItemName(String monitorItemName) {
                this.monitorItemName = monitorItemName;
                return this;
            }

            /**
             * PersonalizedAlarmRuleList.
             */
            public Builder personalizedAlarmRuleList(java.util.List < PersonalizedAlarmRuleList> personalizedAlarmRuleList) {
                this.personalizedAlarmRuleList = personalizedAlarmRuleList;
                return this;
            }

            /**
             * SecurityDomain.
             */
            public Builder securityDomain(String securityDomain) {
                this.securityDomain = securityDomain;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * UpdateTime.
             */
            public Builder updateTime(String updateTime) {
                this.updateTime = updateTime;
                return this;
            }

            public MonitorItem build() {
                return new MonitorItem(this);
            } 

        } 

    }
}
