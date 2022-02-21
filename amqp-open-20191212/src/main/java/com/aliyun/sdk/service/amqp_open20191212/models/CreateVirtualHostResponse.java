// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.amqp_open20191212.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateVirtualHostResponse} extends {@link TeaModel}
 *
 * <p>CreateVirtualHostResponse</p>
 */
public class CreateVirtualHostResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateVirtualHostResponseBody body;

    private CreateVirtualHostResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateVirtualHostResponse create() {
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
    public CreateVirtualHostResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateVirtualHostResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateVirtualHostResponseBody body);

        @Override
        CreateVirtualHostResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateVirtualHostResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateVirtualHostResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateVirtualHostResponse response) {
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
        public Builder body(CreateVirtualHostResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateVirtualHostResponse build() {
            return new CreateVirtualHostResponse(this);
        } 

    } 

}
