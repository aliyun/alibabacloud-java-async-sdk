// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.bssopenapi20171214.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link EnableBillGenerationResponse} extends {@link TeaModel}
 *
 * <p>EnableBillGenerationResponse</p>
 */
public class EnableBillGenerationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private EnableBillGenerationResponseBody body;

    private EnableBillGenerationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static EnableBillGenerationResponse create() {
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
    public EnableBillGenerationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<EnableBillGenerationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(EnableBillGenerationResponseBody body);

        @Override
        EnableBillGenerationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<EnableBillGenerationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private EnableBillGenerationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(EnableBillGenerationResponse response) {
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
        public Builder body(EnableBillGenerationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public EnableBillGenerationResponse build() {
            return new EnableBillGenerationResponse(this);
        } 

    } 

}
