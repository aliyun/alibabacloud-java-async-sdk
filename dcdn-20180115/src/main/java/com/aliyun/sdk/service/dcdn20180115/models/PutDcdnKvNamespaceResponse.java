// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PutDcdnKvNamespaceResponse} extends {@link TeaModel}
 *
 * <p>PutDcdnKvNamespaceResponse</p>
 */
public class PutDcdnKvNamespaceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PutDcdnKvNamespaceResponseBody body;

    private PutDcdnKvNamespaceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PutDcdnKvNamespaceResponse create() {
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
    public PutDcdnKvNamespaceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PutDcdnKvNamespaceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PutDcdnKvNamespaceResponseBody body);

        @Override
        PutDcdnKvNamespaceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PutDcdnKvNamespaceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PutDcdnKvNamespaceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PutDcdnKvNamespaceResponse response) {
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
        public Builder body(PutDcdnKvNamespaceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PutDcdnKvNamespaceResponse build() {
            return new PutDcdnKvNamespaceResponse(this);
        } 

    } 

}
