// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vs20181212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StopParentPlatformResponse} extends {@link TeaModel}
 *
 * <p>StopParentPlatformResponse</p>
 */
public class StopParentPlatformResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StopParentPlatformResponseBody body;

    private StopParentPlatformResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StopParentPlatformResponse create() {
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
    public StopParentPlatformResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StopParentPlatformResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StopParentPlatformResponseBody body);

        @Override
        StopParentPlatformResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StopParentPlatformResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StopParentPlatformResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StopParentPlatformResponse response) {
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
        public Builder body(StopParentPlatformResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StopParentPlatformResponse build() {
            return new StopParentPlatformResponse(this);
        } 

    } 

}
