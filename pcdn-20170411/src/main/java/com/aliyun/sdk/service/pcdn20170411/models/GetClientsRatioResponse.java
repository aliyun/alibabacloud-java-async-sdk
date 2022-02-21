// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pcdn20170411.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetClientsRatioResponse} extends {@link TeaModel}
 *
 * <p>GetClientsRatioResponse</p>
 */
public class GetClientsRatioResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetClientsRatioResponseBody body;

    private GetClientsRatioResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetClientsRatioResponse create() {
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
    public GetClientsRatioResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetClientsRatioResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetClientsRatioResponseBody body);

        @Override
        GetClientsRatioResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetClientsRatioResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetClientsRatioResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetClientsRatioResponse response) {
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
        public Builder body(GetClientsRatioResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetClientsRatioResponse build() {
            return new GetClientsRatioResponse(this);
        } 

    } 

}
