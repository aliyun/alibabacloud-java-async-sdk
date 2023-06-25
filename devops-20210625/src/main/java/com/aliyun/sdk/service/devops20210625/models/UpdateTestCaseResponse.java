// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.devops20210625.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link UpdateTestCaseResponse} extends {@link TeaModel}
 *
 * <p>UpdateTestCaseResponse</p>
 */
public class UpdateTestCaseResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private UpdateTestCaseResponseBody body;

    private UpdateTestCaseResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static UpdateTestCaseResponse create() {
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
    public UpdateTestCaseResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<UpdateTestCaseResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(UpdateTestCaseResponseBody body);

        @Override
        UpdateTestCaseResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<UpdateTestCaseResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private UpdateTestCaseResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(UpdateTestCaseResponse response) {
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
        public Builder body(UpdateTestCaseResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public UpdateTestCaseResponse build() {
            return new UpdateTestCaseResponse(this);
        } 

    } 

}
