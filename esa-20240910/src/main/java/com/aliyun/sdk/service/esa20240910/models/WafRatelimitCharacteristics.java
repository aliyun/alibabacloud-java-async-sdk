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
 * {@link WafRatelimitCharacteristics} extends {@link TeaModel}
 *
 * <p>WafRatelimitCharacteristics</p>
 */
public class WafRatelimitCharacteristics extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Criteria")
    private java.util.List<Criteria> criteria;

    @com.aliyun.core.annotation.NameInMap("Logic")
    private String logic;

    @com.aliyun.core.annotation.NameInMap("MatchType")
    private String matchType;

    private WafRatelimitCharacteristics(Builder builder) {
        this.criteria = builder.criteria;
        this.logic = builder.logic;
        this.matchType = builder.matchType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static WafRatelimitCharacteristics create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return matchType
     */
    public String getMatchType() {
        return this.matchType;
    }

    public static final class Builder {
        private java.util.List<Criteria> criteria; 
        private String logic; 
        private String matchType; 

        private Builder() {
        } 

        private Builder(WafRatelimitCharacteristics model) {
            this.criteria = model.criteria;
            this.logic = model.logic;
            this.matchType = model.matchType;
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
         * MatchType.
         */
        public Builder matchType(String matchType) {
            this.matchType = matchType;
            return this;
        }

        public WafRatelimitCharacteristics build() {
            return new WafRatelimitCharacteristics(this);
        } 

    } 

    /**
     * 
     * {@link WafRatelimitCharacteristics} extends {@link TeaModel}
     *
     * <p>WafRatelimitCharacteristics</p>
     */
    public static class CriteriaCriteria extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("MatchType")
        private String matchType;

        private CriteriaCriteria(Builder builder) {
            this.matchType = builder.matchType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static CriteriaCriteria create() {
            return builder().build();
        }

        /**
         * @return matchType
         */
        public String getMatchType() {
            return this.matchType;
        }

        public static final class Builder {
            private String matchType; 

            private Builder() {
            } 

            private Builder(CriteriaCriteria model) {
                this.matchType = model.matchType;
            } 

            /**
             * MatchType.
             */
            public Builder matchType(String matchType) {
                this.matchType = matchType;
                return this;
            }

            public CriteriaCriteria build() {
                return new CriteriaCriteria(this);
            } 

        } 

    }
    /**
     * 
     * {@link WafRatelimitCharacteristics} extends {@link TeaModel}
     *
     * <p>WafRatelimitCharacteristics</p>
     */
    public static class WafRatelimitCharacteristicsCriteriaCriteria extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Criteria")
        private java.util.List<CriteriaCriteria> criteria;

        @com.aliyun.core.annotation.NameInMap("Logic")
        private String logic;

        @com.aliyun.core.annotation.NameInMap("MatchType")
        private String matchType;

        private WafRatelimitCharacteristicsCriteriaCriteria(Builder builder) {
            this.criteria = builder.criteria;
            this.logic = builder.logic;
            this.matchType = builder.matchType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static WafRatelimitCharacteristicsCriteriaCriteria create() {
            return builder().build();
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
         * @return matchType
         */
        public String getMatchType() {
            return this.matchType;
        }

        public static final class Builder {
            private java.util.List<CriteriaCriteria> criteria; 
            private String logic; 
            private String matchType; 

            private Builder() {
            } 

            private Builder(WafRatelimitCharacteristicsCriteriaCriteria model) {
                this.criteria = model.criteria;
                this.logic = model.logic;
                this.matchType = model.matchType;
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
             * MatchType.
             */
            public Builder matchType(String matchType) {
                this.matchType = matchType;
                return this;
            }

            public WafRatelimitCharacteristicsCriteriaCriteria build() {
                return new WafRatelimitCharacteristicsCriteriaCriteria(this);
            } 

        } 

    }
    /**
     * 
     * {@link WafRatelimitCharacteristics} extends {@link TeaModel}
     *
     * <p>WafRatelimitCharacteristics</p>
     */
    public static class Criteria extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Criteria")
        private java.util.List<WafRatelimitCharacteristicsCriteriaCriteria> criteria;

        @com.aliyun.core.annotation.NameInMap("Logic")
        private String logic;

        @com.aliyun.core.annotation.NameInMap("MatchType")
        private String matchType;

        private Criteria(Builder builder) {
            this.criteria = builder.criteria;
            this.logic = builder.logic;
            this.matchType = builder.matchType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Criteria create() {
            return builder().build();
        }

        /**
         * @return criteria
         */
        public java.util.List<WafRatelimitCharacteristicsCriteriaCriteria> getCriteria() {
            return this.criteria;
        }

        /**
         * @return logic
         */
        public String getLogic() {
            return this.logic;
        }

        /**
         * @return matchType
         */
        public String getMatchType() {
            return this.matchType;
        }

        public static final class Builder {
            private java.util.List<WafRatelimitCharacteristicsCriteriaCriteria> criteria; 
            private String logic; 
            private String matchType; 

            private Builder() {
            } 

            private Builder(Criteria model) {
                this.criteria = model.criteria;
                this.logic = model.logic;
                this.matchType = model.matchType;
            } 

            /**
             * Criteria.
             */
            public Builder criteria(java.util.List<WafRatelimitCharacteristicsCriteriaCriteria> criteria) {
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
             * MatchType.
             */
            public Builder matchType(String matchType) {
                this.matchType = matchType;
                return this;
            }

            public Criteria build() {
                return new Criteria(this);
            } 

        } 

    }
}
