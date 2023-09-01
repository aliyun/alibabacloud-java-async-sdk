// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.aiworkspace20210204.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateModelVersionLabelsResponse} extends {@link TeaModel}
 *
 * <p>CreateModelVersionLabelsResponse</p>
 */
public class CreateModelVersionLabelsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateModelVersionLabelsResponseBody body;

    private CreateModelVersionLabelsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateModelVersionLabelsResponse create() {
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
    public CreateModelVersionLabelsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateModelVersionLabelsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateModelVersionLabelsResponseBody body);

        @Override
        CreateModelVersionLabelsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateModelVersionLabelsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateModelVersionLabelsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateModelVersionLabelsResponse response) {
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
        public Builder body(CreateModelVersionLabelsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateModelVersionLabelsResponse build() {
            return new CreateModelVersionLabelsResponse(this);
        } 

    } 

}
