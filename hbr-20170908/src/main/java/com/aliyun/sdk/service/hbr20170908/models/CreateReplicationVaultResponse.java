// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateReplicationVaultResponse} extends {@link TeaModel}
 *
 * <p>CreateReplicationVaultResponse</p>
 */
public class CreateReplicationVaultResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateReplicationVaultResponseBody body;

    private CreateReplicationVaultResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateReplicationVaultResponse create() {
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
    public CreateReplicationVaultResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateReplicationVaultResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateReplicationVaultResponseBody body);

        @Override
        CreateReplicationVaultResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateReplicationVaultResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateReplicationVaultResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateReplicationVaultResponse response) {
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
        public Builder body(CreateReplicationVaultResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateReplicationVaultResponse build() {
            return new CreateReplicationVaultResponse(this);
        } 

    } 

}
