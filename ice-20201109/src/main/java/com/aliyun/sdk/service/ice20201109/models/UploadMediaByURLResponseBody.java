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
 * {@link UploadMediaByURLResponseBody} extends {@link TeaModel}
 *
 * <p>UploadMediaByURLResponseBody</p>
 */
public class UploadMediaByURLResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    @com.aliyun.core.annotation.NameInMap("UploadJobs")
    private java.util.List<UploadJobs> uploadJobs;

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
    public java.util.List<UploadJobs> getUploadJobs() {
        return this.uploadJobs;
    }

    public static final class Builder {
        private String requestId; 
        private java.util.List<UploadJobs> uploadJobs; 

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>83B7-7F87-4792-BFE9-63CD2137</strong></strong></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The information about upload jobs.</p>
         */
        public Builder uploadJobs(java.util.List<UploadJobs> uploadJobs) {
            this.uploadJobs = uploadJobs;
            return this;
        }

        public UploadMediaByURLResponseBody build() {
            return new UploadMediaByURLResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link UploadMediaByURLResponseBody} extends {@link TeaModel}
     *
     * <p>UploadMediaByURLResponseBody</p>
     */
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
             * <p>The ID of the upload job.</p>
             * 
             * <strong>example:</strong>
             * <p>20ce1e05dba64576b96e9683879f0***</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The ID of the media asset.</p>
             * 
             * <strong>example:</strong>
             * <p>f476988629f54a7b8a4ba90d1a6c7***</p>
             */
            public Builder mediaId(String mediaId) {
                this.mediaId = mediaId;
                return this;
            }

            /**
             * <p>The URL of the source file that is uploaded in the upload job.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://example****.mp4">http://example****.mp4</a></p>
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
