// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.selectdb20230522.models;

import com.aliyun.sdk.gateway.pop.*;
import darabonba.core.*;
import darabonba.core.async.*;
import darabonba.core.sync.*;
import darabonba.core.client.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link DescribeTableSchemaResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeTableSchemaResponseBody</p>
 */
public class DescribeTableSchemaResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("CreateStatement")
    private String createStatement;

    @com.aliyun.core.annotation.NameInMap("Database")
    private String database;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Table")
    private String table;

    private DescribeTableSchemaResponseBody(Builder builder) {
        this.createStatement = builder.createStatement;
        this.database = builder.database;
        this.requestId = builder.requestId;
        this.table = builder.table;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeTableSchemaResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return createStatement
     */
    public String getCreateStatement() {
        return this.createStatement;
    }

    /**
     * @return database
     */
    public String getDatabase() {
        return this.database;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return table
     */
    public String getTable() {
        return this.table;
    }

    public static final class Builder {
        private String createStatement; 
        private String database; 
        private String requestId; 
        private String table; 

        private Builder() {
        } 

        private Builder(DescribeTableSchemaResponseBody model) {
            this.createStatement = model.createStatement;
            this.database = model.database;
            this.requestId = model.requestId;
            this.table = model.table;
        } 

        /**
         * CreateStatement.
         */
        public Builder createStatement(String createStatement) {
            this.createStatement = createStatement;
            return this;
        }

        /**
         * Database.
         */
        public Builder database(String database) {
            this.database = database;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Table.
         */
        public Builder table(String table) {
            this.table = table;
            return this;
        }

        public DescribeTableSchemaResponseBody build() {
            return new DescribeTableSchemaResponseBody(this);
        } 

    } 

}
