// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cms20190101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableHostAvailabilityResponse} extends {@link TeaModel}
 *
 * <p>EnableHostAvailabilityResponse</p>
 */
public class EnableHostAvailabilityResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private EnableHostAvailabilityResponseBody body;

    private EnableHostAvailabilityResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static EnableHostAvailabilityResponse create() {
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
    public EnableHostAvailabilityResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EnableHostAvailabilityResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(EnableHostAvailabilityResponseBody body);

        @Override
        EnableHostAvailabilityResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EnableHostAvailabilityResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private EnableHostAvailabilityResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EnableHostAvailabilityResponse response) {
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
        public Builder body(EnableHostAvailabilityResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EnableHostAvailabilityResponse build() {
            return new EnableHostAvailabilityResponse(this);
        } 

    } 

}
