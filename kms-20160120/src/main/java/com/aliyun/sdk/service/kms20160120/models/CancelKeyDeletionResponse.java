// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelKeyDeletionResponse} extends {@link TeaModel}
 *
 * <p>CancelKeyDeletionResponse</p>
 */
public class CancelKeyDeletionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CancelKeyDeletionResponseBody body;

    private CancelKeyDeletionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CancelKeyDeletionResponse create() {
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
    public CancelKeyDeletionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CancelKeyDeletionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CancelKeyDeletionResponseBody body);

        @Override
        CancelKeyDeletionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CancelKeyDeletionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CancelKeyDeletionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CancelKeyDeletionResponse response) {
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
        public Builder body(CancelKeyDeletionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CancelKeyDeletionResponse build() {
            return new CancelKeyDeletionResponse(this);
        } 

    } 

}
