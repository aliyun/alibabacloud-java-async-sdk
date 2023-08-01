// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sls20201230.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.sls.models.*;

/**
 * {@link GetConfigResponse} extends {@link TeaModel}
 *
 * <p>GetConfigResponse</p>
 */
public class GetConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private LogtailConfig body;

    private GetConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetConfigResponse create() {
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
    public LogtailConfig getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(LogtailConfig body);

        @Override
        GetConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private LogtailConfig body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetConfigResponse response) {
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
        public Builder body(LogtailConfig body) {
            this.body = body;
            return this;
        }

        @Override
        public GetConfigResponse build() {
            return new GetConfigResponse(this);
        } 

    } 

}
