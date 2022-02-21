// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkvisual20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAIPlanResponse} extends {@link TeaModel}
 *
 * <p>CreateAIPlanResponse</p>
 */
public class CreateAIPlanResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateAIPlanResponseBody body;

    private CreateAIPlanResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateAIPlanResponse create() {
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
    public CreateAIPlanResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateAIPlanResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateAIPlanResponseBody body);

        @Override
        CreateAIPlanResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateAIPlanResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateAIPlanResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateAIPlanResponse response) {
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
        public Builder body(CreateAIPlanResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateAIPlanResponse build() {
            return new CreateAIPlanResponse(this);
        } 

    } 

}
