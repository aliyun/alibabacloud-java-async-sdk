// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.searchengine20211025.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListIndexesResponse} extends {@link TeaModel}
 *
 * <p>ListIndexesResponse</p>
 */
public class ListIndexesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListIndexesResponseBody body;

    private ListIndexesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListIndexesResponse create() {
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
    public ListIndexesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListIndexesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListIndexesResponseBody body);

        @Override
        ListIndexesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListIndexesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListIndexesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListIndexesResponse response) {
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
        public Builder body(ListIndexesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListIndexesResponse build() {
            return new ListIndexesResponse(this);
        } 

    } 

}
