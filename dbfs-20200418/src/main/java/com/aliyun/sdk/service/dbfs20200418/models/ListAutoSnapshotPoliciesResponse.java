// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbfs20200418.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAutoSnapshotPoliciesResponse} extends {@link TeaModel}
 *
 * <p>ListAutoSnapshotPoliciesResponse</p>
 */
public class ListAutoSnapshotPoliciesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListAutoSnapshotPoliciesResponseBody body;

    private ListAutoSnapshotPoliciesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListAutoSnapshotPoliciesResponse create() {
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
    public ListAutoSnapshotPoliciesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListAutoSnapshotPoliciesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListAutoSnapshotPoliciesResponseBody body);

        @Override
        ListAutoSnapshotPoliciesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListAutoSnapshotPoliciesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListAutoSnapshotPoliciesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListAutoSnapshotPoliciesResponse response) {
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
        public Builder body(ListAutoSnapshotPoliciesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListAutoSnapshotPoliciesResponse build() {
            return new ListAutoSnapshotPoliciesResponse(this);
        } 

    } 

}
