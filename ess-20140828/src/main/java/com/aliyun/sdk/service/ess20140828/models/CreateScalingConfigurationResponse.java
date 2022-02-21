// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20140828.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateScalingConfigurationResponse} extends {@link TeaModel}
 *
 * <p>CreateScalingConfigurationResponse</p>
 */
public class CreateScalingConfigurationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateScalingConfigurationResponseBody body;

    private CreateScalingConfigurationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateScalingConfigurationResponse create() {
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
    public CreateScalingConfigurationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateScalingConfigurationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateScalingConfigurationResponseBody body);

        @Override
        CreateScalingConfigurationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateScalingConfigurationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateScalingConfigurationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateScalingConfigurationResponse response) {
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
        public Builder body(CreateScalingConfigurationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateScalingConfigurationResponse build() {
            return new CreateScalingConfigurationResponse(this);
        } 

    } 

}
