// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.datalake20200710.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetTableColumnStatisticsResponse} extends {@link TeaModel}
 *
 * <p>GetTableColumnStatisticsResponse</p>
 */
public class GetTableColumnStatisticsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetTableColumnStatisticsResponseBody body;

    private GetTableColumnStatisticsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetTableColumnStatisticsResponse create() {
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
    public GetTableColumnStatisticsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetTableColumnStatisticsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetTableColumnStatisticsResponseBody body);

        @Override
        GetTableColumnStatisticsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetTableColumnStatisticsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetTableColumnStatisticsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetTableColumnStatisticsResponse response) {
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
        public Builder body(GetTableColumnStatisticsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetTableColumnStatisticsResponse build() {
            return new GetTableColumnStatisticsResponse(this);
        } 

    } 

}
