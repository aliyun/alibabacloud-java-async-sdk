// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eflo20220530.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSubnetResponse} extends {@link TeaModel}
 *
 * <p>CreateSubnetResponse</p>
 */
public class CreateSubnetResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateSubnetResponseBody body;

    private CreateSubnetResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateSubnetResponse create() {
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
    public CreateSubnetResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateSubnetResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateSubnetResponseBody body);

        @Override
        CreateSubnetResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateSubnetResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateSubnetResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateSubnetResponse response) {
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
        public Builder body(CreateSubnetResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateSubnetResponse build() {
            return new CreateSubnetResponse(this);
        } 

    } 

}
