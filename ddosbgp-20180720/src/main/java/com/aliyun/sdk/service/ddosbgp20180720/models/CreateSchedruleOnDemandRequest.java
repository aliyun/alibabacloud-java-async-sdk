// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddosbgp20180720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSchedruleOnDemandRequest} extends {@link RequestModel}
 *
 * <p>CreateSchedruleOnDemandRequest</p>
 */
public class CreateSchedruleOnDemandRequest extends Request {
    @Query
    @NameInMap("InstanceId")
    @Validation(required = true)
    private String instanceId;

    @Query
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("RuleAction")
    @Validation(required = true)
    private String ruleAction;

    @Query
    @NameInMap("RuleConditionCnt")
    @Validation(required = true)
    private String ruleConditionCnt;

    @Query
    @NameInMap("RuleConditionKpps")
    @Validation(required = true)
    private String ruleConditionKpps;

    @Query
    @NameInMap("RuleConditionMbps")
    @Validation(required = true)
    private String ruleConditionMbps;

    @Query
    @NameInMap("RuleName")
    @Validation(required = true)
    private String ruleName;

    @Query
    @NameInMap("RuleSwitch")
    @Validation(required = true)
    private String ruleSwitch;

    @Query
    @NameInMap("RuleUndoBeginTime")
    @Validation(required = true)
    private String ruleUndoBeginTime;

    @Query
    @NameInMap("RuleUndoEndTime")
    private String ruleUndoEndTime;

    @Query
    @NameInMap("RuleUndoMode")
    @Validation(required = true)
    private String ruleUndoMode;

    @Query
    @NameInMap("TimeZone")
    @Validation(required = true)
    private String timeZone;

    private CreateSchedruleOnDemandRequest(Builder builder) {
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

    public static CreateSchedruleOnDemandRequest create() {
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

    public static final class Builder extends Request.Builder<CreateSchedruleOnDemandRequest, Builder> {
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

        private Builder(CreateSchedruleOnDemandRequest request) {
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
         * The threshold of inbound bandwidth. Unit: Mbit/s. Minimum value: **100**.
         */
        public Builder instanceId(String instanceId) {
            this.putQueryParameter("InstanceId", instanceId);
            this.instanceId = instanceId;
            return this;
        }

        /**
         * All Alibaba Cloud API operations must include common request parameters. For more information about common request parameters, see [Common parameters](~~118841~~).
         * <p>
         * 
         * For more information about sample requests, see the **"Examples"** section of this topic.
         */
        public Builder regionId(String regionId) {
            this.putQueryParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The stop method of the scheduling rule. Valid values:
         * <p>
         * 
         * *   **auto**: The scheduling rule automatically stops.
         * *   **manual**: The scheduling rule is manually stopped.
         */
        public Builder ruleAction(String ruleAction) {
            this.putQueryParameter("RuleAction", ruleAction);
            this.ruleAction = ruleAction;
            return this;
        }

        /**
         * Specifies whether the scheduling rule is enabled. Valid values:
         * <p>
         * 
         * *   **on**: enabled
         * *   **off**: disabled
         */
        public Builder ruleConditionCnt(String ruleConditionCnt) {
            this.putQueryParameter("RuleConditionCnt", ruleConditionCnt);
            this.ruleConditionCnt = ruleConditionCnt;
            return this;
        }

        /**
         * The scheduling action. Set the value to **declare**, which indicates that the route is advertised.
         */
        public Builder ruleConditionKpps(String ruleConditionKpps) {
            this.putQueryParameter("RuleConditionKpps", ruleConditionKpps);
            this.ruleConditionKpps = ruleConditionKpps;
            return this;
        }

        /**
         * If the inbound bandwidth or packets consecutively exceed the threshold for the specified number of times, the scheduling rule is triggered and traffic is rerouted to the on-demand instance. The specified number of times is the value of this parameter.
         * <p>
         * 
         * >  The threshold of inbound bandwidth is the value of **RuleConditionMbps**. The threshold of inbound packets is the value of **RuleConditionKpps**.
         */
        public Builder ruleConditionMbps(String ruleConditionMbps) {
            this.putQueryParameter("RuleConditionMbps", ruleConditionMbps);
            this.ruleConditionMbps = ruleConditionMbps;
            return this;
        }

        /**
         * The threshold of inbound packets. Unit: Kpps. Minimum value: **10**.
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * The start time of the period during which the scheduling rule is automatically stopped. The time must be in the 24-hour clock and in the `hh:mm` format.
         * <p>
         * 
         * If the system detects that DDoS attacks stop, the system no longer reroutes traffic to the on-demand instance from the time you specified. We recommend that you set this parameter to a value that is defined as off-peak hours.
         * 
         * >  This parameter takes effect only when the **RuleUndoMode** parameter is set to **auto**.
         */
        public Builder ruleSwitch(String ruleSwitch) {
            this.putQueryParameter("RuleSwitch", ruleSwitch);
            this.ruleSwitch = ruleSwitch;
            return this;
        }

        /**
         * The time zone of the time when the scheduling rule automatically stops. The time zone must be in the `GMT-hh:mm` format.
         * <p>
         * 
         * For example, the value `GMT-08:00` indicates that the time zone is UTC+8.
         * 
         * >  This parameter takes effect only when the **RuleUndoMode** parameter is set to **auto**.
         */
        public Builder ruleUndoBeginTime(String ruleUndoBeginTime) {
            this.putQueryParameter("RuleUndoBeginTime", ruleUndoBeginTime);
            this.ruleUndoBeginTime = ruleUndoBeginTime;
            return this;
        }

        /**
         * The region ID of the on-demand instance.
         * <p>
         * 
         * >  You can call the [DescribeRegions](~~118703~~) operation to query all regions supported by Anti-DDoS Origin.
         */
        public Builder ruleUndoEndTime(String ruleUndoEndTime) {
            this.putQueryParameter("RuleUndoEndTime", ruleUndoEndTime);
            this.ruleUndoEndTime = ruleUndoEndTime;
            return this;
        }

        /**
         * The end time of the period during which the scheduling rule is automatically stopped. The time must be in the 24-hour clock and in the `hh:mm` format.
         */
        public Builder ruleUndoMode(String ruleUndoMode) {
            this.putQueryParameter("RuleUndoMode", ruleUndoMode);
            this.ruleUndoMode = ruleUndoMode;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder timeZone(String timeZone) {
            this.putQueryParameter("TimeZone", timeZone);
            this.timeZone = timeZone;
            return this;
        }

        @Override
        public CreateSchedruleOnDemandRequest build() {
            return new CreateSchedruleOnDemandRequest(this);
        } 

    } 

}
