// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetPasswordInitializationConfigurationResponse} extends {@link TeaModel}
 *
 * <p>SetPasswordInitializationConfigurationResponse</p>
 */
public class SetPasswordInitializationConfigurationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetPasswordInitializationConfigurationResponseBody body;

    private SetPasswordInitializationConfigurationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetPasswordInitializationConfigurationResponse create() {
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
    public SetPasswordInitializationConfigurationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetPasswordInitializationConfigurationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetPasswordInitializationConfigurationResponseBody body);

        @Override
        SetPasswordInitializationConfigurationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetPasswordInitializationConfigurationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetPasswordInitializationConfigurationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetPasswordInitializationConfigurationResponse response) {
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
        public Builder body(SetPasswordInitializationConfigurationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetPasswordInitializationConfigurationResponse build() {
            return new SetPasswordInitializationConfigurationResponse(this);
        } 

    } 

}
