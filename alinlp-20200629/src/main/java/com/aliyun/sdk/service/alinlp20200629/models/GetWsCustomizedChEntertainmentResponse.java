// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alinlp20200629.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetWsCustomizedChEntertainmentResponse} extends {@link TeaModel}
 *
 * <p>GetWsCustomizedChEntertainmentResponse</p>
 */
public class GetWsCustomizedChEntertainmentResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetWsCustomizedChEntertainmentResponseBody body;

    private GetWsCustomizedChEntertainmentResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetWsCustomizedChEntertainmentResponse create() {
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
    public GetWsCustomizedChEntertainmentResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetWsCustomizedChEntertainmentResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetWsCustomizedChEntertainmentResponseBody body);

        @Override
        GetWsCustomizedChEntertainmentResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetWsCustomizedChEntertainmentResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetWsCustomizedChEntertainmentResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetWsCustomizedChEntertainmentResponse response) {
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
        public Builder body(GetWsCustomizedChEntertainmentResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetWsCustomizedChEntertainmentResponse build() {
            return new GetWsCustomizedChEntertainmentResponse(this);
        } 

    } 

}
