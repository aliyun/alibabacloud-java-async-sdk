// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RewriteConfig} extends {@link TeaModel}
 *
 * <p>RewriteConfig</p>
 */
public class RewriteConfig extends TeaModel {
    @NameInMap("equalRules")
    private java.util.List < EqualRules> equalRules;

    @NameInMap("regexRules")
    private java.util.List < RegexRules> regexRules;

    @NameInMap("wildcardRules")
    private java.util.List < WildcardRules> wildcardRules;

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
    public java.util.List < EqualRules> getEqualRules() {
        return this.equalRules;
    }

    /**
     * @return regexRules
     */
    public java.util.List < RegexRules> getRegexRules() {
        return this.regexRules;
    }

    /**
     * @return wildcardRules
     */
    public java.util.List < WildcardRules> getWildcardRules() {
        return this.wildcardRules;
    }

    public static final class Builder {
        private java.util.List < EqualRules> equalRules; 
        private java.util.List < RegexRules> regexRules; 
        private java.util.List < WildcardRules> wildcardRules; 

        /**
         * equalRules.
         */
        public Builder equalRules(java.util.List < EqualRules> equalRules) {
            this.equalRules = equalRules;
            return this;
        }

        /**
         * regexRules.
         */
        public Builder regexRules(java.util.List < RegexRules> regexRules) {
            this.regexRules = regexRules;
            return this;
        }

        /**
         * wildcardRules.
         */
        public Builder wildcardRules(java.util.List < WildcardRules> wildcardRules) {
            this.wildcardRules = wildcardRules;
            return this;
        }

        public RewriteConfig build() {
            return new RewriteConfig(this);
        } 

    } 

    public static class EqualRules extends TeaModel {
        @NameInMap("match")
        private String match;

        @NameInMap("replacement")
        private String replacement;

        private EqualRules(Builder builder) {
            this.match = builder.match;
            this.replacement = builder.replacement;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static EqualRules create() {
            return builder().build();
        }

        /**
         * @return match
         */
        public String getMatch() {
            return this.match;
        }

        /**
         * @return replacement
         */
        public String getReplacement() {
            return this.replacement;
        }

        public static final class Builder {
            private String match; 
            private String replacement; 

            /**
             * match.
             */
            public Builder match(String match) {
                this.match = match;
                return this;
            }

            /**
             * replacement.
             */
            public Builder replacement(String replacement) {
                this.replacement = replacement;
                return this;
            }

            public EqualRules build() {
                return new EqualRules(this);
            } 

        } 

    }
    public static class RegexRules extends TeaModel {
        @NameInMap("match")
        private String match;

        @NameInMap("replacement")
        private String replacement;

        private RegexRules(Builder builder) {
            this.match = builder.match;
            this.replacement = builder.replacement;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RegexRules create() {
            return builder().build();
        }

        /**
         * @return match
         */
        public String getMatch() {
            return this.match;
        }

        /**
         * @return replacement
         */
        public String getReplacement() {
            return this.replacement;
        }

        public static final class Builder {
            private String match; 
            private String replacement; 

            /**
             * match.
             */
            public Builder match(String match) {
                this.match = match;
                return this;
            }

            /**
             * replacement.
             */
            public Builder replacement(String replacement) {
                this.replacement = replacement;
                return this;
            }

            public RegexRules build() {
                return new RegexRules(this);
            } 

        } 

    }
    public static class WildcardRules extends TeaModel {
        @NameInMap("match")
        private String match;

        @NameInMap("replacement")
        private String replacement;

        private WildcardRules(Builder builder) {
            this.match = builder.match;
            this.replacement = builder.replacement;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WildcardRules create() {
            return builder().build();
        }

        /**
         * @return match
         */
        public String getMatch() {
            return this.match;
        }

        /**
         * @return replacement
         */
        public String getReplacement() {
            return this.replacement;
        }

        public static final class Builder {
            private String match; 
            private String replacement; 

            /**
             * match.
             */
            public Builder match(String match) {
                this.match = match;
                return this;
            }

            /**
             * replacement.
             */
            public Builder replacement(String replacement) {
                this.replacement = replacement;
                return this;
            }

            public WildcardRules build() {
                return new WildcardRules(this);
            } 

        } 

    }
}
