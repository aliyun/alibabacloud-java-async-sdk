// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dt_oc_info20220829.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOcOperationCustomsResponse} extends {@link TeaModel}
 *
 * <p>GetOcOperationCustomsResponse</p>
 */
public class GetOcOperationCustomsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetOcOperationCustomsResponseBody body;

    private GetOcOperationCustomsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetOcOperationCustomsResponse create() {
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
    public GetOcOperationCustomsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetOcOperationCustomsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetOcOperationCustomsResponseBody body);

        @Override
        GetOcOperationCustomsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetOcOperationCustomsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetOcOperationCustomsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetOcOperationCustomsResponse response) {
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
        public Builder body(GetOcOperationCustomsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetOcOperationCustomsResponse build() {
            return new GetOcOperationCustomsResponse(this);
        } 

    } 

}
