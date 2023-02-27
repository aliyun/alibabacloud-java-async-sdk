// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ccc20200701.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateCallTagsResponse} extends {@link TeaModel}
 *
 * <p>CreateCallTagsResponse</p>
 */
public class CreateCallTagsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateCallTagsResponseBody body;

    private CreateCallTagsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateCallTagsResponse create() {
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
    public CreateCallTagsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateCallTagsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateCallTagsResponseBody body);

        @Override
        CreateCallTagsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateCallTagsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateCallTagsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateCallTagsResponse response) {
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
        public Builder body(CreateCallTagsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateCallTagsResponse build() {
            return new CreateCallTagsResponse(this);
        } 

    } 

}
