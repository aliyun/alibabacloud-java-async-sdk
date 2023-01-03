// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbfs20200418.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAutoSnapshotPolicyAppliedDbfsResponse} extends {@link TeaModel}
 *
 * <p>ListAutoSnapshotPolicyAppliedDbfsResponse</p>
 */
public class ListAutoSnapshotPolicyAppliedDbfsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListAutoSnapshotPolicyAppliedDbfsResponseBody body;

    private ListAutoSnapshotPolicyAppliedDbfsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListAutoSnapshotPolicyAppliedDbfsResponse create() {
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
    public ListAutoSnapshotPolicyAppliedDbfsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListAutoSnapshotPolicyAppliedDbfsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListAutoSnapshotPolicyAppliedDbfsResponseBody body);

        @Override
        ListAutoSnapshotPolicyAppliedDbfsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListAutoSnapshotPolicyAppliedDbfsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListAutoSnapshotPolicyAppliedDbfsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListAutoSnapshotPolicyAppliedDbfsResponse response) {
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
        public Builder body(ListAutoSnapshotPolicyAppliedDbfsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListAutoSnapshotPolicyAppliedDbfsResponse build() {
            return new ListAutoSnapshotPolicyAppliedDbfsResponse(this);
        } 

    } 

}
