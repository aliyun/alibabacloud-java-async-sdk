// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ros20190910.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetStackGroupOperationResponse} extends {@link TeaModel}
 *
 * <p>GetStackGroupOperationResponse</p>
 */
public class GetStackGroupOperationResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetStackGroupOperationResponseBody body;

    private GetStackGroupOperationResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetStackGroupOperationResponse create() {
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
    public GetStackGroupOperationResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetStackGroupOperationResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetStackGroupOperationResponseBody body);

        @Override
        GetStackGroupOperationResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetStackGroupOperationResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetStackGroupOperationResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetStackGroupOperationResponse response) {
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
        public Builder body(GetStackGroupOperationResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetStackGroupOperationResponse build() {
            return new GetStackGroupOperationResponse(this);
        } 

    } 

}
