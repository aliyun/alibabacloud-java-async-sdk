// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateVaultResponse} extends {@link TeaModel}
 *
 * <p>UpdateVaultResponse</p>
 */
public class UpdateVaultResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateVaultResponseBody body;

    private UpdateVaultResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateVaultResponse create() {
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
    public UpdateVaultResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateVaultResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateVaultResponseBody body);

        @Override
        UpdateVaultResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateVaultResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateVaultResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateVaultResponse response) {
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
        public Builder body(UpdateVaultResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateVaultResponse build() {
            return new UpdateVaultResponse(this);
        } 

    } 

}
