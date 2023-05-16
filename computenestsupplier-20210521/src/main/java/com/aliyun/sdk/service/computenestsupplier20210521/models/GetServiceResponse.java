// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetServiceResponse} extends {@link TeaModel}
 *
 * <p>GetServiceResponse</p>
 */
public class GetServiceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetServiceResponseBody body;

    private GetServiceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetServiceResponse create() {
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
    public GetServiceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetServiceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetServiceResponseBody body);

        @Override
        GetServiceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetServiceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetServiceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetServiceResponse response) {
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
        public Builder body(GetServiceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetServiceResponse build() {
            return new GetServiceResponse(this);
        } 

    } 

}
