// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link CreateFlowLogResponse} extends {@link TeaModel}
 *
 * <p>CreateFlowLogResponse</p>
 */
public class CreateFlowLogResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private CreateFlowLogResponseBody body;

    private CreateFlowLogResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static CreateFlowLogResponse create() {
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
    public CreateFlowLogResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<CreateFlowLogResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(CreateFlowLogResponseBody body);

        @Override
        CreateFlowLogResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<CreateFlowLogResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private CreateFlowLogResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(CreateFlowLogResponse response) {
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
        public Builder body(CreateFlowLogResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public CreateFlowLogResponse build() {
            return new CreateFlowLogResponse(this);
        } 

    } 

}
