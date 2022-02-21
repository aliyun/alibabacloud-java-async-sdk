// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePictureSearchAppResponse} extends {@link TeaModel}
 *
 * <p>CreatePictureSearchAppResponse</p>
 */
public class CreatePictureSearchAppResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreatePictureSearchAppResponseBody body;

    private CreatePictureSearchAppResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreatePictureSearchAppResponse create() {
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
    public CreatePictureSearchAppResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreatePictureSearchAppResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreatePictureSearchAppResponseBody body);

        @Override
        CreatePictureSearchAppResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreatePictureSearchAppResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreatePictureSearchAppResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreatePictureSearchAppResponse response) {
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
        public Builder body(CreatePictureSearchAppResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreatePictureSearchAppResponse build() {
            return new CreatePictureSearchAppResponse(this);
        } 

    } 

}
