// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ManageSnapshotAuthResponse} extends {@link TeaModel}
 *
 * <p>ManageSnapshotAuthResponse</p>
 */
public class ManageSnapshotAuthResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ManageSnapshotAuthResponseBody body;

    private ManageSnapshotAuthResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ManageSnapshotAuthResponse create() {
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
    public ManageSnapshotAuthResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ManageSnapshotAuthResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ManageSnapshotAuthResponseBody body);

        @Override
        ManageSnapshotAuthResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ManageSnapshotAuthResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ManageSnapshotAuthResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ManageSnapshotAuthResponse response) {
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
        public Builder body(ManageSnapshotAuthResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ManageSnapshotAuthResponse build() {
            return new ManageSnapshotAuthResponse(this);
        } 

    } 

}
