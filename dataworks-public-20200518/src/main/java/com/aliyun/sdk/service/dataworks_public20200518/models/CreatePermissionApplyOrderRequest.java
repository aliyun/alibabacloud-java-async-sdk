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
         * <p>The list of objects to request permissions for.</p>
         * <p>This parameter is required.</p>
         */
        public Builder applyObject(java.util.List<ApplyObject> applyObject) {
            this.putQueryParameter("ApplyObject", applyObject);
            this.applyObject = applyObject;
            return this;
        }

        /**
         * <p>The reason for the request. This is used by the administrator for evaluation and approval.</p>
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
         * <p>The type of the request order. Valid values:</p>
         * <ul>
         * <li>[MaxComputeTable] MaxCompute table permission request order.</li>
         * <li>[MaxComputeFunction] MaxCompute function permission request order.</li>
         * <li>[MaxComputeResource] MaxCompute resource permission request order.</li>
         * <li>[DLFSchema] DLF 1.0 schema permission request order.</li>
         * <li>[DLFTable] DLF 1.0 table permission request order.</li>
         * <li>[DLFColumn] DLF 1.0 column permission request order.</li>
         * <li>[DsApiDeploy] Data service publication permission request order.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>MaxComputeTable</p>
         */
        public Builder applyType(String applyType) {
            this.putQueryParameter("ApplyType", applyType);
            this.applyType = applyType;
            return this;
        }

        /**
         * <p>The UIDs of the Alibaba Cloud accounts for which permissions are requested. Separate multiple account UIDs with commas (,).</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>26784260040899****,26784260040899****</p>
         */
        public Builder applyUserIds(String applyUserIds) {
            this.putQueryParameter("ApplyUserIds", applyUserIds);
            this.applyUserIds = applyUserIds;
            return this;
        }

        /**
         * <p>The name of the data catalog. Go to the <a href="https://dlf.console.aliyun.com/cn-hangzhou/metadata/catalog?spm=a2c4g.11186623.0.0.5a225658pT4Dkr">Data Lake Formation console</a> to view the data catalog name.</p>
         * 
         * <strong>example:</strong>
         * <p>hive</p>
         */
        public Builder catalogName(String catalogName) {
            this.putQueryParameter("CatalogName", catalogName);
            this.catalogName = catalogName;
            return this;
        }

        /**
         * <p>The expiration time of the requested permissions. Specify a UNIX timestamp. If you do not specify this parameter, the default expiration time is January 1, 2065.
         * If LabelSecurity is not enabled for the MaxCompute project, or the security level of the requested table field is 0 or less than or equal to the security level of the requesting account, you can only request permanent permissions.
         * Go to the management page of the DataWorks workspace and check whether column-level access control is enabled on the advanced configuration page of the MaxCompute engine.
         * Go to the DataWorks workspace to view the security level of fields in Data Map and the security level of accounts on the member management page.</p>
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
         * <p>This parameter is deprecated. Leave it empty.</p>
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
         * <p>The name of the MaxCompute project for which permissions are requested.</p>
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
         * <p>This parameter is deprecated. Leave it empty.</p>
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
         * <p>The ID of the DataWorks workspace to which the MaxCompute project belongs. Go to the DataWorks workspace configuration page to obtain the workspace ID.</p>
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
             * <p>The permission types to request. Separate multiple permission types with commas (,). Only Select, Describe, and Download types are supported.</p>
             * 
             * <strong>example:</strong>
             * <p>Select</p>
             */
            public Builder actions(String actions) {
                this.actions = actions;
                return this;
            }

            /**
             * <p>The name of the column for which permissions are requested. If you request permissions on the entire table, enter all column names of the table.
             * You can request permissions on specific columns only if LabelSecurity is enabled for the MaxCompute project. If LabelSecurity is not enabled, you can only request permissions on the entire table.</p>
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
             * <p>The permission types to request. Separate multiple permission types with commas (,). Only Select, Describe, Drop, Alter, Update, and Download types are supported.</p>
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
             * <p>The object for which permissions are requested. Only MaxCompute tables are supported. Enter the name of the target table.</p>
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
