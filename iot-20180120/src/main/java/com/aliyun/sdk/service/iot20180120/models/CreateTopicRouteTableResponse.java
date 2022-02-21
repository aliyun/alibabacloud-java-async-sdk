// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTopicRouteTableResponse} extends {@link TeaModel}
 *
 * <p>CreateTopicRouteTableResponse</p>
 */
public class CreateTopicRouteTableResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateTopicRouteTableResponseBody body;

    private CreateTopicRouteTableResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateTopicRouteTableResponse create() {
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
    public CreateTopicRouteTableResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateTopicRouteTableResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateTopicRouteTableResponseBody body);

        @Override
        CreateTopicRouteTableResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateTopicRouteTableResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateTopicRouteTableResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateTopicRouteTableResponse response) {
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
        public Builder body(CreateTopicRouteTableResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateTopicRouteTableResponse build() {
            return new CreateTopicRouteTableResponse(this);
        } 

    } 

}
