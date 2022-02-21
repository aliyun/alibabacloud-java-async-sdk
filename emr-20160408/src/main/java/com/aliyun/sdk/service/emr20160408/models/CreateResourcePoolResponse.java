// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateResourcePoolResponse} extends {@link TeaModel}
 *
 * <p>CreateResourcePoolResponse</p>
 */
public class CreateResourcePoolResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateResourcePoolResponseBody body;

    private CreateResourcePoolResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateResourcePoolResponse create() {
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
    public CreateResourcePoolResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateResourcePoolResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateResourcePoolResponseBody body);

        @Override
        CreateResourcePoolResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateResourcePoolResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateResourcePoolResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateResourcePoolResponse response) {
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
        public Builder body(CreateResourcePoolResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateResourcePoolResponse build() {
            return new CreateResourcePoolResponse(this);
        } 

    } 

}
