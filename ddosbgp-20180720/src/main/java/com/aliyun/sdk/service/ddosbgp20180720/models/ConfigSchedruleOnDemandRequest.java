// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20180720.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ConfigSchedruleOnDemandRequest} extends {@link RequestModel}
 *
 * <p>ConfigSchedruleOnDemandRequest</p>
 */
public class ConfigSchedruleOnDemandRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("InstanceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String instanceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleAction")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ruleAction;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleConditionCnt")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ruleConditionCnt;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleConditionKpps")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ruleConditionKpps;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleConditionMbps")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ruleConditionMbps;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ruleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleSwitch")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ruleSwitch;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleUndoBeginTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ruleUndoBeginTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleUndoEndTime")
    private String ruleUndoEndTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleUndoMode")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ruleUndoMode;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TimeZone")
    @com.aliyun.core.annotation.Validation(required = true)
    private String timeZone;

    private ConfigSchedruleOnDemandRequest(Builder builder) {
        super(builder);
        this.instanceId = builder.instanceId;
        this.regionId = builder.regionId;
        this.ruleAction = builder.ruleAction;
        this.ruleConditionCnt = builder.ruleConditionCnt;
        this.ruleConditionKpps = builder.ruleConditionKpps;
        this.ruleConditionMbps = builder.ruleConditionMbps;
        this.ruleName = builder.ruleName;
        this.ruleSwitch = builder.ruleSwitch;
        this.ruleUndoBeginTime = builder.ruleUndoBeginTime;
        this.ruleUndoEndTime = builder.ruleUndoEndTime;
        this.ruleUndoMode = builder.ruleUndoMode;
        this.timeZone = builder.timeZone;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConfigSchedruleOnDemandRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return instanceId
     */
    public String getInstanceId() {
        return this.instanceId;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return ruleAction
     */
    public String getRuleAction() {
        return this.ruleAction;
    }

    /**
     * @return ruleConditionCnt
     */
    public String getRuleConditionCnt() {
        return this.ruleConditionCnt;
    }

    /**
     * @return ruleConditionKpps
     */
    public String getRuleConditionKpps() {
        return this.ruleConditionKpps;
    }

    /**
     * @return ruleConditionMbps
     */
    public String getRuleConditionMbps() {
        return this.ruleConditionMbps;
    }

    /**
     * @return ruleName
     */
    public String getRuleName() {
        return this.ruleName;
    }

    /**
     * @return ruleSwitch
     */
    public String getRuleSwitch() {
        return this.ruleSwitch;
    }

    /**
     * @return ruleUndoBeginTime
     */
    public String getRuleUndoBeginTime() {
        return this.ruleUndoBeginTime;
    }

    /**
     * @return ruleUndoEndTime
     */
    public String getRuleUndoEndTime() {
        return this.ruleUndoEndTime;
    }

    /**
     * @return ruleUndoMode
     */
    public String getRuleUndoMode() {
        return this.ruleUndoMode;
    }

    /**
     * @return timeZone
     */
    public String getTimeZone() {
        return this.timeZone;
    }

    public static final class Builder extends Request.Builder<ConfigSchedruleOnDemandRequest, Builder> {
        private String instanceId; 
        private String regionId; 
        private String ruleAction; 
        private String ruleConditionCnt; 
        private String ruleConditionKpps; 
        private String ruleConditionMbps; 
        private String ruleName; 
        private String ruleSwitch; 
        private String ruleUndoBeginTime; 
        private String ruleUndoEndTime; 
        private String ruleUndoMode; 
        private String timeZone; 

        private Builder() {
            super();
        } 

        private Builder(ConfigSchedruleOnDemandRequest request) {
            super(request);
            this.instanceId = request.instanceId;
            this.regionId = request.regionId;
            this.ruleAction = request.ruleAction;
            this.ruleConditionCnt = request.ruleConditionCnt;
            this.ruleConditionKpps = request.ruleConditionKpps;
            this.ruleConditionMbps = request.ruleConditionMbps;
            this.ruleName = request.ruleName;
            this.ruleSwitch = request.ruleSwitch;
            this.ruleUndoBeginTime = request.ruleUndoBeginTime;
            this.ruleUndoEndTime = request.ruleUndoEndTime;
            this.ruleUndoMode = request.ruleUndoMode;
            this.timeZone = request.timeZone;
        } 

        /**
         * <p>The ID of the on-demand instance.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/152120.html">DescribeOnDemandInstance</a> operation to query the IDs of all on-demand instances.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ddosbgp-cn-z2q1qzxb****</p>
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * <p>The region ID of the on-demand instance.</p>
         * <blockquote>
         * <p> You can call the <a href="https://help.aliyun.com/document_detail/118703.html">DescribeRegions</a> operation to query the most recent region list.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>cn-zhangjiakou</p>
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The scheduling action. Set the value to <strong>declare</strong>, which indicates that the route is advertised.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>declare</p>
         */
        public Builder ruleAction(String ruleAction) {
            this.putQueryParameter("RuleAction", ruleAction);
            this.ruleAction = ruleAction;
            return this;
        }

        /**
         * <p>If the inbound bandwidth or packets consecutively exceed the threshold for the specified number of times, the scheduling rule is triggered and traffic is rerouted to the on-demand instance. The specified number of times is the value of this parameter.</p>
         * <blockquote>
         * <p> The threshold of inbound bandwidth is the value of <strong>RuleConditionMbps</strong>. The threshold of inbound packets is the value of <strong>RuleConditionKpps</strong>.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        public Builder ruleConditionCnt(String ruleConditionCnt) {
            this.putQueryParameter("RuleConditionCnt", ruleConditionCnt);
            this.ruleConditionCnt = ruleConditionCnt;
            return this;
        }

        /**
         * <p>The threshold of inbound packets. Unit: kilo packets per second (Kpps). Minimum value: <strong>10</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder ruleConditionKpps(String ruleConditionKpps) {
            this.putQueryParameter("RuleConditionKpps", ruleConditionKpps);
            this.ruleConditionKpps = ruleConditionKpps;
            return this;
        }

        /**
         * <p>The threshold of inbound bandwidth. Unit: Mbit/s. Minimum value: <strong>100</strong>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder ruleConditionMbps(String ruleConditionMbps) {
            this.putQueryParameter("RuleConditionMbps", ruleConditionMbps);
            this.ruleConditionMbps = ruleConditionMbps;
            return this;
        }

        /**
         * <p>The name of the scheduling rule.</p>
         * <p>The name can contain lowercase letters, digits, hyphens (-), and underscores (_). The name can be up to 32 characters in length. We recommend that you use the ID of the on-demand instance as the name. Example: <code>ddosbgp-cn-z2q1qzxb****</code>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ddosbgp-cn-z2q1qzxb****</p>
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * <p>Specifies whether the scheduling rule is enabled. Valid values:</p>
         * <ul>
         * <li><strong>on</strong></li>
         * <li><strong>off</strong></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        public Builder ruleSwitch(String ruleSwitch) {
            this.putQueryParameter("RuleSwitch", ruleSwitch);
            this.ruleSwitch = ruleSwitch;
            return this;
        }

        /**
         * <p>The start time of the period during which the scheduling rule is automatically stopped. The time must be in the 24-hour clock and in the <code>hh:mm</code> format.</p>
         * <p>If the system detects that DDoS attacks stop, the system no longer reroutes traffic to the on-demand instance from the time you specified. We recommend that you set this parameter to a value that is defined as off-peak hours.</p>
         * <blockquote>
         * <p> This parameter takes effect only when the value of <strong>RuleUndoMode</strong> is <strong>auto</strong>.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>03:00</p>
         */
        public Builder ruleUndoBeginTime(String ruleUndoBeginTime) {
            this.putQueryParameter("RuleUndoBeginTime", ruleUndoBeginTime);
            this.ruleUndoBeginTime = ruleUndoBeginTime;
            return this;
        }

        /**
         * <p>The end time of the period during which the scheduling rule is automatically stopped. The time must be in the 24-hour clock and in the <code>hh:mm</code> format.</p>
         * 
         * <strong>example:</strong>
         * <p>03:05</p>
         */
        public Builder ruleUndoEndTime(String ruleUndoEndTime) {
            this.putQueryParameter("RuleUndoEndTime", ruleUndoEndTime);
            this.ruleUndoEndTime = ruleUndoEndTime;
            return this;
        }

        /**
         * <p>The stop method of the scheduling rule. Valid values:</p>
         * <ul>
         * <li><strong>auto</strong></li>
         * <li><strong>manual</strong></li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>manual</p>
         */
        public Builder ruleUndoMode(String ruleUndoMode) {
            this.putQueryParameter("RuleUndoMode", ruleUndoMode);
            this.ruleUndoMode = ruleUndoMode;
            return this;
        }

        /**
         * <p>The time zone of the time when the scheduling rule automatically stops. The time zone must be in the <code>GMT-hh:mm</code> format.</p>
         * <p>For example, the value <code>GMT-08:00</code> indicates that the time zone is UTC+8.</p>
         * <blockquote>
         * <p> This parameter takes effect only when the value of <strong>RuleUndoMode</strong> is <strong>auto</strong>.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>GMT-08:00</p>
         */
        public Builder timeZone(String timeZone) {
            this.putQueryParameter("TimeZone", timeZone);
            this.timeZone = timeZone;
            return this;
        }

        @Override
        public ConfigSchedruleOnDemandRequest build() {
            return new ConfigSchedruleOnDemandRequest(this);
        } 

    } 

}
