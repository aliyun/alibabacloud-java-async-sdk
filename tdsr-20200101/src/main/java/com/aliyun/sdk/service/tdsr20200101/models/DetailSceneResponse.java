// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetailSceneResponse} extends {@link TeaModel}
 *
 * <p>DetailSceneResponse</p>
 */
public class DetailSceneResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DetailSceneResponseBody body;

    private DetailSceneResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DetailSceneResponse create() {
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
    public DetailSceneResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DetailSceneResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DetailSceneResponseBody body);

        @Override
        DetailSceneResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DetailSceneResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DetailSceneResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DetailSceneResponse response) {
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
        public Builder body(DetailSceneResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DetailSceneResponse build() {
            return new DetailSceneResponse(this);
        } 

    } 

}
