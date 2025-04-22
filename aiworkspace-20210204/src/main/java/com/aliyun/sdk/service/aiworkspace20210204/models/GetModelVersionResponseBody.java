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
 * {@link GetModelVersionResponseBody} extends {@link TeaModel}
 *
 * <p>GetModelVersionResponseBody</p>
 */
public class GetModelVersionResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ApprovalStatus")
    private String approvalStatus;

    @com.aliyun.core.annotation.NameInMap("CompressionSpec")
    private java.util.Map<String, ?> compressionSpec;

    @com.aliyun.core.annotation.NameInMap("EvaluationSpec")
    private java.util.Map<String, ?> evaluationSpec;

    @com.aliyun.core.annotation.NameInMap("ExtraInfo")
    private java.util.Map<String, ?> extraInfo;

    @com.aliyun.core.annotation.NameInMap("FormatType")
    private String formatType;

    @com.aliyun.core.annotation.NameInMap("FrameworkType")
    private String frameworkType;

    @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @com.aliyun.core.annotation.NameInMap("GmtModifiedTime")
    private String gmtModifiedTime;

    @com.aliyun.core.annotation.NameInMap("InferenceSpec")
    private java.util.Map<String, ?> inferenceSpec;

    @com.aliyun.core.annotation.NameInMap("Labels")
    private java.util.List<Label> labels;

    @com.aliyun.core.annotation.NameInMap("Metrics")
    private java.util.Map<String, ?> metrics;

    @com.aliyun.core.annotation.NameInMap("Options")
    private String options;

    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private String ownerId;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("SourceId")
    private String sourceId;

    @com.aliyun.core.annotation.NameInMap("SourceType")
    private String sourceType;

    @com.aliyun.core.annotation.NameInMap("TrainingSpec")
    private java.util.Map<String, ?> trainingSpec;

    @com.aliyun.core.annotation.NameInMap("Uri")
    private String uri;

    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    @com.aliyun.core.annotation.NameInMap("VersionDescription")
    private String versionDescription;

    @com.aliyun.core.annotation.NameInMap("VersionName")
    private String versionName;

    private GetModelVersionResponseBody(Builder builder) {
        this.approvalStatus = builder.approvalStatus;
        this.compressionSpec = builder.compressionSpec;
        this.evaluationSpec = builder.evaluationSpec;
        this.extraInfo = builder.extraInfo;
        this.formatType = builder.formatType;
        this.frameworkType = builder.frameworkType;
        this.gmtCreateTime = builder.gmtCreateTime;
        this.gmtModifiedTime = builder.gmtModifiedTime;
        this.inferenceSpec = builder.inferenceSpec;
        this.labels = builder.labels;
        this.metrics = builder.metrics;
        this.options = builder.options;
        this.ownerId = builder.ownerId;
        this.requestId = builder.requestId;
        this.sourceId = builder.sourceId;
        this.sourceType = builder.sourceType;
        this.trainingSpec = builder.trainingSpec;
        this.uri = builder.uri;
        this.userId = builder.userId;
        this.versionDescription = builder.versionDescription;
        this.versionName = builder.versionName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetModelVersionResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
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
     * @return gmtCreateTime
     */
    public String getGmtCreateTime() {
        return this.gmtCreateTime;
    }

    /**
     * @return gmtModifiedTime
     */
    public String getGmtModifiedTime() {
        return this.gmtModifiedTime;
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
     * @return ownerId
     */
    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
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
     * @return userId
     */
    public String getUserId() {
        return this.userId;
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

    public static final class Builder {
        private String approvalStatus; 
        private java.util.Map<String, ?> compressionSpec; 
        private java.util.Map<String, ?> evaluationSpec; 
        private java.util.Map<String, ?> extraInfo; 
        private String formatType; 
        private String frameworkType; 
        private String gmtCreateTime; 
        private String gmtModifiedTime; 
        private java.util.Map<String, ?> inferenceSpec; 
        private java.util.List<Label> labels; 
        private java.util.Map<String, ?> metrics; 
        private String options; 
        private String ownerId; 
        private String requestId; 
        private String sourceId; 
        private String sourceType; 
        private java.util.Map<String, ?> trainingSpec; 
        private String uri; 
        private String userId; 
        private String versionDescription; 
        private String versionName; 

        private Builder() {
        } 

        private Builder(GetModelVersionResponseBody model) {
            this.approvalStatus = model.approvalStatus;
            this.compressionSpec = model.compressionSpec;
            this.evaluationSpec = model.evaluationSpec;
            this.extraInfo = model.extraInfo;
            this.formatType = model.formatType;
            this.frameworkType = model.frameworkType;
            this.gmtCreateTime = model.gmtCreateTime;
            this.gmtModifiedTime = model.gmtModifiedTime;
            this.inferenceSpec = model.inferenceSpec;
            this.labels = model.labels;
            this.metrics = model.metrics;
            this.options = model.options;
            this.ownerId = model.ownerId;
            this.requestId = model.requestId;
            this.sourceId = model.sourceId;
            this.sourceType = model.sourceType;
            this.trainingSpec = model.trainingSpec;
            this.uri = model.uri;
            this.userId = model.userId;
            this.versionDescription = model.versionDescription;
            this.versionName = model.versionName;
        } 

        /**
         * <p>The approval status. Valid values:</p>
         * <ul>
         * <li>Pending</li>
         * <li>Approved</li>
         * <li>Rejected</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Approved</p>
         */
        public Builder approvalStatus(String approvalStatus) {
            this.approvalStatus = approvalStatus;
            return this;
        }

        /**
         * <p>The compression configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder compressionSpec(java.util.Map<String, ?> compressionSpec) {
            this.compressionSpec = compressionSpec;
            return this;
        }

        /**
         * <p>The evaluation configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder evaluationSpec(java.util.Map<String, ?> evaluationSpec) {
            this.evaluationSpec = evaluationSpec;
            return this;
        }

        /**
         * <p>The additional information.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;CoverUris&quot;: [&quot;<a href="https://e***u.oss-cn-hangzhou.aliyuncs.com/st****017.preview.png%22%5D">https://e***u.oss-cn-hangzhou.aliyuncs.com/st****017.preview.png&quot;]</a>,
         *     &quot;TrainedWords&quot;: [&quot;albedo_overlord&quot;]
         * }</p>
         */
        public Builder extraInfo(java.util.Map<String, ?> extraInfo) {
            this.extraInfo = extraInfo;
            return this;
        }

        /**
         * <p>The model format. Valid values:</p>
         * <ul>
         * <li>OfflineModel</li>
         * <li>SavedModel</li>
         * <li>Keras H5</li>
         * <li>Frozen Pb</li>
         * <li>Caffe Prototxt</li>
         * <li>TorchScript</li>
         * <li>XGBoost</li>
         * <li>PMML</li>
         * <li>AlinkModel</li>
         * <li>ONNX</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SavedModel</p>
         */
        public Builder formatType(String formatType) {
            this.formatType = formatType;
            return this;
        }

        /**
         * <p>The model framework. Valid values:</p>
         * <ul>
         * <li>Pytorch -XGBoost</li>
         * <li>Keras</li>
         * <li>Caffe</li>
         * <li>Alink</li>
         * <li>Xflow</li>
         * <li>TensorFlow</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TensorFlow</p>
         */
        public Builder frameworkType(String frameworkType) {
            this.frameworkType = frameworkType;
            return this;
        }

        /**
         * <p>The time when the model was created, in UTC. The time follows the ISO 8601 standard.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-30T12:51:33.028Z</p>
         */
        public Builder gmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }

        /**
         * <p>The time when the model was last modified, in UTC. The time follows the ISO 8601 standard.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-30T12:51:33.028Z</p>
         */
        public Builder gmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }

        /**
         * <p>Describes how to apply to downstream inference services. For example, describes the processor and container of Elastic Algorithm Service (EAS).</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;Processor&quot;: &quot;tensorflow_gpu_1.12&quot;
         * }</p>
         */
        public Builder inferenceSpec(java.util.Map<String, ?> inferenceSpec) {
            this.inferenceSpec = inferenceSpec;
            return this;
        }

        /**
         * <p>The labels.</p>
         */
        public Builder labels(java.util.List<Label> labels) {
            this.labels = labels;
            return this;
        }

        /**
         * <p>The metrics.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder metrics(java.util.Map<String, ?> metrics) {
            this.metrics = metrics;
            return this;
        }

        /**
         * <p>The extended field. The value of this parameter is a JSON string.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder options(String options) {
            this.options = options;
            return this;
        }

        /**
         * <p>The ID of the Alibaba Cloud account.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890******</p>
         */
        public Builder ownerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>5A14FA81-DD4E-******-6343FE44B941</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The source ID.</p>
         * <ul>
         * <li>If the source type is Custom, this field is not limited.</li>
         * <li>If the source type is PAIFlow or TrainingService, the format is:</li>
         * </ul>
         * <!---->
         * 
         * <pre><code>region=&lt;region_id&gt;,workspaceId=&lt;workspace_id&gt;,kind=&lt;kind&gt;,id=&lt;id&gt;
         * </code></pre>
         * <p>Take note of the following parameters:</p>
         * <ul>
         * <li>region is the region ID.</li>
         * <li>workspaceId is the ID of the workspace.</li>
         * <li>kind is the type. Valid values: PipelineRun (PAIFlow) and ServiceJob (training service).</li>
         * <li>id is a unique identifier.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>region=cn-shanghai,workspaceId=13**,kind=PipelineRun,id=run-sakdb****jdf</p>
         */
        public Builder sourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }

        /**
         * <p>The source type of the model. Valid values:</p>
         * <ul>
         * <li>Custom</li>
         * <li>PAIFlow</li>
         * <li>TrainingService</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PAIFlow</p>
         */
        public Builder sourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }

        /**
         * <p>The training configurations used for fine-tuning and incremental training.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        public Builder trainingSpec(java.util.Map<String, ?> trainingSpec) {
            this.trainingSpec = trainingSpec;
            return this;
        }

        /**
         * <p>The URI of the model version, which is the location where the model is stored. Valid values:</p>
         * <ul>
         * <li>The HTTP(S) address of the model. Example: <code>https://myweb.com/mymodel.tar.gz</code>.</li>
         * <li>The Object Storage Service (OSS) path of the model, in the format of <code>oss://&lt;bucket&gt;.&lt;endpoint&gt;/object</code>. For endpoint, see <a href="https://help.aliyun.com/document_detail/31837.html">OSS regions and endpoints</a>. Example: <code>oss://mybucket.oss-cn-beijing.aliyuncs.com/mypath/</code>.</li>
         * </ul>
         */
        public Builder uri(String uri) {
            this.uri = uri;
            return this;
        }

        /**
         * <p>The user ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890******</p>
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        /**
         * <p>The version description.</p>
         */
        public Builder versionDescription(String versionDescription) {
            this.versionDescription = versionDescription;
            return this;
        }

        /**
         * <p>The model version.</p>
         * 
         * <strong>example:</strong>
         * <p>0.1.0</p>
         */
        public Builder versionName(String versionName) {
            this.versionName = versionName;
            return this;
        }

        public GetModelVersionResponseBody build() {
            return new GetModelVersionResponseBody(this);
        } 

    } 

}
