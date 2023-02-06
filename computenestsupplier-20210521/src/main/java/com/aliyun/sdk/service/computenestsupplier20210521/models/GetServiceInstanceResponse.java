// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.computenestsupplier20210521.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetServiceInstanceResponse} extends {@link TeaModel}
 *
 * <p>GetServiceInstanceResponse</p>
 */
public class GetServiceInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetServiceInstanceResponseBody body;

    private GetServiceInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetServiceInstanceResponse create() {
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
    public GetServiceInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetServiceInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetServiceInstanceResponseBody body);

        @Override
        GetServiceInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetServiceInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetServiceInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetServiceInstanceResponse response) {
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
        public Builder body(GetServiceInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetServiceInstanceResponse build() {
            return new GetServiceInstanceResponse(this);
        } 

    } 

}
