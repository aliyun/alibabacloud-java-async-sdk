// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dsw20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateInstanceSnapshotResponse} extends {@link TeaModel}
 *
 * <p>CreateInstanceSnapshotResponse</p>
 */
public class CreateInstanceSnapshotResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateInstanceSnapshotResponseBody body;

    private CreateInstanceSnapshotResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateInstanceSnapshotResponse create() {
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
    public CreateInstanceSnapshotResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateInstanceSnapshotResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateInstanceSnapshotResponseBody body);

        @Override
        CreateInstanceSnapshotResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateInstanceSnapshotResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateInstanceSnapshotResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateInstanceSnapshotResponse response) {
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
        public Builder body(CreateInstanceSnapshotResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateInstanceSnapshotResponse build() {
            return new CreateInstanceSnapshotResponse(this);
        } 

    } 

}
