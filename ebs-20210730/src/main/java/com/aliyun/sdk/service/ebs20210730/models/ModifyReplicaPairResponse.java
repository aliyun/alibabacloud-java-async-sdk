// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ebs20210730.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyReplicaPairResponse} extends {@link TeaModel}
 *
 * <p>ModifyReplicaPairResponse</p>
 */
public class ModifyReplicaPairResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyReplicaPairResponseBody body;

    private ModifyReplicaPairResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyReplicaPairResponse create() {
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
    public ModifyReplicaPairResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyReplicaPairResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyReplicaPairResponseBody body);

        @Override
        ModifyReplicaPairResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyReplicaPairResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyReplicaPairResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyReplicaPairResponse response) {
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
        public Builder body(ModifyReplicaPairResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyReplicaPairResponse build() {
            return new ModifyReplicaPairResponse(this);
        } 

    } 

}
