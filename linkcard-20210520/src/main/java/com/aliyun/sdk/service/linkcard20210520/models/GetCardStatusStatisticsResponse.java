// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.linkcard20210520.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetCardStatusStatisticsResponse} extends {@link TeaModel}
 *
 * <p>GetCardStatusStatisticsResponse</p>
 */
public class GetCardStatusStatisticsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetCardStatusStatisticsResponseBody body;

    private GetCardStatusStatisticsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetCardStatusStatisticsResponse create() {
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
    public GetCardStatusStatisticsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetCardStatusStatisticsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetCardStatusStatisticsResponseBody body);

        @Override
        GetCardStatusStatisticsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetCardStatusStatisticsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetCardStatusStatisticsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetCardStatusStatisticsResponse response) {
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
        public Builder body(GetCardStatusStatisticsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetCardStatusStatisticsResponse build() {
            return new GetCardStatusStatisticsResponse(this);
        } 

    } 

}
