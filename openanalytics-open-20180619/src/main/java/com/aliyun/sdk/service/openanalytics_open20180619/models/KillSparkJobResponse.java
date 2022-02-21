// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.openanalytics_open20180619.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link KillSparkJobResponse} extends {@link TeaModel}
 *
 * <p>KillSparkJobResponse</p>
 */
public class KillSparkJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private KillSparkJobResponseBody body;

    private KillSparkJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static KillSparkJobResponse create() {
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
    public KillSparkJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<KillSparkJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(KillSparkJobResponseBody body);

        @Override
        KillSparkJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<KillSparkJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private KillSparkJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(KillSparkJobResponse response) {
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
        public Builder body(KillSparkJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public KillSparkJobResponse build() {
            return new KillSparkJobResponse(this);
        } 

    } 

}
