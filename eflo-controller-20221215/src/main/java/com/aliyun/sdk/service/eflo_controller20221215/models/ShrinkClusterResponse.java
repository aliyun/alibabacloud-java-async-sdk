// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo_controller20221215.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ShrinkClusterResponse} extends {@link TeaModel}
 *
 * <p>ShrinkClusterResponse</p>
 */
public class ShrinkClusterResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ShrinkClusterResponseBody body;

    private ShrinkClusterResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ShrinkClusterResponse create() {
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
    public ShrinkClusterResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ShrinkClusterResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ShrinkClusterResponseBody body);

        @Override
        ShrinkClusterResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ShrinkClusterResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ShrinkClusterResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ShrinkClusterResponse response) {
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
        public Builder body(ShrinkClusterResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ShrinkClusterResponse build() {
            return new ShrinkClusterResponse(this);
        } 

    } 

}
