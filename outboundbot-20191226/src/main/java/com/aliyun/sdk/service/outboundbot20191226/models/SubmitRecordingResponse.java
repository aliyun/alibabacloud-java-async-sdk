// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitRecordingResponse} extends {@link TeaModel}
 *
 * <p>SubmitRecordingResponse</p>
 */
public class SubmitRecordingResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SubmitRecordingResponseBody body;

    private SubmitRecordingResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SubmitRecordingResponse create() {
        return new BuilderImpl().build();
    }

    @Override
    public Builder toBuilder() {
        return new BuilderImpl(this);
    }

    /**
     * @return headers
     */
    public java.util.Map < String, String > getHeaders() {
        return this.headers;
    }

    /**
     * @return body
     */
    public SubmitRecordingResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SubmitRecordingResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SubmitRecordingResponseBody body);

        @Override
        SubmitRecordingResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SubmitRecordingResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SubmitRecordingResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SubmitRecordingResponse response) {
            super(response);
            this.headers = response.headers;
            this.body = response.body;
        } 

        /**
         * headers.
         */
        @Override
        public Builder headers(java.util.Map < String, String > headers) {
            this.headers = headers;
            return this;
        }

        /**
         * body.
         */
        @Override
        public Builder body(SubmitRecordingResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SubmitRecordingResponse build() {
            return new SubmitRecordingResponse(this);
        } 

    } 

}
