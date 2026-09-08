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
    @com.aliyun.core.annotation.NameInMap("IsSessionShareEnabled")
    private Boolean isSessionShareEnabled;

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
        this.isSessionShareEnabled = builder.isSessionShareEnabled;
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
     * @return isSessionShareEnabled
     */
    public Boolean getIsSessionShareEnabled() {
        return this.isSessionShareEnabled;
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
        private Boolean isSessionShareEnabled; 
        private String workspaceDesc; 
        private String workspaceId; 
        private String workspaceName; 

        private Builder() {
            super();
        } 

        private Builder(UpdateDataAgentSpaceInfoRequest request) {
            super(request);
            this.DMSUnit = request.DMSUnit;
            this.isSessionShareEnabled = request.isSessionShareEnabled;
            this.workspaceDesc = request.workspaceDesc;
            this.workspaceId = request.workspaceId;
            this.workspaceName = request.workspaceName;
        } 

        /**
         * <p>The current DMS unit.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        public Builder DMSUnit(String DMSUnit) {
            this.putQueryParameter("DMSUnit", DMSUnit);
            this.DMSUnit = DMSUnit;
            return this;
        }

        /**
         * <p>Specifies whether to enable session sharing for the workspace. Valid values: true and false.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder isSessionShareEnabled(Boolean isSessionShareEnabled) {
            this.putQueryParameter("IsSessionShareEnabled", isSessionShareEnabled);
            this.isSessionShareEnabled = isSessionShareEnabled;
            return this;
        }

        /**
         * <p>The new description for the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>space for test new</p>
         */
        public Builder workspaceDesc(String workspaceDesc) {
            this.putQueryParameter("WorkspaceDesc", workspaceDesc);
            this.workspaceDesc = workspaceDesc;
            return this;
        }

        /**
         * <p>The ID of the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>20923*****7291</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>The new name for the workspace.</p>
         * 
         * <strong>example:</strong>
         * <p>yunqitest_v2</p>
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
