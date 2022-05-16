// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.paiplugin20220112.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSignaturesResponse} extends {@link TeaModel}
 *
 * <p>ListSignaturesResponse</p>
 */
public class ListSignaturesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListSignaturesResponseBody body;

    private ListSignaturesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListSignaturesResponse create() {
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
    public ListSignaturesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListSignaturesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListSignaturesResponseBody body);

        @Override
        ListSignaturesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListSignaturesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListSignaturesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListSignaturesResponse response) {
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
        public Builder body(ListSignaturesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListSignaturesResponse build() {
            return new ListSignaturesResponse(this);
        } 

    } 

}
