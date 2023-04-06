// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPasswordInitializationConfigurationResponse} extends {@link TeaModel}
 *
 * <p>GetPasswordInitializationConfigurationResponse</p>
 */
public class GetPasswordInitializationConfigurationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetPasswordInitializationConfigurationResponseBody body;

    private GetPasswordInitializationConfigurationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetPasswordInitializationConfigurationResponse create() {
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
    public GetPasswordInitializationConfigurationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetPasswordInitializationConfigurationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetPasswordInitializationConfigurationResponseBody body);

        @Override
        GetPasswordInitializationConfigurationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetPasswordInitializationConfigurationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetPasswordInitializationConfigurationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetPasswordInitializationConfigurationResponse response) {
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
        public Builder body(GetPasswordInitializationConfigurationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetPasswordInitializationConfigurationResponse build() {
            return new GetPasswordInitializationConfigurationResponse(this);
        } 

    } 

}
