// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetChatappVerifyCodeResponse} extends {@link TeaModel}
 *
 * <p>GetChatappVerifyCodeResponse</p>
 */
public class GetChatappVerifyCodeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetChatappVerifyCodeResponseBody body;

    private GetChatappVerifyCodeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetChatappVerifyCodeResponse create() {
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
    public GetChatappVerifyCodeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetChatappVerifyCodeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetChatappVerifyCodeResponseBody body);

        @Override
        GetChatappVerifyCodeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetChatappVerifyCodeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetChatappVerifyCodeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetChatappVerifyCodeResponse response) {
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
        public Builder body(GetChatappVerifyCodeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetChatappVerifyCodeResponse build() {
            return new GetChatappVerifyCodeResponse(this);
        } 

    } 

}
