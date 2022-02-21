// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SwitchSchedulerRuleRequest} extends {@link RequestModel}
 *
 * <p>SwitchSchedulerRuleRequest</p>
 */
public class SwitchSchedulerRuleRequest extends Request {
    @Query
    @NameInMap("RuleName")
    @Validation(required = true)
    private String ruleName;

    @Query
    @NameInMap("RuleType")
    @Validation(required = true)
    private Integer ruleType;

    @Query
    @NameInMap("SwitchData")
    @Validation(required = true)
    private String switchData;

    private SwitchSchedulerRuleRequest(Builder builder) {
        super(builder);
        this.ruleName = builder.ruleName;
        this.ruleType = builder.ruleType;
        this.switchData = builder.switchData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SwitchSchedulerRuleRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
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
    public Integer getRuleType() {
        return this.ruleType;
    }

    /**
     * @return switchData
     */
    public String getSwitchData() {
        return this.switchData;
    }

    public static final class Builder extends Request.Builder<SwitchSchedulerRuleRequest, Builder> {
        private String ruleName; 
        private Integer ruleType; 
        private String switchData; 

        private Builder() {
            super();
        } 

        private Builder(SwitchSchedulerRuleRequest response) {
            super(response);
            this.ruleName = response.ruleName;
            this.ruleType = response.ruleType;
            this.switchData = response.switchData;
        } 

        /**
         * RuleName.
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * RuleType.
         */
        public Builder ruleType(Integer ruleType) {
            this.putQueryParameter("RuleType", ruleType);
            this.ruleType = ruleType;
            return this;
        }

        /**
         * SwitchData.
         */
        public Builder switchData(String switchData) {
            this.putQueryParameter("SwitchData", switchData);
            this.switchData = switchData;
            return this;
        }

        @Override
        public SwitchSchedulerRuleRequest build() {
            return new SwitchSchedulerRuleRequest(this);
        } 

    } 

}
