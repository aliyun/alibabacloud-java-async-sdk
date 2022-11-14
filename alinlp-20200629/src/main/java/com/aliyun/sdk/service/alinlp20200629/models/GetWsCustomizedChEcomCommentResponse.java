// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alinlp20200629.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetWsCustomizedChEcomCommentResponse} extends {@link TeaModel}
 *
 * <p>GetWsCustomizedChEcomCommentResponse</p>
 */
public class GetWsCustomizedChEcomCommentResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetWsCustomizedChEcomCommentResponseBody body;

    private GetWsCustomizedChEcomCommentResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetWsCustomizedChEcomCommentResponse create() {
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
    public GetWsCustomizedChEcomCommentResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetWsCustomizedChEcomCommentResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetWsCustomizedChEcomCommentResponseBody body);

        @Override
        GetWsCustomizedChEcomCommentResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetWsCustomizedChEcomCommentResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetWsCustomizedChEcomCommentResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetWsCustomizedChEcomCommentResponse response) {
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
        public Builder body(GetWsCustomizedChEcomCommentResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetWsCustomizedChEcomCommentResponse build() {
            return new GetWsCustomizedChEcomCommentResponse(this);
        } 

    } 

}
