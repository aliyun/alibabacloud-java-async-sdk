// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateResourceResponse} extends {@link TeaModel}
 *
 * <p>CreateResourceResponse</p>
 */
public class CreateResourceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateResourceResponseBody body;

    private CreateResourceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateResourceResponse create() {
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
    public CreateResourceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateResourceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateResourceResponseBody body);

        @Override
        CreateResourceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateResourceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateResourceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateResourceResponse response) {
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
        public Builder body(CreateResourceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateResourceResponse build() {
            return new CreateResourceResponse(this);
        } 

    } 

}
