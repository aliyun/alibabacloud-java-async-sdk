// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ExportSnapshotResponse} extends {@link TeaModel}
 *
 * <p>ExportSnapshotResponse</p>
 */
public class ExportSnapshotResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ExportSnapshotResponseBody body;

    private ExportSnapshotResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ExportSnapshotResponse create() {
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
    public ExportSnapshotResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ExportSnapshotResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ExportSnapshotResponseBody body);

        @Override
        ExportSnapshotResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ExportSnapshotResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ExportSnapshotResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ExportSnapshotResponse response) {
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
        public Builder body(ExportSnapshotResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ExportSnapshotResponse build() {
            return new ExportSnapshotResponse(this);
        } 

    } 

}
