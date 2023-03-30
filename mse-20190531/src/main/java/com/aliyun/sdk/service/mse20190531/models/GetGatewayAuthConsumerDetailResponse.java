// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetGatewayAuthConsumerDetailResponse} extends {@link TeaModel}
 *
 * <p>GetGatewayAuthConsumerDetailResponse</p>
 */
public class GetGatewayAuthConsumerDetailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetGatewayAuthConsumerDetailResponseBody body;

    private GetGatewayAuthConsumerDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetGatewayAuthConsumerDetailResponse create() {
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
    public GetGatewayAuthConsumerDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetGatewayAuthConsumerDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetGatewayAuthConsumerDetailResponseBody body);

        @Override
        GetGatewayAuthConsumerDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetGatewayAuthConsumerDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetGatewayAuthConsumerDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetGatewayAuthConsumerDetailResponse response) {
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
        public Builder body(GetGatewayAuthConsumerDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetGatewayAuthConsumerDetailResponse build() {
            return new GetGatewayAuthConsumerDetailResponse(this);
        } 

    } 

}
