// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.live20161101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetMultiRateConfigListResponse} extends {@link TeaModel}
 *
 * <p>GetMultiRateConfigListResponse</p>
 */
public class GetMultiRateConfigListResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetMultiRateConfigListResponseBody body;

    private GetMultiRateConfigListResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetMultiRateConfigListResponse create() {
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
    public GetMultiRateConfigListResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetMultiRateConfigListResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetMultiRateConfigListResponseBody body);

        @Override
        GetMultiRateConfigListResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetMultiRateConfigListResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetMultiRateConfigListResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetMultiRateConfigListResponse response) {
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
        public Builder body(GetMultiRateConfigListResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetMultiRateConfigListResponse build() {
            return new GetMultiRateConfigListResponse(this);
        } 

    } 

}
