// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAiOutboundTaskProgressResponse} extends {@link TeaModel}
 *
 * <p>GetAiOutboundTaskProgressResponse</p>
 */
public class GetAiOutboundTaskProgressResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetAiOutboundTaskProgressResponseBody body;

    private GetAiOutboundTaskProgressResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetAiOutboundTaskProgressResponse create() {
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
    public GetAiOutboundTaskProgressResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetAiOutboundTaskProgressResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetAiOutboundTaskProgressResponseBody body);

        @Override
        GetAiOutboundTaskProgressResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetAiOutboundTaskProgressResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetAiOutboundTaskProgressResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetAiOutboundTaskProgressResponse response) {
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
        public Builder body(GetAiOutboundTaskProgressResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetAiOutboundTaskProgressResponse build() {
            return new GetAiOutboundTaskProgressResponse(this);
        } 

    } 

}
