// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

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
 * {@link SmartClusterRule} extends {@link TeaModel}
 *
 * <p>SmartClusterRule</p>
 */
public class SmartClusterRule extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("BaseURIs")
    private java.util.List<String> baseURIs;

    @com.aliyun.core.annotation.NameInMap("Keywords")
    private java.util.List<String> keywords;

    @com.aliyun.core.annotation.NameInMap("RuleType")
    private String ruleType;

    @com.aliyun.core.annotation.NameInMap("Sensitivity")
    private Float sensitivity;

    private SmartClusterRule(Builder builder) {
        this.baseURIs = builder.baseURIs;
        this.keywords = builder.keywords;
        this.ruleType = builder.ruleType;
        this.sensitivity = builder.sensitivity;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SmartClusterRule create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return baseURIs
     */
    public java.util.List<String> getBaseURIs() {
        return this.baseURIs;
    }

    /**
     * @return keywords
     */
    public java.util.List<String> getKeywords() {
        return this.keywords;
    }

    /**
     * @return ruleType
     */
    public String getRuleType() {
        return this.ruleType;
    }

    /**
     * @return sensitivity
     */
    public Float getSensitivity() {
        return this.sensitivity;
    }

    public static final class Builder {
        private java.util.List<String> baseURIs; 
        private java.util.List<String> keywords; 
        private String ruleType; 
        private Float sensitivity; 

        private Builder() {
        } 

        private Builder(SmartClusterRule model) {
            this.baseURIs = model.baseURIs;
            this.keywords = model.keywords;
            this.ruleType = model.ruleType;
            this.sensitivity = model.sensitivity;
        } 

        /**
         * BaseURIs.
         */
        public Builder baseURIs(java.util.List<String> baseURIs) {
            this.baseURIs = baseURIs;
            return this;
        }

        /**
         * Keywords.
         */
        public Builder keywords(java.util.List<String> keywords) {
            this.keywords = keywords;
            return this;
        }

        /**
         * RuleType.
         */
        public Builder ruleType(String ruleType) {
            this.ruleType = ruleType;
            return this;
        }

        /**
         * Sensitivity.
         */
        public Builder sensitivity(Float sensitivity) {
            this.sensitivity = sensitivity;
            return this;
        }

        public SmartClusterRule build() {
            return new SmartClusterRule(this);
        } 

    } 

}
