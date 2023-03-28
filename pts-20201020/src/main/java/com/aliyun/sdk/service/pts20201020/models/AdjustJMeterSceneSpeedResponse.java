// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pts20201020.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link AdjustJMeterSceneSpeedResponse} extends {@link TeaModel}
 *
 * <p>AdjustJMeterSceneSpeedResponse</p>
 */
public class AdjustJMeterSceneSpeedResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private AdjustJMeterSceneSpeedResponseBody body;

    private AdjustJMeterSceneSpeedResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static AdjustJMeterSceneSpeedResponse create() {
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
    public AdjustJMeterSceneSpeedResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<AdjustJMeterSceneSpeedResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(AdjustJMeterSceneSpeedResponseBody body);

        @Override
        AdjustJMeterSceneSpeedResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<AdjustJMeterSceneSpeedResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private AdjustJMeterSceneSpeedResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(AdjustJMeterSceneSpeedResponse response) {
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
        public Builder body(AdjustJMeterSceneSpeedResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public AdjustJMeterSceneSpeedResponse build() {
            return new AdjustJMeterSceneSpeedResponse(this);
        } 

    } 

}
