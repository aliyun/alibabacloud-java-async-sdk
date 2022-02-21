// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ResetSshKeyResponse} extends {@link TeaModel}
 *
 * <p>ResetSshKeyResponse</p>
 */
public class ResetSshKeyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ResetSshKeyResponseBody body;

    private ResetSshKeyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ResetSshKeyResponse create() {
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
    public ResetSshKeyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ResetSshKeyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ResetSshKeyResponseBody body);

        @Override
        ResetSshKeyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ResetSshKeyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ResetSshKeyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ResetSshKeyResponse response) {
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
        public Builder body(ResetSshKeyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ResetSshKeyResponse build() {
            return new ResetSshKeyResponse(this);
        } 

    } 

}
