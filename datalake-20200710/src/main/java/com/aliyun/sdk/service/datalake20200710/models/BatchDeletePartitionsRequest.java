// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchDeletePartitionsRequest} extends {@link RequestModel}
 *
 * <p>BatchDeletePartitionsRequest</p>
 */
public class BatchDeletePartitionsRequest extends Request {
    @Host
    @NameInMap("RegionId")
    private String regionId;

    @Body
    @NameInMap("CatalogId")
    private String catalogId;

    @Body
    @NameInMap("DatabaseName")
    private String databaseName;

    @Body
    @NameInMap("IfExists")
    private Boolean ifExists;

    @Body
    @NameInMap("PartitionValueList")
    private java.util.List < PartitionValueList> partitionValueList;

    @Body
    @NameInMap("TableName")
    private String tableName;

    private BatchDeletePartitionsRequest(Builder builder) {
        super(builder);
        this.regionId = builder.regionId;
        this.catalogId = builder.catalogId;
        this.databaseName = builder.databaseName;
        this.ifExists = builder.ifExists;
        this.partitionValueList = builder.partitionValueList;
        this.tableName = builder.tableName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchDeletePartitionsRequest create() {
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
     * @return databaseName
     */
    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * @return ifExists
     */
    public Boolean getIfExists() {
        return this.ifExists;
    }

    /**
     * @return partitionValueList
     */
    public java.util.List < PartitionValueList> getPartitionValueList() {
        return this.partitionValueList;
    }

    /**
     * @return tableName
     */
    public String getTableName() {
        return this.tableName;
    }

    public static final class Builder extends Request.Builder<BatchDeletePartitionsRequest, Builder> {
        private String regionId; 
        private String catalogId; 
        private String databaseName; 
        private Boolean ifExists; 
        private java.util.List < PartitionValueList> partitionValueList; 
        private String tableName; 

        private Builder() {
            super();
        } 

        private Builder(BatchDeletePartitionsRequest request) {
            super(request);
            this.regionId = request.regionId;
            this.catalogId = request.catalogId;
            this.databaseName = request.databaseName;
            this.ifExists = request.ifExists;
            this.partitionValueList = request.partitionValueList;
            this.tableName = request.tableName;
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
         * CatalogId.
         */
        public Builder catalogId(String catalogId) {
            this.putBodyParameter("CatalogId", catalogId);
            this.catalogId = catalogId;
            return this;
        }

        /**
         * DatabaseName.
         */
        public Builder databaseName(String databaseName) {
            this.putBodyParameter("DatabaseName", databaseName);
            this.databaseName = databaseName;
            return this;
        }

        /**
         * IfExists.
         */
        public Builder ifExists(Boolean ifExists) {
            this.putBodyParameter("IfExists", ifExists);
            this.ifExists = ifExists;
            return this;
        }

        /**
         * PartitionValueList.
         */
        public Builder partitionValueList(java.util.List < PartitionValueList> partitionValueList) {
            this.putBodyParameter("PartitionValueList", partitionValueList);
            this.partitionValueList = partitionValueList;
            return this;
        }

        /**
         * TableName.
         */
        public Builder tableName(String tableName) {
            this.putBodyParameter("TableName", tableName);
            this.tableName = tableName;
            return this;
        }

        @Override
        public BatchDeletePartitionsRequest build() {
            return new BatchDeletePartitionsRequest(this);
        } 

    } 

    public static class PartitionValueList extends TeaModel {
        @NameInMap("Values")
        private java.util.List < String > values;

        private PartitionValueList(Builder builder) {
            this.values = builder.values;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static PartitionValueList create() {
            return builder().build();
        }

        /**
         * @return values
         */
        public java.util.List < String > getValues() {
            return this.values;
        }

        public static final class Builder {
            private java.util.List < String > values; 

            /**
             * Values.
             */
            public Builder values(java.util.List < String > values) {
                this.values = values;
                return this;
            }

            public PartitionValueList build() {
                return new PartitionValueList(this);
            } 

        } 

    }
}
