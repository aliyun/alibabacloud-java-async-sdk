// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dt_oc_info20220829.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOcFinancingResponse} extends {@link TeaModel}
 *
 * <p>GetOcFinancingResponse</p>
 */
public class GetOcFinancingResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetOcFinancingResponseBody body;

    private GetOcFinancingResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetOcFinancingResponse create() {
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
    public GetOcFinancingResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetOcFinancingResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetOcFinancingResponseBody body);

        @Override
        GetOcFinancingResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetOcFinancingResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetOcFinancingResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetOcFinancingResponse response) {
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
        public Builder body(GetOcFinancingResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetOcFinancingResponse build() {
            return new GetOcFinancingResponse(this);
        } 

    } 

}
