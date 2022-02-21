// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.hbr20170908.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRestoreJobResponse} extends {@link TeaModel}
 *
 * <p>CreateRestoreJobResponse</p>
 */
public class CreateRestoreJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateRestoreJobResponseBody body;

    private CreateRestoreJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateRestoreJobResponse create() {
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
    public CreateRestoreJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateRestoreJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateRestoreJobResponseBody body);

        @Override
        CreateRestoreJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateRestoreJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateRestoreJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateRestoreJobResponse response) {
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
        public Builder body(CreateRestoreJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateRestoreJobResponse build() {
            return new CreateRestoreJobResponse(this);
        } 

    } 

}
