// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetRoutePointResponse} extends {@link TeaModel}
 *
 * <p>GetRoutePointResponse</p>
 */
public class GetRoutePointResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetRoutePointResponseBody body;

    private GetRoutePointResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetRoutePointResponse create() {
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
    public GetRoutePointResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetRoutePointResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetRoutePointResponseBody body);

        @Override
        GetRoutePointResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetRoutePointResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetRoutePointResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetRoutePointResponse response) {
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
        public Builder body(GetRoutePointResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetRoutePointResponse build() {
            return new GetRoutePointResponse(this);
        } 

    } 

}
