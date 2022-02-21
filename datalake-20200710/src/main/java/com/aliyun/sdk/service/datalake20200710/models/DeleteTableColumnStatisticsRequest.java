// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteTableColumnStatisticsRequest} extends {@link RequestModel}
 *
 * <p>DeleteTableColumnStatisticsRequest</p>
 */
public class DeleteTableColumnStatisticsRequest extends Request {
    @Query
    @NameInMap("CatalogId")
    private String catalogId;

    @Query
    @NameInMap("ColumnNames")
    private java.util.List < String > columnNames;

    @Query
    @NameInMap("DatabaseName")
    private String databaseName;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("TableName")
    private String tableName;

    private DeleteTableColumnStatisticsRequest(Builder builder) {
        super(builder);
        this.catalogId = builder.catalogId;
        this.columnNames = builder.columnNames;
        this.databaseName = builder.databaseName;
        this.regionId = builder.regionId;
        this.tableName = builder.tableName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeleteTableColumnStatisticsRequest create() {
        return builder().build();
    }

    @Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return catalogId
     */
    public String getCatalogId() {
        return this.catalogId;
    }

    /**
     * @return columnNames
     */
    public java.util.List < String > getColumnNames() {
        return this.columnNames;
    }

    /**
     * @return databaseName
     */
    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    /**
     * @return tableName
     */
    public String getTableName() {
        return this.tableName;
    }

    public static final class Builder extends Request.Builder<DeleteTableColumnStatisticsRequest, Builder> {
        private String catalogId; 
        private java.util.List < String > columnNames; 
        private String databaseName; 
        private String regionId; 
        private String tableName; 

        private Builder() {
            super();
        } 

        private Builder(DeleteTableColumnStatisticsRequest response) {
            super(response);
            this.catalogId = response.catalogId;
            this.columnNames = response.columnNames;
            this.databaseName = response.databaseName;
            this.regionId = response.regionId;
            this.tableName = response.tableName;
        } 

        /**
         * CatalogId
         */
        public Builder catalogId(String catalogId) {
            this.putQueryParameter("CatalogId", catalogId);
            this.catalogId = catalogId;
            return this;
        }

        /**
         * ColumnNames.
         */
        public Builder columnNames(java.util.List < String > columnNames) {
            this.putQueryParameter("ColumnNames", columnNames);
            this.columnNames = columnNames;
            return this;
        }

        /**
         * DatabaseName
         */
        public Builder databaseName(String databaseName) {
            this.putQueryParameter("DatabaseName", databaseName);
            this.databaseName = databaseName;
            return this;
        }

        /**
         * RegionId
         */
        public Builder regionId(String regionId) {
            this.putHostParameter("RegionId", regionId);
            this.regionId = regionId;
            return this;
        }

        /**
         * TableName
         */
        public Builder tableName(String tableName) {
            this.putQueryParameter("TableName", tableName);
            this.tableName = tableName;
            return this;
        }

        @Override
        public DeleteTableColumnStatisticsRequest build() {
            return new DeleteTableColumnStatisticsRequest(this);
        } 

    } 

}
