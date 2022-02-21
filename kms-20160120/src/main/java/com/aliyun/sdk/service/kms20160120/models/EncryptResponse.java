// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EncryptResponse} extends {@link TeaModel}
 *
 * <p>EncryptResponse</p>
 */
public class EncryptResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private EncryptResponseBody body;

    private EncryptResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static EncryptResponse create() {
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
    public EncryptResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EncryptResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(EncryptResponseBody body);

        @Override
        EncryptResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EncryptResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private EncryptResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EncryptResponse response) {
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
        public Builder body(EncryptResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EncryptResponse build() {
            return new EncryptResponse(this);
        } 

    } 

}
