// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateStackResponse} extends {@link TeaModel}
 *
 * <p>CreateStackResponse</p>
 */
public class CreateStackResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateStackResponseBody body;

    private CreateStackResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateStackResponse create() {
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
    public CreateStackResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateStackResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateStackResponseBody body);

        @Override
        CreateStackResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateStackResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateStackResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateStackResponse response) {
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
        public Builder body(CreateStackResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateStackResponse build() {
            return new CreateStackResponse(this);
        } 

    } 

}
