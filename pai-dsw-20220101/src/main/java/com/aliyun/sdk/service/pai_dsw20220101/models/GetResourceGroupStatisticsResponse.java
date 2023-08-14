// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.pai_dsw20220101.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetResourceGroupStatisticsResponse} extends {@link TeaModel}
 *
 * <p>GetResourceGroupStatisticsResponse</p>
 */
public class GetResourceGroupStatisticsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetResourceGroupStatisticsResponseBody body;

    private GetResourceGroupStatisticsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetResourceGroupStatisticsResponse create() {
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
    public GetResourceGroupStatisticsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetResourceGroupStatisticsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetResourceGroupStatisticsResponseBody body);

        @Override
        GetResourceGroupStatisticsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetResourceGroupStatisticsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetResourceGroupStatisticsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetResourceGroupStatisticsResponse response) {
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
        public Builder body(GetResourceGroupStatisticsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetResourceGroupStatisticsResponse build() {
            return new GetResourceGroupStatisticsResponse(this);
        } 

    } 

}
