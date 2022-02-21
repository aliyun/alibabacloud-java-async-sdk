// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetAutoResourceOptimizeConfigResponse} extends {@link TeaModel}
 *
 * <p>GetAutoResourceOptimizeConfigResponse</p>
 */
public class GetAutoResourceOptimizeConfigResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetAutoResourceOptimizeConfigResponseBody body;

    private GetAutoResourceOptimizeConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetAutoResourceOptimizeConfigResponse create() {
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
    public GetAutoResourceOptimizeConfigResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetAutoResourceOptimizeConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetAutoResourceOptimizeConfigResponseBody body);

        @Override
        GetAutoResourceOptimizeConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetAutoResourceOptimizeConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetAutoResourceOptimizeConfigResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetAutoResourceOptimizeConfigResponse response) {
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
        public Builder body(GetAutoResourceOptimizeConfigResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetAutoResourceOptimizeConfigResponse build() {
            return new GetAutoResourceOptimizeConfigResponse(this);
        } 

    } 

}
