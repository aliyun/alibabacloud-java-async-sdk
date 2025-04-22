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
 * {@link GetModelResponseBody} extends {@link TeaModel}
 *
 * <p>GetModelResponseBody</p>
 */
public class GetModelResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Accessibility")
    private String accessibility;

    @com.aliyun.core.annotation.NameInMap("Domain")
    private String domain;

    @com.aliyun.core.annotation.NameInMap("ExtraInfo")
    private java.util.Map<String, ?> extraInfo;

    @com.aliyun.core.annotation.NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @com.aliyun.core.annotation.NameInMap("GmtModifiedTime")
    private String gmtModifiedTime;

    @com.aliyun.core.annotation.NameInMap("Labels")
    private java.util.List<Label> labels;

    @com.aliyun.core.annotation.NameInMap("LatestVersion")
    private ModelVersion latestVersion;

    @com.aliyun.core.annotation.NameInMap("ModelDescription")
    private String modelDescription;

    @com.aliyun.core.annotation.NameInMap("ModelDoc")
    private String modelDoc;

    @com.aliyun.core.annotation.NameInMap("ModelId")
    private String modelId;

    @com.aliyun.core.annotation.NameInMap("ModelName")
    private String modelName;

    @com.aliyun.core.annotation.NameInMap("ModelType")
    private String modelType;

    @com.aliyun.core.annotation.NameInMap("OrderNumber")
    private Long orderNumber;

    @com.aliyun.core.annotation.NameInMap("Origin")
    private String origin;

    @com.aliyun.core.annotation.NameInMap("OwnerId")
    private String ownerId;

    @com.aliyun.core.annotation.NameInMap("Provider")
    private String provider;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Task")
    private String task;

    @com.aliyun.core.annotation.NameInMap("UserId")
    private String userId;

    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    private GetModelResponseBody(Builder builder) {
        this.accessibility = builder.accessibility;
        this.domain = builder.domain;
        this.extraInfo = builder.extraInfo;
        this.gmtCreateTime = builder.gmtCreateTime;
        this.gmtModifiedTime = builder.gmtModifiedTime;
        this.labels = builder.labels;
        this.latestVersion = builder.latestVersion;
        this.modelDescription = builder.modelDescription;
        this.modelDoc = builder.modelDoc;
        this.modelId = builder.modelId;
        this.modelName = builder.modelName;
        this.modelType = builder.modelType;
        this.orderNumber = builder.orderNumber;
        this.origin = builder.origin;
        this.ownerId = builder.ownerId;
        this.provider = builder.provider;
        this.requestId = builder.requestId;
        this.task = builder.task;
        this.userId = builder.userId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetModelResponseBody create() {
        return builder().build();
    }

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
     * @return labels
     */
    public java.util.List<Label> getLabels() {
        return this.labels;
    }

    /**
     * @return latestVersion
     */
    public ModelVersion getLatestVersion() {
        return this.latestVersion;
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
     * @return ownerId
     */
    public String getOwnerId() {
        return this.ownerId;
    }

    /**
     * @return provider
     */
    public String getProvider() {
        return this.provider;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return task
     */
    public String getTask() {
        return this.task;
    }

    /**
     * @return userId
     */
    public String getUserId() {
        return this.userId;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder {
        private String accessibility; 
        private String domain; 
        private java.util.Map<String, ?> extraInfo; 
        private String gmtCreateTime; 
        private String gmtModifiedTime; 
        private java.util.List<Label> labels; 
        private ModelVersion latestVersion; 
        private String modelDescription; 
        private String modelDoc; 
        private String modelId; 
        private String modelName; 
        private String modelType; 
        private Long orderNumber; 
        private String origin; 
        private String ownerId; 
        private String provider; 
        private String requestId; 
        private String task; 
        private String userId; 
        private String workspaceId; 

        private Builder() {
        } 

        private Builder(GetModelResponseBody model) {
            this.accessibility = model.accessibility;
            this.domain = model.domain;
            this.extraInfo = model.extraInfo;
            this.gmtCreateTime = model.gmtCreateTime;
            this.gmtModifiedTime = model.gmtModifiedTime;
            this.labels = model.labels;
            this.latestVersion = model.latestVersion;
            this.modelDescription = model.modelDescription;
            this.modelDoc = model.modelDoc;
            this.modelId = model.modelId;
            this.modelName = model.modelName;
            this.modelType = model.modelType;
            this.orderNumber = model.orderNumber;
            this.origin = model.origin;
            this.ownerId = model.ownerId;
            this.provider = model.provider;
            this.requestId = model.requestId;
            this.task = model.task;
            this.userId = model.userId;
            this.workspaceId = model.workspaceId;
        } 

        /**
         * <p>The visibility of the workspace.</p>
         * <ul>
         * <li>PRIVATE: The workspace is visible only to you and the administrator of the workspace.</li>
         * <li>PUBLIC: The workspace is visible to all users.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PUBLIC</p>
         */
        public Builder accessibility(String accessibility) {
            this.accessibility = accessibility;
            return this;
        }

        /**
         * <p>The domain. This parameter specifies the domain for which the model is developed. Valid values: nlp and cv. nlp indicates natural language processing and cv indicates computer vision.</p>
         * 
         * <strong>example:</strong>
         * <p>cv</p>
         */
        public Builder domain(String domain) {
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
            this.extraInfo = extraInfo;
            return this;
        }

        /**
         * <p>The time when the model is created, in UTC. The time follows the ISO 8601 standard.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-30T12:51:33.028Z</p>
         */
        public Builder gmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
            return this;
        }

        /**
         * <p>The time when the model is last modified, in UTC. The time follows the ISO 8601 standard.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-01-30T12:51:33.028Z</p>
         */
        public Builder gmtModifiedTime(String gmtModifiedTime) {
            this.gmtModifiedTime = gmtModifiedTime;
            return this;
        }

        /**
         * <p>The model tags.</p>
         */
        public Builder labels(java.util.List<Label> labels) {
            this.labels = labels;
            return this;
        }

        /**
         * <p>The latest version of the model.</p>
         */
        public Builder latestVersion(ModelVersion latestVersion) {
            this.latestVersion = latestVersion;
            return this;
        }

        /**
         * <p>The model description.</p>
         */
        public Builder modelDescription(String modelDescription) {
            this.modelDescription = modelDescription;
            return this;
        }

        /**
         * <p>The documentation of the model.</p>
         * 
         * <strong>example:</strong>
         * <p>https://***.md</p>
         */
        public Builder modelDoc(String modelDoc) {
            this.modelDoc = modelDoc;
            return this;
        }

        /**
         * <p>The model ID.</p>
         * 
         * <strong>example:</strong>
         * <p>model-rbvg5wzljz****ks92</p>
         */
        public Builder modelId(String modelId) {
            this.modelId = modelId;
            return this;
        }

        /**
         * <p>The model name.</p>
         */
        public Builder modelName(String modelName) {
            this.modelName = modelName;
            return this;
        }

        /**
         * <p>The model type.</p>
         * 
         * <strong>example:</strong>
         * <p>Checkpoint</p>
         */
        public Builder modelType(String modelType) {
            this.modelType = modelType;
            return this;
        }

        /**
         * <p>The sequence number of the model.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder orderNumber(Long orderNumber) {
            this.orderNumber = orderNumber;
            return this;
        }

        /**
         * <p>The source of the model. The community or organization to which the model belongs, such as ModelScope or HuggingFace.</p>
         * 
         * <strong>example:</strong>
         * <p>ModelScope</p>
         */
        public Builder origin(String origin) {
            this.origin = origin;
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
         * <p>The provider.</p>
         * 
         * <strong>example:</strong>
         * <p>pai</p>
         */
        public Builder provider(String provider) {
            this.provider = provider;
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
         * <p>The task of the model. This parameter describes specific issues that the model solves, such as text-classification.</p>
         * 
         * <strong>example:</strong>
         * <p>text-classification</p>
         */
        public Builder task(String task) {
            this.task = task;
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
         * <p>The workspace ID.</p>
         * 
         * <strong>example:</strong>
         * <p>234**</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        public GetModelResponseBody build() {
            return new GetModelResponseBody(this);
        } 

    } 

}
