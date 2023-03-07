// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcecenter20221201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetResourceConfigurationResponse} extends {@link TeaModel}
 *
 * <p>GetResourceConfigurationResponse</p>
 */
public class GetResourceConfigurationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetResourceConfigurationResponseBody body;

    private GetResourceConfigurationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetResourceConfigurationResponse create() {
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
    public GetResourceConfigurationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetResourceConfigurationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetResourceConfigurationResponseBody body);

        @Override
        GetResourceConfigurationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetResourceConfigurationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetResourceConfigurationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetResourceConfigurationResponse response) {
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
        public Builder body(GetResourceConfigurationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetResourceConfigurationResponse build() {
            return new GetResourceConfigurationResponse(this);
        } 

    } 

}
