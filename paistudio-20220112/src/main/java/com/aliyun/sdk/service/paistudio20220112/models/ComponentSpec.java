// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ComponentSpec} extends {@link TeaModel}
 *
 * <p>ComponentSpec</p>
 */
public class ComponentSpec extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CodeDir")
    private Location codeDir;

    @com.aliyun.core.annotation.NameInMap("Command")
    @com.aliyun.core.annotation.Validation(required = true)
    private String command;

    @com.aliyun.core.annotation.NameInMap("HyperParameters")
    private java.util.List < HyperParameterDefinition > hyperParameters;

    @com.aliyun.core.annotation.NameInMap("Image")
    @com.aliyun.core.annotation.Validation(required = true)
    private String image;

    @com.aliyun.core.annotation.NameInMap("InputChannels")
    private java.util.List < Channel > inputChannels;

    @com.aliyun.core.annotation.NameInMap("JobType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobType;

    @com.aliyun.core.annotation.NameInMap("MetricDefinitions")
    private java.util.List < MetricDefinition > metricDefinitions;

    @com.aliyun.core.annotation.NameInMap("OutputChannels")
    private java.util.List < Channel > outputChannels;

    @com.aliyun.core.annotation.NameInMap("ResourceRequirements")
    private java.util.List < ConditionExpression > resourceRequirements;

    private ComponentSpec(Builder builder) {
        this.codeDir = builder.codeDir;
        this.command = builder.command;
        this.hyperParameters = builder.hyperParameters;
        this.image = builder.image;
        this.inputChannels = builder.inputChannels;
        this.jobType = builder.jobType;
        this.metricDefinitions = builder.metricDefinitions;
        this.outputChannels = builder.outputChannels;
        this.resourceRequirements = builder.resourceRequirements;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ComponentSpec create() {
        return builder().build();
    }

    /**
     * @return codeDir
     */
    public Location getCodeDir() {
        return this.codeDir;
    }

    /**
     * @return command
     */
    public String getCommand() {
        return this.command;
    }

    /**
     * @return hyperParameters
     */
    public java.util.List < HyperParameterDefinition > getHyperParameters() {
        return this.hyperParameters;
    }

    /**
     * @return image
     */
    public String getImage() {
        return this.image;
    }

    /**
     * @return inputChannels
     */
    public java.util.List < Channel > getInputChannels() {
        return this.inputChannels;
    }

    /**
     * @return jobType
     */
    public String getJobType() {
        return this.jobType;
    }

    /**
     * @return metricDefinitions
     */
    public java.util.List < MetricDefinition > getMetricDefinitions() {
        return this.metricDefinitions;
    }

    /**
     * @return outputChannels
     */
    public java.util.List < Channel > getOutputChannels() {
        return this.outputChannels;
    }

    /**
     * @return resourceRequirements
     */
    public java.util.List < ConditionExpression > getResourceRequirements() {
        return this.resourceRequirements;
    }

    public static final class Builder {
        private Location codeDir; 
        private String command; 
        private java.util.List < HyperParameterDefinition > hyperParameters; 
        private String image; 
        private java.util.List < Channel > inputChannels; 
        private String jobType; 
        private java.util.List < MetricDefinition > metricDefinitions; 
        private java.util.List < Channel > outputChannels; 
        private java.util.List < ConditionExpression > resourceRequirements; 

        /**
         * CodeDir.
         */
        public Builder codeDir(Location codeDir) {
            this.codeDir = codeDir;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder command(String command) {
            this.command = command;
            return this;
        }

        /**
         * HyperParameters.
         */
        public Builder hyperParameters(java.util.List < HyperParameterDefinition > hyperParameters) {
            this.hyperParameters = hyperParameters;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder image(String image) {
            this.image = image;
            return this;
        }

        /**
         * InputChannels.
         */
        public Builder inputChannels(java.util.List < Channel > inputChannels) {
            this.inputChannels = inputChannels;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder jobType(String jobType) {
            this.jobType = jobType;
            return this;
        }

        /**
         * MetricDefinitions.
         */
        public Builder metricDefinitions(java.util.List < MetricDefinition > metricDefinitions) {
            this.metricDefinitions = metricDefinitions;
            return this;
        }

        /**
         * OutputChannels.
         */
        public Builder outputChannels(java.util.List < Channel > outputChannels) {
            this.outputChannels = outputChannels;
            return this;
        }

        /**
         * ResourceRequirements.
         */
        public Builder resourceRequirements(java.util.List < ConditionExpression > resourceRequirements) {
            this.resourceRequirements = resourceRequirements;
            return this;
        }

        public ComponentSpec build() {
            return new ComponentSpec(this);
        } 

    } 

}
