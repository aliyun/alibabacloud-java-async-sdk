// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iotcc20210513.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetConnectionPoolIpOperationResultResponse} extends {@link TeaModel}
 *
 * <p>GetConnectionPoolIpOperationResultResponse</p>
 */
public class GetConnectionPoolIpOperationResultResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetConnectionPoolIpOperationResultResponseBody body;

    private GetConnectionPoolIpOperationResultResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetConnectionPoolIpOperationResultResponse create() {
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
    public GetConnectionPoolIpOperationResultResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetConnectionPoolIpOperationResultResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetConnectionPoolIpOperationResultResponseBody body);

        @Override
        GetConnectionPoolIpOperationResultResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetConnectionPoolIpOperationResultResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetConnectionPoolIpOperationResultResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetConnectionPoolIpOperationResultResponse response) {
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
        public Builder body(GetConnectionPoolIpOperationResultResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetConnectionPoolIpOperationResultResponse build() {
            return new GetConnectionPoolIpOperationResultResponse(this);
        } 

    } 

}
