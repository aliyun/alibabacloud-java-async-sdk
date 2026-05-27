// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

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
 * {@link UpdateMmsTablesRequest} extends {@link RequestModel}
 *
 * <p>UpdateMmsTablesRequest</p>
 */
public class UpdateMmsTablesRequest extends Request {
    @com.aliyun.core.annotation.Path
    @com.aliyun.core.annotation.NameInMap("sourceId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Long sourceId;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dbName")
    private String dbName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dstProjectName")
    private String dstProjectName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("dstSchemaName")
    private String dstSchemaName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("status")
    private String status;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("tableNames")
    private java.util.List<String> tableNames;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("tables")
    private java.util.List<Long> tables;

    private UpdateMmsTablesRequest(Builder builder) {
        super(builder);
        this.sourceId = builder.sourceId;
        this.dbName = builder.dbName;
        this.dstProjectName = builder.dstProjectName;
        this.dstSchemaName = builder.dstSchemaName;
        this.status = builder.status;
        this.tableNames = builder.tableNames;
        this.tables = builder.tables;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateMmsTablesRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return sourceId
     */
    public Long getSourceId() {
        return this.sourceId;
    }

    /**
     * @return dbName
     */
    public String getDbName() {
        return this.dbName;
    }

    /**
     * @return dstProjectName
     */
    public String getDstProjectName() {
        return this.dstProjectName;
    }

    /**
     * @return dstSchemaName
     */
    public String getDstSchemaName() {
        return this.dstSchemaName;
    }

    /**
     * @return status
     */
    public String getStatus() {
        return this.status;
    }

    /**
     * @return tableNames
     */
    public java.util.List<String> getTableNames() {
        return this.tableNames;
    }

    /**
     * @return tables
     */
    public java.util.List<Long> getTables() {
        return this.tables;
    }

    public static final class Builder extends Request.Builder<UpdateMmsTablesRequest, Builder> {
        private Long sourceId; 
        private String dbName; 
        private String dstProjectName; 
        private String dstSchemaName; 
        private String status; 
        private java.util.List<String> tableNames; 
        private java.util.List<Long> tables; 

        private Builder() {
            super();
        } 

        private Builder(UpdateMmsTablesRequest request) {
            super(request);
            this.sourceId = request.sourceId;
            this.dbName = request.dbName;
            this.dstProjectName = request.dstProjectName;
            this.dstSchemaName = request.dstSchemaName;
            this.status = request.status;
            this.tableNames = request.tableNames;
            this.tables = request.tables;
        } 

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>2000014</p>
         */
        public Builder sourceId(Long sourceId) {
            this.putPathParameter("sourceId", sourceId);
            this.sourceId = sourceId;
            return this;
        }

        /**
         * dbName.
         */
        public Builder dbName(String dbName) {
            this.putBodyParameter("dbName", dbName);
            this.dbName = dbName;
            return this;
        }

        /**
         * dstProjectName.
         */
        public Builder dstProjectName(String dstProjectName) {
            this.putBodyParameter("dstProjectName", dstProjectName);
            this.dstProjectName = dstProjectName;
            return this;
        }

        /**
         * dstSchemaName.
         */
        public Builder dstSchemaName(String dstSchemaName) {
            this.putBodyParameter("dstSchemaName", dstSchemaName);
            this.dstSchemaName = dstSchemaName;
            return this;
        }

        /**
         * status.
         */
        public Builder status(String status) {
            this.putBodyParameter("status", status);
            this.status = status;
            return this;
        }

        /**
         * tableNames.
         */
        public Builder tableNames(java.util.List<String> tableNames) {
            this.putBodyParameter("tableNames", tableNames);
            this.tableNames = tableNames;
            return this;
        }

        /**
         * <p>Deprecated</p>
         */
        public Builder tables(java.util.List<Long> tables) {
            this.putBodyParameter("tables", tables);
            this.tables = tables;
            return this;
        }

        @Override
        public UpdateMmsTablesRequest build() {
            return new UpdateMmsTablesRequest(this);
        } 

    } 

}
