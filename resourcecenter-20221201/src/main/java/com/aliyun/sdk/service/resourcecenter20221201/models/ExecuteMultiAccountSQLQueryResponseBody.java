// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcecenter20221201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExecuteMultiAccountSQLQueryResponseBody} extends {@link TeaModel}
 *
 * <p>ExecuteMultiAccountSQLQueryResponseBody</p>
 */
public class ExecuteMultiAccountSQLQueryResponseBody extends TeaModel {
    @NameInMap("Columns")
    private java.util.List < Columns> columns;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Rows")
    private java.util.List < ? > rows;

    private ExecuteMultiAccountSQLQueryResponseBody(Builder builder) {
        this.columns = builder.columns;
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
        private String requestId; 
        private java.util.List < ? > rows; 

        /**
         * Columns.
         */
        public Builder columns(java.util.List < Columns> columns) {
            this.columns = columns;
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
         * Rows.
         */
        public Builder rows(java.util.List < ? > rows) {
            this.rows = rows;
            return this;
        }

        public ExecuteMultiAccountSQLQueryResponseBody build() {
            return new ExecuteMultiAccountSQLQueryResponseBody(this);
        } 

    } 

    public static class Columns extends TeaModel {
        @NameInMap("Name")
        private String name;

        @NameInMap("Type")
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
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Type.
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
