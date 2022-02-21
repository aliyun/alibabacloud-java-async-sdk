// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.kms20160120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSecretsResponse} extends {@link TeaModel}
 *
 * <p>ListSecretsResponse</p>
 */
public class ListSecretsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListSecretsResponseBody body;

    private ListSecretsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListSecretsResponse create() {
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
    public ListSecretsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListSecretsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListSecretsResponseBody body);

        @Override
        ListSecretsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListSecretsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListSecretsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListSecretsResponse response) {
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
        public Builder body(ListSecretsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListSecretsResponse build() {
            return new ListSecretsResponse(this);
        } 

    } 

}
