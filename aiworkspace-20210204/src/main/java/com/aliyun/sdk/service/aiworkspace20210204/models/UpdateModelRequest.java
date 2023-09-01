// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateModelRequest} extends {@link RequestModel}
 *
 * <p>UpdateModelRequest</p>
 */
public class UpdateModelRequest extends Request {
    @Path
    @NameInMap("ModelId")
    @Validation(required = true)
    private String modelId;

    @Body
    @NameInMap("Accessibility")
    private String accessibility;

    @Body
    @NameInMap("Domain")
    private String domain;

    @Body
    @NameInMap("ModelDescription")
    private String modelDescription;

    @Body
    @NameInMap("ModelDoc")
    private String modelDoc;

    @Body
    @NameInMap("ModelName")
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

    private UpdateModelRequest(Builder builder) {
        super(builder);
        this.modelId = builder.modelId;
        this.accessibility = builder.accessibility;
        this.domain = builder.domain;
        this.modelDescription = builder.modelDescription;
        this.modelDoc = builder.modelDoc;
        this.modelName = builder.modelName;
        this.orderNumber = builder.orderNumber;
        this.origin = builder.origin;
        this.sourceId = builder.sourceId;
        this.sourceType = builder.sourceType;
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

    public static final class Builder extends Request.Builder<UpdateModelRequest, Builder> {
        private String modelId; 
        private String accessibility; 
        private String domain; 
        private String modelDescription; 
        private String modelDoc; 
        private String modelName; 
        private Long orderNumber; 
        private String origin; 
        private String sourceId; 
        private String sourceType; 
        private String task; 

        private Builder() {
            super();
        } 

        private Builder(UpdateModelRequest request) {
            super(request);
            this.modelId = request.modelId;
            this.accessibility = request.accessibility;
            this.domain = request.domain;
            this.modelDescription = request.modelDescription;
            this.modelDoc = request.modelDoc;
            this.modelName = request.modelName;
            this.orderNumber = request.orderNumber;
            this.origin = request.origin;
            this.sourceId = request.sourceId;
            this.sourceType = request.sourceType;
            this.task = request.task;
        } 

        /**
         * ModelId.
         */
        public Builder modelId(String modelId) {
            this.putPathParameter("ModelId", modelId);
            this.modelId = modelId;
            return this;
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

        @Override
        public UpdateModelRequest build() {
            return new UpdateModelRequest(this);
        } 

    } 

}
