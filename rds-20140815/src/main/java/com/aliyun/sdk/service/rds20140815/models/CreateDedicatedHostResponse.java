// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.rds20140815.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDedicatedHostResponse} extends {@link TeaModel}
 *
 * <p>CreateDedicatedHostResponse</p>
 */
public class CreateDedicatedHostResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateDedicatedHostResponseBody body;

    private CreateDedicatedHostResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateDedicatedHostResponse create() {
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
    public CreateDedicatedHostResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateDedicatedHostResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateDedicatedHostResponseBody body);

        @Override
        CreateDedicatedHostResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateDedicatedHostResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateDedicatedHostResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateDedicatedHostResponse response) {
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
        public Builder body(CreateDedicatedHostResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateDedicatedHostResponse build() {
            return new CreateDedicatedHostResponse(this);
        } 

    } 

}
