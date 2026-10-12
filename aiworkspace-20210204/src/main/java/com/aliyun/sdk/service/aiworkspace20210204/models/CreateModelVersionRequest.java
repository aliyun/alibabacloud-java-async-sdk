// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

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
 * {@link CreateModelVersionRequest} extends {@link RequestModel}
 *
 * <p>CreateModelVersionRequest</p>
 */
public class CreateModelVersionRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ModelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String modelId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ApprovalStatus")
    private String approvalStatus;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CompressionSpec")
    private java.util.Map<String, ?> compressionSpec;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DistillationSpec")
    private java.util.Map<String, ?> distillationSpec;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("EvaluationSpec")
    private java.util.Map<String, ?> evaluationSpec;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExtraInfo")
    private java.util.Map<String, ?> extraInfo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FormatType")
    private String formatType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("FrameworkType")
    private String frameworkType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("InferenceSpec")
    private java.util.Map<String, ?> inferenceSpec;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Labels")
    private java.util.List<Label> labels;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Metrics")
    private java.util.Map<String, ?> metrics;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Options")
    private String options;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SourceId")
    private String sourceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SourceType")
    private String sourceType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TrainingSpec")
    private java.util.Map<String, ?> trainingSpec;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Uri")
    @com.aliyun.core.annotation.Validation(required = true)
    private String uri;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VersionDescription")
    private String versionDescription;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("VersionName")
    private String versionName;

    private CreateModelVersionRequest(Builder builder) {
        super(builder);
        this.modelId = builder.modelId;
        this.approvalStatus = builder.approvalStatus;
        this.compressionSpec = builder.compressionSpec;
        this.distillationSpec = builder.distillationSpec;
        this.evaluationSpec = builder.evaluationSpec;
        this.extraInfo = builder.extraInfo;
        this.formatType = builder.formatType;
        this.frameworkType = builder.frameworkType;
        this.inferenceSpec = builder.inferenceSpec;
        this.labels = builder.labels;
        this.metrics = builder.metrics;
        this.options = builder.options;
        this.sourceId = builder.sourceId;
        this.sourceType = builder.sourceType;
        this.trainingSpec = builder.trainingSpec;
        this.uri = builder.uri;
        this.versionDescription = builder.versionDescription;
        this.versionName = builder.versionName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateModelVersionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return modelId
     */
    public String getModelId() {
        return this.modelId;
    }

    /**
     * @return approvalStatus
     */
    public String getApprovalStatus() {
        return this.approvalStatus;
    }

    /**
     * @return compressionSpec
     */
    public java.util.Map<String, ?> getCompressionSpec() {
        return this.compressionSpec;
    }

    /**
     * @return distillationSpec
     */
    public java.util.Map<String, ?> getDistillationSpec() {
        return this.distillationSpec;
    }

    /**
     * @return evaluationSpec
     */
    public java.util.Map<String, ?> getEvaluationSpec() {
        return this.evaluationSpec;
    }

    /**
     * @return extraInfo
     */
    public java.util.Map<String, ?> getExtraInfo() {
        return this.extraInfo;
    }

    /**
     * @return formatType
     */
    public String getFormatType() {
        return this.formatType;
    }

    /**
     * @return frameworkType
     */
    public String getFrameworkType() {
        return this.frameworkType;
    }

    /**
     * @return inferenceSpec
     */
    public java.util.Map<String, ?> getInferenceSpec() {
        return this.inferenceSpec;
    }

    /**
     * @return labels
     */
    public java.util.List<Label> getLabels() {
        return this.labels;
    }

    /**
     * @return metrics
     */
    public java.util.Map<String, ?> getMetrics() {
        return this.metrics;
    }

    /**
     * @return options
     */
    public String getOptions() {
        return this.options;
    }

    /**
     * @return sourceId
     */
    public String getSourceId() {
        return this.sourceId;
    }

    /**
     * @return sourceType
     */
    public String getSourceType() {
        return this.sourceType;
    }

    /**
     * @return trainingSpec
     */
    public java.util.Map<String, ?> getTrainingSpec() {
        return this.trainingSpec;
    }

    /**
     * @return uri
     */
    public String getUri() {
        return this.uri;
    }

    /**
     * @return versionDescription
     */
    public String getVersionDescription() {
        return this.versionDescription;
    }

    /**
     * @return versionName
     */
    public String getVersionName() {
        return this.versionName;
    }

    public static final class Builder extends Request.Builder<CreateModelVersionRequest, Builder> {
        private String modelId; 
        private String approvalStatus; 
        private java.util.Map<String, ?> compressionSpec; 
        private java.util.Map<String, ?> distillationSpec; 
        private java.util.Map<String, ?> evaluationSpec; 
        private java.util.Map<String, ?> extraInfo; 
        private String formatType; 
        private String frameworkType; 
        private java.util.Map<String, ?> inferenceSpec; 
        private java.util.List<Label> labels; 
        private java.util.Map<String, ?> metrics; 
        private String options; 
        private String sourceId; 
        private String sourceType; 
        private java.util.Map<String, ?> trainingSpec; 
        private String uri; 
        private String versionDescription; 
        private String versionName; 

        private Builder() {
            super();
        } 

        private Builder(CreateModelVersionRequest request) {
            super(request);
            this.modelId = request.modelId;
            this.approvalStatus = request.approvalStatus;
            this.compressionSpec = request.compressionSpec;
            this.distillationSpec = request.distillationSpec;
            this.evaluationSpec = request.evaluationSpec;
            this.extraInfo = request.extraInfo;
            this.formatType = request.formatType;
            this.frameworkType = request.frameworkType;
            this.inferenceSpec = request.inferenceSpec;
            this.labels = request.labels;
            this.metrics = request.metrics;
            this.options = request.options;
            this.sourceId = request.sourceId;
            this.sourceType = request.sourceType;
            this.trainingSpec = request.trainingSpec;
            this.uri = request.uri;
            this.versionDescription = request.versionDescription;
            this.versionName = request.versionName;
        } 

        /**
         * <p>The model ID. For more information about how to obtain the model ID, see <a href="https://help.aliyun.com/document_detail/461944.html">ListModels</a>.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>model-dfs1****5c</p>
         */
        public Builder modelId(String modelId) {
            this.putPathParameter("ModelId", modelId);
            this.modelId = modelId;
            return this;
        }

        /**
         * <p>The approval status. Valid values:</p>
         * <ul>
         * <li><p>Pending: The version is pending approval.</p>
         * </li>
         * <li><p>Approved: The version is approved for deployment.</p>
         * </li>
         * <li><p>Rejected: The version is rejected for deployment.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Approved</p>
         */
        public Builder approvalStatus(String approvalStatus) {
            this.putBodyParameter("ApprovalStatus", approvalStatus);
            this.approvalStatus = approvalStatus;
            return this;
        }

        /**
         * <p>The compression configurations.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder compressionSpec(java.util.Map<String, ?> compressionSpec) {
            this.putBodyParameter("CompressionSpec", compressionSpec);
            this.compressionSpec = compressionSpec;
            return this;
        }

        /**
         * <p>The distillation configurations.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder distillationSpec(java.util.Map<String, ?> distillationSpec) {
            this.putBodyParameter("DistillationSpec", distillationSpec);
            this.distillationSpec = distillationSpec;
            return this;
        }

        /**
         * <p>The evaluation configurations.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder evaluationSpec(java.util.Map<String, ?> evaluationSpec) {
            this.putBodyParameter("EvaluationSpec", evaluationSpec);
            this.evaluationSpec = evaluationSpec;
            return this;
        }

        /**
         * <p>Other information.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;CoverUris&quot;: [&quot;<a href="https://e***u.oss-cn-hangzhou.aliyuncs.com/st****017.preview.png%22%5D">https://e***u.oss-cn-hangzhou.aliyuncs.com/st****017.preview.png&quot;]</a>,
         *     &quot;TrainedWords&quot;: [&quot;albedo_overlord&quot;]
         * }</p>
         */
        public Builder extraInfo(java.util.Map<String, ?> extraInfo) {
            this.putBodyParameter("ExtraInfo", extraInfo);
            this.extraInfo = extraInfo;
            return this;
        }

        /**
         * <p>The format of the model. Valid values:</p>
         * <ul>
         * <li><p>OfflineModel</p>
         * </li>
         * <li><p>SavedModel</p>
         * </li>
         * <li><p>Keras H5</p>
         * </li>
         * <li><p>Frozen Pb</p>
         * </li>
         * <li><p>Caffe Prototxt</p>
         * </li>
         * <li><p>TorchScript</p>
         * </li>
         * <li><p>XGBoost</p>
         * </li>
         * <li><p>PMML</p>
         * </li>
         * <li><p>AlinkModel</p>
         * </li>
         * <li><p>ONNX</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SavedModel</p>
         */
        public Builder formatType(String formatType) {
            this.putBodyParameter("FormatType", formatType);
            this.formatType = formatType;
            return this;
        }

        /**
         * <p>The framework of the model. Valid values:</p>
         * <ul>
         * <li><p>Pytorch</p>
         * </li>
         * <li><p>XGBoost</p>
         * </li>
         * <li><p>Keras</p>
         * </li>
         * <li><p>Caffe</p>
         * </li>
         * <li><p>Alink</p>
         * </li>
         * <li><p>Xflow</p>
         * </li>
         * <li><p>TensorFlow</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TensorFlow</p>
         */
        public Builder frameworkType(String frameworkType) {
            this.putBodyParameter("FrameworkType", frameworkType);
            this.frameworkType = frameworkType;
            return this;
        }

        /**
         * <p>The configurations for downstream inference services, such as the processor and container for Elastic Algorithm Service (EAS). Example:
         * <code>{ &quot;processor&quot;: &quot;tensorflow_gpu_1.12&quot; }</code></p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;processor&quot;: &quot;tensorflow_gpu_1.12&quot;
         * }</p>
         */
        public Builder inferenceSpec(java.util.Map<String, ?> inferenceSpec) {
            this.putBodyParameter("InferenceSpec", inferenceSpec);
            this.inferenceSpec = inferenceSpec;
            return this;
        }

        /**
         * <p>The list of labels.</p>
         */
        public Builder labels(java.util.List<Label> labels) {
            this.putBodyParameter("Labels", labels);
            this.labels = labels;
            return this;
        }

        /**
         * <p>The model metrics.
         * The serialized data cannot exceed 8,192 bytes in length.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;Results&quot;: [{
         *     &quot;Dataset&quot;: {
         *       &quot;DatasetId&quot;: &quot;d-sdkjanksaklerhfd&quot;
         *     },
         *     &quot;Metrics&quot;: {
         *       &quot;cer&quot;: 0.175
         *     }
         *   }, {
         *     &quot;Dataset&quot;: {
         *       &quot;Uri&quot;: &quot;oss://xxxx/&quot;
         *     },
         *     &quot;Metrics&quot;: {
         *       &quot;cer&quot;: 0.172
         *     }
         *   }]
         * }</p>
         */
        public Builder metrics(java.util.Map<String, ?> metrics) {
            this.putBodyParameter("Metrics", metrics);
            this.metrics = metrics;
            return this;
        }

        /**
         * <p>The extended fields. This parameter is a JSON string.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder options(String options) {
            this.putBodyParameter("Options", options);
            this.options = options;
            return this;
        }

        /**
         * <p>The source ID.</p>
         * <ul>
         * <li><p>If SourceType is set to Custom, this parameter has no format restrictions.</p>
         * </li>
         * <li><p>If SourceType is PAIFlow or TrainingService, the value must be in the following format:</p>
         * </li>
         * </ul>
         * <pre><code>region=&lt;region_id&gt;,workspaceId=&lt;workspace_id&gt;,kind=&lt;kind&gt;,id=&lt;id&gt;
         * </code></pre>
         * <p>The fields are described as follows:</p>
         * <ul>
         * <li><p>region: The ID of the Alibaba Cloud region.</p>
         * </li>
         * <li><p>workspaceId: The ID of the workspace.</p>
         * </li>
         * <li><p>kind: The type. Valid values: PipelineRun (PAI pipeline) and ServiceJob (training service).</p>
         * </li>
         * <li><p>id: The unique identifier.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>region=cn-shanghai,workspaceId=13**,kind=PipelineRun,id=run-sakdb****jdf</p>
         */
        public Builder sourceId(String sourceId) {
            this.putBodyParameter("SourceId", sourceId);
            this.sourceId = sourceId;
            return this;
        }

        /**
         * <p>The source type of the model. Valid values:</p>
         * <ul>
         * <li><p>Custom (default): The model is custom.</p>
         * </li>
         * <li><p>PAIFlow: The model is from a PAI pipeline.</p>
         * </li>
         * <li><p>TrainingService: The model is from a PAI training service.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PAIFlow</p>
         */
        public Builder sourceType(String sourceType) {
            this.putBodyParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        /**
         * <p>The training configurations. These configurations are used for fine-tuning and incremental training.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder trainingSpec(java.util.Map<String, ?> trainingSpec) {
            this.putBodyParameter("TrainingSpec", trainingSpec);
            this.trainingSpec = trainingSpec;
            return this;
        }

        /**
         * <p>The URI of the model version, which is the storage location of the model. The following types of model URIs are supported:</p>
         * <ul>
         * <li><p>An HTTP or HTTPS URL of the model. Example: <code>https://myweb.com/mymodel.tar.gz</code>.</p>
         * </li>
         * <li><p>If the model is stored in Object Storage Service (OSS), the URI must be in the <code>oss://&lt;bucket&gt;.&lt;endpoint&gt;/object</code> format. For more information about endpoints, see <a href="https://help.aliyun.com/document_detail/31837.html">Endpoints</a>. Example: <code>oss://mybucket.oss-cn-beijing.aliyuncs.com/mypath/</code>.</p>
         * </li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://mybucket.oss-cn-beijing.aliyuncs.com/mypath/</p>
         */
        public Builder uri(String uri) {
            this.putBodyParameter("Uri", uri);
            this.uri = uri;
            return this;
        }

        /**
         * <p>The description of the model version.</p>
         * 
         * <strong>example:</strong>
         * <p>Sentiment analysis.</p>
         */
        public Builder versionDescription(String versionDescription) {
            this.putBodyParameter("VersionDescription", versionDescription);
            this.versionDescription = versionDescription;
            return this;
        }

        /**
         * <p>The model version. The version must be unique within the model. If you do not specify this parameter, the first version defaults to <strong>0.1.0</strong>. The minor version number is then incremented by 1 for each subsequent version. For example, the second version defaults to <strong>0.2.0</strong>.
         * A version number consists of a major version, a minor version, and a patch version, separated by periods (.). The major and minor versions are numbers. The patch version can start with a number and contain underscores (_) and letters. Examples: 1.1.0 and 2.3.4_beta.</p>
         * 
         * <strong>example:</strong>
         * <p>0.1.0</p>
         */
        public Builder versionName(String versionName) {
            this.putBodyParameter("VersionName", versionName);
            this.versionName = versionName;
            return this;
        }

        @Override
        public CreateModelVersionRequest build() {
            return new CreateModelVersionRequest(this);
        } 

    } 

}
