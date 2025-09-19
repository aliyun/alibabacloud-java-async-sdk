// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

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
 * {@link EditMetaKnowledgeAssetRequest} extends {@link RequestModel}
 *
 * <p>EditMetaKnowledgeAssetRequest</p>
 */
public class EditMetaKnowledgeAssetRequest extends Request {
    @com.aliyun.core.annotation.Host
    @com.aliyun.core.annotation.NameInMap("RegionId")
    private String regionId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("AssetDescription")
    @com.aliyun.core.annotation.Validation(required = true)
    private String assetDescription;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("ColumnName")
    private String columnName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("DbId")
    @com.aliyun.core.annotation.Validation(required = true)
    private Integer dbId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TableName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String tableName;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TableSchemaName")
    private String tableSchemaName;

    private EditMetaKnowledgeAssetRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.assetDescription = builder.assetDescription;
        this.columnName = builder.columnName;
        this.dbId = builder.dbId;
        this.tableName = builder.tableName;
        this.tableSchemaName = builder.tableSchemaName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static EditMetaKnowledgeAssetRequest create() {
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
     * @return assetDescription
     */
    public String getAssetDescription() {
        return this.assetDescription;
    }

    /**
     * @return columnName
     */
    public String getColumnName() {
        return this.columnName;
    }

    /**
     * @return dbId
     */
    public Integer getDbId() {
        return this.dbId;
    }

    /**
     * @return tableName
     */
    public String getTableName() {
        return this.tableName;
    }

    /**
     * @return tableSchemaName
     */
    public String getTableSchemaName() {
        return this.tableSchemaName;
    }

    public static final class Builder extends Request.Builder<EditMetaKnowledgeAssetRequest, Builder> {
        private String regionId; 
        private String assetDescription; 
        private String columnName; 
        private Integer dbId; 
        private String tableName; 
        private String tableSchemaName; 

        private Builder() {
            super();
        } 

        private Builder(EditMetaKnowledgeAssetRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.assetDescription = request.assetDescription;
            this.columnName = request.columnName;
            this.dbId = request.dbId;
            this.tableName = request.tableName;
            this.tableSchemaName = request.tableSchemaName;
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
         * <p>test</p>
         */
        public Builder assetDescription(String assetDescription) {
            this.putQueryParameter("AssetDescription", assetDescription);
            this.assetDescription = assetDescription;
            return this;
        }

        /**
         * ColumnName.
         */
        public Builder columnName(String columnName) {
            this.putQueryParameter("ColumnName", columnName);
            this.columnName = columnName;
            return this;
        }

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1930****</p>
         */
        public Builder dbId(Integer dbId) {
            this.putQueryParameter("DbId", dbId);
            this.dbId = dbId;
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
         * TableSchemaName.
         */
        public Builder tableSchemaName(String tableSchemaName) {
            this.putQueryParameter("TableSchemaName", tableSchemaName);
            this.tableSchemaName = tableSchemaName;
            return this;
        }

        @Override
        public EditMetaKnowledgeAssetRequest build() {
            return new EditMetaKnowledgeAssetRequest(this);
        } 

    } 

}
