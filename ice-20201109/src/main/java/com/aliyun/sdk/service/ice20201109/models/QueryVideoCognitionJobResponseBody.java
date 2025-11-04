// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

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
 * {@link QueryVideoCognitionJobResponseBody} extends {@link TeaModel}
 *
 * <p>QueryVideoCognitionJobResponseBody</p>
 */
public class QueryVideoCognitionJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("JobStatus")
    private String jobStatus;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Results")
    private Results results;

    @com.aliyun.core.annotation.NameInMap("UserData")
    private String userData;

    private QueryVideoCognitionJobResponseBody(Builder builder) {
        this.jobStatus = builder.jobStatus;
        this.requestId = builder.requestId;
        this.results = builder.results;
        this.userData = builder.userData;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static QueryVideoCognitionJobResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return jobStatus
     */
    public String getJobStatus() {
        return this.jobStatus;
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
    public Results getResults() {
        return this.results;
    }

    /**
     * @return userData
     */
    public String getUserData() {
        return this.userData;
    }

    public static final class Builder {
        private String jobStatus; 
        private String requestId; 
        private Results results; 
        private String userData; 

        private Builder() {
        } 

        private Builder(QueryVideoCognitionJobResponseBody model) {
            this.jobStatus = model.jobStatus;
            this.requestId = model.requestId;
            this.results = model.results;
            this.userData = model.userData;
        } 

        /**
         * <p>The status of the task. Valid values:</p>
         * <ul>
         * <li><strong>Success</strong></li>
         * <li><strong>Fail</strong></li>
         * <li><strong>Processing</strong></li>
         * <li><strong>Submitted</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        public Builder jobStatus(String jobStatus) {
            this.jobStatus = jobStatus;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>An array of analysis result objects.</p>
         */
        public Builder results(Results results) {
            this.results = results;
            return this;
        }

        /**
         * <p>The user-defined data.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;userId&quot;:&quot;123432412831&quot;}</p>
         */
        public Builder userData(String userData) {
            this.userData = userData;
            return this;
        }

        public QueryVideoCognitionJobResponseBody build() {
            return new QueryVideoCognitionJobResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link QueryVideoCognitionJobResponseBody} extends {@link TeaModel}
     *
     * <p>QueryVideoCognitionJobResponseBody</p>
     */
    public static class Result extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Data")
        private String data;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Result(Builder builder) {
            this.data = builder.data;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Result create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public String getData() {
            return this.data;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String data; 
            private String type; 

            private Builder() {
            } 

            private Builder(Result model) {
                this.data = model.data;
                this.type = model.type;
            } 

            /**
             * <p>A JSON string containing the detailed analysis data. The structure of this data depends on the Type field. For details, see the Result parameters section below.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;title&quot;:&quot;example-title-****&quot;}</p>
             */
            public Builder data(String data) {
                this.data = data;
                return this;
            }

            /**
             * <p>The type of analysis result. Valid values:</p>
             * <ol>
             * <li>TextLabel: Tags from text content.</li>
             * <li>VideoLabel: Tags from video content.</li>
             * <li>ASR: Raw speech recognition results. Not returned by default.</li>
             * <li>OCR: Raw text recognition results. Not returned by default.</li>
             * <li>NLP: Natural Language Processing results. Not returned by default.</li>
             * <li>Process: URL to the raw algorithm output. Not returned by default.</li>
             * </ol>
             * 
             * <strong>example:</strong>
             * <p>ASR</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Result build() {
                return new Result(this);
            } 

        } 

    }
    /**
     * 
     * {@link QueryVideoCognitionJobResponseBody} extends {@link TeaModel}
     *
     * <p>QueryVideoCognitionJobResponseBody</p>
     */
    public static class Results extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("result")
        private java.util.List<Result> result;

        private Results(Builder builder) {
            this.result = builder.result;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Results create() {
            return builder().build();
        }

        /**
         * @return result
         */
        public java.util.List<Result> getResult() {
            return this.result;
        }

        public static final class Builder {
            private java.util.List<Result> result; 

            private Builder() {
            } 

            private Builder(Results model) {
                this.result = model.result;
            } 

            /**
             * result.
             */
            public Builder result(java.util.List<Result> result) {
                this.result = result;
                return this;
            }

            public Results build() {
                return new Results(this);
            } 

        } 

    }
}
