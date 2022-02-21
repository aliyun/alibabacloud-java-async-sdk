// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iot20180120.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateJobResponse} extends {@link TeaModel}
 *
 * <p>CreateJobResponse</p>
 */
public class CreateJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateJobResponseBody body;

    private CreateJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateJobResponse create() {
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
    public CreateJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateJobResponseBody body);

        @Override
        CreateJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateJobResponse response) {
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
        public Builder body(CreateJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateJobResponse build() {
            return new CreateJobResponse(this);
        } 

    } 

}
