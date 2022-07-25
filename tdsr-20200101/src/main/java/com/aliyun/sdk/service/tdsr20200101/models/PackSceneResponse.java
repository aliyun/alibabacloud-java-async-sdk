// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link PackSceneResponse} extends {@link TeaModel}
 *
 * <p>PackSceneResponse</p>
 */
public class PackSceneResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private PackSceneResponseBody body;

    private PackSceneResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static PackSceneResponse create() {
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
    public PackSceneResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<PackSceneResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(PackSceneResponseBody body);

        @Override
        PackSceneResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<PackSceneResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private PackSceneResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(PackSceneResponse response) {
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
        public Builder body(PackSceneResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public PackSceneResponse build() {
            return new PackSceneResponse(this);
        } 

    } 

}
