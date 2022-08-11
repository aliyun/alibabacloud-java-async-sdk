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
    @Query
    @NameInMap("Columns")
    @Validation(required = true)
    private String columns;

    @Query
    @NameInMap("MaxComputeProjectName")
    @Validation(required = true)
    private String maxComputeProjectName;

    @Host
    @NameInMap("RegionId")
    @Validation(required = true)
    private String regionId;

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
        this.columns = builder.columns;
        this.maxComputeProjectName = builder.maxComputeProjectName;
        this.regionId = builder.regionId;
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
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
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
        private String columns; 
        private String maxComputeProjectName; 
        private String regionId; 
        private String revokeUserId; 
        private String revokeUserName; 
        private String tableName; 
        private Long workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(RevokeColumnPermissionRequest request) {
            super(request);
            this.columns = request.columns;
            this.maxComputeProjectName = request.maxComputeProjectName;
            this.regionId = request.regionId;
            this.revokeUserId = request.revokeUserId;
            this.revokeUserName = request.revokeUserName;
            this.tableName = request.tableName;
            this.workspaceId = request.workspaceId;
        } 

        /**
         * Columns.
         */
        public Builder columns(String columns) {
            this.putQueryParameter("Columns", columns);
            this.columns = columns;
            return this;
        }

        /**
         * MaxComputeProjectName.
         */
        public Builder maxComputeProjectName(String maxComputeProjectName) {
            this.putQueryParameter("MaxComputeProjectName", maxComputeProjectName);
            this.maxComputeProjectName = maxComputeProjectName;
            return this;
        }

        /**
         * RegionId.
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * RevokeUserId.
         */
        public Builder revokeUserId(String revokeUserId) {
            this.putQueryParameter("RevokeUserId", revokeUserId);
            this.revokeUserId = revokeUserId;
            return this;
        }

        /**
         * RevokeUserName.
         */
        public Builder revokeUserName(String revokeUserName) {
            this.putQueryParameter("RevokeUserName", revokeUserName);
            this.revokeUserName = revokeUserName;
            return this;
        }

        /**
         * TableName.
         */
        public Builder tableName(String tableName) {
            this.putQueryParameter("TableName", tableName);
            this.tableName = tableName;
            return this;
        }

        /**
         * WorkspaceId.
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
