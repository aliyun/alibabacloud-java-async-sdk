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
 * {@link UpdateModelRequest} extends {@link RequestModel}
 *
 * <p>UpdateModelRequest</p>
 */
public class UpdateModelRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("ModelId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String modelId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Accessibility")
    private String accessibility;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Domain")
    private String domain;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ExtraInfo")
    private java.util.Map<String, ?> extraInfo;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ModelDescription")
    private String modelDescription;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ModelDoc")
    private String modelDoc;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ModelName")
    private String modelName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ModelType")
    private String modelType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("OrderNumber")
    private Long orderNumber;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Origin")
    private String origin;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Task")
    private String task;

    private UpdateModelRequest(Builder builder) {
        super(builder);
        this.modelId = builder.modelId;
        this.accessibility = builder.accessibility;
        this.domain = builder.domain;
        this.extraInfo = builder.extraInfo;
        this.modelDescription = builder.modelDescription;
        this.modelDoc = builder.modelDoc;
        this.modelName = builder.modelName;
        this.modelType = builder.modelType;
        this.orderNumber = builder.orderNumber;
        this.origin = builder.origin;
        this.task = builder.task;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateModelRequest create() {
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
     * @return accessibility
     */
    public String getAccessibility() {
        return this.accessibility;
    }

    /**
     * @return domain
     */
    public String getDomain() {
        return this.domain;
    }

    /**
     * @return extraInfo
     */
    public java.util.Map<String, ?> getExtraInfo() {
        return this.extraInfo;
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
     * @return modelName
     */
    public String getModelName() {
        return this.modelName;
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
     * @return task
     */
    public String getTask() {
        return this.task;
    }

    public static final class Builder extends Request.Builder<UpdateModelRequest, Builder> {
        private String modelId; 
        private String accessibility; 
        private String domain; 
        private java.util.Map<String, ?> extraInfo; 
        private String modelDescription; 
        private String modelDoc; 
        private String modelName; 
        private String modelType; 
        private Long orderNumber; 
        private String origin; 
        private String task; 

        private Builder() {
            super();
        } 

        private Builder(UpdateModelRequest request) {
            super(request);
            this.modelId = request.modelId;
            this.accessibility = request.accessibility;
            this.domain = request.domain;
            this.extraInfo = request.extraInfo;
            this.modelDescription = request.modelDescription;
            this.modelDoc = request.modelDoc;
            this.modelName = request.modelName;
            this.modelType = request.modelType;
            this.orderNumber = request.orderNumber;
            this.origin = request.origin;
            this.task = request.task;
        } 

        /**
         * <p>The model ID. You can call <a href="https://help.aliyun.com/document_detail/461944.html">ListModels</a> to obtain the model ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>model-rbvg5wz******ks92</p>
         */
        public Builder modelId(String modelId) {
            this.putPathParameter("ModelId", modelId);
            this.modelId = modelId;
            return this;
        }

        /**
         * <p>The visibility of the model in the workspace. Valid values:</p>
         * <ul>
         * <li>PRIVATE: The model is visible only to you and the administrator of the workspace.</li>
         * <li>PUBLIC: The model is visible to all users in the workspace.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PUBLIC</p>
         */
        public Builder accessibility(String accessibility) {
            this.putBodyParameter("Accessibility", accessibility);
            this.accessibility = accessibility;
            return this;
        }

        /**
         * <p>The domain. This parameter describes the domain in which the model is applied. Valid values: nlp (natural language processing) and cv (computer vision).</p>
         * 
         * <strong>example:</strong>
         * <p>nlp</p>
         */
        public Builder domain(String domain) {
            this.putBodyParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * <p>Other information about the model.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *     &quot;RatingCount&quot;: 2866,
         *     &quot;Rating&quot;: 4.94,
         *     &quot;FavoriteCount&quot;: 34992,
         *     &quot;CommentCount&quot;: 754,
         *     &quot;CoverUris&quot;: [&quot;<a href="https://e***u.oss-cn-hangzhou.aliyuncs.com/drea***w.png%22%5D">https://e***u.oss-cn-hangzhou.aliyuncs.com/drea***w.png&quot;]</a>,
         *     &quot;TippedAmountCount&quot;: 32,
         *     &quot;DownloadCount&quot;: 606056
         * }</p>
         */
        public Builder extraInfo(java.util.Map<String, ?> extraInfo) {
            this.putBodyParameter("ExtraInfo", extraInfo);
            this.extraInfo = extraInfo;
            return this;
        }

        /**
         * <p>The model description.</p>
         */
        public Builder modelDescription(String modelDescription) {
            this.putBodyParameter("ModelDescription", modelDescription);
            this.modelDescription = modelDescription;
            return this;
        }

        /**
         * <p>The documentation of the model.</p>
         * 
         * <strong>example:</strong>
         * <p>https://*.md</p>
         */
        public Builder modelDoc(String modelDoc) {
            this.putBodyParameter("ModelDoc", modelDoc);
            this.modelDoc = modelDoc;
            return this;
        }

        /**
         * <p>The model name, which must be 1 to 127 characters in length.</p>
         */
        public Builder modelName(String modelName) {
            this.putBodyParameter("ModelName", modelName);
            this.modelName = modelName;
            return this;
        }

        /**
         * <p>The model type. Valid values: Checkpoint and LoRA.</p>
         * 
         * <strong>example:</strong>
         * <p>Checkpoint</p>
         */
        public Builder modelType(String modelType) {
            this.putBodyParameter("ModelType", modelType);
            this.modelType = modelType;
            return this;
        }

        /**
         * <p>The sequence number of the model. This parameter can be used for custom sorting.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        public Builder orderNumber(Long orderNumber) {
            this.putBodyParameter("OrderNumber", orderNumber);
            this.orderNumber = orderNumber;
            return this;
        }

        /**
         * <p>The source of the model. This parameter describes the community or organization to which the source model belongs. Valid values: ModelScope and HuggingFace.</p>
         * 
         * <strong>example:</strong>
         * <p>ModelScope</p>
         */
        public Builder origin(String origin) {
            this.putBodyParameter("Origin", origin);
            this.origin = origin;
            return this;
        }

        /**
         * <p>The task. This parameter specifies the specific issue that the model resolves. Example: text-classification.</p>
         * 
         * <strong>example:</strong>
         * <p>text-classification</p>
         */
        public Builder task(String task) {
            this.putBodyParameter("Task", task);
            this.task = task;
            return this;
        }

        @Override
        public UpdateModelRequest build() {
            return new UpdateModelRequest(this);
        } 

    } 

}
