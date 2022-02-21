// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dms_enterprise20181101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExecuteScriptResponseBody} extends {@link TeaModel}
 *
 * <p>ExecuteScriptResponseBody</p>
 */
public class ExecuteScriptResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    private String errorCode;

    @NameInMap("ErrorMessage")
    private String errorMessage;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Results")
    private java.util.List < Results> results;

    @NameInMap("Success")
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
         * ErrorCode.
         */
        public Builder errorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }

        /**
         * ErrorMessage.
         */
        public Builder errorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
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
         * Results.
         */
        public Builder results(java.util.List < Results> results) {
            this.results = results;
            return this;
        }

        /**
         * Success.
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
        @NameInMap("ColumnNames")
        private java.util.List < String > columnNames;

        @NameInMap("Message")
        private String message;

        @NameInMap("RowCount")
        private Long rowCount;

        @NameInMap("Rows")
        private java.util.List < java.util.Map<String, ?>> rows;

        @NameInMap("Success")
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
             * ColumnNames.
             */
            public Builder columnNames(java.util.List < String > columnNames) {
                this.columnNames = columnNames;
                return this;
            }

            /**
             * Message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * RowCount.
             */
            public Builder rowCount(Long rowCount) {
                this.rowCount = rowCount;
                return this;
            }

            /**
             * Rows.
             */
            public Builder rows(java.util.List < java.util.Map<String, ?>> rows) {
                this.rows = rows;
                return this;
            }

            /**
             * Success.
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
