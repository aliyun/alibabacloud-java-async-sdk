// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetBasicAccelerateIpEndpointRelationResponse} extends {@link TeaModel}
 *
 * <p>GetBasicAccelerateIpEndpointRelationResponse</p>
 */
public class GetBasicAccelerateIpEndpointRelationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetBasicAccelerateIpEndpointRelationResponseBody body;

    private GetBasicAccelerateIpEndpointRelationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetBasicAccelerateIpEndpointRelationResponse create() {
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
    public GetBasicAccelerateIpEndpointRelationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetBasicAccelerateIpEndpointRelationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetBasicAccelerateIpEndpointRelationResponseBody body);

        @Override
        GetBasicAccelerateIpEndpointRelationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetBasicAccelerateIpEndpointRelationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetBasicAccelerateIpEndpointRelationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetBasicAccelerateIpEndpointRelationResponse response) {
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
        public Builder body(GetBasicAccelerateIpEndpointRelationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetBasicAccelerateIpEndpointRelationResponse build() {
            return new GetBasicAccelerateIpEndpointRelationResponse(this);
        } 

    } 

}
