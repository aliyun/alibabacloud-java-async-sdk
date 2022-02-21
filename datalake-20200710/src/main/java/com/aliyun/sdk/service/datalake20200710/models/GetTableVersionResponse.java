// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTableVersionResponse} extends {@link TeaModel}
 *
 * <p>GetTableVersionResponse</p>
 */
public class GetTableVersionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetTableVersionResponseBody body;

    private GetTableVersionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetTableVersionResponse create() {
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
    public GetTableVersionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetTableVersionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetTableVersionResponseBody body);

        @Override
        GetTableVersionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetTableVersionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetTableVersionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetTableVersionResponse response) {
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
        public Builder body(GetTableVersionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetTableVersionResponse build() {
            return new GetTableVersionResponse(this);
        } 

    } 

}
