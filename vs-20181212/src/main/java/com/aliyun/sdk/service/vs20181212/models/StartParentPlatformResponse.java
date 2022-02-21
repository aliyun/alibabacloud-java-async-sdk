// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartParentPlatformResponse} extends {@link TeaModel}
 *
 * <p>StartParentPlatformResponse</p>
 */
public class StartParentPlatformResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StartParentPlatformResponseBody body;

    private StartParentPlatformResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StartParentPlatformResponse create() {
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
    public StartParentPlatformResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StartParentPlatformResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StartParentPlatformResponseBody body);

        @Override
        StartParentPlatformResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StartParentPlatformResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StartParentPlatformResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StartParentPlatformResponse response) {
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
        public Builder body(StartParentPlatformResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StartParentPlatformResponse build() {
            return new StartParentPlatformResponse(this);
        } 

    } 

}
