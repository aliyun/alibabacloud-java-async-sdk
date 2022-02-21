// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CaptureDeviceSnapshotResponse} extends {@link TeaModel}
 *
 * <p>CaptureDeviceSnapshotResponse</p>
 */
public class CaptureDeviceSnapshotResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CaptureDeviceSnapshotResponseBody body;

    private CaptureDeviceSnapshotResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CaptureDeviceSnapshotResponse create() {
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
    public CaptureDeviceSnapshotResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CaptureDeviceSnapshotResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CaptureDeviceSnapshotResponseBody body);

        @Override
        CaptureDeviceSnapshotResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CaptureDeviceSnapshotResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CaptureDeviceSnapshotResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CaptureDeviceSnapshotResponse response) {
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
        public Builder body(CaptureDeviceSnapshotResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CaptureDeviceSnapshotResponse build() {
            return new CaptureDeviceSnapshotResponse(this);
        } 

    } 

}
