// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aimiaobi20230801.models;

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
 * {@link GetPptInfoResponseBody} extends {@link TeaModel}
 *
 * <p>GetPptInfoResponseBody</p>
 */
public class GetPptInfoResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("HttpStatusCode")
    private Integer httpStatusCode;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetPptInfoResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.httpStatusCode = builder.httpStatusCode;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetPptInfoResponseBody create() {
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
    public Data getData() {
        return this.data;
    }

    /**
     * @return httpStatusCode
     */
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
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
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private String code; 
        private Data data; 
        private Integer httpStatusCode; 
        private String message; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(GetPptInfoResponseBody model) {
            this.code = model.code;
            this.data = model.data;
            this.httpStatusCode = model.httpStatusCode;
            this.message = model.message;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * Code.
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * Data.
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * HttpStatusCode.
         */
        public Builder httpStatusCode(Integer httpStatusCode) {
            this.httpStatusCode = httpStatusCode;
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
         * <p>Id of the request</p>
         * 
         * <strong>example:</strong>
         * <p>xxxxx</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * Success.
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetPptInfoResponseBody build() {
            return new GetPptInfoResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetPptInfoResponseBody} extends {@link TeaModel}
     *
     * <p>GetPptInfoResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ExportFileLink")
        private java.util.List<String> exportFileLink;

        @com.aliyun.core.annotation.NameInMap("ExportTaskId")
        private String exportTaskId;

        @com.aliyun.core.annotation.NameInMap("PptArtifactId")
        private String pptArtifactId;

        @com.aliyun.core.annotation.NameInMap("PptProcessId")
        private String pptProcessId;

        @com.aliyun.core.annotation.NameInMap("Query")
        private String query;

        @com.aliyun.core.annotation.NameInMap("TaskId")
        private String taskId;

        private Data(Builder builder) {
            this.exportFileLink = builder.exportFileLink;
            this.exportTaskId = builder.exportTaskId;
            this.pptArtifactId = builder.pptArtifactId;
            this.pptProcessId = builder.pptProcessId;
            this.query = builder.query;
            this.taskId = builder.taskId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return exportFileLink
         */
        public java.util.List<String> getExportFileLink() {
            return this.exportFileLink;
        }

        /**
         * @return exportTaskId
         */
        public String getExportTaskId() {
            return this.exportTaskId;
        }

        /**
         * @return pptArtifactId
         */
        public String getPptArtifactId() {
            return this.pptArtifactId;
        }

        /**
         * @return pptProcessId
         */
        public String getPptProcessId() {
            return this.pptProcessId;
        }

        /**
         * @return query
         */
        public String getQuery() {
            return this.query;
        }

        /**
         * @return taskId
         */
        public String getTaskId() {
            return this.taskId;
        }

        public static final class Builder {
            private java.util.List<String> exportFileLink; 
            private String exportTaskId; 
            private String pptArtifactId; 
            private String pptProcessId; 
            private String query; 
            private String taskId; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.exportFileLink = model.exportFileLink;
                this.exportTaskId = model.exportTaskId;
                this.pptArtifactId = model.pptArtifactId;
                this.pptProcessId = model.pptProcessId;
                this.query = model.query;
                this.taskId = model.taskId;
            } 

            /**
             * ExportFileLink.
             */
            public Builder exportFileLink(java.util.List<String> exportFileLink) {
                this.exportFileLink = exportFileLink;
                return this;
            }

            /**
             * ExportTaskId.
             */
            public Builder exportTaskId(String exportTaskId) {
                this.exportTaskId = exportTaskId;
                return this;
            }

            /**
             * PptArtifactId.
             */
            public Builder pptArtifactId(String pptArtifactId) {
                this.pptArtifactId = pptArtifactId;
                return this;
            }

            /**
             * PptProcessId.
             */
            public Builder pptProcessId(String pptProcessId) {
                this.pptProcessId = pptProcessId;
                return this;
            }

            /**
             * Query.
             */
            public Builder query(String query) {
                this.query = query;
                return this;
            }

            /**
             * TaskId.
             */
            public Builder taskId(String taskId) {
                this.taskId = taskId;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
