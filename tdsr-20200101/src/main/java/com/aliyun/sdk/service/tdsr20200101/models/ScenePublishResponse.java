// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ScenePublishResponse} extends {@link TeaModel}
 *
 * <p>ScenePublishResponse</p>
 */
public class ScenePublishResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ScenePublishResponseBody body;

    private ScenePublishResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ScenePublishResponse create() {
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
    public ScenePublishResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ScenePublishResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ScenePublishResponseBody body);

        @Override
        ScenePublishResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ScenePublishResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ScenePublishResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ScenePublishResponse response) {
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
        public Builder body(ScenePublishResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ScenePublishResponse build() {
            return new ScenePublishResponse(this);
        } 

    } 

}
