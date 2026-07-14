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
    @com.aliyun.core.annotation.NameInMap("MediaComprehensionJob")
    private MediaComprehensionJob mediaComprehensionJob;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetMediaComprehensionJobResponseBody(Builder builder) {
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
        private MediaComprehensionJob mediaComprehensionJob; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetMediaComprehensionJobResponseBody model) {
            this.mediaComprehensionJob = model.mediaComprehensionJob;
            this.requestId = model.requestId;
        } 

        /**
         * MediaComprehensionJob.
         */
        public Builder mediaComprehensionJob(MediaComprehensionJob mediaComprehensionJob) {
            this.mediaComprehensionJob = mediaComprehensionJob;
            return this;
        }

        /**
         * RequestId.
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
             * ErrorCode.
             */
            public Builder errorCode(String errorCode) {
                this.errorCode = errorCode;
                return this;
            }

            /**
             * ErrorMessage.
             */
            public Builder errorMessage(String errorMessage) {
                this.errorMessage = errorMessage;
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
             * MediaId.
             */
            public Builder mediaId(String mediaId) {
                this.mediaId = mediaId;
                return this;
            }

            /**
             * Result.
             */
            public Builder result(String result) {
                this.result = result;
                return this;
            }

            /**
             * State.
             */
            public Builder state(String state) {
                this.state = state;
                return this;
            }

            /**
             * UserData.
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
