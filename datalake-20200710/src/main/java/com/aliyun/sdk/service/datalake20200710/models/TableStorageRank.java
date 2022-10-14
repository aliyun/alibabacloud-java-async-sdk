// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TableStorageRank} extends {@link TeaModel}
 *
 * <p>TableStorageRank</p>
 */
public class TableStorageRank extends TeaModel {
    @NameInMap("DbName")
    private String dbName;

    @NameInMap("Quantity")
    private Long quantity;

    @NameInMap("TableName")
    private String tableName;

    private TableStorageRank(Builder builder) {
        this.dbName = builder.dbName;
        this.quantity = builder.quantity;
        this.tableName = builder.tableName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TableStorageRank create() {
        return builder().build();
    }

    /**
     * @return dbName
     */
    public String getDbName() {
        return this.dbName;
    }

    /**
     * @return quantity
     */
    public Long getQuantity() {
        return this.quantity;
    }

    /**
     * @return tableName
     */
    public String getTableName() {
        return this.tableName;
    }

    public static final class Builder {
        private String dbName; 
        private Long quantity; 
        private String tableName; 

        /**
         * 库名
         */
        public Builder dbName(String dbName) {
            this.dbName = dbName;
            return this;
        }

        /**
         * 存储量
         */
        public Builder quantity(Long quantity) {
            this.quantity = quantity;
            return this;
        }

        /**
         * 表名
         */
        public Builder tableName(String tableName) {
            this.tableName = tableName;
            return this;
        }

        public TableStorageRank build() {
            return new TableStorageRank(this);
        } 

    } 

}
