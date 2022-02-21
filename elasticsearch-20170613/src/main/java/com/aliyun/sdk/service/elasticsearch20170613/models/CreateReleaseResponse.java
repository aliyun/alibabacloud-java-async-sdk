// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.elasticsearch20170613.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateReleaseResponse} extends {@link TeaModel}
 *
 * <p>CreateReleaseResponse</p>
 */
public class CreateReleaseResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateReleaseResponseBody body;

    private CreateReleaseResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateReleaseResponse create() {
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
    public CreateReleaseResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateReleaseResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateReleaseResponseBody body);

        @Override
        CreateReleaseResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateReleaseResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateReleaseResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateReleaseResponse response) {
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
        public Builder body(CreateReleaseResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateReleaseResponse build() {
            return new CreateReleaseResponse(this);
        } 

    } 

}
