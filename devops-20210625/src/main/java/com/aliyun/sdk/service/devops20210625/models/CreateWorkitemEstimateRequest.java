// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateWorkitemEstimateRequest} extends {@link RequestModel}
 *
 * <p>CreateWorkitemEstimateRequest</p>
 */
public class CreateWorkitemEstimateRequest extends Request {
    @Path
    @NameInMap("organizationId")
    @Validation(required = true)
    private String organizationId;

    @Body
    @NameInMap("description")
    private String description;

    @Body
    @NameInMap("recordUserIdentifier")
    @Validation(required = true)
    private String recordUserIdentifier;

    @Body
    @NameInMap("spentTime")
    @Validation(required = true)
    private String spentTime;

    @Body
    @NameInMap("type")
    @Validation(required = true)
    private String type;

    @Body
    @NameInMap("workitemIdentifier")
    @Validation(required = true)
    private String workitemIdentifier;

    private CreateWorkitemEstimateRequest(Builder builder) {
        super(builder);
        this.organizationId = builder.organizationId;
        this.description = builder.description;
        this.recordUserIdentifier = builder.recordUserIdentifier;
        this.spentTime = builder.spentTime;
        this.type = builder.type;
        this.workitemIdentifier = builder.workitemIdentifier;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateWorkitemEstimateRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return organizationId
     */
    public String getOrganizationId() {
        return this.organizationId;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return recordUserIdentifier
     */
    public String getRecordUserIdentifier() {
        return this.recordUserIdentifier;
    }

    /**
     * @return spentTime
     */
    public String getSpentTime() {
        return this.spentTime;
    }

    /**
     * @return type
     */
    public String getType() {
        return this.type;
    }

    /**
     * @return workitemIdentifier
     */
    public String getWorkitemIdentifier() {
        return this.workitemIdentifier;
    }

    public static final class Builder extends Request.Builder<CreateWorkitemEstimateRequest, Builder> {
        private String organizationId; 
        private String description; 
        private String recordUserIdentifier; 
        private String spentTime; 
        private String type; 
        private String workitemIdentifier; 

        private Builder() {
            super();
        } 

        private Builder(CreateWorkitemEstimateRequest request) {
            super(request);
            this.organizationId = request.organizationId;
            this.description = request.description;
            this.recordUserIdentifier = request.recordUserIdentifier;
            this.spentTime = request.spentTime;
            this.type = request.type;
            this.workitemIdentifier = request.workitemIdentifier;
        } 

        /**
         * organizationId.
         */
        public Builder organizationId(String organizationId) {
            this.putPathParameter("organizationId", organizationId);
            this.organizationId = organizationId;
            return this;
        }

        /**
         * description.
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * recordUserIdentifier.
         */
        public Builder recordUserIdentifier(String recordUserIdentifier) {
            this.putBodyParameter("recordUserIdentifier", recordUserIdentifier);
            this.recordUserIdentifier = recordUserIdentifier;
            return this;
        }

        /**
         * spentTime.
         */
        public Builder spentTime(String spentTime) {
            this.putBodyParameter("spentTime", spentTime);
            this.spentTime = spentTime;
            return this;
        }

        /**
         * type.
         */
        public Builder type(String type) {
            this.putBodyParameter("type", type);
            this.type = type;
            return this;
        }

        /**
         * workitemIdentifier.
         */
        public Builder workitemIdentifier(String workitemIdentifier) {
            this.putBodyParameter("workitemIdentifier", workitemIdentifier);
            this.workitemIdentifier = workitemIdentifier;
            return this;
        }

        @Override
        public CreateWorkitemEstimateRequest build() {
            return new CreateWorkitemEstimateRequest(this);
        } 

    } 

}
