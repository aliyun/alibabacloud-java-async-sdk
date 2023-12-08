// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.adb20211201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link KillSparkAppResponse} extends {@link TeaModel}
 *
 * <p>KillSparkAppResponse</p>
 */
public class KillSparkAppResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private KillSparkAppResponseBody body;

    private KillSparkAppResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static KillSparkAppResponse create() {
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
    public KillSparkAppResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<KillSparkAppResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(KillSparkAppResponseBody body);

        @Override
        KillSparkAppResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<KillSparkAppResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private KillSparkAppResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(KillSparkAppResponse response) {
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
        public Builder body(KillSparkAppResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public KillSparkAppResponse build() {
            return new KillSparkAppResponse(this);
        } 

    } 

}
