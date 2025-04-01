// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

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
 * {@link DescribeOasSQLDetailsResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeOasSQLDetailsResponseBody</p>
 */
public class DescribeOasSQLDetailsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private DescribeOasSQLDetailsResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeOasSQLDetailsResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return data
     */
    public Data getData() {
        return this.data;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(DescribeOasSQLDetailsResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The list of the SQL execution plan.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>EE205C00-30E4-<strong><strong>-</strong></strong>-87E3A8A2AA0C</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public DescribeOasSQLDetailsResponseBody build() {
            return new DescribeOasSQLDetailsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DescribeOasSQLDetailsResponseBody} extends {@link TeaModel}
     *
     * <p>DescribeOasSQLDetailsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DbName")
        private String dbName;

        @com.aliyun.core.annotation.NameInMap("Fulltext")
        private String fulltext;

        @com.aliyun.core.annotation.NameInMap("Statement")
        private String statement;

        @com.aliyun.core.annotation.NameInMap("Tables")
        private java.util.List<String> tables;

        @com.aliyun.core.annotation.NameInMap("UserName")
        private String userName;

        private Data(Builder builder) {
            this.dbName = builder.dbName;
            this.fulltext = builder.fulltext;
            this.statement = builder.statement;
            this.tables = builder.tables;
            this.userName = builder.userName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return dbName
         */
        public String getDbName() {
            return this.dbName;
        }

        /**
         * @return fulltext
         */
        public String getFulltext() {
            return this.fulltext;
        }

        /**
         * @return statement
         */
        public String getStatement() {
            return this.statement;
        }

        /**
         * @return tables
         */
        public java.util.List<String> getTables() {
            return this.tables;
        }

        /**
         * @return userName
         */
        public String getUserName() {
            return this.userName;
        }

        public static final class Builder {
            private String dbName; 
            private String fulltext; 
            private String statement; 
            private java.util.List<String> tables; 
            private String userName; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.dbName = model.dbName;
                this.fulltext = model.fulltext;
                this.statement = model.statement;
                this.tables = model.tables;
                this.userName = model.userName;
            } 

            /**
             * <p>The name of the database.</p>
             * 
             * <strong>example:</strong>
             * <p>test_db</p>
             */
            public Builder dbName(String dbName) {
                this.dbName = dbName;
                return this;
            }

            /**
             * <p>SQL text.</p>
             * 
             * <strong>example:</strong>
             * <p>select a from b</p>
             */
            public Builder fulltext(String fulltext) {
                this.fulltext = fulltext;
                return this;
            }

            /**
             * <p>Parameterized text.</p>
             * 
             * <strong>example:</strong>
             * <p>select a from b</p>
             */
            public Builder statement(String statement) {
                this.statement = statement;
                return this;
            }

            /**
             * <p>The table name related to the SQL.</p>
             */
            public Builder tables(java.util.List<String> tables) {
                this.tables = tables;
                return this;
            }

            /**
             * <p>The username.</p>
             * 
             * <strong>example:</strong>
             * <p>test_user</p>
             */
            public Builder userName(String userName) {
                this.userName = userName;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
