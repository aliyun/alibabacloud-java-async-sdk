// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PostCustomizeRuleRequest} extends {@link RequestModel}
 *
 * <p>PostCustomizeRuleRequest</p>
 */
public class PostCustomizeRuleRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AlertType")
    private String alertType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AlertTypeMds")
    private String alertTypeMds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("AttCk")
    private String attCk;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EventTransferExt")
    private String eventTransferExt;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EventTransferSwitch")
    private Integer eventTransferSwitch;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EventTransferType")
    private String eventTransferType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Id")
    private Long id;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LogSource")
    private String logSource;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LogSourceMds")
    private String logSourceMds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LogType")
    private String logType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("LogTypeMds")
    private String logTypeMds;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("QueryCycle")
    private String queryCycle;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleFor")
    private Long roleFor;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RoleType")
    private Integer roleType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RuleCondition")
    private String ruleCondition;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RuleDesc")
    private String ruleDesc;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RuleGroup")
    private String ruleGroup;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RuleName")
    private String ruleName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RuleThreshold")
    private String ruleThreshold;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ThreatLevel")
    private String threatLevel;

    private PostCustomizeRuleRequest(Builder builder) {
        super(builder);
        this.alertType = builder.alertType;
        this.alertTypeMds = builder.alertTypeMds;
        this.attCk = builder.attCk;
        this.eventTransferExt = builder.eventTransferExt;
        this.eventTransferSwitch = builder.eventTransferSwitch;
        this.eventTransferType = builder.eventTransferType;
        this.id = builder.id;
        this.logSource = builder.logSource;
        this.logSourceMds = builder.logSourceMds;
        this.logType = builder.logType;
        this.logTypeMds = builder.logTypeMds;
        this.queryCycle = builder.queryCycle;
        this.regionId = builder.regionId;
        this.roleFor = builder.roleFor;
        this.roleType = builder.roleType;
        this.ruleCondition = builder.ruleCondition;
        this.ruleDesc = builder.ruleDesc;
        this.ruleGroup = builder.ruleGroup;
        this.ruleName = builder.ruleName;
        this.ruleThreshold = builder.ruleThreshold;
        this.threatLevel = builder.threatLevel;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static PostCustomizeRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return attCk
     */
    public String getAttCk() {
        return this.attCk;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return roleFor
     */
    public Long getRoleFor() {
        return this.roleFor;
    }

    /**
     * @return roleType
     */
    public Integer getRoleType() {
        return this.roleType;
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
     * @return threatLevel
     */
    public String getThreatLevel() {
        return this.threatLevel;
    }

    public static final class Builder extends Request.Builder<PostCustomizeRuleRequest, Builder> {
        private String alertType; 
        private String alertTypeMds; 
        private String attCk; 
        private String eventTransferExt; 
        private Integer eventTransferSwitch; 
        private String eventTransferType; 
        private Long id; 
        private String logSource; 
        private String logSourceMds; 
        private String logType; 
        private String logTypeMds; 
        private String queryCycle; 
        private String regionId; 
        private Long roleFor; 
        private Integer roleType; 
        private String ruleCondition; 
        private String ruleDesc; 
        private String ruleGroup; 
        private String ruleName; 
        private String ruleThreshold; 
        private String threatLevel; 

        private Builder() {
            super();
        } 

        private Builder(PostCustomizeRuleRequest request) {
            super(request);
            this.alertType = request.alertType;
            this.alertTypeMds = request.alertTypeMds;
            this.attCk = request.attCk;
            this.eventTransferExt = request.eventTransferExt;
            this.eventTransferSwitch = request.eventTransferSwitch;
            this.eventTransferType = request.eventTransferType;
            this.id = request.id;
            this.logSource = request.logSource;
            this.logSourceMds = request.logSourceMds;
            this.logType = request.logType;
            this.logTypeMds = request.logTypeMds;
            this.queryCycle = request.queryCycle;
            this.regionId = request.regionId;
            this.roleFor = request.roleFor;
            this.roleType = request.roleType;
            this.ruleCondition = request.ruleCondition;
            this.ruleDesc = request.ruleDesc;
            this.ruleGroup = request.ruleGroup;
            this.ruleName = request.ruleName;
            this.ruleThreshold = request.ruleThreshold;
            this.threatLevel = request.threatLevel;
        } 

        /**
         * The risk type.
         */
        public Builder alertType(String alertType) {
            this.putBodyParameter("AlertType", alertType);
            this.alertType = alertType;
            return this;
        }

        /**
         * The internal code of the risk type.
         */
        public Builder alertTypeMds(String alertTypeMds) {
            this.putBodyParameter("AlertTypeMds", alertTypeMds);
            this.alertTypeMds = alertTypeMds;
            return this;
        }

        /**
         * att&ck.
         */
        public Builder attCk(String attCk) {
            this.putBodyParameter("AttCk", attCk);
            this.attCk = attCk;
            return this;
        }

        /**
         * The extended information about event generation. If eventTransferType is set to allToSingle, the value of this parameter indicates the length and unit of the alert aggregation window.
         */
        public Builder eventTransferExt(String eventTransferExt) {
            this.putBodyParameter("EventTransferExt", eventTransferExt);
            this.eventTransferExt = eventTransferExt;
            return this;
        }

        /**
         * Specifies whether to convert an alert to an event. Valid values:
         * <p>
         * 
         * *   0: no
         * *   1: yes
         */
        public Builder eventTransferSwitch(Integer eventTransferSwitch) {
            this.putBodyParameter("EventTransferSwitch", eventTransferSwitch);
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
            this.putBodyParameter("EventTransferType", eventTransferType);
            this.eventTransferType = eventTransferType;
            return this;
        }

        /**
         * The ID of the rule.
         */
        public Builder id(Long id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * The log source of the rule.
         */
        public Builder logSource(String logSource) {
            this.putBodyParameter("LogSource", logSource);
            this.logSource = logSource;
            return this;
        }

        /**
         * The internal code of the log source.
         */
        public Builder logSourceMds(String logSourceMds) {
            this.putBodyParameter("LogSourceMds", logSourceMds);
            this.logSourceMds = logSourceMds;
            return this;
        }

        /**
         * The log type of the rule.
         */
        public Builder logType(String logType) {
            this.putBodyParameter("LogType", logType);
            this.logType = logType;
            return this;
        }

        /**
         * The internal code of the log type.
         */
        public Builder logTypeMds(String logTypeMds) {
            this.putBodyParameter("LogTypeMds", logTypeMds);
            this.logTypeMds = logTypeMds;
            return this;
        }

        /**
         * The window length of the rule.
         */
        public Builder queryCycle(String queryCycle) {
            this.putBodyParameter("QueryCycle", queryCycle);
            this.queryCycle = queryCycle;
            return this;
        }

        /**
         * The region in which the data management center of the threat analysis feature resides. Specify this parameter based on the regions in which your assets reside. Valid values:
         * <p>
         * 
         * *   cn-hangzhou: Your assets reside in regions in China.
         * *   ap-southeast-1: Your assets reside in regions outside China.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The ID of the account that you switch from the management account.
         */
        public Builder roleFor(Long roleFor) {
            this.putBodyParameter("RoleFor", roleFor);
            this.roleFor = roleFor;
            return this;
        }

        /**
         * The type of the view. Valid values:
         * <p>
         * - 0: the current Alibaba Cloud account
         * - 1: the global account
         */
        public Builder roleType(Integer roleType) {
            this.putBodyParameter("RoleType", roleType);
            this.roleType = roleType;
            return this;
        }

        /**
         * The query condition of the rule. The value is in the JSON format.
         */
        public Builder ruleCondition(String ruleCondition) {
            this.putBodyParameter("RuleCondition", ruleCondition);
            this.ruleCondition = ruleCondition;
            return this;
        }

        /**
         * The description of the rule.
         */
        public Builder ruleDesc(String ruleDesc) {
            this.putBodyParameter("RuleDesc", ruleDesc);
            this.ruleDesc = ruleDesc;
            return this;
        }

        /**
         * The log aggregation field of the rule. The value is a JSON string.
         */
        public Builder ruleGroup(String ruleGroup) {
            this.putBodyParameter("RuleGroup", ruleGroup);
            this.ruleGroup = ruleGroup;
            return this;
        }

        /**
         * The name of the rule.
         */
        public Builder ruleName(String ruleName) {
            this.putBodyParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * The threshold configuration of the rule. The value is in the JSON format.
         */
        public Builder ruleThreshold(String ruleThreshold) {
            this.putBodyParameter("RuleThreshold", ruleThreshold);
            this.ruleThreshold = ruleThreshold;
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
            this.putBodyParameter("ThreatLevel", threatLevel);
            this.threatLevel = threatLevel;
            return this;
        }

        @Override
        public PostCustomizeRuleRequest build() {
            return new PostCustomizeRuleRequest(this);
        } 

    } 

}
