// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paistudio20220112.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link AlgorithmSpec} extends {@link TeaModel}
 *
 * <p>AlgorithmSpec</p>
 */
public class AlgorithmSpec extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CodeDir")
    private Location codeDir;

    @com.aliyun.core.annotation.NameInMap("Command")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List < String > command;

    @com.aliyun.core.annotation.NameInMap("ComputeResource")
    private ComputeResource computeResource;

    @com.aliyun.core.annotation.NameInMap("Customization")
    private Customization customization;

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

    @com.aliyun.core.annotation.NameInMap("ProgressDefinitions")
    private ProgressDefinitions progressDefinitions;

    @com.aliyun.core.annotation.NameInMap("ResourceRequirements")
    private java.util.List < ConditionExpression > resourceRequirements;

    @com.aliyun.core.annotation.NameInMap("SupportedInstanceTypes")
    private java.util.List < String > supportedInstanceTypes;

    @com.aliyun.core.annotation.NameInMap("SupportsDistributedTraining")
    private Boolean supportsDistributedTraining;

    private AlgorithmSpec(Builder builder) {
        this.codeDir = builder.codeDir;
        this.command = builder.command;
        this.computeResource = builder.computeResource;
        this.customization = builder.customization;
        this.hyperParameters = builder.hyperParameters;
        this.image = builder.image;
        this.inputChannels = builder.inputChannels;
        this.jobType = builder.jobType;
        this.metricDefinitions = builder.metricDefinitions;
        this.outputChannels = builder.outputChannels;
        this.progressDefinitions = builder.progressDefinitions;
        this.resourceRequirements = builder.resourceRequirements;
        this.supportedInstanceTypes = builder.supportedInstanceTypes;
        this.supportsDistributedTraining = builder.supportsDistributedTraining;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AlgorithmSpec create() {
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
    public java.util.List < String > getCommand() {
        return this.command;
    }

    /**
     * @return computeResource
     */
    public ComputeResource getComputeResource() {
        return this.computeResource;
    }

    /**
     * @return customization
     */
    public Customization getCustomization() {
        return this.customization;
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
     * @return progressDefinitions
     */
    public ProgressDefinitions getProgressDefinitions() {
        return this.progressDefinitions;
    }

    /**
     * @return resourceRequirements
     */
    public java.util.List < ConditionExpression > getResourceRequirements() {
        return this.resourceRequirements;
    }

    /**
     * @return supportedInstanceTypes
     */
    public java.util.List < String > getSupportedInstanceTypes() {
        return this.supportedInstanceTypes;
    }

    /**
     * @return supportsDistributedTraining
     */
    public Boolean getSupportsDistributedTraining() {
        return this.supportsDistributedTraining;
    }

    public static final class Builder {
        private Location codeDir; 
        private java.util.List < String > command; 
        private ComputeResource computeResource; 
        private Customization customization; 
        private java.util.List < HyperParameterDefinition > hyperParameters; 
        private String image; 
        private java.util.List < Channel > inputChannels; 
        private String jobType; 
        private java.util.List < MetricDefinition > metricDefinitions; 
        private java.util.List < Channel > outputChannels; 
        private ProgressDefinitions progressDefinitions; 
        private java.util.List < ConditionExpression > resourceRequirements; 
        private java.util.List < String > supportedInstanceTypes; 
        private Boolean supportsDistributedTraining; 

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
        public Builder command(java.util.List < String > command) {
            this.command = command;
            return this;
        }

        /**
         * ComputeResource.
         */
        public Builder computeResource(ComputeResource computeResource) {
            this.computeResource = computeResource;
            return this;
        }

        /**
         * Customization.
         */
        public Builder customization(Customization customization) {
            this.customization = customization;
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
         * ProgressDefinitions.
         */
        public Builder progressDefinitions(ProgressDefinitions progressDefinitions) {
            this.progressDefinitions = progressDefinitions;
            return this;
        }

        /**
         * ResourceRequirements.
         */
        public Builder resourceRequirements(java.util.List < ConditionExpression > resourceRequirements) {
            this.resourceRequirements = resourceRequirements;
            return this;
        }

        /**
         * SupportedInstanceTypes.
         */
        public Builder supportedInstanceTypes(java.util.List < String > supportedInstanceTypes) {
            this.supportedInstanceTypes = supportedInstanceTypes;
            return this;
        }

        /**
         * SupportsDistributedTraining.
         */
        public Builder supportsDistributedTraining(Boolean supportsDistributedTraining) {
            this.supportsDistributedTraining = supportsDistributedTraining;
            return this;
        }

        public AlgorithmSpec build() {
            return new AlgorithmSpec(this);
        } 

    } 

    /**
     * 
     * {@link AlgorithmSpec} extends {@link TeaModel}
     *
     * <p>AlgorithmSpec</p>
     */
    public static class Policy extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Value")
        @com.aliyun.core.annotation.Validation(required = true)
        private String value;

        @com.aliyun.core.annotation.NameInMap("Version")
        @com.aliyun.core.annotation.Validation(required = true)
        private String version;

        private Policy(Builder builder) {
            this.value = builder.value;
            this.version = builder.version;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Policy create() {
            return builder().build();
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        /**
         * @return version
         */
        public String getVersion() {
            return this.version;
        }

        public static final class Builder {
            private String value; 
            private String version; 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             */
            public Builder version(String version) {
                this.version = version;
                return this;
            }

            public Policy build() {
                return new Policy(this);
            } 

        } 

    }
    /**
     * 
     * {@link AlgorithmSpec} extends {@link TeaModel}
     *
     * <p>AlgorithmSpec</p>
     */
    public static class ComputeResource extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Policy")
        @com.aliyun.core.annotation.Validation(required = true)
        private Policy policy;

        private ComputeResource(Builder builder) {
            this.policy = builder.policy;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ComputeResource create() {
            return builder().build();
        }

        /**
         * @return policy
         */
        public Policy getPolicy() {
            return this.policy;
        }

        public static final class Builder {
            private Policy policy; 

            /**
             * <p>This parameter is required.</p>
             */
            public Builder policy(Policy policy) {
                this.policy = policy;
                return this;
            }

            public ComputeResource build() {
                return new ComputeResource(this);
            } 

        } 

    }
    /**
     * 
     * {@link AlgorithmSpec} extends {@link TeaModel}
     *
     * <p>AlgorithmSpec</p>
     */
    public static class Customization extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CodeDir")
        private Boolean codeDir;

        private Customization(Builder builder) {
            this.codeDir = builder.codeDir;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Customization create() {
            return builder().build();
        }

        /**
         * @return codeDir
         */
        public Boolean getCodeDir() {
            return this.codeDir;
        }

        public static final class Builder {
            private Boolean codeDir; 

            /**
             * CodeDir.
             */
            public Builder codeDir(Boolean codeDir) {
                this.codeDir = codeDir;
                return this;
            }

            public Customization build() {
                return new Customization(this);
            } 

        } 

    }
    /**
     * 
     * {@link AlgorithmSpec} extends {@link TeaModel}
     *
     * <p>AlgorithmSpec</p>
     */
    public static class OverallProgress extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Regex")
        private String regex;

        private OverallProgress(Builder builder) {
            this.description = builder.description;
            this.regex = builder.regex;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OverallProgress create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return regex
         */
        public String getRegex() {
            return this.regex;
        }

        public static final class Builder {
            private String description; 
            private String regex; 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Regex.
             */
            public Builder regex(String regex) {
                this.regex = regex;
                return this;
            }

            public OverallProgress build() {
                return new OverallProgress(this);
            } 

        } 

    }
    /**
     * 
     * {@link AlgorithmSpec} extends {@link TeaModel}
     *
     * <p>AlgorithmSpec</p>
     */
    public static class RemainingTime extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Description")
        private String description;

        @com.aliyun.core.annotation.NameInMap("Regex")
        private String regex;

        private RemainingTime(Builder builder) {
            this.description = builder.description;
            this.regex = builder.regex;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RemainingTime create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return regex
         */
        public String getRegex() {
            return this.regex;
        }

        public static final class Builder {
            private String description; 
            private String regex; 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Regex.
             */
            public Builder regex(String regex) {
                this.regex = regex;
                return this;
            }

            public RemainingTime build() {
                return new RemainingTime(this);
            } 

        } 

    }
    /**
     * 
     * {@link AlgorithmSpec} extends {@link TeaModel}
     *
     * <p>AlgorithmSpec</p>
     */
    public static class ProgressDefinitions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OverallProgress")
        private OverallProgress overallProgress;

        @com.aliyun.core.annotation.NameInMap("RemainingTime")
        private RemainingTime remainingTime;

        private ProgressDefinitions(Builder builder) {
            this.overallProgress = builder.overallProgress;
            this.remainingTime = builder.remainingTime;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ProgressDefinitions create() {
            return builder().build();
        }

        /**
         * @return overallProgress
         */
        public OverallProgress getOverallProgress() {
            return this.overallProgress;
        }

        /**
         * @return remainingTime
         */
        public RemainingTime getRemainingTime() {
            return this.remainingTime;
        }

        public static final class Builder {
            private OverallProgress overallProgress; 
            private RemainingTime remainingTime; 

            /**
             * OverallProgress.
             */
            public Builder overallProgress(OverallProgress overallProgress) {
                this.overallProgress = overallProgress;
                return this;
            }

            /**
             * RemainingTime.
             */
            public Builder remainingTime(RemainingTime remainingTime) {
                this.remainingTime = remainingTime;
                return this;
            }

            public ProgressDefinitions build() {
                return new ProgressDefinitions(this);
            } 

        } 

    }
}
