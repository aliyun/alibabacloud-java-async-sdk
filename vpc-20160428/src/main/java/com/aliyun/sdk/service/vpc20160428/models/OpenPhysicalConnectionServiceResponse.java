// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OpenPhysicalConnectionServiceResponse} extends {@link TeaModel}
 *
 * <p>OpenPhysicalConnectionServiceResponse</p>
 */
public class OpenPhysicalConnectionServiceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private OpenPhysicalConnectionServiceResponseBody body;

    private OpenPhysicalConnectionServiceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static OpenPhysicalConnectionServiceResponse create() {
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
    public OpenPhysicalConnectionServiceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<OpenPhysicalConnectionServiceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(OpenPhysicalConnectionServiceResponseBody body);

        @Override
        OpenPhysicalConnectionServiceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<OpenPhysicalConnectionServiceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private OpenPhysicalConnectionServiceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(OpenPhysicalConnectionServiceResponse response) {
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
        public Builder body(OpenPhysicalConnectionServiceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public OpenPhysicalConnectionServiceResponse build() {
            return new OpenPhysicalConnectionServiceResponse(this);
        } 

    } 

}
