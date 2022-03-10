// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.quickbi_public20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelCollectionResponse} extends {@link TeaModel}
 *
 * <p>CancelCollectionResponse</p>
 */
public class CancelCollectionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CancelCollectionResponseBody body;

    private CancelCollectionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CancelCollectionResponse create() {
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
    public CancelCollectionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CancelCollectionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CancelCollectionResponseBody body);

        @Override
        CancelCollectionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CancelCollectionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CancelCollectionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CancelCollectionResponse response) {
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
        public Builder body(CancelCollectionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CancelCollectionResponse build() {
            return new CancelCollectionResponse(this);
        } 

    } 

}
