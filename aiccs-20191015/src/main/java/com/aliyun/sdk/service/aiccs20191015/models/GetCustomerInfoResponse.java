// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiccs20191015.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCustomerInfoResponse} extends {@link TeaModel}
 *
 * <p>GetCustomerInfoResponse</p>
 */
public class GetCustomerInfoResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetCustomerInfoResponseBody body;

    private GetCustomerInfoResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetCustomerInfoResponse create() {
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
    public GetCustomerInfoResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetCustomerInfoResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetCustomerInfoResponseBody body);

        @Override
        GetCustomerInfoResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetCustomerInfoResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetCustomerInfoResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetCustomerInfoResponse response) {
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
        public Builder body(GetCustomerInfoResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetCustomerInfoResponse build() {
            return new GetCustomerInfoResponse(this);
        } 

    } 

}
