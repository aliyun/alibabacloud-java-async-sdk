// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20210320.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeploymentSetConstraints} extends {@link TeaModel}
 *
 * <p>DeploymentSetConstraints</p>
 */
public class DeploymentSetConstraints extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DefaultValue")
    private String defaultValue;

    @com.aliyun.core.annotation.NameInMap("EnableState")
    private String enableState;

    @com.aliyun.core.annotation.NameInMap("ReplacementStrategy")
    private ReplacementStrategy replacementStrategy;

    @com.aliyun.core.annotation.NameInMap("Values")
    private java.util.List < String > values;

    private DeploymentSetConstraints(Builder builder) {
        this.defaultValue = builder.defaultValue;
        this.enableState = builder.enableState;
        this.replacementStrategy = builder.replacementStrategy;
        this.values = builder.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeploymentSetConstraints create() {
        return builder().build();
    }

    /**
     * @return defaultValue
     */
    public String getDefaultValue() {
        return this.defaultValue;
    }

    /**
     * @return enableState
     */
    public String getEnableState() {
        return this.enableState;
    }

    /**
     * @return replacementStrategy
     */
    public ReplacementStrategy getReplacementStrategy() {
        return this.replacementStrategy;
    }

    /**
     * @return values
     */
    public java.util.List < String > getValues() {
        return this.values;
    }

    public static final class Builder {
        private String defaultValue; 
        private String enableState; 
        private ReplacementStrategy replacementStrategy; 
        private java.util.List < String > values; 

        /**
         * 默认值。
         */
        public Builder defaultValue(String defaultValue) {
            this.defaultValue = defaultValue;
            return this;
        }

        /**
         * EnableState.
         */
        public Builder enableState(String enableState) {
            this.enableState = enableState;
            return this;
        }

        /**
         * 替换策略。
         */
        public Builder replacementStrategy(ReplacementStrategy replacementStrategy) {
            this.replacementStrategy = replacementStrategy;
            return this;
        }

        /**
         * 枚举值。
         */
        public Builder values(java.util.List < String > values) {
            this.values = values;
            return this;
        }

        public DeploymentSetConstraints build() {
            return new DeploymentSetConstraints(this);
        } 

    } 

}
