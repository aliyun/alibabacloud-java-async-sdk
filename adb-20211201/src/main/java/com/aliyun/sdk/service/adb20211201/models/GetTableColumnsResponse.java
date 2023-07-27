// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTableColumnsResponse} extends {@link TeaModel}
 *
 * <p>GetTableColumnsResponse</p>
 */
public class GetTableColumnsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetTableColumnsResponseBody body;

    private GetTableColumnsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetTableColumnsResponse create() {
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
    public GetTableColumnsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetTableColumnsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetTableColumnsResponseBody body);

        @Override
        GetTableColumnsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetTableColumnsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetTableColumnsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetTableColumnsResponse response) {
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
        public Builder body(GetTableColumnsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetTableColumnsResponse build() {
            return new GetTableColumnsResponse(this);
        } 

    } 

}
