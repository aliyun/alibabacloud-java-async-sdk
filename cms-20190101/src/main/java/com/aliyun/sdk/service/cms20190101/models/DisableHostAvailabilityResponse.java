// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableHostAvailabilityResponse} extends {@link TeaModel}
 *
 * <p>DisableHostAvailabilityResponse</p>
 */
public class DisableHostAvailabilityResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DisableHostAvailabilityResponseBody body;

    private DisableHostAvailabilityResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DisableHostAvailabilityResponse create() {
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
    public DisableHostAvailabilityResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DisableHostAvailabilityResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DisableHostAvailabilityResponseBody body);

        @Override
        DisableHostAvailabilityResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DisableHostAvailabilityResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DisableHostAvailabilityResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DisableHostAvailabilityResponse response) {
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
        public Builder body(DisableHostAvailabilityResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DisableHostAvailabilityResponse build() {
            return new DisableHostAvailabilityResponse(this);
        } 

    } 

}
