// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SmallFileCntRank} extends {@link TeaModel}
 *
 * <p>SmallFileCntRank</p>
 */
public class SmallFileCntRank extends TeaModel {
    @NameInMap("DbName")
    private String dbName;

    @NameInMap("Location")
    private String location;

    @NameInMap("Quantity")
    private Long quantity;

    @NameInMap("TableName")
    private String tableName;

    private SmallFileCntRank(Builder builder) {
        this.dbName = builder.dbName;
        this.location = builder.location;
        this.quantity = builder.quantity;
        this.tableName = builder.tableName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SmallFileCntRank create() {
        return builder().build();
    }

    /**
     * @return dbName
     */
    public String getDbName() {
        return this.dbName;
    }

    /**
     * @return location
     */
    public String getLocation() {
        return this.location;
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
        private String location; 
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
         * 存储位置
         */
        public Builder location(String location) {
            this.location = location;
            return this;
        }

        /**
         * 数量
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

        public SmallFileCntRank build() {
            return new SmallFileCntRank(this);
        } 

    } 

}
