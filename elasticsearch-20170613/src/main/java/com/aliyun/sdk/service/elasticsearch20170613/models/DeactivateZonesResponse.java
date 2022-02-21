// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeactivateZonesResponse} extends {@link TeaModel}
 *
 * <p>DeactivateZonesResponse</p>
 */
public class DeactivateZonesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeactivateZonesResponseBody body;

    private DeactivateZonesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeactivateZonesResponse create() {
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
    public DeactivateZonesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeactivateZonesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeactivateZonesResponseBody body);

        @Override
        DeactivateZonesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeactivateZonesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeactivateZonesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeactivateZonesResponse response) {
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
        public Builder body(DeactivateZonesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeactivateZonesResponse build() {
            return new DeactivateZonesResponse(this);
        } 

    } 

}
