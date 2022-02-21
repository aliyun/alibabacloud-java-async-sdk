// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateSceneResponse} extends {@link TeaModel}
 *
 * <p>UpdateSceneResponse</p>
 */
public class UpdateSceneResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateSceneResponseBody body;

    private UpdateSceneResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateSceneResponse create() {
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
    public UpdateSceneResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateSceneResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateSceneResponseBody body);

        @Override
        UpdateSceneResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateSceneResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateSceneResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateSceneResponse response) {
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
        public Builder body(UpdateSceneResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateSceneResponse build() {
            return new UpdateSceneResponse(this);
        } 

    } 

}
