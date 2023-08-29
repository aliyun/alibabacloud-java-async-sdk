// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TableResource} extends {@link TeaModel}
 *
 * <p>TableResource</p>
 */
public class TableResource extends TeaModel {
    @NameInMap("DatabaseName")
    private String databaseName;

    @NameInMap("TableName")
    private String tableName;

    private TableResource(Builder builder) {
        this.databaseName = builder.databaseName;
        this.tableName = builder.tableName;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static TableResource create() {
        return builder().build();
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
        private String databaseName; 
        private String tableName; 

        /**
         * DatabaseName.
         */
        public Builder databaseName(String databaseName) {
            this.databaseName = databaseName;
            return this;
        }

        /**
         * TableName.
         */
        public Builder tableName(String tableName) {
            this.tableName = tableName;
            return this;
        }

        public TableResource build() {
            return new TableResource(this);
        } 

    } 

}
