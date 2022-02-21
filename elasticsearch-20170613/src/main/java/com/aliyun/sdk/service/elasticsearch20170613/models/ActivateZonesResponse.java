// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ActivateZonesResponse} extends {@link TeaModel}
 *
 * <p>ActivateZonesResponse</p>
 */
public class ActivateZonesResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ActivateZonesResponseBody body;

    private ActivateZonesResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ActivateZonesResponse create() {
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
    public ActivateZonesResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ActivateZonesResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ActivateZonesResponseBody body);

        @Override
        ActivateZonesResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ActivateZonesResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ActivateZonesResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ActivateZonesResponse response) {
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
        public Builder body(ActivateZonesResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ActivateZonesResponse build() {
            return new ActivateZonesResponse(this);
        } 

    } 

}
