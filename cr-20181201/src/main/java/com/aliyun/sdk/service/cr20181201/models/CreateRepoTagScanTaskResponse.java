// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRepoTagScanTaskResponse} extends {@link TeaModel}
 *
 * <p>CreateRepoTagScanTaskResponse</p>
 */
public class CreateRepoTagScanTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateRepoTagScanTaskResponseBody body;

    private CreateRepoTagScanTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateRepoTagScanTaskResponse create() {
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
    public CreateRepoTagScanTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateRepoTagScanTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateRepoTagScanTaskResponseBody body);

        @Override
        CreateRepoTagScanTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateRepoTagScanTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateRepoTagScanTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateRepoTagScanTaskResponse response) {
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
        public Builder body(CreateRepoTagScanTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateRepoTagScanTaskResponse build() {
            return new CreateRepoTagScanTaskResponse(this);
        } 

    } 

}
