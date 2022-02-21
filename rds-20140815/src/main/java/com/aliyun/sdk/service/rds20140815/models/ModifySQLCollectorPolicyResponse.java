// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifySQLCollectorPolicyResponse} extends {@link TeaModel}
 *
 * <p>ModifySQLCollectorPolicyResponse</p>
 */
public class ModifySQLCollectorPolicyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifySQLCollectorPolicyResponseBody body;

    private ModifySQLCollectorPolicyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifySQLCollectorPolicyResponse create() {
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
    public ModifySQLCollectorPolicyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifySQLCollectorPolicyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifySQLCollectorPolicyResponseBody body);

        @Override
        ModifySQLCollectorPolicyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifySQLCollectorPolicyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifySQLCollectorPolicyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifySQLCollectorPolicyResponse response) {
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
        public Builder body(ModifySQLCollectorPolicyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifySQLCollectorPolicyResponse build() {
            return new ModifySQLCollectorPolicyResponse(this);
        } 

    } 

}
