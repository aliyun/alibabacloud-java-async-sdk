// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.acm20200206.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateConfigurationResponse} extends {@link TeaModel}
 *
 * <p>CreateConfigurationResponse</p>
 */
public class CreateConfigurationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateConfigurationResponseBody body;

    private CreateConfigurationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateConfigurationResponse create() {
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
    public CreateConfigurationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateConfigurationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateConfigurationResponseBody body);

        @Override
        CreateConfigurationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateConfigurationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateConfigurationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateConfigurationResponse response) {
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
        public Builder body(CreateConfigurationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateConfigurationResponse build() {
            return new CreateConfigurationResponse(this);
        } 

    } 

}
