// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateVcoRouteEntryResponse} extends {@link TeaModel}
 *
 * <p>CreateVcoRouteEntryResponse</p>
 */
public class CreateVcoRouteEntryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateVcoRouteEntryResponseBody body;

    private CreateVcoRouteEntryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateVcoRouteEntryResponse create() {
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
    public CreateVcoRouteEntryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateVcoRouteEntryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateVcoRouteEntryResponseBody body);

        @Override
        CreateVcoRouteEntryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateVcoRouteEntryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateVcoRouteEntryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateVcoRouteEntryResponse response) {
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
        public Builder body(CreateVcoRouteEntryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateVcoRouteEntryResponse build() {
            return new CreateVcoRouteEntryResponse(this);
        } 

    } 

}
