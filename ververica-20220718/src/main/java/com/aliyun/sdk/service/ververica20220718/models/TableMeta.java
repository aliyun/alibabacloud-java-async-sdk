// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ververica20220718.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link TableMeta} extends {@link TeaModel}
 *
 * <p>TableMeta</p>
 */
public class TableMeta extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("catalogName")
    private String catalogName;

    @com.aliyun.core.annotation.NameInMap("databaseName")
    private String databaseName;

    @com.aliyun.core.annotation.NameInMap("tableName")
    private String tableName;

    private TableMeta(Builder builder) {
        this.catalogName = builder.catalogName;
        this.databaseName = builder.databaseName;
        this.tableName = builder.tableName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TableMeta create() {
        return builder().build();
    }

    /**
     * @return catalogName
     */
    public String getCatalogName() {
        return this.catalogName;
    }

    /**
     * @return databaseName
     */
    public String getDatabaseName() {
        return this.databaseName;
    }

    /**
     * @return tableName
     */
    public String getTableName() {
        return this.tableName;
    }

    public static final class Builder {
        private String catalogName; 
        private String databaseName; 
        private String tableName; 

        /**
         * catalogName.
         */
        public Builder catalogName(String catalogName) {
            this.catalogName = catalogName;
            return this;
        }

        /**
         * databaseName.
         */
        public Builder databaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }

        /**
         * tableName.
         */
        public Builder tableName(String tableName) {
            this.tableName = tableName;
            return this;
        }

        public TableMeta build() {
            return new TableMeta(this);
        } 

    } 

}
