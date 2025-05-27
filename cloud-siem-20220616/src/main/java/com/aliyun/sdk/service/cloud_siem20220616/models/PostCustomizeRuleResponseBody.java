// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(PostCustomizeRuleResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The HTTP status code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder code(Integer code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The data returned.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The returned message.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>9AAA9ED9-78F4-5021-86DC-D51C7511****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public PostCustomizeRuleResponseBody build() {
            return new PostCustomizeRuleResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link PostCustomizeRuleResponseBody} extends {@link TeaModel}
     *
     * <p>PostCustomizeRuleResponseBody</p>
     */
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

            private Builder() {
            } 

            private Builder(Data model) {
                this.alertType = model.alertType;
                this.alertTypeMds = model.alertTypeMds;
                this.aliuid = model.aliuid;
                this.attCk = model.attCk;
                this.dataType = model.dataType;
                this.eventTransferExt = model.eventTransferExt;
                this.eventTransferSwitch = model.eventTransferSwitch;
                this.eventTransferType = model.eventTransferType;
                this.gmtCreate = model.gmtCreate;
                this.gmtModified = model.gmtModified;
                this.id = model.id;
                this.logSource = model.logSource;
                this.logSourceMds = model.logSourceMds;
                this.logType = model.logType;
                this.logTypeMds = model.logTypeMds;
                this.queryCycle = model.queryCycle;
                this.ruleCondition = model.ruleCondition;
                this.ruleDesc = model.ruleDesc;
                this.ruleGroup = model.ruleGroup;
                this.ruleName = model.ruleName;
                this.ruleThreshold = model.ruleThreshold;
                this.ruleType = model.ruleType;
                this.status = model.status;
                this.threatLevel = model.threatLevel;
            } 

            /**
             * <p>The risk type.</p>
             * 
             * <strong>example:</strong>
             * <p>WEBSHELL</p>
             */
            public Builder alertType(String alertType) {
                this.alertType = alertType;
                return this;
            }

            /**
             * <p>The internal code of the risk type.</p>
             * 
             * <strong>example:</strong>
             * <p>${siem_rule_type_process_abnormal_command}</p>
             */
            public Builder alertTypeMds(String alertTypeMds) {
                this.alertTypeMds = alertTypeMds;
                return this;
            }

            /**
             * <p>The ID of the Alibaba Cloud account that is used to purchase the threat analysis feature.</p>
             * 
             * <strong>example:</strong>
             * <p>127608589417****</p>
             */
            public Builder aliuid(Long aliuid) {
                this.aliuid = aliuid;
                return this;
            }

            /**
             * <p>告警附加字段attck</p>
             * 
             * <strong>example:</strong>
             * <p>T1595.002 Vulnerability Scanning</p>
             */
            public Builder attCk(String attCk) {
                this.attCk = attCk;
                return this;
            }

            /**
             * <p>自动化响应规则条件字段数据类型。</p>
             * 
             * <strong>example:</strong>
             * <p>varchar</p>
             */
            public Builder dataType(Integer dataType) {
                this.dataType = dataType;
                return this;
            }

            /**
             * <p>The extended information about event generation. If eventTransferType is set to allToSingle, the value of this parameter indicates the length and unit of the alert aggregation window. The HTML escape characters are reversed.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;time&quot;:&quot;1&quot;,&quot;unit&quot;:&quot;MINUTE&quot;}</p>
             */
            public Builder eventTransferExt(String eventTransferExt) {
                this.eventTransferExt = eventTransferExt;
                return this;
            }

            /**
             * <p>Indicates whether the system generates an event for the alert. Valid values:</p>
             * <ul>
             * <li>0: no</li>
             * <li>1: yes</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder eventTransferSwitch(Integer eventTransferSwitch) {
                this.eventTransferSwitch = eventTransferSwitch;
                return this;
            }

            /**
             * <p>The event generation method. Valid values:</p>
             * <ul>
             * <li>default: The default method is used.</li>
             * <li>singleToSingle: The system generates an event for each alert.</li>
             * <li>allToSingle: The system generates an event for alerts within a period of time.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>allToSingle</p>
             */
            public Builder eventTransferType(String eventTransferType) {
                this.eventTransferType = eventTransferType;
                return this;
            }

            /**
             * <p>The time when the custom rule was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-01-06 16:37:29</p>
             */
            public Builder gmtCreate(String gmtCreate) {
                this.gmtCreate = gmtCreate;
                return this;
            }

            /**
             * <p>The time when the custom rule was last updated.</p>
             * 
             * <strong>example:</strong>
             * <p>2021-01-06 16:37:29</p>
             */
            public Builder gmtModified(String gmtModified) {
                this.gmtModified = gmtModified;
                return this;
            }

            /**
             * <p>The ID of the custom rule.</p>
             * 
             * <strong>example:</strong>
             * <p>123456789</p>
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * <p>The log source of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>cloud_siem_aegis_sas_alert</p>
             */
            public Builder logSource(String logSource) {
                this.logSource = logSource;
                return this;
            }

            /**
             * <p>The internal code of the log source.</p>
             * 
             * <strong>example:</strong>
             * <p>${sas.cloudsiem.prod.cloud_siem_aegis_sas_alert}</p>
             */
            public Builder logSourceMds(String logSourceMds) {
                this.logSourceMds = logSourceMds;
                return this;
            }

            /**
             * <p>The log type of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>ALERT_ACTIVITY</p>
             */
            public Builder logType(String logType) {
                this.logType = logType;
                return this;
            }

            /**
             * <p>The internal code of the log type.</p>
             * 
             * <strong>example:</strong>
             * <p>${security_event_config.event_name.webshellName_clientav}</p>
             */
            public Builder logTypeMds(String logTypeMds) {
                this.logTypeMds = logTypeMds;
                return this;
            }

            /**
             * <p>The window length of the rule. The HTML escape characters are reversed.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;time&quot;:&quot;1&quot;,&quot;unit&quot;:&quot;HOUR&quot;}</p>
             */
            public Builder queryCycle(String queryCycle) {
                this.queryCycle = queryCycle;
                return this;
            }

            /**
             * <p>The query condition of the rule. The value is in the JSON format. The HTML escape characters are reversed.</p>
             * 
             * <strong>example:</strong>
             * <p>[[{&quot;not&quot;:false,&quot;left&quot;:&quot;alert_name&quot;,&quot;operator&quot;:&quot;=&quot;,&quot;right&quot;:&quot;WEBSHELL&quot;}]]</p>
             */
            public Builder ruleCondition(String ruleCondition) {
                this.ruleCondition = ruleCondition;
                return this;
            }

            /**
             * <p>The description of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>this rule is for waf scan</p>
             */
            public Builder ruleDesc(String ruleDesc) {
                this.ruleDesc = ruleDesc;
                return this;
            }

            /**
             * <p>The log aggregation field of the rule. The value is a JSON string. The HTML escape characters are reversed.</p>
             * 
             * <strong>example:</strong>
             * <p>[&quot;asset_id&quot;]</p>
             */
            public Builder ruleGroup(String ruleGroup) {
                this.ruleGroup = ruleGroup;
                return this;
            }

            /**
             * <p>The name of the rule.</p>
             * 
             * <strong>example:</strong>
             * <p>waf_scan</p>
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * <p>The threshold configuration of the rule. The value is in the JSON format. The HTML escape characters are reversed.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;aggregateFunction&quot;:&quot;count&quot;,&quot;aggregateFunctionName&quot;:&quot;count&quot;,&quot;field&quot;:&quot;activity_name&quot;,&quot;operator&quot;:&quot;&lt;=&quot;,&quot;value&quot;:1}</p>
             */
            public Builder ruleThreshold(String ruleThreshold) {
                this.ruleThreshold = ruleThreshold;
                return this;
            }

            /**
             * <p>The type of the rule. Valid values:</p>
             * <ul>
             * <li>predefine</li>
             * <li>customize</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>customize</p>
             */
            public Builder ruleType(String ruleType) {
                this.ruleType = ruleType;
                return this;
            }

            /**
             * <p>The rule status. Valid values:</p>
             * <ul>
             * <li>0: The rule is in the initial state.</li>
             * <li>10: The simulation data is tested.</li>
             * <li>15: The business data is being tested.</li>
             * <li>20: The business data test ends.</li>
             * <li>100: The rule takes effect.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The risk level. Valid values:</p>
             * <ul>
             * <li>serious: high</li>
             * <li>suspicious: medium</li>
             * <li>remind: low</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>remind</p>
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
