// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetIntegrationConfigResponse} extends {@link TeaModel}
 *
 * <p>GetIntegrationConfigResponse</p>
 */
public class GetIntegrationConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetIntegrationConfigResponseBody body;

    private GetIntegrationConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetIntegrationConfigResponse create() {
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
    public GetIntegrationConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetIntegrationConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetIntegrationConfigResponseBody body);

        @Override
        GetIntegrationConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetIntegrationConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetIntegrationConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetIntegrationConfigResponse response) {
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
        public Builder body(GetIntegrationConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetIntegrationConfigResponse build() {
            return new GetIntegrationConfigResponse(this);
        } 

    } 

}
