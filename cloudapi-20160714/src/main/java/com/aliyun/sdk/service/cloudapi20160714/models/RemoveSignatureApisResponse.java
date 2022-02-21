// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudapi20160714.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveSignatureApisResponse} extends {@link TeaModel}
 *
 * <p>RemoveSignatureApisResponse</p>
 */
public class RemoveSignatureApisResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RemoveSignatureApisResponseBody body;

    private RemoveSignatureApisResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RemoveSignatureApisResponse create() {
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
    public RemoveSignatureApisResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RemoveSignatureApisResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RemoveSignatureApisResponseBody body);

        @Override
        RemoveSignatureApisResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RemoveSignatureApisResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RemoveSignatureApisResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RemoveSignatureApisResponse response) {
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
        public Builder body(RemoveSignatureApisResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RemoveSignatureApisResponse build() {
            return new RemoveSignatureApisResponse(this);
        } 

    } 

}
