// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pcdn20170411.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTrafficDataResponse} extends {@link TeaModel}
 *
 * <p>GetTrafficDataResponse</p>
 */
public class GetTrafficDataResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetTrafficDataResponseBody body;

    private GetTrafficDataResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetTrafficDataResponse create() {
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
    public GetTrafficDataResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetTrafficDataResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetTrafficDataResponseBody body);

        @Override
        GetTrafficDataResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetTrafficDataResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetTrafficDataResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetTrafficDataResponse response) {
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
        public Builder body(GetTrafficDataResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetTrafficDataResponse build() {
            return new GetTrafficDataResponse(this);
        } 

    } 

}
