// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pcdn20170411.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTrafficByRegionResponse} extends {@link TeaModel}
 *
 * <p>GetTrafficByRegionResponse</p>
 */
public class GetTrafficByRegionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetTrafficByRegionResponseBody body;

    private GetTrafficByRegionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetTrafficByRegionResponse create() {
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
    public GetTrafficByRegionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetTrafficByRegionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetTrafficByRegionResponseBody body);

        @Override
        GetTrafficByRegionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetTrafficByRegionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetTrafficByRegionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetTrafficByRegionResponse response) {
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
        public Builder body(GetTrafficByRegionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetTrafficByRegionResponse build() {
            return new GetTrafficByRegionResponse(this);
        } 

    } 

}
