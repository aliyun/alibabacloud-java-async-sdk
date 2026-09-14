// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20240518.models;

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
 * {@link DownloadSemanticResultsResponseBody} extends {@link TeaModel}
 *
 * <p>DownloadSemanticResultsResponseBody</p>
 */
public class DownloadSemanticResultsResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Data")
    private Data data;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("Success")
    private Boolean success;

    private DownloadSemanticResultsResponseBody(Builder builder) {
        this.data = builder.data;
        this.requestId = builder.requestId;
        this.success = builder.success;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static DownloadSemanticResultsResponseBody create() {
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

    /**
     * @return success
     */
    public Boolean getSuccess() {
        return this.success;
    }

    public static final class Builder {
        private Data data; 
        private String requestId; 
        private Boolean success; 

        private Builder() {
        } 

        private Builder(DownloadSemanticResultsResponseBody model) {
            this.data = model.data;
            this.requestId = model.requestId;
            this.success = model.success;
        } 

        /**
         * <p>The collection of result files for the specified job run. Multiple items are returned if a single run generates multiple files.</p>
         */
        public Builder data(Data data) {
            this.data = data;
            return this;
        }

        /**
         * <p>The request ID. You can use this ID to locate logs and troubleshoot issues.</p>
         * 
         * <strong>example:</strong>
         * <p>676271D6-53B4-57BE-89FA-72F7AE1418DF</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>Indicates whether the request was successful.</p>
         */
        public Builder success(Boolean success) {
            this.success = success;
            return this;
        }

        public DownloadSemanticResultsResponseBody build() {
            return new DownloadSemanticResultsResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link DownloadSemanticResultsResponseBody} extends {@link TeaModel}
     *
     * <p>DownloadSemanticResultsResponseBody</p>
     */
    public static class Results extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("DownloadUrl")
        private String downloadUrl;

        @com.aliyun.core.annotation.NameInMap("JobName")
        private String jobName;

        @com.aliyun.core.annotation.NameInMap("JobRunId")
        private String jobRunId;

        private Results(Builder builder) {
            this.downloadUrl = builder.downloadUrl;
            this.jobName = builder.jobName;
            this.jobRunId = builder.jobRunId;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Results create() {
            return builder().build();
        }

        /**
         * @return downloadUrl
         */
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        /**
         * @return jobName
         */
        public String getJobName() {
            return this.jobName;
        }

        /**
         * @return jobRunId
         */
        public String getJobRunId() {
            return this.jobRunId;
        }

        public static final class Builder {
            private String downloadUrl; 
            private String jobName; 
            private String jobRunId; 

            private Builder() {
            } 

            private Builder(Results model) {
                this.downloadUrl = model.downloadUrl;
                this.jobName = model.jobName;
                this.jobRunId = model.jobRunId;
            } 

            /**
             * <p>The temporary pre-signed download URL of the result file. Download the file promptly by using an HTTP GET request. Do not log, share, or treat the full URL as a long-term address.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/temporary-download-url">https://example.com/temporary-download-url</a></p>
             */
            public Builder downloadUrl(String downloadUrl) {
                this.downloadUrl = downloadUrl;
                return this;
            }

            /**
             * <p>The job name to which the artifact belongs. This value is the same as the JobName in the request.</p>
             * 
             * <strong>example:</strong>
             * <p>semantic-job-demo</p>
             */
            public Builder jobName(String jobName) {
                this.jobName = jobName;
                return this;
            }

            /**
             * <p>The run ID to which the artifact belongs. You can compare this value with Data.JobRunId in the RunSemanticJob response or JobRunId in the ListSemanticJobRuns response.</p>
             * 
             * <strong>example:</strong>
             * <p>01H00000000000000000000000</p>
             */
            public Builder jobRunId(String jobRunId) {
                this.jobRunId = jobRunId;
                return this;
            }

            public Results build() {
                return new Results(this);
            } 

        } 

    }
    /**
     * 
     * {@link DownloadSemanticResultsResponseBody} extends {@link TeaModel}
     *
     * <p>DownloadSemanticResultsResponseBody</p>
     */
    public static class Data extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Results")
        private java.util.List<Results> results;

        private Data(Builder builder) {
            this.results = builder.results;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Data create() {
            return builder().build();
        }

        /**
         * @return results
         */
        public java.util.List<Results> getResults() {
            return this.results;
        }

        public static final class Builder {
            private java.util.List<Results> results; 

            private Builder() {
            } 

            private Builder(Data model) {
                this.results = model.results;
            } 

            /**
             * <p>The list of result files. Each item contains the associated job name, run ID, and a short-lived download URL.</p>
             */
            public Builder results(java.util.List<Results> results) {
                this.results = results;
                return this;
            }

            public Data build() {
                return new Data(this);
            } 

        } 

    }
}
