// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListProtectedBranchesResponse} extends {@link TeaModel}
 *
 * <p>ListProtectedBranchesResponse</p>
 */
public class ListProtectedBranchesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListProtectedBranchesResponseBody body;

    private ListProtectedBranchesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListProtectedBranchesResponse create() {
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
    public ListProtectedBranchesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListProtectedBranchesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListProtectedBranchesResponseBody body);

        @Override
        ListProtectedBranchesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListProtectedBranchesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListProtectedBranchesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListProtectedBranchesResponse response) {
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
        public Builder body(ListProtectedBranchesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListProtectedBranchesResponse build() {
            return new ListProtectedBranchesResponse(this);
        } 

    } 

}
