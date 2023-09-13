// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListLiveTranscodeJobsResponseBody} extends {@link TeaModel}
 *
 * <p>ListLiveTranscodeJobsResponseBody</p>
 */
public class ListLiveTranscodeJobsResponseBody extends TeaModel {
    @NameInMap("JobList")
    private java.util.List < JobList> jobList;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("TotalCount")
    private Integer totalCount;

    private ListLiveTranscodeJobsResponseBody(Builder builder) {
        this.jobList = builder.jobList;
        this.requestId = builder.requestId;
        this.totalCount = builder.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static ListLiveTranscodeJobsResponseBody create() {
        return builder().build();
    }

    /**
     * @return jobList
     */
    public java.util.List < JobList> getJobList() {
        return this.jobList;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return totalCount
     */
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static final class Builder {
        private java.util.List < JobList> jobList; 
        private String requestId; 
        private Integer totalCount; 

        /**
         * JobList.
         */
        public Builder jobList(java.util.List < JobList> jobList) {
            this.jobList = jobList;
            return this;
        }

        /**
         * RequestId.
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        /**
         * TotalCount.
         */
        public Builder totalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }

        public ListLiveTranscodeJobsResponseBody build() {
            return new ListLiveTranscodeJobsResponseBody(this);
        } 

    } 

    public static class StreamInfos extends TeaModel {
        @NameInMap("OutputUrl")
        private String outputUrl;

        @NameInMap("Type")
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
             * OutputUrl.
             */
            public Builder outputUrl(String outputUrl) {
                this.outputUrl = outputUrl;
                return this;
            }

            /**
             * Type.
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
    public static class OutputStream extends TeaModel {
        @NameInMap("StreamInfos")
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
             * StreamInfos.
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
    public static class StreamInput extends TeaModel {
        @NameInMap("InputUrl")
        private String inputUrl;

        @NameInMap("Type")
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
             * InputUrl.
             */
            public Builder inputUrl(String inputUrl) {
                this.inputUrl = inputUrl;
                return this;
            }

            /**
             * Type.
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
    public static class JobList extends TeaModel {
        @NameInMap("CreateTime")
        private String createTime;

        @NameInMap("JobId")
        private String jobId;

        @NameInMap("Name")
        private String name;

        @NameInMap("OutputStream")
        private OutputStream outputStream;

        @NameInMap("StartMode")
        private Integer startMode;

        @NameInMap("Status")
        private Integer status;

        @NameInMap("StreamInput")
        private StreamInput streamInput;

        @NameInMap("TemplateId")
        private String templateId;

        @NameInMap("TemplateName")
        private String templateName;

        @NameInMap("TemplateType")
        private String templateType;

        private JobList(Builder builder) {
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

        public static JobList create() {
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
             * CreateTime.
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
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
             * Name.
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * OutputStream.
             */
            public Builder outputStream(OutputStream outputStream) {
                this.outputStream = outputStream;
                return this;
            }

            /**
             * StartMode.
             */
            public Builder startMode(Integer startMode) {
                this.startMode = startMode;
                return this;
            }

            /**
             * Status.
             */
            public Builder status(Integer status) {
                this.status = status;
                return this;
            }

            /**
             * StreamInput.
             */
            public Builder streamInput(StreamInput streamInput) {
                this.streamInput = streamInput;
                return this;
            }

            /**
             * TemplateId.
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * TemplateName.
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            /**
             * TemplateType.
             */
            public Builder templateType(String templateType) {
                this.templateType = templateType;
                return this;
            }

            public JobList build() {
                return new JobList(this);
            } 

        } 

    }
}
