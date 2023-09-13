// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ice20201109.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitLiveRecordJobRequest} extends {@link RequestModel}
 *
 * <p>SubmitLiveRecordJobRequest</p>
 */
public class SubmitLiveRecordJobRequest extends Request {
    @Body
    @NameInMap("Name")
    @Validation(required = true)
    private String name;

    @Body
    @NameInMap("NotifyUrl")
    private String notifyUrl;

    @Body
    @NameInMap("RecordOutput")
    @Validation(required = true)
    private RecordOutput recordOutput;

    @Body
    @NameInMap("StreamInput")
    @Validation(required = true)
    private StreamInput streamInput;

    @Body
    @NameInMap("TemplateId")
    @Validation(required = true)
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
         * 代表资源名称的资源属性字段
         */
        public Builder name(String name) {
            this.putBodyParameter("Name", name);
            this.name = name;
            return this;
        }

        /**
         * 回调地址
         */
        public Builder notifyUrl(String notifyUrl) {
            this.putBodyParameter("NotifyUrl", notifyUrl);
            this.notifyUrl = notifyUrl;
            return this;
        }

        /**
         * RecordOutput.
         */
        public Builder recordOutput(RecordOutput recordOutput) {
            String recordOutputShrink = shrink(recordOutput, "RecordOutput", "json");
            this.putBodyParameter("RecordOutput", recordOutputShrink);
            this.recordOutput = recordOutput;
            return this;
        }

        /**
         * StreamInput.
         */
        public Builder streamInput(StreamInput streamInput) {
            String streamInputShrink = shrink(streamInput, "StreamInput", "json");
            this.putBodyParameter("StreamInput", streamInputShrink);
            this.streamInput = streamInput;
            return this;
        }

        /**
         * 录制模板ID
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

    public static class RecordOutput extends TeaModel {
        @NameInMap("Bucket")
        private String bucket;

        @NameInMap("Endpoint")
        private String endpoint;

        @NameInMap("Type")
        @Validation(required = true)
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
             * Type.
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
    public static class StreamInput extends TeaModel {
        @NameInMap("Type")
        @Validation(required = true)
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
