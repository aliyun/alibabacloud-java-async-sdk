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
 * {@link GetLiveRecordJobResponseBody} extends {@link TeaModel}
 *
 * <p>GetLiveRecordJobResponseBody</p>
 */
public class GetLiveRecordJobResponseBody extends TeaModel {
    @com.aliyun.core.annotation.NameInMap("RecordJob")
    private RecordJob recordJob;

    @com.aliyun.core.annotation.NameInMap("RequestId")
    private String requestId;

    private GetLiveRecordJobResponseBody(Builder builder) {
        this.recordJob = builder.recordJob;
        this.requestId = builder.requestId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLiveRecordJobResponseBody create() {
        return builder().build();
    }

    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return recordJob
     */
    public RecordJob getRecordJob() {
        return this.recordJob;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    public static final class Builder {
        private RecordJob recordJob; 
        private String requestId; 

        private Builder() {
        } 

        private Builder(GetLiveRecordJobResponseBody model) {
            this.recordJob = model.recordJob;
            this.requestId = model.requestId;
        } 

        /**
         * <p>The details of the recording job.</p>
         */
        public Builder recordJob(RecordJob recordJob) {
            this.recordJob = recordJob;
            return this;
        }

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>B57A046C-CE33-5FBB-B57A-D2B89ACF6907</p>
         */
        public Builder requestId(String requestId) {
            this.requestId = requestId;
            return this;
        }

        public GetLiveRecordJobResponseBody build() {
            return new GetLiveRecordJobResponseBody(this);
        } 

    } 

    /**
     * 
     * {@link GetLiveRecordJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetLiveRecordJobResponseBody</p>
     */
    public static class RecordOutput extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bucket")
        private String bucket;

        @com.aliyun.core.annotation.NameInMap("Endpoint")
        private String endpoint;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private RecordOutput(Builder builder) {
            this.bucket = builder.bucket;
            this.endpoint = builder.endpoint;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecordOutput create() {
            return builder().build();
        }

        /**
         * @return bucket
         */
        public String getBucket() {
            return this.bucket;
        }

        /**
         * @return endpoint
         */
        public String getEndpoint() {
            return this.endpoint;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String bucket; 
            private String endpoint; 
            private String type; 

            private Builder() {
            } 

            private Builder(RecordOutput model) {
                this.bucket = model.bucket;
                this.endpoint = model.endpoint;
                this.type = model.type;
            } 

            /**
             * <p>The bucket name.</p>
             * 
             * <strong>example:</strong>
             * <p>imsbucket1</p>
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * <p>The endpoint of the storage service.</p>
             * 
             * <strong>example:</strong>
             * <p>oss-cn-shanghai.aliyuncs.com</p>
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * <p>The type of the storage address.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>vod</li>
             * <li>oss</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>oss</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public RecordOutput build() {
                return new RecordOutput(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetLiveRecordJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetLiveRecordJobResponseBody</p>
     */
    public static class StreamInput extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        @com.aliyun.core.annotation.NameInMap("Url")
        private String url;

        private StreamInput(Builder builder) {
            this.type = builder.type;
            this.url = builder.url;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static StreamInput create() {
            return builder().build();
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        /**
         * @return url
         */
        public String getUrl() {
            return this.url;
        }

        public static final class Builder {
            private String type; 
            private String url; 

            private Builder() {
            } 

            private Builder(StreamInput model) {
                this.type = model.type;
                this.url = model.url;
            } 

            /**
             * <p>The type of the live stream. The value can only be rtmp.</p>
             * 
             * <strong>example:</strong>
             * <p>rtmp</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The URL of the live stream.</p>
             * 
             * <strong>example:</strong>
             * <p>rtmp://example.com/app/stream</p>
             */
            public Builder url(String url) {
                this.url = url;
                return this;
            }

            public StreamInput build() {
                return new StreamInput(this);
            } 

        } 

    }
    /**
     * 
     * {@link GetLiveRecordJobResponseBody} extends {@link TeaModel}
     *
     * <p>GetLiveRecordJobResponseBody</p>
     */
    public static class RecordJob extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("CreateTime")
        private String createTime;

        @com.aliyun.core.annotation.NameInMap("JobId")
        private String jobId;

        @com.aliyun.core.annotation.NameInMap("Name")
        private String name;

        @com.aliyun.core.annotation.NameInMap("NotifyUrl")
        private String notifyUrl;

        @com.aliyun.core.annotation.NameInMap("RecordOutput")
        private RecordOutput recordOutput;

        @com.aliyun.core.annotation.NameInMap("Status")
        private String status;

        @com.aliyun.core.annotation.NameInMap("StreamInput")
        private StreamInput streamInput;

        @com.aliyun.core.annotation.NameInMap("TemplateId")
        private String templateId;

        @com.aliyun.core.annotation.NameInMap("TemplateName")
        private String templateName;

        private RecordJob(Builder builder) {
            this.createTime = builder.createTime;
            this.jobId = builder.jobId;
            this.name = builder.name;
            this.notifyUrl = builder.notifyUrl;
            this.recordOutput = builder.recordOutput;
            this.status = builder.status;
            this.streamInput = builder.streamInput;
            this.templateId = builder.templateId;
            this.templateName = builder.templateName;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static RecordJob create() {
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
         * @return notifyUrl
         */
        public String getNotifyUrl() {
            return this.notifyUrl;
        }

        /**
         * @return recordOutput
         */
        public RecordOutput getRecordOutput() {
            return this.recordOutput;
        }

        /**
         * @return status
         */
        public String getStatus() {
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

        public static final class Builder {
            private String createTime; 
            private String jobId; 
            private String name; 
            private String notifyUrl; 
            private RecordOutput recordOutput; 
            private String status; 
            private StreamInput streamInput; 
            private String templateId; 
            private String templateName; 

            private Builder() {
            } 

            private Builder(RecordJob model) {
                this.createTime = model.createTime;
                this.jobId = model.jobId;
                this.name = model.name;
                this.notifyUrl = model.notifyUrl;
                this.recordOutput = model.recordOutput;
                this.status = model.status;
                this.streamInput = model.streamInput;
                this.templateId = model.templateId;
                this.templateName = model.templateName;
            } 

            /**
             * <p>The time when the job was created.</p>
             * <p>Use the UTC time format: yyyy-MM-ddTHH:mmZ</p>
             * 
             * <strong>example:</strong>
             * <p>2022-07-20T02:48:58Z</p>
             */
            public Builder createTime(String createTime) {
                this.createTime = createTime;
                return this;
            }

            /**
             * <p>The ID of the recording job.</p>
             * 
             * <strong>example:</strong>
             * <p>ab0e3e76-1e9d-11ed-ba64-0c42a1b73d66</p>
             */
            public Builder jobId(String jobId) {
                this.jobId = jobId;
                return this;
            }

            /**
             * <p>The name of the recording job.</p>
             */
            public Builder name(String name) {
                this.name = name;
                return this;
            }

            /**
             * <p>The callback URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://example.com/imsnotify">https://example.com/imsnotify</a></p>
             */
            public Builder notifyUrl(String notifyUrl) {
                this.notifyUrl = notifyUrl;
                return this;
            }

            /**
             * <p>The storage address of the recording.</p>
             */
            public Builder recordOutput(RecordOutput recordOutput) {
                this.recordOutput = recordOutput;
                return this;
            }

            /**
             * <p>The state of the recording job.</p>
             * <p>Valid values:</p>
             * <ul>
             * <li>paused: The job is paused.</li>
             * <li>initial: The job is not started.</li>
             * <li>started: The job is in progress.</li>
             * </ul>
             * 
             * <strong>example:</strong>
             * <p>paused</p>
             */
            public Builder status(String status) {
                this.status = status;
                return this;
            }

            /**
             * <p>The URL of the live stream.</p>
             */
            public Builder streamInput(StreamInput streamInput) {
                this.streamInput = streamInput;
                return this;
            }

            /**
             * <p>The ID of the recording template.</p>
             * 
             * <strong>example:</strong>
             * <p>69e1f9fe-1e97-11ed-ba64-0c42a1b73d66</p>
             */
            public Builder templateId(String templateId) {
                this.templateId = templateId;
                return this;
            }

            /**
             * <p>The name of the recording template.</p>
             * 
             * <strong>example:</strong>
             * <p>test template</p>
             */
            public Builder templateName(String templateName) {
                this.templateName = templateName;
                return this;
            }

            public RecordJob build() {
                return new RecordJob(this);
            } 

        } 

    }
}
