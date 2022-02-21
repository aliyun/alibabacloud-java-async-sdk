// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateUpstreamAppKeyRelationsResponse} extends {@link TeaModel}
 *
 * <p>CreateUpstreamAppKeyRelationsResponse</p>
 */
public class CreateUpstreamAppKeyRelationsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateUpstreamAppKeyRelationsResponseBody body;

    private CreateUpstreamAppKeyRelationsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateUpstreamAppKeyRelationsResponse create() {
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
    public CreateUpstreamAppKeyRelationsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateUpstreamAppKeyRelationsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateUpstreamAppKeyRelationsResponseBody body);

        @Override
        CreateUpstreamAppKeyRelationsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateUpstreamAppKeyRelationsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateUpstreamAppKeyRelationsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateUpstreamAppKeyRelationsResponse response) {
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
        public Builder body(CreateUpstreamAppKeyRelationsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateUpstreamAppKeyRelationsResponse build() {
            return new CreateUpstreamAppKeyRelationsResponse(this);
        } 

    } 

}
