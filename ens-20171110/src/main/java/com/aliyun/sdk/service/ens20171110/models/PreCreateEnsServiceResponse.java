// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PreCreateEnsServiceResponse} extends {@link TeaModel}
 *
 * <p>PreCreateEnsServiceResponse</p>
 */
public class PreCreateEnsServiceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PreCreateEnsServiceResponseBody body;

    private PreCreateEnsServiceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PreCreateEnsServiceResponse create() {
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
    public PreCreateEnsServiceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PreCreateEnsServiceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PreCreateEnsServiceResponseBody body);

        @Override
        PreCreateEnsServiceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PreCreateEnsServiceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PreCreateEnsServiceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PreCreateEnsServiceResponse response) {
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
        public Builder body(PreCreateEnsServiceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PreCreateEnsServiceResponse build() {
            return new PreCreateEnsServiceResponse(this);
        } 

    } 

}
