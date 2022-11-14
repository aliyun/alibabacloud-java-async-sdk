// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alinlp20200629.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetWeChCommentResponse} extends {@link TeaModel}
 *
 * <p>GetWeChCommentResponse</p>
 */
public class GetWeChCommentResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetWeChCommentResponseBody body;

    private GetWeChCommentResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetWeChCommentResponse create() {
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
    public GetWeChCommentResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetWeChCommentResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetWeChCommentResponseBody body);

        @Override
        GetWeChCommentResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetWeChCommentResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetWeChCommentResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetWeChCommentResponse response) {
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
        public Builder body(GetWeChCommentResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetWeChCommentResponse build() {
            return new GetWeChCommentResponse(this);
        } 

    } 

}
