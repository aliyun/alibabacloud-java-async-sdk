// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ecd20200930.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DoPhysicalDeleteResourceResponse} extends {@link TeaModel}
 *
 * <p>DoPhysicalDeleteResourceResponse</p>
 */
public class DoPhysicalDeleteResourceResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private DoPhysicalDeleteResourceResponseBody body;

    private DoPhysicalDeleteResourceResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static DoPhysicalDeleteResourceResponse create() {
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
    public DoPhysicalDeleteResourceResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<DoPhysicalDeleteResourceResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(DoPhysicalDeleteResourceResponseBody body);

        @Override
        DoPhysicalDeleteResourceResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DoPhysicalDeleteResourceResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private DoPhysicalDeleteResourceResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DoPhysicalDeleteResourceResponse response) {
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
        public Builder body(DoPhysicalDeleteResourceResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public DoPhysicalDeleteResourceResponse build() {
            return new DoPhysicalDeleteResourceResponse(this);
        } 

    } 

}
