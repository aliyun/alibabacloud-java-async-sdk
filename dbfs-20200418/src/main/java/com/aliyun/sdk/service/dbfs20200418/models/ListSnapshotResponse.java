// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dbfs20200418.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSnapshotResponse} extends {@link TeaModel}
 *
 * <p>ListSnapshotResponse</p>
 */
public class ListSnapshotResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListSnapshotResponseBody body;

    private ListSnapshotResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListSnapshotResponse create() {
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
    public ListSnapshotResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListSnapshotResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListSnapshotResponseBody body);

        @Override
        ListSnapshotResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListSnapshotResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListSnapshotResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListSnapshotResponse response) {
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
        public Builder body(ListSnapshotResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListSnapshotResponse build() {
            return new ListSnapshotResponse(this);
        } 

    } 

}
