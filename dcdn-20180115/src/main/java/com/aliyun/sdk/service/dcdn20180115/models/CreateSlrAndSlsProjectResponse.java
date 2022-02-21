// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dcdn20180115.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateSlrAndSlsProjectResponse} extends {@link TeaModel}
 *
 * <p>CreateSlrAndSlsProjectResponse</p>
 */
public class CreateSlrAndSlsProjectResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateSlrAndSlsProjectResponseBody body;

    private CreateSlrAndSlsProjectResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateSlrAndSlsProjectResponse create() {
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
    public CreateSlrAndSlsProjectResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateSlrAndSlsProjectResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateSlrAndSlsProjectResponseBody body);

        @Override
        CreateSlrAndSlsProjectResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateSlrAndSlsProjectResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateSlrAndSlsProjectResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateSlrAndSlsProjectResponse response) {
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
        public Builder body(CreateSlrAndSlsProjectResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateSlrAndSlsProjectResponse build() {
            return new CreateSlrAndSlsProjectResponse(this);
        } 

    } 

}
