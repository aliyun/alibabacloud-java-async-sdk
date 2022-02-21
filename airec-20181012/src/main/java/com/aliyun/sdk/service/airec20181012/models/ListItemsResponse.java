// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.airec20181012.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListItemsResponse} extends {@link TeaModel}
 *
 * <p>ListItemsResponse</p>
 */
public class ListItemsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListItemsResponseBody body;

    private ListItemsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListItemsResponse create() {
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
    public ListItemsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListItemsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListItemsResponseBody body);

        @Override
        ListItemsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListItemsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListItemsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListItemsResponse response) {
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
        public Builder body(ListItemsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListItemsResponse build() {
            return new ListItemsResponse(this);
        } 

    } 

}
