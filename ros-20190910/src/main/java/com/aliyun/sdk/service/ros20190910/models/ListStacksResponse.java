// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListStacksResponse} extends {@link TeaModel}
 *
 * <p>ListStacksResponse</p>
 */
public class ListStacksResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListStacksResponseBody body;

    private ListStacksResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListStacksResponse create() {
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
    public ListStacksResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListStacksResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListStacksResponseBody body);

        @Override
        ListStacksResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListStacksResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListStacksResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListStacksResponse response) {
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
        public Builder body(ListStacksResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListStacksResponse build() {
            return new ListStacksResponse(this);
        } 

    } 

}
