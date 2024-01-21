// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bailian20230601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescribeDocumentImportJobResponseBody} extends {@link TeaModel}
 *
 * <p>DescribeDocumentImportJobResponseBody</p>
 */
public class DescribeDocumentImportJobResponseBody extends TeaModel {
    @NameInMap("Docs")
    private java.util.List < Docs> docs;

    @NameInMap("JobId")
    private String jobId;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("Status")
    private String status;

    private DescribeDocumentImportJobResponseBody(Builder builder) {
        this.docs = builder.docs;
        this.jobId = builder.jobId;
        this.requestId = builder.requestId;
        this.status = builder.status;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DescribeDocumentImportJobResponseBody create() {
        return builder().build();
    }

    /**
     * @return docs
     */
    public java.util.List < Docs> getDocs() {
        return this.docs;
    }

    /**
     * @return jobId
     */
    public String getJobId() {
        return this.jobId;
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

    public static final class Builder {
        private java.util.List < Docs> docs; 
        private String jobId; 
        private String requestId; 
        private String status; 

        /**
         * Docs.
         */
        public Builder docs(java.util.List < Docs> docs) {
            this.docs = docs;
            return this;
        }

        /**
         * JobId.
         */
        public Builder jobId(String jobId) {
            this.jobId = jobId;
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
         * Status.
         */
        public Builder status(String status) {
            this.status = status;
            return this;
        }

        public DescribeDocumentImportJobResponseBody build() {
            return new DescribeDocumentImportJobResponseBody(this);
        } 

    } 

    public static class Docs extends TeaModel {
        @NameInMap("DocId")
        private String docId;

        @NameInMap("FailReason")
        private String failReason;

        @NameInMap("Name")
        private String name;

        @NameInMap("Status")
        private String status;

        private Docs(Builder builder) {
            this.docId = builder.docId;
            this.failReason = builder.failReason;
            this.name = builder.name;
            this.status = builder.status;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Docs create() {
            return builder().build();
        }

        /**
         * @return docId
         */
        public String getDocId() {
            return this.docId;
        }

        /**
         * @return failReason
         */
        public String getFailReason() {
            return this.failReason;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        public static final class Builder {
            private String docId; 
            private String failReason; 
            private String name; 
            private String status; 

            /**
             * DocId.
             */
            public Builder docId(String docId) {
                this.docId = docId;
                return this;
            }

            /**
             * FailReason.
             */
            public Builder failReason(String failReason) {
                this.failReason = failReason;
                return this;
            }

            /**
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            public Docs build() {
                return new Docs(this);
            } 

        } 

    }
}
