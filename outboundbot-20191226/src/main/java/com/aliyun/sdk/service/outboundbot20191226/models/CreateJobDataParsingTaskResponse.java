// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.outboundbot20191226.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateJobDataParsingTaskResponse} extends {@link TeaModel}
 *
 * <p>CreateJobDataParsingTaskResponse</p>
 */
public class CreateJobDataParsingTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateJobDataParsingTaskResponseBody body;

    private CreateJobDataParsingTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateJobDataParsingTaskResponse create() {
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
    public CreateJobDataParsingTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateJobDataParsingTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateJobDataParsingTaskResponseBody body);

        @Override
        CreateJobDataParsingTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateJobDataParsingTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateJobDataParsingTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateJobDataParsingTaskResponse response) {
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
        public Builder body(CreateJobDataParsingTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateJobDataParsingTaskResponse build() {
            return new CreateJobDataParsingTaskResponse(this);
        } 

    } 

}
