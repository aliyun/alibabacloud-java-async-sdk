// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExecuteScriptResponseBody} extends {@link TeaModel}
 *
 * <p>ExecuteScriptResponseBody</p>
 */
public class ExecuteScriptResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("ErrorCode")
    private String errorCode;

    @com.aliyun.core.annotation.NameInMap("ErrorMessage")
    private String errorMessage;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Results")
    private java.util.List < Results> results;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private ExecuteScriptResponseBody(Builder builder) {
        this.errorCode = builder.errorCode;
        this.errorMessage = builder.errorMessage;
        this.requestId = builder.requestId;
        this.results = builder.results;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecuteScriptResponseBody create() {
        return builder().build();
    }

    /**
     * @return errorCode
     */
    public String getErrorCode() {
        return this.errorCode;
    }

    /**
     * @return errorMessage
     */
    public String getErrorMessage() {
        return this.errorMessage;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return results
     */
    public java.util.List < Results> getResults() {
        return this.results;
    }

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String errorCode; 
        private String errorMessage; 
        private String requestId; 
        private java.util.List < Results> results; 
        private Boolean success; 

        /**
         * The error code.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * The error message about the gateway.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The results of the SQL statements that are executed, in the format of an array. Each entry in the array indicates the result of an SQL statement.
         */
        public Builder results(java.util.List < Results> results) {
            this.results = results;
            return this;
        }

        /**
         * Indicates whether the request is successful.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public ExecuteScriptResponseBody build() {
            return new ExecuteScriptResponseBody(this);
        } 

    } 

    public static class Results extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ColumnNames")
        private java.util.List < String > columnNames;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("RowCount")
        private Long rowCount;

        @com.aliyun.core.annotation.NameInMap("Rows")
        private java.util.List < java.util.Map<String, ?>> rows;

        @com.aliyun.core.annotation.NameInMap("Success")
        private Boolean success;

        private Results(Builder builder) {
            this.columnNames = builder.columnNames;
            this.message = builder.message;
            this.rowCount = builder.rowCount;
            this.rows = builder.rows;
            this.success = builder.success;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Results create() {
            return builder().build();
        }

        /**
         * @return columnNames
         */
        public java.util.List < String > getColumnNames() {
            return this.columnNames;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return rowCount
         */
        public Long getRowCount() {
            return this.rowCount;
        }

        /**
         * @return rows
         */
        public java.util.List < java.util.Map<String, ?>> getRows() {
            return this.rows;
        }

        /**
         * @return success
         */
        public Boolean getSuccess() {
            return this.success;
        }

        public static final class Builder {
            private java.util.List < String > columnNames; 
            private String message; 
            private Long rowCount; 
            private java.util.List < java.util.Map<String, ?>> rows; 
            private Boolean success; 

            /**
             * The fields that are queried after the SQL statement is executed.
             */
            public Builder columnNames(java.util.List < String > columnNames) {
                this.columnNames = columnNames;
                return this;
            }

            /**
             * The error message that is returned if the SQL statement fails to be executed. For example, an error message is returned because the SQL statement is invalid.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * The total number of entries that are returned.
             */
            public Builder rowCount(Long rowCount) {
                this.rowCount = rowCount;
                return this;
            }

            /**
             * The rows that are queried after the SQL statement is executed.
             */
            public Builder rows(java.util.List < java.util.Map<String, ?>> rows) {
                this.rows = rows;
                return this;
            }

            /**
             * Indicates whether the SQL statement is executed.
             */
            public Builder success(Boolean success) {
                this.success = success;
                return this;
            }

            public Results build() {
                return new Results(this);
            } 

        } 

    }
}
