// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * 
 * {@link GetLiveTranscodeJobResponseBody} extends {@link TeaModel}
 *
 * <p>GetLiveTranscodeJobResponseBody</p>
 */
public class GetLiveTranscodeJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("Job")
    private Job job;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetLiveTranscodeJobResponseBody(Builder builder) {
        this.job = builder.job;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLiveTranscodeJobResponseBody create() {
        return builder().build();
    }

    /**
     * @return job
     */
    public Job getJob() {
        return this.job;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private Job job; 
        private String requestId; 

        /**
         * <p>The information about the transcoding job.</p>
         */
        public Builder job(Job job) {
            this.job = job;
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

        public GetLiveTranscodeJobResponseBody build() {
            return new GetLiveTranscodeJobResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetLiveTranscodeJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetLiveTranscodeJobResponseBody</p>
     */
    public static class StreamInfos extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("OutputUrl")
        private String outputUrl;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private StreamInfos(Builder builder) {
            this.outputUrl = builder.outputUrl;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StreamInfos create() {
            return builder().build();
        }

        /**
         * @return outputUrl
         */
        public String getOutputUrl() {
            return this.outputUrl;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String outputUrl; 
            private String type; 

            /**
             * <p>The URL of the output stream.</p>
             * 
             * <strong>example:</strong>
             * <p>rtmp://mydomain/app/mytranscode1</p>
             */
            public Builder outputUrl(String outputUrl) {
                this.outputUrl = outputUrl;
                return this;
            }

            /**
             * <p>The type of the output stream protocol. Only the RTMP protocol is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>rtmp</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public StreamInfos build() {
                return new StreamInfos(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetLiveTranscodeJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetLiveTranscodeJobResponseBody</p>
     */
    public static class OutputStream extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("StreamInfos")
        private java.util.List < StreamInfos> streamInfos;

        private OutputStream(Builder builder) {
            this.streamInfos = builder.streamInfos;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static OutputStream create() {
            return builder().build();
        }

        /**
         * @return streamInfos
         */
        public java.util.List < StreamInfos> getStreamInfos() {
            return this.streamInfos;
        }

        public static final class Builder {
            private java.util.List < StreamInfos> streamInfos; 

            /**
             * <p>The information about the output stream.</p>
             */
            public Builder streamInfos(java.util.List < StreamInfos> streamInfos) {
                this.streamInfos = streamInfos;
                return this;
            }

            public OutputStream build() {
                return new OutputStream(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetLiveTranscodeJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetLiveTranscodeJobResponseBody</p>
     */
    public static class StreamInput extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("InputUrl")
        private String inputUrl;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private StreamInput(Builder builder) {
            this.inputUrl = builder.inputUrl;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StreamInput create() {
            return builder().build();
        }

        /**
         * @return inputUrl
         */
        public String getInputUrl() {
            return this.inputUrl;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String inputUrl; 
            private String type; 

            /**
             * <p>The URL of the input stream.</p>
             * 
             * <strong>example:</strong>
             * <p>rtmp://mydomain/app/stream1</p>
             */
            public Builder inputUrl(String inputUrl) {
                this.inputUrl = inputUrl;
                return this;
            }

            /**
             * <p>The type of the input stream.</p>
             * 
             * <strong>example:</strong>
             * <p>rtmp</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public StreamInput build() {
                return new StreamInput(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetLiveTranscodeJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetLiveTranscodeJobResponseBody</p>
     */
    public static class Job extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("OutputStream")
        private OutputStream outputStream;

        @com.aliyun.core.annotation.NameInMap("StartMode")
        private Integer startMode;

        @com.aliyun.core.annotation.NameInMap("Status")
        private Integer status;

        @com.aliyun.core.annotation.NameInMap("StreamInput")
        private StreamInput streamInput;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private String templateId;

        @com.aliyun.core.annotation.NameInMap("TemplateName")
        private String templateName;

        @com.aliyun.core.annotation.NameInMap("TemplateType")
        private String templateType;

        private Job(Builder builder) {
            this.createTime = builder.createTime;
            this.jobId = builder.jobId;
            this.name = builder.name;
            this.outputStream = builder.outputStream;
            this.startMode = builder.startMode;
            this.status = builder.status;
            this.streamInput = builder.streamInput;
            this.templateId = builder.templateId;
            this.templateName = builder.templateName;
            this.templateType = builder.templateType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Job create() {
            return builder().build();
        }

        /**
         * @return createTime
         */
        public String getCreateTime() {
            return this.createTime;
        }

        /**
         * @return jobId
         */
        public String getJobId() {
            return this.jobId;
        }

        /**
         * @return name
         */
        public String getName() {
            return this.name;
        }

        /**
         * @return outputStream
         */
        public OutputStream getOutputStream() {
            return this.outputStream;
        }

        /**
         * @return startMode
         */
        public Integer getStartMode() {
            return this.startMode;
        }

        /**
         * @return status
         */
        public Integer getStatus() {
            return this.status;
        }

        /**
         * @return streamInput
         */
        public StreamInput getStreamInput() {
            return this.streamInput;
        }

        /**
         * @return templateId
         */
        public String getTemplateId() {
            return this.templateId;
        }

        /**
         * @return templateName
         */
        public String getTemplateName() {
            return this.templateName;
        }

        /**
         * @return templateType
         */
        public String getTemplateType() {
            return this.templateType;
        }

        public static final class Builder {
            private String createTime; 
            private String jobId; 
            private String name; 
            private OutputStream outputStream; 
            private Integer startMode; 
            private Integer status; 
            private StreamInput streamInput; 
            private String templateId; 
            private String templateName; 
            private String templateType; 

            /**
             * <p>The time when the job was created.</p>
             * 
             * <strong>example:</strong>
             * <p>2022-07-20T02:48:58Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The ID of the transcoding job.</p>
             * 
             * <strong>example:</strong>
             * <p><strong><strong>20b48fb04483915d4f2cd8ac</strong></strong></p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The name of the transcoding job.</p>
             * 
             * <strong>example:</strong>
             * <p>task1</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The information about the output stream.</p>
             */
            public Builder outputStream(OutputStream outputStream) {
                this.outputStream = outputStream;
                return this;
            }

            /**
             * <p>The start mode of the job.</p>
             * 
             * <strong>example:</strong>
             * <p>0</p>
             */
            public Builder startMode(Integer startMode) {
                this.startMode = startMode;
                return this;
            }

            /**
             * <p>The state of the job.</p>
             * <ul>
             * <li>0: The job is not started.</li>
             * <li>1: The job is in progress.</li>
             * <li>2: The job is stopped.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>1</p>
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The information about the input stream.</p>
             */
            public Builder streamInput(StreamInput streamInput) {
                this.streamInput = streamInput;
                return this;
            }

            /**
             * <p>The template ID.</p>
             * 
             * <strong>example:</strong>
             * <p>b6491d5b3e514b7d895d14b5453ea119</p>
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * <p>The template name.</p>
             * 
             * <strong>example:</strong>
             * <p>basic</p>
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            /**
             * <p>The type of the template.</p>
             * 
             * <strong>example:</strong>
             * <p>normal</p>
             */
            public Builder templateType(String templateType) {
                this.templateType = templateType;
                return this;
            }

            public Job build() {
                return new Job(this);
            } 

        } 

    }
}
