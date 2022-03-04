// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifySnapshotAttributeResponse} extends {@link TeaModel}
 *
 * <p>ModifySnapshotAttributeResponse</p>
 */
public class ModifySnapshotAttributeResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifySnapshotAttributeResponseBody body;

    private ModifySnapshotAttributeResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifySnapshotAttributeResponse create() {
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
    public ModifySnapshotAttributeResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifySnapshotAttributeResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifySnapshotAttributeResponseBody body);

        @Override
        ModifySnapshotAttributeResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifySnapshotAttributeResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifySnapshotAttributeResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifySnapshotAttributeResponse response) {
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
        public Builder body(ModifySnapshotAttributeResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifySnapshotAttributeResponse build() {
            return new ModifySnapshotAttributeResponse(this);
        } 

    } 

}
