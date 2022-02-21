// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DecommissionHostComponentResponse} extends {@link TeaModel}
 *
 * <p>DecommissionHostComponentResponse</p>
 */
public class DecommissionHostComponentResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DecommissionHostComponentResponseBody body;

    private DecommissionHostComponentResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DecommissionHostComponentResponse create() {
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
    public DecommissionHostComponentResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DecommissionHostComponentResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DecommissionHostComponentResponseBody body);

        @Override
        DecommissionHostComponentResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DecommissionHostComponentResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DecommissionHostComponentResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DecommissionHostComponentResponse response) {
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
        public Builder body(DecommissionHostComponentResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DecommissionHostComponentResponse build() {
            return new DecommissionHostComponentResponse(this);
        } 

    } 

}
