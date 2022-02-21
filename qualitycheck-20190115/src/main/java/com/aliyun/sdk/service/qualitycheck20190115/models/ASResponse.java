// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ASResponse} extends {@link TeaModel}
 *
 * <p>ASResponse</p>
 */
public class ASResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ASResponseBody body;

    private ASResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ASResponse create() {
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
    public ASResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ASResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ASResponseBody body);

        @Override
        ASResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ASResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ASResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ASResponse response) {
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
        public Builder body(ASResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ASResponse build() {
            return new ASResponse(this);
        } 

    } 

}
