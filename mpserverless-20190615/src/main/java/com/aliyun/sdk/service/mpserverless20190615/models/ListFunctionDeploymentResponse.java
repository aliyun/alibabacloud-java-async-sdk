// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.mpserverless20190615.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link ListFunctionDeploymentResponse} extends {@link TeaModel}
 *
 * <p>ListFunctionDeploymentResponse</p>
 */
public class ListFunctionDeploymentResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private ListFunctionDeploymentResponseBody body;

    private ListFunctionDeploymentResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static ListFunctionDeploymentResponse create() {
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
    public ListFunctionDeploymentResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<ListFunctionDeploymentResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(ListFunctionDeploymentResponseBody body);

        @Override
        ListFunctionDeploymentResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<ListFunctionDeploymentResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private ListFunctionDeploymentResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(ListFunctionDeploymentResponse response) {
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
        public Builder body(ListFunctionDeploymentResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public ListFunctionDeploymentResponse build() {
            return new ListFunctionDeploymentResponse(this);
        } 

    } 

}
