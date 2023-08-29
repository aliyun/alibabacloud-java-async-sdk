// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpaas20201028.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMcubeWhitelistsResponse} extends {@link TeaModel}
 *
 * <p>ListMcubeWhitelistsResponse</p>
 */
public class ListMcubeWhitelistsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListMcubeWhitelistsResponseBody body;

    private ListMcubeWhitelistsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListMcubeWhitelistsResponse create() {
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
    public ListMcubeWhitelistsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListMcubeWhitelistsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListMcubeWhitelistsResponseBody body);

        @Override
        ListMcubeWhitelistsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListMcubeWhitelistsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListMcubeWhitelistsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListMcubeWhitelistsResponse response) {
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
        public Builder body(ListMcubeWhitelistsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListMcubeWhitelistsResponse build() {
            return new ListMcubeWhitelistsResponse(this);
        } 

    } 

}
