// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.maxcompute20220104.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProjectsResponse} extends {@link TeaModel}
 *
 * <p>ListProjectsResponse</p>
 */
public class ListProjectsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListProjectsResponseBody body;

    private ListProjectsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListProjectsResponse create() {
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
    public ListProjectsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListProjectsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListProjectsResponseBody body);

        @Override
        ListProjectsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListProjectsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListProjectsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListProjectsResponse response) {
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
        public Builder body(ListProjectsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListProjectsResponse build() {
            return new ListProjectsResponse(this);
        } 

    } 

}
