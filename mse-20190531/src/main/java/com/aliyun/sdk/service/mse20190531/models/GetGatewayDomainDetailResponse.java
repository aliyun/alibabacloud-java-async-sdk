// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetGatewayDomainDetailResponse} extends {@link TeaModel}
 *
 * <p>GetGatewayDomainDetailResponse</p>
 */
public class GetGatewayDomainDetailResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetGatewayDomainDetailResponseBody body;

    private GetGatewayDomainDetailResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetGatewayDomainDetailResponse create() {
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
    public GetGatewayDomainDetailResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetGatewayDomainDetailResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetGatewayDomainDetailResponseBody body);

        @Override
        GetGatewayDomainDetailResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetGatewayDomainDetailResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetGatewayDomainDetailResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetGatewayDomainDetailResponse response) {
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
        public Builder body(GetGatewayDomainDetailResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetGatewayDomainDetailResponse build() {
            return new GetGatewayDomainDetailResponse(this);
        } 

    } 

}
