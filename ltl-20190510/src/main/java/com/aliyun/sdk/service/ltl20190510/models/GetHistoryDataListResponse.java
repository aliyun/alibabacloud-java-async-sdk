// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.ltl20190510.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetHistoryDataListResponse} extends {@link TeaModel}
 *
 * <p>GetHistoryDataListResponse</p>
 */
public class GetHistoryDataListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetHistoryDataListResponseBody body;

    private GetHistoryDataListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetHistoryDataListResponse create() {
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
    public GetHistoryDataListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetHistoryDataListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetHistoryDataListResponseBody body);

        @Override
        GetHistoryDataListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetHistoryDataListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetHistoryDataListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetHistoryDataListResponse response) {
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
        public Builder body(GetHistoryDataListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetHistoryDataListResponse build() {
            return new GetHistoryDataListResponse(this);
        } 

    } 

}
