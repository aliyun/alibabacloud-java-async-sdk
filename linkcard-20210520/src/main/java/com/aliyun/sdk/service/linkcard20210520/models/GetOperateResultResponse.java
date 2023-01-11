// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkcard20210520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetOperateResultResponse} extends {@link TeaModel}
 *
 * <p>GetOperateResultResponse</p>
 */
public class GetOperateResultResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetOperateResultResponseBody body;

    private GetOperateResultResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetOperateResultResponse create() {
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
    public GetOperateResultResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetOperateResultResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetOperateResultResponseBody body);

        @Override
        GetOperateResultResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetOperateResultResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetOperateResultResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetOperateResultResponse response) {
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
        public Builder body(GetOperateResultResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetOperateResultResponse build() {
            return new GetOperateResultResponse(this);
        } 

    } 

}
