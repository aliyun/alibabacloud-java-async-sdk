// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.gemp20210413.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateProblemResponse} extends {@link TeaModel}
 *
 * <p>CreateProblemResponse</p>
 */
public class CreateProblemResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateProblemResponseBody body;

    private CreateProblemResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateProblemResponse create() {
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
    public CreateProblemResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateProblemResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateProblemResponseBody body);

        @Override
        CreateProblemResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateProblemResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateProblemResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateProblemResponse response) {
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
        public Builder body(CreateProblemResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateProblemResponse build() {
            return new CreateProblemResponse(this);
        } 

    } 

}
