// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeCustomizeRuleResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeCustomizeRuleResponseBody</p>
 */
public class DescribeCustomizeRuleResponseBody extends TeaModel {
    @NameInMap("Code")
    private Integer code;

    @NameInMap("Data")
    private Data data;

    @NameInMap("Message")
    private String message;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Success")
    private Boolean success;

    private DescribeCustomizeRuleResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeCustomizeRuleResponseBody create() {
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
         * The return value for the request.
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
         * *   **true**
         * *   **false**
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DescribeCustomizeRuleResponseBody build() {
            return new DescribeCustomizeRuleResponseBody(this);
        } 

    } 

    public static class Data extends TeaModel {
        @NameInMap("AlertType")
        private String alertType;

        @NameInMap("AlertTypeMds")
        private String alertTypeMds;

        @NameInMap("Aliuid")
        private Long aliuid;

        @NameInMap("EventTransferExt")
        private String eventTransferExt;

        @NameInMap("EventTransferSwitch")
        private Integer eventTransferSwitch;

        @NameInMap("EventTransferType")
        private String eventTransferType;

        @NameInMap("GmtCreate")
        private String gmtCreate;

        @NameInMap("GmtModified")
        private String gmtModified;

        @NameInMap("Id")
        private Long id;

        @NameInMap("LogSource")
        private String logSource;

        @NameInMap("LogSourceMds")
        private String logSourceMds;

        @NameInMap("LogType")
        private String logType;

        @NameInMap("LogTypeMds")
        private String logTypeMds;

        @NameInMap("QueryCycle")
        private String queryCycle;

        @NameInMap("RuleCondition")
        private String ruleCondition;

        @NameInMap("RuleDesc")
        private String ruleDesc;

        @NameInMap("RuleGroup")
        private String ruleGroup;

        @NameInMap("RuleName")
        private String ruleName;

        @NameInMap("RuleThreshold")
        private String ruleThreshold;

        @NameInMap("RuleType")
        private String ruleType;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("ThreatLevel")
        private String threatLevel;

        private Data(Builder builder) {
            this.alertType = builder.alertType;
            this.alertTypeMds = builder.alertTypeMds;
            this.aliuid = builder.aliuid;
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
             * The ID of the Alibaba Cloud account for which the threat analysis feature is enabled.
             */
            public Builder aliuid(Long aliuid) {
                this.aliuid = aliuid;
                return this;
            }

            /**
             * The extended information about event generation. If **eventTransferType** is set to **allToSingle**, a value is returned for EventTransferExt. The return value indicates the length and time unit of the alert aggregation window. The HTML escape characters are reversed.
             */
            public Builder eventTransferExt(String eventTransferExt) {
                this.eventTransferExt = eventTransferExt;
                return this;
            }

            /**
             * Indicates whether the alert generates an event. Valid values:
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
             * *   **default**: The default method is used.
             * *   **singleToSingle**: The system generates an event for each alert.
             * *   **allToSingle**: The system generates an event for alerts within a period of time.
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
             * The log aggregation field. The value is in the JSON format. The HTML escape characters are reversed.
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
             * The rule type. Valid values:
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
             * *   **0**: the initial status.
             * *   **10**: The simulation data is tested.
             * *   **15**: The business data is being tested.
             * *   **20**: The business data test ends.
             * *   **100**: The rule takes effect.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * The threat level. Valid values:
             * <p>
             * 
             * *   **serious**: high risk
             * *   **suspicious**: medium risk
             * *   **remind**: low risk
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
