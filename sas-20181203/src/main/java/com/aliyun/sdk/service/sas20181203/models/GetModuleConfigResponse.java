// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetModuleConfigResponse} extends {@link TeaModel}
 *
 * <p>GetModuleConfigResponse</p>
 */
public class GetModuleConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetModuleConfigResponseBody body;

    private GetModuleConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetModuleConfigResponse create() {
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
    public GetModuleConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetModuleConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetModuleConfigResponseBody body);

        @Override
        GetModuleConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetModuleConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetModuleConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetModuleConfigResponse response) {
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
        public Builder body(GetModuleConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetModuleConfigResponse build() {
            return new GetModuleConfigResponse(this);
        } 

    } 

}
