// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetUserByExtensionResponse} extends {@link TeaModel}
 *
 * <p>GetUserByExtensionResponse</p>
 */
public class GetUserByExtensionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetUserByExtensionResponseBody body;

    private GetUserByExtensionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetUserByExtensionResponse create() {
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
    public GetUserByExtensionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetUserByExtensionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetUserByExtensionResponseBody body);

        @Override
        GetUserByExtensionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetUserByExtensionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetUserByExtensionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetUserByExtensionResponse response) {
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
        public Builder body(GetUserByExtensionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetUserByExtensionResponse build() {
            return new GetUserByExtensionResponse(this);
        } 

    } 

}
