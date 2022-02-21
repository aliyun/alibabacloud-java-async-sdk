// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cbn20170912.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCenRouteMapResponse} extends {@link TeaModel}
 *
 * <p>CreateCenRouteMapResponse</p>
 */
public class CreateCenRouteMapResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateCenRouteMapResponseBody body;

    private CreateCenRouteMapResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateCenRouteMapResponse create() {
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
    public CreateCenRouteMapResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateCenRouteMapResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateCenRouteMapResponseBody body);

        @Override
        CreateCenRouteMapResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateCenRouteMapResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateCenRouteMapResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateCenRouteMapResponse response) {
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
        public Builder body(CreateCenRouteMapResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateCenRouteMapResponse build() {
            return new CreateCenRouteMapResponse(this);
        } 

    } 

}
