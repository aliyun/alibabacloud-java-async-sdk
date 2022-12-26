// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateContainerScanTaskResponse} extends {@link TeaModel}
 *
 * <p>CreateContainerScanTaskResponse</p>
 */
public class CreateContainerScanTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateContainerScanTaskResponseBody body;

    private CreateContainerScanTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateContainerScanTaskResponse create() {
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
    public CreateContainerScanTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateContainerScanTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateContainerScanTaskResponseBody body);

        @Override
        CreateContainerScanTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateContainerScanTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateContainerScanTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateContainerScanTaskResponse response) {
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
        public Builder body(CreateContainerScanTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateContainerScanTaskResponse build() {
            return new CreateContainerScanTaskResponse(this);
        } 

    } 

}
