// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetApplicationProvisioningConfigResponse} extends {@link TeaModel}
 *
 * <p>SetApplicationProvisioningConfigResponse</p>
 */
public class SetApplicationProvisioningConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetApplicationProvisioningConfigResponseBody body;

    private SetApplicationProvisioningConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetApplicationProvisioningConfigResponse create() {
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
    public SetApplicationProvisioningConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetApplicationProvisioningConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetApplicationProvisioningConfigResponseBody body);

        @Override
        SetApplicationProvisioningConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetApplicationProvisioningConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetApplicationProvisioningConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetApplicationProvisioningConfigResponse response) {
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
        public Builder body(SetApplicationProvisioningConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetApplicationProvisioningConfigResponse build() {
            return new SetApplicationProvisioningConfigResponse(this);
        } 

    } 

}
