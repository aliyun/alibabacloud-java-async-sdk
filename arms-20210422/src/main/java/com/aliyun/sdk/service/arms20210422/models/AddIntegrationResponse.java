// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.arms20210422.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AddIntegrationResponse} extends {@link TeaModel}
 *
 * <p>AddIntegrationResponse</p>
 */
public class AddIntegrationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AddIntegrationResponseBody body;

    private AddIntegrationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AddIntegrationResponse create() {
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
    public AddIntegrationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AddIntegrationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AddIntegrationResponseBody body);

        @Override
        AddIntegrationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AddIntegrationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AddIntegrationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AddIntegrationResponse response) {
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
        public Builder body(AddIntegrationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AddIntegrationResponse build() {
            return new AddIntegrationResponse(this);
        } 

    } 

}
