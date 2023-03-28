// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pts20201020.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RemoveOpenJMeterSceneResponse} extends {@link TeaModel}
 *
 * <p>RemoveOpenJMeterSceneResponse</p>
 */
public class RemoveOpenJMeterSceneResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RemoveOpenJMeterSceneResponseBody body;

    private RemoveOpenJMeterSceneResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RemoveOpenJMeterSceneResponse create() {
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
    public RemoveOpenJMeterSceneResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RemoveOpenJMeterSceneResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RemoveOpenJMeterSceneResponseBody body);

        @Override
        RemoveOpenJMeterSceneResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RemoveOpenJMeterSceneResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RemoveOpenJMeterSceneResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RemoveOpenJMeterSceneResponse response) {
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
        public Builder body(RemoveOpenJMeterSceneResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RemoveOpenJMeterSceneResponse build() {
            return new RemoveOpenJMeterSceneResponse(this);
        } 

    } 

}
