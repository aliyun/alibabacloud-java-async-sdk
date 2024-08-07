// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SmallFileCntRank} extends {@link TeaModel}
 *
 * <p>SmallFileCntRank</p>
 */
public class SmallFileCntRank extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("DbName")
    private String dbName;

    @com.aliyun.core.annotation.NameInMap("Location")
    private String location;

    @com.aliyun.core.annotation.NameInMap("Quantity")
    private Long quantity;

    @com.aliyun.core.annotation.NameInMap("TableName")
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
         * DbName.
         */
        public Builder dbName(String dbName) {
            this.dbName = dbName;
            return this;
        }

        /**
         * Location.
         */
        public Builder location(String location) {
            this.location = location;
            return this;
        }

        /**
         * Quantity.
         */
        public Builder quantity(Long quantity) {
            this.quantity = quantity;
            return this;
        }

        /**
         * TableName.
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
