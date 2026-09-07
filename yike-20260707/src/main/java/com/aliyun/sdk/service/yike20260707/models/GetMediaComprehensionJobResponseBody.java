// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.yike20260707.models;

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
 * {@link GetMediaComprehensionJobResponseBody} extends {@link TeaModel}
 *
 * <p>GetMediaComprehensionJobResponseBody</p>
 */
public class GetMediaComprehensionJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Job")
    private Job job;

    @com.aliyun.core.annotation.NameInMap("MediaComprehensionJob")
    private MediaComprehensionJob mediaComprehensionJob;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetMediaComprehensionJobResponseBody(Builder builder) {
        this.job = builder.job;
        this.mediaComprehensionJob = builder.mediaComprehensionJob;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetMediaComprehensionJobResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return job
     */
    public Job getJob() {
        return this.job;
    }

    /**
     * @return mediaComprehensionJob
     */
    public MediaComprehensionJob getMediaComprehensionJob() {
        return this.mediaComprehensionJob;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Job job; 
        private MediaComprehensionJob mediaComprehensionJob; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetMediaComprehensionJobResponseBody model) {
            this.job = model.job;
            this.mediaComprehensionJob = model.mediaComprehensionJob;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The media asset content understanding result object.</p>
         */
        public Builder job(Job job) {
            this.job = job;
            return this;
        }

        /**
         * <p>The media asset content understanding object. This parameter is deprecated.</p>
         */
        public Builder mediaComprehensionJob(MediaComprehensionJob mediaComprehensionJob) {
            this.mediaComprehensionJob = mediaComprehensionJob;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong><strong>3B-0E1A-586A-AC29-742247</strong></strong></strong></p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetMediaComprehensionJobResponseBody build() {
            return new GetMediaComprehensionJobResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetMediaComprehensionJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetMediaComprehensionJobResponseBody</p>
     */
    public static class Job extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("MediaIds")
        private java.util.List<String> mediaIds;

        @com.aliyun.core.annotation.NameInMap("Result")
        private String result;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("UserData")
        private String userData;

        private Job(Builder builder) {
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
            this.mediaIds = builder.mediaIds;
            this.result = builder.result;
            this.status = builder.status;
            this.userData = builder.userData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Job create() {
            return builder().build();
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
        }

        /**
         * @return mediaIds
         */
        public java.util.List<String> getMediaIds() {
            return this.mediaIds;
        }

        /**
         * @return result
         */
        public String getResult() {
            return this.result;
        }

        /**
         * @return status
         */
        public String getStatus() {
            return this.status;
        }

        /**
         * @return userData
         */
        public String getUserData() {
            return this.userData;
        }

        public static final class Builder {
            private String errorCode; 
            private String errorMessage; 
            private java.util.List<String> mediaIds; 
            private String result; 
            private String status; 
            private String userData; 

            private Builder() {
            } 

            private Builder(Job model) {
                this.errorCode = model.errorCode;
                this.errorMessage = model.errorMessage;
                this.mediaIds = model.mediaIds;
                this.result = model.result;
                this.status = model.status;
                this.userData = model.userData;
            } 

            /**
             * <p>The error code. This parameter is returned when the job is in the Failed state.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The error message. This parameter is returned when the job is in the Failed state.</p>
             * 
             * <strong>example:</strong>
             * <p>The specified product does not exist.</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The list of media asset IDs. If the input is a URL, the media asset ID registered after input is returned.</p>
             */
            public Builder mediaIds(java.util.List<String> mediaIds) {
                this.mediaIds = mediaIds;
                return this;
            }

            /**
             * <p>The URL of the analysis result file. The file content is in JSON format.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="http://xxxx.json">http://xxxx.json</a></p>
             */
            public Builder result(String result) {
                this.result = result;
                return this;
            }

            /**
             * <p>The file status. Valid values:</p>
             * <ul>
             * <li><strong>Created</strong>: Created.</li>
             * <li><strong>Executing</strong>: Executing.</li>
             * <li><strong>Finished</strong>: Finished.</li>
             * <li><strong>Failed</strong>: Failed.</li>
             * <li><strong>Deleted</strong>: Deleted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Executing</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The user-defined parameter, which is a JSON-formatted string.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;NotifyAddress&quot;: &quot;<a href="http://xxx.callback.url%22%7D">http://xxx.callback.url&quot;}</a></p>
             */
            public Builder userData(String userData) {
                this.userData = userData;
                return this;
            }

            public Job build() {
                return new Job(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetMediaComprehensionJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetMediaComprehensionJobResponseBody</p>
     */
    public static class MediaComprehensionJob extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("ErrorCode")
        private String errorCode;

        @com.aliyun.core.annotation.NameInMap("ErrorMessage")
        private String errorMessage;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("MediaId")
        private String mediaId;

        @com.aliyun.core.annotation.NameInMap("Result")
        private String result;

        @com.aliyun.core.annotation.NameInMap("State")
        private String state;

        @com.aliyun.core.annotation.NameInMap("UserData")
        private String userData;

        private MediaComprehensionJob(Builder builder) {
            this.errorCode = builder.errorCode;
            this.errorMessage = builder.errorMessage;
            this.jobId = builder.jobId;
            this.mediaId = builder.mediaId;
            this.result = builder.result;
            this.state = builder.state;
            this.userData = builder.userData;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static MediaComprehensionJob create() {
            return builder().build();
        }

        /**
         * @return errorCode
         */
        public String getErrorCode() {
            return this.errorCode;
        }

        /**
         * @return errorMessage
         */
        public String getErrorMessage() {
            return this.errorMessage;
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
         * @return result
         */
        public String getResult() {
            return this.result;
        }

        /**
         * @return state
         */
        public String getState() {
            return this.state;
        }

        /**
         * @return userData
         */
        public String getUserData() {
            return this.userData;
        }

        public static final class Builder {
            private String errorCode; 
            private String errorMessage; 
            private String jobId; 
            private String mediaId; 
            private String result; 
            private String state; 
            private String userData; 

            private Builder() {
            } 

            private Builder(MediaComprehensionJob model) {
                this.errorCode = model.errorCode;
                this.errorMessage = model.errorMessage;
                this.jobId = model.jobId;
                this.mediaId = model.mediaId;
                this.result = model.result;
                this.state = model.state;
                this.userData = model.userData;
            } 

            /**
             * <p>The error code. This parameter is returned when the job is in the <code>Failed</code> state.</p>
             * 
             * <strong>example:</strong>
             * <p>200</p>
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * <p>The error message. This parameter is returned when the job is in the Failed state.</p>
             * 
             * <strong>example:</strong>
             * <p>The specified product does not exist.</p>
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
                return this;
            }

            /**
             * <p>The job ID.</p>
             * 
             * <strong>example:</strong>
             * <p><strong><strong><strong>afaa6f37457</strong></strong></strong></p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The media asset ID.</p>
             * 
             * <strong>example:</strong>
             * <p><strong><strong><strong>307e9971f1</strong></strong></strong></p>
             */
            public Builder mediaId(String mediaId) {
                this.mediaId = mediaId;
                return this;
            }

            /**
             * <p>The analysis result, which is a JSON string.</p>
             * 
             * <strong>example:</strong>
             * <p>&quot;{\&quot;source_video_url\&quot;:\&quot;<a href="http://xxx.mp4%5C%5C%22,%5C%5C%22narrative_overview%5C%5C%22:%7B******%7D%7D">http://xxx.mp4\\&quot;,\\&quot;narrative_overview\\&quot;:{******}}</a>&quot;</p>
             */
            public Builder result(String result) {
                this.result = result;
                return this;
            }

            /**
             * <p>The file status. Valid values:</p>
             * <ul>
             * <li><strong>Created</strong>: Created.</li>
             * <li><strong>Executing</strong>: Executing.</li>
             * <li><strong>Finished</strong>: Finished.</li>
             * <li><strong>Failed</strong>: Failed.</li>
             * <li><strong>Deleted</strong>: Deleted.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>Executing</p>
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * <p>The user-defined parameter, which is a JSON-formatted string.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;NotifyAddress&quot;: &quot;<a href="http://xxx.callback.url%22%7D">http://xxx.callback.url&quot;}</a></p>
             */
            public Builder userData(String userData) {
                this.userData = userData;
                return this;
            }

            public MediaComprehensionJob build() {
                return new MediaComprehensionJob(this);
            } 

        } 

    }
}
