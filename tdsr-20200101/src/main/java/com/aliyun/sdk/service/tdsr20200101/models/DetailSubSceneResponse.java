// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DetailSubSceneResponse} extends {@link TeaModel}
 *
 * <p>DetailSubSceneResponse</p>
 */
public class DetailSubSceneResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DetailSubSceneResponseBody body;

    private DetailSubSceneResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DetailSubSceneResponse create() {
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
    public DetailSubSceneResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DetailSubSceneResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DetailSubSceneResponseBody body);

        @Override
        DetailSubSceneResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DetailSubSceneResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DetailSubSceneResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DetailSubSceneResponse response) {
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
        public Builder body(DetailSubSceneResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DetailSubSceneResponse build() {
            return new DetailSubSceneResponse(this);
        } 

    } 

}
