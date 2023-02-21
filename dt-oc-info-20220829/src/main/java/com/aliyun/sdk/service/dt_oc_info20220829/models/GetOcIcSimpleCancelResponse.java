// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dt_oc_info20220829.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOcIcSimpleCancelResponse} extends {@link TeaModel}
 *
 * <p>GetOcIcSimpleCancelResponse</p>
 */
public class GetOcIcSimpleCancelResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetOcIcSimpleCancelResponseBody body;

    private GetOcIcSimpleCancelResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetOcIcSimpleCancelResponse create() {
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
    public GetOcIcSimpleCancelResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetOcIcSimpleCancelResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetOcIcSimpleCancelResponseBody body);

        @Override
        GetOcIcSimpleCancelResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetOcIcSimpleCancelResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetOcIcSimpleCancelResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetOcIcSimpleCancelResponse response) {
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
        public Builder body(GetOcIcSimpleCancelResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetOcIcSimpleCancelResponse build() {
            return new GetOcIcSimpleCancelResponse(this);
        } 

    } 

}
