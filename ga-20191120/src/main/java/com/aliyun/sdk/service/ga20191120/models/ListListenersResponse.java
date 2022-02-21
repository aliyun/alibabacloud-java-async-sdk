// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ga20191120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListListenersResponse} extends {@link TeaModel}
 *
 * <p>ListListenersResponse</p>
 */
public class ListListenersResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListListenersResponseBody body;

    private ListListenersResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListListenersResponse create() {
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
    public ListListenersResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListListenersResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListListenersResponseBody body);

        @Override
        ListListenersResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListListenersResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListListenersResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListListenersResponse response) {
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
        public Builder body(ListListenersResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListListenersResponse build() {
            return new ListListenersResponse(this);
        } 

    } 

}
