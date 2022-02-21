// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DisableCenVbrHealthCheckResponse} extends {@link TeaModel}
 *
 * <p>DisableCenVbrHealthCheckResponse</p>
 */
public class DisableCenVbrHealthCheckResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DisableCenVbrHealthCheckResponseBody body;

    private DisableCenVbrHealthCheckResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DisableCenVbrHealthCheckResponse create() {
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
    public DisableCenVbrHealthCheckResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DisableCenVbrHealthCheckResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DisableCenVbrHealthCheckResponseBody body);

        @Override
        DisableCenVbrHealthCheckResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DisableCenVbrHealthCheckResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DisableCenVbrHealthCheckResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DisableCenVbrHealthCheckResponse response) {
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
        public Builder body(DisableCenVbrHealthCheckResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DisableCenVbrHealthCheckResponse build() {
            return new DisableCenVbrHealthCheckResponse(this);
        } 

    } 

}
