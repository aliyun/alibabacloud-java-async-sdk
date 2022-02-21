// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.drds20190123.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDrdsInstanceResponse} extends {@link TeaModel}
 *
 * <p>CreateDrdsInstanceResponse</p>
 */
public class CreateDrdsInstanceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateDrdsInstanceResponseBody body;

    private CreateDrdsInstanceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateDrdsInstanceResponse create() {
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
    public CreateDrdsInstanceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateDrdsInstanceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateDrdsInstanceResponseBody body);

        @Override
        CreateDrdsInstanceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateDrdsInstanceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateDrdsInstanceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateDrdsInstanceResponse response) {
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
        public Builder body(CreateDrdsInstanceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateDrdsInstanceResponse build() {
            return new CreateDrdsInstanceResponse(this);
        } 

    } 

}
