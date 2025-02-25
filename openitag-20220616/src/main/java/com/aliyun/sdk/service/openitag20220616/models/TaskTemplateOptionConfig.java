// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openitag20220616.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TaskTemplateOptionConfig} extends {@link TeaModel}
 *
 * <p>TaskTemplateOptionConfig</p>
 */
public class TaskTemplateOptionConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DefaultResult")
    private String defaultResult;

    @com.aliyun.core.annotation.NameInMap("Options")
    private java.util.List < QuestionOption > options;

    @com.aliyun.core.annotation.NameInMap("PreOptions")
    private java.util.List < String > preOptions;

    @com.aliyun.core.annotation.NameInMap("Rule")
    private String rule;

    private TaskTemplateOptionConfig(Builder builder) {
        this.defaultResult = builder.defaultResult;
        this.options = builder.options;
        this.preOptions = builder.preOptions;
        this.rule = builder.rule;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TaskTemplateOptionConfig create() {
        return builder().build();
    }

    /**
     * @return defaultResult
     */
    public String getDefaultResult() {
        return this.defaultResult;
    }

    /**
     * @return options
     */
    public java.util.List < QuestionOption > getOptions() {
        return this.options;
    }

    /**
     * @return preOptions
     */
    public java.util.List < String > getPreOptions() {
        return this.preOptions;
    }

    /**
     * @return rule
     */
    public String getRule() {
        return this.rule;
    }

    public static final class Builder {
        private String defaultResult; 
        private java.util.List < QuestionOption > options; 
        private java.util.List < String > preOptions; 
        private String rule; 

        /**
         * DefaultResult.
         */
        public Builder defaultResult(String defaultResult) {
            this.defaultResult = defaultResult;
            return this;
        }

        /**
         * Options.
         */
        public Builder options(java.util.List < QuestionOption > options) {
            this.options = options;
            return this;
        }

        /**
         * PreOptions.
         */
        public Builder preOptions(java.util.List < String > preOptions) {
            this.preOptions = preOptions;
            return this;
        }

        /**
         * Rule.
         */
        public Builder rule(String rule) {
            this.rule = rule;
            return this;
        }

        public TaskTemplateOptionConfig build() {
            return new TaskTemplateOptionConfig(this);
        } 

    } 

}
