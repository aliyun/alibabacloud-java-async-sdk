// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

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
 * {@link CancelSparkReplStatementResponseBody} extends {@link TeaModel}
 *
 * <p>CancelSparkReplStatementResponseBody</p>
 */
public class CancelSparkReplStatementResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private CancelSparkReplStatementResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static CancelSparkReplStatementResponseBody create() {
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

        private Builder(CancelSparkReplStatementResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public CancelSparkReplStatementResponseBody build() {
            return new CancelSparkReplStatementResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link CancelSparkReplStatementResponseBody} extends {@link TeaModel}
     *
     * <p>CancelSparkReplStatementResponseBody</p>
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
        private java.util.List<String> columns;

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
        public java.util.List<String> getColumns() {
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
            private java.util.List<String> columns; 
            private Long endTime; 
            private String error; 
            private String output; 
            private String outputType; 
            private Long startTime; 
            private Long statementId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.aliyunUid = model.aliyunUid;
                this.code = model.code;
                this.codeState = model.codeState;
                this.codeType = model.codeType;
                this.columns = model.columns;
                this.endTime = model.endTime;
                this.error = model.error;
                this.output = model.output;
                this.outputType = model.outputType;
                this.startTime = model.startTime;
                this.statementId = model.statementId;
            } 

            /**
             * <p>The ID of the Alibaba Cloud account that owns the cluster.</p>
             * 
             * <strong>example:</strong>
             * <p>190063530332****</p>
             */
            public Builder aliyunUid(Long aliyunUid) {
                this.aliyunUid = aliyunUid;
                return this;
            }

            /**
             * <p>The code that is executed.</p>
             * 
             * <strong>example:</strong>
             * <p>print(1+1)</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The code execution status. Valid values:</p>
             * <ul>
             * <li>CANCELLED</li>
             * <li>RUNNING</li>
             * <li>SUCCEEDED</li>
             * <li>ERROR</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>RUNNING</p>
             */
            public Builder codeState(String codeState) {
                this.codeState = codeState;
                return this;
            }

            /**
             * <p>The code type. Valid values:</p>
             * <ul>
             * <li>SCALA</li>
             * <li>PYTHON</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PYTHON</p>
             */
            public Builder codeType(String codeType) {
                this.codeType = codeType;
                return this;
            }

            /**
             * <p>The column names.</p>
             */
            public Builder columns(java.util.List<String> columns) {
                this.columns = columns;
                return this;
            }

            /**
             * <p>The end time of the execution. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1730968056000</p>
             */
            public Builder endTime(Long endTime) {
                this.endTime = endTime;
                return this;
            }

            /**
             * <p>The error message.</p>
             * 
             * <strong>example:</strong>
             * <p>StackOverflow Exception:</p>
             */
            public Builder error(String error) {
                this.error = error;
                return this;
            }

            /**
             * <p>The code execution result, which is a JSON string that conforms to Apache Livy.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;text/plain&quot;: &quot;2&quot;}</p>
             */
            public Builder output(String output) {
                this.output = output;
                return this;
            }

            /**
             * <p>The execution result type, which is in the JSON format. Valid values:</p>
             * <ul>
             * <li>TEXT: the text content that conforms to Apache Livy.</li>
             * <li>TABLE: the table content that conforms to Apache Livy.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>TEXT</p>
             */
            public Builder outputType(String outputType) {
                this.outputType = outputType;
                return this;
            }

            /**
             * <p>The start time of the execution. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>1730968056000</p>
             */
            public Builder startTime(Long startTime) {
                this.startTime = startTime;
                return this;
            }

            /**
             * <p>The unique ID of the code block in the Spark job.</p>
             * 
             * <strong>example:</strong>
             * <p>123</p>
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
