// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartCasterSceneResponse} extends {@link TeaModel}
 *
 * <p>StartCasterSceneResponse</p>
 */
public class StartCasterSceneResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StartCasterSceneResponseBody body;

    private StartCasterSceneResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StartCasterSceneResponse create() {
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
    public StartCasterSceneResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StartCasterSceneResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StartCasterSceneResponseBody body);

        @Override
        StartCasterSceneResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StartCasterSceneResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StartCasterSceneResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StartCasterSceneResponse response) {
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
        public Builder body(StartCasterSceneResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StartCasterSceneResponse build() {
            return new StartCasterSceneResponse(this);
        } 

    } 

}
