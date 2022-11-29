// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.serverless20210924.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PutServiceResponse} extends {@link TeaModel}
 *
 * <p>PutServiceResponse</p>
 */
public class PutServiceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private Service body;

    private PutServiceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PutServiceResponse create() {
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
    public Service getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PutServiceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(Service body);

        @Override
        PutServiceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PutServiceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Service body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PutServiceResponse response) {
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
        public Builder body(Service body) {
            this.body = body;
            return this;
        }

        @Override
        public PutServiceResponse build() {
            return new PutServiceResponse(this);
        } 

    } 

}
