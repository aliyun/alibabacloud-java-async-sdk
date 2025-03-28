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
 * {@link UpdateTableAddColumnRequest} extends {@link RequestModel}
 *
 * <p>UpdateTableAddColumnRequest</p>
 */
public class UpdateTableAddColumnRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Column")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<Column> column;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TableGuid")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tableGuid;

    private UpdateTableAddColumnRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.column = builder.column;
        this.tableGuid = builder.tableGuid;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTableAddColumnRequest create() {
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
     * @return column
     */
    public java.util.List<Column> getColumn() {
        return this.column;
    }

    /**
     * @return tableGuid
     */
    public String getTableGuid() {
        return this.tableGuid;
    }

    public static final class Builder extends Request.Builder<UpdateTableAddColumnRequest, Builder> {
        private String regionId; 
        private java.util.List<Column> column; 
        private String tableGuid; 

        private Builder() {
            super();
        } 

        private Builder(UpdateTableAddColumnRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.column = request.column;
            this.tableGuid = request.tableGuid;
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
         * <p>The fields.</p>
         * <p>This parameter is required.</p>
         */
        public Builder column(java.util.List<Column> column) {
            this.putBodyParameter("Column", column);
            this.column = column;
            return this;
        }

        /**
         * <p>The globally unique identifier (GUID) of the MaxCompute table. Specify the GUID in the odps.projectName.tableName format.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>odps.engine_name.table_name</p>
         */
        public Builder tableGuid(String tableGuid) {
            this.putQueryParameter("TableGuid", tableGuid);
            this.tableGuid = tableGuid;
            return this;
        }

        @Override
        public UpdateTableAddColumnRequest build() {
            return new UpdateTableAddColumnRequest(this);
        } 

    } 

    /**
     * 
     * {@link UpdateTableAddColumnRequest} extends {@link TeaModel}
     *
     * <p>UpdateTableAddColumnRequest</p>
     */
    public static class Column extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ColumnName")
        @com.aliyun.core.annotation.Validation(required = true)
        private String columnName;

        @com.aliyun.core.annotation.NameInMap("ColumnNameCn")
        private String columnNameCn;

        @com.aliyun.core.annotation.NameInMap("ColumnType")
        @com.aliyun.core.annotation.Validation(required = true)
        private String columnType;

        @com.aliyun.core.annotation.NameInMap("Comment")
        private String comment;

        private Column(Builder builder) {
            this.columnName = builder.columnName;
            this.columnNameCn = builder.columnNameCn;
            this.columnType = builder.columnType;
            this.comment = builder.comment;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Column create() {
            return builder().build();
        }

        /**
         * @return columnName
         */
        public String getColumnName() {
            return this.columnName;
        }

        /**
         * @return columnNameCn
         */
        public String getColumnNameCn() {
            return this.columnNameCn;
        }

        /**
         * @return columnType
         */
        public String getColumnType() {
            return this.columnType;
        }

        /**
         * @return comment
         */
        public String getComment() {
            return this.comment;
        }

        public static final class Builder {
            private String columnName; 
            private String columnNameCn; 
            private String columnType; 
            private String comment; 

            private Builder() {
            } 

            private Builder(Column model) {
                this.columnName = model.columnName;
                this.columnNameCn = model.columnNameCn;
                this.columnType = model.columnType;
                this.comment = model.comment;
            } 

            /**
             * <p>The name of the field.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>abc</p>
             */
            public Builder columnName(String columnName) {
                this.columnName = columnName;
                return this;
            }

            /**
             * <p>The display name of the field.</p>
             * 
             * <strong>example:</strong>
             * <p>Chinese</p>
             */
            public Builder columnNameCn(String columnNameCn) {
                this.columnNameCn = columnNameCn;
                return this;
            }

            /**
             * <p>The type of the field. For more information, see MaxCompute field types.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>string</p>
             */
            public Builder columnType(String columnType) {
                this.columnType = columnType;
                return this;
            }

            /**
             * <p>The comment of the field.</p>
             * 
             * <strong>example:</strong>
             * <p>Remarks</p>
             */
            public Builder comment(String comment) {
                this.comment = comment;
                return this;
            }

            public Column build() {
                return new Column(this);
            } 

        } 

    }
}
