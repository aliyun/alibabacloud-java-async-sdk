// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateTablePartitionColumnStatisticsRequest} extends {@link RequestModel}
 *
 * <p>UpdateTablePartitionColumnStatisticsRequest</p>
 */
public class UpdateTablePartitionColumnStatisticsRequest extends Request {
    @NameInMap("CatalogId")
    private String catalogId;

    @NameInMap("ColumnStatisticsList")
    private java.util.List < ColumnStatistics > columnStatisticsList;

    @NameInMap("DatabaseName")
    private String databaseName;

    @NameInMap("Engine")
    private String engine;

    @NameInMap("IsStatsCompliant")
    private Boolean isStatsCompliant;

    @NameInMap("TableName")
    private String tableName;

    @NameInMap("ValidWriteIdList")
    private String validWriteIdList;

    @NameInMap("WriteId")
    private String writeId;

    private UpdateTablePartitionColumnStatisticsRequest(Builder builder) {
        super(builder);
        this.catalogId = builder.catalogId;
        this.columnStatisticsList = builder.columnStatisticsList;
        this.databaseName = builder.databaseName;
        this.engine = builder.engine;
        this.isStatsCompliant = builder.isStatsCompliant;
        this.tableName = builder.tableName;
        this.validWriteIdList = builder.validWriteIdList;
        this.writeId = builder.writeId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UpdateTablePartitionColumnStatisticsRequest create() {
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
     * @return columnStatisticsList
     */
    public java.util.List < ColumnStatistics > getColumnStatisticsList() {
        return this.columnStatisticsList;
    }

    /**
     * @return databaseName
     */
    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * @return engine
     */
    public String getEngine() {
        return this.engine;
    }

    /**
     * @return isStatsCompliant
     */
    public Boolean getIsStatsCompliant() {
        return this.isStatsCompliant;
    }

    /**
     * @return tableName
     */
    public String getTableName() {
        return this.tableName;
    }

    /**
     * @return validWriteIdList
     */
    public String getValidWriteIdList() {
        return this.validWriteIdList;
    }

    /**
     * @return writeId
     */
    public String getWriteId() {
        return this.writeId;
    }

    public static final class Builder extends Request.Builder<UpdateTablePartitionColumnStatisticsRequest, Builder> {
        private String catalogId; 
        private java.util.List < ColumnStatistics > columnStatisticsList; 
        private String databaseName; 
        private String engine; 
        private Boolean isStatsCompliant; 
        private String tableName; 
        private String validWriteIdList; 
        private String writeId; 

        private Builder() {
            super();
        } 

        private Builder(UpdateTablePartitionColumnStatisticsRequest request) {
            super(request);
            this.catalogId = request.catalogId;
            this.columnStatisticsList = request.columnStatisticsList;
            this.databaseName = request.databaseName;
            this.engine = request.engine;
            this.isStatsCompliant = request.isStatsCompliant;
            this.tableName = request.tableName;
            this.validWriteIdList = request.validWriteIdList;
            this.writeId = request.writeId;
        } 

        /**
         * CatalogId.
         */
        public Builder catalogId(String catalogId) {
            this.catalogId = catalogId;
            return this;
        }

        /**
         * ColumnStatisticsList.
         */
        public Builder columnStatisticsList(java.util.List < ColumnStatistics > columnStatisticsList) {
            this.columnStatisticsList = columnStatisticsList;
            return this;
        }

        /**
         * DatabaseName.
         */
        public Builder databaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }

        /**
         * Engine.
         */
        public Builder engine(String engine) {
            this.engine = engine;
            return this;
        }

        /**
         * IsStatsCompliant.
         */
        public Builder isStatsCompliant(Boolean isStatsCompliant) {
            this.isStatsCompliant = isStatsCompliant;
            return this;
        }

        /**
         * TableName.
         */
        public Builder tableName(String tableName) {
            this.tableName = tableName;
            return this;
        }

        /**
         * ValidWriteIdList.
         */
        public Builder validWriteIdList(String validWriteIdList) {
            this.validWriteIdList = validWriteIdList;
            return this;
        }

        /**
         * WriteId.
         */
        public Builder writeId(String writeId) {
            this.writeId = writeId;
            return this;
        }

        @Override
        public UpdateTablePartitionColumnStatisticsRequest build() {
            return new UpdateTablePartitionColumnStatisticsRequest(this);
        } 

    } 

}
