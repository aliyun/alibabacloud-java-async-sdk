// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.sas20181203.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateAgentlessScanTaskResponse} extends {@link TeaModel}
 *
 * <p>CreateAgentlessScanTaskResponse</p>
 */
public class CreateAgentlessScanTaskResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateAgentlessScanTaskResponseBody body;

    private CreateAgentlessScanTaskResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateAgentlessScanTaskResponse create() {
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
    public CreateAgentlessScanTaskResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateAgentlessScanTaskResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateAgentlessScanTaskResponseBody body);

        @Override
        CreateAgentlessScanTaskResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateAgentlessScanTaskResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateAgentlessScanTaskResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateAgentlessScanTaskResponse response) {
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
        public Builder body(CreateAgentlessScanTaskResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateAgentlessScanTaskResponse build() {
            return new CreateAgentlessScanTaskResponse(this);
        } 

    } 

}
