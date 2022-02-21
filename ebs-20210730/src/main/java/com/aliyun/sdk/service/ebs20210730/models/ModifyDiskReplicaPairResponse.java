// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyDiskReplicaPairResponse} extends {@link TeaModel}
 *
 * <p>ModifyDiskReplicaPairResponse</p>
 */
public class ModifyDiskReplicaPairResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyDiskReplicaPairResponseBody body;

    private ModifyDiskReplicaPairResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyDiskReplicaPairResponse create() {
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
    public ModifyDiskReplicaPairResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyDiskReplicaPairResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyDiskReplicaPairResponseBody body);

        @Override
        ModifyDiskReplicaPairResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyDiskReplicaPairResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyDiskReplicaPairResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyDiskReplicaPairResponse response) {
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
        public Builder body(ModifyDiskReplicaPairResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyDiskReplicaPairResponse build() {
            return new ModifyDiskReplicaPairResponse(this);
        } 

    } 

}
