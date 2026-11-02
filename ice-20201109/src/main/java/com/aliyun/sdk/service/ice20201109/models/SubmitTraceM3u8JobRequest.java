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
         * <p>The OSS output address of the m3u8 file.</p>
         * <blockquote>
         * <p>The region of the OSS bucket must be the same as the region of the current MPS.</p>
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
         * <p>The watermark job parameters. The value is a JSON string. The following parameters are supported:</p>
         * <ul>
         * <li><p>m3u8Type: the algorithm type. Default value: v1.</p>
         * <ul>
         * <li><p>v1: generates an m3u8 file with an absolute path, which can be played directly. The signature authentication is valid for 24 hours. After the authentication expires, you must resubmit the job to obtain the m3u8 file.</p>
         * </li>
         * <li><p>v2: generates an m3u8 file with a relative path, which must be placed in the same directory as the TS files.</p>
         * </li>
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
         * <p>The tracing watermark information.</p>
         * 
         * <strong>example:</strong>
         * <p>Traceability Watermark Test</p>
         */
        public Builder trace(String trace) {
            this.putQueryParameter("Trace", trace);
            this.trace = trace;
            return this;
        }

        /**
         * <p>The media ID of the processed tracing watermark AB stream. You can obtain this ID from the response parameters of the operation that submits a video tracing watermark AB stream job.</p>
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
             * <p>The output file information. OSS addresses are supported. The OSS address rules are as follows:</p>
             * <ol>
             * <li><p>oss://bucket/object</p>
             * </li>
             * <li><p>http(s)://bucket.oss-[regionId].aliyuncs.com/object
             * where bucket is the name of the OSS bucket that resides in the same region as the current project, and object is the file path.</p>
             * </li>
             * </ol>
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
             * <p>The output file type. Valid values:</p>
             * <ol>
             * <li>OSS: OSS file address.</li>
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
