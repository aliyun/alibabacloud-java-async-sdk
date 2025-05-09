// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

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

    public Builder toBuilder() {
        return new Builder(this);
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

        private Builder() {
        } 

        private Builder(UploadMediaByURLResponseBody model) {
            this.requestId = model.requestId;
            this.uploadJobs = model.uploadJobs;
        } 

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>25818875-5F78-4AF6-D7393642CA58****</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * <p>The ID of the upload job.</p>
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

        @com.aliyun.core.annotation.NameInMap("SourceURL")
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

            private Builder() {
            } 

            private Builder(UploadJobs model) {
                this.jobId = model.jobId;
                this.sourceURL = model.sourceURL;
            } 

            /**
             * <p>The ID of the upload job.</p>
             * 
             * <strong>example:</strong>
             * <p>ad90a501b1b94fb72374ad005046****</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
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
