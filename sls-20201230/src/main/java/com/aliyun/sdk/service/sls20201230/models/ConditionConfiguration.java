// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.sdk.gateway.sls.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * 
 * {@link ConditionConfiguration} extends {@link TeaModel}
 *
 * <p>ConditionConfiguration</p>
 */
public class ConditionConfiguration extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("condition")
    private String condition;

    @com.aliyun.core.annotation.NameInMap("countCondition")
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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(ConditionConfiguration model) {
            this.condition = model.condition;
            this.countCondition = model.countCondition;
        } 

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
