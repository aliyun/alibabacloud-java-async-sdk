// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateModelRequest} extends {@link RequestModel}
 *
 * <p>CreateModelRequest</p>
 */
public class CreateModelRequest extends Request {
    @Body
    @NameInMap("Accessibility")
    private String accessibility;

    @Body
    @NameInMap("Domain")
    private String domain;

    @Body
    @NameInMap("Labels")
    private java.util.List < Label > labels;

    @Body
    @NameInMap("ModelDescription")
    private String modelDescription;

    @Body
    @NameInMap("ModelDoc")
    private String modelDoc;

    @Body
    @NameInMap("ModelName")
    @Validation(required = true)
    private String modelName;

    @Body
    @NameInMap("OrderNumber")
    private Long orderNumber;

    @Body
    @NameInMap("Origin")
    private String origin;

    @Body
    @NameInMap("SourceId")
    private String sourceId;

    @Body
    @NameInMap("SourceType")
    private String sourceType;

    @Body
    @NameInMap("Task")
    private String task;

    @Body
    @NameInMap("WorkspaceId")
    private String workspaceId;

    private CreateModelRequest(Builder builder) {
        super(builder);
        this.accessibility = builder.accessibility;
        this.domain = builder.domain;
        this.labels = builder.labels;
        this.modelDescription = builder.modelDescription;
        this.modelDoc = builder.modelDoc;
        this.modelName = builder.modelName;
        this.orderNumber = builder.orderNumber;
        this.origin = builder.origin;
        this.sourceId = builder.sourceId;
        this.sourceType = builder.sourceType;
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
     * @return labels
     */
    public java.util.List < Label > getLabels() {
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
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<CreateModelRequest, Builder> {
        private String accessibility; 
        private String domain; 
        private java.util.List < Label > labels; 
        private String modelDescription; 
        private String modelDoc; 
        private String modelName; 
        private Long orderNumber; 
        private String origin; 
        private String sourceId; 
        private String sourceType; 
        private String task; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateModelRequest request) {
            super(request);
            this.accessibility = request.accessibility;
            this.domain = request.domain;
            this.labels = request.labels;
            this.modelDescription = request.modelDescription;
            this.modelDoc = request.modelDoc;
            this.modelName = request.modelName;
            this.orderNumber = request.orderNumber;
            this.origin = request.origin;
            this.sourceId = request.sourceId;
            this.sourceType = request.sourceType;
            this.task = request.task;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * Accessibility.
         */
        public Builder accessibility(String accessibility) {
            this.putBodyParameter("Accessibility", accessibility);
            this.accessibility = accessibility;
            return this;
        }

        /**
         * Domain.
         */
        public Builder domain(String domain) {
            this.putBodyParameter("Domain", domain);
            this.domain = domain;
            return this;
        }

        /**
         * Labels.
         */
        public Builder labels(java.util.List < Label > labels) {
            this.putBodyParameter("Labels", labels);
            this.labels = labels;
            return this;
        }

        /**
         * ModelDescription.
         */
        public Builder modelDescription(String modelDescription) {
            this.putBodyParameter("ModelDescription", modelDescription);
            this.modelDescription = modelDescription;
            return this;
        }

        /**
         * ModelDoc.
         */
        public Builder modelDoc(String modelDoc) {
            this.putBodyParameter("ModelDoc", modelDoc);
            this.modelDoc = modelDoc;
            return this;
        }

        /**
         * ModelName.
         */
        public Builder modelName(String modelName) {
            this.putBodyParameter("ModelName", modelName);
            this.modelName = modelName;
            return this;
        }

        /**
         * OrderNumber.
         */
        public Builder orderNumber(Long orderNumber) {
            this.putBodyParameter("OrderNumber", orderNumber);
            this.orderNumber = orderNumber;
            return this;
        }

        /**
         * Origin.
         */
        public Builder origin(String origin) {
            this.putBodyParameter("Origin", origin);
            this.origin = origin;
            return this;
        }

        /**
         * SourceId.
         */
        public Builder sourceId(String sourceId) {
            this.putBodyParameter("SourceId", sourceId);
            this.sourceId = sourceId;
            return this;
        }

        /**
         * SourceType.
         */
        public Builder sourceType(String sourceType) {
            this.putBodyParameter("SourceType", sourceType);
            this.sourceType = sourceType;
            return this;
        }

        /**
         * Task.
         */
        public Builder task(String task) {
            this.putBodyParameter("Task", task);
            this.task = task;
            return this;
        }

        /**
         * WorkspaceId.
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
