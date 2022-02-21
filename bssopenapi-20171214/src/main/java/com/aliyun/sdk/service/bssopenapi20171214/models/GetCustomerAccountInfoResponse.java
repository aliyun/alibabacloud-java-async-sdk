// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCustomerAccountInfoResponse} extends {@link TeaModel}
 *
 * <p>GetCustomerAccountInfoResponse</p>
 */
public class GetCustomerAccountInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetCustomerAccountInfoResponseBody body;

    private GetCustomerAccountInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetCustomerAccountInfoResponse create() {
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
    public GetCustomerAccountInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetCustomerAccountInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetCustomerAccountInfoResponseBody body);

        @Override
        GetCustomerAccountInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetCustomerAccountInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetCustomerAccountInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetCustomerAccountInfoResponse response) {
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
        public Builder body(GetCustomerAccountInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetCustomerAccountInfoResponse build() {
            return new GetCustomerAccountInfoResponse(this);
        } 

    } 

}
