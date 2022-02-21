// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDiskResponse} extends {@link TeaModel}
 *
 * <p>CreateDiskResponse</p>
 */
public class CreateDiskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateDiskResponseBody body;

    private CreateDiskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateDiskResponse create() {
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
    public CreateDiskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateDiskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateDiskResponseBody body);

        @Override
        CreateDiskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateDiskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateDiskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateDiskResponse response) {
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
        public Builder body(CreateDiskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateDiskResponse build() {
            return new CreateDiskResponse(this);
        } 

    } 

}
