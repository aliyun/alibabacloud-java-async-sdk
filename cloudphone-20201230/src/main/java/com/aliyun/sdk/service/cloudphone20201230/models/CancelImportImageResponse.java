// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudphone20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CancelImportImageResponse} extends {@link TeaModel}
 *
 * <p>CancelImportImageResponse</p>
 */
public class CancelImportImageResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CancelImportImageResponseBody body;

    private CancelImportImageResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CancelImportImageResponse create() {
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
    public CancelImportImageResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CancelImportImageResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CancelImportImageResponseBody body);

        @Override
        CancelImportImageResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CancelImportImageResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CancelImportImageResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CancelImportImageResponse response) {
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
        public Builder body(CancelImportImageResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CancelImportImageResponse build() {
            return new CancelImportImageResponse(this);
        } 

    } 

}
