// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRepositoryGroupsResponse} extends {@link TeaModel}
 *
 * <p>ListRepositoryGroupsResponse</p>
 */
public class ListRepositoryGroupsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListRepositoryGroupsResponseBody body;

    private ListRepositoryGroupsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListRepositoryGroupsResponse create() {
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
    public ListRepositoryGroupsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListRepositoryGroupsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListRepositoryGroupsResponseBody body);

        @Override
        ListRepositoryGroupsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListRepositoryGroupsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListRepositoryGroupsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListRepositoryGroupsResponse response) {
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
        public Builder body(ListRepositoryGroupsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListRepositoryGroupsResponse build() {
            return new ListRepositoryGroupsResponse(this);
        } 

    } 

}
