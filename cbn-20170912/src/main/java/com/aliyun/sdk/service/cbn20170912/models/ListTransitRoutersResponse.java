// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListTransitRoutersResponse} extends {@link TeaModel}
 *
 * <p>ListTransitRoutersResponse</p>
 */
public class ListTransitRoutersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListTransitRoutersResponseBody body;

    private ListTransitRoutersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListTransitRoutersResponse create() {
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
    public ListTransitRoutersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListTransitRoutersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListTransitRoutersResponseBody body);

        @Override
        ListTransitRoutersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListTransitRoutersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListTransitRoutersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListTransitRoutersResponse response) {
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
        public Builder body(ListTransitRoutersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListTransitRoutersResponse build() {
            return new ListTransitRoutersResponse(this);
        } 

    } 

}
