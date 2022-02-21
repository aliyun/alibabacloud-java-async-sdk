// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20140828.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateNotificationConfigurationResponse} extends {@link TeaModel}
 *
 * <p>CreateNotificationConfigurationResponse</p>
 */
public class CreateNotificationConfigurationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateNotificationConfigurationResponseBody body;

    private CreateNotificationConfigurationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateNotificationConfigurationResponse create() {
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
    public CreateNotificationConfigurationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateNotificationConfigurationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateNotificationConfigurationResponseBody body);

        @Override
        CreateNotificationConfigurationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateNotificationConfigurationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateNotificationConfigurationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateNotificationConfigurationResponse response) {
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
        public Builder body(CreateNotificationConfigurationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateNotificationConfigurationResponse build() {
            return new CreateNotificationConfigurationResponse(this);
        } 

    } 

}
