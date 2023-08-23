// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20220222.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ModifyNotificationConfigurationResponse} extends {@link TeaModel}
 *
 * <p>ModifyNotificationConfigurationResponse</p>
 */
public class ModifyNotificationConfigurationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ModifyNotificationConfigurationResponseBody body;

    private ModifyNotificationConfigurationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ModifyNotificationConfigurationResponse create() {
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
    public ModifyNotificationConfigurationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ModifyNotificationConfigurationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ModifyNotificationConfigurationResponseBody body);

        @Override
        ModifyNotificationConfigurationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ModifyNotificationConfigurationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ModifyNotificationConfigurationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ModifyNotificationConfigurationResponse response) {
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
        public Builder body(ModifyNotificationConfigurationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ModifyNotificationConfigurationResponse build() {
            return new ModifyNotificationConfigurationResponse(this);
        } 

    } 

}
