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
    @com.aliyun.core.annotation.NameInMap("condition")
    private String condition;

    @com.aliyun.core.annotation.NameInMap("countCondition")
    private String countCondition;

    @com.aliyun.core.annotation.NameInMap("countOperator")
    @Deprecated
    private String countOperator;

    @com.aliyun.core.annotation.NameInMap("countThreshold")
    @Deprecated
    private Long countThreshold;

    @com.aliyun.core.annotation.NameInMap("matchField")
    @Deprecated
    private String matchField;

    @com.aliyun.core.annotation.NameInMap("matchOperator")
    @Deprecated
    private String matchOperator;

    @com.aliyun.core.annotation.NameInMap("matchValue")
    @Deprecated
    private String matchValue;

    @com.aliyun.core.annotation.NameInMap("operator")
    private String operator;

    @com.aliyun.core.annotation.NameInMap("rawCondition")
    @Deprecated
    private String rawCondition;

    @com.aliyun.core.annotation.NameInMap("severity")
    private String severity;

    private SlsMultiConditionCaseConfig(Builder builder) {
        this.condition = builder.condition;
        this.countCondition = builder.countCondition;
        this.countOperator = builder.countOperator;
        this.countThreshold = builder.countThreshold;
        this.matchField = builder.matchField;
        this.matchOperator = builder.matchOperator;
        this.matchValue = builder.matchValue;
        this.operator = builder.operator;
        this.rawCondition = builder.rawCondition;
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
     * @return operator
     */
    public String getOperator() {
        return this.operator;
    }

    /**
     * @return rawCondition
     */
    public String getRawCondition() {
        return this.rawCondition;
    }

    /**
     * @return severity
     */
    public String getSeverity() {
        return this.severity;
    }

    public static final class Builder {
        private String condition; 
        private String countCondition; 
        private String countOperator; 
        private Long countThreshold; 
        private String matchField; 
        private String matchOperator; 
        private String matchValue; 
        private String operator; 
        private String rawCondition; 
        private String severity; 

        private Builder() {
        } 

        private Builder(SlsMultiConditionCaseConfig model) {
            this.condition = model.condition;
            this.countCondition = model.countCondition;
            this.countOperator = model.countOperator;
            this.countThreshold = model.countThreshold;
            this.matchField = model.matchField;
            this.matchOperator = model.matchOperator;
            this.matchValue = model.matchValue;
            this.operator = model.operator;
            this.rawCondition = model.rawCondition;
            this.severity = model.severity;
        } 

        /**
         * <p>The match expression (corresponds to V1 condition, preserved as-is without structured parsing).</p>
         * 
         * <strong>example:</strong>
         * <p>Sample value</p>
         */
        public Builder condition(String condition) {
            this.condition = condition;
            return this;
        }

        /**
         * <p>The count match expression (corresponds to V1 countCondition, preserved as-is without structured parsing).</p>
         * 
         * <strong>example:</strong>
         * <p>Sample value</p>
         */
        public Builder countCondition(String countCondition) {
            this.countCondition = countCondition;
            return this;
        }

        /**
         * <p><strong>[Deprecated]</strong> The write path is disabled. Use countCondition instead.</p>
         * 
         * <strong>example:</strong>
         * <p>GTE</p>
         */
        public Builder countOperator(String countOperator) {
            this.countOperator = countOperator;
            return this;
        }

        /**
         * <p><strong>[Deprecated]</strong> The write path is disabled. Use countCondition instead.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        public Builder countThreshold(Long countThreshold) {
            this.countThreshold = countThreshold;
            return this;
        }

        /**
         * <p><strong>[Deprecated]</strong> The write path is disabled. Use condition instead.</p>
         * 
         * <strong>example:</strong>
         * <p>Sample value</p>
         */
        public Builder matchField(String matchField) {
            this.matchField = matchField;
            return this;
        }

        /**
         * <p><strong>[Deprecated]</strong> The write path is disabled. Use condition instead.</p>
         * 
         * <strong>example:</strong>
         * <p>PRESENT</p>
         */
        public Builder matchOperator(String matchOperator) {
            this.matchOperator = matchOperator;
            return this;
        }

        /**
         * <p><strong>[Deprecated]</strong> The write path is disabled. Use condition instead.</p>
         * 
         * <strong>example:</strong>
         * <p>Sample value</p>
         */
        public Builder matchValue(String matchValue) {
            this.matchValue = matchValue;
            return this;
        }

        /**
         * <p>The detection operator (aligned with V1 caseList.type): HAS_DATA / HAS_DATA_COUNT / HAS_DATA_MATCH / HAS_DATA_MATCH_COUNT.</p>
         * 
         * <strong>example:</strong>
         * <p>HAS_DATA</p>
         */
        public Builder operator(String operator) {
            this.operator = operator;
            return this;
        }

        /**
         * <p><strong>[Deprecated]</strong> The write path is disabled. Use condition instead.</p>
         * 
         * <strong>example:</strong>
         * <p>Sample value</p>
         */
        public Builder rawCondition(String rawCondition) {
            this.rawCondition = rawCondition;
            return this;
        }

        /**
         * <p>The severity level (corresponds to V1 level).</p>
         * 
         * <strong>example:</strong>
         * <p>INFO</p>
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
