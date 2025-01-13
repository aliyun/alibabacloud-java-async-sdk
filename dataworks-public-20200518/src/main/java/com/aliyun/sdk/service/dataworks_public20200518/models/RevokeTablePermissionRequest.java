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
         * <p>The permissions that you want to revoke. Separate multiple permissions with commas (,). You can revoke only the SELECT, DESCRIBE, and DOWNLOAD permissions on MaxCompute tables.</p>
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
         * <p>The name of the MaxCompute project to which the table belongs. You can log on to the DataWorks console and go to the SettingCenter page to obtain the name of the MaxCompute project that you associate with the workspace.</p>
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
         * <p>The ID of the Alibaba Cloud account from which you want to revoke permissions. You can log on to the DataWorks console and go to the Security Settings page to obtain the ID. You must specify either this parameter or the RevokeUserName parameter. If you specify both this parameter and the RevokeUserName parameter and the parameter values are different, the value of this parameter prevails.</p>
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
         * <p>The Alibaba Cloud account from which you want to revoke permissions. Specify this parameter in the format that is the same as the format of the account used to access the MaxCompute project.</p>
         * <ul>
         * <li>If the account is an Alibaba Cloud account, the value is in the ALIYUN$+Account name format.</li>
         * <li>If the account is a RAM user, the value is in the RAM$+Account name format.</li>
         * </ul>
         * <p>You must specify either this parameter or the RevokeUserId parameter. If you specify both this parameter and the RevokeUserId parameter and the parameter values are different, the value of the RevokeUserId parameter prevails.</p>
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
         * <p>The name of the MaxCompute table. You can call the <a href="https://help.aliyun.com/document_detail/173919.html">SearchMetaTables</a> operation to query the name of the MaxCompute table.</p>
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
         * <p>The ID of the DataWorks workspace with which the MaxCompute project is associated. You can log on to the DataWorks console and go to the Workspace page to obtain the ID.</p>
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
