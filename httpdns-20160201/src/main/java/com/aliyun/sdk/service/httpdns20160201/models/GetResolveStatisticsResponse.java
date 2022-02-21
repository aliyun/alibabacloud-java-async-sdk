// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.httpdns20160201.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetResolveStatisticsResponse} extends {@link TeaModel}
 *
 * <p>GetResolveStatisticsResponse</p>
 */
public class GetResolveStatisticsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetResolveStatisticsResponseBody body;

    private GetResolveStatisticsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetResolveStatisticsResponse create() {
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
    public GetResolveStatisticsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetResolveStatisticsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetResolveStatisticsResponseBody body);

        @Override
        GetResolveStatisticsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetResolveStatisticsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetResolveStatisticsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetResolveStatisticsResponse response) {
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
        public Builder body(GetResolveStatisticsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetResolveStatisticsResponse build() {
            return new GetResolveStatisticsResponse(this);
        } 

    } 

}
