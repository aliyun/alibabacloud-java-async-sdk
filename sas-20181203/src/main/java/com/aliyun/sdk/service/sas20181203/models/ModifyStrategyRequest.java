// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

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
         * <p>The policy type. Valid values:</p>
         * <ul>
         * <li><strong>custom</strong>: custom policy.</li>
         * <li><strong>common</strong>: standard policy.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>common</p>
         */
        public Builder customType(String customType) {
            this.putQueryParameter("CustomType", customType);
            this.customType = customType;
            return this;
        }

        /**
         * <p>The cycle of the baseline check. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: Every 1 day.</li>
         * <li><strong>3</strong>: Every 3 days.</li>
         * <li><strong>7</strong>: Every 7 days.</li>
         * <li><strong>30</strong>: Every 30 days.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder cycleDays(String cycleDays) {
            this.putQueryParameter("CycleDays", cycleDays);
            this.cycleDays = cycleDays;
            return this;
        }

        /**
         * <p>The start time of the baseline check. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: The baseline check starts between 00:00 and 06:00.</li>
         * <li><strong>6</strong>: The baseline check starts between 06:00 and 12:00.</li>
         * <li><strong>12</strong>: The baseline check starts between 12:00 and 18:00.</li>
         * <li><strong>18</strong>: The baseline check starts between 18:00 and 24:00.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is deprecated.</p>
         * </blockquote>
         * <p>The value indicates the start hour of the daily check period, in hours.</p>
         * 
         * <strong>example:</strong>
         * <p>18</p>
         */
        public Builder cycleStartTime(String cycleStartTime) {
            this.putQueryParameter("CycleStartTime", cycleStartTime);
            this.cycleStartTime = cycleStartTime;
            return this;
        }

        /**
         * <p>The end time of the policy execution. Format: hh:mm:ss.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>05:00:00</p>
         */
        public Builder endTime(String endTime) {
            this.putQueryParameter("EndTime", endTime);
            this.endTime = endTime;
            return this;
        }

        /**
         * <p>The ID of the baseline check policy.</p>
         * 
         * <strong>example:</strong>
         * <p>245</p>
         */
        public Builder id(String id) {
            this.putQueryParameter("Id", id);
            this.id = id;
            return this;
        }

        /**
         * <p>The name of the baseline check policy.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testStrategy</p>
         */
        public Builder name(String name) {
            this.putQueryParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * <p>The custom configuration of baseline check items. The value is in JSON format and contains the following parameters:</p>
         * <ul>
         * <li><p><strong>typeName</strong>: The baseline name.</p>
         * </li>
         * <li><p><strong>checkDetails</strong>: The check details. The value is in JSON format.</p>
         * <ul>
         * <li><p><strong>checkId</strong>: The ID of the check item.</p>
         * </li>
         * <li><p><strong>rules</strong>: The policy configuration. The value is in JSON format.</p>
         * <ul>
         * <li><p><strong>ruleId</strong>: The ID of the policy configuration.</p>
         * </li>
         * <li><p><strong>paramList</strong>: The collection of policy parameter settings. The value is in JSON format.</p>
         * <ul>
         * <li><strong>paramName</strong>: The parameter name.</li>
         * <li><strong>value</strong>: The parameter settings value.</li>
         * </ul>
         * </li>
         * </ul>
         * </li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;typeName&quot;:&quot;hc_centos_6_custom&quot;,&quot;checkDetails&quot;:[{&quot;checkId&quot;:4,&quot;rules&quot;:[{&quot;ruleId&quot;:&quot;pass_min_days_login_defs.must.cus&quot;,&quot;paramList&quot;:[{&quot;paramName&quot;:&quot;range_val&quot;,&quot;value&quot;:&quot;7&quot;}]}]}]}]</p>
         */
        public Builder riskCustomParams(String riskCustomParams) {
            this.putQueryParameter("RiskCustomParams", riskCustomParams);
            this.riskCustomParams = riskCustomParams;
            return this;
        }

        /**
         * <p>The subtype of the check item. You can call the <a href="~~DescribeRiskType~~">DescribeRiskType</a> operation to obtain the subtype.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>hc_exploit_redis</p>
         */
        public Builder riskSubTypeName(String riskSubTypeName) {
            this.putQueryParameter("RiskSubTypeName", riskSubTypeName);
            this.riskSubTypeName = riskSubTypeName;
            return this;
        }

        /**
         * <p>The source IP address of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>192.168.X.X</p>
         */
        public Builder sourceIp(String sourceIp) {
            this.putQueryParameter("SourceIp", sourceIp);
            this.sourceIp = sourceIp;
            return this;
        }

        /**
         * <p>The start time of the policy execution. Format: hh:mm:ss.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>00:01:00</p>
         */
        public Builder startTime(String startTime) {
            this.putQueryParameter("StartTime", startTime);
            this.startTime = startTime;
            return this;
        }

        /**
         * <p>The scan method of the policy. Valid values:</p>
         * <ul>
         * <li><strong>groupId</strong>: group-based scan.</li>
         * <li><strong>uuid</strong>: asset-based scan.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>groupId</p>
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
