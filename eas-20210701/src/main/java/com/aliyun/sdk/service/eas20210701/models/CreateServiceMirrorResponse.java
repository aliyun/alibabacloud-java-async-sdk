// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.eas20210701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateServiceMirrorResponse} extends {@link TeaModel}
 *
 * <p>CreateServiceMirrorResponse</p>
 */
public class CreateServiceMirrorResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateServiceMirrorResponseBody body;

    private CreateServiceMirrorResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateServiceMirrorResponse create() {
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
    public CreateServiceMirrorResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateServiceMirrorResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateServiceMirrorResponseBody body);

        @Override
        CreateServiceMirrorResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateServiceMirrorResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateServiceMirrorResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateServiceMirrorResponse response) {
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
        public Builder body(CreateServiceMirrorResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateServiceMirrorResponse build() {
            return new CreateServiceMirrorResponse(this);
        } 

    } 

}
