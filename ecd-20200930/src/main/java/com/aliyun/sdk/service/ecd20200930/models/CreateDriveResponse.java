// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDriveResponse} extends {@link TeaModel}
 *
 * <p>CreateDriveResponse</p>
 */
public class CreateDriveResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateDriveResponseBody body;

    private CreateDriveResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateDriveResponse create() {
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
    public CreateDriveResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateDriveResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateDriveResponseBody body);

        @Override
        CreateDriveResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateDriveResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateDriveResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateDriveResponse response) {
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
        public Builder body(CreateDriveResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateDriveResponse build() {
            return new CreateDriveResponse(this);
        } 

    } 

}
