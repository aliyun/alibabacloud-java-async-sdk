// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateOrUpdateSilencePolicyResponseBody} extends {@link TeaModel}
 *
 * <p>CreateOrUpdateSilencePolicyResponseBody</p>
 */
public class CreateOrUpdateSilencePolicyResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SilencePolicy")
    private SilencePolicy silencePolicy;

    private CreateOrUpdateSilencePolicyResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.silencePolicy = builder.silencePolicy;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateOrUpdateSilencePolicyResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return silencePolicy
     */
    public SilencePolicy getSilencePolicy() {
        return this.silencePolicy;
    }

    public static final class Builder {
        private String requestId; 
        private SilencePolicy silencePolicy; 

        /**
         * 请求ID
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * 静默策略对象
         */
        public Builder silencePolicy(SilencePolicy silencePolicy) {
            this.silencePolicy = silencePolicy;
            return this;
        }

        public CreateOrUpdateSilencePolicyResponseBody build() {
            return new CreateOrUpdateSilencePolicyResponseBody(this);
        } 

    } 

    public static class MatchingConditions extends TeaModel {
        @NameInMap("Key")
        private String key;

        @NameInMap("Operator")
        private String operator;

        @NameInMap("Value")
        private String value;

        private MatchingConditions(Builder builder) {
            this.key = builder.key;
            this.operator = builder.operator;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MatchingConditions create() {
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
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String operator; 
            private String value; 

            /**
             * 条件字段
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * 对应关系
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * 条件字段值
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public MatchingConditions build() {
                return new MatchingConditions(this);
            } 

        } 

    }
    public static class MatchingRules extends TeaModel {
        @NameInMap("MatchingConditions")
        private java.util.List < MatchingConditions> matchingConditions;

        private MatchingRules(Builder builder) {
            this.matchingConditions = builder.matchingConditions;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MatchingRules create() {
            return builder().build();
        }

        /**
         * @return matchingConditions
         */
        public java.util.List < MatchingConditions> getMatchingConditions() {
            return this.matchingConditions;
        }

        public static final class Builder {
            private java.util.List < MatchingConditions> matchingConditions; 

            /**
             * 分派条件
             */
            public Builder matchingConditions(java.util.List < MatchingConditions> matchingConditions) {
                this.matchingConditions = matchingConditions;
                return this;
            }

            public MatchingRules build() {
                return new MatchingRules(this);
            } 

        } 

    }
    public static class SilencePolicy extends TeaModel {
        @NameInMap("Id")
        private Long id;

        @NameInMap("MatchingRules")
        private java.util.List < MatchingRules> matchingRules;

        @NameInMap("Name")
        private String name;

        private SilencePolicy(Builder builder) {
            this.id = builder.id;
            this.matchingRules = builder.matchingRules;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SilencePolicy create() {
            return builder().build();
        }

        /**
         * @return id
         */
        public Long getId() {
            return this.id;
        }

        /**
         * @return matchingRules
         */
        public java.util.List < MatchingRules> getMatchingRules() {
            return this.matchingRules;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private Long id; 
            private java.util.List < MatchingRules> matchingRules; 
            private String name; 

            /**
             * 静默策略ID
             */
            public Builder id(Long id) {
                this.id = id;
                return this;
            }

            /**
             * 分派规则
             */
            public Builder matchingRules(java.util.List < MatchingRules> matchingRules) {
                this.matchingRules = matchingRules;
                return this;
            }

            /**
             * 静默策略名称
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public SilencePolicy build() {
                return new SilencePolicy(this);
            } 

        } 

    }
}
