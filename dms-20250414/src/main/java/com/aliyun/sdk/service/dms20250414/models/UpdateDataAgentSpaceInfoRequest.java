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
 * {@link UpdateDataAgentSpaceInfoRequest} extends {@link RequestModel}
 *
 * <p>UpdateDataAgentSpaceInfoRequest</p>
 */
public class UpdateDataAgentSpaceInfoRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DMSUnit")
    private String DMSUnit;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceDesc")
    private String workspaceDesc;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private String workspaceId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceName")
    private String workspaceName;

    private UpdateDataAgentSpaceInfoRequest(Builder builder) {
        super(builder);
        this.DMSUnit = builder.DMSUnit;
        this.workspaceDesc = builder.workspaceDesc;
        this.workspaceId = builder.workspaceId;
        this.workspaceName = builder.workspaceName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateDataAgentSpaceInfoRequest create() {
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
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return workspaceName
     */
    public String getWorkspaceName() {
        return this.workspaceName;
    }

    public static final class Builder extends Request.Builder<UpdateDataAgentSpaceInfoRequest, Builder> {
        private String DMSUnit; 
        private String workspaceDesc; 
        private String workspaceId; 
        private String workspaceName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDataAgentSpaceInfoRequest request) {
            super(request);
            this.DMSUnit = request.DMSUnit;
            this.workspaceDesc = request.workspaceDesc;
            this.workspaceId = request.workspaceId;
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
         * WorkspaceId.
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
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
        public UpdateDataAgentSpaceInfoRequest build() {
            return new UpdateDataAgentSpaceInfoRequest(this);
        } 

    } 

}
