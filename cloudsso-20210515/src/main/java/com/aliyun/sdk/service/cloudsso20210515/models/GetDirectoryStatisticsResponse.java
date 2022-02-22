// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sdk.service.cloudsso20210515.models;

import com.aliyun.core.annotation.*;
import darabonba.core.RequestModel;
import darabonba.core.TeaModel;
import com.aliyun.sdk.gateway.pop.models.*;

/**
 * {@link GetDirectoryStatisticsResponse} extends {@link TeaModel}
 *
 * <p>GetDirectoryStatisticsResponse</p>
 */
public class GetDirectoryStatisticsResponse extends Response {
    @NameInMap("headers")
    @Validation(required = true)
    private java.util.Map < String, String > headers;

    @NameInMap("body")
    @Validation(required = true)
    private GetDirectoryStatisticsResponseBody body;

    private GetDirectoryStatisticsResponse(BuilderImpl builder) {
        super(builder);
        this.headers = builder.headers;
        this.body = builder.body;
    }

    public static GetDirectoryStatisticsResponse create() {
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
    public GetDirectoryStatisticsResponseBody getBody() {
        return this.body;
    }

    public interface Builder extends Response.Builder<GetDirectoryStatisticsResponse, Builder> {

        Builder headers(java.util.Map < String, String > headers);

        Builder body(GetDirectoryStatisticsResponseBody body);

        @Override
        GetDirectoryStatisticsResponse build();

    } 

    private static final class BuilderImpl
            extends Response.BuilderImpl<GetDirectoryStatisticsResponse, Builder>
            implements Builder {
        private java.util.Map < String, String > headers; 
        private GetDirectoryStatisticsResponseBody body; 

        private BuilderImpl() {
            super();
        } 

        private BuilderImpl(GetDirectoryStatisticsResponse response) {
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
        public Builder body(GetDirectoryStatisticsResponseBody body) {
            this.body = body;
            return this;
        }

        @Override
        public GetDirectoryStatisticsResponse build() {
            return new GetDirectoryStatisticsResponse(this);
        } 

    } 

}
