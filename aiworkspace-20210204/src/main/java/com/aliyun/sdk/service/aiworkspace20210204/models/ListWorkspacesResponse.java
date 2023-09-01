// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListWorkspacesResponse} extends {@link TeaModel}
 *
 * <p>ListWorkspacesResponse</p>
 */
public class ListWorkspacesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListWorkspacesResponseBody body;

    private ListWorkspacesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListWorkspacesResponse create() {
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
    public ListWorkspacesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListWorkspacesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListWorkspacesResponseBody body);

        @Override
        ListWorkspacesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListWorkspacesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListWorkspacesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListWorkspacesResponse response) {
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
        public Builder body(ListWorkspacesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListWorkspacesResponse build() {
            return new ListWorkspacesResponse(this);
        } 

    } 

}
