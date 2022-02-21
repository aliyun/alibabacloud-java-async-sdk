// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cr20181201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateRepoTriggerResponse} extends {@link TeaModel}
 *
 * <p>CreateRepoTriggerResponse</p>
 */
public class CreateRepoTriggerResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateRepoTriggerResponseBody body;

    private CreateRepoTriggerResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateRepoTriggerResponse create() {
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
    public CreateRepoTriggerResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateRepoTriggerResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateRepoTriggerResponseBody body);

        @Override
        CreateRepoTriggerResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateRepoTriggerResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateRepoTriggerResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateRepoTriggerResponse response) {
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
        public Builder body(CreateRepoTriggerResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateRepoTriggerResponse build() {
            return new CreateRepoTriggerResponse(this);
        } 

    } 

}
