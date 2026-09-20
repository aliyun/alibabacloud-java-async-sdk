// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

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
 * {@link RevokeTablePermissionRequest} extends {@link RequestModel}
 *
 * <p>RevokeTablePermissionRequest</p>
 */
public class RevokeTablePermissionRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Actions")
    @com.aliyun.core.annotation.Validation(required = true)
    private String actions;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxComputeProjectName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String maxComputeProjectName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RevokeUserId")
    private String revokeUserId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("RevokeUserName")
    private String revokeUserName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TableName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tableName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true, maximum = 9999999, minimum = 1)
    private Long workspaceId;

    private RevokeTablePermissionRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.actions = builder.actions;
        this.maxComputeProjectName = builder.maxComputeProjectName;
        this.revokeUserId = builder.revokeUserId;
        this.revokeUserName = builder.revokeUserName;
        this.tableName = builder.tableName;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RevokeTablePermissionRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return actions
     */
    public String getActions() {
        return this.actions;
    }

    /**
     * @return maxComputeProjectName
     */
    public String getMaxComputeProjectName() {
        return this.maxComputeProjectName;
    }

    /**
     * @return revokeUserId
     */
    public String getRevokeUserId() {
        return this.revokeUserId;
    }

    /**
     * @return revokeUserName
     */
    public String getRevokeUserName() {
        return this.revokeUserName;
    }

    /**
     * @return tableName
     */
    public String getTableName() {
        return this.tableName;
    }

    /**
     * @return workspaceId
     */
    public Long getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<RevokeTablePermissionRequest, Builder> {
        private String regionId; 
        private String actions; 
        private String maxComputeProjectName; 
        private String revokeUserId; 
        private String revokeUserName; 
        private String tableName; 
        private Long workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(RevokeTablePermissionRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.actions = request.actions;
            this.maxComputeProjectName = request.maxComputeProjectName;
            this.revokeUserId = request.revokeUserId;
            this.revokeUserName = request.revokeUserName;
            this.tableName = request.tableName;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * <p>This parameter is required.</p>
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * <p>The operation permissions on the table that you want to revoke. Separate multiple operation permissions with commas (,).</p>
         * <p>Currently, only the Select, Describe, and Download operation permissions on MaxCompute tables can be revoked.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>Select,Describe</p>
         */
        public Builder actions(String actions) {
            this.putQueryParameter("Actions", actions);
            this.actions = actions;
            return this;
        }

        /**
         * <p>The name of the MaxCompute project that contains the table from which you want to revoke permissions. You can log on to the DataWorks console and go to the Workspace Settings page to obtain the name of the MaxCompute project associated with the DataWorks workspace.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>aMaxcomputeProjectName</p>
         */
        public Builder maxComputeProjectName(String maxComputeProjectName) {
            this.putQueryParameter("MaxComputeProjectName", maxComputeProjectName);
            this.maxComputeProjectName = maxComputeProjectName;
            return this;
        }

        /**
         * <p>The Alibaba Cloud account ID from which you want to revoke table permissions. You can logon to the DataWorks console and go to the Security Settings page to obtain the account ID.</p>
         * <p>You only need to specify either this parameter or the RevokeUserName parameter. If both this parameter and the RevokeUserName parameter are specified in the parameter settings but have different values, the value of the RevokeUserId parameter takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>267842600408993176</p>
         */
        public Builder revokeUserId(String revokeUserId) {
            this.putQueryParameter("RevokeUserId", revokeUserId);
            this.revokeUserId = revokeUserId;
            return this;
        }

        /**
         * <p>The name of the Alibaba Cloud account from which you want to revoke table permissions. The account format is the same as the account format used in MaxCompute.</p>
         * <ul>
         * <li>An Alibaba Cloud account is in the format of ALIYUN$+account name.</li>
         * <li>A RAM user is in the format of RAM$+account name.</li>
         * </ul>
         * <p>You only need to specify either this parameter or the RevokeUserId parameter. If both this parameter and the RevokeUserId parameter are specified in the parameter settings but have different values, the value of the RevokeUserId parameter takes precedence.</p>
         * 
         * <strong>example:</strong>
         * <p>RAM$dataworks_3h1_1:stsramuser</p>
         */
        public Builder revokeUserName(String revokeUserName) {
            this.putQueryParameter("RevokeUserName", revokeUserName);
            this.revokeUserName = revokeUserName;
            return this;
        }

        /**
         * <p>The name of the MaxCompute table from which you want to revoke permissions. You can call the <a href="https://help.aliyun.com/document_detail/173919.html">SearchMetaTables</a> operation to obtain the MaxCompute table name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>aTableName</p>
         */
        public Builder tableName(String tableName) {
            this.putQueryParameter("TableName", tableName);
            this.tableName = tableName;
            return this;
        }

        /**
         * <p>The ID of the DataWorks workspace to which the MaxCompute table belongs. You can log on to the DataWorks console and go to the Workspace Settings page to obtain the workspace ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        public Builder workspaceId(Long workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public RevokeTablePermissionRequest build() {
            return new RevokeTablePermissionRequest(this);
        } 

    } 

}
