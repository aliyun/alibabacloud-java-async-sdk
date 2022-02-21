// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pcdn20170411.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetFeeHistoryResponse} extends {@link TeaModel}
 *
 * <p>GetFeeHistoryResponse</p>
 */
public class GetFeeHistoryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetFeeHistoryResponseBody body;

    private GetFeeHistoryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetFeeHistoryResponse create() {
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
    public GetFeeHistoryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetFeeHistoryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetFeeHistoryResponseBody body);

        @Override
        GetFeeHistoryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetFeeHistoryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetFeeHistoryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetFeeHistoryResponse response) {
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
        public Builder body(GetFeeHistoryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetFeeHistoryResponse build() {
            return new GetFeeHistoryResponse(this);
        } 

    } 

}
