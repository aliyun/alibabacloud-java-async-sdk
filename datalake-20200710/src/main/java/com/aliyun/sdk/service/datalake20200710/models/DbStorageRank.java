// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DbStorageRank} extends {@link TeaModel}
 *
 * <p>DbStorageRank</p>
 */
public class DbStorageRank extends TeaModel {
    @NameInMap("DbName")
    private String dbName;

    @NameInMap("Quantity")
    private Long quantity;

    private DbStorageRank(Builder builder) {
        this.dbName = builder.dbName;
        this.quantity = builder.quantity;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DbStorageRank create() {
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

    public static final class Builder {
        private String dbName; 
        private Long quantity; 

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

        public DbStorageRank build() {
            return new DbStorageRank(this);
        } 

    } 

}
