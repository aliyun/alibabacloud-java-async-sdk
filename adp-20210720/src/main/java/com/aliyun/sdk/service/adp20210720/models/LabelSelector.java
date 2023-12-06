// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adp20210720.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link LabelSelector} extends {@link TeaModel}
 *
 * <p>LabelSelector</p>
 */
public class LabelSelector extends TeaModel {
    @NameInMap("matchExpressions")
    private java.util.List < MatchExpressions> matchExpressions;

    @NameInMap("matchLabels")
    private java.util.Map < String, String > matchLabels;

    private LabelSelector(Builder builder) {
        this.matchExpressions = builder.matchExpressions;
        this.matchLabels = builder.matchLabels;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LabelSelector create() {
        return builder().build();
    }

    /**
     * @return matchExpressions
     */
    public java.util.List < MatchExpressions> getMatchExpressions() {
        return this.matchExpressions;
    }

    /**
     * @return matchLabels
     */
    public java.util.Map < String, String > getMatchLabels() {
        return this.matchLabels;
    }

    public static final class Builder {
        private java.util.List < MatchExpressions> matchExpressions; 
        private java.util.Map < String, String > matchLabels; 

        /**
         * matchExpressions.
         */
        public Builder matchExpressions(java.util.List < MatchExpressions> matchExpressions) {
            this.matchExpressions = matchExpressions;
            return this;
        }

        /**
         * matchLabels.
         */
        public Builder matchLabels(java.util.Map < String, String > matchLabels) {
            this.matchLabels = matchLabels;
            return this;
        }

        public LabelSelector build() {
            return new LabelSelector(this);
        } 

    } 

    public static class MatchExpressions extends TeaModel {
        @NameInMap("key")
        private String key;

        @NameInMap("operator")
        private String operator;

        @NameInMap("values")
        private java.util.List < String > values;

        private MatchExpressions(Builder builder) {
            this.key = builder.key;
            this.operator = builder.operator;
            this.values = builder.values;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MatchExpressions create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return operator
         */
        public String getOperator() {
            return this.operator;
        }

        /**
         * @return values
         */
        public java.util.List < String > getValues() {
            return this.values;
        }

        public static final class Builder {
            private String key; 
            private String operator; 
            private java.util.List < String > values; 

            /**
             * key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * operator.
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * values.
             */
            public Builder values(java.util.List < String > values) {
                this.values = values;
                return this;
            }

            public MatchExpressions build() {
                return new MatchExpressions(this);
            } 

        } 

    }
}
