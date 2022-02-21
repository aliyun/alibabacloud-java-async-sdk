// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DropSceneResponse} extends {@link TeaModel}
 *
 * <p>DropSceneResponse</p>
 */
public class DropSceneResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DropSceneResponseBody body;

    private DropSceneResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DropSceneResponse create() {
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
    public DropSceneResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DropSceneResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DropSceneResponseBody body);

        @Override
        DropSceneResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DropSceneResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DropSceneResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DropSceneResponse response) {
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
        public Builder body(DropSceneResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DropSceneResponse build() {
            return new DropSceneResponse(this);
        } 

    } 

}
