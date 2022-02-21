// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vcs20200515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateVideoSummaryTaskResponse} extends {@link TeaModel}
 *
 * <p>CreateVideoSummaryTaskResponse</p>
 */
public class CreateVideoSummaryTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateVideoSummaryTaskResponseBody body;

    private CreateVideoSummaryTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateVideoSummaryTaskResponse create() {
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
    public CreateVideoSummaryTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateVideoSummaryTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateVideoSummaryTaskResponseBody body);

        @Override
        CreateVideoSummaryTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateVideoSummaryTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateVideoSummaryTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateVideoSummaryTaskResponse response) {
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
        public Builder body(CreateVideoSummaryTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateVideoSummaryTaskResponse build() {
            return new CreateVideoSummaryTaskResponse(this);
        } 

    } 

}
