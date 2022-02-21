// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListAlternativeSnapshotReposResponse} extends {@link TeaModel}
 *
 * <p>ListAlternativeSnapshotReposResponse</p>
 */
public class ListAlternativeSnapshotReposResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListAlternativeSnapshotReposResponseBody body;

    private ListAlternativeSnapshotReposResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListAlternativeSnapshotReposResponse create() {
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
    public ListAlternativeSnapshotReposResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListAlternativeSnapshotReposResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListAlternativeSnapshotReposResponseBody body);

        @Override
        ListAlternativeSnapshotReposResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListAlternativeSnapshotReposResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListAlternativeSnapshotReposResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListAlternativeSnapshotReposResponse response) {
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
        public Builder body(ListAlternativeSnapshotReposResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListAlternativeSnapshotReposResponse build() {
            return new ListAlternativeSnapshotReposResponse(this);
        } 

    } 

}
