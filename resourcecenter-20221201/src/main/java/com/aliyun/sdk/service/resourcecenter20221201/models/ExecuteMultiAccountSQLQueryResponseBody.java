// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcecenter20221201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ExecuteMultiAccountSQLQueryResponseBody} extends {@link TeaModel}
 *
 * <p>ExecuteMultiAccountSQLQueryResponseBody</p>
 */
public class ExecuteMultiAccountSQLQueryResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Columns")
    private java.util.List < Columns> columns;

    @com.aliyun.core.annotation.NameInMap("MaxResults")
    private Integer maxResults;

    @com.aliyun.core.annotation.NameInMap("NextToken")
    private String nextToken;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Rows")
    private java.util.List < ? > rows;

    private ExecuteMultiAccountSQLQueryResponseBody(Builder builder) {
        this.columns = builder.columns;
        this.maxResults = builder.maxResults;
        this.nextToken = builder.nextToken;
        this.requestId = builder.requestId;
        this.rows = builder.rows;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecuteMultiAccountSQLQueryResponseBody create() {
        return builder().build();
    }

    /**
     * @return columns
     */
    public java.util.List < Columns> getColumns() {
        return this.columns;
    }

    /**
     * @return maxResults
     */
    public Integer getMaxResults() {
        return this.maxResults;
    }

    /**
     * @return nextToken
     */
    public String getNextToken() {
        return this.nextToken;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return rows
     */
    public java.util.List < ? > getRows() {
        return this.rows;
    }

    public static final class Builder {
        private java.util.List < Columns> columns; 
        private Integer maxResults; 
        private String nextToken; 
        private String requestId; 
        private java.util.List < ? > rows; 

        /**
         * <p>The columns.</p>
         */
        public Builder columns(java.util.List < Columns> columns) {
            this.columns = columns;
            return this;
        }

        /**
         * MaxResults.
         */
        public Builder maxResults(Integer maxResults) {
            this.maxResults = maxResults;
            return this;
        }

        /**
         * NextToken.
         */
        public Builder nextToken(String nextToken) {
            this.nextToken = nextToken;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>44C8A952-D6B0-5BC8-82D5-93BA02E26F2E</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>An array of search results.</p>
         */
        public Builder rows(java.util.List < ? > rows) {
            this.rows = rows;
            return this;
        }

        public ExecuteMultiAccountSQLQueryResponseBody build() {
            return new ExecuteMultiAccountSQLQueryResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ExecuteMultiAccountSQLQueryResponseBody} extends {@link TeaModel}
     *
     * <p>ExecuteMultiAccountSQLQueryResponseBody</p>
     */
    public static class Columns extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Columns(Builder builder) {
            this.name = builder.name;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Columns create() {
            return builder().build();
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String name; 
            private String type; 

            /**
             * <p>The name of the column.</p>
             * 
             * <strong>example:</strong>
             * <p>resource_id</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The type of the column.</p>
             * 
             * <strong>example:</strong>
             * <p>varchar</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Columns build() {
                return new Columns(this);
            } 

        } 

    }
}
