// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

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
 * {@link CreateDataPermissionsRequest} extends {@link RequestModel}
 *
 * <p>CreateDataPermissionsRequest</p>
 */
public class CreateDataPermissionsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dataId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("DataType")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dataType;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("PermissionUserInfos")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<PermissionUserInfos> permissionUserInfos;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    private CreateDataPermissionsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.dataId = builder.dataId;
        this.dataType = builder.dataType;
        this.permissionUserInfos = builder.permissionUserInfos;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreateDataPermissionsRequest create() {
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
     * @return dataId
     */
    public String getDataId() {
        return this.dataId;
    }

    /**
     * @return dataType
     */
    public String getDataType() {
        return this.dataType;
    }

    /**
     * @return permissionUserInfos
     */
    public java.util.List<PermissionUserInfos> getPermissionUserInfos() {
        return this.permissionUserInfos;
    }

    /**
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<CreateDataPermissionsRequest, Builder> {
        private String regionId; 
        private String dataId; 
        private String dataType; 
        private java.util.List<PermissionUserInfos> permissionUserInfos; 
        private String workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(CreateDataPermissionsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.dataId = request.dataId;
            this.dataType = request.dataType;
            this.permissionUserInfos = request.permissionUserInfos;
            this.workspaceId = request.workspaceId;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SystemSearch.QuarkCommonNews</p>
         */
        public Builder dataId(String dataId) {
            this.putBodyParameter("DataId", dataId);
            this.dataId = dataId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>dataset</p>
         */
        public Builder dataType(String dataType) {
            this.putBodyParameter("DataType", dataType);
            this.dataType = dataType;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder permissionUserInfos(java.util.List<PermissionUserInfos> permissionUserInfos) {
            String permissionUserInfosShrink = shrink(permissionUserInfos, "PermissionUserInfos", "json");
            this.putBodyParameter("PermissionUserInfos", permissionUserInfosShrink);
            this.permissionUserInfos = permissionUserInfos;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-xxx</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putBodyParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public CreateDataPermissionsRequest build() {
            return new CreateDataPermissionsRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreateDataPermissionsRequest} extends {@link TeaModel}
     *
     * <p>CreateDataPermissionsRequest</p>
     */
    public static class PermissionUserInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("PermissionUserId")
        @com.aliyun.core.annotation.Validation(required = true)
        private String permissionUserId;

        @com.aliyun.core.annotation.NameInMap("PermissionUsername")
        private String permissionUsername;

        private PermissionUserInfos(Builder builder) {
            this.permissionUserId = builder.permissionUserId;
            this.permissionUsername = builder.permissionUsername;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PermissionUserInfos create() {
            return builder().build();
        }

        /**
         * @return permissionUserId
         */
        public String getPermissionUserId() {
            return this.permissionUserId;
        }

        /**
         * @return permissionUsername
         */
        public String getPermissionUsername() {
            return this.permissionUsername;
        }

        public static final class Builder {
            private String permissionUserId; 
            private String permissionUsername; 

            private Builder() {
            } 

            private Builder(PermissionUserInfos model) {
                this.permissionUserId = model.permissionUserId;
                this.permissionUsername = model.permissionUsername;
            } 

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder permissionUserId(String permissionUserId) {
                this.permissionUserId = permissionUserId;
                return this;
            }

            /**
             * PermissionUsername.
             */
            public Builder permissionUsername(String permissionUsername) {
                this.permissionUsername = permissionUsername;
                return this;
            }

            public PermissionUserInfos build() {
                return new PermissionUserInfos(this);
            } 

        } 

    }
}
