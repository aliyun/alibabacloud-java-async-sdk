// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.agentloop20260520.models;

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
 * {@link DeleteAgentSpaceRequest} extends {@link RequestModel}
 *
 * <p>DeleteAgentSpaceRequest</p>
 */
public class DeleteAgentSpaceRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("agentSpace")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64, minLength = 2)
    private String agentSpace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("deleteCmsWorkspace")
    private Boolean deleteCmsWorkspace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("deleteMseNamespace")
    private Boolean deleteMseNamespace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("deleteSlsProject")
    private Boolean deleteSlsProject;

    private DeleteAgentSpaceRequest(Builder builder) {
        super(builder);
        this.agentSpace = builder.agentSpace;
        this.deleteCmsWorkspace = builder.deleteCmsWorkspace;
        this.deleteMseNamespace = builder.deleteMseNamespace;
        this.deleteSlsProject = builder.deleteSlsProject;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteAgentSpaceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return agentSpace
     */
    public String getAgentSpace() {
        return this.agentSpace;
    }

    /**
     * @return deleteCmsWorkspace
     */
    public Boolean getDeleteCmsWorkspace() {
        return this.deleteCmsWorkspace;
    }

    /**
     * @return deleteMseNamespace
     */
    public Boolean getDeleteMseNamespace() {
        return this.deleteMseNamespace;
    }

    /**
     * @return deleteSlsProject
     */
    public Boolean getDeleteSlsProject() {
        return this.deleteSlsProject;
    }

    public static final class Builder extends Request.Builder<DeleteAgentSpaceRequest, Builder> {
        private String agentSpace; 
        private Boolean deleteCmsWorkspace; 
        private Boolean deleteMseNamespace; 
        private Boolean deleteSlsProject; 

        private Builder() {
            super();
        } 

        private Builder(DeleteAgentSpaceRequest request) {
            super(request);
            this.agentSpace = request.agentSpace;
            this.deleteCmsWorkspace = request.deleteCmsWorkspace;
            this.deleteMseNamespace = request.deleteMseNamespace;
            this.deleteSlsProject = request.deleteSlsProject;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test-agent-space</p>
         */
        public Builder agentSpace(String agentSpace) {
            this.putPathParameter("agentSpace", agentSpace);
            this.agentSpace = agentSpace;
            return this;
        }

        /**
         * deleteCmsWorkspace.
         */
        public Builder deleteCmsWorkspace(Boolean deleteCmsWorkspace) {
            this.putQueryParameter("deleteCmsWorkspace", deleteCmsWorkspace);
            this.deleteCmsWorkspace = deleteCmsWorkspace;
            return this;
        }

        /**
         * deleteMseNamespace.
         */
        public Builder deleteMseNamespace(Boolean deleteMseNamespace) {
            this.putQueryParameter("deleteMseNamespace", deleteMseNamespace);
            this.deleteMseNamespace = deleteMseNamespace;
            return this;
        }

        /**
         * deleteSlsProject.
         */
        public Builder deleteSlsProject(Boolean deleteSlsProject) {
            this.putQueryParameter("deleteSlsProject", deleteSlsProject);
            this.deleteSlsProject = deleteSlsProject;
            return this;
        }

        @Override
        public DeleteAgentSpaceRequest build() {
            return new DeleteAgentSpaceRequest(this);
        } 

    } 

}
