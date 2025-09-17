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
 * {@link CreatePermissionApplyOrderRequest} extends {@link RequestModel}
 *
 * <p>CreatePermissionApplyOrderRequest</p>
 */
public class CreatePermissionApplyOrderRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplyObject")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<ApplyObject> applyObject;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplyReason")
    @com.aliyun.core.annotation.Validation(required = true)
    private String applyReason;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplyType")
    private String applyType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ApplyUserIds")
    @com.aliyun.core.annotation.Validation(required = true)
    private String applyUserIds;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CatalogName")
    private String catalogName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Deadline")
    private Long deadline;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("EngineType")
    @Deprecated
    private String engineType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("MaxComputeProjectName")
    private String maxComputeProjectName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("OrderType")
    @Deprecated
    private Integer orderType;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(maximum = 999999)
    private Integer workspaceId;

    private CreatePermissionApplyOrderRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.applyObject = builder.applyObject;
        this.applyReason = builder.applyReason;
        this.applyType = builder.applyType;
        this.applyUserIds = builder.applyUserIds;
        this.catalogName = builder.catalogName;
        this.deadline = builder.deadline;
        this.engineType = builder.engineType;
        this.maxComputeProjectName = builder.maxComputeProjectName;
        this.orderType = builder.orderType;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CreatePermissionApplyOrderRequest create() {
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
     * @return applyObject
     */
    public java.util.List<ApplyObject> getApplyObject() {
        return this.applyObject;
    }

    /**
     * @return applyReason
     */
    public String getApplyReason() {
        return this.applyReason;
    }

    /**
     * @return applyType
     */
    public String getApplyType() {
        return this.applyType;
    }

    /**
     * @return applyUserIds
     */
    public String getApplyUserIds() {
        return this.applyUserIds;
    }

    /**
     * @return catalogName
     */
    public String getCatalogName() {
        return this.catalogName;
    }

    /**
     * @return deadline
     */
    public Long getDeadline() {
        return this.deadline;
    }

    /**
     * @return engineType
     */
    public String getEngineType() {
        return this.engineType;
    }

    /**
     * @return maxComputeProjectName
     */
    public String getMaxComputeProjectName() {
        return this.maxComputeProjectName;
    }

    /**
     * @return orderType
     */
    public Integer getOrderType() {
        return this.orderType;
    }

    /**
     * @return workspaceId
     */
    public Integer getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<CreatePermissionApplyOrderRequest, Builder> {
        private String regionId; 
        private java.util.List<ApplyObject> applyObject; 
        private String applyReason; 
        private String applyType; 
        private String applyUserIds; 
        private String catalogName; 
        private Long deadline; 
        private String engineType; 
        private String maxComputeProjectName; 
        private Integer orderType; 
        private Integer workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(CreatePermissionApplyOrderRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.applyObject = request.applyObject;
            this.applyReason = request.applyReason;
            this.applyType = request.applyType;
            this.applyUserIds = request.applyUserIds;
            this.catalogName = request.catalogName;
            this.deadline = request.deadline;
            this.engineType = request.engineType;
            this.maxComputeProjectName = request.maxComputeProjectName;
            this.orderType = request.orderType;
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
         * <p>The list of requested objects.</p>
         * <p>This parameter is required.</p>
         */
        public Builder applyObject(java.util.List<ApplyObject> applyObject) {
            this.putQueryParameter("ApplyObject", applyObject);
            this.applyObject = applyObject;
            return this;
        }

        /**
         * <p>The reason for your request. The administrator determines whether to approve the request based on the reason.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>I need to use this table</p>
         */
        public Builder applyReason(String applyReason) {
            this.putQueryParameter("ApplyReason", applyReason);
            this.applyReason = applyReason;
            return this;
        }

        /**
         * ApplyType.
         */
        public Builder applyType(String applyType) {
            this.putQueryParameter("ApplyType", applyType);
            this.applyType = applyType;
            return this;
        }

        /**
         * <p>The ID of the Alibaba Cloud account for which you want to request permissions. If you want to request permissions for multiple Alibaba Cloud accounts, separate the IDs of the accounts with commas (,).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>267842600408993176,267842600408993177</p>
         */
        public Builder applyUserIds(String applyUserIds) {
            this.putQueryParameter("ApplyUserIds", applyUserIds);
            this.applyUserIds = applyUserIds;
            return this;
        }

        /**
         * CatalogName.
         */
        public Builder catalogName(String catalogName) {
            this.putQueryParameter("CatalogName", catalogName);
            this.catalogName = catalogName;
            return this;
        }

        /**
         * <p>The expiration time of the permissions that you request. This value is a UNIX timestamp. The default value is January 1, 2065. If LabelSecurity is disabled for the MaxCompute project in which you want to request permissions on the fields of a table, or the security level of the fields is 0 or is lower than or equal to the security level of the Alibaba Cloud account for which you want to request permissions, you can request only permanent permissions. You can go to the Workspace Management page in the DataWorks console, click MaxCompute Management in the left-side navigation pane, and then check whether column-level access control is enabled. You can go to your DataWorks workspace, view the security level of the fields in Data Map, and then view the security level of the Alibaba Cloud account on the User Management page.</p>
         * 
         * <strong>example:</strong>
         * <p>1617115071885</p>
         */
        public Builder deadline(Long deadline) {
            this.putQueryParameter("Deadline", deadline);
            this.deadline = deadline;
            return this;
        }

        /**
         * <p>The type of compute engine for permission requests. Currently only supports ODPS, which means only MaxCompute compute engine permissions are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>odps</p>
         */
        public Builder engineType(String engineType) {
            this.putQueryParameter("EngineType", engineType);
            this.engineType = engineType;
            return this;
        }

        /**
         * <p>The name of the MaxCompute project you request access to.</p>
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
         * <p>The request type. The only supported value is 1, which represents an object ACL permission request.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        public Builder orderType(Integer orderType) {
            this.putQueryParameter("OrderType", orderType);
            this.orderType = orderType;
            return this;
        }

        /**
         * <p>The DataWorks workspace ID to which the MaxCompute project belongs for permission requests. You can check the workspace ID on the DataWorks workspace configuration page.</p>
         * 
         * <strong>example:</strong>
         * <p>12345</p>
         */
        public Builder workspaceId(Integer workspaceId) {
            this.putQueryParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        @Override
        public CreatePermissionApplyOrderRequest build() {
            return new CreatePermissionApplyOrderRequest(this);
        } 

    } 

    /**
     * 
     * {@link CreatePermissionApplyOrderRequest} extends {@link TeaModel}
     *
     * <p>CreatePermissionApplyOrderRequest</p>
     */
    public static class ColumnMetaList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Actions")
        private String actions;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private ColumnMetaList(Builder builder) {
            this.actions = builder.actions;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ColumnMetaList create() {
            return builder().build();
        }

        /**
         * @return actions
         */
        public String getActions() {
            return this.actions;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String actions; 
            private String name; 

            private Builder() {
            } 

            private Builder(ColumnMetaList model) {
                this.actions = model.actions;
                this.name = model.name;
            } 

            /**
             * Actions.
             */
            public Builder actions(String actions) {
                this.actions = actions;
                return this;
            }

            /**
             * <p>Permissions for the target columns. Enter the column names here. If applying for permissions on the entire table, enter all column names of the table. Permissions for specific columns can only be requested if labelSecurity is enabled for the MaxCompute project. Otherwise, you can only apply for permissions on the entire table.</p>
             * 
             * <strong>example:</strong>
             * <p>aColumnName</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public ColumnMetaList build() {
                return new ColumnMetaList(this);
            } 

        } 

    }
    /**
     * 
     * {@link CreatePermissionApplyOrderRequest} extends {@link TeaModel}
     *
     * <p>CreatePermissionApplyOrderRequest</p>
     */
    public static class ApplyObject extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Actions")
        private String actions;

        @com.aliyun.core.annotation.NameInMap("ColumnMetaList")
        private java.util.List<ColumnMetaList> columnMetaList;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        private ApplyObject(Builder builder) {
            this.actions = builder.actions;
            this.columnMetaList = builder.columnMetaList;
            this.name = builder.name;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static ApplyObject create() {
            return builder().build();
        }

        /**
         * @return actions
         */
        public String getActions() {
            return this.actions;
        }

        /**
         * @return columnMetaList
         */
        public java.util.List<ColumnMetaList> getColumnMetaList() {
            return this.columnMetaList;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        public static final class Builder {
            private String actions; 
            private java.util.List<ColumnMetaList> columnMetaList; 
            private String name; 

            private Builder() {
            } 

            private Builder(ApplyObject model) {
                this.actions = model.actions;
                this.columnMetaList = model.columnMetaList;
                this.name = model.name;
            } 

            /**
             * <p>The type of permissions requested. Use commas (,) to separate multiple permission types in a single request. Currently only supports Select, Describe, Drop, Alter, Update, and Download permission types.</p>
             * 
             * <strong>example:</strong>
             * <p>Select,Describe</p>
             */
            public Builder actions(String actions) {
                this.actions = actions;
                return this;
            }

            /**
             * <p>The list of column objects.</p>
             */
            public Builder columnMetaList(java.util.List<ColumnMetaList> columnMetaList) {
                this.columnMetaList = columnMetaList;
                return this;
            }

            /**
             * <p>The object you request access to. Currently, only permission requests for MaxCompute tables are supported. The name of the target table needs to be entered here.</p>
             * 
             * <strong>example:</strong>
             * <p>aTableName</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            public ApplyObject build() {
                return new ApplyObject(this);
            } 

        } 

    }
}
