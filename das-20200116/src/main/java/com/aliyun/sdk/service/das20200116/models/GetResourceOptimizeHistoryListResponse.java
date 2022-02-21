// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.das20200116.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetResourceOptimizeHistoryListResponse} extends {@link TeaModel}
 *
 * <p>GetResourceOptimizeHistoryListResponse</p>
 */
public class GetResourceOptimizeHistoryListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetResourceOptimizeHistoryListResponseBody body;

    private GetResourceOptimizeHistoryListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetResourceOptimizeHistoryListResponse create() {
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
    public GetResourceOptimizeHistoryListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetResourceOptimizeHistoryListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetResourceOptimizeHistoryListResponseBody body);

        @Override
        GetResourceOptimizeHistoryListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetResourceOptimizeHistoryListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetResourceOptimizeHistoryListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetResourceOptimizeHistoryListResponse response) {
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
        public Builder body(GetResourceOptimizeHistoryListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetResourceOptimizeHistoryListResponse build() {
            return new GetResourceOptimizeHistoryListResponse(this);
        } 

    } 

}
