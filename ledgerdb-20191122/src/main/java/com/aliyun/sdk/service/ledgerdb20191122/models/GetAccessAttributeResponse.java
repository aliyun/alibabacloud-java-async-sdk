// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ledgerdb20191122.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAccessAttributeResponse} extends {@link TeaModel}
 *
 * <p>GetAccessAttributeResponse</p>
 */
public class GetAccessAttributeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetAccessAttributeResponseBody body;

    private GetAccessAttributeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetAccessAttributeResponse create() {
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
    public GetAccessAttributeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetAccessAttributeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetAccessAttributeResponseBody body);

        @Override
        GetAccessAttributeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetAccessAttributeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetAccessAttributeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetAccessAttributeResponse response) {
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
        public Builder body(GetAccessAttributeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetAccessAttributeResponse build() {
            return new GetAccessAttributeResponse(this);
        } 

    } 

}
