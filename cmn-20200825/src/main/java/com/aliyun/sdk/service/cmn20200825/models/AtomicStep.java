// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cmn20200825.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AtomicStep} extends {@link TeaModel}
 *
 * <p>AtomicStep</p>
 */
public class AtomicStep extends TeaModel {
    @NameInMap("Description")
    private String description;

    @NameInMap("Input")
    private java.util.List < Input> input;

    @NameInMap("Output")
    private java.util.List < Output> output;

    @NameInMap("StepId")
    private String stepId;

    @NameInMap("StepName")
    private String stepName;

    @NameInMap("StepType")
    private String stepType;

    private AtomicStep(Builder builder) {
        this.description = builder.description;
        this.input = builder.input;
        this.output = builder.output;
        this.stepId = builder.stepId;
        this.stepName = builder.stepName;
        this.stepType = builder.stepType;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AtomicStep create() {
        return builder().build();
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return input
     */
    public java.util.List < Input> getInput() {
        return this.input;
    }

    /**
     * @return output
     */
    public java.util.List < Output> getOutput() {
        return this.output;
    }

    /**
     * @return stepId
     */
    public String getStepId() {
        return this.stepId;
    }

    /**
     * @return stepName
     */
    public String getStepName() {
        return this.stepName;
    }

    /**
     * @return stepType
     */
    public String getStepType() {
        return this.stepType;
    }

    public static final class Builder {
        private String description; 
        private java.util.List < Input> input; 
        private java.util.List < Output> output; 
        private String stepId; 
        private String stepName; 
        private String stepType; 

        /**
         * Description.
         */
        public Builder description(String description) {
            this.description = description;
            return this;
        }

        /**
         * Input.
         */
        public Builder input(java.util.List < Input> input) {
            this.input = input;
            return this;
        }

        /**
         * Output.
         */
        public Builder output(java.util.List < Output> output) {
            this.output = output;
            return this;
        }

        /**
         * StepId.
         */
        public Builder stepId(String stepId) {
            this.stepId = stepId;
            return this;
        }

        /**
         * StepName.
         */
        public Builder stepName(String stepName) {
            this.stepName = stepName;
            return this;
        }

        /**
         * StepType.
         */
        public Builder stepType(String stepType) {
            this.stepType = stepType;
            return this;
        }

        public AtomicStep build() {
            return new AtomicStep(this);
        } 

    } 

    public static class Input extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("Sample")
        private String sample;

        @NameInMap("Type")
        private String type;

        private Input(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.sample = builder.sample;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Input create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return sample
         */
        public String getSample() {
            return this.sample;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String sample; 
            private String type; 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Sample.
             */
            public Builder sample(String sample) {
                this.sample = sample;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Input build() {
                return new Input(this);
            } 

        } 

    }
    public static class Output extends TeaModel {
        @NameInMap("Description")
        private String description;

        @NameInMap("Name")
        private String name;

        @NameInMap("Sample")
        private String sample;

        @NameInMap("Type")
        private String type;

        private Output(Builder builder) {
            this.description = builder.description;
            this.name = builder.name;
            this.sample = builder.sample;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Output create() {
            return builder().build();
        }

        /**
         * @return description
         */
        public String getDescription() {
            return this.description;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return sample
         */
        public String getSample() {
            return this.sample;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String description; 
            private String name; 
            private String sample; 
            private String type; 

            /**
             * Description.
             */
            public Builder description(String description) {
                this.description = description;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Sample.
             */
            public Builder sample(String sample) {
                this.sample = sample;
                return this;
            }

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Output build() {
                return new Output(this);
            } 

        } 

    }
}
