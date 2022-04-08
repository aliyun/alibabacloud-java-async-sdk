// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.address_purification20191118.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetZipcodeResponse} extends {@link TeaModel}
 *
 * <p>GetZipcodeResponse</p>
 */
public class GetZipcodeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetZipcodeResponseBody body;

    private GetZipcodeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetZipcodeResponse create() {
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
    public GetZipcodeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetZipcodeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetZipcodeResponseBody body);

        @Override
        GetZipcodeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetZipcodeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetZipcodeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetZipcodeResponse response) {
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
        public Builder body(GetZipcodeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetZipcodeResponse build() {
            return new GetZipcodeResponse(this);
        } 

    } 

}
