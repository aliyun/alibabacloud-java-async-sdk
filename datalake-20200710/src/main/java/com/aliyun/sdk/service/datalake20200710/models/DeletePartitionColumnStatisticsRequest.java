// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeletePartitionColumnStatisticsRequest} extends {@link RequestModel}
 *
 * <p>DeletePartitionColumnStatisticsRequest</p>
 */
public class DeletePartitionColumnStatisticsRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("CatalogId")
    private String catalogId;

    @Query
    @NameInMap("ColumnNames")
    private java.util.List < String > columnNames;

    @Query
    @NameInMap("DatabaseName")
    private String databaseName;

    @Query
    @NameInMap("PartitionNames")
    private java.util.List < String > partitionNames;

    @Query
    @NameInMap("TableName")
    private String tableName;

    private DeletePartitionColumnStatisticsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.catalogId = builder.catalogId;
        this.columnNames = builder.columnNames;
        this.databaseName = builder.databaseName;
        this.partitionNames = builder.partitionNames;
        this.tableName = builder.tableName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DeletePartitionColumnStatisticsRequest create() {
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
     * @return partitionNames
     */
    public java.util.List < String > getPartitionNames() {
        return this.partitionNames;
    }

    /**
     * @return tableName
     */
    public String getTableName() {
        return this.tableName;
    }

    public static final class Builder extends Request.Builder<DeletePartitionColumnStatisticsRequest, Builder> {
        private String regionId; 
        private String catalogId; 
        private java.util.List < String > columnNames; 
        private String databaseName; 
        private java.util.List < String > partitionNames; 
        private String tableName; 

        private Builder() {
            super();
        } 

        private Builder(DeletePartitionColumnStatisticsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.catalogId = request.catalogId;
            this.columnNames = request.columnNames;
            this.databaseName = request.databaseName;
            this.partitionNames = request.partitionNames;
            this.tableName = request.tableName;
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
            String columnNamesShrink = shrink(columnNames, "ColumnNames", "json");
            this.putQueryParameter("ColumnNames", columnNamesShrink);
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
         * PartitionNames.
         */
        public Builder partitionNames(java.util.List < String > partitionNames) {
            String partitionNamesShrink = shrink(partitionNames, "PartitionNames", "json");
            this.putQueryParameter("PartitionNames", partitionNamesShrink);
            this.partitionNames = partitionNames;
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
        public DeletePartitionColumnStatisticsRequest build() {
            return new DeletePartitionColumnStatisticsRequest(this);
        } 

    } 

}
