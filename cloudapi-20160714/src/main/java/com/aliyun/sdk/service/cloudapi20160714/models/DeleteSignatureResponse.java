// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteSignatureResponse} extends {@link TeaModel}
 *
 * <p>DeleteSignatureResponse</p>
 */
public class DeleteSignatureResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteSignatureResponseBody body;

    private DeleteSignatureResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteSignatureResponse create() {
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
    public DeleteSignatureResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteSignatureResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteSignatureResponseBody body);

        @Override
        DeleteSignatureResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteSignatureResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteSignatureResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteSignatureResponse response) {
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
        public Builder body(DeleteSignatureResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteSignatureResponse build() {
            return new DeleteSignatureResponse(this);
        } 

    } 

}
