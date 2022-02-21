// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMultiRateConfigResponse} extends {@link TeaModel}
 *
 * <p>GetMultiRateConfigResponse</p>
 */
public class GetMultiRateConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetMultiRateConfigResponseBody body;

    private GetMultiRateConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetMultiRateConfigResponse create() {
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
    public GetMultiRateConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetMultiRateConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetMultiRateConfigResponseBody body);

        @Override
        GetMultiRateConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetMultiRateConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetMultiRateConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetMultiRateConfigResponse response) {
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
        public Builder body(GetMultiRateConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetMultiRateConfigResponse build() {
            return new GetMultiRateConfigResponse(this);
        } 

    } 

}
