// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.tdsr20200101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateSubSceneResponse} extends {@link TeaModel}
 *
 * <p>UpdateSubSceneResponse</p>
 */
public class UpdateSubSceneResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateSubSceneResponseBody body;

    private UpdateSubSceneResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateSubSceneResponse create() {
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
    public UpdateSubSceneResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateSubSceneResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateSubSceneResponseBody body);

        @Override
        UpdateSubSceneResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateSubSceneResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateSubSceneResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateSubSceneResponse response) {
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
        public Builder body(UpdateSubSceneResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateSubSceneResponse build() {
            return new UpdateSubSceneResponse(this);
        } 

    } 

}
