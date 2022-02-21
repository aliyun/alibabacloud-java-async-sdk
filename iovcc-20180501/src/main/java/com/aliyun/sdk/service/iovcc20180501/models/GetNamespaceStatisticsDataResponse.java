// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.iovcc20180501.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetNamespaceStatisticsDataResponse} extends {@link TeaModel}
 *
 * <p>GetNamespaceStatisticsDataResponse</p>
 */
public class GetNamespaceStatisticsDataResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetNamespaceStatisticsDataResponseBody body;

    private GetNamespaceStatisticsDataResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetNamespaceStatisticsDataResponse create() {
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
    public GetNamespaceStatisticsDataResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetNamespaceStatisticsDataResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetNamespaceStatisticsDataResponseBody body);

        @Override
        GetNamespaceStatisticsDataResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetNamespaceStatisticsDataResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetNamespaceStatisticsDataResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetNamespaceStatisticsDataResponse response) {
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
        public Builder body(GetNamespaceStatisticsDataResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetNamespaceStatisticsDataResponse build() {
            return new GetNamespaceStatisticsDataResponse(this);
        } 

    } 

}
