// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateEdgeInstanceMessageRoutingResponse} extends {@link TeaModel}
 *
 * <p>CreateEdgeInstanceMessageRoutingResponse</p>
 */
public class CreateEdgeInstanceMessageRoutingResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateEdgeInstanceMessageRoutingResponseBody body;

    private CreateEdgeInstanceMessageRoutingResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateEdgeInstanceMessageRoutingResponse create() {
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
    public CreateEdgeInstanceMessageRoutingResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateEdgeInstanceMessageRoutingResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateEdgeInstanceMessageRoutingResponseBody body);

        @Override
        CreateEdgeInstanceMessageRoutingResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateEdgeInstanceMessageRoutingResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateEdgeInstanceMessageRoutingResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateEdgeInstanceMessageRoutingResponse response) {
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
        public Builder body(CreateEdgeInstanceMessageRoutingResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateEdgeInstanceMessageRoutingResponse build() {
            return new CreateEdgeInstanceMessageRoutingResponse(this);
        } 

    } 

}
