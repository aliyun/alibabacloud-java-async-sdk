// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.qualitycheck20190115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link VerifySentenceResponse} extends {@link TeaModel}
 *
 * <p>VerifySentenceResponse</p>
 */
public class VerifySentenceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private VerifySentenceResponseBody body;

    private VerifySentenceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static VerifySentenceResponse create() {
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
    public VerifySentenceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<VerifySentenceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(VerifySentenceResponseBody body);

        @Override
        VerifySentenceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<VerifySentenceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private VerifySentenceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(VerifySentenceResponse response) {
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
        public Builder body(VerifySentenceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public VerifySentenceResponse build() {
            return new VerifySentenceResponse(this);
        } 

    } 

}
