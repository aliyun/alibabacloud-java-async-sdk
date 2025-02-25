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
 * {@link ListAIJobResponseBody} extends {@link TeaModel}
 *
 * <p>ListAIJobResponseBody</p>
 */
public class ListAIJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("AIJobList")
    private AIJobList AIJobList;

    @com.aliyun.core.annotation.NameInMap("NonExistAIJobIds")
    private NonExistAIJobIds nonExistAIJobIds;

    @com.aliyun.core.annotation.NameInMap("RequestId")
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
         * <p>The list of jobs.</p>
         */
        public Builder AIJobList(AIJobList AIJobList) {
            this.AIJobList = AIJobList;
            return this;
        }

        /**
         * <p>The IDs of the jobs that do not exist.</p>
         */
        public Builder nonExistAIJobIds(NonExistAIJobIds nonExistAIJobIds) {
            this.nonExistAIJobIds = nonExistAIJobIds;
            return this;
        }

        /**
         * <p>The ID of the request.</p>
         * 
         * <strong>example:</strong>
         * <p>8233A0E4-E112-44*****58-2BCED1B88173</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public ListAIJobResponseBody build() {
            return new ListAIJobResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link ListAIJobResponseBody} extends {@link TeaModel}
     *
     * <p>ListAIJobResponseBody</p>
     */
    public static class AIJob extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Code")
        private String code;

        @com.aliyun.core.annotation.NameInMap("CompleteTime")
        private String completeTime;

        @com.aliyun.core.annotation.NameInMap("CreationTime")
        private String creationTime;

        @com.aliyun.core.annotation.NameInMap("Data")
        private String data;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("MediaId")
        private String mediaId;

        @com.aliyun.core.annotation.NameInMap("Message")
        private String message;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("Type")
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
             * <p>The error code. This parameter is returned if the value of Status is fail.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder code(String code) {
                this.code = code;
                return this;
            }

            /**
             * <p>The time when the job was complete. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-06-28T02:04:47Z</p>
             */
            public Builder completeTime(String completeTime) {
                this.completeTime = completeTime;
                return this;
            }

            /**
             * <p>The time when the job was created. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
             * 
             * <strong>example:</strong>
             * <p>2020-06-28T02:04:32Z</p>
             */
            public Builder creationTime(String creationTime) {
                this.creationTime = creationTime;
                return this;
            }

            /**
             * <p>The returned data. The value is a JSON string. For more information, see <a href="https://help.aliyun.com/document_detail/89863.html">AITemplateConfig</a>.</p>
             * 
             * <strong>example:</strong>
             * <p>{&quot;OrigASRData&quot;:{&quot;AsrTextList&quot;:[{&quot;EndTime&quot;:700,&quot;StartTime&quot;:0,&quot;Text&quot;:&quot;Yes.&quot;,&quot;ChannelId&quot;:0,&quot;SpeechRate&quot;:85},{&quot;EndTime&quot;:3750,&quot;StartTime&quot;:1630,&quot;Text&quot;:&quot;No.&quot;,&quot;ChannelId&quot;:0,&quot;SpeechRate&quot;:28},{&quot;EndTime&quot;:5910,&quot;StartTime&quot;:4020,&quot;Text&quot;:&quot;Of course.&quot;,&quot;ChannelId&quot;:0,&quot;SpeechRate&quot;:95},{&quot;EndTime&quot;:12750,&quot;StartTime&quot;:10090,&quot;Text&quot;:&quot;Message.&quot;,&quot;ChannelId&quot;:0,&quot;SpeechRate&quot;:45},{&quot;EndTime&quot;:25230,&quot;StartTime&quot;:13590,&quot;Text&quot;:&quot;Hello, good afternoon.&quot;,&quot;ChannelId&quot;:0,&quot;SpeechRate&quot;:20},{&quot;EndTime&quot;:30000,&quot;StartTime&quot;:28220,&quot;Text&quot;:&quot;Yes.&quot;,&quot;ChannelId&quot;:0,&quot;SpeechRate&quot;:33}],&quot;Duration&quot;:&quot;30016&quot;}}</p>
             */
            public Builder data(String data) {
                this.data = data;
                return this;
            }

            /**
             * <p>The job ID.</p>
             * 
             * <strong>example:</strong>
             * <p>a718a3a1e8bb42ee3bc88921e94****</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The ID of the video file.</p>
             * 
             * <strong>example:</strong>
             * <p>3D3D12340d9401fab46a0b847****</p>
             */
            public Builder mediaId(String mediaId) {
                this.mediaId = mediaId;
                return this;
            }

            /**
             * <p>The error message. This parameter is returned if the value of Status is fail.</p>
             * 
             * <strong>example:</strong>
             * <p>OK</p>
             */
            public Builder message(String message) {
                this.message = message;
                return this;
            }

            /**
             * <p>The status of the job. Valid values:</p>
             * <ul>
             * <li><strong>success</strong>: The job is successful.</li>
             * <li><strong>fail</strong>: The job failed.</li>
             * <li><strong>init</strong>: The job is being initialized.</li>
             * <li><strong>Processing</strong>: The job is in progress.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>success</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The type of the job. Valid values:</p>
             * <ul>
             * <li><strong>AIMediaDNA</strong>: video fingerprinting</li>
             * <li><strong>AIVideoTag</strong>: smart tagging</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>AIVideoTag</p>
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
    /**
     * 
     * {@link ListAIJobResponseBody} extends {@link TeaModel}
     *
     * <p>ListAIJobResponseBody</p>
     */
    public static class AIJobList extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("AIJob")
        private java.util.List<AIJob> AIJob;

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
        public java.util.List<AIJob> getAIJob() {
            return this.AIJob;
        }

        public static final class Builder {
            private java.util.List<AIJob> AIJob; 

            /**
             * AIJob.
             */
            public Builder AIJob(java.util.List<AIJob> AIJob) {
                this.AIJob = AIJob;
                return this;
            }

            public AIJobList build() {
                return new AIJobList(this);
            } 

        } 

    }
    /**
     * 
     * {@link ListAIJobResponseBody} extends {@link TeaModel}
     *
     * <p>ListAIJobResponseBody</p>
     */
    public static class NonExistAIJobIds extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("String")
        private java.util.List<String> string;

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
        public java.util.List<String> getString() {
            return this.string;
        }

        public static final class Builder {
            private java.util.List<String> string; 

            /**
             * String.
             */
            public Builder string(java.util.List<String> string) {
                this.string = string;
                return this;
            }

            public NonExistAIJobIds build() {
                return new NonExistAIJobIds(this);
            } 

        } 

    }
}
