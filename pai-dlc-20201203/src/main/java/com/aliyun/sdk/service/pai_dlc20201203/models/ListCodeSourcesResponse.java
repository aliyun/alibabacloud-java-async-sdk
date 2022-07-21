// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dlc20201203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListCodeSourcesResponse} extends {@link TeaModel}
 *
 * <p>ListCodeSourcesResponse</p>
 */
public class ListCodeSourcesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListCodeSourcesResponseBody body;

    private ListCodeSourcesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListCodeSourcesResponse create() {
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
    public ListCodeSourcesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListCodeSourcesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListCodeSourcesResponseBody body);

        @Override
        ListCodeSourcesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListCodeSourcesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListCodeSourcesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListCodeSourcesResponse response) {
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
        public Builder body(ListCodeSourcesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListCodeSourcesResponse build() {
            return new ListCodeSourcesResponse(this);
        } 

    } 

}
