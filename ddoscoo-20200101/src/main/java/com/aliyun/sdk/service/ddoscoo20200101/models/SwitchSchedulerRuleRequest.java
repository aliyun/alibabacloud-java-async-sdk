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

        private Builder(SwitchSchedulerRuleRequest request) {
            super(request);
            this.ruleName = request.ruleName;
            this.ruleType = request.ruleType;
            this.switchData = request.switchData;
        } 

        /**
         * The name of the scheduling rule to manage.
         * <p>
         * 
         * > You can call the [DescribeSchedulerRules](~~157481~~) operation to query the names of all scheduling rules.
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * The type of the scheduling rule. Valid values:
         * <p>
         * 
         * *   **2**: tiered protection rule
         * *   **3**: network acceleration rule
         * *   **5**: Alibaba Cloud CDN (CDN) interaction rule
         * *   **6**: cloud service interaction rule
         */
        public Builder ruleType(Integer ruleType) {
            this.putQueryParameter("RuleType", ruleType);
            this.ruleType = ruleType;
            return this;
        }

        /**
         * The configuration that is used to switch service traffic. This parameter is a string that consists of JSON arrays. Each element in a JSON array is a JSON struct that includes the following parameters:
         * <p>
         * 
         * *   **Value**: required. The IP address of the associated resource. Data type: string.
         * 
         * *   **State**: required. The operation type. Data type: integer. Valid values:
         * 
         *     *   **0**: switches service traffic from the associated resource to your Anti-DDoS Pro or Anti-DDoS Premium instance for scrubbing.
         *     *   **1**: switches service traffic back to the associated cloud resource.
         * 
         * *   **Interval**: optional. The waiting time that is required before the service traffic is switched back. Unit: minutes. Data type: integer. Usage notes:
         * 
         *     *   If the **State** parameter is set to **0**, you must set this parameter to \*\*-1\*\*. Otherwise, the call fails.
         *     *   If the **State** parameter is set to **1**, you do not need to set this parameter.
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
