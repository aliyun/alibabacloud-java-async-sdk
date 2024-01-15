// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link ConditionConfiguration} extends {@link TeaModel}
 *
 * <p>ConditionConfiguration</p>
 */
public class ConditionConfiguration extends TeaModel {
    @NameInMap("condition")
    private String condition;

    @NameInMap("countCondition")
    private String countCondition;

    private ConditionConfiguration(Builder builder) {
        this.condition = builder.condition;
        this.countCondition = builder.countCondition;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ConditionConfiguration create() {
        return builder().build();
    }

    /**
     * @return condition
     */
    public String getCondition() {
        return this.condition;
    }

    /**
     * @return countCondition
     */
    public String getCountCondition() {
        return this.countCondition;
    }

    public static final class Builder {
        private String condition; 
        private String countCondition; 

        /**
         * condition.
         */
        public Builder condition(String condition) {
            this.condition = condition;
            return this;
        }

        /**
         * countCondition.
         */
        public Builder countCondition(String countCondition) {
            this.countCondition = countCondition;
            return this;
        }

        public ConditionConfiguration build() {
            return new ConditionConfiguration(this);
        } 

    } 

}
