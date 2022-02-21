// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFunctionVersionResponse} extends {@link TeaModel}
 *
 * <p>GetFunctionVersionResponse</p>
 */
public class GetFunctionVersionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetFunctionVersionResponseBody body;

    private GetFunctionVersionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetFunctionVersionResponse create() {
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
    public GetFunctionVersionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetFunctionVersionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetFunctionVersionResponseBody body);

        @Override
        GetFunctionVersionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetFunctionVersionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetFunctionVersionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetFunctionVersionResponse response) {
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
        public Builder body(GetFunctionVersionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetFunctionVersionResponse build() {
            return new GetFunctionVersionResponse(this);
        } 

    } 

}
