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
         * <p>The CREATE TABLE statement.</p>
         * 
         * <strong>example:</strong>
         * <p>CREATE TABLE test_tb
         * (
         *     k1 TINYINT,
         *     k2 DECIMAL(10, 2) DEFAULT &quot;10.05&quot;,
         *     k3 CHAR(10) COMMENT &quot;string column&quot;,
         *     k4 INT NOT NULL DEFAULT &quot;1&quot; COMMENT &quot;int column&quot;
         * )
         * COMMENT &quot;my first table&quot;
         * DISTRIBUTED BY HASH(k1) BUCKETS 16</p>
         */
        public Builder createStatement(String createStatement) {
            this.createStatement = createStatement;
            return this;
        }

        /**
         * <p>The database name.</p>
         * 
         * <strong>example:</strong>
         * <p>test_db</p>
         */
        public Builder database(String database) {
            this.database = database;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4773E4EC-025D-509F-AEA9-D53123FDFB0F</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The table name.</p>
         * 
         * <strong>example:</strong>
         * <p>test_tb</p>
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
