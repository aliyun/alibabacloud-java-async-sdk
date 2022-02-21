// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.alb20200616.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableDeletionProtectionResponse} extends {@link TeaModel}
 *
 * <p>EnableDeletionProtectionResponse</p>
 */
public class EnableDeletionProtectionResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private EnableDeletionProtectionResponseBody body;

    private EnableDeletionProtectionResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static EnableDeletionProtectionResponse create() {
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
    public EnableDeletionProtectionResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EnableDeletionProtectionResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(EnableDeletionProtectionResponseBody body);

        @Override
        EnableDeletionProtectionResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EnableDeletionProtectionResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private EnableDeletionProtectionResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EnableDeletionProtectionResponse response) {
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
        public Builder body(EnableDeletionProtectionResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EnableDeletionProtectionResponse build() {
            return new EnableDeletionProtectionResponse(this);
        } 

    } 

}
