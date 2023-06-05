// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RevokeColumnPermissionRequest} extends {@link RequestModel}
 *
 * <p>RevokeColumnPermissionRequest</p>
 */
public class RevokeColumnPermissionRequest extends Request {
    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("Columns")
    @Validation(required = true)
    private String columns;

    @Query
    @NameInMap("MaxComputeProjectName")
    @Validation(required = true)
    private String maxComputeProjectName;

    @Query
    @NameInMap("RevokeUserId")
    private String revokeUserId;

    @Query
    @NameInMap("RevokeUserName")
    private String revokeUserName;

    @Query
    @NameInMap("TableName")
    @Validation(required = true)
    private String tableName;

    @Query
    @NameInMap("WorkspaceId")
    @Validation(required = true, maximum = 9999999, minimum = 1)
    private Long workspaceId;

    private RevokeColumnPermissionRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.columns = builder.columns;
        this.maxComputeProjectName = builder.maxComputeProjectName;
        this.revokeUserId = builder.revokeUserId;
        this.revokeUserName = builder.revokeUserName;
        this.tableName = builder.tableName;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static RevokeColumnPermissionRequest create() {
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
     * @return columns
     */
    public String getColumns() {
        return this.columns;
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

    public static final class Builder extends Request.Builder<RevokeColumnPermissionRequest, Builder> {
        private String regionId; 
        private String columns; 
        private String maxComputeProjectName; 
        private String revokeUserId; 
        private String revokeUserName; 
        private String tableName; 
        private Long workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(RevokeColumnPermissionRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.columns = request.columns;
            this.maxComputeProjectName = request.maxComputeProjectName;
            this.revokeUserId = request.revokeUserId;
            this.revokeUserName = request.revokeUserName;
            this.tableName = request.tableName;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * The ID of the DataWorks workspace with which the MaxCompute project is associated. You can log on to the DataWorks console and go to the Workspace Management page to obtain the ID.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The Alibaba Cloud account of the user from whom you want to revoke permissions. Specify this parameter in the format that is the same as the format of the account used to access the MaxCompute project.
         * <p>
         * 
         * *   If you want to revoke permissions from an Alibaba Cloud account, specify this parameter in the ALIYUN$+Alibaba Cloud account format.
         * *   If you want to revoke permissions from a Resource Access Management (RAM) user, specify this parameter in the RAM$+RAM user format.
         * 
         * You must specify either this parameter or RevokeUserId. If you specify both this parameter and RevokeUserId, the value of RevokeUserId prevails.
         */
        public Builder columns(String columns) {
            this.putQueryParameter("Columns", columns);
            this.columns = columns;
            return this;
        }

        /**
         * The name of the MaxCompute table to which the destination fields belong. You can call the [SearchMetaTables](~~173919~~) operation to query the name.
         */
        public Builder maxComputeProjectName(String maxComputeProjectName) {
            this.putQueryParameter("MaxComputeProjectName", maxComputeProjectName);
            this.maxComputeProjectName = maxComputeProjectName;
            return this;
        }

        /**
         * Indicates whether the permissions on table fields are revoked.
         */
        public Builder revokeUserId(String revokeUserId) {
            this.putQueryParameter("RevokeUserId", revokeUserId);
            this.revokeUserId = revokeUserId;
            return this;
        }

        /**
         * The ID of the Alibaba Cloud account of the user from whom you want to revoke permissions. You can log on to the DataWorks console and go to the Security Settings page to obtain the ID.
         * <p>
         * 
         * You must specify either this parameter or RevokeUserName. If you specify both this parameter and RevokeUserName, the value of this parameter prevails.
         */
        public Builder revokeUserName(String revokeUserName) {
            this.putQueryParameter("RevokeUserName", revokeUserName);
            this.revokeUserName = revokeUserName;
            return this;
        }

        /**
         * The fields for which you want to revoke permissions from a user. Separate multiple fields with commas (,).
         * <p>
         * 
         * You can revoke the permissions on the fields only in MaxCompute tables.
         */
        public Builder tableName(String tableName) {
            this.putQueryParameter("TableName", tableName);
            this.tableName = tableName;
            return this;
        }

        /**
         * The name of the MaxCompute project to which the destination fields belong. You can log on to the DataWorks console and go to the Workspace Management page to obtain the name of the MaxCompute project that is associated with the workspace.
         */
        public Builder workspaceId(Long workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public RevokeColumnPermissionRequest build() {
            return new RevokeColumnPermissionRequest(this);
        } 

    } 

}
