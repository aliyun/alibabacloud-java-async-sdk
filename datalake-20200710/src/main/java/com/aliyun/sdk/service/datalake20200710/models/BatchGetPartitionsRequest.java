// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link BatchGetPartitionsRequest} extends {@link RequestModel}
 *
 * <p>BatchGetPartitionsRequest</p>
 */
public class BatchGetPartitionsRequest extends Request {
    @Body
    @NameInMap("CatalogId")
    private String catalogId;

    @Body
    @NameInMap("DatabaseName")
    private String databaseName;

    @Body
    @NameInMap("IsShareSd")
    private Boolean isShareSd;

    @Body
    @NameInMap("PartitionValueList")
    private java.util.List < PartitionValueList> partitionValueList;

    @Body
    @NameInMap("TableName")
    private String tableName;

    @Host
    @NameInMap("RegionId")
    private String regionId;

    private BatchGetPartitionsRequest(Builder builder) {
        super(builder);
        this.catalogId = builder.catalogId;
        this.databaseName = builder.databaseName;
        this.isShareSd = builder.isShareSd;
        this.partitionValueList = builder.partitionValueList;
        this.tableName = builder.tableName;
        this.regionId = builder.regionId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static BatchGetPartitionsRequest create() {
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
     * @return databaseName
     */
    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * @return isShareSd
     */
    public Boolean getIsShareSd() {
        return this.isShareSd;
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

    /**
     * @return regionId
     */
    public String getRegionId() {
        return this.regionId;
    }

    public static final class Builder extends Request.Builder<BatchGetPartitionsRequest, Builder> {
        private String catalogId; 
        private String databaseName; 
        private Boolean isShareSd; 
        private java.util.List < PartitionValueList> partitionValueList; 
        private String tableName; 
        private String regionId; 

        private Builder() {
            super();
        } 

        private Builder(BatchGetPartitionsRequest response) {
            super(response);
            this.catalogId = response.catalogId;
            this.databaseName = response.databaseName;
            this.isShareSd = response.isShareSd;
            this.partitionValueList = response.partitionValueList;
            this.tableName = response.tableName;
            this.regionId = response.regionId;
        } 

        /**
         * CatalogId
         */
        public Builder catalogId(String catalogId) {
            this.putBodyParameter("CatalogId", catalogId);
            this.catalogId = catalogId;
            return this;
        }

        /**
         * DatabaseName
         */
        public Builder databaseName(String databaseName) {
            this.putBodyParameter("DatabaseName", databaseName);
            this.databaseName = databaseName;
            return this;
        }

        /**
         * IsShareSd
         */
        public Builder isShareSd(Boolean isShareSd) {
            this.putBodyParameter("IsShareSd", isShareSd);
            this.isShareSd = isShareSd;
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
         * TableName
         */
        public Builder tableName(String tableName) {
            this.putBodyParameter("TableName", tableName);
            this.tableName = tableName;
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

        @Override
        public BatchGetPartitionsRequest build() {
            return new BatchGetPartitionsRequest(this);
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
