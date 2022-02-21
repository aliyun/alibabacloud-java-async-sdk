// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CopySnapshotResponse} extends {@link TeaModel}
 *
 * <p>CopySnapshotResponse</p>
 */
public class CopySnapshotResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CopySnapshotResponseBody body;

    private CopySnapshotResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CopySnapshotResponse create() {
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
    public CopySnapshotResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CopySnapshotResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CopySnapshotResponseBody body);

        @Override
        CopySnapshotResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CopySnapshotResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CopySnapshotResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CopySnapshotResponse response) {
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
        public Builder body(CopySnapshotResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CopySnapshotResponse build() {
            return new CopySnapshotResponse(this);
        } 

    } 

}
