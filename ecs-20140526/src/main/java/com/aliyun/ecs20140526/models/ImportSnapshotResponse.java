// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ImportSnapshotResponse} extends {@link TeaModel}
 *
 * <p>ImportSnapshotResponse</p>
 */
public class ImportSnapshotResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ImportSnapshotResponseBody body;

    private ImportSnapshotResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ImportSnapshotResponse create() {
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
    public ImportSnapshotResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ImportSnapshotResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ImportSnapshotResponseBody body);

        @Override
        ImportSnapshotResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ImportSnapshotResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ImportSnapshotResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ImportSnapshotResponse response) {
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
        public Builder body(ImportSnapshotResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ImportSnapshotResponse build() {
            return new ImportSnapshotResponse(this);
        } 

    } 

}
