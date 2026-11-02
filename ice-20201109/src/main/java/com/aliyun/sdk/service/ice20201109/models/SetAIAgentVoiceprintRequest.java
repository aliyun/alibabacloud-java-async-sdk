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
 * {@link SetAIAgentVoiceprintRequest} extends {@link RequestModel}
 *
 * <p>SetAIAgentVoiceprintRequest</p>
 */
public class SetAIAgentVoiceprintRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Input")
    private Input input;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("VoiceprintId")
    private String voiceprintId;

    private SetAIAgentVoiceprintRequest(Builder builder) {
        super(builder);
        this.input = builder.input;
        this.voiceprintId = builder.voiceprintId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SetAIAgentVoiceprintRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return input
     */
    public Input getInput() {
        return this.input;
    }

    /**
     * @return voiceprintId
     */
    public String getVoiceprintId() {
        return this.voiceprintId;
    }

    public static final class Builder extends Request.Builder<SetAIAgentVoiceprintRequest, Builder> {
        private Input input; 
        private String voiceprintId; 

        private Builder() {
            super();
        } 

        private Builder(SetAIAgentVoiceprintRequest request) {
            super(request);
            this.input = request.input;
            this.voiceprintId = request.voiceprintId;
        } 

        /**
         * <p>The input media.</p>
         */
        public Builder input(Input input) {
            String inputShrink = shrink(input, "Input", "json");
            this.putQueryParameter("Input", inputShrink);
            this.input = input;
            return this;
        }

        /**
         * <p>The unique identifier of a voiceprint. Generate this ID based on your business rules. Character length: 1-127.</p>
         * 
         * <strong>example:</strong>
         * <p>vp_1699123456_8527</p>
         */
        public Builder voiceprintId(String voiceprintId) {
            this.putQueryParameter("VoiceprintId", voiceprintId);
            this.voiceprintId = voiceprintId;
            return this;
        }

        @Override
        public SetAIAgentVoiceprintRequest build() {
            return new SetAIAgentVoiceprintRequest(this);
        } 

    } 

    /**
     * 
     * {@link SetAIAgentVoiceprintRequest} extends {@link TeaModel}
     *
     * <p>SetAIAgentVoiceprintRequest</p>
     */
    public static class Input extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Data")
        private String data;

        @com.aliyun.core.annotation.NameInMap("Format")
        private String format;

        @com.aliyun.core.annotation.NameInMap("Type")
        private String type;

        private Input(Builder builder) {
            this.data = builder.data;
            this.format = builder.format;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Input create() {
            return builder().build();
        }

        /**
         * @return data
         */
        public String getData() {
            return this.data;
        }

        /**
         * @return format
         */
        public String getFormat() {
            return this.format;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String data; 
            private String format; 
            private String type; 

            private Builder() {
            } 

            private Builder(Input model) {
                this.data = model.data;
                this.format = model.format;
                this.type = model.type;
            } 

            /**
             * <p>The access URL.</p>
             * 
             * <strong>example:</strong>
             * <p><a href="https://my-bucket.oss-cn-hangzhou.aliyuncs.com/audio/sample.wav">https://my-bucket.oss-cn-hangzhou.aliyuncs.com/audio/sample.wav</a></p>
             */
            public Builder data(String data) {
                this.data = data;
                return this;
            }

            /**
             * <p>The audio file type. Only wav is supported.</p>
             * 
             * <strong>example:</strong>
             * <p>wav</p>
             */
            public Builder format(String format) {
                this.format = format;
                return this;
            }

            /**
             * <p>The access type of the audio media. The system verifies file accessibility through HEAD/GET requests. Valid values:</p>
             * <ul>
             * <li>url: an HTTP URL of the audio file.</li>
             * <li>oss: Alibaba Cloud OSS object storage. The following formats are supported:<ol>
             * <li><p>OSS URI format: oss://bucket-name/object-key</p>
             * <p>Example: oss://my-bucket/audio/sample.wav</p>
             * </li>
             * <li><p>OSS public endpoint: http(s)://${bucket}.oss-${region}.aliyuncs.com/${object}</p>
             * <p>Example: <a href="https://my-bucket.oss-cn-hangzhou.aliyuncs.com/audio/sample.wav">https://my-bucket.oss-cn-hangzhou.aliyuncs.com/audio/sample.wav</a></p>
             * </li>
             * </ol>
             * </li>
             * </ul>
             * <blockquote>
             * <p>The OSS bucket must be in the same region as the service. Otherwise, access fails.</p>
             * </blockquote>
             * 
             * <strong>example:</strong>
             * <p>url</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Input build() {
                return new Input(this);
            } 

        } 

    }
}
