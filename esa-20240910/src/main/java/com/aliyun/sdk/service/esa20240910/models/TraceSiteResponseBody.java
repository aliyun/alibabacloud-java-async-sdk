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
 * {@link TraceSiteResponseBody} extends {@link TeaModel}
 *
 * <p>TraceSiteResponseBody</p>
 */
public class TraceSiteResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("StatusCode")
    private Integer statusCode;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    @com.aliyun.core.annotation.NameInMap("Trace")
    private java.util.List<Trace> trace;

    private TraceSiteResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.statusCode = builder.statusCode;
        this.success = builder.success;
        this.trace = builder.trace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TraceSiteResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    /**
     * @return trace
     */
    public java.util.List<Trace> getTrace() {
        return this.trace;
    }

    public static final class Builder {
        private String requestId; 
        private Integer statusCode; 
        private Boolean success; 
        private java.util.List<Trace> trace; 

        private Builder() {
        } 

        private Builder(TraceSiteResponseBody model) {
            this.requestId = model.requestId;
            this.statusCode = model.statusCode;
            this.success = model.success;
            this.trace = model.trace;
        } 

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * StatusCode.
         */
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        /**
         * Trace.
         */
        public Builder trace(java.util.List<Trace> trace) {
            this.trace = trace;
            return this;
        }

        public TraceSiteResponseBody build() {
            return new TraceSiteResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link TraceSiteResponseBody} extends {@link TeaModel}
     *
     * <p>TraceSiteResponseBody</p>
     */
    public static class TraceTrace extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Action")
        private String action;

        @com.aliyun.core.annotation.NameInMap("ConfigType")
        private String configType;

        @com.aliyun.core.annotation.NameInMap("DdosLevelDomestic")
        private String ddosLevelDomestic;

        @com.aliyun.core.annotation.NameInMap("DdosLevelOversea")
        private String ddosLevelOversea;

        @com.aliyun.core.annotation.NameInMap("EnvName")
        private String envName;

        @com.aliyun.core.annotation.NameInMap("Expression")
        private String expression;

        @com.aliyun.core.annotation.NameInMap("Level")
        private String level;

        @com.aliyun.core.annotation.NameInMap("LoadBalancerName")
        private String loadBalancerName;

        @com.aliyun.core.annotation.NameInMap("OriginPoolName")
        private String originPoolName;

        @com.aliyun.core.annotation.NameInMap("RoutineId")
        private String routineId;

        @com.aliyun.core.annotation.NameInMap("RuleId")
        private Integer ruleId;

        @com.aliyun.core.annotation.NameInMap("RuleName")
        private String ruleName;

        @com.aliyun.core.annotation.NameInMap("SiteVersion")
        private Integer siteVersion;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private TraceTrace(Builder builder) {
            this.action = builder.action;
            this.configType = builder.configType;
            this.ddosLevelDomestic = builder.ddosLevelDomestic;
            this.ddosLevelOversea = builder.ddosLevelOversea;
            this.envName = builder.envName;
            this.expression = builder.expression;
            this.level = builder.level;
            this.loadBalancerName = builder.loadBalancerName;
            this.originPoolName = builder.originPoolName;
            this.routineId = builder.routineId;
            this.ruleId = builder.ruleId;
            this.ruleName = builder.ruleName;
            this.siteVersion = builder.siteVersion;
            this.type = builder.type;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TraceTrace create() {
            return builder().build();
        }

        /**
         * @return action
         */
        public String getAction() {
            return this.action;
        }

        /**
         * @return configType
         */
        public String getConfigType() {
            return this.configType;
        }

        /**
         * @return ddosLevelDomestic
         */
        public String getDdosLevelDomestic() {
            return this.ddosLevelDomestic;
        }

        /**
         * @return ddosLevelOversea
         */
        public String getDdosLevelOversea() {
            return this.ddosLevelOversea;
        }

        /**
         * @return envName
         */
        public String getEnvName() {
            return this.envName;
        }

        /**
         * @return expression
         */
        public String getExpression() {
            return this.expression;
        }

        /**
         * @return level
         */
        public String getLevel() {
            return this.level;
        }

        /**
         * @return loadBalancerName
         */
        public String getLoadBalancerName() {
            return this.loadBalancerName;
        }

        /**
         * @return originPoolName
         */
        public String getOriginPoolName() {
            return this.originPoolName;
        }

        /**
         * @return routineId
         */
        public String getRoutineId() {
            return this.routineId;
        }

        /**
         * @return ruleId
         */
        public Integer getRuleId() {
            return this.ruleId;
        }

        /**
         * @return ruleName
         */
        public String getRuleName() {
            return this.ruleName;
        }

        /**
         * @return siteVersion
         */
        public Integer getSiteVersion() {
            return this.siteVersion;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String action; 
            private String configType; 
            private String ddosLevelDomestic; 
            private String ddosLevelOversea; 
            private String envName; 
            private String expression; 
            private String level; 
            private String loadBalancerName; 
            private String originPoolName; 
            private String routineId; 
            private Integer ruleId; 
            private String ruleName; 
            private Integer siteVersion; 
            private String type; 
            private String value; 

            private Builder() {
            } 

            private Builder(TraceTrace model) {
                this.action = model.action;
                this.configType = model.configType;
                this.ddosLevelDomestic = model.ddosLevelDomestic;
                this.ddosLevelOversea = model.ddosLevelOversea;
                this.envName = model.envName;
                this.expression = model.expression;
                this.level = model.level;
                this.loadBalancerName = model.loadBalancerName;
                this.originPoolName = model.originPoolName;
                this.routineId = model.routineId;
                this.ruleId = model.ruleId;
                this.ruleName = model.ruleName;
                this.siteVersion = model.siteVersion;
                this.type = model.type;
                this.value = model.value;
            } 

            /**
             * Action.
             */
            public Builder action(String action) {
                this.action = action;
                return this;
            }

            /**
             * ConfigType.
             */
            public Builder configType(String configType) {
                this.configType = configType;
                return this;
            }

            /**
             * DdosLevelDomestic.
             */
            public Builder ddosLevelDomestic(String ddosLevelDomestic) {
                this.ddosLevelDomestic = ddosLevelDomestic;
                return this;
            }

            /**
             * DdosLevelOversea.
             */
            public Builder ddosLevelOversea(String ddosLevelOversea) {
                this.ddosLevelOversea = ddosLevelOversea;
                return this;
            }

            /**
             * EnvName.
             */
            public Builder envName(String envName) {
                this.envName = envName;
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
             * Level.
             */
            public Builder level(String level) {
                this.level = level;
                return this;
            }

            /**
             * LoadBalancerName.
             */
            public Builder loadBalancerName(String loadBalancerName) {
                this.loadBalancerName = loadBalancerName;
                return this;
            }

            /**
             * OriginPoolName.
             */
            public Builder originPoolName(String originPoolName) {
                this.originPoolName = originPoolName;
                return this;
            }

            /**
             * RoutineId.
             */
            public Builder routineId(String routineId) {
                this.routineId = routineId;
                return this;
            }

            /**
             * RuleId.
             */
            public Builder ruleId(Integer ruleId) {
                this.ruleId = ruleId;
                return this;
            }

            /**
             * RuleName.
             */
            public Builder ruleName(String ruleName) {
                this.ruleName = ruleName;
                return this;
            }

            /**
             * SiteVersion.
             */
            public Builder siteVersion(Integer siteVersion) {
                this.siteVersion = siteVersion;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public TraceTrace build() {
                return new TraceTrace(this);
            } 

        } 

    }
    /**
     * 
     * {@link TraceSiteResponseBody} extends {@link TeaModel}
     *
     * <p>TraceSiteResponseBody</p>
     */
    public static class Trace extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Matched")
        private Boolean matched;

        @com.aliyun.core.annotation.NameInMap("StepModuleName")
        private String stepModuleName;

        @com.aliyun.core.annotation.NameInMap("Trace")
        private java.util.List<TraceTrace> trace;

        private Trace(Builder builder) {
            this.matched = builder.matched;
            this.stepModuleName = builder.stepModuleName;
            this.trace = builder.trace;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Trace create() {
            return builder().build();
        }

        /**
         * @return matched
         */
        public Boolean getMatched() {
            return this.matched;
        }

        /**
         * @return stepModuleName
         */
        public String getStepModuleName() {
            return this.stepModuleName;
        }

        /**
         * @return trace
         */
        public java.util.List<TraceTrace> getTrace() {
            return this.trace;
        }

        public static final class Builder {
            private Boolean matched; 
            private String stepModuleName; 
            private java.util.List<TraceTrace> trace; 

            private Builder() {
            } 

            private Builder(Trace model) {
                this.matched = model.matched;
                this.stepModuleName = model.stepModuleName;
                this.trace = model.trace;
            } 

            /**
             * Matched.
             */
            public Builder matched(Boolean matched) {
                this.matched = matched;
                return this;
            }

            /**
             * StepModuleName.
             */
            public Builder stepModuleName(String stepModuleName) {
                this.stepModuleName = stepModuleName;
                return this;
            }

            /**
             * Trace.
             */
            public Builder trace(java.util.List<TraceTrace> trace) {
                this.trace = trace;
                return this;
            }

            public Trace build() {
                return new Trace(this);
            } 

        } 

    }
}
