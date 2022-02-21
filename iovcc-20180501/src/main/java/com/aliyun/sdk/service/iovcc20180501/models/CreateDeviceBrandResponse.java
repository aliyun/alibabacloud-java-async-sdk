// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDeviceBrandResponse} extends {@link TeaModel}
 *
 * <p>CreateDeviceBrandResponse</p>
 */
public class CreateDeviceBrandResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateDeviceBrandResponseBody body;

    private CreateDeviceBrandResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateDeviceBrandResponse create() {
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
    public CreateDeviceBrandResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateDeviceBrandResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateDeviceBrandResponseBody body);

        @Override
        CreateDeviceBrandResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateDeviceBrandResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateDeviceBrandResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateDeviceBrandResponse response) {
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
        public Builder body(CreateDeviceBrandResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateDeviceBrandResponse build() {
            return new CreateDeviceBrandResponse(this);
        } 

    } 

}
