// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cams20200606.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetChatappUploadAuthorizationResponse} extends {@link TeaModel}
 *
 * <p>GetChatappUploadAuthorizationResponse</p>
 */
public class GetChatappUploadAuthorizationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetChatappUploadAuthorizationResponseBody body;

    private GetChatappUploadAuthorizationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetChatappUploadAuthorizationResponse create() {
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
    public GetChatappUploadAuthorizationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetChatappUploadAuthorizationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetChatappUploadAuthorizationResponseBody body);

        @Override
        GetChatappUploadAuthorizationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetChatappUploadAuthorizationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetChatappUploadAuthorizationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetChatappUploadAuthorizationResponse response) {
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
        public Builder body(GetChatappUploadAuthorizationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetChatappUploadAuthorizationResponse build() {
            return new GetChatappUploadAuthorizationResponse(this);
        } 

    } 

}
