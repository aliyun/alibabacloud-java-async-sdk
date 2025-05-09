// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ddoscoo20200101.models;

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
 * {@link SwitchSchedulerRuleRequest} extends {@link RequestModel}
 *
 * <p>SwitchSchedulerRuleRequest</p>
 */
public class SwitchSchedulerRuleRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String ruleName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RuleType")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer ruleType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SwitchData")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>The name of the scheduling rule to manage.</p>
         * <blockquote>
         * <p>You can call the <a href="https://help.aliyun.com/document_detail/157481.html">DescribeSchedulerRules</a> operation to query the names of all scheduling rules.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>testrule</p>
         */
        public Builder ruleName(String ruleName) {
            this.putQueryParameter("RuleName", ruleName);
            this.ruleName = ruleName;
            return this;
        }

        /**
         * <p>The type of the scheduling rule. Valid values:</p>
         * <ul>
         * <li><strong>2</strong>: tiered protection rule</li>
         * <li><strong>3</strong>: network acceleration rule</li>
         * <li><strong>5</strong>: Alibaba Cloud CDN (CDN) interaction rule</li>
         * <li><strong>6</strong>: cloud service interaction rule</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        public Builder ruleType(Integer ruleType) {
            this.putQueryParameter("RuleType", ruleType);
            this.ruleType = ruleType;
            return this;
        }

        /**
         * <p>The configuration that is used to switch service traffic. This parameter is a string that consists of JSON arrays. Each element in a JSON array is a JSON struct that includes the following parameters:</p>
         * <ul>
         * <li><p><strong>Value</strong>: required. The IP address of the associated resource. Data type: string.</p>
         * </li>
         * <li><p><strong>State</strong>: required. The operation type. Data type: integer. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: switches service traffic from the associated resource to your Anti-DDoS Pro or Anti-DDoS Premium instance for scrubbing.</li>
         * <li><strong>1</strong>: switches service traffic back to the associated cloud resource.</li>
         * </ul>
         * </li>
         * <li><p><strong>Interval</strong>: optional. The waiting time that is required before the service traffic is switched back. Unit: minutes. Data type: integer. Usage notes:</p>
         * <ul>
         * <li>If the <strong>State</strong> parameter is set to <strong>0</strong>, you must set this parameter to **-1**. Otherwise, the call fails.</li>
         * <li>If the <strong>State</strong> parameter is set to <strong>1</strong>, you do not need to set this parameter.</li>
         * </ul>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>[{&quot;Value&quot;:&quot;39.104.XX.XX&quot;,&quot;State&quot;:0,&quot;Interval&quot;:-1}]</p>
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
