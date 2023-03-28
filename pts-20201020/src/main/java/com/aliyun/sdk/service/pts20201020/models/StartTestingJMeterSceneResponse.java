// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pts20201020.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link StartTestingJMeterSceneResponse} extends {@link TeaModel}
 *
 * <p>StartTestingJMeterSceneResponse</p>
 */
public class StartTestingJMeterSceneResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private StartTestingJMeterSceneResponseBody body;

    private StartTestingJMeterSceneResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static StartTestingJMeterSceneResponse create() {
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
    public StartTestingJMeterSceneResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<StartTestingJMeterSceneResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(StartTestingJMeterSceneResponseBody body);

        @Override
        StartTestingJMeterSceneResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<StartTestingJMeterSceneResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private StartTestingJMeterSceneResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(StartTestingJMeterSceneResponse response) {
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
        public Builder body(StartTestingJMeterSceneResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public StartTestingJMeterSceneResponse build() {
            return new StartTestingJMeterSceneResponse(this);
        } 

    } 

}
