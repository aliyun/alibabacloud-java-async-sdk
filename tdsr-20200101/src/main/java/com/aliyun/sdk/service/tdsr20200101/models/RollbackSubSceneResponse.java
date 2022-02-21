// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RollbackSubSceneResponse} extends {@link TeaModel}
 *
 * <p>RollbackSubSceneResponse</p>
 */
public class RollbackSubSceneResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RollbackSubSceneResponseBody body;

    private RollbackSubSceneResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RollbackSubSceneResponse create() {
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
    public RollbackSubSceneResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RollbackSubSceneResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RollbackSubSceneResponseBody body);

        @Override
        RollbackSubSceneResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RollbackSubSceneResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RollbackSubSceneResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RollbackSubSceneResponse response) {
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
        public Builder body(RollbackSubSceneResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RollbackSubSceneResponse build() {
            return new RollbackSubSceneResponse(this);
        } 

    } 

}
