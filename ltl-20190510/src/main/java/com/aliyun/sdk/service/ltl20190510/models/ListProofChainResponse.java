// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ltl20190510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProofChainResponse} extends {@link TeaModel}
 *
 * <p>ListProofChainResponse</p>
 */
public class ListProofChainResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListProofChainResponseBody body;

    private ListProofChainResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListProofChainResponse create() {
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
    public ListProofChainResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListProofChainResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListProofChainResponseBody body);

        @Override
        ListProofChainResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListProofChainResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListProofChainResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListProofChainResponse response) {
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
        public Builder body(ListProofChainResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListProofChainResponse build() {
            return new ListProofChainResponse(this);
        } 

    } 

}
