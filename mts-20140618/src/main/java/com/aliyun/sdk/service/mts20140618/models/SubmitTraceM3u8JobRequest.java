// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20140618.models;

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
    @com.aliyun.core.annotation.NameInMap("MediaId")
    private String mediaId;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Output")
    private String output;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Params")
    private String params;

    @com.aliyun.core.annotation.Query
    @com.aliyun.core.annotation.NameInMap("Trace")
    private String trace;

    private SubmitTraceM3u8JobRequest(Builder builder) {
        super(builder);
        this.keyUri = builder.keyUri;
        this.mediaId = builder.mediaId;
        this.output = builder.output;
        this.params = builder.params;
        this.trace = builder.trace;
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
     * @return mediaId
     */
    public String getMediaId() {
        return this.mediaId;
    }

    /**
     * @return output
     */
    public String getOutput() {
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

    public static final class Builder extends Request.Builder<SubmitTraceM3u8JobRequest, Builder> {
        private String keyUri; 
        private String mediaId; 
        private String output; 
        private String params; 
        private String trace; 

        private Builder() {
            super();
        } 

        private Builder(SubmitTraceM3u8JobRequest request) {
            super(request);
            this.keyUri = request.keyUri;
            this.mediaId = request.mediaId;
            this.output = request.output;
            this.params = request.params;
            this.trace = request.trace;
        } 

        /**
         * KeyUri.
         */
        public Builder keyUri(String keyUri) {
            this.putQueryParameter("KeyUri", keyUri);
            this.keyUri = keyUri;
            return this;
        }

        /**
         * MediaId.
         */
        public Builder mediaId(String mediaId) {
            this.putQueryParameter("MediaId", mediaId);
            this.mediaId = mediaId;
            return this;
        }

        /**
         * Output.
         */
        public Builder output(String output) {
            this.putQueryParameter("Output", output);
            this.output = output;
            return this;
        }

        /**
         * Params.
         */
        public Builder params(String params) {
            this.putQueryParameter("Params", params);
            this.params = params;
            return this;
        }

        /**
         * Trace.
         */
        public Builder trace(String trace) {
            this.putQueryParameter("Trace", trace);
            this.trace = trace;
            return this;
        }

        @Override
        public SubmitTraceM3u8JobRequest build() {
            return new SubmitTraceM3u8JobRequest(this);
        } 

    } 

}
