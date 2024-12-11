// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link ExecuteSparkReplStatementResponseBody} extends {@link TeaModel}
 *
 * <p>ExecuteSparkReplStatementResponseBody</p>
 */
public class ExecuteSparkReplStatementResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private ExecuteSparkReplStatementResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ExecuteSparkReplStatementResponseBody create() {
        return builder().build();
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

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ExecuteSparkReplStatementResponseBody build() {
            return new ExecuteSparkReplStatementResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ExecuteSparkReplStatementResponseBody} extends {@link TeaModel}
     *
     * <p>ExecuteSparkReplStatementResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AliyunUid")
        private Long aliyunUid;

        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("CodeState")
        private String codeState;

        @com.aliyun.core.annotation.NameInMap("CodeType")
        private String codeType;

        @com.aliyun.core.annotation.NameInMap("Columns")
        private java.util.List < String > columns;

        @com.aliyun.core.annotation.NameInMap("EndTime")
        private Long endTime;

        @com.aliyun.core.annotation.NameInMap("Error")
        private String error;

        @com.aliyun.core.annotation.NameInMap("Output")
        private String output;

        @com.aliyun.core.annotation.NameInMap("OutputType")
        private String outputType;

        @com.aliyun.core.annotation.NameInMap("StartTime")
        private Long startTime;

        @com.aliyun.core.annotation.NameInMap("StatementId")
        private Long statementId;

        private Data(Builder builder) {
            this.aliyunUid = builder.aliyunUid;
            this.code = builder.code;
            this.codeState = builder.codeState;
            this.codeType = builder.codeType;
            this.columns = builder.columns;
            this.endTime = builder.endTime;
            this.error = builder.error;
            this.output = builder.output;
            this.outputType = builder.outputType;
            this.startTime = builder.startTime;
            this.statementId = builder.statementId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return aliyunUid
         */
        public Long getAliyunUid() {
            return this.aliyunUid;
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return codeState
         */
        public String getCodeState() {
            return this.codeState;
        }

        /**
         * @return codeType
         */
        public String getCodeType() {
            return this.codeType;
        }

        /**
         * @return columns
         */
        public java.util.List < String > getColumns() {
            return this.columns;
        }

        /**
         * @return endTime
         */
        public Long getEndTime() {
            return this.endTime;
        }

        /**
         * @return error
         */
        public String getError() {
            return this.error;
        }

        /**
         * @return output
         */
        public String getOutput() {
            return this.output;
        }

        /**
         * @return outputType
         */
        public String getOutputType() {
            return this.outputType;
        }

        /**
         * @return startTime
         */
        public Long getStartTime() {
            return this.startTime;
        }

        /**
         * @return statementId
         */
        public Long getStatementId() {
            return this.statementId;
        }

        public static final class Builder {
            private Long aliyunUid; 
            private String code; 
            private String codeState; 
            private String codeType; 
            private java.util.List < String > columns; 
            private Long endTime; 
            private String error; 
            private String output; 
            private String outputType; 
            private Long startTime; 
            private Long statementId; 

            /**
             * AliyunUid.
             */
            public Builder aliyunUid(Long aliyunUid) {
                this.aliyunUid = aliyunUid;
                return this;
            }

            /**
             * Code.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * CodeState.
             */
            public Builder codeState(String codeState) {
                this.codeState = codeState;
                return this;
            }

            /**
             * CodeType.
             */
            public Builder codeType(String codeType) {
                this.codeType = codeType;
                return this;
            }

            /**
             * Columns.
             */
            public Builder columns(java.util.List < String > columns) {
                this.columns = columns;
                return this;
            }

            /**
             * EndTime.
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * Error.
             */
            public Builder error(String error) {
                this.error = error;
                return this;
            }

            /**
             * Output.
             */
            public Builder output(String output) {
                this.output = output;
                return this;
            }

            /**
             * OutputType.
             */
            public Builder outputType(String outputType) {
                this.outputType = outputType;
                return this;
            }

            /**
             * StartTime.
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * StatementId.
             */
            public Builder statementId(Long statementId) {
                this.statementId = statementId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
