// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link TransformClientIdResponse} extends {@link TeaModel}
 *
 * <p>TransformClientIdResponse</p>
 */
public class TransformClientIdResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private TransformClientIdResponseBody body;

    private TransformClientIdResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static TransformClientIdResponse create() {
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
    public TransformClientIdResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<TransformClientIdResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(TransformClientIdResponseBody body);

        @Override
        TransformClientIdResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<TransformClientIdResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private TransformClientIdResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(TransformClientIdResponse response) {
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
        public Builder body(TransformClientIdResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public TransformClientIdResponse build() {
            return new TransformClientIdResponse(this);
        } 

    } 

}
