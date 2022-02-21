// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResetSnapshotResponse} extends {@link TeaModel}
 *
 * <p>ResetSnapshotResponse</p>
 */
public class ResetSnapshotResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ResetSnapshotResponseBody body;

    private ResetSnapshotResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ResetSnapshotResponse create() {
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
    public ResetSnapshotResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ResetSnapshotResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ResetSnapshotResponseBody body);

        @Override
        ResetSnapshotResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ResetSnapshotResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ResetSnapshotResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ResetSnapshotResponse response) {
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
        public Builder body(ResetSnapshotResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ResetSnapshotResponse build() {
            return new ResetSnapshotResponse(this);
        } 

    } 

}
