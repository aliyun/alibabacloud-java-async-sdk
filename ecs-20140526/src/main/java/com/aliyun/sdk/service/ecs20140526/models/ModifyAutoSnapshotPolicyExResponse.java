// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyAutoSnapshotPolicyExResponse} extends {@link TeaModel}
 *
 * <p>ModifyAutoSnapshotPolicyExResponse</p>
 */
public class ModifyAutoSnapshotPolicyExResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyAutoSnapshotPolicyExResponseBody body;

    private ModifyAutoSnapshotPolicyExResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyAutoSnapshotPolicyExResponse create() {
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
    public ModifyAutoSnapshotPolicyExResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyAutoSnapshotPolicyExResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyAutoSnapshotPolicyExResponseBody body);

        @Override
        ModifyAutoSnapshotPolicyExResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyAutoSnapshotPolicyExResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyAutoSnapshotPolicyExResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyAutoSnapshotPolicyExResponse response) {
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
        public Builder body(ModifyAutoSnapshotPolicyExResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyAutoSnapshotPolicyExResponse build() {
            return new ModifyAutoSnapshotPolicyExResponse(this);
        } 

    } 

}
