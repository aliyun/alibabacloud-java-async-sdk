// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link VerifyCenResponse} extends {@link TeaModel}
 *
 * <p>VerifyCenResponse</p>
 */
public class VerifyCenResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private VerifyCenResponseBody body;

    private VerifyCenResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static VerifyCenResponse create() {
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
    public VerifyCenResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<VerifyCenResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(VerifyCenResponseBody body);

        @Override
        VerifyCenResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<VerifyCenResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private VerifyCenResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(VerifyCenResponse response) {
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
        public Builder body(VerifyCenResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public VerifyCenResponse build() {
            return new VerifyCenResponse(this);
        } 

    } 

}
