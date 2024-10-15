// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20231229.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetIndexJobStatusResponseBody} extends {@link TeaModel}
 *
 * <p>GetIndexJobStatusResponseBody</p>
 */
public class GetIndexJobStatusResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Code")
    private String code;

    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("Message")
    private String message;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Status")
    private String status;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private GetIndexJobStatusResponseBody(Builder builder) {
        this.code = builder.code;
        this.data = builder.data;
        this.message = builder.message;
        this.requestId = builder.requestId;
        this.status = builder.status;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetIndexJobStatusResponseBody create() {
        return builder().build();
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
     * @return status
     */
    public String getStatus() {
        return this.status;
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
        private String message; 
        private String requestId; 
        private String status; 
        private Boolean success; 

        /**
         * <p>HTTP status code</p>
         * 
         * <strong>example:</strong>
         * <p>Index.Forbidden</p>
         */
        public Builder code(String code) {
            this.code = code;
            return this;
        }

        /**
         * <p>The returned data.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The error message.</p>
         * 
         * <strong>example:</strong>
         * <p>User not authorized to operate on the specified resource.</p>
         */
        public Builder message(String message) {
            this.message = message;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>17204B98-xxxx-4F9A-8464-2446A84821CA</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The HTTP status code returned.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        /**
         * <p>Indications whether the API call is successful. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public GetIndexJobStatusResponseBody build() {
            return new GetIndexJobStatusResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetIndexJobStatusResponseBody} extends {@link TeaModel}
     *
     * <p>GetIndexJobStatusResponseBody</p>
     */
    public static class Documents extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("DocId")
        private String docId;

        @com.aliyun.core.annotation.NameInMap("DocName")
        private String docName;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Documents(Builder builder) {
            this.code = builder.code;
            this.docId = builder.docId;
            this.docName = builder.docName;
            this.message = builder.message;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Documents create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return docId
         */
        public String getDocId() {
            return this.docId;
        }

        /**
         * @return docName
         */
        public String getDocName() {
            return this.docName;
        }

        /**
         * @return message
         */
        public String getMessage() {
            return this.message;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String code; 
            private String docId; 
            private String docName; 
            private String message; 
            private String status; 

            /**
             * <p>HTTP status code</p>
             * 
             * <strong>example:</strong>
             * <p>Index.Document.ChunkError</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The primary key ID of the document.</p>
             * 
             * <strong>example:</strong>
             * <p>file_9a65732555b54d5ea10796ca5742ba22_XXXXXXXX</p>
             */
            public Builder docId(String docId) {
                this.docId = docId;
                return this;
            }

            /**
             * <p>The name of the document.</p>
             */
            public Builder docName(String docName) {
                this.docName = docName;
                return this;
            }

            /**
             * <p>The error message.</p>
             * 
             * <strong>example:</strong>
             * <p>document parse error</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The import status of the document. Valid values:</p>
             * <ul>
             * <li>INSERT_ERROR</li>
             * <li>RUNNING</li>
             * <li>DELETED</li>
             * <li>FINISH</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>RUNNING</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Documents build() {
                return new Documents(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetIndexJobStatusResponseBody} extends {@link TeaModel}
     *
     * <p>GetIndexJobStatusResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Documents")
        private java.util.List < Documents> documents;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        private Data(Builder builder) {
            this.documents = builder.documents;
            this.jobId = builder.jobId;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return documents
         */
        public java.util.List < Documents> getDocuments() {
            return this.documents;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private java.util.List < Documents> documents; 
            private String jobId; 
            private String status; 

            /**
             * <p>The list of imported documents.</p>
             */
            public Builder documents(java.util.List < Documents> documents) {
                this.documents = documents;
                return this;
            }

            /**
             * <p>The ID of the job.</p>
             * 
             * <strong>example:</strong>
             * <p>66122af12a4e45ddae6bd6c845556647</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The status of the knowledge base job. Valid values:</p>
             * <ul>
             * <li>COMPLETED</li>
             * <li>FAILED</li>
             * <li>RUNNING</li>
             * <li>PENDING</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>PENDING</p>
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
