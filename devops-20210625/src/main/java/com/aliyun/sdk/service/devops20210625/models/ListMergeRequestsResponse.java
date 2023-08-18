// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListMergeRequestsResponse} extends {@link TeaModel}
 *
 * <p>ListMergeRequestsResponse</p>
 */
public class ListMergeRequestsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListMergeRequestsResponseBody body;

    private ListMergeRequestsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListMergeRequestsResponse create() {
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
    public ListMergeRequestsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListMergeRequestsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListMergeRequestsResponseBody body);

        @Override
        ListMergeRequestsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListMergeRequestsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListMergeRequestsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListMergeRequestsResponse response) {
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
        public Builder body(ListMergeRequestsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListMergeRequestsResponse build() {
            return new ListMergeRequestsResponse(this);
        } 

    } 

}
