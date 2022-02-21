// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ess20140828.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateScheduledTaskResponse} extends {@link TeaModel}
 *
 * <p>CreateScheduledTaskResponse</p>
 */
public class CreateScheduledTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateScheduledTaskResponseBody body;

    private CreateScheduledTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateScheduledTaskResponse create() {
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
    public CreateScheduledTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateScheduledTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateScheduledTaskResponseBody body);

        @Override
        CreateScheduledTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateScheduledTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateScheduledTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateScheduledTaskResponse response) {
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
        public Builder body(CreateScheduledTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateScheduledTaskResponse build() {
            return new CreateScheduledTaskResponse(this);
        } 

    } 

}
