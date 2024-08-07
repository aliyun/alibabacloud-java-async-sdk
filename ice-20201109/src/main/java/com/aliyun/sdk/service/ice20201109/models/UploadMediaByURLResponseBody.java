// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UploadMediaByURLResponseBody} extends {@link TeaModel}
 *
 * <p>UploadMediaByURLResponseBody</p>
 */
public class UploadMediaByURLResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UploadJobs")
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
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * UploadJobs.
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
        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("MediaId")
        private String mediaId;

        @com.aliyun.core.annotation.NameInMap("SourceURL")
        private String sourceURL;

        private UploadJobs(Builder builder) {
            this.jobId = builder.jobId;
            this.mediaId = builder.mediaId;
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
         * @return mediaId
         */
        public String getMediaId() {
            return this.mediaId;
        }

        /**
         * @return sourceURL
         */
        public String getSourceURL() {
            return this.sourceURL;
        }

        public static final class Builder {
            private String jobId; 
            private String mediaId; 
            private String sourceURL; 

            /**
             * JobId.
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * MediaId.
             */
            public Builder mediaId(String mediaId) {
                this.mediaId = mediaId;
                return this;
            }

            /**
             * SourceURL.
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
