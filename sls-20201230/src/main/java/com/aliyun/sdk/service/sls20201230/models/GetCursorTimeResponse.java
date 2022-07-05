// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link GetCursorTimeResponse} extends {@link TeaModel}
 *
 * <p>GetCursorTimeResponse</p>
 */
public class GetCursorTimeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetCursorTimeResponseBody body;

    private GetCursorTimeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetCursorTimeResponse create() {
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
    public GetCursorTimeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetCursorTimeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetCursorTimeResponseBody body);

        @Override
        GetCursorTimeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetCursorTimeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetCursorTimeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetCursorTimeResponse response) {
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
        public Builder body(GetCursorTimeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetCursorTimeResponse build() {
            return new GetCursorTimeResponse(this);
        } 

    } 

}
