// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

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
 * {@link CreateWorkitemEstimateRequest} extends {@link RequestModel}
 *
 * <p>CreateWorkitemEstimateRequest</p>
 */
public class CreateWorkitemEstimateRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("organizationId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String organizationId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("recordUserIdentifier")
    @com.aliyun.core.annotation.Validation(required = true)
    private String recordUserIdentifier;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("spentTime")
    @com.aliyun.core.annotation.Validation(required = true)
    private String spentTime;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("type")
    @com.aliyun.core.annotation.Validation(required = true)
    private String type;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("workitemIdentifier")
    @com.aliyun.core.annotation.Validation(required = true)
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>5ebbc0228123212b59xxxxx</p>
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1316458xxxxx41068</p>
         */
        public Builder recordUserIdentifier(String recordUserIdentifier) {
            this.putBodyParameter("recordUserIdentifier", recordUserIdentifier);
            this.recordUserIdentifier = recordUserIdentifier;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>21</p>
         */
        public Builder spentTime(String spentTime) {
            this.putBodyParameter("spentTime", spentTime);
            this.spentTime = spentTime;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>9144ef6b72d8exxxxx9e61a4d0</p>
         */
        public Builder type(String type) {
            this.putBodyParameter("type", type);
            this.type = type;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1e9903d8b3f1xxxxxf9286ef5</p>
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
