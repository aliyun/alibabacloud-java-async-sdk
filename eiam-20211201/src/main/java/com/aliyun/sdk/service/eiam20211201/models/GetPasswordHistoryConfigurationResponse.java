// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eiam20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetPasswordHistoryConfigurationResponse} extends {@link TeaModel}
 *
 * <p>GetPasswordHistoryConfigurationResponse</p>
 */
public class GetPasswordHistoryConfigurationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetPasswordHistoryConfigurationResponseBody body;

    private GetPasswordHistoryConfigurationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetPasswordHistoryConfigurationResponse create() {
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
    public GetPasswordHistoryConfigurationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetPasswordHistoryConfigurationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetPasswordHistoryConfigurationResponseBody body);

        @Override
        GetPasswordHistoryConfigurationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetPasswordHistoryConfigurationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetPasswordHistoryConfigurationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetPasswordHistoryConfigurationResponse response) {
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
        public Builder body(GetPasswordHistoryConfigurationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetPasswordHistoryConfigurationResponse build() {
            return new GetPasswordHistoryConfigurationResponse(this);
        } 

    } 

}
