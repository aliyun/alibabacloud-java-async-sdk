// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20231229.models;

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
 * {@link AddTableRequest} extends {@link RequestModel}
 *
 * <p>AddTableRequest</p>
 */
public class AddTableRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String workspaceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("ConnectorId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String connectorId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TableColumns")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<TableColumns> tableColumns;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TableName")
    @com.aliyun.core.annotation.Validation(required = true, maxLength = 64, minLength = 1)
    private String tableName;

    private AddTableRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.workspaceId = builder.workspaceId;
        this.connectorId = builder.connectorId;
        this.tableColumns = builder.tableColumns;
        this.tableName = builder.tableName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static AddTableRequest create() {
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
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    /**
     * @return connectorId
     */
    public String getConnectorId() {
        return this.connectorId;
    }

    /**
     * @return tableColumns
     */
    public java.util.List<TableColumns> getTableColumns() {
        return this.tableColumns;
    }

    /**
     * @return tableName
     */
    public String getTableName() {
        return this.tableName;
    }

    public static final class Builder extends Request.Builder<AddTableRequest, Builder> {
        private String regionId; 
        private String workspaceId; 
        private String connectorId; 
        private java.util.List<TableColumns> tableColumns; 
        private String tableName; 

        private Builder() {
            super();
        } 

        private Builder(AddTableRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.workspaceId = request.workspaceId;
            this.connectorId = request.connectorId;
            this.tableColumns = request.tableColumns;
            this.tableName = request.tableName;
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
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>llm-3shx2gu255oqxxxx</p>
         */
        public Builder workspaceId(String workspaceId) {
            this.putPathParameter("WorkspaceId", workspaceId);
            this.workspaceId = workspaceId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>connector-d51861492df64257</p>
         */
        public Builder connectorId(String connectorId) {
            this.putBodyParameter("ConnectorId", connectorId);
            this.connectorId = connectorId;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder tableColumns(java.util.List<TableColumns> tableColumns) {
            String tableColumnsShrink = shrink(tableColumns, "TableColumns", "json");
            this.putBodyParameter("TableColumns", tableColumnsShrink);
            this.tableColumns = tableColumns;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ads_wjjr_basc_enterprise_di</p>
         */
        public Builder tableName(String tableName) {
            this.putBodyParameter("TableName", tableName);
            this.tableName = tableName;
            return this;
        }

        @Override
        public AddTableRequest build() {
            return new AddTableRequest(this);
        } 

    } 

    /**
     * 
     * {@link AddTableRequest} extends {@link TeaModel}
     *
     * <p>AddTableRequest</p>
     */
    public static class TableColumns extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ColumnDesc")
        @com.aliyun.core.annotation.Validation(maxLength = 15)
        private String columnDesc;

        @com.aliyun.core.annotation.NameInMap("ColumnName")
        @com.aliyun.core.annotation.Validation(required = true, maxLength = 15, minLength = 1)
        private String columnName;

        @com.aliyun.core.annotation.NameInMap("DataType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String dataType;

        private TableColumns(Builder builder) {
            this.columnDesc = builder.columnDesc;
            this.columnName = builder.columnName;
            this.dataType = builder.dataType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static TableColumns create() {
            return builder().build();
        }

        /**
         * @return columnDesc
         */
        public String getColumnDesc() {
            return this.columnDesc;
        }

        /**
         * @return columnName
         */
        public String getColumnName() {
            return this.columnName;
        }

        /**
         * @return dataType
         */
        public String getDataType() {
            return this.dataType;
        }

        public static final class Builder {
            private String columnDesc; 
            private String columnName; 
            private String dataType; 

            private Builder() {
            } 

            private Builder(TableColumns model) {
                this.columnDesc = model.columnDesc;
                this.columnName = model.columnName;
                this.dataType = model.dataType;
            } 

            /**
             * ColumnDesc.
             */
            public Builder columnDesc(String columnDesc) {
                this.columnDesc = columnDesc;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>column1</p>
             */
            public Builder columnName(String columnName) {
                this.columnName = columnName;
                return this;
            }

            /**
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>string</p>
             */
            public Builder dataType(String dataType) {
                this.dataType = dataType;
                return this;
            }

            public TableColumns build() {
                return new TableColumns(this);
            } 

        } 

    }
}
