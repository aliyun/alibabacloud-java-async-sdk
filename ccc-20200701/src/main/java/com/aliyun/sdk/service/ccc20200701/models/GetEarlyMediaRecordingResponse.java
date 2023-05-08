// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetEarlyMediaRecordingResponse} extends {@link TeaModel}
 *
 * <p>GetEarlyMediaRecordingResponse</p>
 */
public class GetEarlyMediaRecordingResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetEarlyMediaRecordingResponseBody body;

    private GetEarlyMediaRecordingResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetEarlyMediaRecordingResponse create() {
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
    public GetEarlyMediaRecordingResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetEarlyMediaRecordingResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetEarlyMediaRecordingResponseBody body);

        @Override
        GetEarlyMediaRecordingResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetEarlyMediaRecordingResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetEarlyMediaRecordingResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetEarlyMediaRecordingResponse response) {
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
        public Builder body(GetEarlyMediaRecordingResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetEarlyMediaRecordingResponse build() {
            return new GetEarlyMediaRecordingResponse(this);
        } 

    } 

}
