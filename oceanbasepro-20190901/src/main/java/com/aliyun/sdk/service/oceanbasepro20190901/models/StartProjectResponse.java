// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.oceanbasepro20190901.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartProjectResponse} extends {@link TeaModel}
 *
 * <p>StartProjectResponse</p>
 */
public class StartProjectResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StartProjectResponseBody body;

    private StartProjectResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StartProjectResponse create() {
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
    public StartProjectResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StartProjectResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StartProjectResponseBody body);

        @Override
        StartProjectResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StartProjectResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StartProjectResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StartProjectResponse response) {
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
        public Builder body(StartProjectResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StartProjectResponse build() {
            return new StartProjectResponse(this);
        } 

    } 

}
