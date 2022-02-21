// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPartitionColumnStatisticsRequest} extends {@link RequestModel}
 *
 * <p>GetPartitionColumnStatisticsRequest</p>
 */
public class GetPartitionColumnStatisticsRequest extends Request {
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

    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Query
    @NameInMap("TableName")
    private String tableName;

    private GetPartitionColumnStatisticsRequest(Builder builder) {
        super(builder);
        this.catalogId = builder.catalogId;
        this.columnNames = builder.columnNames;
        this.databaseName = builder.databaseName;
        this.partitionNames = builder.partitionNames;
        this.regionId = builder.regionId;
        this.tableName = builder.tableName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPartitionColumnStatisticsRequest create() {
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
     * @return partitionNames
     */
    public java.util.List < String > getPartitionNames() {
        return this.partitionNames;
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

    public static final class Builder extends Request.Builder<GetPartitionColumnStatisticsRequest, Builder> {
        private String catalogId; 
        private java.util.List < String > columnNames; 
        private String databaseName; 
        private java.util.List < String > partitionNames; 
        private String regionId; 
        private String tableName; 

        private Builder() {
            super();
        } 

        private Builder(GetPartitionColumnStatisticsRequest response) {
            super(response);
            this.catalogId = response.catalogId;
            this.columnNames = response.columnNames;
            this.databaseName = response.databaseName;
            this.partitionNames = response.partitionNames;
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
         * PartitionNames.
         */
        public Builder partitionNames(java.util.List < String > partitionNames) {
            this.putQueryParameter("PartitionNames", partitionNames);
            this.partitionNames = partitionNames;
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
        public GetPartitionColumnStatisticsRequest build() {
            return new GetPartitionColumnStatisticsRequest(this);
        } 

    } 

}
