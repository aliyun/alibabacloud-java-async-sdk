// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PredImageResponse} extends {@link TeaModel}
 *
 * <p>PredImageResponse</p>
 */
public class PredImageResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PredImageResponseBody body;

    private PredImageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PredImageResponse create() {
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
    public PredImageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PredImageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PredImageResponseBody body);

        @Override
        PredImageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PredImageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PredImageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PredImageResponse response) {
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
        public Builder body(PredImageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PredImageResponse build() {
            return new PredImageResponse(this);
        } 

    } 

}
