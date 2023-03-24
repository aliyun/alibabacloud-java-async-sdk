// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.csas20230120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPrivateAccessApplicationResponse} extends {@link TeaModel}
 *
 * <p>GetPrivateAccessApplicationResponse</p>
 */
public class GetPrivateAccessApplicationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetPrivateAccessApplicationResponseBody body;

    private GetPrivateAccessApplicationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetPrivateAccessApplicationResponse create() {
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
    public GetPrivateAccessApplicationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetPrivateAccessApplicationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetPrivateAccessApplicationResponseBody body);

        @Override
        GetPrivateAccessApplicationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetPrivateAccessApplicationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetPrivateAccessApplicationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetPrivateAccessApplicationResponse response) {
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
        public Builder body(GetPrivateAccessApplicationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetPrivateAccessApplicationResponse build() {
            return new GetPrivateAccessApplicationResponse(this);
        } 

    } 

}
