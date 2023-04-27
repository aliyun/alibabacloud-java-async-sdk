// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddDesensitizationRuleRequest} extends {@link RequestModel}
 *
 * <p>AddDesensitizationRuleRequest</p>
 */
public class AddDesensitizationRuleRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("FunctionParams")
    private java.util.List < java.util.Map<String, String>> functionParams;

    @Query
    @NameInMap("FunctionType")
    @Validation(required = true)
    private String functionType;

    @Query
    @NameInMap("RuleDescription")
    private String ruleDescription;

    @Query
    @NameInMap("RuleName")
    @Validation(required = true)
    private String ruleName;

    @Query
    @NameInMap("RuleType")
    @Validation(required = true)
    private String ruleType;

    @Query
    @NameInMap("Tid")
    @Validation(minimum = 1)
    private Long tid;

    private AddDesensitizationRuleRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.functionParams = builder.functionParams;
        this.functionType = builder.functionType;
        this.ruleDescription = builder.ruleDescription;
        this.ruleName = builder.ruleName;
        this.ruleType = builder.ruleType;
        this.tid = builder.tid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddDesensitizationRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return functionParams
     */
    public java.util.List < java.util.Map<String, String>> getFunctionParams() {
        return this.functionParams;
    }

    /**
     * @return functionType
     */
    public String getFunctionType() {
        return this.functionType;
    }

    /**
     * @return ruleDescription
     */
    public String getRuleDescription() {
        return this.ruleDescription;
    }

    /**
     * @return ruleName
     */
    public String getRuleName() {
        return this.ruleName;
    }

    /**
     * @return ruleType
     */
    public String getRuleType() {
        return this.ruleType;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    public static final class Builder extends Request.Builder<AddDesensitizationRuleRequest, Builder> {
        private String regionId; 
        private java.util.List < java.util.Map<String, String>> functionParams; 
        private String functionType; 
        private String ruleDescription; 
        private String ruleName; 
        private String ruleType; 
        private Long tid; 

        private Builder() {
            super();
        } 

        private Builder(AddDesensitizationRuleRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.functionParams = request.functionParams;
            this.functionType = request.functionType;
            this.ruleDescription = request.ruleDescription;
            this.ruleName = request.ruleName;
            this.ruleType = request.ruleType;
            this.tid = request.tid;
        } 

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * FunctionParams.
         */
        public Builder functionParams(java.util.List < java.util.Map<String, String>> functionParams) {
            this.putBodyParameter("FunctionParams", functionParams);
            this.functionParams = functionParams;
            return this;
        }

        /**
         * The name of the rule.
         */
        public Builder functionType(String functionType) {
            this.putQueryParameter("FunctionType", functionType);
            this.functionType = functionType;
            return this;
        }

        /**
         * The ID of the tenant.
         * <p>
         * 
         * >  To view the ID of the tenant, go to the Data Management (DMS) console and move the pointer over the profile picture in the upper-right corner. For more information, see [View information about the current tenant](~~181330~~).
         */
        public Builder ruleDescription(String ruleDescription) {
            this.putQueryParameter("RuleDescription", ruleDescription);
            this.ruleDescription = ruleDescription;
            return this;
        }

        /**
         * The operation that you want to perform. Set the value to **AddDesensitizationRule**.
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * The error message returned if the request failed.
         */
        public Builder ruleType(String ruleType) {
            this.putQueryParameter("RuleType", ruleType);
            this.ruleType = ruleType;
            return this;
        }

        /**
         * The ID generated for the masking rule.
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
            return this;
        }

        @Override
        public AddDesensitizationRuleRequest build() {
            return new AddDesensitizationRuleRequest(this);
        } 

    } 

}
