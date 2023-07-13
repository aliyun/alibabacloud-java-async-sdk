// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PutContactResponse} extends {@link TeaModel}
 *
 * <p>PutContactResponse</p>
 */
public class PutContactResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PutContactResponseBody body;

    private PutContactResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PutContactResponse create() {
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
    public PutContactResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PutContactResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PutContactResponseBody body);

        @Override
        PutContactResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PutContactResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PutContactResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PutContactResponse response) {
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
        public Builder body(PutContactResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PutContactResponse build() {
            return new PutContactResponse(this);
        } 

    } 

}
