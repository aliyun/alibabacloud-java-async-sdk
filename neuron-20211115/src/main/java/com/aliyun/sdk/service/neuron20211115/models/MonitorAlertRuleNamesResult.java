// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.neuron20211115.models;

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
 * {@link MonitorAlertRuleNamesResult} extends {@link TeaModel}
 *
 * <p>MonitorAlertRuleNamesResult</p>
 */
public class MonitorAlertRuleNamesResult extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ruleNames")
    private java.util.List<String> ruleNames;

    private MonitorAlertRuleNamesResult(Builder builder) {
        this.ruleNames = builder.ruleNames;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static MonitorAlertRuleNamesResult create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return ruleNames
     */
    public java.util.List<String> getRuleNames() {
        return this.ruleNames;
    }

    public static final class Builder {
        private java.util.List<String> ruleNames; 

        private Builder() {
        } 

        private Builder(MonitorAlertRuleNamesResult model) {
            this.ruleNames = model.ruleNames;
        } 

        /**
         * ruleNames.
         */
        public Builder ruleNames(java.util.List<String> ruleNames) {
            this.ruleNames = ruleNames;
            return this;
        }

        public MonitorAlertRuleNamesResult build() {
            return new MonitorAlertRuleNamesResult(this);
        } 

    } 

}
