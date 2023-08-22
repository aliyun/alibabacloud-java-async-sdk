// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link CreateProjectRequest} extends {@link RequestModel}
 *
 * <p>CreateProjectRequest</p>
 */
public class CreateProjectRequest extends Request {
    @Body
    @NameInMap("dataRedundancyType")
    private String dataRedundancyType;

    @Body
    @NameInMap("description")
    @Validation(required = true)
    private String description;

    @Body
    @NameInMap("projectName")
    @Validation(required = true)
    private String projectName;

    @Body
    @NameInMap("resourceGroupId")
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
         * dataRedundancyType.
         */
        public Builder dataRedundancyType(String dataRedundancyType) {
            this.putBodyParameter("dataRedundancyType", dataRedundancyType);
            this.dataRedundancyType = dataRedundancyType;
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
         * projectName.
         */
        public Builder projectName(String projectName) {
            this.putBodyParameter("projectName", projectName);
            this.projectName = projectName;
            return this;
        }

        /**
         * resourceGroupId.
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
