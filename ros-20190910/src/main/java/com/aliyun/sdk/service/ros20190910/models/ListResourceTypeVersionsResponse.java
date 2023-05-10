// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListResourceTypeVersionsResponse} extends {@link TeaModel}
 *
 * <p>ListResourceTypeVersionsResponse</p>
 */
public class ListResourceTypeVersionsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListResourceTypeVersionsResponseBody body;

    private ListResourceTypeVersionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListResourceTypeVersionsResponse create() {
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
    public ListResourceTypeVersionsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListResourceTypeVersionsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListResourceTypeVersionsResponseBody body);

        @Override
        ListResourceTypeVersionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListResourceTypeVersionsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListResourceTypeVersionsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListResourceTypeVersionsResponse response) {
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
        public Builder body(ListResourceTypeVersionsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListResourceTypeVersionsResponse build() {
            return new ListResourceTypeVersionsResponse(this);
        } 

    } 

}
