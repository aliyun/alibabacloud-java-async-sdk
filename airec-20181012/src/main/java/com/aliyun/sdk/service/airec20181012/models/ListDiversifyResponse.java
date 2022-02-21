// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20181012.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListDiversifyResponse} extends {@link TeaModel}
 *
 * <p>ListDiversifyResponse</p>
 */
public class ListDiversifyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListDiversifyResponseBody body;

    private ListDiversifyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListDiversifyResponse create() {
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
    public ListDiversifyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListDiversifyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListDiversifyResponseBody body);

        @Override
        ListDiversifyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListDiversifyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListDiversifyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListDiversifyResponse response) {
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
        public Builder body(ListDiversifyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListDiversifyResponse build() {
            return new ListDiversifyResponse(this);
        } 

    } 

}
