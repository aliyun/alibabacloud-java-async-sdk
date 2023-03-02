// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RevokeTablePermissionRequest} extends {@link RequestModel}
 *
 * <p>RevokeTablePermissionRequest</p>
 */
public class RevokeTablePermissionRequest extends Request {
    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

    @Query
    @NameInMap("Actions")
    @Validation(required = true)
    private String actions;

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
         * The ID of the region where the MaxCompute project that contains the table resides. For example, the ID of the China (Shanghai) region is cn-shanghai, and that of the China (Zhangjiakou) region is cn-zhangjiakou. The system automatically determines the value of this parameter based on the endpoint used to call the operation.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * The permissions that you want to revoke. Separate multiple permissions with commas (,).
         * <p>
         * 
         * You can revoke only the SELECT, DESCRIBE, and DOWNLOAD permissions on MaxCompute tables.
         */
        public Builder actions(String actions) {
            this.putQueryParameter("Actions", actions);
            this.actions = actions;
            return this;
        }

        /**
         * The name of the MaxCompute project to which the table belongs. You can log on to the DataWorks console and go to the Workspace Management page to obtain the MaxCompute project name.
         */
        public Builder maxComputeProjectName(String maxComputeProjectName) {
            this.putQueryParameter("MaxComputeProjectName", maxComputeProjectName);
            this.maxComputeProjectName = maxComputeProjectName;
            return this;
        }

        /**
         * The ID of the Alibaba Cloud account from which you want to revoke permissions. You can log on to the DataWorks console and go to the Security Settings page to obtain the ID.
         * <p>
         * 
         * You must specify either this parameter or RevokeUserName. If you specify both this parameter and RevokeUserName, the value of this parameter prevails.
         */
        public Builder revokeUserId(String revokeUserId) {
            this.putQueryParameter("RevokeUserId", revokeUserId);
            this.revokeUserId = revokeUserId;
            return this;
        }

        /**
         * The Alibaba Cloud account from which you want to revoke permissions. Specify this parameter in the format that is the same as the format of the account used to access the MaxCompute project.
         * <p>
         * 
         * *   If you want to revoke permissions from an Alibaba Cloud account, specify this parameter in the ALIYUN$+Alibaba Cloud account format.
         * *   If you want to revoke permissions from a Resource Access Management (RAM) user, specify this parameter in the RAM$+RAM user format.
         * 
         * You must specify either this parameter or RevokeUserId. If you specify both this parameter and RevokeUserId, the value of RevokeUserId prevails.
         */
        public Builder revokeUserName(String revokeUserName) {
            this.putQueryParameter("RevokeUserName", revokeUserName);
            this.revokeUserName = revokeUserName;
            return this;
        }

        /**
         * The name of the MaxCompute table. You can call the [SearchMetaTables](~~173919~~) operation to query the table name.
         */
        public Builder tableName(String tableName) {
            this.putQueryParameter("TableName", tableName);
            this.tableName = tableName;
            return this;
        }

        /**
         * The ID of the DataWorks workspace with which the MaxCompute project is associated. You can log on to the DataWorks console and go to the Workspace Management page to obtain the ID.
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
