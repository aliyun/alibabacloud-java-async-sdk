// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ens20171110.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link RescaleApplicationResponse} extends {@link TeaModel}
 *
 * <p>RescaleApplicationResponse</p>
 */
public class RescaleApplicationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private RescaleApplicationResponseBody body;

    private RescaleApplicationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static RescaleApplicationResponse create() {
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
    public RescaleApplicationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<RescaleApplicationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(RescaleApplicationResponseBody body);

        @Override
        RescaleApplicationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<RescaleApplicationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private RescaleApplicationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(RescaleApplicationResponse response) {
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
        public Builder body(RescaleApplicationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public RescaleApplicationResponse build() {
            return new RescaleApplicationResponse(this);
        } 

    } 

}
