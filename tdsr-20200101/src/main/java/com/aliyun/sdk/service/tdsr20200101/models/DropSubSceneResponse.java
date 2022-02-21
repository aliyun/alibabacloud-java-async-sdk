// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DropSubSceneResponse} extends {@link TeaModel}
 *
 * <p>DropSubSceneResponse</p>
 */
public class DropSubSceneResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DropSubSceneResponseBody body;

    private DropSubSceneResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DropSubSceneResponse create() {
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
    public DropSubSceneResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DropSubSceneResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DropSubSceneResponseBody body);

        @Override
        DropSubSceneResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DropSubSceneResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DropSubSceneResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DropSubSceneResponse response) {
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
        public Builder body(DropSubSceneResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DropSubSceneResponse build() {
            return new DropSubSceneResponse(this);
        } 

    } 

}
