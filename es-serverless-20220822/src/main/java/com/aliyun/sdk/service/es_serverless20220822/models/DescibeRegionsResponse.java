// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.es_serverless20220822.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DescibeRegionsResponse} extends {@link TeaModel}
 *
 * <p>DescibeRegionsResponse</p>
 */
public class DescibeRegionsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DescibeRegionsResponseBody body;

    private DescibeRegionsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DescibeRegionsResponse create() {
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
    public DescibeRegionsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DescibeRegionsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DescibeRegionsResponseBody body);

        @Override
        DescibeRegionsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DescibeRegionsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DescibeRegionsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DescibeRegionsResponse response) {
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
        public Builder body(DescibeRegionsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DescibeRegionsResponse build() {
            return new DescibeRegionsResponse(this);
        } 

    } 

}
