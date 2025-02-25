// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.sdk.gateway.sls.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * 
 * {@link CreateProjectRequest} extends {@link RequestModel}
 *
 * <p>CreateProjectRequest</p>
 */
public class CreateProjectRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dataRedundancyType")
    private String dataRedundancyType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("description")
    @com.aliyun.core.annotation.Validation(required = true)
    private String description;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("projectName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String projectName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("resourceGroupId")
    private String resourceGroupId;

    private CreateProjectRequest(Builder builder) {
        super(builder);
        this.dataRedundancyType = builder.dataRedundancyType;
        this.description = builder.description;
        this.projectName = builder.projectName;
        this.resourceGroupId = builder.resourceGroupId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateProjectRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return dataRedundancyType
     */
    public String getDataRedundancyType() {
        return this.dataRedundancyType;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return this.description;
    }

    /**
     * @return projectName
     */
    public String getProjectName() {
        return this.projectName;
    }

    /**
     * @return resourceGroupId
     */
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public static final class Builder extends Request.Builder<CreateProjectRequest, Builder> {
        private String dataRedundancyType; 
        private String description; 
        private String projectName; 
        private String resourceGroupId; 

        private Builder() {
            super();
        } 

        private Builder(CreateProjectRequest request) {
            super(request);
            this.dataRedundancyType = request.dataRedundancyType;
            this.description = request.description;
            this.projectName = request.projectName;
            this.resourceGroupId = request.resourceGroupId;
        } 

        /**
         * <p>Data redundancy type</p>
         * 
         * <strong>example:</strong>
         * <p>LRS</p>
         */
        public Builder dataRedundancyType(String dataRedundancyType) {
            this.putBodyParameter("dataRedundancyType", dataRedundancyType);
            this.dataRedundancyType = dataRedundancyType;
            return this;
        }

        /**
         * <p>The description of the project.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>this is test</p>
         */
        public Builder description(String description) {
            this.putBodyParameter("description", description);
            this.description = description;
            return this;
        }

        /**
         * <p>The name of the project. The name must be unique in a region. You cannot change the name after you create the project. The name must meet the following requirements:</p>
         * <ul>
         * <li>The name must be unique.</li>
         * <li>It can contain only lowercase letters, digits, and hyphens (-).</li>
         * <li>It must start and end with a lowercase letter or a digit.</li>
         * <li>It must be 3 to 63 characters in length.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-project</p>
         */
        public Builder projectName(String projectName) {
            this.putBodyParameter("projectName", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>rg-aekzf******sxby</p>
         */
        public Builder resourceGroupId(String resourceGroupId) {
            this.putBodyParameter("resourceGroupId", resourceGroupId);
            this.resourceGroupId = resourceGroupId;
            return this;
        }

        @Override
        public CreateProjectRequest build() {
            return new CreateProjectRequest(this);
        } 

    } 

}
