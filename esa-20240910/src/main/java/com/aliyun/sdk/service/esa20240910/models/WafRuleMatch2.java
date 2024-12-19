// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.esa20240910.models;

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
 * {@link WafRuleMatch2} extends {@link TeaModel}
 *
 * <p>WafRuleMatch2</p>
 */
public class WafRuleMatch2 extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ConvertToLower")
    private Boolean convertToLower;

    @com.aliyun.core.annotation.NameInMap("Criteria")
    private java.util.List<Criteria> criteria;

    @com.aliyun.core.annotation.NameInMap("Logic")
    private String logic;

    @com.aliyun.core.annotation.NameInMap("MatchOperator")
    private String matchOperator;

    @com.aliyun.core.annotation.NameInMap("MatchType")
    private String matchType;

    @com.aliyun.core.annotation.NameInMap("MatchValue")
    private Object matchValue;

    @com.aliyun.core.annotation.NameInMap("Negate")
    private Boolean negate;

    private WafRuleMatch2(Builder builder) {
        this.convertToLower = builder.convertToLower;
        this.criteria = builder.criteria;
        this.logic = builder.logic;
        this.matchOperator = builder.matchOperator;
        this.matchType = builder.matchType;
        this.matchValue = builder.matchValue;
        this.negate = builder.negate;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static WafRuleMatch2 create() {
        return builder().build();
    }

    /**
     * @return convertToLower
     */
    public Boolean getConvertToLower() {
        return this.convertToLower;
    }

    /**
     * @return criteria
     */
    public java.util.List<Criteria> getCriteria() {
        return this.criteria;
    }

    /**
     * @return logic
     */
    public String getLogic() {
        return this.logic;
    }

    /**
     * @return matchOperator
     */
    public String getMatchOperator() {
        return this.matchOperator;
    }

    /**
     * @return matchType
     */
    public String getMatchType() {
        return this.matchType;
    }

    /**
     * @return matchValue
     */
    public Object getMatchValue() {
        return this.matchValue;
    }

    /**
     * @return negate
     */
    public Boolean getNegate() {
        return this.negate;
    }

    public static final class Builder {
        private Boolean convertToLower; 
        private java.util.List<Criteria> criteria; 
        private String logic; 
        private String matchOperator; 
        private String matchType; 
        private Object matchValue; 
        private Boolean negate; 

        /**
         * ConvertToLower.
         */
        public Builder convertToLower(Boolean convertToLower) {
            this.convertToLower = convertToLower;
            return this;
        }

        /**
         * Criteria.
         */
        public Builder criteria(java.util.List<Criteria> criteria) {
            this.criteria = criteria;
            return this;
        }

        /**
         * Logic.
         */
        public Builder logic(String logic) {
            this.logic = logic;
            return this;
        }

        /**
         * MatchOperator.
         */
        public Builder matchOperator(String matchOperator) {
            this.matchOperator = matchOperator;
            return this;
        }

        /**
         * MatchType.
         */
        public Builder matchType(String matchType) {
            this.matchType = matchType;
            return this;
        }

        /**
         * MatchValue.
         */
        public Builder matchValue(Object matchValue) {
            this.matchValue = matchValue;
            return this;
        }

        /**
         * Negate.
         */
        public Builder negate(Boolean negate) {
            this.negate = negate;
            return this;
        }

        public WafRuleMatch2 build() {
            return new WafRuleMatch2(this);
        } 

    } 

    /**
     * 
     * {@link WafRuleMatch2} extends {@link TeaModel}
     *
     * <p>WafRuleMatch2</p>
     */
    public static class CriteriaCriteria extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConvertToLower")
        private Boolean convertToLower;

        @com.aliyun.core.annotation.NameInMap("MatchOperator")
        private String matchOperator;

        @com.aliyun.core.annotation.NameInMap("MatchType")
        private String matchType;

        @com.aliyun.core.annotation.NameInMap("MatchValue")
        private Object matchValue;

        @com.aliyun.core.annotation.NameInMap("Negate")
        private Boolean negate;

        private CriteriaCriteria(Builder builder) {
            this.convertToLower = builder.convertToLower;
            this.matchOperator = builder.matchOperator;
            this.matchType = builder.matchType;
            this.matchValue = builder.matchValue;
            this.negate = builder.negate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CriteriaCriteria create() {
            return builder().build();
        }

        /**
         * @return convertToLower
         */
        public Boolean getConvertToLower() {
            return this.convertToLower;
        }

        /**
         * @return matchOperator
         */
        public String getMatchOperator() {
            return this.matchOperator;
        }

        /**
         * @return matchType
         */
        public String getMatchType() {
            return this.matchType;
        }

        /**
         * @return matchValue
         */
        public Object getMatchValue() {
            return this.matchValue;
        }

        /**
         * @return negate
         */
        public Boolean getNegate() {
            return this.negate;
        }

        public static final class Builder {
            private Boolean convertToLower; 
            private String matchOperator; 
            private String matchType; 
            private Object matchValue; 
            private Boolean negate; 

            /**
             * ConvertToLower.
             */
            public Builder convertToLower(Boolean convertToLower) {
                this.convertToLower = convertToLower;
                return this;
            }

            /**
             * MatchOperator.
             */
            public Builder matchOperator(String matchOperator) {
                this.matchOperator = matchOperator;
                return this;
            }

            /**
             * MatchType.
             */
            public Builder matchType(String matchType) {
                this.matchType = matchType;
                return this;
            }

            /**
             * MatchValue.
             */
            public Builder matchValue(Object matchValue) {
                this.matchValue = matchValue;
                return this;
            }

            /**
             * Negate.
             */
            public Builder negate(Boolean negate) {
                this.negate = negate;
                return this;
            }

            public CriteriaCriteria build() {
                return new CriteriaCriteria(this);
            } 

        } 

    }
    /**
     * 
     * {@link WafRuleMatch2} extends {@link TeaModel}
     *
     * <p>WafRuleMatch2</p>
     */
    public static class WafRuleMatch2CriteriaCriteria extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConvertToLower")
        private Boolean convertToLower;

        @com.aliyun.core.annotation.NameInMap("Criteria")
        private java.util.List<CriteriaCriteria> criteria;

        @com.aliyun.core.annotation.NameInMap("Logic")
        private String logic;

        @com.aliyun.core.annotation.NameInMap("MatchOperator")
        private String matchOperator;

        @com.aliyun.core.annotation.NameInMap("MatchType")
        private String matchType;

        @com.aliyun.core.annotation.NameInMap("MatchValue")
        private Object matchValue;

        @com.aliyun.core.annotation.NameInMap("Negate")
        private Boolean negate;

        private WafRuleMatch2CriteriaCriteria(Builder builder) {
            this.convertToLower = builder.convertToLower;
            this.criteria = builder.criteria;
            this.logic = builder.logic;
            this.matchOperator = builder.matchOperator;
            this.matchType = builder.matchType;
            this.matchValue = builder.matchValue;
            this.negate = builder.negate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WafRuleMatch2CriteriaCriteria create() {
            return builder().build();
        }

        /**
         * @return convertToLower
         */
        public Boolean getConvertToLower() {
            return this.convertToLower;
        }

        /**
         * @return criteria
         */
        public java.util.List<CriteriaCriteria> getCriteria() {
            return this.criteria;
        }

        /**
         * @return logic
         */
        public String getLogic() {
            return this.logic;
        }

        /**
         * @return matchOperator
         */
        public String getMatchOperator() {
            return this.matchOperator;
        }

        /**
         * @return matchType
         */
        public String getMatchType() {
            return this.matchType;
        }

        /**
         * @return matchValue
         */
        public Object getMatchValue() {
            return this.matchValue;
        }

        /**
         * @return negate
         */
        public Boolean getNegate() {
            return this.negate;
        }

        public static final class Builder {
            private Boolean convertToLower; 
            private java.util.List<CriteriaCriteria> criteria; 
            private String logic; 
            private String matchOperator; 
            private String matchType; 
            private Object matchValue; 
            private Boolean negate; 

            /**
             * ConvertToLower.
             */
            public Builder convertToLower(Boolean convertToLower) {
                this.convertToLower = convertToLower;
                return this;
            }

            /**
             * Criteria.
             */
            public Builder criteria(java.util.List<CriteriaCriteria> criteria) {
                this.criteria = criteria;
                return this;
            }

            /**
             * Logic.
             */
            public Builder logic(String logic) {
                this.logic = logic;
                return this;
            }

            /**
             * MatchOperator.
             */
            public Builder matchOperator(String matchOperator) {
                this.matchOperator = matchOperator;
                return this;
            }

            /**
             * MatchType.
             */
            public Builder matchType(String matchType) {
                this.matchType = matchType;
                return this;
            }

            /**
             * MatchValue.
             */
            public Builder matchValue(Object matchValue) {
                this.matchValue = matchValue;
                return this;
            }

            /**
             * Negate.
             */
            public Builder negate(Boolean negate) {
                this.negate = negate;
                return this;
            }

            public WafRuleMatch2CriteriaCriteria build() {
                return new WafRuleMatch2CriteriaCriteria(this);
            } 

        } 

    }
    /**
     * 
     * {@link WafRuleMatch2} extends {@link TeaModel}
     *
     * <p>WafRuleMatch2</p>
     */
    public static class Criteria extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ConvertToLower")
        private Boolean convertToLower;

        @com.aliyun.core.annotation.NameInMap("Criteria")
        private java.util.List<WafRuleMatch2CriteriaCriteria> criteria;

        @com.aliyun.core.annotation.NameInMap("Logic")
        private String logic;

        @com.aliyun.core.annotation.NameInMap("MatchOperator")
        private String matchOperator;

        @com.aliyun.core.annotation.NameInMap("MatchType")
        private String matchType;

        @com.aliyun.core.annotation.NameInMap("MatchValue")
        private Object matchValue;

        @com.aliyun.core.annotation.NameInMap("Negate")
        private Boolean negate;

        private Criteria(Builder builder) {
            this.convertToLower = builder.convertToLower;
            this.criteria = builder.criteria;
            this.logic = builder.logic;
            this.matchOperator = builder.matchOperator;
            this.matchType = builder.matchType;
            this.matchValue = builder.matchValue;
            this.negate = builder.negate;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Criteria create() {
            return builder().build();
        }

        /**
         * @return convertToLower
         */
        public Boolean getConvertToLower() {
            return this.convertToLower;
        }

        /**
         * @return criteria
         */
        public java.util.List<WafRuleMatch2CriteriaCriteria> getCriteria() {
            return this.criteria;
        }

        /**
         * @return logic
         */
        public String getLogic() {
            return this.logic;
        }

        /**
         * @return matchOperator
         */
        public String getMatchOperator() {
            return this.matchOperator;
        }

        /**
         * @return matchType
         */
        public String getMatchType() {
            return this.matchType;
        }

        /**
         * @return matchValue
         */
        public Object getMatchValue() {
            return this.matchValue;
        }

        /**
         * @return negate
         */
        public Boolean getNegate() {
            return this.negate;
        }

        public static final class Builder {
            private Boolean convertToLower; 
            private java.util.List<WafRuleMatch2CriteriaCriteria> criteria; 
            private String logic; 
            private String matchOperator; 
            private String matchType; 
            private Object matchValue; 
            private Boolean negate; 

            /**
             * ConvertToLower.
             */
            public Builder convertToLower(Boolean convertToLower) {
                this.convertToLower = convertToLower;
                return this;
            }

            /**
             * Criteria.
             */
            public Builder criteria(java.util.List<WafRuleMatch2CriteriaCriteria> criteria) {
                this.criteria = criteria;
                return this;
            }

            /**
             * Logic.
             */
            public Builder logic(String logic) {
                this.logic = logic;
                return this;
            }

            /**
             * MatchOperator.
             */
            public Builder matchOperator(String matchOperator) {
                this.matchOperator = matchOperator;
                return this;
            }

            /**
             * MatchType.
             */
            public Builder matchType(String matchType) {
                this.matchType = matchType;
                return this;
            }

            /**
             * MatchValue.
             */
            public Builder matchValue(Object matchValue) {
                this.matchValue = matchValue;
                return this;
            }

            /**
             * Negate.
             */
            public Builder negate(Boolean negate) {
                this.negate = negate;
                return this;
            }

            public Criteria build() {
                return new Criteria(this);
            } 

        } 

    }
}
