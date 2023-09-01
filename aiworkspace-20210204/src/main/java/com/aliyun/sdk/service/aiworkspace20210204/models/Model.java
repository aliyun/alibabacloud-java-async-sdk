// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link Model} extends {@link TeaModel}
 *
 * <p>Model</p>
 */
public class Model extends TeaModel {
    @NameInMap("Accessibility")
    private String accessibility;

    @NameInMap("Domain")
    private String domain;

    @NameInMap("GmtCreateTime")
    private String gmtCreateTime;

    @NameInMap("GmtModifiedTime")
    private String gmtModifiedTime;

    @NameInMap("Labels")
    private java.util.List < Label > labels;

    @NameInMap("LatestVersion")
    private ModelVersion latestVersion;

    @NameInMap("ModelDescription")
    private String modelDescription;

    @NameInMap("ModelDoc")
    private String modelDoc;

    @NameInMap("ModelId")
    private String modelId;

    @NameInMap("ModelName")
    private String modelName;

    @NameInMap("OrderNumber")
    private Long orderNumber;

    @NameInMap("Origin")
    private String origin;

    @NameInMap("OwnerId")
    private String ownerId;

    @NameInMap("Provider")
    private String provider;

    @NameInMap("SourceId")
    private String sourceId;

    @NameInMap("SourceType")
    private String sourceType;

    @NameInMap("Task")
    private String task;

    @NameInMap("UserId")
    private String userId;

    @NameInMap("WorkspaceId")
    private String workspaceId;

    private Model(Builder builder) {
        this.accessibility = builder.accessibility;
        this.domain = builder.domain;
        this.gmtCreateTime = builder.gmtCreateTime;
        this.gmtModifiedTime = builder.gmtModifiedTime;
        this.labels = builder.labels;
        this.latestVersion = builder.latestVersion;
        this.modelDescription = builder.modelDescription;
        this.modelDoc = builder.modelDoc;
        this.modelId = builder.modelId;
        this.modelName = builder.modelName;
        this.orderNumber = builder.orderNumber;
        this.origin = builder.origin;
        this.ownerId = builder.ownerId;
        this.provider = builder.provider;
        this.sourceId = builder.sourceId;
        this.sourceType = builder.sourceType;
        this.task = builder.task;
        this.userId = builder.userId;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Model create() {
        return builder().build();
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
    public java.util.List < Label > getLabels() {
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
        private String gmtCreateTime; 
        private String gmtModifiedTime; 
        private java.util.List < Label > labels; 
        private ModelVersion latestVersion; 
        private String modelDescription; 
        private String modelDoc; 
        private String modelId; 
        private String modelName; 
        private Long orderNumber; 
        private String origin; 
        private String ownerId; 
        private String provider; 
        private String sourceId; 
        private String sourceType; 
        private String task; 
        private String userId; 
        private String workspaceId; 

        /**
         * Accessibility.
         */
        public Builder accessibility(String accessibility) {
            this.accessibility = accessibility;
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
         * GmtCreateTime.
         */
        public Builder gmtCreateTime(String gmtCreateTime) {
            this.gmtCreateTime = gmtCreateTime;
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
         * Labels.
         */
        public Builder labels(java.util.List < Label > labels) {
            this.labels = labels;
            return this;
        }

        /**
         * LatestVersion.
         */
        public Builder latestVersion(ModelVersion latestVersion) {
            this.latestVersion = latestVersion;
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
         * OwnerId.
         */
        public Builder ownerId(String ownerId) {
            this.ownerId = ownerId;
            return this;
        }

        /**
         * Provider.
         */
        public Builder provider(String provider) {
            this.provider = provider;
            return this;
        }

        /**
         * SourceId.
         */
        public Builder sourceId(String sourceId) {
            this.sourceId = sourceId;
            return this;
        }

        /**
         * SourceType.
         */
        public Builder sourceType(String sourceType) {
            this.sourceType = sourceType;
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
         * UserId.
         */
        public Builder userId(String userId) {
            this.userId = userId;
            return this;
        }

        /**
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            return this;
        }

        public Model build() {
            return new Model(this);
        } 

    } 

}
