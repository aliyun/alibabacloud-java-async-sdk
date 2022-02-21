// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateAutoResourceOptimizeConfigResponse} extends {@link TeaModel}
 *
 * <p>UpdateAutoResourceOptimizeConfigResponse</p>
 */
public class UpdateAutoResourceOptimizeConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateAutoResourceOptimizeConfigResponseBody body;

    private UpdateAutoResourceOptimizeConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateAutoResourceOptimizeConfigResponse create() {
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
    public UpdateAutoResourceOptimizeConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateAutoResourceOptimizeConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateAutoResourceOptimizeConfigResponseBody body);

        @Override
        UpdateAutoResourceOptimizeConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateAutoResourceOptimizeConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateAutoResourceOptimizeConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateAutoResourceOptimizeConfigResponse response) {
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
        public Builder body(UpdateAutoResourceOptimizeConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateAutoResourceOptimizeConfigResponse build() {
            return new UpdateAutoResourceOptimizeConfigResponse(this);
        } 

    } 

}
