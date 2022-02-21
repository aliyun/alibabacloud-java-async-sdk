// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbfs20200418.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDbfsResponse} extends {@link TeaModel}
 *
 * <p>GetDbfsResponse</p>
 */
public class GetDbfsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetDbfsResponseBody body;

    private GetDbfsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetDbfsResponse create() {
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
    public GetDbfsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetDbfsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetDbfsResponseBody body);

        @Override
        GetDbfsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetDbfsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetDbfsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetDbfsResponse response) {
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
        public Builder body(GetDbfsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetDbfsResponse build() {
            return new GetDbfsResponse(this);
        } 

    } 

}
