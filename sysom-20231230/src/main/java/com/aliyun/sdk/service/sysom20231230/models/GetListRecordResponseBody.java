// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sysom20231230.models;

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
 * {@link GetListRecordResponseBody} extends {@link TeaModel}
 *
 * <p>GetListRecordResponseBody</p>
 */
public class GetListRecordResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("data")
    private java.util.List<Data> data;

    @com.aliyun.core.annotation.NameInMap("message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("requestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("total")
    private Long total;

    private GetListRecordResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.total = builder.total;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetListRecordResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return code
     */
    public String getCode() {
        return this.code;
    }

    /**
     * @return data
     */
    public java.util.List<Data> getData() {
        return this.data;
    }

    /**
     * @return message
     */
    public String getMessage() {
        return this.message;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return total
     */
    public Long getTotal() {
        return this.total;
    }

    public static final class Builder {
        private String code; 
        private java.util.List<Data> data; 
        private String message; 
        private String requestId; 
        private Long total; 

        private Builder() {
        } 

        private Builder(GetListRecordResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.message = model.message;
            this.requestId = model.requestId;
            this.total = model.total;
        } 

        /**
         * <p>The status code.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(java.util.List<Data> data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The description of the status code.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>2D693121-C925-5154-8DF6-C09A8B369822</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>19</p>
         */
        public Builder total(Long total) {
            this.total = total;
            return this;
        }

        public GetListRecordResponseBody build() {
            return new GetListRecordResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetListRecordResponseBody} extends {@link TeaModel}
     *
     * <p>GetListRecordResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("analysisId")
        private String analysisId;

        @com.aliyun.core.annotation.NameInMap("analysisTime")
        private String analysisTime;

        @com.aliyun.core.annotation.NameInMap("arguments")
        private String arguments;

        @com.aliyun.core.annotation.NameInMap("failedLog")
        private String failedLog;

        @com.aliyun.core.annotation.NameInMap("status")
        private String status;

        private Data(Builder builder) {
            this.analysisId = builder.analysisId;
            this.analysisTime = builder.analysisTime;
            this.arguments = builder.arguments;
            this.failedLog = builder.failedLog;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return analysisId
         */
        public String getAnalysisId() {
            return this.analysisId;
        }

        /**
         * @return analysisTime
         */
        public String getAnalysisTime() {
            return this.analysisTime;
        }

        /**
         * @return arguments
         */
        public String getArguments() {
            return this.arguments;
        }

        /**
         * @return failedLog
         */
        public String getFailedLog() {
            return this.failedLog;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String analysisId; 
            private String analysisTime; 
            private String arguments; 
            private String failedLog; 
            private String status; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.analysisId = model.analysisId;
                this.analysisTime = model.analysisTime;
                this.arguments = model.arguments;
                this.failedLog = model.failedLog;
                this.status = model.status;
            } 

            /**
             * <p>The AI analysis ID.</p>
             * 
             * <strong>example:</strong>
             * <p>16896fa8-37f6-4c70-bb32-67fa9817d426</p>
             */
            public Builder analysisId(String analysisId) {
                this.analysisId = analysisId;
                return this;
            }

            /**
             * <p>The analysis time.</p>
             * 
             * <strong>example:</strong>
             * <p>2024-12-24 12:02:05</p>
             */
            public Builder analysisTime(String analysisTime) {
                this.analysisTime = analysisTime;
                return this;
            }

            /**
             * <p>The analysis parameters of the AI job analysis.</p>
             * 
             * <strong>example:</strong>
             * <p>timeout=2000 ms</p>
             */
            public Builder arguments(String arguments) {
                this.arguments = arguments;
                return this;
            }

            /**
             * <p>The analysis failure log.</p>
             * 
             * <strong>example:</strong>
             * <p>机器i-wz9dej066kii4goqpnze分析失败, 失败原因: Not get GPU trace data for \&quot;e59ce870-dbd4-4c44-a814-174ac6ab5bcf\&quot; \&quot;[\&quot;118534\&quot;]\&quot;!</p>
             */
            public Builder failedLog(String failedLog) {
                this.failedLog = failedLog;
                return this;
            }

            /**
             * <p>The analysis status.</p>
             * 
             * <strong>example:</strong>
             * <p>Completed/Analysis Failed</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
