// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vod20170321.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SubmitSnapshotJobResponse} extends {@link TeaModel}
 *
 * <p>SubmitSnapshotJobResponse</p>
 */
public class SubmitSnapshotJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SubmitSnapshotJobResponseBody body;

    private SubmitSnapshotJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SubmitSnapshotJobResponse create() {
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
    public SubmitSnapshotJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SubmitSnapshotJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SubmitSnapshotJobResponseBody body);

        @Override
        SubmitSnapshotJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SubmitSnapshotJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SubmitSnapshotJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SubmitSnapshotJobResponse response) {
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
        public Builder body(SubmitSnapshotJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SubmitSnapshotJobResponse build() {
            return new SubmitSnapshotJobResponse(this);
        } 

    } 

}
