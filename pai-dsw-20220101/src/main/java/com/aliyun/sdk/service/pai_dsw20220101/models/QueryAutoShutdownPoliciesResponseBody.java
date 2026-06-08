// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dsw20220101.models;

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
 * {@link QueryAutoShutdownPoliciesResponseBody} extends {@link TeaModel}
 *
 * <p>QueryAutoShutdownPoliciesResponseBody</p>
 */
public class QueryAutoShutdownPoliciesResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AutoShutdownPolicies")
    private java.util.List<AutoShutdownPolicies> autoShutdownPolicies;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private QueryAutoShutdownPoliciesResponseBody(Builder builder) {
        this.autoShutdownPolicies = builder.autoShutdownPolicies;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryAutoShutdownPoliciesResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return autoShutdownPolicies
     */
    public java.util.List<AutoShutdownPolicies> getAutoShutdownPolicies() {
        return this.autoShutdownPolicies;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private java.util.List<AutoShutdownPolicies> autoShutdownPolicies; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(QueryAutoShutdownPoliciesResponseBody model) {
            this.autoShutdownPolicies = model.autoShutdownPolicies;
            this.requestId = model.requestId;
        } 

        /**
         * AutoShutdownPolicies.
         */
        public Builder autoShutdownPolicies(java.util.List<AutoShutdownPolicies> autoShutdownPolicies) {
            this.autoShutdownPolicies = autoShutdownPolicies;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public QueryAutoShutdownPoliciesResponseBody build() {
            return new QueryAutoShutdownPoliciesResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryAutoShutdownPoliciesResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAutoShutdownPoliciesResponseBody</p>
     */
    public static class Conditions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Context")
        private java.util.Map<String, ?> context;

        @com.aliyun.core.annotation.NameInMap("Expression")
        private String expression;

        @com.aliyun.core.annotation.NameInMap("SourceType")
        private String sourceType;

        private Conditions(Builder builder) {
            this.context = builder.context;
            this.expression = builder.expression;
            this.sourceType = builder.sourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Conditions create() {
            return builder().build();
        }

        /**
         * @return context
         */
        public java.util.Map<String, ?> getContext() {
            return this.context;
        }

        /**
         * @return expression
         */
        public String getExpression() {
            return this.expression;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        public static final class Builder {
            private java.util.Map<String, ?> context; 
            private String expression; 
            private String sourceType; 

            private Builder() {
            } 

            private Builder(Conditions model) {
                this.context = model.context;
                this.expression = model.expression;
                this.sourceType = model.sourceType;
            } 

            /**
             * Context.
             */
            public Builder context(java.util.Map<String, ?> context) {
                this.context = context;
                return this;
            }

            /**
             * Expression.
             */
            public Builder expression(String expression) {
                this.expression = expression;
                return this;
            }

            /**
             * SourceType.
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            public Conditions build() {
                return new Conditions(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryAutoShutdownPoliciesResponseBody} extends {@link TeaModel}
     *
     * <p>QueryAutoShutdownPoliciesResponseBody</p>
     */
    public static class AutoShutdownPolicies extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Conditions")
        private java.util.List<Conditions> conditions;

        @com.aliyun.core.annotation.NameInMap("Context")
        @Deprecated
        private java.util.Map<String, ?> context;

        @com.aliyun.core.annotation.NameInMap("Expression")
        @Deprecated
        private String expression;

        @com.aliyun.core.annotation.NameInMap("InstanceId")
        private String instanceId;

        @com.aliyun.core.annotation.NameInMap("SourceType")
        @Deprecated
        private String sourceType;

        private AutoShutdownPolicies(Builder builder) {
            this.conditions = builder.conditions;
            this.context = builder.context;
            this.expression = builder.expression;
            this.instanceId = builder.instanceId;
            this.sourceType = builder.sourceType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AutoShutdownPolicies create() {
            return builder().build();
        }

        /**
         * @return conditions
         */
        public java.util.List<Conditions> getConditions() {
            return this.conditions;
        }

        /**
         * @return context
         */
        public java.util.Map<String, ?> getContext() {
            return this.context;
        }

        /**
         * @return expression
         */
        public String getExpression() {
            return this.expression;
        }

        /**
         * @return instanceId
         */
        public String getInstanceId() {
            return this.instanceId;
        }

        /**
         * @return sourceType
         */
        public String getSourceType() {
            return this.sourceType;
        }

        public static final class Builder {
            private java.util.List<Conditions> conditions; 
            private java.util.Map<String, ?> context; 
            private String expression; 
            private String instanceId; 
            private String sourceType; 

            private Builder() {
            } 

            private Builder(AutoShutdownPolicies model) {
                this.conditions = model.conditions;
                this.context = model.context;
                this.expression = model.expression;
                this.instanceId = model.instanceId;
                this.sourceType = model.sourceType;
            } 

            /**
             * Conditions.
             */
            public Builder conditions(java.util.List<Conditions> conditions) {
                this.conditions = conditions;
                return this;
            }

            /**
             * Context.
             */
            public Builder context(java.util.Map<String, ?> context) {
                this.context = context;
                return this;
            }

            /**
             * Expression.
             */
            public Builder expression(String expression) {
                this.expression = expression;
                return this;
            }

            /**
             * InstanceId.
             */
            public Builder instanceId(String instanceId) {
                this.instanceId = instanceId;
                return this;
            }

            /**
             * SourceType.
             */
            public Builder sourceType(String sourceType) {
                this.sourceType = sourceType;
                return this;
            }

            public AutoShutdownPolicies build() {
                return new AutoShutdownPolicies(this);
            } 

        } 

    }
}
