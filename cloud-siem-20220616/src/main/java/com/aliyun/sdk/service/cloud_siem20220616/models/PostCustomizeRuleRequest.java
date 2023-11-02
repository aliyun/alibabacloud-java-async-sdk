// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloud_siem20220616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PostCustomizeRuleRequest} extends {@link RequestModel}
 *
 * <p>PostCustomizeRuleRequest</p>
 */
public class PostCustomizeRuleRequest extends Request {
    @Body
    @NameInMap("AlertType")
    private String alertType;

    @Body
    @NameInMap("AlertTypeMds")
    private String alertTypeMds;

    @Body
    @NameInMap("EventTransferExt")
    private String eventTransferExt;

    @Body
    @NameInMap("EventTransferSwitch")
    private Integer eventTransferSwitch;

    @Body
    @NameInMap("EventTransferType")
    private String eventTransferType;

    @Body
    @NameInMap("Id")
    private Long id;

    @Body
    @NameInMap("LogSource")
    private String logSource;

    @Body
    @NameInMap("LogSourceMds")
    private String logSourceMds;

    @Body
    @NameInMap("LogType")
    private String logType;

    @Body
    @NameInMap("LogTypeMds")
    private String logTypeMds;

    @Body
    @NameInMap("QueryCycle")
    private String queryCycle;

    @Body
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("RuleCondition")
    private String ruleCondition;

    @Body
    @NameInMap("RuleDesc")
    private String ruleDesc;

    @Body
    @NameInMap("RuleGroup")
    private String ruleGroup;

    @Body
    @NameInMap("RuleName")
    private String ruleName;

    @Body
    @NameInMap("RuleThreshold")
    private String ruleThreshold;

    @Body
    @NameInMap("ThreatLevel")
    private String threatLevel;

    private PostCustomizeRuleRequest(Builder builder) {
        super(builder);
        this.alertType = builder.alertType;
        this.alertTypeMds = builder.alertTypeMds;
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
            this.ruleCondition = request.ruleCondition;
            this.ruleDesc = request.ruleDesc;
            this.ruleGroup = request.ruleGroup;
            this.ruleName = request.ruleName;
            this.ruleThreshold = request.ruleThreshold;
            this.threatLevel = request.threatLevel;
        } 

        /**
         * AlertType.
         */
        public Builder alertType(String alertType) {
            this.putBodyParameter("AlertType", alertType);
            this.alertType = alertType;
            return this;
        }

        /**
         * AlertTypeMds.
         */
        public Builder alertTypeMds(String alertTypeMds) {
            this.putBodyParameter("AlertTypeMds", alertTypeMds);
            this.alertTypeMds = alertTypeMds;
            return this;
        }

        /**
         * EventTransferExt.
         */
        public Builder eventTransferExt(String eventTransferExt) {
            this.putBodyParameter("EventTransferExt", eventTransferExt);
            this.eventTransferExt = eventTransferExt;
            return this;
        }

        /**
         * EventTransferSwitch.
         */
        public Builder eventTransferSwitch(Integer eventTransferSwitch) {
            this.putBodyParameter("EventTransferSwitch", eventTransferSwitch);
            this.eventTransferSwitch = eventTransferSwitch;
            return this;
        }

        /**
         * EventTransferType.
         */
        public Builder eventTransferType(String eventTransferType) {
            this.putBodyParameter("EventTransferType", eventTransferType);
            this.eventTransferType = eventTransferType;
            return this;
        }

        /**
         * Id.
         */
        public Builder id(Long id) {
            this.putBodyParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * LogSource.
         */
        public Builder logSource(String logSource) {
            this.putBodyParameter("LogSource", logSource);
            this.logSource = logSource;
            return this;
        }

        /**
         * LogSourceMds.
         */
        public Builder logSourceMds(String logSourceMds) {
            this.putBodyParameter("LogSourceMds", logSourceMds);
            this.logSourceMds = logSourceMds;
            return this;
        }

        /**
         * LogType.
         */
        public Builder logType(String logType) {
            this.putBodyParameter("LogType", logType);
            this.logType = logType;
            return this;
        }

        /**
         * LogTypeMds.
         */
        public Builder logTypeMds(String logTypeMds) {
            this.putBodyParameter("LogTypeMds", logTypeMds);
            this.logTypeMds = logTypeMds;
            return this;
        }

        /**
         * QueryCycle.
         */
        public Builder queryCycle(String queryCycle) {
            this.putBodyParameter("QueryCycle", queryCycle);
            this.queryCycle = queryCycle;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putBodyParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * RuleCondition.
         */
        public Builder ruleCondition(String ruleCondition) {
            this.putBodyParameter("RuleCondition", ruleCondition);
            this.ruleCondition = ruleCondition;
            return this;
        }

        /**
         * RuleDesc.
         */
        public Builder ruleDesc(String ruleDesc) {
            this.putBodyParameter("RuleDesc", ruleDesc);
            this.ruleDesc = ruleDesc;
            return this;
        }

        /**
         * RuleGroup.
         */
        public Builder ruleGroup(String ruleGroup) {
            this.putBodyParameter("RuleGroup", ruleGroup);
            this.ruleGroup = ruleGroup;
            return this;
        }

        /**
         * RuleName.
         */
        public Builder ruleName(String ruleName) {
            this.putBodyParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * RuleThreshold.
         */
        public Builder ruleThreshold(String ruleThreshold) {
            this.putBodyParameter("RuleThreshold", ruleThreshold);
            this.ruleThreshold = ruleThreshold;
            return this;
        }

        /**
         * ThreatLevel.
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
