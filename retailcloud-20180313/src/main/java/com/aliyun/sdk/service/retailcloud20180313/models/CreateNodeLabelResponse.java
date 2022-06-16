// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.retailcloud20180313.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateNodeLabelResponse} extends {@link TeaModel}
 *
 * <p>CreateNodeLabelResponse</p>
 */
public class CreateNodeLabelResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateNodeLabelResponseBody body;

    private CreateNodeLabelResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateNodeLabelResponse create() {
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
    public CreateNodeLabelResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateNodeLabelResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateNodeLabelResponseBody body);

        @Override
        CreateNodeLabelResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateNodeLabelResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateNodeLabelResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateNodeLabelResponse response) {
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
        public Builder body(CreateNodeLabelResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateNodeLabelResponse build() {
            return new CreateNodeLabelResponse(this);
        } 

    } 

}
