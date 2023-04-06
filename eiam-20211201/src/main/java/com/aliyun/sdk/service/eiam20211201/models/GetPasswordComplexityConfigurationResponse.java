// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPasswordComplexityConfigurationResponse} extends {@link TeaModel}
 *
 * <p>GetPasswordComplexityConfigurationResponse</p>
 */
public class GetPasswordComplexityConfigurationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetPasswordComplexityConfigurationResponseBody body;

    private GetPasswordComplexityConfigurationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetPasswordComplexityConfigurationResponse create() {
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
    public GetPasswordComplexityConfigurationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetPasswordComplexityConfigurationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetPasswordComplexityConfigurationResponseBody body);

        @Override
        GetPasswordComplexityConfigurationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetPasswordComplexityConfigurationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetPasswordComplexityConfigurationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetPasswordComplexityConfigurationResponse response) {
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
        public Builder body(GetPasswordComplexityConfigurationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetPasswordComplexityConfigurationResponse build() {
            return new GetPasswordComplexityConfigurationResponse(this);
        } 

    } 

}
