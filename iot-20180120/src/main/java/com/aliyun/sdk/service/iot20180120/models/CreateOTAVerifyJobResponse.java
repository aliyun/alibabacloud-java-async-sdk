// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateOTAVerifyJobResponse} extends {@link TeaModel}
 *
 * <p>CreateOTAVerifyJobResponse</p>
 */
public class CreateOTAVerifyJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateOTAVerifyJobResponseBody body;

    private CreateOTAVerifyJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateOTAVerifyJobResponse create() {
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
    public CreateOTAVerifyJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateOTAVerifyJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateOTAVerifyJobResponseBody body);

        @Override
        CreateOTAVerifyJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateOTAVerifyJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateOTAVerifyJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateOTAVerifyJobResponse response) {
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
        public Builder body(CreateOTAVerifyJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateOTAVerifyJobResponse build() {
            return new CreateOTAVerifyJobResponse(this);
        } 

    } 

}
