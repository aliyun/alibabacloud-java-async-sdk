// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link Rules} extends {@link TeaModel}
 *
 * <p>Rules</p>
 */
public class Rules extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("SchedulingRule")
    private SchedulingRule schedulingRule;

    private Rules(Builder builder) {
        this.schedulingRule = builder.schedulingRule;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Rules create() {
        return builder().build();
    }

    /**
     * @return schedulingRule
     */
    public SchedulingRule getSchedulingRule() {
        return this.schedulingRule;
    }

    public static final class Builder {
        private SchedulingRule schedulingRule; 

        /**
         * SchedulingRule.
         */
        public Builder schedulingRule(SchedulingRule schedulingRule) {
            this.schedulingRule = schedulingRule;
            return this;
        }

        public Rules build() {
            return new Rules(this);
        } 

    } 

}
