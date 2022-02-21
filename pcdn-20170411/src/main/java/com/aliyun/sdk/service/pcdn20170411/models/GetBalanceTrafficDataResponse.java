// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pcdn20170411.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetBalanceTrafficDataResponse} extends {@link TeaModel}
 *
 * <p>GetBalanceTrafficDataResponse</p>
 */
public class GetBalanceTrafficDataResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetBalanceTrafficDataResponseBody body;

    private GetBalanceTrafficDataResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetBalanceTrafficDataResponse create() {
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
    public GetBalanceTrafficDataResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetBalanceTrafficDataResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetBalanceTrafficDataResponseBody body);

        @Override
        GetBalanceTrafficDataResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetBalanceTrafficDataResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetBalanceTrafficDataResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetBalanceTrafficDataResponse response) {
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
        public Builder body(GetBalanceTrafficDataResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetBalanceTrafficDataResponse build() {
            return new GetBalanceTrafficDataResponse(this);
        } 

    } 

}
