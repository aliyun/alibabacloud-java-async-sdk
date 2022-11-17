// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartOmsOpenAPIProjectResponse} extends {@link TeaModel}
 *
 * <p>StartOmsOpenAPIProjectResponse</p>
 */
public class StartOmsOpenAPIProjectResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StartOmsOpenAPIProjectResponseBody body;

    private StartOmsOpenAPIProjectResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StartOmsOpenAPIProjectResponse create() {
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
    public StartOmsOpenAPIProjectResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StartOmsOpenAPIProjectResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StartOmsOpenAPIProjectResponseBody body);

        @Override
        StartOmsOpenAPIProjectResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StartOmsOpenAPIProjectResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StartOmsOpenAPIProjectResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StartOmsOpenAPIProjectResponse response) {
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
        public Builder body(StartOmsOpenAPIProjectResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StartOmsOpenAPIProjectResponse build() {
            return new StartOmsOpenAPIProjectResponse(this);
        } 

    } 

}
