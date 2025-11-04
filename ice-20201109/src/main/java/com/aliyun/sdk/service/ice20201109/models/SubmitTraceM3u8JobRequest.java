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
 * {@link SubmitTraceM3u8JobRequest} extends {@link RequestModel}
 *
 * <p>SubmitTraceM3u8JobRequest</p>
 */
public class SubmitTraceM3u8JobRequest extends Request {
    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("KeyUri")
    private String keyUri;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Output")
    @com.aliyun.core.annotation.Validation(required = true)
    private Output output;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Params")
    private String params;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Trace")
    private String trace;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("TraceMediaId")
    private String traceMediaId;

    private SubmitTraceM3u8JobRequest(Builder builder) {
        super(builder);
        this.keyUri = builder.keyUri;
        this.output = builder.output;
        this.params = builder.params;
        this.trace = builder.trace;
        this.traceMediaId = builder.traceMediaId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitTraceM3u8JobRequest create() {
        return builder().build();
    }

@Override
    public Builder toBuilder() {
        return new Builder(this);
    }

    /**
     * @return keyUri
     */
    public String getKeyUri() {
        return this.keyUri;
    }

    /**
     * @return output
     */
    public Output getOutput() {
        return this.output;
    }

    /**
     * @return params
     */
    public String getParams() {
        return this.params;
    }

    /**
     * @return trace
     */
    public String getTrace() {
        return this.trace;
    }

    /**
     * @return traceMediaId
     */
    public String getTraceMediaId() {
        return this.traceMediaId;
    }

    public static final class Builder extends Request.Builder<SubmitTraceM3u8JobRequest, Builder> {
        private String keyUri; 
        private Output output; 
        private String params; 
        private String trace; 
        private String traceMediaId; 

        private Builder() {
            super();
        } 

        private Builder(SubmitTraceM3u8JobRequest request) {
            super(request);
            this.keyUri = request.keyUri;
            this.output = request.output;
            this.params = request.params;
            this.trace = request.trace;
            this.traceMediaId = request.traceMediaId;
        } 

        /**
         * <p>The URI of the key server.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://cipher.abc.com">https://cipher.abc.com</a></p>
         */
        public Builder keyUri(String keyUri) {
            this.putQueryParameter("KeyUri", keyUri);
            this.keyUri = keyUri;
            return this;
        }

        /**
         * <p>The OSS URL of the output M3U8 file.</p>
         * <blockquote>
         * <p>The OSS bucket must reside in the same region as the service region.</p>
         * </blockquote>
         * <p>This parameter is required.</p>
         */
        public Builder output(Output output) {
            String outputShrink = shrink(output, "Output", "json");
            this.putQueryParameter("Output", outputShrink);
            this.output = output;
            return this;
        }

        /**
         * <p>Additional parameters for the watermark job, provided as a JSON string. Supported parameter:</p>
         * <ul>
         * <li><p>m3u8Type: The type of M3U8 to generate. Defaults to v1.</p>
         * <ul>
         * <li>v1: Generates an M3U8 with absolute paths, playable directly. The signed URL for access is valid for 24 hours. If you need to use it after expiration, you must call this API again.</li>
         * <li>v2: Generates an M3U8 with relative paths. It must be placed in the same directory as the TS segment files to be playable.</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;m3u8Type&quot;:&quot;v1&quot;}</p>
         */
        public Builder params(String params) {
            this.putQueryParameter("Params", params);
            this.params = params;
            return this;
        }

        /**
         * <p>The specific trace watermark information.</p>
         */
        public Builder trace(String trace) {
            this.putQueryParameter("Trace", trace);
            this.trace = trace;
            return this;
        }

        /**
         * <p>The media ID for the trace watermark. You can obtain this from the response of the SubmitTraceAbJob operation.</p>
         * 
         * <strong>example:</strong>
         * <p>437bd2b516ffda105d07b12a9a82****</p>
         */
        public Builder traceMediaId(String traceMediaId) {
            this.putQueryParameter("TraceMediaId", traceMediaId);
            this.traceMediaId = traceMediaId;
            return this;
        }

        @Override
        public SubmitTraceM3u8JobRequest build() {
            return new SubmitTraceM3u8JobRequest(this);
        } 

    } 

    /**
     * 
     * {@link SubmitTraceM3u8JobRequest} extends {@link TeaModel}
     *
     * <p>SubmitTraceM3u8JobRequest</p>
     */
    public static class Output extends TeaModel {
        @com.aliyun.core.annotation.NameInMap("Media")
        @com.aliyun.core.annotation.Validation(required = true)
        private String media;

        @com.aliyun.core.annotation.NameInMap("Type")
        @com.aliyun.core.annotation.Validation(required = true)
        private String type;

        private Output(Builder builder) {
            this.media = builder.media;
            this.type = builder.type;
        }

        public static Builder builder() {
            return new Builder();
        }

        public static Output create() {
            return builder().build();
        }

        /**
         * @return media
         */
        public String getMedia() {
            return this.media;
        }

        /**
         * @return type
         */
        public String getType() {
            return this.type;
        }

        public static final class Builder {
            private String media; 
            private String type; 

            private Builder() {
            } 

            private Builder(Output model) {
                this.media = model.media;
                this.type = model.type;
            } 

            /**
             * <p>The OSS path where the output file is saved. You can specify the path in one of the following formats:</p>
             * <p>1. oss://bucket/object</p>
             * <p>2. http(s)://bucket.oss-[regionId].aliyuncs.com/object where bucket specifies an OSS bucket that resides in the same region as the job, and object specifies the object path in OSS.</p>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>oss://bucket/object</p>
             */
            public Builder media(String media) {
                this.media = media;
                return this;
            }

            /**
             * <p>The type of the output file. Valid value:</p>
             * <ol>
             * <li>OSS: an OSS object.</li>
             * </ol>
             * <p>This parameter is required.</p>
             * 
             * <strong>example:</strong>
             * <p>OSS</p>
             */
            public Builder type(String type) {
                this.type = type;
                return this;
            }

            public Output build() {
                return new Output(this);
            } 

        } 

    }
}
