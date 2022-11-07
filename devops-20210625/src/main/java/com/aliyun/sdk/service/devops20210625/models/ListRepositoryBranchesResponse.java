// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListRepositoryBranchesResponse} extends {@link TeaModel}
 *
 * <p>ListRepositoryBranchesResponse</p>
 */
public class ListRepositoryBranchesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListRepositoryBranchesResponseBody body;

    private ListRepositoryBranchesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListRepositoryBranchesResponse create() {
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
    public ListRepositoryBranchesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListRepositoryBranchesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListRepositoryBranchesResponseBody body);

        @Override
        ListRepositoryBranchesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListRepositoryBranchesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListRepositoryBranchesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListRepositoryBranchesResponse response) {
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
        public Builder body(ListRepositoryBranchesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListRepositoryBranchesResponse build() {
            return new ListRepositoryBranchesResponse(this);
        } 

    } 

}
