// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.imm20170906.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSetsResponse} extends {@link TeaModel}
 *
 * <p>ListSetsResponse</p>
 */
public class ListSetsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListSetsResponseBody body;

    private ListSetsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListSetsResponse create() {
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
    public ListSetsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListSetsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListSetsResponseBody body);

        @Override
        ListSetsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListSetsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListSetsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListSetsResponse response) {
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
        public Builder body(ListSetsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListSetsResponse build() {
            return new ListSetsResponse(this);
        } 

    } 

}
