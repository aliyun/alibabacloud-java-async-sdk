// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetLiveSnapshotJobResponseBody} extends {@link TeaModel}
 *
 * <p>GetLiveSnapshotJobResponseBody</p>
 */
public class GetLiveSnapshotJobResponseBody extends TeaModel {
    @NameInMap("CallbackUrl")
    private String callbackUrl;

    @NameInMap("CreateTime")
    private String createTime;

    @NameInMap("JobId")
    private String jobId;

    @NameInMap("JobName")
    private String jobName;

    @NameInMap("LastModified")
    private String lastModified;

    @NameInMap("OverwriteFormat")
    private String overwriteFormat;

    @NameInMap("RequestId")
    private String requestId;

    @NameInMap("SequenceFormat")
    private String sequenceFormat;

    @NameInMap("SnapshotOutput")
    private SnapshotOutput snapshotOutput;

    @NameInMap("Status")
    private String status;

    @NameInMap("StreamInput")
    private StreamInput streamInput;

    @NameInMap("TemplateId")
    private String templateId;

    @NameInMap("TemplateName")
    private String templateName;

    @NameInMap("TimeInterval")
    private Integer timeInterval;

    private GetLiveSnapshotJobResponseBody(Builder builder) {
        this.callbackUrl = builder.callbackUrl;
        this.createTime = builder.createTime;
        this.jobId = builder.jobId;
        this.jobName = builder.jobName;
        this.lastModified = builder.lastModified;
        this.overwriteFormat = builder.overwriteFormat;
        this.requestId = builder.requestId;
        this.sequenceFormat = builder.sequenceFormat;
        this.snapshotOutput = builder.snapshotOutput;
        this.status = builder.status;
        this.streamInput = builder.streamInput;
        this.templateId = builder.templateId;
        this.templateName = builder.templateName;
        this.timeInterval = builder.timeInterval;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static GetLiveSnapshotJobResponseBody create() {
        return builder().build();
    }

    /**
     * @return callbackUrl
     */
    public String getCallbackUrl() {
        return this.callbackUrl;
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
     * @return jobName
     */
    public String getJobName() {
        return this.jobName;
    }

    /**
     * @return lastModified
     */
    public String getLastModified() {
        return this.lastModified;
    }

    /**
     * @return overwriteFormat
     */
    public String getOverwriteFormat() {
        return this.overwriteFormat;
    }

    /**
     * @return requestId
     */
    public String getRequestId() {
        return this.requestId;
    }

    /**
     * @return sequenceFormat
     */
    public String getSequenceFormat() {
        return this.sequenceFormat;
    }

    /**
     * @return snapshotOutput
     */
    public SnapshotOutput getSnapshotOutput() {
        return this.snapshotOutput;
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

    /**
     * @return timeInterval
     */
    public Integer getTimeInterval() {
        return this.timeInterval;
    }

    public static final class Builder {
        private String callbackUrl; 
        private String createTime; 
        private String jobId; 
        private String jobName; 
        private String lastModified; 
        private String overwriteFormat; 
        private String requestId; 
        private String sequenceFormat; 
        private SnapshotOutput snapshotOutput; 
        private String status; 
        private StreamInput streamInput; 
        private String templateId; 
        private String templateName; 
        private Integer timeInterval; 

        /**
         * CallbackUrl.
         */
        public Builder callbackUrl(String callbackUrl) {
            this.callbackUrl = callbackUrl;
            return this;
        }

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
         * JobName.
         */
        public Builder jobName(String jobName) {
            this.jobName = jobName;
            return this;
        }

        /**
         * LastModified.
         */
        public Builder lastModified(String lastModified) {
            this.lastModified = lastModified;
            return this;
        }

        /**
         * OverwriteFormat.
         */
        public Builder overwriteFormat(String overwriteFormat) {
            this.overwriteFormat = overwriteFormat;
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
         * SequenceFormat.
         */
        public Builder sequenceFormat(String sequenceFormat) {
            this.sequenceFormat = sequenceFormat;
            return this;
        }

        /**
         * SnapshotOutput.
         */
        public Builder snapshotOutput(SnapshotOutput snapshotOutput) {
            this.snapshotOutput = snapshotOutput;
            return this;
        }

        /**
         * Status.
         */
        public Builder status(String status) {
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
         * TimeInterval.
         */
        public Builder timeInterval(Integer timeInterval) {
            this.timeInterval = timeInterval;
            return this;
        }

        public GetLiveSnapshotJobResponseBody build() {
            return new GetLiveSnapshotJobResponseBody(this);
        } 

    } 

    public static class SnapshotOutput extends TeaModel {
        @NameInMap("Bucket")
        private String bucket;

        @NameInMap("Endpoint")
        private String endpoint;

        @NameInMap("StorageType")
        private String storageType;

        private SnapshotOutput(Builder builder) {
            this.bucket = builder.bucket;
            this.endpoint = builder.endpoint;
            this.storageType = builder.storageType;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static SnapshotOutput create() {
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
         * @return storageType
         */
        public String getStorageType() {
            return this.storageType;
        }

        public static final class Builder {
            private String bucket; 
            private String endpoint; 
            private String storageType; 

            /**
             * Bucket.
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * Endpoint.
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * StorageType.
             */
            public Builder storageType(String storageType) {
                this.storageType = storageType;
                return this;
            }

            public SnapshotOutput build() {
                return new SnapshotOutput(this);
            } 

        } 

    }
    public static class StreamInput extends TeaModel {
        @NameInMap("Type")
        private String type;

        @NameInMap("Url")
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

            /**
             * Type.
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * Url.
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
}
