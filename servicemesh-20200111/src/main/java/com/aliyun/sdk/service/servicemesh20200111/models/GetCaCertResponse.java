// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.servicemesh20200111.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCaCertResponse} extends {@link TeaModel}
 *
 * <p>GetCaCertResponse</p>
 */
public class GetCaCertResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetCaCertResponseBody body;

    private GetCaCertResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetCaCertResponse create() {
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
    public GetCaCertResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetCaCertResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetCaCertResponseBody body);

        @Override
        GetCaCertResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetCaCertResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetCaCertResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetCaCertResponse response) {
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
        public Builder body(GetCaCertResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetCaCertResponse build() {
            return new GetCaCertResponse(this);
        } 

    } 

}
