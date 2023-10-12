// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link InspectionScript} extends {@link TeaModel}
 *
 * <p>InspectionScript</p>
 */
public class InspectionScript extends TeaModel {
    @NameInMap("InspectionAlarmRules")
    private java.util.List < InspectionAlarmRules> inspectionAlarmRules;

    @NameInMap("InspectionCrontab")
    private String inspectionCrontab;

    @NameInMap("ItemDescription")
    private String itemDescription;

    @NameInMap("ItemId")
    private String itemId;

    @NameInMap("ItemName")
    private String itemName;

    @NameInMap("Model")
    private String model;

    @NameInMap("Role")
    private String role;

    @NameInMap("Script")
    private String script;

    @NameInMap("ScriptId")
    private String scriptId;

    @NameInMap("ScriptStatus")
    private String scriptStatus;

    @NameInMap("Vendor")
    private String vendor;

    private InspectionScript(Builder builder) {
        this.inspectionAlarmRules = builder.inspectionAlarmRules;
        this.inspectionCrontab = builder.inspectionCrontab;
        this.itemDescription = builder.itemDescription;
        this.itemId = builder.itemId;
        this.itemName = builder.itemName;
        this.model = builder.model;
        this.role = builder.role;
        this.script = builder.script;
        this.scriptId = builder.scriptId;
        this.scriptStatus = builder.scriptStatus;
        this.vendor = builder.vendor;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static InspectionScript create() {
        return builder().build();
    }

    /**
     * @return inspectionAlarmRules
     */
    public java.util.List < InspectionAlarmRules> getInspectionAlarmRules() {
        return this.inspectionAlarmRules;
    }

    /**
     * @return inspectionCrontab
     */
    public String getInspectionCrontab() {
        return this.inspectionCrontab;
    }

    /**
     * @return itemDescription
     */
    public String getItemDescription() {
        return this.itemDescription;
    }

    /**
     * @return itemId
     */
    public String getItemId() {
        return this.itemId;
    }

    /**
     * @return itemName
     */
    public String getItemName() {
        return this.itemName;
    }

    /**
     * @return model
     */
    public String getModel() {
        return this.model;
    }

    /**
     * @return role
     */
    public String getRole() {
        return this.role;
    }

    /**
     * @return script
     */
    public String getScript() {
        return this.script;
    }

    /**
     * @return scriptId
     */
    public String getScriptId() {
        return this.scriptId;
    }

    /**
     * @return scriptStatus
     */
    public String getScriptStatus() {
        return this.scriptStatus;
    }

    /**
     * @return vendor
     */
    public String getVendor() {
        return this.vendor;
    }

    public static final class Builder {
        private java.util.List < InspectionAlarmRules> inspectionAlarmRules; 
        private String inspectionCrontab; 
        private String itemDescription; 
        private String itemId; 
        private String itemName; 
        private String model; 
        private String role; 
        private String script; 
        private String scriptId; 
        private String scriptStatus; 
        private String vendor; 

        /**
         * InspectionAlarmRules.
         */
        public Builder inspectionAlarmRules(java.util.List < InspectionAlarmRules> inspectionAlarmRules) {
            this.inspectionAlarmRules = inspectionAlarmRules;
            return this;
        }

        /**
         * InspectionCrontab.
         */
        public Builder inspectionCrontab(String inspectionCrontab) {
            this.inspectionCrontab = inspectionCrontab;
            return this;
        }

        /**
         * ItemDescription.
         */
        public Builder itemDescription(String itemDescription) {
            this.itemDescription = itemDescription;
            return this;
        }

        /**
         * ItemId.
         */
        public Builder itemId(String itemId) {
            this.itemId = itemId;
            return this;
        }

        /**
         * ItemName.
         */
        public Builder itemName(String itemName) {
            this.itemName = itemName;
            return this;
        }

        /**
         * Model.
         */
        public Builder model(String model) {
            this.model = model;
            return this;
        }

        /**
         * Role.
         */
        public Builder role(String role) {
            this.role = role;
            return this;
        }

        /**
         * Script.
         */
        public Builder script(String script) {
            this.script = script;
            return this;
        }

        /**
         * ScriptId.
         */
        public Builder scriptId(String scriptId) {
            this.scriptId = scriptId;
            return this;
        }

        /**
         * ScriptStatus.
         */
        public Builder scriptStatus(String scriptStatus) {
            this.scriptStatus = scriptStatus;
            return this;
        }

        /**
         * Vendor.
         */
        public Builder vendor(String vendor) {
            this.vendor = vendor;
            return this;
        }

        public InspectionScript build() {
            return new InspectionScript(this);
        } 

    } 

    public static class InspectionAlarmRules extends TeaModel {
        @NameInMap("AlarmExpression")
        private String alarmExpression;

        @NameInMap("AlarmLevel")
        private String alarmLevel;

        @NameInMap("AlarmOperator")
        private String alarmOperator;

        @NameInMap("AlarmValue")
        private String alarmValue;

        private InspectionAlarmRules(Builder builder) {
            this.alarmExpression = builder.alarmExpression;
            this.alarmLevel = builder.alarmLevel;
            this.alarmOperator = builder.alarmOperator;
            this.alarmValue = builder.alarmValue;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static InspectionAlarmRules create() {
            return builder().build();
        }

        /**
         * @return alarmExpression
         */
        public String getAlarmExpression() {
            return this.alarmExpression;
        }

        /**
         * @return alarmLevel
         */
        public String getAlarmLevel() {
            return this.alarmLevel;
        }

        /**
         * @return alarmOperator
         */
        public String getAlarmOperator() {
            return this.alarmOperator;
        }

        /**
         * @return alarmValue
         */
        public String getAlarmValue() {
            return this.alarmValue;
        }

        public static final class Builder {
            private String alarmExpression; 
            private String alarmLevel; 
            private String alarmOperator; 
            private String alarmValue; 

            /**
             * AlarmExpression.
             */
            public Builder alarmExpression(String alarmExpression) {
                this.alarmExpression = alarmExpression;
                return this;
            }

            /**
             * AlarmLevel.
             */
            public Builder alarmLevel(String alarmLevel) {
                this.alarmLevel = alarmLevel;
                return this;
            }

            /**
             * AlarmOperator.
             */
            public Builder alarmOperator(String alarmOperator) {
                this.alarmOperator = alarmOperator;
                return this;
            }

            /**
             * AlarmValue.
             */
            public Builder alarmValue(String alarmValue) {
                this.alarmValue = alarmValue;
                return this;
            }

            public InspectionAlarmRules build() {
                return new InspectionAlarmRules(this);
            } 

        } 

    }
}
