// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDeviceSnapshotResponse} extends {@link TeaModel}
 *
 * <p>CreateDeviceSnapshotResponse</p>
 */
public class CreateDeviceSnapshotResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateDeviceSnapshotResponseBody body;

    private CreateDeviceSnapshotResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateDeviceSnapshotResponse create() {
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
    public CreateDeviceSnapshotResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateDeviceSnapshotResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateDeviceSnapshotResponseBody body);

        @Override
        CreateDeviceSnapshotResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateDeviceSnapshotResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateDeviceSnapshotResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateDeviceSnapshotResponse response) {
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
        public Builder body(CreateDeviceSnapshotResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateDeviceSnapshotResponse build() {
            return new CreateDeviceSnapshotResponse(this);
        } 

    } 

}
