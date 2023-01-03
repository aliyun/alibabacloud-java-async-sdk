// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbfs20200418.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAutoSnapshotPolicyUnappliedDbfsResponse} extends {@link TeaModel}
 *
 * <p>ListAutoSnapshotPolicyUnappliedDbfsResponse</p>
 */
public class ListAutoSnapshotPolicyUnappliedDbfsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListAutoSnapshotPolicyUnappliedDbfsResponseBody body;

    private ListAutoSnapshotPolicyUnappliedDbfsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListAutoSnapshotPolicyUnappliedDbfsResponse create() {
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
    public ListAutoSnapshotPolicyUnappliedDbfsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListAutoSnapshotPolicyUnappliedDbfsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListAutoSnapshotPolicyUnappliedDbfsResponseBody body);

        @Override
        ListAutoSnapshotPolicyUnappliedDbfsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListAutoSnapshotPolicyUnappliedDbfsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListAutoSnapshotPolicyUnappliedDbfsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListAutoSnapshotPolicyUnappliedDbfsResponse response) {
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
        public Builder body(ListAutoSnapshotPolicyUnappliedDbfsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListAutoSnapshotPolicyUnappliedDbfsResponse build() {
            return new ListAutoSnapshotPolicyUnappliedDbfsResponse(this);
        } 

    } 

}
