// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

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
 * {@link CreateDataAgentWorkspaceRequest} extends {@link RequestModel}
 *
 * <p>CreateDataAgentWorkspaceRequest</p>
 */
public class CreateDataAgentWorkspaceRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DMSUnit")
    private String DMSUnit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceDesc")
    private String workspaceDesc;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceName")
    private String workspaceName;

    private CreateDataAgentWorkspaceRequest(Builder builder) {
        super(builder);
        this.DMSUnit = builder.DMSUnit;
        this.workspaceDesc = builder.workspaceDesc;
        this.workspaceName = builder.workspaceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDataAgentWorkspaceRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return DMSUnit
     */
    public String getDMSUnit() {
        return this.DMSUnit;
    }

    /**
     * @return workspaceDesc
     */
    public String getWorkspaceDesc() {
        return this.workspaceDesc;
    }

    /**
     * @return workspaceName
     */
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public static final class Builder extends Request.Builder<CreateDataAgentWorkspaceRequest, Builder> {
        private String DMSUnit; 
        private String workspaceDesc; 
        private String workspaceName; 

        private Builder() {
            super();
        } 

        private Builder(CreateDataAgentWorkspaceRequest request) {
            super(request);
            this.DMSUnit = request.DMSUnit;
            this.workspaceDesc = request.workspaceDesc;
            this.workspaceName = request.workspaceName;
        } 

        /**
         * DMSUnit.
         */
        public Builder DMSUnit(String DMSUnit) {
            this.putQueryParameter("DMSUnit", DMSUnit);
            this.DMSUnit = DMSUnit;
            return this;
        }

        /**
         * WorkspaceDesc.
         */
        public Builder workspaceDesc(String workspaceDesc) {
            this.putQueryParameter("WorkspaceDesc", workspaceDesc);
            this.workspaceDesc = workspaceDesc;
            return this;
        }

        /**
         * WorkspaceName.
         */
        public Builder workspaceName(String workspaceName) {
            this.putQueryParameter("WorkspaceName", workspaceName);
            this.workspaceName = workspaceName;
            return this;
        }

        @Override
        public CreateDataAgentWorkspaceRequest build() {
            return new CreateDataAgentWorkspaceRequest(this);
        } 

    } 

}
