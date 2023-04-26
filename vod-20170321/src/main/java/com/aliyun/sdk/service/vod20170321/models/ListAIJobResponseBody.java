// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAIJobResponseBody} extends {@link TeaModel}
 *
 * <p>ListAIJobResponseBody</p>
 */
public class ListAIJobResponseBody extends TeaModel {
    @NameInMap("AIJobList")
    private AIJobList AIJobList;

    @NameInMap("NonExistAIJobIds")
    private NonExistAIJobIds nonExistAIJobIds;

    @NameInMap("RequestId")
    private String requestId;

    private ListAIJobResponseBody(Builder builder) {
        this.AIJobList = builder.AIJobList;
        this.nonExistAIJobIds = builder.nonExistAIJobIds;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListAIJobResponseBody create() {
        return builder().build();
    }

    /**
     * @return AIJobList
     */
    public AIJobList getAIJobList() {
        return this.AIJobList;
    }

    /**
     * @return nonExistAIJobIds
     */
    public NonExistAIJobIds getNonExistAIJobIds() {
        return this.nonExistAIJobIds;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private AIJobList AIJobList; 
        private NonExistAIJobIds nonExistAIJobIds; 
        private String requestId; 

        /**
         * The list of job IDs. You can obtain the job ID from the PlayInfo parameter in the response to the [GetPlayInfo](~~56124~~) operation.
         * <p>
         * 
         * >  You can specify a maximum of 10 job IDs in a request. Separate multiple IDs with commas (,).
         */
        public Builder AIJobList(AIJobList AIJobList) {
            this.AIJobList = AIJobList;
            return this;
        }

        /**
         * The error code. This parameter is returned if the value of Status is fail.
         */
        public Builder nonExistAIJobIds(NonExistAIJobIds nonExistAIJobIds) {
            this.nonExistAIJobIds = nonExistAIJobIds;
            return this;
        }

        /**
         * The ID of the job.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListAIJobResponseBody build() {
            return new ListAIJobResponseBody(this);
        } 

    } 

    public static class AIJob extends TeaModel {
        @NameInMap("Code")
        private String code;

        @NameInMap("CompleteTime")
        private String completeTime;

        @NameInMap("CreationTime")
        private String creationTime;

        @NameInMap("Data")
        private String data;

        @NameInMap("JobId")
        private String jobId;

        @NameInMap("MediaId")
        private String mediaId;

        @NameInMap("Message")
        private String message;

        @NameInMap("Status")
        private String status;

        @NameInMap("Type")
        private String type;

        private AIJob(Builder builder) {
            this.code = builder.code;
            this.completeTime = builder.completeTime;
            this.creationTime = builder.creationTime;
            this.data = builder.data;
            this.jobId = builder.jobId;
            this.mediaId = builder.mediaId;
            this.message = builder.message;
            this.status = builder.status;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AIJob create() {
            return builder().build();
        }

        /**
         * @return code
         */
        public String getCode() {
            return this.code;
        }

        /**
         * @return completeTime
         */
        public String getCompleteTime() {
            return this.completeTime;
        }

        /**
         * @return creationTime
         */
        public String getCreationTime() {
            return this.creationTime;
        }

        /**
         * @return data
         */
        public String getData() {
            return this.data;
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

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String code; 
            private String completeTime; 
            private String creationTime; 
            private String data; 
            private String jobId; 
            private String mediaId; 
            private String message; 
            private String status; 
            private String type; 

            /**
             * Queries AI jobs. After a job is submitted, ApsaraVideo VOD asynchronously processes the job. You can call this operation to query the job information in real time.
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * The ID of the request.
             */
            public Builder completeTime(String completeTime) {
                this.completeTime = completeTime;
                return this;
            }

            /**
             * The status of the job. Valid values:
             * <p>
             * 
             * *   **success**: The job is complete.
             * *   **fail**: The job failed.
             * *   **init**: The job is being initialized.
             * *   **Processing**: The job is in progress.
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * {"OrigASRData":{"AsrTextList":\[{"EndTime":700,"StartTime":0,"Text":"Yes.","ChannelId":0,"SpeechRate":85},{"EndTime":3750,"StartTime":1630,"Text":"No.","ChannelId":0,"SpeechRate":28},{"EndTime":5910,"StartTime":4020,"Text":"Of course.","ChannelId":0,"SpeechRate":95},{"EndTime":12750,"StartTime":10090,"Text":"Message.","ChannelId":0,"SpeechRate":45},{"EndTime":25230,"StartTime":13590,"Text":"Hello, good afternoon.","ChannelId":0,"SpeechRate":20},{"EndTime":30000,"StartTime":28220,"Text":"Yes.","ChannelId":0,"SpeechRate":33}],"Duration":"30016"}}
             */
            public Builder data(String data) {
                this.data = data;
                return this;
            }

            /**
             * The ID of the video.
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
             * Message.
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * The error message. This parameter is returned if the value of Status is fail.
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * The returned data. The value is a JSON string.
             * <p>
             * 
             * For more information, see [AITemplateConfig](~~89863~~).
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public AIJob build() {
                return new AIJob(this);
            } 

        } 

    }
    public static class AIJobList extends TeaModel {
        @NameInMap("AIJob")
        private java.util.List < AIJob> AIJob;

        private AIJobList(Builder builder) {
            this.AIJob = builder.AIJob;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static AIJobList create() {
            return builder().build();
        }

        /**
         * @return AIJob
         */
        public java.util.List < AIJob> getAIJob() {
            return this.AIJob;
        }

        public static final class Builder {
            private java.util.List < AIJob> AIJob; 

            /**
             * AIJob.
             */
            public Builder AIJob(java.util.List < AIJob> AIJob) {
                this.AIJob = AIJob;
                return this;
            }

            public AIJobList build() {
                return new AIJobList(this);
            } 

        } 

    }
    public static class NonExistAIJobIds extends TeaModel {
        @NameInMap("String")
        private java.util.List < String > string;

        private NonExistAIJobIds(Builder builder) {
            this.string = builder.string;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static NonExistAIJobIds create() {
            return builder().build();
        }

        /**
         * @return string
         */
        public java.util.List < String > getString() {
            return this.string;
        }

        public static final class Builder {
            private java.util.List < String > string; 

            /**
             * String.
             */
            public Builder string(java.util.List < String > string) {
                this.string = string;
                return this;
            }

            public NonExistAIJobIds build() {
                return new NonExistAIJobIds(this);
            } 

        } 

    }
}
