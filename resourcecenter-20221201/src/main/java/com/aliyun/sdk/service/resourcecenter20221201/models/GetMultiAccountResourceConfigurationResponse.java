// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.resourcecenter20221201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMultiAccountResourceConfigurationResponse} extends {@link TeaModel}
 *
 * <p>GetMultiAccountResourceConfigurationResponse</p>
 */
public class GetMultiAccountResourceConfigurationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetMultiAccountResourceConfigurationResponseBody body;

    private GetMultiAccountResourceConfigurationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetMultiAccountResourceConfigurationResponse create() {
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
    public GetMultiAccountResourceConfigurationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetMultiAccountResourceConfigurationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetMultiAccountResourceConfigurationResponseBody body);

        @Override
        GetMultiAccountResourceConfigurationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetMultiAccountResourceConfigurationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetMultiAccountResourceConfigurationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetMultiAccountResourceConfigurationResponse response) {
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
        public Builder body(GetMultiAccountResourceConfigurationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetMultiAccountResourceConfigurationResponse build() {
            return new GetMultiAccountResourceConfigurationResponse(this);
        } 

    } 

}
