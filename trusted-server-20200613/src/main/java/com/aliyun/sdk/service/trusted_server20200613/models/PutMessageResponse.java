// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.trusted_server20200613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PutMessageResponse} extends {@link TeaModel}
 *
 * <p>PutMessageResponse</p>
 */
public class PutMessageResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PutMessageResponseBody body;

    private PutMessageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PutMessageResponse create() {
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
    public PutMessageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PutMessageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PutMessageResponseBody body);

        @Override
        PutMessageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PutMessageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PutMessageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PutMessageResponse response) {
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
        public Builder body(PutMessageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PutMessageResponse build() {
            return new PutMessageResponse(this);
        } 

    } 

}
