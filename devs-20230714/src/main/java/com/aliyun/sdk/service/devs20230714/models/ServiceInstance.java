// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devs20230714.models;

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
 * {@link ServiceInstance} extends {@link TeaModel}
 *
 * <p>ServiceInstance</p>
 */
public class ServiceInstance extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("config")
    private ServiceConfig config;

    @com.aliyun.core.annotation.NameInMap("latestDeployment")
    private LatestDeployment latestDeployment;

    @com.aliyun.core.annotation.NameInMap("outputs")
    private java.util.Map<String, ?> outputs;

    @com.aliyun.core.annotation.NameInMap("variables")
    private java.util.Map<String, Variable> variables;

    private ServiceInstance(Builder builder) {
        this.config = builder.config;
        this.latestDeployment = builder.latestDeployment;
        this.outputs = builder.outputs;
        this.variables = builder.variables;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ServiceInstance create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return config
     */
    public ServiceConfig getConfig() {
        return this.config;
    }

    /**
     * @return latestDeployment
     */
    public LatestDeployment getLatestDeployment() {
        return this.latestDeployment;
    }

    /**
     * @return outputs
     */
    public java.util.Map<String, ?> getOutputs() {
        return this.outputs;
    }

    /**
     * @return variables
     */
    public java.util.Map<String, Variable> getVariables() {
        return this.variables;
    }

    public static final class Builder {
        private ServiceConfig config; 
        private LatestDeployment latestDeployment; 
        private java.util.Map<String, ?> outputs; 
        private java.util.Map<String, Variable> variables; 

        private Builder() {
        } 

        private Builder(ServiceInstance model) {
            this.config = model.config;
            this.latestDeployment = model.latestDeployment;
            this.outputs = model.outputs;
            this.variables = model.variables;
        } 

        /**
         * config.
         */
        public Builder config(ServiceConfig config) {
            this.config = config;
            return this;
        }

        /**
         * latestDeployment.
         */
        public Builder latestDeployment(LatestDeployment latestDeployment) {
            this.latestDeployment = latestDeployment;
            return this;
        }

        /**
         * outputs.
         */
        public Builder outputs(java.util.Map<String, ?> outputs) {
            this.outputs = outputs;
            return this;
        }

        /**
         * variables.
         */
        public Builder variables(java.util.Map<String, Variable> variables) {
            this.variables = variables;
            return this;
        }

        public ServiceInstance build() {
            return new ServiceInstance(this);
        } 

    } 

    /**
     * 
     * {@link ServiceInstance} extends {@link TeaModel}
     *
     * <p>ServiceInstance</p>
     */
    public static class LatestDeployment extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("finishedTime")
        private String finishedTime;

        @com.aliyun.core.annotation.NameInMap("name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("phase")
        private String phase;

        @com.aliyun.core.annotation.NameInMap("startTime")
        private String startTime;

        private LatestDeployment(Builder builder) {
            this.finishedTime = builder.finishedTime;
            this.name = builder.name;
            this.phase = builder.phase;
            this.startTime = builder.startTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static LatestDeployment create() {
            return builder().build();
        }

        /**
         * @return finishedTime
         */
        public String getFinishedTime() {
            return this.finishedTime;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return phase
         */
        public String getPhase() {
            return this.phase;
        }

        /**
         * @return startTime
         */
        public String getStartTime() {
            return this.startTime;
        }

        public static final class Builder {
            private String finishedTime; 
            private String name; 
            private String phase; 
            private String startTime; 

            private Builder() {
            } 

            private Builder(LatestDeployment model) {
                this.finishedTime = model.finishedTime;
                this.name = model.name;
                this.phase = model.phase;
                this.startTime = model.startTime;
            } 

            /**
             * finishedTime.
             */
            public Builder finishedTime(String finishedTime) {
                this.finishedTime = finishedTime;
                return this;
            }

            /**
             * name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * phase.
             */
            public Builder phase(String phase) {
                this.phase = phase;
                return this;
            }

            /**
             * startTime.
             */
            public Builder startTime(String startTime) {
                this.startTime = startTime;
                return this;
            }

            public LatestDeployment build() {
                return new LatestDeployment(this);
            } 

        } 

    }
}
