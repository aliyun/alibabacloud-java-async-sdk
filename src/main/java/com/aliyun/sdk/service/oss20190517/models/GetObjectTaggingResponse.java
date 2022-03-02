// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oss20190517.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.oss.models.*;

/**
 * {@link GetObjectTaggingResponse} extends {@link TeaModel}
 *
 * <p>GetObjectTaggingResponse</p>
 */
public class GetObjectTaggingResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetObjectTaggingResponseBody body;

    private GetObjectTaggingResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetObjectTaggingResponse create() {
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
    public GetObjectTaggingResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetObjectTaggingResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetObjectTaggingResponseBody body);

        @Override
        GetObjectTaggingResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetObjectTaggingResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetObjectTaggingResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetObjectTaggingResponse response) {
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
        public Builder body(GetObjectTaggingResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetObjectTaggingResponse build() {
            return new GetObjectTaggingResponse(this);
        } 

    } 

}
