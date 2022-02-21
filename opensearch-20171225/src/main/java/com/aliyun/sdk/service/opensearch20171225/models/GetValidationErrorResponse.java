// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.opensearch20171225.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetValidationErrorResponse} extends {@link TeaModel}
 *
 * <p>GetValidationErrorResponse</p>
 */
public class GetValidationErrorResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetValidationErrorResponseBody body;

    private GetValidationErrorResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetValidationErrorResponse create() {
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
    public GetValidationErrorResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetValidationErrorResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetValidationErrorResponseBody body);

        @Override
        GetValidationErrorResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetValidationErrorResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetValidationErrorResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetValidationErrorResponse response) {
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
        public Builder body(GetValidationErrorResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetValidationErrorResponse build() {
            return new GetValidationErrorResponse(this);
        } 

    } 

}
