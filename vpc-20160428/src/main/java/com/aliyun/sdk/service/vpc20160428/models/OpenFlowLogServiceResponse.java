// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.vpc20160428.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link OpenFlowLogServiceResponse} extends {@link TeaModel}
 *
 * <p>OpenFlowLogServiceResponse</p>
 */
public class OpenFlowLogServiceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private OpenFlowLogServiceResponseBody body;

    private OpenFlowLogServiceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static OpenFlowLogServiceResponse create() {
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
    public OpenFlowLogServiceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<OpenFlowLogServiceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(OpenFlowLogServiceResponseBody body);

        @Override
        OpenFlowLogServiceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<OpenFlowLogServiceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private OpenFlowLogServiceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(OpenFlowLogServiceResponse response) {
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
        public Builder body(OpenFlowLogServiceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public OpenFlowLogServiceResponse build() {
            return new OpenFlowLogServiceResponse(this);
        } 

    } 

}
