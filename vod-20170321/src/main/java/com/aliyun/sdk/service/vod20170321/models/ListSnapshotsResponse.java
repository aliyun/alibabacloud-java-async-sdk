// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListSnapshotsResponse} extends {@link TeaModel}
 *
 * <p>ListSnapshotsResponse</p>
 */
public class ListSnapshotsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListSnapshotsResponseBody body;

    private ListSnapshotsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListSnapshotsResponse create() {
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
    public ListSnapshotsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListSnapshotsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListSnapshotsResponseBody body);

        @Override
        ListSnapshotsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListSnapshotsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListSnapshotsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListSnapshotsResponse response) {
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
        public Builder body(ListSnapshotsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListSnapshotsResponse build() {
            return new ListSnapshotsResponse(this);
        } 

    } 

}
