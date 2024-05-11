// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20200930.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TrainingSpecification} extends {@link TeaModel}
 *
 * <p>TrainingSpecification</p>
 */
public class TrainingSpecification extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DatasetName")
    private String datasetName;

    @com.aliyun.core.annotation.NameInMap("Endpoint")
    @com.aliyun.core.annotation.Validation(required = true)
    private String endpoint;

    @com.aliyun.core.annotation.NameInMap("ModelSpecification")
    @com.aliyun.core.annotation.Validation(required = true)
    private ModelSpecification modelSpecification;

    @com.aliyun.core.annotation.NameInMap("Runtime")
    @com.aliyun.core.annotation.Validation(required = true)
    private Runtime runtime;

    @com.aliyun.core.annotation.NameInMap("SourceURI")
    @com.aliyun.core.annotation.Validation(required = true)
    private String sourceURI;

    @com.aliyun.core.annotation.NameInMap("TargetURI")
    @com.aliyun.core.annotation.Validation(required = true)
    private String targetURI;

    @com.aliyun.core.annotation.NameInMap("Transforms")
    private java.util.List < CustomParams > transforms;

    @com.aliyun.core.annotation.NameInMap("ValidationSourceURI")
    private String validationSourceURI;

    @com.aliyun.core.annotation.NameInMap("ValidationSplit")
    private Float validationSplit;

    private TrainingSpecification(Builder builder) {
        this.datasetName = builder.datasetName;
        this.endpoint = builder.endpoint;
        this.modelSpecification = builder.modelSpecification;
        this.runtime = builder.runtime;
        this.sourceURI = builder.sourceURI;
        this.targetURI = builder.targetURI;
        this.transforms = builder.transforms;
        this.validationSourceURI = builder.validationSourceURI;
        this.validationSplit = builder.validationSplit;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TrainingSpecification create() {
        return builder().build();
    }

    /**
     * @return datasetName
     */
    public String getDatasetName() {
        return this.datasetName;
    }

    /**
     * @return endpoint
     */
    public String getEndpoint() {
        return this.endpoint;
    }

    /**
     * @return modelSpecification
     */
    public ModelSpecification getModelSpecification() {
        return this.modelSpecification;
    }

    /**
     * @return runtime
     */
    public Runtime getRuntime() {
        return this.runtime;
    }

    /**
     * @return sourceURI
     */
    public String getSourceURI() {
        return this.sourceURI;
    }

    /**
     * @return targetURI
     */
    public String getTargetURI() {
        return this.targetURI;
    }

    /**
     * @return transforms
     */
    public java.util.List < CustomParams > getTransforms() {
        return this.transforms;
    }

    /**
     * @return validationSourceURI
     */
    public String getValidationSourceURI() {
        return this.validationSourceURI;
    }

    /**
     * @return validationSplit
     */
    public Float getValidationSplit() {
        return this.validationSplit;
    }

    public static final class Builder {
        private String datasetName; 
        private String endpoint; 
        private ModelSpecification modelSpecification; 
        private Runtime runtime; 
        private String sourceURI; 
        private String targetURI; 
        private java.util.List < CustomParams > transforms; 
        private String validationSourceURI; 
        private Float validationSplit; 

        /**
         * DatasetName.
         */
        public Builder datasetName(String datasetName) {
            this.datasetName = datasetName;
            return this;
        }

        /**
         * Endpoint.
         */
        public Builder endpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }

        /**
         * ModelSpecification.
         */
        public Builder modelSpecification(ModelSpecification modelSpecification) {
            this.modelSpecification = modelSpecification;
            return this;
        }

        /**
         * Runtime.
         */
        public Builder runtime(Runtime runtime) {
            this.runtime = runtime;
            return this;
        }

        /**
         * SourceURI.
         */
        public Builder sourceURI(String sourceURI) {
            this.sourceURI = sourceURI;
            return this;
        }

        /**
         * TargetURI.
         */
        public Builder targetURI(String targetURI) {
            this.targetURI = targetURI;
            return this;
        }

        /**
         * Transforms.
         */
        public Builder transforms(java.util.List < CustomParams > transforms) {
            this.transforms = transforms;
            return this;
        }

        /**
         * ValidationSourceURI.
         */
        public Builder validationSourceURI(String validationSourceURI) {
            this.validationSourceURI = validationSourceURI;
            return this;
        }

        /**
         * ValidationSplit.
         */
        public Builder validationSplit(Float validationSplit) {
            this.validationSplit = validationSplit;
            return this;
        }

        public TrainingSpecification build() {
            return new TrainingSpecification(this);
        } 

    } 

}
