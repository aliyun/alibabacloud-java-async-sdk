// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PostCustomizeRuleResponseBody} extends {@link TeaModel}
 *
 * <p>PostCustomizeRuleResponseBody</p>
 */
public class PostCustomizeRuleResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private Integer code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private PostCustomizeRuleResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PostCustomizeRuleResponseBody create() {
        return builder().build();
    }

    /**
     * @return code
     */
    public Integer getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Integer code; 
        private Data data; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        /**
         * The HTTP status code.
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * The data returned.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * The returned message.
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * The request ID.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Indicates whether the request was successful. Valid values:
         * <p>
         * 
         * *   true
         * *   false
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public PostCustomizeRuleResponseBody build() {
            return new PostCustomizeRuleResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AlertType")
        private String alertType;

        @com.aliyun.core.annotation.NameInMap("AlertTypeMds")
        private String alertTypeMds;

        @com.aliyun.core.annotation.NameInMap("Aliuid")
        private Long aliuid;

        @com.aliyun.core.annotation.NameInMap("AttCk")
        private String attCk;

        @com.aliyun.core.annotation.NameInMap("DataType")
        private Integer dataType;

        @com.aliyun.core.annotation.NameInMap("EventTransferExt")
        private String eventTransferExt;

        @com.aliyun.core.annotation.NameInMap("EventTransferSwitch")
        private Integer eventTransferSwitch;

        @com.aliyun.core.annotation.NameInMap("EventTransferType")
        private String eventTransferType;

        @com.aliyun.core.annotation.NameInMap("GmtCreate")
        private String gmtCreate;

        @com.aliyun.core.annotation.NameInMap("GmtModified")
        private String gmtModified;

        @com.aliyun.core.annotation.NameInMap("Id")
        private Long id;

        @com.aliyun.core.annotation.NameInMap("LogSource")
        private String logSource;

        @com.aliyun.core.annotation.NameInMap("LogSourceMds")
        private String logSourceMds;

        @com.aliyun.core.annotation.NameInMap("LogType")
        private String logType;

        @com.aliyun.core.annotation.NameInMap("LogTypeMds")
        private String logTypeMds;

        @com.aliyun.core.annotation.NameInMap("QueryCycle")
        private String queryCycle;

        @com.aliyun.core.annotation.NameInMap("RuleCondition")
        private String ruleCondition;

        @com.aliyun.core.annotation.NameInMap("RuleDesc")
        private String ruleDesc;

        @com.aliyun.core.annotation.NameInMap("RuleGroup")
        private String ruleGroup;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("RuleThreshold")
        private String ruleThreshold;

        @com.aliyun.core.annotation.NameInMap("RuleType")
        private String ruleType;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("ThreatLevel")
        private String threatLevel;

        private Data(Builder builder) {
            this.alertType = builder.alertType;
            this.alertTypeMds = builder.alertTypeMds;
            this.aliuid = builder.aliuid;
            this.attCk = builder.attCk;
            this.dataType = builder.dataType;
            this.eventTransferExt = builder.eventTransferExt;
            this.eventTransferSwitch = builder.eventTransferSwitch;
            this.eventTransferType = builder.eventTransferType;
            this.gmtCreate = builder.gmtCreate;
            this.gmtModified = builder.gmtModified;
            this.id = builder.id;
            this.logSource = builder.logSource;
            this.logSourceMds = builder.logSourceMds;
            this.logType = builder.logType;
            this.logTypeMds = builder.logTypeMds;
            this.queryCycle = builder.queryCycle;
            this.ruleCondition = builder.ruleCondition;
            this.ruleDesc = builder.ruleDesc;
            this.ruleGroup = builder.ruleGroup;
            this.ruleName = builder.ruleName;
            this.ruleThreshold = builder.ruleThreshold;
            this.ruleType = builder.ruleType;
            this.status = builder.status;
            this.threatLevel = builder.threatLevel;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return alertType
         */
        public String getAlertType() {
            return this.alertType;
        }

        /**
         * @return alertTypeMds
         */
        public String getAlertTypeMds() {
            return this.alertTypeMds;
        }

        /**
         * @return aliuid
         */
        public Long getAliuid() {
            return this.aliuid;
        }

        /**
         * @return attCk
         */
        public String getAttCk() {
            return this.attCk;
        }

        /**
         * @return dataType
         */
        public Integer getDataType() {
            return this.dataType;
        }

        /**
         * @return eventTransferExt
         */
        public String getEventTransferExt() {
            return this.eventTransferExt;
        }

        /**
         * @return eventTransferSwitch
         */
        public Integer getEventTransferSwitch() {
            return this.eventTransferSwitch;
        }

        /**
         * @return eventTransferType
         */
        public String getEventTransferType() {
            return this.eventTransferType;
        }

        /**
         * @return gmtCreate
         */
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        /**
         * @return gmtModified
         */
        public String getGmtModified() {
            return this.gmtModified;
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return logSource
         */
        public String getLogSource() {
            return this.logSource;
        }

        /**
         * @return logSourceMds
         */
        public String getLogSourceMds() {
            return this.logSourceMds;
        }

        /**
         * @return logType
         */
        public String getLogType() {
            return this.logType;
        }

        /**
         * @return logTypeMds
         */
        public String getLogTypeMds() {
            return this.logTypeMds;
        }

        /**
         * @return queryCycle
         */
        public String getQueryCycle() {
            return this.queryCycle;
        }

        /**
         * @return ruleCondition
         */
        public String getRuleCondition() {
            return this.ruleCondition;
        }

        /**
         * @return ruleDesc
         */
        public String getRuleDesc() {
            return this.ruleDesc;
        }

        /**
         * @return ruleGroup
         */
        public String getRuleGroup() {
            return this.ruleGroup;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        /**
         * @return ruleThreshold
         */
        public String getRuleThreshold() {
            return this.ruleThreshold;
        }

        /**
         * @return ruleType
         */
        public String getRuleType() {
            return this.ruleType;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return threatLevel
         */
        public String getThreatLevel() {
            return this.threatLevel;
        }

        public static final class Builder {
            private String alertType; 
            private String alertTypeMds; 
            private Long aliuid; 
            private String attCk; 
            private Integer dataType; 
            private String eventTransferExt; 
            private Integer eventTransferSwitch; 
            private String eventTransferType; 
            private String gmtCreate; 
            private String gmtModified; 
            private Long id; 
            private String logSource; 
            private String logSourceMds; 
            private String logType; 
            private String logTypeMds; 
            private String queryCycle; 
            private String ruleCondition; 
            private String ruleDesc; 
            private String ruleGroup; 
            private String ruleName; 
            private String ruleThreshold; 
            private String ruleType; 
            private Integer status; 
            private String threatLevel; 

            /**
             * The risk type.
             */
            public Builder alertType(String alertType) {
                this.alertType = alertType;
                return this;
            }

            /**
             * The internal code of the risk type.
             */
            public Builder alertTypeMds(String alertTypeMds) {
                this.alertTypeMds = alertTypeMds;
                return this;
            }

            /**
             * The ID of the Alibaba Cloud account that is used to purchase the threat analysis feature.
             */
            public Builder aliuid(Long aliuid) {
                this.aliuid = aliuid;
                return this;
            }

            /**
             * 告警附加字段attck
             */
            public Builder attCk(String attCk) {
                this.attCk = attCk;
                return this;
            }

            /**
             * 自动化响应规则条件字段数据类型。
             */
            public Builder dataType(Integer dataType) {
                this.dataType = dataType;
                return this;
            }

            /**
             * The extended information about event generation. If eventTransferType is set to allToSingle, the value of this parameter indicates the length and unit of the alert aggregation window. The HTML escape characters are reversed.
             */
            public Builder eventTransferExt(String eventTransferExt) {
                this.eventTransferExt = eventTransferExt;
                return this;
            }

            /**
             * Indicates whether the system generates an event for the alert. Valid values:
             * <p>
             * 
             * *   0: no
             * *   1: yes
             */
            public Builder eventTransferSwitch(Integer eventTransferSwitch) {
                this.eventTransferSwitch = eventTransferSwitch;
                return this;
            }

            /**
             * The event generation method. Valid values:
             * <p>
             * 
             * *   default: The default method is used.
             * *   singleToSingle: The system generates an event for each alert.
             * *   allToSingle: The system generates an event for alerts within a period of time.
             */
            public Builder eventTransferType(String eventTransferType) {
                this.eventTransferType = eventTransferType;
                return this;
            }

            /**
             * The time when the custom rule was created.
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * The time when the custom rule was last updated.
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * The ID of the custom rule.
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * The log source of the rule.
             */
            public Builder logSource(String logSource) {
                this.logSource = logSource;
                return this;
            }

            /**
             * The internal code of the log source.
             */
            public Builder logSourceMds(String logSourceMds) {
                this.logSourceMds = logSourceMds;
                return this;
            }

            /**
             * The log type of the rule.
             */
            public Builder logType(String logType) {
                this.logType = logType;
                return this;
            }

            /**
             * The internal code of the log type.
             */
            public Builder logTypeMds(String logTypeMds) {
                this.logTypeMds = logTypeMds;
                return this;
            }

            /**
             * The window length of the rule. The HTML escape characters are reversed.
             */
            public Builder queryCycle(String queryCycle) {
                this.queryCycle = queryCycle;
                return this;
            }

            /**
             * The query condition of the rule. The value is in the JSON format. The HTML escape characters are reversed.
             */
            public Builder ruleCondition(String ruleCondition) {
                this.ruleCondition = ruleCondition;
                return this;
            }

            /**
             * The description of the rule.
             */
            public Builder ruleDesc(String ruleDesc) {
                this.ruleDesc = ruleDesc;
                return this;
            }

            /**
             * The log aggregation field of the rule. The value is a JSON string. The HTML escape characters are reversed.
             */
            public Builder ruleGroup(String ruleGroup) {
                this.ruleGroup = ruleGroup;
                return this;
            }

            /**
             * The name of the rule.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * The threshold configuration of the rule. The value is in the JSON format. The HTML escape characters are reversed.
             */
            public Builder ruleThreshold(String ruleThreshold) {
                this.ruleThreshold = ruleThreshold;
                return this;
            }

            /**
             * The type of the rule. Valid values:
             * <p>
             * 
             * *   predefine
             * *   customize
             */
            public Builder ruleType(String ruleType) {
                this.ruleType = ruleType;
                return this;
            }

            /**
             * The rule status. Valid values:
             * <p>
             * 
             * *   0: The rule is in the initial state.
             * *   10: The simulation data is tested.
             * *   15: The business data is being tested.
             * *   20: The business data test ends.
             * *   100: The rule takes effect.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * The risk level. Valid values:
             * <p>
             * 
             * *   serious: high
             * *   suspicious: medium
             * *   remind: low
             */
            public Builder threatLevel(String threatLevel) {
                this.threatLevel = threatLevel;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
