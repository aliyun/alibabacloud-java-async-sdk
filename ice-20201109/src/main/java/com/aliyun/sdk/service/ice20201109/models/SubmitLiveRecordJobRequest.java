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
 * {@link SubmitLiveRecordJobRequest} extends {@link RequestModel}
 *
 * <p>SubmitLiveRecordJobRequest</p>
 */
public class SubmitLiveRecordJobRequest extends Request {
    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("Name")
    @com.aliyun.core.annotation.Validation(required = true)
    private String name;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("NotifyUrl")
    private String notifyUrl;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("RecordOutput")
    @com.aliyun.core.annotation.Validation(required = true)
    private RecordOutput recordOutput;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("StreamInput")
    @com.aliyun.core.annotation.Validation(required = true)
    private StreamInput streamInput;

    @com.aliyun.core.annotation.Body
    @com.aliyun.core.annotation.NameInMap("TemplateId")
    @com.aliyun.core.annotation.Validation(required = true)
    private String templateId;

    private SubmitLiveRecordJobRequest(Builder builder) {
        super(builder);
        this.name = builder.name;
        this.notifyUrl = builder.notifyUrl;
        this.recordOutput = builder.recordOutput;
        this.streamInput = builder.streamInput;
        this.templateId = builder.templateId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitLiveRecordJobRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
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

    public static final class Builder extends Request.Builder<SubmitLiveRecordJobRequest, Builder> {
        private String name; 
        private String notifyUrl; 
        private RecordOutput recordOutput; 
        private StreamInput streamInput; 
        private String templateId; 

        private Builder() {
            super();
        } 

        private Builder(SubmitLiveRecordJobRequest request) {
            super(request);
            this.name = request.name;
            this.notifyUrl = request.notifyUrl;
            this.recordOutput = request.recordOutput;
            this.streamInput = request.streamInput;
            this.templateId = request.templateId;
        } 

        /**
         * <p>The name of the recording job.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>live stream record 1</p>
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
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
            this.putBodyParameter("NotifyUrl", notifyUrl);
            this.notifyUrl = notifyUrl;
            return this;
        }

        /**
         * <p>The storage address of the recording.</p>
         * <p>This parameter is required.</p>
         */
        public Builder recordOutput(RecordOutput recordOutput) {
            String recordOutputShrink = shrink(recordOutput, "RecordOutput", "json");
            this.putBodyParameter("RecordOutput", recordOutputShrink);
            this.recordOutput = recordOutput;
            return this;
        }

        /**
         * <p>The URL of the live stream.</p>
         * <p>This parameter is required.</p>
         */
        public Builder streamInput(StreamInput streamInput) {
            String streamInputShrink = shrink(streamInput, "StreamInput", "json");
            this.putBodyParameter("StreamInput", streamInputShrink);
            this.streamInput = streamInput;
            return this;
        }

        /**
         * <p>The ID of the recording template.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>69e1f9fe-1e97-11ed-ba64-0c42a1b73d66</p>
         */
        public Builder templateId(String templateId) {
            this.putBodyParameter("TemplateId", templateId);
            this.templateId = templateId;
            return this;
        }

        @Override
        public SubmitLiveRecordJobRequest build() {
            return new SubmitLiveRecordJobRequest(this);
        } 

    } 

    /**
     * 
     * {@link SubmitLiveRecordJobRequest} extends {@link TeaModel}
     *
     * <p>SubmitLiveRecordJobRequest</p>
     */
    public static class RecordOutput extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Bucket")
        private String bucket;

        @com.aliyun.core.annotation.NameInMap("Endpoint")
        private String endpoint;

        @com.aliyun.core.annotation.NameInMap("Type")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>oss-cn-hangzhou.aliyuncs.com</p>
             */
            public Builder endpoint(String endpoint) {
                this.endpoint = endpoint;
                return this;
            }

            /**
             * <p>The type of the storage address.</p>
             * <p>This parameter is required.</p>
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
     * {@link SubmitLiveRecordJobRequest} extends {@link TeaModel}
     *
     * <p>SubmitLiveRecordJobRequest</p>
     */
    public static class StreamInput extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Type")
        @com.aliyun.core.annotation.Validation(required = true)
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
             * <p>The type of the live stream URL. The value can only be rtmp.</p>
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
             * <p>The URL of the live stream.</p>
             * 
             * <strong>example:</strong>
             * <p>rtmp://example.com/live/stream1</p>
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
