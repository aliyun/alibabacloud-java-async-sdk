// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.composer20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListVersionsResponse} extends {@link TeaModel}
 *
 * <p>ListVersionsResponse</p>
 */
public class ListVersionsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListVersionsResponseBody body;

    private ListVersionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListVersionsResponse create() {
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
    public ListVersionsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListVersionsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListVersionsResponseBody body);

        @Override
        ListVersionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListVersionsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListVersionsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListVersionsResponse response) {
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
        public Builder body(ListVersionsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListVersionsResponse build() {
            return new ListVersionsResponse(this);
        } 

    } 

}
