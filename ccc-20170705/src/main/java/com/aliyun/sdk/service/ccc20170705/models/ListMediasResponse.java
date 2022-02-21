// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20170705.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMediasResponse} extends {@link TeaModel}
 *
 * <p>ListMediasResponse</p>
 */
public class ListMediasResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListMediasResponseBody body;

    private ListMediasResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListMediasResponse create() {
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
    public ListMediasResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListMediasResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListMediasResponseBody body);

        @Override
        ListMediasResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListMediasResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListMediasResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListMediasResponse response) {
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
        public Builder body(ListMediasResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListMediasResponse build() {
            return new ListMediasResponse(this);
        } 

    } 

}
