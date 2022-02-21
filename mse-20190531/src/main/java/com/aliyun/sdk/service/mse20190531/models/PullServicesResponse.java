// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mse20190531.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PullServicesResponse} extends {@link TeaModel}
 *
 * <p>PullServicesResponse</p>
 */
public class PullServicesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PullServicesResponseBody body;

    private PullServicesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PullServicesResponse create() {
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
    public PullServicesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PullServicesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PullServicesResponseBody body);

        @Override
        PullServicesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PullServicesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PullServicesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PullServicesResponse response) {
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
        public Builder body(PullServicesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PullServicesResponse build() {
            return new PullServicesResponse(this);
        } 

    } 

}
