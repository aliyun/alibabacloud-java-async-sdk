// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc20230330.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RewriteConfig} extends {@link TeaModel}
 *
 * <p>RewriteConfig</p>
 */
public class RewriteConfig extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("equalRules")
    private java.util.List < EqualRule > equalRules;

    @com.aliyun.core.annotation.NameInMap("regexRules")
    private java.util.List < RegexRule > regexRules;

    @com.aliyun.core.annotation.NameInMap("wildcardRules")
    private java.util.List < WildcardRule > wildcardRules;

    private RewriteConfig(Builder builder) {
        this.equalRules = builder.equalRules;
        this.regexRules = builder.regexRules;
        this.wildcardRules = builder.wildcardRules;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RewriteConfig create() {
        return builder().build();
    }

    /**
     * @return equalRules
     */
    public java.util.List < EqualRule > getEqualRules() {
        return this.equalRules;
    }

    /**
     * @return regexRules
     */
    public java.util.List < RegexRule > getRegexRules() {
        return this.regexRules;
    }

    /**
     * @return wildcardRules
     */
    public java.util.List < WildcardRule > getWildcardRules() {
        return this.wildcardRules;
    }

    public static final class Builder {
        private java.util.List < EqualRule > equalRules; 
        private java.util.List < RegexRule > regexRules; 
        private java.util.List < WildcardRule > wildcardRules; 

        /**
         * equalRules.
         */
        public Builder equalRules(java.util.List < EqualRule > equalRules) {
            this.equalRules = equalRules;
            return this;
        }

        /**
         * regexRules.
         */
        public Builder regexRules(java.util.List < RegexRule > regexRules) {
            this.regexRules = regexRules;
            return this;
        }

        /**
         * wildcardRules.
         */
        public Builder wildcardRules(java.util.List < WildcardRule > wildcardRules) {
            this.wildcardRules = wildcardRules;
            return this;
        }

        public RewriteConfig build() {
            return new RewriteConfig(this);
        } 

    } 

}
