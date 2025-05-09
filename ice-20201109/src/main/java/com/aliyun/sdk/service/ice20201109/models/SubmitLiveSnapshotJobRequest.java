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
 * {@link SubmitLiveSnapshotJobRequest} extends {@link RequestModel}
 *
 * <p>SubmitLiveSnapshotJobRequest</p>
 */
public class SubmitLiveSnapshotJobRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("CallbackUrl")
    private String callbackUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("JobName")
    @com.aliyun.core.annotation.Validation(required = true)
    private String jobName;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("SnapshotOutput")
    @com.aliyun.core.annotation.Validation(required = true)
    private SnapshotOutput snapshotOutput;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StreamInput")
    @com.aliyun.core.annotation.Validation(required = true)
    private StreamInput streamInput;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateId;

    private SubmitLiveSnapshotJobRequest(Builder builder) {
        super(builder);
        this.callbackUrl = builder.callbackUrl;
        this.jobName = builder.jobName;
        this.snapshotOutput = builder.snapshotOutput;
        this.streamInput = builder.streamInput;
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitLiveSnapshotJobRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return callbackUrl
     */
    public String getCallbackUrl() {
        return this.callbackUrl;
    }

    /**
     * @return jobName
     */
    public String getJobName() {
        return this.jobName;
    }

    /**
     * @return snapshotOutput
     */
    public SnapshotOutput getSnapshotOutput() {
        return this.snapshotOutput;
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

    public static final class Builder extends Request.Builder<SubmitLiveSnapshotJobRequest, Builder> {
        private String callbackUrl; 
        private String jobName; 
        private SnapshotOutput snapshotOutput; 
        private StreamInput streamInput; 
        private String templateId; 

        private Builder() {
            super();
        } 

        private Builder(SubmitLiveSnapshotJobRequest request) {
            super(request);
            this.callbackUrl = request.callbackUrl;
            this.jobName = request.jobName;
            this.snapshotOutput = request.snapshotOutput;
            this.streamInput = request.streamInput;
            this.templateId = request.templateId;
        } 

        /**
         * <p>The snapshot callback URL.</p>
         * <ul>
         * <li>It cannot exceed 255 characters in length.</li>
         * <li>Both HTTP and HTTPS URLs are supported.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.aliyun.com/snapshot/callback">http://www.aliyun.com/snapshot/callback</a></p>
         */
        public Builder callbackUrl(String callbackUrl) {
            this.putBodyParameter("CallbackUrl", callbackUrl);
            this.callbackUrl = callbackUrl;
            return this;
        }

        /**
         * <p>The name of the job.</p>
         * <ul>
         * <li>It cannot exceed 128 characters in length.</li>
         * </ul>
         * <p>This parameter is required.</p>
         */
        public Builder jobName(String jobName) {
            this.putBodyParameter("JobName", jobName);
            this.jobName = jobName;
            return this;
        }

        /**
         * <p>The information about the output snapshot.</p>
         * <p>This parameter is required.</p>
         */
        public Builder snapshotOutput(SnapshotOutput snapshotOutput) {
            String snapshotOutputShrink = shrink(snapshotOutput, "SnapshotOutput", "json");
            this.putBodyParameter("SnapshotOutput", snapshotOutputShrink);
            this.snapshotOutput = snapshotOutput;
            return this;
        }

        /**
         * <p>The information about the input stream.</p>
         * <p>This parameter is required.</p>
         */
        public Builder streamInput(StreamInput streamInput) {
            String streamInputShrink = shrink(streamInput, "StreamInput", "json");
            this.putBodyParameter("StreamInput", streamInputShrink);
            this.streamInput = streamInput;
            return this;
        }

        /**
         * <p>The template ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>a046-263c-3560-978a-fb287782</strong></strong></p>
         */
        public Builder templateId(String templateId) {
            this.putBodyParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        @Override
        public SubmitLiveSnapshotJobRequest build() {
            return new SubmitLiveSnapshotJobRequest(this);
        } 

    } 

    /**
     * 
     * {@link SubmitLiveSnapshotJobRequest} extends {@link TeaModel}
     *
     * <p>SubmitLiveSnapshotJobRequest</p>
     */
    public static class SnapshotOutput extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bucket")
        @com.aliyun.core.annotation.Validation(required = true)
        private String bucket;

        @com.aliyun.core.annotation.NameInMap("Endpoint")
        @com.aliyun.core.annotation.Validation(required = true)
        private String endpoint;

        @com.aliyun.core.annotation.NameInMap("StorageType")
        @com.aliyun.core.annotation.Validation(required = true)
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

            private Builder() {
            } 

            private Builder(SnapshotOutput model) {
                this.bucket = model.bucket;
                this.endpoint = model.endpoint;
                this.storageType = model.storageType;
            } 

            /**
             * <p>The bucket of the snapshot output endpoint.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>testbucket</p>
             */
            public Builder bucket(String bucket) {
                this.bucket = bucket;
                return this;
            }

            /**
             * <p>The output endpoint of the snapshot.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>oss-cn-shanghai.aliyuncs.com</p>
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * <p>The storage type of the snapshot. The value can only be oss.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>oss</p>
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
    /**
     * 
     * {@link SubmitLiveSnapshotJobRequest} extends {@link TeaModel}
     *
     * <p>SubmitLiveSnapshotJobRequest</p>
     */
    public static class StreamInput extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        @com.aliyun.core.annotation.NameInMap("Url")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>The type of the input stream. The value can only be rtmp.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>rtmp</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            /**
             * <p>The URL of the input stream.</p>
             * <ul>
             * <li>It cannot exceed 255 characters in length.</li>
             * </ul>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>rtmp://<a href="http://www.aliyun.com/stream">www.aliyun.com/stream</a></p>
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
