// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fc_open20210406.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link DeleteFunctionAsyncInvokeConfigResponse} extends {@link TeaModel}
 *
 * <p>DeleteFunctionAsyncInvokeConfigResponse</p>
 */
public class DeleteFunctionAsyncInvokeConfigResponse extends Response {
    @NameInMap("headers")
    private java.util.Map < String, String > headers;

    @NameInMap("statusCode")
    private Integer statusCode;

    private DeleteFunctionAsyncInvokeConfigResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.statusCode = builder.statusCode;
    }

    public static DeleteFunctionAsyncInvokeConfigResponse create() {
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
     * @return statusCode
     */
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public interface Builder extends Response.Builder<DeleteFunctionAsyncInvokeConfigResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder statusCode(Integer statusCode);

        @Override
        DeleteFunctionAsyncInvokeConfigResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<DeleteFunctionAsyncInvokeConfigResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private Integer statusCode; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(DeleteFunctionAsyncInvokeConfigResponse response) {
            super(response);
            this.headers = response.headers;
            this.statusCode = response.statusCode;
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
         * statusCode.
         */
        @Override
        public Builder statusCode(Integer statusCode) {
            this.statusCode = statusCode;
            return this;
        }

        @Override
        public DeleteFunctionAsyncInvokeConfigResponse build() {
            return new DeleteFunctionAsyncInvokeConfigResponse(this);
        } 

    } 

}
