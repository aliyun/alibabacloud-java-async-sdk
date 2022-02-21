// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RescaleApplicationVerticallyResponse} extends {@link TeaModel}
 *
 * <p>RescaleApplicationVerticallyResponse</p>
 */
public class RescaleApplicationVerticallyResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RescaleApplicationVerticallyResponseBody body;

    private RescaleApplicationVerticallyResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RescaleApplicationVerticallyResponse create() {
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
    public RescaleApplicationVerticallyResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RescaleApplicationVerticallyResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RescaleApplicationVerticallyResponseBody body);

        @Override
        RescaleApplicationVerticallyResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RescaleApplicationVerticallyResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RescaleApplicationVerticallyResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RescaleApplicationVerticallyResponse response) {
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
        public Builder body(RescaleApplicationVerticallyResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RescaleApplicationVerticallyResponse build() {
            return new RescaleApplicationVerticallyResponse(this);
        } 

    } 

}
