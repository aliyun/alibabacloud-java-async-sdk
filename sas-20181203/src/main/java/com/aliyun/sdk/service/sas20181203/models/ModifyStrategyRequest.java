// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyStrategyRequest} extends {@link RequestModel}
 *
 * <p>ModifyStrategyRequest</p>
 */
public class ModifyStrategyRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CustomType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String customType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CycleDays")
    @com.aliyun.core.annotation.Validation(required = true)
    private String cycleDays;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CycleStartTime")
    private String cycleStartTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EndTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Id")
    private String id;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RiskCustomParams")
    private String riskCustomParams;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RiskSubTypeName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String riskSubTypeName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SourceIp")
    private String sourceIp;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("StartTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String startTime;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TargetType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetType;

    private ModifyStrategyRequest(Builder builder) {
        super(builder);
        this.customType = builder.customType;
        this.cycleDays = builder.cycleDays;
        this.cycleStartTime = builder.cycleStartTime;
        this.endTime = builder.endTime;
        this.id = builder.id;
        this.name = builder.name;
        this.riskCustomParams = builder.riskCustomParams;
        this.riskSubTypeName = builder.riskSubTypeName;
        this.sourceIp = builder.sourceIp;
        this.startTime = builder.startTime;
        this.targetType = builder.targetType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModifyStrategyRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return customType
     */
    public String getCustomType() {
        return this.customType;
    }

    /**
     * @return cycleDays
     */
    public String getCycleDays() {
        return this.cycleDays;
    }

    /**
     * @return cycleStartTime
     */
    public String getCycleStartTime() {
        return this.cycleStartTime;
    }

    /**
     * @return endTime
     */
    public String getEndTime() {
        return this.endTime;
    }

    /**
     * @return id
     */
    public String getId() {
        return this.id;
    }

    /**
     * @return name
     */
    public String getName() {
        return this.name;
    }

    /**
     * @return riskCustomParams
     */
    public String getRiskCustomParams() {
        return this.riskCustomParams;
    }

    /**
     * @return riskSubTypeName
     */
    public String getRiskSubTypeName() {
        return this.riskSubTypeName;
    }

    /**
     * @return sourceIp
     */
    public String getSourceIp() {
        return this.sourceIp;
    }

    /**
     * @return startTime
     */
    public String getStartTime() {
        return this.startTime;
    }

    /**
     * @return targetType
     */
    public String getTargetType() {
        return this.targetType;
    }

    public static final class Builder extends Request.Builder<ModifyStrategyRequest, Builder> {
        private String customType; 
        private String cycleDays; 
        private String cycleStartTime; 
        private String endTime; 
        private String id; 
        private String name; 
        private String riskCustomParams; 
        private String riskSubTypeName; 
        private String sourceIp; 
        private String startTime; 
        private String targetType; 

        private Builder() {
            super();
        } 

        private Builder(ModifyStrategyRequest request) {
            super(request);
            this.customType = request.customType;
            this.cycleDays = request.cycleDays;
            this.cycleStartTime = request.cycleStartTime;
            this.endTime = request.endTime;
            this.id = request.id;
            this.name = request.name;
            this.riskCustomParams = request.riskCustomParams;
            this.riskSubTypeName = request.riskSubTypeName;
            this.sourceIp = request.sourceIp;
            this.startTime = request.startTime;
            this.targetType = request.targetType;
        } 

        /**
         * The type of the baseline check policy. Valid values:
         * <p>
         * 
         * *   **custom**: a custom baseline check policy
         * *   **common**: a standard baseline check policy
         */
        public Builder customType(String customType) {
            this.putQueryParameter("CustomType", customType);
            this.customType = customType;
            return this;
        }

        /**
         * The new interval of the baseline check. Valid values:
         * <p>
         * 
         * *   **1**: every 2 days
         * *   **3**: every 4 days
         * *   **7**: every 8 days
         * *   **30**: every 31 days
         */
        public Builder cycleDays(String cycleDays) {
            this.putQueryParameter("CycleDays", cycleDays);
            this.cycleDays = cycleDays;
            return this;
        }

        /**
         * The new time range during which the baseline check starts. Valid values:
         * <p>
         * 
         * *   **0**: The baseline check starts within the time range from 00:00 to 06:00.
         * *   **6**: The baseline check starts within the time range from 06:00 to 12:00.
         * *   **12**: The baseline check starts within the time range from 12:00 to 18:00.
         * *   **18**: The baseline check starts within the time range from 18:00 to 24:00.
         * 
         * >  This parameter is deprecated.
         */
        public Builder cycleStartTime(String cycleStartTime) {
            this.putQueryParameter("CycleStartTime", cycleStartTime);
            this.cycleStartTime = cycleStartTime;
            return this;
        }

        /**
         * The time when the baseline check based on the baseline check policy ends. Specify the time in the hh:mm:ss format.
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * The ID of the baseline check policy.
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * The new name of the baseline check policy.
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * The custom configurations of the baseline. The value of this parameter is in the JSON format and contains the following fields:
         * <p>
         * 
         * *   **typeName**: the name of the baseline.
         * 
         * *   **checkDetails**: the details of the baseline. The value is in the JSON format.
         * 
         *     *   **checkId**: the ID of the check item.
         * 
         *     *   **rules**: the rule configurations. The value is in the JSON format.
         * 
         *         *   **ruleId**: the ID of the rule.
         * 
         *         *   **paramList**: the list of parameters in the rule. The value is in the JSON format.
         * 
         *             *   **paramName**: the name of the parameter.
         *             *   **value**: the value of the parameter.
         */
        public Builder riskCustomParams(String riskCustomParams) {
            this.putQueryParameter("RiskCustomParams", riskCustomParams);
            this.riskCustomParams = riskCustomParams;
            return this;
        }

        /**
         * The subtype of the baselines. You can call the [DescribeRiskType](~~DescribeRiskType~~) operation to query the subtypes of baselines.
         */
        public Builder riskSubTypeName(String riskSubTypeName) {
            this.putQueryParameter("RiskSubTypeName", riskSubTypeName);
            this.riskSubTypeName = riskSubTypeName;
            return this;
        }

        /**
         * The source IP address of the request.
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * The time when the baseline check based on the baseline check policy starts. Specify the time in the hh:mm:ss format.
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * The method that is used to apply the baseline check policy. Valid values:
         * <p>
         * 
         * *   **groupId**: asset groups
         * *   **uuid**: assets
         */
        public Builder targetType(String targetType) {
            this.putQueryParameter("TargetType", targetType);
            this.targetType = targetType;
            return this;
        }

        @Override
        public ModifyStrategyRequest build() {
            return new ModifyStrategyRequest(this);
        } 

    } 

}
