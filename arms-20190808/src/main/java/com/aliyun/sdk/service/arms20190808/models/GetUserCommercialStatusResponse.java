// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20190808.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetUserCommercialStatusResponse} extends {@link TeaModel}
 *
 * <p>GetUserCommercialStatusResponse</p>
 */
public class GetUserCommercialStatusResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetUserCommercialStatusResponseBody body;

    private GetUserCommercialStatusResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetUserCommercialStatusResponse create() {
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
    public GetUserCommercialStatusResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetUserCommercialStatusResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetUserCommercialStatusResponseBody body);

        @Override
        GetUserCommercialStatusResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetUserCommercialStatusResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetUserCommercialStatusResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetUserCommercialStatusResponse response) {
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
        public Builder body(GetUserCommercialStatusResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetUserCommercialStatusResponse build() {
            return new GetUserCommercialStatusResponse(this);
        } 

    } 

}
