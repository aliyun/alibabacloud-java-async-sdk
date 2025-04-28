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
 * {@link CreateModelRequest} extends {@link RequestModel}
 *
 * <p>CreateModelRequest</p>
 */
public class CreateModelRequest extends Request {
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
    @com.aliyun.core.annotation.NameInMap("Labels")
    private java.util.List<Label> labels;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ModelDescription")
    private String modelDescription;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ModelDoc")
    private String modelDoc;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ModelName")
    @com.aliyun.core.annotation.Validation(required = true)
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
    @com.aliyun.core.annotation.NameInMap("Tag")
    private java.util.List<Label> tag;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Task")
    private String task;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private CreateModelRequest(Builder builder) {
        super(builder);
        this.accessibility = builder.accessibility;
        this.domain = builder.domain;
        this.extraInfo = builder.extraInfo;
        this.labels = builder.labels;
        this.modelDescription = builder.modelDescription;
        this.modelDoc = builder.modelDoc;
        this.modelName = builder.modelName;
        this.modelType = builder.modelType;
        this.orderNumber = builder.orderNumber;
        this.origin = builder.origin;
        this.tag = builder.tag;
        this.task = builder.task;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateModelRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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
     * @return labels
     */
    public java.util.List<Label> getLabels() {
        return this.labels;
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
     * @return tag
     */
    public java.util.List<Label> getTag() {
        return this.tag;
    }

    /**
     * @return task
     */
    public String getTask() {
        return this.task;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<CreateModelRequest, Builder> {
        private String accessibility; 
        private String domain; 
        private java.util.Map<String, ?> extraInfo; 
        private java.util.List<Label> labels; 
        private String modelDescription; 
        private String modelDoc; 
        private String modelName; 
        private String modelType; 
        private Long orderNumber; 
        private String origin; 
        private java.util.List<Label> tag; 
        private String task; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateModelRequest request) {
            super(request);
            this.accessibility = request.accessibility;
            this.domain = request.domain;
            this.extraInfo = request.extraInfo;
            this.labels = request.labels;
            this.modelDescription = request.modelDescription;
            this.modelDoc = request.modelDoc;
            this.modelName = request.modelName;
            this.modelType = request.modelType;
            this.orderNumber = request.orderNumber;
            this.origin = request.origin;
            this.tag = request.tag;
            this.task = request.task;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>The visibility of the model in the workspace. Valid values:</p>
         * <ul>
         * <li>PRIVATE (default): Visible only to you and the administrator of the workspace.</li>
         * <li>PUBLIC: Vvisible to all users in the workspace.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PRIVATE</p>
         */
        public Builder accessibility(String accessibility) {
            this.putBodyParameter("Accessibility", accessibility);
            this.accessibility = accessibility;
            return this;
        }

        /**
         * <p>The domain of the model. Describes the domain in which the model is for. Example: nlp (natural language processing), cv (computer vision), and others.</p>
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
         * <p>The tags. This parameter will be deprecated and replaced by Tag.</p>
         */
        public Builder labels(java.util.List<Label> labels) {
            this.putBodyParameter("Labels", labels);
            this.labels = labels;
            return this;
        }

        /**
         * <p>The model description, used to distinguish different models.</p>
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
         * <p>The name of the model. The name must be 1 to 127 characters in length.</p>
         * <p>This parameter is required.</p>
         */
        public Builder modelName(String modelName) {
            this.putBodyParameter("ModelName", modelName);
            this.modelName = modelName;
            return this;
        }

        /**
         * <p>The model type. Example: Checkpoint or LoRA.</p>
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
         * <p>The sequence number of the model. Can be used for custom sorting.</p>
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
         * <p>The source of the model. The community or organization to which the source model belongs, such as ModelScope or HuggingFace.</p>
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
         * <p>The tags.</p>
         */
        public Builder tag(java.util.List<Label> tag) {
            this.putBodyParameter("Tag", tag);
            this.tag = tag;
            return this;
        }

        /**
         * <p>The task of the model. Describes the specific problem that the model solves. Example: text-classification.</p>
         * 
         * <strong>example:</strong>
         * <p>text-classification</p>
         */
        public Builder task(String task) {
            this.putBodyParameter("Task", task);
            this.task = task;
            return this;
        }

        /**
         * <p>The workspace ID. Call <a href="https://help.aliyun.com/document_detail/449124.html">ListWorkspaces</a> to obtain the workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>796**</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public CreateModelRequest build() {
            return new CreateModelRequest(this);
        } 

    } 

}
