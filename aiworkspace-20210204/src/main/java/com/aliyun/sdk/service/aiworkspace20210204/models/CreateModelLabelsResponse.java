// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateModelLabelsResponse} extends {@link TeaModel}
 *
 * <p>CreateModelLabelsResponse</p>
 */
public class CreateModelLabelsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateModelLabelsResponseBody body;

    private CreateModelLabelsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateModelLabelsResponse create() {
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
    public CreateModelLabelsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateModelLabelsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateModelLabelsResponseBody body);

        @Override
        CreateModelLabelsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateModelLabelsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateModelLabelsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateModelLabelsResponse response) {
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
        public Builder body(CreateModelLabelsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateModelLabelsResponse build() {
            return new CreateModelLabelsResponse(this);
        } 

    } 

}
