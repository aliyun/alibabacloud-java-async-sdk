// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateJenkinsImageScanTaskResponse} extends {@link TeaModel}
 *
 * <p>CreateJenkinsImageScanTaskResponse</p>
 */
public class CreateJenkinsImageScanTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateJenkinsImageScanTaskResponseBody body;

    private CreateJenkinsImageScanTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateJenkinsImageScanTaskResponse create() {
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
    public CreateJenkinsImageScanTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateJenkinsImageScanTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateJenkinsImageScanTaskResponseBody body);

        @Override
        CreateJenkinsImageScanTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateJenkinsImageScanTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateJenkinsImageScanTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateJenkinsImageScanTaskResponse response) {
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
        public Builder body(CreateJenkinsImageScanTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateJenkinsImageScanTaskResponse build() {
            return new CreateJenkinsImageScanTaskResponse(this);
        } 

    } 

}
