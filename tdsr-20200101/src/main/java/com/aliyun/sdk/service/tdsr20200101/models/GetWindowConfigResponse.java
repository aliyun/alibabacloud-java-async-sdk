// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetWindowConfigResponse} extends {@link TeaModel}
 *
 * <p>GetWindowConfigResponse</p>
 */
public class GetWindowConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetWindowConfigResponseBody body;

    private GetWindowConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetWindowConfigResponse create() {
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
    public GetWindowConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetWindowConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetWindowConfigResponseBody body);

        @Override
        GetWindowConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetWindowConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetWindowConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetWindowConfigResponse response) {
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
        public Builder body(GetWindowConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetWindowConfigResponse build() {
            return new GetWindowConfigResponse(this);
        } 

    } 

}
