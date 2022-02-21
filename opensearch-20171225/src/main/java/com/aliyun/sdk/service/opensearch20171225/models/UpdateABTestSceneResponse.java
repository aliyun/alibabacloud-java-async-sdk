// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateABTestSceneResponse} extends {@link TeaModel}
 *
 * <p>UpdateABTestSceneResponse</p>
 */
public class UpdateABTestSceneResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateABTestSceneResponseBody body;

    private UpdateABTestSceneResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateABTestSceneResponse create() {
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
    public UpdateABTestSceneResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateABTestSceneResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateABTestSceneResponseBody body);

        @Override
        UpdateABTestSceneResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateABTestSceneResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateABTestSceneResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateABTestSceneResponse response) {
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
        public Builder body(UpdateABTestSceneResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateABTestSceneResponse build() {
            return new UpdateABTestSceneResponse(this);
        } 

    } 

}
