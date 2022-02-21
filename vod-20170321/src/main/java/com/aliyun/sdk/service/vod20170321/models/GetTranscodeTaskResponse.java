// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTranscodeTaskResponse} extends {@link TeaModel}
 *
 * <p>GetTranscodeTaskResponse</p>
 */
public class GetTranscodeTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetTranscodeTaskResponseBody body;

    private GetTranscodeTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetTranscodeTaskResponse create() {
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
    public GetTranscodeTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetTranscodeTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetTranscodeTaskResponseBody body);

        @Override
        GetTranscodeTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetTranscodeTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetTranscodeTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetTranscodeTaskResponse response) {
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
        public Builder body(GetTranscodeTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetTranscodeTaskResponse build() {
            return new GetTranscodeTaskResponse(this);
        } 

    } 

}
