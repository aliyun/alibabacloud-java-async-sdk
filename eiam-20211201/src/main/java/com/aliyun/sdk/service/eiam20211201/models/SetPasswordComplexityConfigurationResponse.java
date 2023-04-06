// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetPasswordComplexityConfigurationResponse} extends {@link TeaModel}
 *
 * <p>SetPasswordComplexityConfigurationResponse</p>
 */
public class SetPasswordComplexityConfigurationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetPasswordComplexityConfigurationResponseBody body;

    private SetPasswordComplexityConfigurationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetPasswordComplexityConfigurationResponse create() {
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
    public SetPasswordComplexityConfigurationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetPasswordComplexityConfigurationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetPasswordComplexityConfigurationResponseBody body);

        @Override
        SetPasswordComplexityConfigurationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetPasswordComplexityConfigurationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetPasswordComplexityConfigurationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetPasswordComplexityConfigurationResponse response) {
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
        public Builder body(SetPasswordComplexityConfigurationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetPasswordComplexityConfigurationResponse build() {
            return new SetPasswordComplexityConfigurationResponse(this);
        } 

    } 

}
