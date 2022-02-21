// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link LockObj} extends {@link TeaModel}
 *
 * <p>LockObj</p>
 */
public class LockObj extends TeaModel {
    @NameInMap("CatalogId")
    private String catalogId;

    @NameInMap("DatabaseName")
    private String databaseName;

    @NameInMap("PartitionName")
    private String partitionName;

    @NameInMap("TableName")
    private String tableName;

    private LockObj(Builder builder) {
        this.catalogId = builder.catalogId;
        this.databaseName = builder.databaseName;
        this.partitionName = builder.partitionName;
        this.tableName = builder.tableName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static LockObj create() {
        return builder().build();
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
     * @return partitionName
     */
    public String getPartitionName() {
        return this.partitionName;
    }

    /**
     * @return tableName
     */
    public String getTableName() {
        return this.tableName;
    }

    public static final class Builder {
        private String catalogId; 
        private String databaseName; 
        private String partitionName; 
        private String tableName; 

        /**
         * CatalogId
         */
        public Builder catalogId(String catalogId) {
            this.catalogId = catalogId;
            return this;
        }

        /**
         * DatabaseName
         */
        public Builder databaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }

        /**
         * PartitionName
         */
        public Builder partitionName(String partitionName) {
            this.partitionName = partitionName;
            return this;
        }

        /**
         * TableName
         */
        public Builder tableName(String tableName) {
            this.tableName = tableName;
            return this;
        }

        public LockObj build() {
            return new LockObj(this);
        } 

    } 

}
