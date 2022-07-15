// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dsw20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListInstanceSnapshotResponse} extends {@link TeaModel}
 *
 * <p>ListInstanceSnapshotResponse</p>
 */
public class ListInstanceSnapshotResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListInstanceSnapshotResponseBody body;

    private ListInstanceSnapshotResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListInstanceSnapshotResponse create() {
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
    public ListInstanceSnapshotResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListInstanceSnapshotResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListInstanceSnapshotResponseBody body);

        @Override
        ListInstanceSnapshotResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListInstanceSnapshotResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListInstanceSnapshotResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListInstanceSnapshotResponse response) {
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
        public Builder body(ListInstanceSnapshotResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListInstanceSnapshotResponse build() {
            return new ListInstanceSnapshotResponse(this);
        } 

    } 

}
