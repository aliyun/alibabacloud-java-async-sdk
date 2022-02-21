// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20181012.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PushDocumentResponse} extends {@link TeaModel}
 *
 * <p>PushDocumentResponse</p>
 */
public class PushDocumentResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PushDocumentResponseBody body;

    private PushDocumentResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PushDocumentResponse create() {
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
    public PushDocumentResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PushDocumentResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PushDocumentResponseBody body);

        @Override
        PushDocumentResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PushDocumentResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PushDocumentResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PushDocumentResponse response) {
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
        public Builder body(PushDocumentResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PushDocumentResponse build() {
            return new PushDocumentResponse(this);
        } 

    } 

}
