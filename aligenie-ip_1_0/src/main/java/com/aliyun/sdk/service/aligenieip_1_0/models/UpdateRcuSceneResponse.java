// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aligenieip_1_0.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateRcuSceneResponse} extends {@link TeaModel}
 *
 * <p>UpdateRcuSceneResponse</p>
 */
public class UpdateRcuSceneResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateRcuSceneResponseBody body;

    private UpdateRcuSceneResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateRcuSceneResponse create() {
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
    public UpdateRcuSceneResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateRcuSceneResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateRcuSceneResponseBody body);

        @Override
        UpdateRcuSceneResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateRcuSceneResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateRcuSceneResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateRcuSceneResponse response) {
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
        public Builder body(UpdateRcuSceneResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateRcuSceneResponse build() {
            return new UpdateRcuSceneResponse(this);
        } 

    } 

}
