// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oos20190601.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateStateConfigurationResponse} extends {@link TeaModel}
 *
 * <p>UpdateStateConfigurationResponse</p>
 */
public class UpdateStateConfigurationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateStateConfigurationResponseBody body;

    private UpdateStateConfigurationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateStateConfigurationResponse create() {
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
    public UpdateStateConfigurationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateStateConfigurationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateStateConfigurationResponseBody body);

        @Override
        UpdateStateConfigurationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateStateConfigurationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateStateConfigurationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateStateConfigurationResponse response) {
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
        public Builder body(UpdateStateConfigurationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateStateConfigurationResponse build() {
            return new UpdateStateConfigurationResponse(this);
        } 

    } 

}
