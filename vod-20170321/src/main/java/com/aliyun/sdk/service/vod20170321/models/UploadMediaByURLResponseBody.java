// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UploadMediaByURLResponseBody} extends {@link TeaModel}
 *
 * <p>UploadMediaByURLResponseBody</p>
 */
public class UploadMediaByURLResponseBody extends TeaModel {
    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("UploadJobs")
    private java.util.List < UploadJobs> uploadJobs;

    private UploadMediaByURLResponseBody(Builder builder) {
        this.requestId = builder.requestId;
        this.uploadJobs = builder.uploadJobs;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static UploadMediaByURLResponseBody create() {
        return builder().build();
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return uploadJobs
     */
    public java.util.List < UploadJobs> getUploadJobs() {
        return this.uploadJobs;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List < UploadJobs> uploadJobs; 

        /**
         * The ID of the request.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * The ID of the upload job.
         */
        public Builder uploadJobs(java.util.List < UploadJobs> uploadJobs) {
            this.uploadJobs = uploadJobs;
            return this;
        }

        public UploadMediaByURLResponseBody build() {
            return new UploadMediaByURLResponseBody(this);
        } 

    } 

    public static class UploadJobs extends TeaModel {
        @NameInMap("JobId")
        private String jobId;

        @NameInMap("SourceURL")
        private String sourceURL;

        private UploadJobs(Builder builder) {
            this.jobId = builder.jobId;
            this.sourceURL = builder.sourceURL;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static UploadJobs create() {
            return builder().build();
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return sourceURL
         */
        public String getSourceURL() {
            return this.sourceURL;
        }

        public static final class Builder {
            private String jobId; 
            private String sourceURL; 

            /**
             * The ID of the upload job.
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * The URL of the source file that is uploaded in the upload job.
             */
            public Builder sourceURL(String sourceURL) {
                this.sourceURL = sourceURL;
                return this;
            }

            public UploadJobs build() {
                return new UploadJobs(this);
            } 

        } 

    }
}
