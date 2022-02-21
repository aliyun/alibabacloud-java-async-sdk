// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSnapshotReposByInstanceIdResponse} extends {@link TeaModel}
 *
 * <p>ListSnapshotReposByInstanceIdResponse</p>
 */
public class ListSnapshotReposByInstanceIdResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListSnapshotReposByInstanceIdResponseBody body;

    private ListSnapshotReposByInstanceIdResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListSnapshotReposByInstanceIdResponse create() {
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
    public ListSnapshotReposByInstanceIdResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListSnapshotReposByInstanceIdResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListSnapshotReposByInstanceIdResponseBody body);

        @Override
        ListSnapshotReposByInstanceIdResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListSnapshotReposByInstanceIdResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListSnapshotReposByInstanceIdResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListSnapshotReposByInstanceIdResponse response) {
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
        public Builder body(ListSnapshotReposByInstanceIdResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListSnapshotReposByInstanceIdResponse build() {
            return new ListSnapshotReposByInstanceIdResponse(this);
        } 

    } 

}
