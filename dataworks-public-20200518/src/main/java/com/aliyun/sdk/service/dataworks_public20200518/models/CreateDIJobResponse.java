// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.dataworks_public20200518.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateDIJobResponse} extends {@link TeaModel}
 *
 * <p>CreateDIJobResponse</p>
 */
public class CreateDIJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateDIJobResponseBody body;

    private CreateDIJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateDIJobResponse create() {
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
    public CreateDIJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateDIJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateDIJobResponseBody body);

        @Override
        CreateDIJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateDIJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateDIJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateDIJobResponse response) {
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
        public Builder body(CreateDIJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateDIJobResponse build() {
            return new CreateDIJobResponse(this);
        } 

    } 

}
