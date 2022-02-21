// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.fnf20190315.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetExecutionHistoryResponse} extends {@link TeaModel}
 *
 * <p>GetExecutionHistoryResponse</p>
 */
public class GetExecutionHistoryResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetExecutionHistoryResponseBody body;

    private GetExecutionHistoryResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetExecutionHistoryResponse create() {
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
    public GetExecutionHistoryResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetExecutionHistoryResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetExecutionHistoryResponseBody body);

        @Override
        GetExecutionHistoryResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetExecutionHistoryResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetExecutionHistoryResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetExecutionHistoryResponse response) {
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
        public Builder body(GetExecutionHistoryResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetExecutionHistoryResponse build() {
            return new GetExecutionHistoryResponse(this);
        } 

    } 

}
