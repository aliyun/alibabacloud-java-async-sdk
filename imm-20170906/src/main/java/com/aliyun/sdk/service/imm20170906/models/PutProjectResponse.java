// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20170906.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PutProjectResponse} extends {@link TeaModel}
 *
 * <p>PutProjectResponse</p>
 */
public class PutProjectResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PutProjectResponseBody body;

    private PutProjectResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PutProjectResponse create() {
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
    public PutProjectResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PutProjectResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PutProjectResponseBody body);

        @Override
        PutProjectResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PutProjectResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PutProjectResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PutProjectResponse response) {
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
        public Builder body(PutProjectResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PutProjectResponse build() {
            return new PutProjectResponse(this);
        } 

    } 

}
