// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link GetCursorResponse} extends {@link TeaModel}
 *
 * <p>GetCursorResponse</p>
 */
public class GetCursorResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetCursorResponseBody body;

    private GetCursorResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetCursorResponse create() {
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
    public GetCursorResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetCursorResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetCursorResponseBody body);

        @Override
        GetCursorResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetCursorResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetCursorResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetCursorResponse response) {
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
        public Builder body(GetCursorResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetCursorResponse build() {
            return new GetCursorResponse(this);
        } 

    } 

}
