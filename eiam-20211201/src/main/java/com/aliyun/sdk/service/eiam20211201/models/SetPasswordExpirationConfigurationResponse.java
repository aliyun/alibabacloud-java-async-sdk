// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetPasswordExpirationConfigurationResponse} extends {@link TeaModel}
 *
 * <p>SetPasswordExpirationConfigurationResponse</p>
 */
public class SetPasswordExpirationConfigurationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetPasswordExpirationConfigurationResponseBody body;

    private SetPasswordExpirationConfigurationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetPasswordExpirationConfigurationResponse create() {
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
    public SetPasswordExpirationConfigurationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetPasswordExpirationConfigurationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetPasswordExpirationConfigurationResponseBody body);

        @Override
        SetPasswordExpirationConfigurationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetPasswordExpirationConfigurationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetPasswordExpirationConfigurationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetPasswordExpirationConfigurationResponse response) {
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
        public Builder body(SetPasswordExpirationConfigurationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetPasswordExpirationConfigurationResponse build() {
            return new SetPasswordExpirationConfigurationResponse(this);
        } 

    } 

}
