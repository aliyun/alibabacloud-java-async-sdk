// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.emr20160408.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteFlowJobResponse} extends {@link TeaModel}
 *
 * <p>DeleteFlowJobResponse</p>
 */
public class DeleteFlowJobResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DeleteFlowJobResponseBody body;

    private DeleteFlowJobResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DeleteFlowJobResponse create() {
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
    public DeleteFlowJobResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DeleteFlowJobResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DeleteFlowJobResponseBody body);

        @Override
        DeleteFlowJobResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteFlowJobResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DeleteFlowJobResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteFlowJobResponse response) {
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
        public Builder body(DeleteFlowJobResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DeleteFlowJobResponse build() {
            return new DeleteFlowJobResponse(this);
        } 

    } 

}
