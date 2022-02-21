// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreatePictureSearchJobResponse} extends {@link TeaModel}
 *
 * <p>CreatePictureSearchJobResponse</p>
 */
public class CreatePictureSearchJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreatePictureSearchJobResponseBody body;

    private CreatePictureSearchJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreatePictureSearchJobResponse create() {
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
    public CreatePictureSearchJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreatePictureSearchJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreatePictureSearchJobResponseBody body);

        @Override
        CreatePictureSearchJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreatePictureSearchJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreatePictureSearchJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreatePictureSearchJobResponse response) {
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
        public Builder body(CreatePictureSearchJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreatePictureSearchJobResponse build() {
            return new CreatePictureSearchJobResponse(this);
        } 

    } 

}
