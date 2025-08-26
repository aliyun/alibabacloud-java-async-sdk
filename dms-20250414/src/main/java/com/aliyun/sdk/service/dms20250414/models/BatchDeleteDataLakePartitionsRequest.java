// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms20250414.models;

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
 * {@link BatchDeleteDataLakePartitionsRequest} extends {@link RequestModel}
 *
 * <p>BatchDeleteDataLakePartitionsRequest</p>
 */
public class BatchDeleteDataLakePartitionsRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("CatalogName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String catalogName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String dbName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("IfExists")
    private Boolean ifExists;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("PartitionValuesList")
    @com.aliyun.core.annotation.Validation(required = true)
    private java.util.List<java.util.List<String>> partitionValuesList;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TableName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tableName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Tid")
    private Long tid;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("WorkspaceId")
    private Long workspaceId;

    private BatchDeleteDataLakePartitionsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.catalogName = builder.catalogName;
        this.dbName = builder.dbName;
        this.ifExists = builder.ifExists;
        this.partitionValuesList = builder.partitionValuesList;
        this.tableName = builder.tableName;
        this.tid = builder.tid;
        this.workspaceId = builder.workspaceId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchDeleteDataLakePartitionsRequest create() {
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
     * @return catalogName
     */
    public String getCatalogName() {
        return this.catalogName;
    }

    /**
     * @return dbName
     */
    public String getDbName() {
        return this.dbName;
    }

    /**
     * @return ifExists
     */
    public Boolean getIfExists() {
        return this.ifExists;
    }

    /**
     * @return partitionValuesList
     */
    public java.util.List<java.util.List<String>> getPartitionValuesList() {
        return this.partitionValuesList;
    }

    /**
     * @return tableName
     */
    public String getTableName() {
        return this.tableName;
    }

    /**
     * @return tid
     */
    public Long getTid() {
        return this.tid;
    }

    /**
     * @return workspaceId
     */
    public Long getWorkspaceId() {
        return this.workspaceId;
    }

    public static final class Builder extends Request.Builder<BatchDeleteDataLakePartitionsRequest, Builder> {
        private String regionId; 
        private String catalogName; 
        private String dbName; 
        private Boolean ifExists; 
        private java.util.List<java.util.List<String>> partitionValuesList; 
        private String tableName; 
        private Long tid; 
        private Long workspaceId; 

        private Builder() {
            super();
        } 

        private Builder(BatchDeleteDataLakePartitionsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.catalogName = request.catalogName;
            this.dbName = request.dbName;
            this.ifExists = request.ifExists;
            this.partitionValuesList = request.partitionValuesList;
            this.tableName = request.tableName;
            this.tid = request.tid;
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
         * <p>hive</p>
         */
        public Builder catalogName(String catalogName) {
            this.putQueryParameter("CatalogName", catalogName);
            this.catalogName = catalogName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        public Builder dbName(String dbName) {
            this.putQueryParameter("DbName", dbName);
            this.dbName = dbName;
            return this;
        }

        /**
         * IfExists.
         */
        public Builder ifExists(Boolean ifExists) {
            this.putQueryParameter("IfExists", ifExists);
            this.ifExists = ifExists;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         */
        public Builder partitionValuesList(java.util.List<java.util.List<String>> partitionValuesList) {
            this.putQueryParameter("PartitionValuesList", partitionValuesList);
            this.partitionValuesList = partitionValuesList;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>table_name</p>
         */
        public Builder tableName(String tableName) {
            this.putQueryParameter("TableName", tableName);
            this.tableName = tableName;
            return this;
        }

        /**
         * Tid.
         */
        public Builder tid(Long tid) {
            this.putQueryParameter("Tid", tid);
            this.tid = tid;
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
        public BatchDeleteDataLakePartitionsRequest build() {
            return new BatchDeleteDataLakePartitionsRequest(this);
        } 

    } 

}
