// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mts20210728.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitTracemuRequest} extends {@link RequestModel}
 *
 * <p>SubmitTracemuRequest</p>
 */
public class SubmitTracemuRequest extends Request {
    @Body
    @NameInMap("KeyUri")
    private String keyUri;

    @Body
    @NameInMap("MediaId")
    @Validation(required = true)
    private String mediaId;

    @Body
    @NameInMap("Output")
    @Validation(required = true)
    private String output;

    @Body
    @NameInMap("Trace")
    @Validation(required = true)
    private String trace;

    private SubmitTracemuRequest(Builder builder) {
        super(builder);
        this.keyUri = builder.keyUri;
        this.mediaId = builder.mediaId;
        this.output = builder.output;
        this.trace = builder.trace;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static SubmitTracemuRequest create() {
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
     * @return trace
     */
    public String getTrace() {
        return this.trace;
    }

    public static final class Builder extends Request.Builder<SubmitTracemuRequest, Builder> {
        private String keyUri; 
        private String mediaId; 
        private String output; 
        private String trace; 

        private Builder() {
            super();
        } 

        private Builder(SubmitTracemuRequest request) {
            super(request);
            this.keyUri = request.keyUri;
            this.mediaId = request.mediaId;
            this.output = request.output;
            this.trace = request.trace;
        } 

        /**
         * 密钥服务器uri
         */
        public Builder keyUri(String keyUri) {
            this.putBodyParameter("KeyUri", keyUri);
            this.keyUri = keyUri;
            return this;
        }

        /**
         * ab流处理后的媒体id
         */
        public Builder mediaId(String mediaId) {
            this.putBodyParameter("MediaId", mediaId);
            this.mediaId = mediaId;
            return this;
        }

        /**
         * m3u8文件输出oss地址
         */
        public Builder output(String output) {
            this.putBodyParameter("Output", output);
            this.output = output;
            return this;
        }

        /**
         * 溯源水印信息
         */
        public Builder trace(String trace) {
            this.putBodyParameter("Trace", trace);
            this.trace = trace;
            return this;
        }

        @Override
        public SubmitTracemuRequest build() {
            return new SubmitTracemuRequest(this);
        } 

    } 

}
