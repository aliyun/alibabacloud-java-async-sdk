// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableApplicationProvisioningResponse} extends {@link TeaModel}
 *
 * <p>EnableApplicationProvisioningResponse</p>
 */
public class EnableApplicationProvisioningResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private EnableApplicationProvisioningResponseBody body;

    private EnableApplicationProvisioningResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static EnableApplicationProvisioningResponse create() {
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
    public EnableApplicationProvisioningResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EnableApplicationProvisioningResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(EnableApplicationProvisioningResponseBody body);

        @Override
        EnableApplicationProvisioningResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EnableApplicationProvisioningResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private EnableApplicationProvisioningResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EnableApplicationProvisioningResponse response) {
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
        public Builder body(EnableApplicationProvisioningResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EnableApplicationProvisioningResponse build() {
            return new EnableApplicationProvisioningResponse(this);
        } 

    } 

}
