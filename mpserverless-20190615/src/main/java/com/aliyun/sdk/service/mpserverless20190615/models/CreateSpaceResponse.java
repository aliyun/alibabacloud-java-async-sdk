// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSpaceResponse} extends {@link TeaModel}
 *
 * <p>CreateSpaceResponse</p>
 */
public class CreateSpaceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateSpaceResponseBody body;

    private CreateSpaceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateSpaceResponse create() {
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
    public CreateSpaceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateSpaceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateSpaceResponseBody body);

        @Override
        CreateSpaceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateSpaceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateSpaceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateSpaceResponse response) {
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
        public Builder body(CreateSpaceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateSpaceResponse build() {
            return new CreateSpaceResponse(this);
        } 

    } 

}
