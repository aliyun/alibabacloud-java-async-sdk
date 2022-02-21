// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSortScriptsResponse} extends {@link TeaModel}
 *
 * <p>ListSortScriptsResponse</p>
 */
public class ListSortScriptsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListSortScriptsResponseBody body;

    private ListSortScriptsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListSortScriptsResponse create() {
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
    public ListSortScriptsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListSortScriptsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListSortScriptsResponseBody body);

        @Override
        ListSortScriptsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListSortScriptsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListSortScriptsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListSortScriptsResponse response) {
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
        public Builder body(ListSortScriptsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListSortScriptsResponse build() {
            return new ListSortScriptsResponse(this);
        } 

    } 

}
