// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paimodelgallery20260603.models;

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
 * {@link ModelGalleryModel} extends {@link TeaModel}
 *
 * <p>ModelGalleryModel</p>
 */
public class ModelGalleryModel extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Collection")
    private String collection;

    @com.aliyun.core.annotation.NameInMap("Compressible")
    private Boolean compressible;

    @com.aliyun.core.annotation.NameInMap("DeepThink")
    private Boolean deepThink;

    @com.aliyun.core.annotation.NameInMap("Demonstrable")
    private Boolean demonstrable;

    @com.aliyun.core.annotation.NameInMap("Deployable")
    private Boolean deployable;

    @com.aliyun.core.annotation.NameInMap("Distillable")
    private Boolean distillable;

    @com.aliyun.core.annotation.NameInMap("Domain")
    private String domain;

    @com.aliyun.core.annotation.NameInMap("Evaluable")
    private Boolean evaluable;

    @com.aliyun.core.annotation.NameInMap("ExtraInfo")
    private java.util.Map<String, ?> extraInfo;

    @com.aliyun.core.annotation.NameInMap("FunctionCall")
    private Boolean functionCall;

    @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @com.aliyun.core.annotation.NameInMap("GmtLatestVersionModified")
    private String gmtLatestVersionModified;

    @com.aliyun.core.annotation.NameInMap("GmtModifiedTime")
    private String gmtModifiedTime;

    @com.aliyun.core.annotation.NameInMap("LatestVersionName")
    private String latestVersionName;

    @com.aliyun.core.annotation.NameInMap("ModelDescription")
    private String modelDescription;

    @com.aliyun.core.annotation.NameInMap("ModelDoc")
    private String modelDoc;

    @com.aliyun.core.annotation.NameInMap("ModelId")
    private String modelId;

    @com.aliyun.core.annotation.NameInMap("ModelName")
    private String modelName;

    @com.aliyun.core.annotation.NameInMap("ModelSeries")
    private String modelSeries;

    @com.aliyun.core.annotation.NameInMap("ModelType")
    private String modelType;

    @com.aliyun.core.annotation.NameInMap("OrderNumber")
    private Long orderNumber;

    @com.aliyun.core.annotation.NameInMap("Origin")
    private String origin;

    @com.aliyun.core.annotation.NameInMap("ParameterSize")
    private Long parameterSize;

    @com.aliyun.core.annotation.NameInMap("SearchWords")
    private String searchWords;

    @com.aliyun.core.annotation.NameInMap("SupportedCompressionMethods")
    private java.util.Map<String, ?> supportedCompressionMethods;

    @com.aliyun.core.annotation.NameInMap("SupportedCompressionResources")
    private String supportedCompressionResources;

    @com.aliyun.core.annotation.NameInMap("SupportedDistillationMethods")
    private java.util.Map<String, ?> supportedDistillationMethods;

    @com.aliyun.core.annotation.NameInMap("SupportedDistillationResources")
    private String supportedDistillationResources;

    @com.aliyun.core.annotation.NameInMap("SupportedEvaluationMethods")
    private java.util.Map<String, ?> supportedEvaluationMethods;

    @com.aliyun.core.annotation.NameInMap("SupportedEvaluationResources")
    private String supportedEvaluationResources;

    @com.aliyun.core.annotation.NameInMap("SupportedInferenceMethods")
    private java.util.Map<String, ?> supportedInferenceMethods;

    @com.aliyun.core.annotation.NameInMap("SupportedInferenceResources")
    private String supportedInferenceResources;

    @com.aliyun.core.annotation.NameInMap("SupportedTrainingMethods")
    private java.util.Map<String, ?> supportedTrainingMethods;

    @com.aliyun.core.annotation.NameInMap("SupportedTrainingResources")
    private String supportedTrainingResources;

    @com.aliyun.core.annotation.NameInMap("Tags")
    private Tags tags;

    @com.aliyun.core.annotation.NameInMap("Task")
    private String task;

    @com.aliyun.core.annotation.NameInMap("Trainable")
    private Boolean trainable;

    private ModelGalleryModel(Builder builder) {
        this.collection = builder.collection;
        this.compressible = builder.compressible;
        this.deepThink = builder.deepThink;
        this.demonstrable = builder.demonstrable;
        this.deployable = builder.deployable;
        this.distillable = builder.distillable;
        this.domain = builder.domain;
        this.evaluable = builder.evaluable;
        this.extraInfo = builder.extraInfo;
        this.functionCall = builder.functionCall;
        this.gmtCreateTime = builder.gmtCreateTime;
        this.gmtLatestVersionModified = builder.gmtLatestVersionModified;
        this.gmtModifiedTime = builder.gmtModifiedTime;
        this.latestVersionName = builder.latestVersionName;
        this.modelDescription = builder.modelDescription;
        this.modelDoc = builder.modelDoc;
        this.modelId = builder.modelId;
        this.modelName = builder.modelName;
        this.modelSeries = builder.modelSeries;
        this.modelType = builder.modelType;
        this.orderNumber = builder.orderNumber;
        this.origin = builder.origin;
        this.parameterSize = builder.parameterSize;
        this.searchWords = builder.searchWords;
        this.supportedCompressionMethods = builder.supportedCompressionMethods;
        this.supportedCompressionResources = builder.supportedCompressionResources;
        this.supportedDistillationMethods = builder.supportedDistillationMethods;
        this.supportedDistillationResources = builder.supportedDistillationResources;
        this.supportedEvaluationMethods = builder.supportedEvaluationMethods;
        this.supportedEvaluationResources = builder.supportedEvaluationResources;
        this.supportedInferenceMethods = builder.supportedInferenceMethods;
        this.supportedInferenceResources = builder.supportedInferenceResources;
        this.supportedTrainingMethods = builder.supportedTrainingMethods;
        this.supportedTrainingResources = builder.supportedTrainingResources;
        this.tags = builder.tags;
        this.task = builder.task;
        this.trainable = builder.trainable;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ModelGalleryModel create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return collection
     */
    public String getCollection() {
        return this.collection;
    }

    /**
     * @return compressible
     */
    public Boolean getCompressible() {
        return this.compressible;
    }

    /**
     * @return deepThink
     */
    public Boolean getDeepThink() {
        return this.deepThink;
    }

    /**
     * @return demonstrable
     */
    public Boolean getDemonstrable() {
        return this.demonstrable;
    }

    /**
     * @return deployable
     */
    public Boolean getDeployable() {
        return this.deployable;
    }

    /**
     * @return distillable
     */
    public Boolean getDistillable() {
        return this.distillable;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return evaluable
     */
    public Boolean getEvaluable() {
        return this.evaluable;
    }

    /**
     * @return extraInfo
     */
    public java.util.Map<String, ?> getExtraInfo() {
        return this.extraInfo;
    }

    /**
     * @return functionCall
     */
    public Boolean getFunctionCall() {
        return this.functionCall;
    }

    /**
     * @return gmtCreateTime
     */
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    /**
     * @return gmtLatestVersionModified
     */
    public String getGmtLatestVersionModified() {
        return this.gmtLatestVersionModified;
    }

    /**
     * @return gmtModifiedTime
     */
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
    }

    /**
     * @return latestVersionName
     */
    public String getLatestVersionName() {
        return this.latestVersionName;
    }

    /**
     * @return modelDescription
     */
    public String getModelDescription() {
        return this.modelDescription;
    }

    /**
     * @return modelDoc
     */
    public String getModelDoc() {
        return this.modelDoc;
    }

    /**
     * @return modelId
     */
    public String getModelId() {
        return this.modelId;
    }

    /**
     * @return modelName
     */
    public String getModelName() {
        return this.modelName;
    }

    /**
     * @return modelSeries
     */
    public String getModelSeries() {
        return this.modelSeries;
    }

    /**
     * @return modelType
     */
    public String getModelType() {
        return this.modelType;
    }

    /**
     * @return orderNumber
     */
    public Long getOrderNumber() {
        return this.orderNumber;
    }

    /**
     * @return origin
     */
    public String getOrigin() {
        return this.origin;
    }

    /**
     * @return parameterSize
     */
    public Long getParameterSize() {
        return this.parameterSize;
    }

    /**
     * @return searchWords
     */
    public String getSearchWords() {
        return this.searchWords;
    }

    /**
     * @return supportedCompressionMethods
     */
    public java.util.Map<String, ?> getSupportedCompressionMethods() {
        return this.supportedCompressionMethods;
    }

    /**
     * @return supportedCompressionResources
     */
    public String getSupportedCompressionResources() {
        return this.supportedCompressionResources;
    }

    /**
     * @return supportedDistillationMethods
     */
    public java.util.Map<String, ?> getSupportedDistillationMethods() {
        return this.supportedDistillationMethods;
    }

    /**
     * @return supportedDistillationResources
     */
    public String getSupportedDistillationResources() {
        return this.supportedDistillationResources;
    }

    /**
     * @return supportedEvaluationMethods
     */
    public java.util.Map<String, ?> getSupportedEvaluationMethods() {
        return this.supportedEvaluationMethods;
    }

    /**
     * @return supportedEvaluationResources
     */
    public String getSupportedEvaluationResources() {
        return this.supportedEvaluationResources;
    }

    /**
     * @return supportedInferenceMethods
     */
    public java.util.Map<String, ?> getSupportedInferenceMethods() {
        return this.supportedInferenceMethods;
    }

    /**
     * @return supportedInferenceResources
     */
    public String getSupportedInferenceResources() {
        return this.supportedInferenceResources;
    }

    /**
     * @return supportedTrainingMethods
     */
    public java.util.Map<String, ?> getSupportedTrainingMethods() {
        return this.supportedTrainingMethods;
    }

    /**
     * @return supportedTrainingResources
     */
    public String getSupportedTrainingResources() {
        return this.supportedTrainingResources;
    }

    /**
     * @return tags
     */
    public Tags getTags() {
        return this.tags;
    }

    /**
     * @return task
     */
    public String getTask() {
        return this.task;
    }

    /**
     * @return trainable
     */
    public Boolean getTrainable() {
        return this.trainable;
    }

    public static final class Builder {
        private String collection; 
        private Boolean compressible; 
        private Boolean deepThink; 
        private Boolean demonstrable; 
        private Boolean deployable; 
        private Boolean distillable; 
        private String domain; 
        private Boolean evaluable; 
        private java.util.Map<String, ?> extraInfo; 
        private Boolean functionCall; 
        private String gmtCreateTime; 
        private String gmtLatestVersionModified; 
        private String gmtModifiedTime; 
        private String latestVersionName; 
        private String modelDescription; 
        private String modelDoc; 
        private String modelId; 
        private String modelName; 
        private String modelSeries; 
        private String modelType; 
        private Long orderNumber; 
        private String origin; 
        private Long parameterSize; 
        private String searchWords; 
        private java.util.Map<String, ?> supportedCompressionMethods; 
        private String supportedCompressionResources; 
        private java.util.Map<String, ?> supportedDistillationMethods; 
        private String supportedDistillationResources; 
        private java.util.Map<String, ?> supportedEvaluationMethods; 
        private String supportedEvaluationResources; 
        private java.util.Map<String, ?> supportedInferenceMethods; 
        private String supportedInferenceResources; 
        private java.util.Map<String, ?> supportedTrainingMethods; 
        private String supportedTrainingResources; 
        private Tags tags; 
        private String task; 
        private Boolean trainable; 

        private Builder() {
        } 

        private Builder(ModelGalleryModel model) {
            this.collection = model.collection;
            this.compressible = model.compressible;
            this.deepThink = model.deepThink;
            this.demonstrable = model.demonstrable;
            this.deployable = model.deployable;
            this.distillable = model.distillable;
            this.domain = model.domain;
            this.evaluable = model.evaluable;
            this.extraInfo = model.extraInfo;
            this.functionCall = model.functionCall;
            this.gmtCreateTime = model.gmtCreateTime;
            this.gmtLatestVersionModified = model.gmtLatestVersionModified;
            this.gmtModifiedTime = model.gmtModifiedTime;
            this.latestVersionName = model.latestVersionName;
            this.modelDescription = model.modelDescription;
            this.modelDoc = model.modelDoc;
            this.modelId = model.modelId;
            this.modelName = model.modelName;
            this.modelSeries = model.modelSeries;
            this.modelType = model.modelType;
            this.orderNumber = model.orderNumber;
            this.origin = model.origin;
            this.parameterSize = model.parameterSize;
            this.searchWords = model.searchWords;
            this.supportedCompressionMethods = model.supportedCompressionMethods;
            this.supportedCompressionResources = model.supportedCompressionResources;
            this.supportedDistillationMethods = model.supportedDistillationMethods;
            this.supportedDistillationResources = model.supportedDistillationResources;
            this.supportedEvaluationMethods = model.supportedEvaluationMethods;
            this.supportedEvaluationResources = model.supportedEvaluationResources;
            this.supportedInferenceMethods = model.supportedInferenceMethods;
            this.supportedInferenceResources = model.supportedInferenceResources;
            this.supportedTrainingMethods = model.supportedTrainingMethods;
            this.supportedTrainingResources = model.supportedTrainingResources;
            this.tags = model.tags;
            this.task = model.task;
            this.trainable = model.trainable;
        } 

        /**
         * Collection.
         */
        public Builder collection(String collection) {
            this.collection = collection;
            return this;
        }

        /**
         * Compressible.
         */
        public Builder compressible(Boolean compressible) {
            this.compressible = compressible;
            return this;
        }

        /**
         * DeepThink.
         */
        public Builder deepThink(Boolean deepThink) {
            this.deepThink = deepThink;
            return this;
        }

        /**
         * Demonstrable.
         */
        public Builder demonstrable(Boolean demonstrable) {
            this.demonstrable = demonstrable;
            return this;
        }

        /**
         * Deployable.
         */
        public Builder deployable(Boolean deployable) {
            this.deployable = deployable;
            return this;
        }

        /**
         * Distillable.
         */
        public Builder distillable(Boolean distillable) {
            this.distillable = distillable;
            return this;
        }

        /**
         * Domain.
         */
        public Builder domain(String domain) {
            this.domain = domain;
            return this;
        }

        /**
         * Evaluable.
         */
        public Builder evaluable(Boolean evaluable) {
            this.evaluable = evaluable;
            return this;
        }

        /**
         * ExtraInfo.
         */
        public Builder extraInfo(java.util.Map<String, ?> extraInfo) {
            this.extraInfo = extraInfo;
            return this;
        }

        /**
         * FunctionCall.
         */
        public Builder functionCall(Boolean functionCall) {
            this.functionCall = functionCall;
            return this;
        }

        /**
         * GmtCreateTime.
         */
        public Builder gmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }

        /**
         * GmtLatestVersionModified.
         */
        public Builder gmtLatestVersionModified(String gmtLatestVersionModified) {
            this.gmtLatestVersionModified = gmtLatestVersionModified;
            return this;
        }

        /**
         * GmtModifiedTime.
         */
        public Builder gmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }

        /**
         * LatestVersionName.
         */
        public Builder latestVersionName(String latestVersionName) {
            this.latestVersionName = latestVersionName;
            return this;
        }

        /**
         * ModelDescription.
         */
        public Builder modelDescription(String modelDescription) {
            this.modelDescription = modelDescription;
            return this;
        }

        /**
         * ModelDoc.
         */
        public Builder modelDoc(String modelDoc) {
            this.modelDoc = modelDoc;
            return this;
        }

        /**
         * ModelId.
         */
        public Builder modelId(String modelId) {
            this.modelId = modelId;
            return this;
        }

        /**
         * ModelName.
         */
        public Builder modelName(String modelName) {
            this.modelName = modelName;
            return this;
        }

        /**
         * ModelSeries.
         */
        public Builder modelSeries(String modelSeries) {
            this.modelSeries = modelSeries;
            return this;
        }

        /**
         * ModelType.
         */
        public Builder modelType(String modelType) {
            this.modelType = modelType;
            return this;
        }

        /**
         * OrderNumber.
         */
        public Builder orderNumber(Long orderNumber) {
            this.orderNumber = orderNumber;
            return this;
        }

        /**
         * Origin.
         */
        public Builder origin(String origin) {
            this.origin = origin;
            return this;
        }

        /**
         * ParameterSize.
         */
        public Builder parameterSize(Long parameterSize) {
            this.parameterSize = parameterSize;
            return this;
        }

        /**
         * SearchWords.
         */
        public Builder searchWords(String searchWords) {
            this.searchWords = searchWords;
            return this;
        }

        /**
         * SupportedCompressionMethods.
         */
        public Builder supportedCompressionMethods(java.util.Map<String, ?> supportedCompressionMethods) {
            this.supportedCompressionMethods = supportedCompressionMethods;
            return this;
        }

        /**
         * SupportedCompressionResources.
         */
        public Builder supportedCompressionResources(String supportedCompressionResources) {
            this.supportedCompressionResources = supportedCompressionResources;
            return this;
        }

        /**
         * SupportedDistillationMethods.
         */
        public Builder supportedDistillationMethods(java.util.Map<String, ?> supportedDistillationMethods) {
            this.supportedDistillationMethods = supportedDistillationMethods;
            return this;
        }

        /**
         * SupportedDistillationResources.
         */
        public Builder supportedDistillationResources(String supportedDistillationResources) {
            this.supportedDistillationResources = supportedDistillationResources;
            return this;
        }

        /**
         * SupportedEvaluationMethods.
         */
        public Builder supportedEvaluationMethods(java.util.Map<String, ?> supportedEvaluationMethods) {
            this.supportedEvaluationMethods = supportedEvaluationMethods;
            return this;
        }

        /**
         * SupportedEvaluationResources.
         */
        public Builder supportedEvaluationResources(String supportedEvaluationResources) {
            this.supportedEvaluationResources = supportedEvaluationResources;
            return this;
        }

        /**
         * SupportedInferenceMethods.
         */
        public Builder supportedInferenceMethods(java.util.Map<String, ?> supportedInferenceMethods) {
            this.supportedInferenceMethods = supportedInferenceMethods;
            return this;
        }

        /**
         * SupportedInferenceResources.
         */
        public Builder supportedInferenceResources(String supportedInferenceResources) {
            this.supportedInferenceResources = supportedInferenceResources;
            return this;
        }

        /**
         * SupportedTrainingMethods.
         */
        public Builder supportedTrainingMethods(java.util.Map<String, ?> supportedTrainingMethods) {
            this.supportedTrainingMethods = supportedTrainingMethods;
            return this;
        }

        /**
         * SupportedTrainingResources.
         */
        public Builder supportedTrainingResources(String supportedTrainingResources) {
            this.supportedTrainingResources = supportedTrainingResources;
            return this;
        }

        /**
         * Tags.
         */
        public Builder tags(Tags tags) {
            this.tags = tags;
            return this;
        }

        /**
         * Task.
         */
        public Builder task(String task) {
            this.task = task;
            return this;
        }

        /**
         * Trainable.
         */
        public Builder trainable(Boolean trainable) {
            this.trainable = trainable;
            return this;
        }

        public ModelGalleryModel build() {
            return new ModelGalleryModel(this);
        } 

    } 

    /**
     * 
     * {@link ModelGalleryModel} extends {@link TeaModel}
     *
     * <p>ModelGalleryModel</p>
     */
    public static class Tags extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tags(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tags create() {
            return builder().build();
        }

        /**
         * @return key
         */
        public String getKey() {
            return this.key;
        }

        /**
         * @return value
         */
        public String getValue() {
            return this.value;
        }

        public static final class Builder {
            private String key; 
            private String value; 

            private Builder() {
            } 

            private Builder(Tags model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * Key.
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * Value.
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tags build() {
                return new Tags(this);
            } 

        } 

    }
}
