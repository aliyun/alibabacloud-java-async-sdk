// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paimodelgallery20250630.models;

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
 * {@link ListModelGalleryModelsRequest} extends {@link RequestModel}
 *
 * <p>ListModelGalleryModelsRequest</p>
 */
public class ListModelGalleryModelsRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Collections")
    private String collections;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Compressible")
    private Boolean compressible;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Conditions")
    private java.util.List<Conditions> conditions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DeepThink")
    private Boolean deepThink;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Demonstrable")
    private Boolean demonstrable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Deployable")
    private Boolean deployable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Distillable")
    private Boolean distillable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Domain")
    private String domain;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Evaluable")
    private Boolean evaluable;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("FunctionCall")
    private Boolean functionCall;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelName")
    private String modelName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelSeries")
    private String modelSeries;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ModelType")
    private String modelType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Order")
    private String order;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Origin")
    private String origin;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageNumber")
    private Integer pageNumber;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PageSize")
    private Integer pageSize;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Query")
    private String query;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SortBy")
    private String sortBy;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SupportedCompressionResource")
    private String supportedCompressionResource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SupportedDistillationResource")
    private String supportedDistillationResource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SupportedEvaluationResource")
    private String supportedEvaluationResource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SupportedInferenceResource")
    private String supportedInferenceResource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("SupportedTrainingResource")
    private String supportedTrainingResource;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Tag> tag;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Task")
    private String task;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Trainable")
    private Boolean trainable;

    private ListModelGalleryModelsRequest(Builder builder) {
        super(builder);
        this.collections = builder.collections;
        this.compressible = builder.compressible;
        this.conditions = builder.conditions;
        this.deepThink = builder.deepThink;
        this.demonstrable = builder.demonstrable;
        this.deployable = builder.deployable;
        this.distillable = builder.distillable;
        this.domain = builder.domain;
        this.evaluable = builder.evaluable;
        this.functionCall = builder.functionCall;
        this.modelName = builder.modelName;
        this.modelSeries = builder.modelSeries;
        this.modelType = builder.modelType;
        this.order = builder.order;
        this.origin = builder.origin;
        this.pageNumber = builder.pageNumber;
        this.pageSize = builder.pageSize;
        this.query = builder.query;
        this.sortBy = builder.sortBy;
        this.supportedCompressionResource = builder.supportedCompressionResource;
        this.supportedDistillationResource = builder.supportedDistillationResource;
        this.supportedEvaluationResource = builder.supportedEvaluationResource;
        this.supportedInferenceResource = builder.supportedInferenceResource;
        this.supportedTrainingResource = builder.supportedTrainingResource;
        this.tag = builder.tag;
        this.task = builder.task;
        this.trainable = builder.trainable;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListModelGalleryModelsRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return collections
     */
    public String getCollections() {
        return this.collections;
    }

    /**
     * @return compressible
     */
    public Boolean getCompressible() {
        return this.compressible;
    }

    /**
     * @return conditions
     */
    public java.util.List<Conditions> getConditions() {
        return this.conditions;
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
     * @return functionCall
     */
    public Boolean getFunctionCall() {
        return this.functionCall;
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
     * @return order
     */
    public String getOrder() {
        return this.order;
    }

    /**
     * @return origin
     */
    public String getOrigin() {
        return this.origin;
    }

    /**
     * @return pageNumber
     */
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    /**
     * @return pageSize
     */
    public Integer getPageSize() {
        return this.pageSize;
    }

    /**
     * @return query
     */
    public String getQuery() {
        return this.query;
    }

    /**
     * @return sortBy
     */
    public String getSortBy() {
        return this.sortBy;
    }

    /**
     * @return supportedCompressionResource
     */
    public String getSupportedCompressionResource() {
        return this.supportedCompressionResource;
    }

    /**
     * @return supportedDistillationResource
     */
    public String getSupportedDistillationResource() {
        return this.supportedDistillationResource;
    }

    /**
     * @return supportedEvaluationResource
     */
    public String getSupportedEvaluationResource() {
        return this.supportedEvaluationResource;
    }

    /**
     * @return supportedInferenceResource
     */
    public String getSupportedInferenceResource() {
        return this.supportedInferenceResource;
    }

    /**
     * @return supportedTrainingResource
     */
    public String getSupportedTrainingResource() {
        return this.supportedTrainingResource;
    }

    /**
     * @return tag
     */
    public java.util.List<Tag> getTag() {
        return this.tag;
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

    public static final class Builder extends Request.Builder<ListModelGalleryModelsRequest, Builder> {
        private String collections; 
        private Boolean compressible; 
        private java.util.List<Conditions> conditions; 
        private Boolean deepThink; 
        private Boolean demonstrable; 
        private Boolean deployable; 
        private Boolean distillable; 
        private String domain; 
        private Boolean evaluable; 
        private Boolean functionCall; 
        private String modelName; 
        private String modelSeries; 
        private String modelType; 
        private String order; 
        private String origin; 
        private Integer pageNumber; 
        private Integer pageSize; 
        private String query; 
        private String sortBy; 
        private String supportedCompressionResource; 
        private String supportedDistillationResource; 
        private String supportedEvaluationResource; 
        private String supportedInferenceResource; 
        private String supportedTrainingResource; 
        private java.util.List<Tag> tag; 
        private String task; 
        private Boolean trainable; 

        private Builder() {
            super();
        } 

        private Builder(ListModelGalleryModelsRequest request) {
            super(request);
            this.collections = request.collections;
            this.compressible = request.compressible;
            this.conditions = request.conditions;
            this.deepThink = request.deepThink;
            this.demonstrable = request.demonstrable;
            this.deployable = request.deployable;
            this.distillable = request.distillable;
            this.domain = request.domain;
            this.evaluable = request.evaluable;
            this.functionCall = request.functionCall;
            this.modelName = request.modelName;
            this.modelSeries = request.modelSeries;
            this.modelType = request.modelType;
            this.order = request.order;
            this.origin = request.origin;
            this.pageNumber = request.pageNumber;
            this.pageSize = request.pageSize;
            this.query = request.query;
            this.sortBy = request.sortBy;
            this.supportedCompressionResource = request.supportedCompressionResource;
            this.supportedDistillationResource = request.supportedDistillationResource;
            this.supportedEvaluationResource = request.supportedEvaluationResource;
            this.supportedInferenceResource = request.supportedInferenceResource;
            this.supportedTrainingResource = request.supportedTrainingResource;
            this.tag = request.tag;
            this.task = request.task;
            this.trainable = request.trainable;
        } 

        /**
         * <p>The collection to which the model belongs. The collection for ModelGallery models is QuickStart.</p>
         * 
         * <strong>example:</strong>
         * <p>QuickStart</p>
         */
        public Builder collections(String collections) {
            this.putQueryParameter("Collections", collections);
            this.collections = collections;
            return this;
        }

        /**
         * <p>Specifies whether model compression is supported.</p>
         */
        public Builder compressible(Boolean compressible) {
            this.putQueryParameter("Compressible", compressible);
            this.compressible = compressible;
            return this;
        }

        /**
         * <p>The list of conditions.</p>
         */
        public Builder conditions(java.util.List<Conditions> conditions) {
            String conditionsShrink = shrink(conditions, "Conditions", "json");
            this.putQueryParameter("Conditions", conditionsShrink);
            this.conditions = conditions;
            return this;
        }

        /**
         * <p>Specifies whether deep thinking is supported.</p>
         */
        public Builder deepThink(Boolean deepThink) {
            this.putQueryParameter("DeepThink", deepThink);
            this.deepThink = deepThink;
            return this;
        }

        /**
         * <p>Specifies whether online experience is supported.</p>
         */
        public Builder demonstrable(Boolean demonstrable) {
            this.putQueryParameter("Demonstrable", demonstrable);
            this.demonstrable = demonstrable;
            return this;
        }

        /**
         * <p>Specifies whether deployment is supported.</p>
         */
        public Builder deployable(Boolean deployable) {
            this.putQueryParameter("Deployable", deployable);
            this.deployable = deployable;
            return this;
        }

        /**
         * <p>Specifies whether distillation is supported.</p>
         */
        public Builder distillable(Boolean distillable) {
            this.putQueryParameter("Distillable", distillable);
            this.distillable = distillable;
            return this;
        }

        /**
         * <p>The domain used to filter the model list. For example, aigc (generative AI), nlp (natural language processing), or cv (computer vision).</p>
         * 
         * <strong>example:</strong>
         * <p>aigc</p>
         */
        public Builder domain(String domain) {
            this.putQueryParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * <p>Specifies whether evaluation is supported.</p>
         */
        public Builder evaluable(Boolean evaluable) {
            this.putQueryParameter("Evaluable", evaluable);
            this.evaluable = evaluable;
            return this;
        }

        /**
         * <p>Specifies whether FunctionCall is supported.</p>
         */
        public Builder functionCall(Boolean functionCall) {
            this.putQueryParameter("FunctionCall", functionCall);
            this.functionCall = functionCall;
            return this;
        }

        /**
         * <p>The model name. By default, fuzzy match is used to filter the model list. Enclose the name in double quotation marks for exact match. For example, &quot;DeepSeek-V3.2&quot; exactly matches the model DeepSeek-V3.2.</p>
         * 
         * <strong>example:</strong>
         * <p>Qwen3-235B-A22B-Thinking-2507</p>
         */
        public Builder modelName(String modelName) {
            this.putQueryParameter("ModelName", modelName);
            this.modelName = modelName;
            return this;
        }

        /**
         * <p>The model series. For example, PAI Optimized Model, Qwen, Wan-AI, GLM, Baichuan, DeepSeek, Kimi, MiniMax, Yi, InternLM, InternVL, OpenAI, NVIDIA, Gemma, Phi, dots_vlm, Llama, Mistral, Stable Diffusion, FLUX, Byte Dance, StepFun AI, ERNIE Bot, Tencent Hunyuan, or YOLO.</p>
         * 
         * <strong>example:</strong>
         * <p>Qwen</p>
         */
        public Builder modelSeries(String modelSeries) {
            this.putQueryParameter("ModelSeries", modelSeries);
            this.modelSeries = modelSeries;
            return this;
        }

        /**
         * <p>The model type.</p>
         * 
         * <strong>example:</strong>
         * <p>Endpoint</p>
         */
        public Builder modelType(String modelType) {
            this.putQueryParameter("ModelType", modelType);
            this.modelType = modelType;
            return this;
        }

        /**
         * <p>The sort order for the specified sort field in a paged query. Default value: ASC.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>ASC: ascending order.</li>
         * <li>DESC: descending order.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DESC</p>
         */
        public Builder order(String order) {
            this.putQueryParameter("Order", order);
            this.order = order;
            return this;
        }

        /**
         * <p>The model source used to filter models that belong to a specific community or organization. For example, ModelScope, PAI, or NIM.</p>
         * 
         * <strong>example:</strong>
         * <p>ModelScope</p>
         */
        public Builder origin(String origin) {
            this.putQueryParameter("Origin", origin);
            this.origin = origin;
            return this;
        }

        /**
         * <p>The page number of the model list. Minimum value: 1. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder pageNumber(Integer pageNumber) {
            this.putQueryParameter("PageNumber", pageNumber);
            this.pageNumber = pageNumber;
            return this;
        }

        /**
         * <p>The number of models to display on each page in a paged query. Default value: 10.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        public Builder pageSize(Integer pageSize) {
            this.putQueryParameter("PageSize", pageSize);
            this.pageSize = pageSize;
            return this;
        }

        /**
         * <p>The query condition. Fuzzy match is performed across multiple fields such as ModelName, Domain, and Task.</p>
         * 
         * <strong>example:</strong>
         * <p>Qwen</p>
         */
        public Builder query(String query) {
            this.putQueryParameter("Query", query);
            this.query = query;
            return this;
        }

        /**
         * <p>The sort field for a paged query. Currently, the GmtCreateTime field is used for sorting. Valid values:</p>
         * <ul>
         * <li><p>GmtCreateTime: the model creation time.</p>
         * </li>
         * <li><p>GmtLatestVersionModified: the time when the latest model version was updated.</p>
         * </li>
         * <li><p>OrderNumber: the ordinal number.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>GmtCreateTime</p>
         */
        public Builder sortBy(String sortBy) {
            this.putQueryParameter("SortBy", sortBy);
            this.sortBy = sortBy;
            return this;
        }

        /**
         * <p>The supported compression resources, such as CPU, GPU, or GP7V. For example, if you specify GP7V, only models that support compression on GP7V resources are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>GP7V</p>
         */
        public Builder supportedCompressionResource(String supportedCompressionResource) {
            this.putQueryParameter("SupportedCompressionResource", supportedCompressionResource);
            this.supportedCompressionResource = supportedCompressionResource;
            return this;
        }

        /**
         * <p>The supported distillation resources, such as CPU, GPU, or GP7V. For example, if you specify GP7V, only models that support distillation on GP7V resources are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>GP7V</p>
         */
        public Builder supportedDistillationResource(String supportedDistillationResource) {
            this.putQueryParameter("SupportedDistillationResource", supportedDistillationResource);
            this.supportedDistillationResource = supportedDistillationResource;
            return this;
        }

        /**
         * <p>The supported evaluation resources, such as CPU, GPU, or GP7V. For example, if you specify GP7V, only models that support evaluation on GP7V resources are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>GP7V</p>
         */
        public Builder supportedEvaluationResource(String supportedEvaluationResource) {
            this.putQueryParameter("SupportedEvaluationResource", supportedEvaluationResource);
            this.supportedEvaluationResource = supportedEvaluationResource;
            return this;
        }

        /**
         * <p>The supported deployment resources, such as CPU, GPU, or GP7V. For example, if you specify GP7V, only models that support deployment on GP7V resources are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>GP7V</p>
         */
        public Builder supportedInferenceResource(String supportedInferenceResource) {
            this.putQueryParameter("SupportedInferenceResource", supportedInferenceResource);
            this.supportedInferenceResource = supportedInferenceResource;
            return this;
        }

        /**
         * <p>The supported training resources, such as CPU, GPU, or GP7V. For example, if you specify GP7V, only models that support training on GP7V resources are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>GP7V</p>
         */
        public Builder supportedTrainingResource(String supportedTrainingResource) {
            this.putQueryParameter("SupportedTrainingResource", supportedTrainingResource);
            this.supportedTrainingResource = supportedTrainingResource;
            return this;
        }

        /**
         * <p>The list of labels.</p>
         */
        public Builder tag(java.util.List<Tag> tag) {
            String tagShrink = shrink(tag, "Tag", "json");
            this.putQueryParameter("Tag", tagShrink);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The task. For example, large-language-model (large language model), image-classification (image classification), or embedding.</p>
         * 
         * <strong>example:</strong>
         * <p>large-language-model</p>
         */
        public Builder task(String task) {
            this.putQueryParameter("Task", task);
            this.task = task;
            return this;
        }

        /**
         * <p>Specifies whether training is supported.</p>
         */
        public Builder trainable(Boolean trainable) {
            this.putQueryParameter("Trainable", trainable);
            this.trainable = trainable;
            return this;
        }

        @Override
        public ListModelGalleryModelsRequest build() {
            return new ListModelGalleryModelsRequest(this);
        } 

    } 

    /**
     * 
     * {@link ListModelGalleryModelsRequest} extends {@link TeaModel}
     *
     * <p>ListModelGalleryModelsRequest</p>
     */
    public static class Conditions extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Column")
        private String column;

        @com.aliyun.core.annotation.NameInMap("Operator")
        private String operator;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Conditions(Builder builder) {
            this.column = builder.column;
            this.operator = builder.operator;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Conditions create() {
            return builder().build();
        }

        /**
         * @return column
         */
        public String getColumn() {
            return this.column;
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
            private String column; 
            private String operator; 
            private String value; 

            private Builder() {
            } 

            private Builder(Conditions model) {
                this.column = model.column;
                this.operator = model.operator;
                this.value = model.value;
            } 

            /**
             * <p>The parameter name. ParameterSize is supported. Unit: M.</p>
             * 
             * <strong>example:</strong>
             * <p>ParameterSize</p>
             */
            public Builder column(String column) {
                this.column = column;
                return this;
            }

            /**
             * <p>The operator. For example, LessThan.</p>
             * 
             * <strong>example:</strong>
             * <p>LessThan</p>
             */
            public Builder operator(String operator) {
                this.operator = operator;
                return this;
            }

            /**
             * <p>The value. If Column is set to ParameterSize, the value is an integer. Unit: M.</p>
             * 
             * <strong>example:</strong>
             * <p>1024</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Conditions build() {
                return new Conditions(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListModelGalleryModelsRequest} extends {@link TeaModel}
     *
     * <p>ListModelGalleryModelsRequest</p>
     */
    public static class Tag extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Key")
        private String key;

        @com.aliyun.core.annotation.NameInMap("Value")
        private String value;

        private Tag(Builder builder) {
            this.key = builder.key;
            this.value = builder.value;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Tag create() {
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

            private Builder(Tag model) {
                this.key = model.key;
                this.value = model.value;
            } 

            /**
             * <p>The label key.</p>
             * 
             * <strong>example:</strong>
             * <p>k1</p>
             */
            public Builder key(String key) {
                this.key = key;
                return this;
            }

            /**
             * <p>The label value.</p>
             * 
             * <strong>example:</strong>
             * <p>v1</p>
             */
            public Builder value(String value) {
                this.value = value;
                return this;
            }

            public Tag build() {
                return new Tag(this);
            } 

        } 

    }
}
