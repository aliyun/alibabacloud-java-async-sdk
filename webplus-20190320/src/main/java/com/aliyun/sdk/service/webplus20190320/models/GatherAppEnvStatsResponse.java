// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.webplus20190320.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GatherAppEnvStatsResponse} extends {@link TeaModel}
 *
 * <p>GatherAppEnvStatsResponse</p>
 */
public class GatherAppEnvStatsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GatherAppEnvStatsResponseBody body;

    private GatherAppEnvStatsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GatherAppEnvStatsResponse create() {
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
    public GatherAppEnvStatsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GatherAppEnvStatsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GatherAppEnvStatsResponseBody body);

        @Override
        GatherAppEnvStatsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GatherAppEnvStatsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GatherAppEnvStatsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GatherAppEnvStatsResponse response) {
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
        public Builder body(GatherAppEnvStatsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GatherAppEnvStatsResponse build() {
            return new GatherAppEnvStatsResponse(this);
        } 

    } 

}
