// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sae20190506.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateGreyTagRouteResponse} extends {@link TeaModel}
 *
 * <p>UpdateGreyTagRouteResponse</p>
 */
public class UpdateGreyTagRouteResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateGreyTagRouteResponseBody body;

    private UpdateGreyTagRouteResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateGreyTagRouteResponse create() {
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
    public UpdateGreyTagRouteResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateGreyTagRouteResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateGreyTagRouteResponseBody body);

        @Override
        UpdateGreyTagRouteResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateGreyTagRouteResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateGreyTagRouteResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateGreyTagRouteResponse response) {
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
        public Builder body(UpdateGreyTagRouteResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateGreyTagRouteResponse build() {
            return new UpdateGreyTagRouteResponse(this);
        } 

    } 

}
