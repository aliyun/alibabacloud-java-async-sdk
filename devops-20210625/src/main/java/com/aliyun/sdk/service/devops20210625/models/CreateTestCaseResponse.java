// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateTestCaseResponse} extends {@link TeaModel}
 *
 * <p>CreateTestCaseResponse</p>
 */
public class CreateTestCaseResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateTestCaseResponseBody body;

    private CreateTestCaseResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateTestCaseResponse create() {
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
    public CreateTestCaseResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateTestCaseResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateTestCaseResponseBody body);

        @Override
        CreateTestCaseResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateTestCaseResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateTestCaseResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateTestCaseResponse response) {
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
        public Builder body(CreateTestCaseResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateTestCaseResponse build() {
            return new CreateTestCaseResponse(this);
        } 

    } 

}
