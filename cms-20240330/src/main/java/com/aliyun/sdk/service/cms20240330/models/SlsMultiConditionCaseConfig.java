// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20240330.models;

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
 * {@link SlsMultiConditionCaseConfig} extends {@link TeaModel}
 *
 * <p>SlsMultiConditionCaseConfig</p>
 */
public class SlsMultiConditionCaseConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("countOperator")
    private String countOperator;

    @com.aliyun.core.annotation.NameInMap("countThreshold")
    private Long countThreshold;

    @com.aliyun.core.annotation.NameInMap("matchField")
    private String matchField;

    @com.aliyun.core.annotation.NameInMap("matchOperator")
    private String matchOperator;

    @com.aliyun.core.annotation.NameInMap("matchValue")
    private String matchValue;

    @com.aliyun.core.annotation.NameInMap("severity")
    private String severity;

    private SlsMultiConditionCaseConfig(Builder builder) {
        this.countOperator = builder.countOperator;
        this.countThreshold = builder.countThreshold;
        this.matchField = builder.matchField;
        this.matchOperator = builder.matchOperator;
        this.matchValue = builder.matchValue;
        this.severity = builder.severity;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SlsMultiConditionCaseConfig create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return countOperator
     */
    public String getCountOperator() {
        return this.countOperator;
    }

    /**
     * @return countThreshold
     */
    public Long getCountThreshold() {
        return this.countThreshold;
    }

    /**
     * @return matchField
     */
    public String getMatchField() {
        return this.matchField;
    }

    /**
     * @return matchOperator
     */
    public String getMatchOperator() {
        return this.matchOperator;
    }

    /**
     * @return matchValue
     */
    public String getMatchValue() {
        return this.matchValue;
    }

    /**
     * @return severity
     */
    public String getSeverity() {
        return this.severity;
    }

    public static final class Builder {
        private String countOperator; 
        private Long countThreshold; 
        private String matchField; 
        private String matchOperator; 
        private String matchValue; 
        private String severity; 

        private Builder() {
        } 

        private Builder(SlsMultiConditionCaseConfig model) {
            this.countOperator = model.countOperator;
            this.countThreshold = model.countThreshold;
            this.matchField = model.matchField;
            this.matchOperator = model.matchOperator;
            this.matchValue = model.matchValue;
            this.severity = model.severity;
        } 

        /**
         * countOperator.
         */
        public Builder countOperator(String countOperator) {
            this.countOperator = countOperator;
            return this;
        }

        /**
         * countThreshold.
         */
        public Builder countThreshold(Long countThreshold) {
            this.countThreshold = countThreshold;
            return this;
        }

        /**
         * matchField.
         */
        public Builder matchField(String matchField) {
            this.matchField = matchField;
            return this;
        }

        /**
         * matchOperator.
         */
        public Builder matchOperator(String matchOperator) {
            this.matchOperator = matchOperator;
            return this;
        }

        /**
         * matchValue.
         */
        public Builder matchValue(String matchValue) {
            this.matchValue = matchValue;
            return this;
        }

        /**
         * severity.
         */
        public Builder severity(String severity) {
            this.severity = severity;
            return this;
        }

        public SlsMultiConditionCaseConfig build() {
            return new SlsMultiConditionCaseConfig(this);
        } 

    } 

}
