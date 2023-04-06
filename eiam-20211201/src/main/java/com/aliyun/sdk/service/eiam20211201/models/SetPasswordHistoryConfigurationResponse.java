// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link SetPasswordHistoryConfigurationResponse} extends {@link TeaModel}
 *
 * <p>SetPasswordHistoryConfigurationResponse</p>
 */
public class SetPasswordHistoryConfigurationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private SetPasswordHistoryConfigurationResponseBody body;

    private SetPasswordHistoryConfigurationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static SetPasswordHistoryConfigurationResponse create() {
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
    public SetPasswordHistoryConfigurationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<SetPasswordHistoryConfigurationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(SetPasswordHistoryConfigurationResponseBody body);

        @Override
        SetPasswordHistoryConfigurationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<SetPasswordHistoryConfigurationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private SetPasswordHistoryConfigurationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(SetPasswordHistoryConfigurationResponse response) {
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
        public Builder body(SetPasswordHistoryConfigurationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public SetPasswordHistoryConfigurationResponse build() {
            return new SetPasswordHistoryConfigurationResponse(this);
        } 

    } 

}
